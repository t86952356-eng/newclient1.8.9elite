/*
 * Decompiled with CFR 0.152.
 */
package de.brownie.utils;

import java.io.File;
import java.util.Locale;

public class OSUtil {
    public static Arch getArch() {
        String osArch = System.getProperty("os.arch").toLowerCase(Locale.ENGLISH);
        if (osArch.equals("x86_64") || osArch.equals("amd64")) {
            return Arch.X86_64;
        }
        if (osArch.equals("aarch64") || osArch.equals("arm64")) {
            return Arch.AARCH64;
        }
        return Arch.UNKNOWN;
    }

    public static OS getOS() {
        String osName = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
        if (osName.contains("mac") || osName.contains("darwin")) {
            return OS.MAC;
        }
        if (osName.contains("win")) {
            return OS.WINDOWS;
        }
        if (osName.contains("nux")) {
            return OS.LINUX;
        }
        return OS.UNKNOWN;
    }

    public static File getRiseDataDir() {
        String userHome = System.getProperty("user.home");
        OS os = OSUtil.getOS();
        switch (os) {
            case WINDOWS: {
                String appData = System.getenv("APPDATA");
                if (appData != null) {
                    return new File(appData, "Rise");
                }
                return new File(userHome, "Rise");
            }
            case MAC: {
                return new File(userHome, "Library/Application Support/Rise");
            }
            case LINUX: {
                return new File(userHome, ".rise");
            }
        }
        return new File(userHome, "Rise");
    }

    public static enum Arch {
        X86_64,
        AARCH64,
        UNKNOWN;

    }

    public static enum OS {
        WINDOWS,
        LINUX,
        MAC,
        UNKNOWN;

    }
}

