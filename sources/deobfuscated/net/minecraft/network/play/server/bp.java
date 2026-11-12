/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

public final class bp
extends Enum<bp> {
    public static final /* enum */ bp deP = new bp();
    public static final /* enum */ bp deQ = new bp();
    private static final /* synthetic */ bp[] deR;

    public static bp[] values() {
        return (bp[])deR.clone();
    }

    public static bp valueOf(String string) {
        return Enum.valueOf(bp.class, string);
    }

    private static /* synthetic */ bp[] ahV() {
        return new bp[]{deP, deQ};
    }

    static {
        deR = bp.ahV();
    }
}

