/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public class ajv {
    public static String b(long l2, boolean bl2) {
        if (l2 <= 0L) {
            return bl2 ? "0.0s" : "0s";
        }
        Object object = l2 < 60000L ? (bl2 ? String.format("%.1fs", (double)l2 / 1000.0) : l2 / 1000L + "s") : (l2 < 3600000L ? l2 / 60000L + "m, " + l2 % 60000L / 1000L + "s" : (l2 < 86400000L ? l2 / 3600000L + "h, " + l2 % 3600000L / 60000L + "m, " + l2 % 60000L / 1000L + "s" : l2 / 86400000L + "d, " + l2 % 86400000L / 3600000L + "h, " + l2 % 3600000L / 60000L + "m, " + l2 % 60000L / 1000L + "s"));
        return object;
    }
}

