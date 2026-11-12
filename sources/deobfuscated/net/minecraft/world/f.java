/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

public final class f
extends Enum<f> {
    public static final /* enum */ f dBR = new f(0, "options.difficulty.peaceful");
    public static final /* enum */ f dBS = new f(1, "options.difficulty.easy");
    public static final /* enum */ f dBT = new f(2, "options.difficulty.normal");
    public static final /* enum */ f dBU = new f(3, "options.difficulty.hard");
    private static final f[] dBV;
    private final int dBW;
    private final String dBX;
    private static final /* synthetic */ f[] dBY;

    public static f[] values() {
        return (f[])dBY.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    private f(int n3, String string2) {
        this.dBW = n3;
        this.dBX = string2;
    }

    public int auZ() {
        return this.dBW;
    }

    public static f ib(int n2) {
        return dBV[n2 % dBV.length];
    }

    public String ava() {
        return this.dBX;
    }

    private static /* synthetic */ f[] avb() {
        return new f[]{dBR, dBS, dBT, dBU};
    }

    static {
        dBY = f.avb();
        dBV = new f[f.values().length];
        f[] fArray = f.values();
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            f f2;
            f.dBV[f2.dBW] = f2 = fArray[i2];
        }
    }
}

