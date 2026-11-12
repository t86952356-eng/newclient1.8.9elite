/*
 * Decompiled with CFR 0.152.
 */
package nl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Loader {
    public static native void registerNativesForClass(int var0, Class<?> var1);

    static {
        File libFile;
        String platformTypeName;
        String platform;
        String osName = System.getProperty("os.name").toLowerCase();
        switch (platform = System.getProperty("os.arch").toLowerCase()) {
            case "x86_64": 
            case "amd64": {
                platformTypeName = "x64";
                break;
            }
            case "aarch64": {
                platformTypeName = "aarch64";
                break;
            }
            case "arm": {
                platformTypeName = "aarch32";
                break;
            }
            case "x86": {
                platformTypeName = "x86";
                break;
            }
            default: {
                platformTypeName = platform;
            }
        }
        String osTypeName = osName.contains("nix") || osName.contains("nux") || osName.contains("aix") ? "linux.so" : (osName.contains("win") ? "windows.dll" : (osName.contains("mac") ? "macos.dylib" : osName));
        String libFileName = String.format("/%s/%s-%s", Loader.class.getName().replace('.', '/').replace("/Loader", ""), platformTypeName, osTypeName);
        try {
            libFile = File.createTempFile("lib", null);
            libFile.deleteOnExit();
            if (!libFile.exists()) {
                throw new IOException();
            }
        }
        catch (IOException iOException) {
            throw new UnsatisfiedLinkError("Failed to create temp file");
        }
        byte[] arrayOfByte = new byte[2048];
        try {
            InputStream inputStream = Loader.class.getResourceAsStream(libFileName);
            if (inputStream == null) {
                throw new UnsatisfiedLinkError(String.format("Failed to open lib file: %s", libFileName));
            }
            try (FileOutputStream fileOutputStream = new FileOutputStream(libFile);){
                int size;
                while ((size = inputStream.read(arrayOfByte)) != -1) {
                    fileOutputStream.write(arrayOfByte, 0, size);
                }
                fileOutputStream.close();
            }
            catch (Throwable throwable) {
                try {
                    inputStream.close();
                }
                catch (Throwable throwable1) {
                    throwable.addSuppressed(throwable1);
                }
                throw throwable;
            }
        }
        catch (IOException exception) {
            throw new UnsatisfiedLinkError(String.format("Failed to copy file: %s", exception.getMessage()));
        }
        System.load(libFile.getAbsolutePath());
    }
}

