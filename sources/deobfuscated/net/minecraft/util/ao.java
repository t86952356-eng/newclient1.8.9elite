/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.util;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import net.minecraft.util.ap;
import net.minecraft.util.aq;
import net.minecraft.util.bg;
import net.minecraft.util.bt;
import net.minecraft.util.db;

public final class ao
extends Enum<ao>
implements bg {
    public static final /* enum */ ao dwq = new ao(0, 1, -1, "down", aq.dwP, ap.dwI, new db(0, -1, 0));
    public static final /* enum */ ao dwr = new ao(1, 0, -1, "up", aq.dwO, ap.dwI, new db(0, 1, 0));
    public static final /* enum */ ao dws = new ao(2, 3, 2, "north", aq.dwP, ap.dwJ, new db(0, 0, -1));
    public static final /* enum */ ao dwt = new ao(3, 2, 0, "south", aq.dwO, ap.dwJ, new db(0, 0, 1));
    public static final /* enum */ ao dwu = new ao(4, 5, 1, "west", aq.dwP, ap.dwH, new db(-1, 0, 0));
    public static final /* enum */ ao dwv = new ao(5, 4, 3, "east", aq.dwO, ap.dwH, new db(1, 0, 0));
    private final int dww;
    private final int dwx;
    private final int dwy;
    private final String name;
    private final ap dwA;
    private final aq dwB;
    private final db dwC;
    public static final ao[] dwD;
    private static final ao[] dwE;
    private static final Map<String, ao> dwF;
    private static final /* synthetic */ ao[] dwG;

    public static ao[] values() {
        return (ao[])dwG.clone();
    }

    public static ao valueOf(String string) {
        return Enum.valueOf(ao.class, string);
    }

    private ao(int n3, int n4, int n5, String string2, aq aq2, ap ap2, db db2) {
        this.dww = n3;
        this.dwy = n5;
        this.dwx = n4;
        this.name = string2;
        this.dwA = ap2;
        this.dwB = aq2;
        this.dwC = db2;
    }

    public int OY() {
        return this.dww;
    }

    public int asA() {
        return this.dwy;
    }

    public aq asB() {
        return this.dwB;
    }

    public ao asC() {
        return dwD[this.dwx];
    }

    public ao c(ap ap2) {
        switch (ap2.ordinal()) {
            case 0: {
                if (this != dwu && this != dwv) {
                    return this.asE();
                }
                return this;
            }
            case 1: {
                if (this != dwr && this != dwq) {
                    return this.asD();
                }
                return this;
            }
            case 2: {
                if (this != dws && this != dwt) {
                    return this.asF();
                }
                return this;
            }
        }
        throw new IllegalStateException("Unable to get CW facing for axis " + String.valueOf(ap2));
    }

    public ao asD() {
        switch (this.ordinal()) {
            case 2: {
                return dwv;
            }
            case 5: {
                return dwt;
            }
            case 3: {
                return dwu;
            }
            case 4: {
                return dws;
            }
        }
        throw new IllegalStateException("Unable to get Y-rotated facing of " + String.valueOf(this));
    }

    private ao asE() {
        switch (this.ordinal()) {
            case 2: {
                return dwq;
            }
            default: {
                throw new IllegalStateException("Unable to get X-rotated facing of " + String.valueOf(this));
            }
            case 3: {
                return dwr;
            }
            case 1: {
                return dws;
            }
            case 0: 
        }
        return dwt;
    }

    private ao asF() {
        switch (this.ordinal()) {
            case 5: {
                return dwq;
            }
            default: {
                throw new IllegalStateException("Unable to get Z-rotated facing of " + String.valueOf(this));
            }
            case 4: {
                return dwr;
            }
            case 1: {
                return dwv;
            }
            case 0: 
        }
        return dwu;
    }

    public ao asG() {
        switch (this.ordinal()) {
            case 2: {
                return dwu;
            }
            case 5: {
                return dws;
            }
            case 3: {
                return dwv;
            }
            case 4: {
                return dwt;
            }
        }
        throw new IllegalStateException("Unable to get CCW facing of " + String.valueOf(this));
    }

    public int asH() {
        return this.dwA == ap.dwH ? this.dwB.asS() : 0;
    }

    public int asI() {
        return this.dwA == ap.dwI ? this.dwB.asS() : 0;
    }

    public int asJ() {
        return this.dwA == ap.dwJ ? this.dwB.asS() : 0;
    }

    public String asK() {
        return this.name;
    }

    public ap asL() {
        return this.dwA;
    }

    public static ao gg(String string) {
        return string == null ? null : dwF.get(string.toLowerCase());
    }

    public static ao hy(int n2) {
        return dwD[bt.hN(n2 % dwD.length)];
    }

    public static ao hz(int n2) {
        return dwE[bt.hN(n2 % dwE.length)];
    }

    public static ao aC(double d2) {
        return ao.hz(bt.aF(d2 / 90.0 + 0.5) & 3);
    }

    public static ao g(Random random) {
        return ao.values()[random.nextInt(ao.values().length)];
    }

    public static ao H(float f2, float f3, float f4) {
        ao ao2 = dws;
        float f5 = Float.MIN_VALUE;
        for (ao ao3 : ao.values()) {
            float f6 = f2 * (float)ao3.dwC.wt() + f3 * (float)ao3.dwC.wu() + f4 * (float)ao3.dwC.wx();
            if (!(f6 > f5)) continue;
            f5 = f6;
            ao2 = ao3;
        }
        return ao2;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public static ao a(aq aq2, ap ap2) {
        for (ao ao2 : ao.values()) {
            if (ao2.asB() != aq2 || ao2.asL() != ap2) continue;
            return ao2;
        }
        throw new IllegalArgumentException("No such direction: " + String.valueOf((Object)aq2) + " " + String.valueOf(ap2));
    }

    public db asM() {
        return this.dwC;
    }

    private static /* synthetic */ ao[] asN() {
        return new ao[]{dwq, dwr, dws, dwt, dwu, dwv};
    }

    static {
        dwG = ao.asN();
        dwD = new ao[6];
        dwE = new ao[4];
        dwF = Maps.newHashMap();
        ao[] aoArray = ao.values();
        int n2 = aoArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ao ao2;
            ao.dwD[ao2.dww] = ao2 = aoArray[i2];
            if (ao2.asL().asP()) {
                ao.dwE[ao2.dwy] = ao2;
            }
            dwF.put(ao2.asK().toLowerCase(), ao2);
        }
    }
}

