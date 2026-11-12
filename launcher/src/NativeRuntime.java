import java.nio.file.*;
import java.io.File;

public final class NativeRuntime {
    public static void prepare() {
        if(!System.getProperty("os.name","").toLowerCase().contains("win"))return;
        String folder=System.getProperty("rise.native.directory",System.getProperty("java.library.path").split(java.util.regex.Pattern.quote(File.pathSeparator))[0]);
        Path natives=Paths.get(folder).toAbsolutePath();
        for(String library:new String[]{"libcrypto-3-x64.dll","libssl-3-x64.dll","OpenAL64.dll"}) {
            Path path=natives.resolve(library);
            if(!Files.isRegularFile(path))throw new UnsatisfiedLinkError("Missing bundled native library: "+path);
            System.load(path.toString());
        }
        System.out.println("[Native] Bundled OpenSSL and OpenAL loaded.");
    }
}
