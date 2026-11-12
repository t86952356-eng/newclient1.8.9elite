/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import net.minecraft.util.cm;

public final class MusicTicker$MusicType
extends Enum<MusicTicker$MusicType> {
    public static final /* enum */ MusicTicker$MusicType bip = new MusicTicker$MusicType(new cm("minecraft:music.menu"), 20, 600);
    public static final /* enum */ MusicTicker$MusicType biq = new MusicTicker$MusicType(new cm("minecraft:music.game"), 12000, 24000);
    public static final /* enum */ MusicTicker$MusicType bir = new MusicTicker$MusicType(new cm("minecraft:music.game.creative"), 1200, 3600);
    public static final /* enum */ MusicTicker$MusicType bis = new MusicTicker$MusicType(new cm("minecraft:music.game.end.credits"), Integer.MAX_VALUE, Integer.MAX_VALUE);
    public static final /* enum */ MusicTicker$MusicType bit = new MusicTicker$MusicType(new cm("minecraft:music.game.nether"), 1200, 3600);
    public static final /* enum */ MusicTicker$MusicType biu = new MusicTicker$MusicType(new cm("minecraft:music.game.end.dragon"), 0, 0);
    public static final /* enum */ MusicTicker$MusicType biv = new MusicTicker$MusicType(new cm("minecraft:music.game.end"), 6000, 24000);
    private final cm biw;
    private final int bix;
    private final int biy;
    private static final /* synthetic */ MusicTicker$MusicType[] biz;

    public static MusicTicker$MusicType[] values() {
        return (MusicTicker$MusicType[])biz.clone();
    }

    public static MusicTicker$MusicType valueOf(String string) {
        return Enum.valueOf(MusicTicker$MusicType.class, string);
    }

    private MusicTicker$MusicType(cm cm2, int n3, int n4) {
        this.biw = cm2;
        this.bix = n3;
        this.biy = n4;
    }

    public cm Cp() {
        return this.biw;
    }

    public int Cq() {
        return this.bix;
    }

    public int Cr() {
        return this.biy;
    }

    private static /* synthetic */ MusicTicker$MusicType[] Cs() {
        return new MusicTicker$MusicType[]{bip, biq, bir, bis, bit, biu, biv};
    }

    static {
        biz = MusicTicker$MusicType.Cs();
    }
}

