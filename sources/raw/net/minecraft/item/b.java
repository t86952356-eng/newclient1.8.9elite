/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.material.MapColor;
import net.minecraft.util.an;
import net.minecraft.util.bg;

public final class b
extends Enum<b>
implements bg {
    public static final /* enum */ b cUC = new b(0, 15, "white", "white", MapColor.bdK, an.dwa);
    public static final /* enum */ b cUD = new b(1, 14, "orange", "orange", MapColor.bdR, an.dvR);
    public static final /* enum */ b cUE = new b(2, 13, "magenta", "magenta", MapColor.bdS, an.dvW);
    public static final /* enum */ b cUF = new b(3, 12, "light_blue", "lightBlue", MapColor.bdT, an.dvU);
    public static final /* enum */ b cUG = new b(4, 11, "yellow", "yellow", MapColor.bdU, an.dvZ);
    public static final /* enum */ b cUH = new b(5, 10, "lime", "lime", MapColor.bdV, an.dvV);
    public static final /* enum */ b cUI = new b(6, 9, "pink", "pink", MapColor.bdW, an.dvY);
    public static final /* enum */ b cUJ = new b(7, 8, "gray", "gray", MapColor.bdX, an.dvT);
    public static final /* enum */ b cUK = new b(8, 7, "silver", "silver", MapColor.bdY, an.dvS);
    public static final /* enum */ b cUL = new b(9, 6, "cyan", "cyan", MapColor.bdZ, an.dvO);
    public static final /* enum */ b cUM = new b(10, 5, "purple", "purple", MapColor.bea, an.dvQ);
    public static final /* enum */ b cUN = new b(11, 4, "blue", "blue", MapColor.beb, an.dvM);
    public static final /* enum */ b cUO = new b(12, 3, "brown", "brown", MapColor.bec, an.dvR);
    public static final /* enum */ b cUP = new b(13, 2, "green", "green", MapColor.bed, an.dvN);
    public static final /* enum */ b cUQ = new b(14, 1, "red", "red", MapColor.bee, an.dvP);
    public static final /* enum */ b cUR = new b(15, 0, "black", "black", MapColor.bef, an.dvL);
    private static final b[] cUS;
    private static final b[] cUT;
    private final int cUU;
    private final int cUV;
    private final String cUW;
    private final String cUX;
    private final MapColor cUY;
    private final an cUZ;
    private static final /* synthetic */ b[] cVa;

    public static b[] values() {
        return (b[])cVa.clone();
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private b(int n3, int n4, String string2, String string3, MapColor mapColor, an an2) {
        this.cUU = n3;
        this.cUV = n4;
        this.cUW = string2;
        this.cUX = string3;
        this.cUY = mapColor;
        this.cUZ = an2;
    }

    public int yc() {
        return this.cUU;
    }

    public int ado() {
        return this.cUV;
    }

    public String xB() {
        return this.cUX;
    }

    public MapColor lv() {
        return this.cUY;
    }

    public static b fR(int n2) {
        if (n2 < 0 || n2 >= cUT.length) {
            n2 = 0;
        }
        return cUT[n2];
    }

    public static b fS(int n2) {
        if (n2 < 0 || n2 >= cUS.length) {
            n2 = 0;
        }
        return cUS[n2];
    }

    public String toString() {
        return this.cUX;
    }

    @Override
    public String getName() {
        return this.cUW;
    }

    private static /* synthetic */ b[] adp() {
        return new b[]{cUC, cUD, cUE, cUF, cUG, cUH, cUI, cUJ, cUK, cUL, cUM, cUN, cUO, cUP, cUQ, cUR};
    }

    static {
        cVa = b.adp();
        cUS = new b[b.values().length];
        cUT = new b[b.values().length];
        b[] bArray = b.values();
        int n2 = bArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            b b2;
            b.cUS[b2.yc()] = b2 = bArray[i2];
            b.cUT[b2.ado()] = b2;
        }
    }
}

