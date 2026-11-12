/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.security;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

public class NativeDecryptor {
    private static boolean loaded = false;
    private static String axL = null;

    public static synchronized void oA() {
        if (loaded) {
            return;
        }
        String string = System.getProperty("os.name", "").toLowerCase();
        String string2 = string.contains("win") ? "rise_native.dll" : (string.contains("mac") || string.contains("darwin") ? "librise_native.dylib" : "librise_native.so");
        try {
            InputStream inputStream = NativeDecryptor.class.getResourceAsStream("/native/" + string2);
            if (inputStream == null) {
                axL = "Native library not found in resources: /native/" + string2;
                System.err.println("[NativeDecryptor] " + axL);
                return;
            }
            File file = Files.createTempDirectory("rise_native_", new FileAttribute[0]).toFile();
            file.deleteOnExit();
            if (string2.endsWith(".dll")) {
                NativeDecryptor.a("/native/libcrypto-3-x64.dll", new File(file, "libcrypto-3-x64.dll"));
                NativeDecryptor.a("/native/libssl-3-x64.dll", new File(file, "libssl-3-x64.dll"));
            }
            File file2 = new File(file, string2);
            file2.deleteOnExit();
            try (FileOutputStream fileOutputStream = new FileOutputStream(file2);){
                int n2;
                byte[] byArray = new byte[8192];
                while ((n2 = inputStream.read(byArray)) != -1) {
                    ((OutputStream)fileOutputStream).write(byArray, 0, n2);
                }
            }
            inputStream.close();
            System.setProperty("java.library.path", file.getAbsolutePath() + File.pathSeparator + System.getProperty("java.library.path", ""));
            System.load(file2.getAbsolutePath());
            loaded = true;
        }
        catch (Throwable throwable) {
            axL = throwable.getMessage();
            System.err.println("[NativeDecryptor] Failed to load native library: " + throwable.getMessage());
        }
    }

    public static boolean isLoaded() {
        return loaded;
    }

    public static String oB() {
        return axL;
    }

    private static void a(String string, File file) {
        try {
            InputStream inputStream = NativeDecryptor.class.getResourceAsStream(string);
            if (inputStream == null) {
                return;
            }
            file.deleteOnExit();
            try (FileOutputStream fileOutputStream = new FileOutputStream(file);){
                int n2;
                byte[] byArray = new byte[8192];
                while ((n2 = inputStream.read(byArray)) != -1) {
                    ((OutputStream)fileOutputStream).write(byArray, 0, n2);
                }
            }
            inputStream.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static native byte[] nativeDecryptAndDefine(byte[] var0, byte[] var1, String var2, ClassLoader var3);
}

