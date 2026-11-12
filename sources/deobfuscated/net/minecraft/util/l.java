/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

public class l {
    public static final char[] duj = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};

    public static boolean o(char c2) {
        return c2 != '\u00a7' && c2 >= ' ' && c2 != '\u007f';
    }

    public static String fZ(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c2 : string.toCharArray()) {
            if (!l.o(c2)) continue;
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
}

