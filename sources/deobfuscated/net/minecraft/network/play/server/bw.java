/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

public final class bw
extends Enum<bw> {
    public static final /* enum */ bw dfj = new bw();
    public static final /* enum */ bw dfk = new bw();
    public static final /* enum */ bw dfl = new bw();
    private static final /* synthetic */ bw[] dfm;

    public static bw[] values() {
        return (bw[])dfm.clone();
    }

    public static bw valueOf(String string) {
        return Enum.valueOf(bw.class, string);
    }

    private static /* synthetic */ bw[] ain() {
        return new bw[]{dfj, dfk, dfl};
    }

    static {
        dfm = bw.ain();
    }
}

