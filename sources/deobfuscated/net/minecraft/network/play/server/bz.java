/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

public final class bz
extends Enum<bz> {
    public static final /* enum */ bz dfv = new bz();
    public static final /* enum */ bz dfw = new bz();
    public static final /* enum */ bz dfx = new bz();
    public static final /* enum */ bz dfy = new bz();
    public static final /* enum */ bz dfz = new bz();
    public static final /* enum */ bz dfA = new bz();
    private static final /* synthetic */ bz[] dfB;

    public static bz[] values() {
        return (bz[])dfB.clone();
    }

    public static bz valueOf(String string) {
        return Enum.valueOf(bz.class, string);
    }

    private static /* synthetic */ bz[] aio() {
        return new bz[]{dfv, dfw, dfx, dfy, dfz, dfA};
    }

    static {
        dfB = bz.aio();
    }
}

