/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

public final class n
extends Enum<n> {
    public static final /* enum */ n dHx = new n();
    public static final /* enum */ n dHy = new n();
    public static final /* enum */ n dHz = new n();
    public static final /* enum */ n dHA = new n();
    private static final /* synthetic */ n[] dHB;

    public static n[] values() {
        return (n[])dHB.clone();
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    private static /* synthetic */ n[] axi() {
        return new n[]{dHx, dHy, dHz, dHA};
    }

    static {
        dHB = n.axi();
    }
}

