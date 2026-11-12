/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public final class afv
extends Enum<afv> {
    public static final /* enum */ afv aIk = new afv();
    public static final /* enum */ afv aIl = new afv();
    public static final /* enum */ afv aIm = new afv();
    public static final /* enum */ afv aIn = new afv();
    private static final /* synthetic */ afv[] aIo;

    public static afv[] values() {
        return (afv[])aIo.clone();
    }

    public static afv valueOf(String string) {
        return Enum.valueOf(afv.class, string);
    }

    private static /* synthetic */ afv[] tx() {
        return new afv[]{aIk, aIl, aIm, aIn};
    }

    static {
        aIo = afv.tx();
    }
}

