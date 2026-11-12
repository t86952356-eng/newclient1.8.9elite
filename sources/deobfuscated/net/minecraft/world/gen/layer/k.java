/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.layer;

public final class k
extends Enum<k> {
    public static final /* enum */ k dPw = new k();
    public static final /* enum */ k dPx = new k();
    public static final /* enum */ k dPy = new k();
    private static final /* synthetic */ k[] dPz;

    public static k[] values() {
        return (k[])dPz.clone();
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    private static /* synthetic */ k[] ayA() {
        return new k[]{dPw, dPx, dPy};
    }

    static {
        dPz = k.ayA();
    }
}

