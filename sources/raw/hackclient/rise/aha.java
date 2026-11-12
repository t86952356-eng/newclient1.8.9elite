/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public final class aha {
    private static volatile boolean aKL = false;
    private static volatile boolean enabled = false;
    private static volatile int aKM = 0;

    private aha() {
    }

    public static boolean isEnabled() {
        return aKL && enabled;
    }

    public static int uP() {
        return aKM;
    }

    public static void K(boolean bl2) {
        aKL = bl2;
        if (!bl2) {
            enabled = false;
            ++aKM;
        }
    }

    public static void setEnabled(boolean bl2) {
        if (!aKL) {
            enabled = false;
            ++aKM;
            return;
        }
        if (enabled != bl2) {
            enabled = bl2;
            ++aKM;
        }
    }

    public static boolean uQ() {
        if (!aKL) {
            aha.setEnabled(false);
            return false;
        }
        aha.setEnabled(!enabled);
        return aha.isEnabled();
    }
}

