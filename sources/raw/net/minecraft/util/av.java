/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

public final class av
extends Enum<av> {
    public static final /* enum */ av dxV = new av("Solid");
    public static final /* enum */ av dxW = new av("Mipped Cutout");
    public static final /* enum */ av dxX = new av("Cutout");
    public static final /* enum */ av dxY = new av("Translucent");
    private final String dxZ;
    private static final /* synthetic */ av[] dya;

    public static av[] values() {
        return (av[])dya.clone();
    }

    public static av valueOf(String string) {
        return Enum.valueOf(av.class, string);
    }

    private av(String string2) {
        this.dxZ = string2;
    }

    public String toString() {
        return this.dxZ;
    }

    private static /* synthetic */ av[] atd() {
        return new av[]{dxV, dxW, dxX, dxY};
    }

    static {
        dya = av.atd();
    }
}

