import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.zip.ZipFile;

public final class ExtractArchive {
    public static void main(String[] args) throws Exception {
        byte[] archive;
        try (ZipFile zip = new ZipFile(args[0]);
             java.io.InputStream stream = zip.getInputStream(zip.getEntry("rise.vm"))) {
            java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
            byte[] buffer = new byte[8192];
            int size;
            while ((size = stream.read(buffer)) >= 0) output.write(buffer, 0, size);
            archive = output.toByteArray();
        }
        ByteBuffer index = ByteBuffer.wrap(archive).order(ByteOrder.LITTLE_ENDIAN);
        int count = index.getInt(8);
        index.position(index.getInt(12));
        Path root = Paths.get(args[1]).toAbsolutePath().normalize();
        int failed = 0;
        for (int i = 0; i < count; i++) {
            int nameLength = index.getShort() & 65535;
            byte[] nameBytes = new byte[nameLength];
            index.get(nameBytes);
            String name = new String(nameBytes, StandardCharsets.UTF_8);
            int offset = index.getInt();
            int length = index.getInt();
            byte[] bytes = null;
            int[] seeds = {i, 0, offset, offset - 16};
            for (int seed : seeds) {
                byte[] candidate = Arrays.copyOfRange(archive, offset, offset + length);
                NativeBridge.decrypt(candidate, seed);
                if (candidate.length >= 8 && candidate[0] == (byte)0xb0
                        && candidate[1] == 0x0b && candidate[2] == 0x1e && candidate[3] == 0x55) {
                    bytes = candidate;
                    break;
                }
            }
            if (bytes == null) {
                System.out.println("Failed: " + i + " " + name);
                failed++;
                if (failed >= 10) break;
                continue;
            }
            bytes[0] = (byte)0xca;
            bytes[1] = (byte)0xfe;
            bytes[2] = (byte)0xba;
            bytes[3] = (byte)0xbe;
            bytes[4] = bytes[5] = 0;
            Path path = root.resolve(name + ".class").normalize();
            if (!path.startsWith(root)) throw new IllegalArgumentException("Invalid class path");
            Files.createDirectories(path.getParent());
            Files.write(path, bytes);
            if (i % 500 == 0) System.out.println("Extracted " + (i + 1) + "/" + count + ": " + name);
        }
        System.out.println("Archive classes: " + count + ", failures: " + failed);
        if (failed != 0) throw new IllegalStateException("Incomplete extraction");
    }
}
