/*
 * Decompiled with CFR 0.152.
 */
package de.brownie;

import com.github.weisj.darklaf.LafManager;
import com.github.weisj.darklaf.theme.OneDarkTheme;
import de.brownie.gui.LogWindow;
import de.brownie.utils.FileUtil;
import de.brownie.utils.OSUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import javax.swing.SwingUtilities;
import org.apache.commons.io.FileUtils;

public class Main {
    private static final String UPDATE_SERVER_URL = "https://jdk.mdma.dev/rise/";
    private static final String MANIFEST_URL = "https://jdk.mdma.dev/rise/update-dev.php";
    private static final String PAYLOAD_BASE_URL = "https://api.vantage.rip/legacy/";
    private static final String PAYLOAD_MIGRATION_MARKER = ".payload-host-v1";
    private static String clientJar = "client.jar";
    private static String libJar = "libraries.jar";
    private static Map<String, String> manifest;
    private static Map<String, String> payloadManifest;

    public static void main(String[] stringArray) {
        File file = OSUtil.getRiseDataDir();
        File file2 = new File(file, "logs");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        Path path = file.toPath();
        try {
            if (Files.exists(path, new LinkOption[0]) && !Files.exists(path.resolve("init"), new LinkOption[0])) {
                Files.walk(path, new FileVisitOption[0]).sorted(Comparator.reverseOrder()).map(Path::toFile).forEach(File::delete);
                file2.mkdirs();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        LafManager.install(new OneDarkTheme());
        LogWindow logWindow = new LogWindow();
        logWindow.setVisible(true);
        PrintStream printStream = System.out;
        PrintStream printStream2 = System.err;
        try {
            String string = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
            File file3 = new File(file2, "launcher_" + string + ".log");
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            MultiOutputStream multiOutputStream = new MultiOutputStream(printStream, logWindow, fileOutputStream);
            System.setOut(new PrintStream(multiOutputStream));
            System.setErr(new PrintStream(multiOutputStream));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        System.out.println("RiseLauncher initialized.");
        System.out.println("Click 'Launch Rise' to start.");
        logWindow.addLaunchListener(actionEvent -> {
            logWindow.setLaunchEnabled(false);
            new Thread(() -> Main.runGame(logWindow)).start();
        });
    }

    private static void runGame(LogWindow logWindow) {
        try {
            File file;
            logWindow.setStatus("Fetching update manifest...");
            manifest = FileUtil.fetchManifest(MANIFEST_URL);
            payloadManifest = FileUtil.fetchManifest("https://api.vantage.rip/legacy/manifest.json");
            if (payloadManifest == null) {
                throw new IOException("Could not read the payload update manifest.");
            }
            File file2 = OSUtil.getRiseDataDir();
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (!(file = new File(file2, "init")).exists()) {
                Files.createFile(file.toPath(), new FileAttribute[0]);
            }
            System.out.println("Rise data directory: " + file2.getAbsolutePath());
            File file3 = new File(file2, "jdk");
            Main.setupJdk(file3, logWindow);
            File file4 = new File(file2, PAYLOAD_MIGRATION_MARKER);
            if (!file4.exists()) {
                logWindow.setStatus("Clearing old payload files...");
                Files.deleteIfExists(new File(file2, clientJar).toPath());
                Files.deleteIfExists(new File(file2, libJar).toPath());
                Files.deleteIfExists(new File(file2, "Standalone.jar").toPath());
                Files.deleteIfExists(new File(file2, "Libraries.jar").toPath());
            }
            Main.updatePayloadFile(new File(file2, libJar), libJar, logWindow);
            Main.updatePayloadFile(new File(file2, clientJar), clientJar, logWindow);
            Files.write(file4.toPath(), "1".getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
            if (OSUtil.getOS() == OSUtil.OS.LINUX) {
                Main.updateServerFile(new File(file2, "netty-linux.jar"), "netty-linux.jar", logWindow);
            }
            if (OSUtil.getOS() == OSUtil.OS.MAC && OSUtil.getArch() == OSUtil.Arch.X86_64) {
                Main.updateServerFile(new File(file2, "lwjgl-2.9.4-macosx-x86_64.jar"), "lwjgl-2.9.4-macosx-x86_64.jar", logWindow);
            }
            String string = OSUtil.getOS() == OSUtil.OS.WINDOWS ? "dependants/windows/1.8.9-natives" : (OSUtil.getOS() == OSUtil.OS.MAC ? "dependants/macosx/1.8.9-natives" : "dependants/linux/1.8.9-natives");
            File file5 = new File(file2, string);
            Main.setupNatives(file5, logWindow);
            logWindow.setStatus("Launching...");
            logWindow.setProgress(100);
            if (OSUtil.getOS() == OSUtil.OS.LINUX) {
                try {
                    File file6 = new File(System.getProperty("user.home"), ".minecraft");
                    File file7 = new File(file6, "options.txt");
                    if (file7.exists()) {
                        List<String> list = Files.readAllLines(file7.toPath(), StandardCharsets.UTF_8);
                        boolean bl = false;
                        boolean bl2 = false;
                        for (int i = 0; i < list.size(); ++i) {
                            if (!list.get(i).startsWith("useNativeTransport:")) continue;
                            list.set(i, "useNativeTransport:false");
                            bl = true;
                            bl2 = true;
                            break;
                        }
                        if (!bl2) {
                            list.add("useNativeTransport:false");
                            bl = true;
                        }
                        if (bl) {
                            Files.write(file7.toPath(), list, StandardCharsets.UTF_8, new OpenOption[0]);
                            System.out.println("Patched options.txt: set useNativeTransport to false for Linux.");
                        }
                    } else {
                        if (!file6.exists()) {
                            file6.mkdirs();
                        }
                        Files.write(file7.toPath(), Collections.singletonList("useNativeTransport:false"), StandardCharsets.UTF_8, new OpenOption[0]);
                        System.out.println("Created options.txt and set useNativeTransport to false for Linux.");
                    }
                }
                catch (Exception exception) {
                    System.out.println("Failed to patch options.txt: " + exception.getMessage());
                }
            }
            Main.launch(file3, new File(file2, libJar), new File(file2, clientJar), file5, logWindow);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Failed to start launcher.");
            logWindow.setStatus("Error: " + exception.getMessage());
            SwingUtilities.invokeLater(() -> {
                logWindow.setLaunchEnabled(true);
                logWindow.getLaunchButton().setText("Launch Rise");
            });
        }
    }

    private static void setupJdk(File file, LogWindow logWindow) throws IOException {
        String string;
        String string2;
        String string3;
        OSUtil.OS oS = OSUtil.getOS();
        OSUtil.Arch arch = OSUtil.getArch();
        if (oS == OSUtil.OS.WINDOWS) {
            string3 = "windows";
        } else if (oS == OSUtil.OS.LINUX) {
            string3 = "linux";
        } else if (oS == OSUtil.OS.MAC) {
            string3 = "macosx";
        } else {
            throw new RuntimeException("Unsupported OS: " + (Object)((Object)oS));
        }
        if (arch == OSUtil.Arch.X86_64) {
            string2 = "x86_64";
        } else if (arch == OSUtil.Arch.AARCH64) {
            string2 = "aarch64";
        } else if (oS == OSUtil.OS.WINDOWS) {
            string2 = "x86_64";
        } else {
            throw new RuntimeException("Unsupported Architecture: " + (Object)((Object)arch));
        }
        String string4 = string3 + "-" + string2 + "-server-release-dev.zip";
        String string5 = manifest.get(string4);
        File file2 = new File(file.getParentFile(), ".jdk_hash");
        boolean bl = false;
        if (!file.exists() || file.list() == null || file.list().length == 0) {
            bl = true;
        } else if (string5 != null) {
            if (file2.exists()) {
                string = new String(Files.readAllBytes(file2.toPath()), StandardCharsets.UTF_8).trim();
                if (!string.equalsIgnoreCase(string5)) {
                    bl = true;
                }
            } else {
                bl = true;
            }
        }
        if (!bl) {
            System.out.println("JDK appears to be installed and up to date.");
            return;
        }
        file.delete();
        System.out.println("JDK update required. Downloading...");
        logWindow.setStatus("Downloading JDK...");
        logWindow.setProgress(0);
        string = UPDATE_SERVER_URL + string4;
        File file3 = new File(file.getParentFile(), "jdk.zip");
        FileUtil.downloadFile(string, file3, logWindow::setProgress);
        logWindow.setStatus("Unzipping JDK...");
        if (file.exists()) {
            FileUtils.deleteDirectory(file);
        }
        FileUtil.unzip(file3, file, logWindow::setProgress);
        if (string5 != null) {
            Files.write(file2.toPath(), string5.getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
        }
        if (!file3.delete()) {
            System.out.println("Warning: Failed to delete " + file3.getName());
        }
    }

    private static void updateServerFile(File file, String string, LogWindow logWindow) throws IOException {
        System.out.println("Checking " + file.getName() + "...");
        logWindow.setStatus("Checking " + file.getName() + "...");
        String string2 = manifest.get(string);
        if (string2 == null) {
            System.out.println("Warning: Could not find hash for " + string + " in manifest. Skipping hash check.");
            if (!file.exists()) {
                logWindow.setStatus("Downloading " + file.getName() + "...");
                logWindow.setProgress(0);
                FileUtil.downloadFile(UPDATE_SERVER_URL + string, file, logWindow::setProgress);
            }
            return;
        }
        String string3 = FileUtil.getFileSha256(file);
        if (!file.exists() || !string3.equalsIgnoreCase(string2)) {
            System.out.println("Update required for " + file.getName());
            if (file.exists()) {
                System.out.println("Local hash: " + string3);
                System.out.println("Remote hash: " + string2);
            }
            logWindow.setStatus("Downloading " + file.getName() + "...");
            logWindow.setProgress(0);
            FileUtil.downloadFile(UPDATE_SERVER_URL + string, file, logWindow::setProgress);
        } else {
            System.out.println(file.getName() + " is up to date.");
            logWindow.setProgress(100);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void updatePayloadFile(File file, String string, LogWindow logWindow) throws IOException {
        System.out.println("Checking " + file.getName() + "...");
        logWindow.setStatus("Checking " + file.getName() + "...");
        String string2 = payloadManifest.get(string);
        if (string2 == null || !string2.matches("[a-fA-F0-9]{64}")) {
            throw new IOException("Missing or invalid update hash for " + string);
        }
        if (file.isFile() && string2.equalsIgnoreCase(FileUtil.getFileSha256(file))) {
            System.out.println(file.getName() + " is up to date.");
            logWindow.setProgress(100);
            return;
        }
        logWindow.setStatus("Downloading " + file.getName() + "...");
        logWindow.setProgress(0);
        File file2 = new File(file.getParentFile(), string + ".download");
        try {
            FileUtil.downloadFile(PAYLOAD_BASE_URL + string + "?sha256=" + string2, file2, logWindow::setProgress);
            if (!string2.equalsIgnoreCase(FileUtil.getFileSha256(file2))) {
                throw new IOException("Downloaded file failed verification: " + string);
            }
            Files.move(file2.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
        finally {
            Files.deleteIfExists(file2.toPath());
        }
    }

    private static void setupNatives(File file, LogWindow logWindow) throws IOException {
        Object object;
        String string = null;
        OSUtil.OS oS = OSUtil.getOS();
        OSUtil.Arch arch = OSUtil.getArch();
        if (oS == OSUtil.OS.WINDOWS) {
            string = "1.8.9-natives-windows.zip";
        } else if (oS == OSUtil.OS.MAC) {
            string = arch == OSUtil.Arch.AARCH64 ? "1.8.9-natives-macosx-aarch64.zip" : "1.8.9-natives-macosx-x86_64.zip";
        } else if (oS == OSUtil.OS.LINUX) {
            string = "1.8.9-natives-linux.zip";
        }
        if (string == null) {
            System.out.println("Skipping natives download: No natives configured for this OS.");
            return;
        }
        String string2 = manifest.get(string);
        File file2 = new File(file.getParentFile(), ".natives_hash");
        boolean bl = false;
        if (!file.exists() || file.list() == null || file.list().length == 0) {
            bl = true;
        } else if (string2 != null) {
            if (file2.exists()) {
                object = new String(Files.readAllBytes(file2.toPath()), StandardCharsets.UTF_8).trim();
                if (!((String)object).equalsIgnoreCase(string2)) {
                    bl = true;
                }
            } else {
                bl = true;
            }
        }
        if (!bl) {
            System.out.println("Natives appear to be installed and up to date.");
            return;
        }
        System.out.println("Natives update required. Downloading...");
        logWindow.setStatus("Downloading Natives...");
        logWindow.setProgress(0);
        object = new File(file.getParentFile(), "natives.zip");
        if (!((File)object).getParentFile().exists()) {
            ((File)object).getParentFile().mkdirs();
        }
        FileUtil.downloadFile(UPDATE_SERVER_URL + string, (File)object, logWindow::setProgress);
        logWindow.setStatus("Unzipping Natives...");
        if (file.exists()) {
            FileUtils.deleteDirectory(file);
        }
        FileUtil.unzip((File)object, file.getParentFile(), logWindow::setProgress);
        if (string2 != null) {
            Files.write(file2.toPath(), string2.getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
        }
        if (!((File)object).delete()) {
            System.out.println("Warning: Failed to delete " + ((File)object).getName());
        }
    }

    private static void launch(File file, File file2, File file3, File file4, LogWindow logWindow) throws IOException {
        Process process;
        Object object;
        File file5;
        System.out.println("Launching client...");
        File file6 = file3.getParentFile();
        File file7 = new File(file6, "logs");
        if (!file7.exists()) {
            file7.mkdirs();
        }
        if (OSUtil.getOS() == OSUtil.OS.LINUX && System.getenv("DISPLAY") == null) {
            System.out.println("Warning: DISPLAY environment variable is not set. This will likely cause LWJGL to fail.");
        }
        if ((file5 = Main.findJavaExecutable(file)) == null) {
            throw new RuntimeException("Could not find java executable in " + file.getAbsolutePath());
        }
        file5.setExecutable(true);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(file5.getAbsolutePath());
        OSUtil.OS oS = OSUtil.getOS();
        if (oS == OSUtil.OS.WINDOWS || oS == OSUtil.OS.MAC || oS == OSUtil.OS.LINUX) {
            arrayList.add("-Djava.library.path=" + file4.getAbsolutePath());
        }
        arrayList.add("-cp");
        String string = File.pathSeparator;
        File file8 = new File(file6, "lwjgl.jar");
        File file9 = new File(file6, "lwjgl_util.jar");
        System.out.println("Checking classpath files:");
        System.out.println("  lwjgl.jar: " + (file8.exists() ? "EXISTS" : "MISSING"));
        System.out.println("  lwjgl_util.jar: " + (file9.exists() ? "EXISTS" : "MISSING"));
        System.out.println("  Standalone.jar: " + (file3.exists() ? "EXISTS" : "MISSING"));
        System.out.println("  Libraries.jar: " + (file2.exists() ? "EXISTS" : "MISSING"));
        String string2 = file8.getAbsolutePath() + string + file9.getAbsolutePath() + string + file3.getAbsolutePath() + string + file2.getAbsolutePath();
        if (oS == OSUtil.OS.LINUX) {
            object = new File(file6, "netty-linux.jar");
            System.out.println("  netty-linux.jar: " + (((File)object).exists() ? "EXISTS" : "MISSING"));
            string2 = string2 + string + ((File)object).getAbsolutePath();
            try {
                process = new ProcessBuilder("xrandr", "--version").start();
                if (process.waitFor() != 0) {
                    System.out.println("WARNING: 'xrandr' command failed.");
                }
            }
            catch (Exception exception) {
                System.out.println("WARNING: 'xrandr' command not found.");
            }
        }
        if (oS == OSUtil.OS.MAC && OSUtil.getArch() == OSUtil.Arch.X86_64) {
            string2 = string2 + string + new File(file6, "lwjgl-2.9.4-macosx-x86_64.jar").getAbsolutePath();
        }
        arrayList.add(string2);
        arrayList.add("Start");
        System.out.println("Launch command: " + String.join((CharSequence)" ", arrayList));
        object = new ProcessBuilder(arrayList);
        ((ProcessBuilder)object).directory(file6);
        process = ((ProcessBuilder)object).start();
        SwingUtilities.invokeLater(() -> {
            logWindow.getLaunchButton().setText("Running");
            logWindow.setLaunchEnabled(false);
            logWindow.setStatus("Rise is running...");
        });
        String string3 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
        File file10 = new File(file7, "rise_" + string3 + ".log");
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(file10));
        StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(), System.out, printWriter);
        StreamGobbler streamGobbler2 = new StreamGobbler(process.getErrorStream(), System.err, printWriter);
        new Thread(streamGobbler).start();
        new Thread(streamGobbler2).start();
        new Thread(() -> {
            try {
                process.waitFor();
                printWriter.println("--- Client Process Exited ---");
                printWriter.close();
                SwingUtilities.invokeLater(() -> {
                    logWindow.getLaunchButton().setText("Launch Rise");
                    logWindow.setLaunchEnabled(true);
                    logWindow.setStatus("Ready to launch.");
                    logWindow.setProgress(0);
                });
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }

    private static File findJavaExecutable(File file) {
        File file2;
        File[] fileArray;
        File file3 = new File(file, "bin");
        if (!file3.exists() && (fileArray = file.listFiles()) != null) {
            for (File file4 : fileArray) {
                if (!file4.isDirectory() || !new File(file4, "bin").exists()) continue;
                file3 = new File(file4, "bin");
                break;
            }
        }
        if (file3.exists() && (file2 = new File(file3, OSUtil.getOS() == OSUtil.OS.WINDOWS ? "java.exe" : "java")).exists()) {
            return file2;
        }
        return null;
    }

    private static class MultiOutputStream
    extends OutputStream {
        private final PrintStream original;
        private final LogWindow logWindow;
        private final OutputStream fileStream;

        public MultiOutputStream(PrintStream printStream, LogWindow logWindow, OutputStream outputStream) {
            this.original = printStream;
            this.logWindow = logWindow;
            this.fileStream = outputStream;
        }

        @Override
        public void write(int n) throws IOException {
            this.original.write(n);
            this.logWindow.append(String.valueOf((char)n));
            this.fileStream.write(n);
            this.fileStream.flush();
        }

        @Override
        public void write(byte[] byArray, int n, int n2) throws IOException {
            this.original.write(byArray, n, n2);
            this.logWindow.append(new String(byArray, n, n2));
            this.fileStream.write(byArray, n, n2);
            this.fileStream.flush();
        }
    }

    private static class StreamGobbler
    implements Runnable {
        private final InputStream inputStream;
        private final PrintStream printStream;
        private final PrintWriter fileWriter;

        public StreamGobbler(InputStream inputStream, PrintStream printStream, PrintWriter printWriter) {
            this.inputStream = inputStream;
            this.printStream = printStream;
            this.fileWriter = printWriter;
        }

        @Override
        public void run() {
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.inputStream));){
                String string;
                while ((string = bufferedReader.readLine()) != null) {
                    this.printStream.println(string);
                    this.fileWriter.println(string);
                    this.fileWriter.flush();
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }
}

