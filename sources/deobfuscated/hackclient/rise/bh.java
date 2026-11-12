/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public final class bh
extends Enum<bh> {
    public static final /* enum */ bh ds = new bh();
    public static final /* enum */ bh dt = new bh();
    public static final /* enum */ bh du = new bh();
    public static final /* enum */ bh dv = new bh();
    private static final /* synthetic */ bh[] dw;

    public static bh[] values() {
        return (bh[])dw.clone();
    }

    public static bh valueOf(String string) {
        return Enum.valueOf(bh.class, string);
    }

    private static /* synthetic */ bh[] bb() {
        return new bh[]{ds, dt, du, dv};
    }

    static {
        dw = bh.bb();
    }
}

