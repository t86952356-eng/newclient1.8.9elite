/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public final class ago
extends Enum<ago> {
    public static final /* enum */ ago aJS = new ago();
    public static final /* enum */ ago aJT = new ago();
    private static final /* synthetic */ ago[] aJU;

    public static ago[] values() {
        return (ago[])aJU.clone();
    }

    public static ago valueOf(String string) {
        return Enum.valueOf(ago.class, string);
    }

    private static /* synthetic */ ago[] tZ() {
        return new ago[]{aJS, aJT};
    }

    static {
        aJU = ago.tZ();
    }
}

