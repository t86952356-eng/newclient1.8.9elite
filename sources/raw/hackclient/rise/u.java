/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public final class u
extends Enum<u> {
    public static final /* enum */ u br = new u();
    public static final /* enum */ u bs = new u();
    public static final /* enum */ u bt = new u();
    private static final /* synthetic */ u[] bu;

    public static u[] values() {
        return (u[])bu.clone();
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    private static /* synthetic */ u[] aR() {
        return new u[]{br, bs, bt};
    }

    static {
        bu = u.aR();
    }
}

