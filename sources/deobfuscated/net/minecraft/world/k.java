/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

public final class k
extends Enum<k> {
    public static final /* enum */ k dCu = new k();
    public static final /* enum */ k dCv = new k();
    public static final /* enum */ k dCw = new k();
    private static final /* synthetic */ k[] dCx;

    public static k[] values() {
        return (k[])dCx.clone();
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    private static /* synthetic */ k[] avm() {
        return new k[]{dCu, dCv, dCw};
    }

    static {
        dCx = k.avm();
    }
}

