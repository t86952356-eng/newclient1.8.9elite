/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model.anim;

import net.minecraft.client.model.ag;
import net.minecraft.src.a;

public final class f
extends Enum<f> {
    public static final /* enum */ f egA = new f("tx");
    public static final /* enum */ f egB = new f("ty");
    public static final /* enum */ f egC = new f("tz");
    public static final /* enum */ f egD = new f("rx");
    public static final /* enum */ f egE = new f("ry");
    public static final /* enum */ f egF = new f("rz");
    public static final /* enum */ f egG = new f("ox");
    public static final /* enum */ f egH = new f("oy");
    public static final /* enum */ f egI = new f("oz");
    public static final /* enum */ f egJ = new f("sx");
    public static final /* enum */ f egK = new f("sy");
    public static final /* enum */ f egL = new f("sz");
    private final String egM;
    public static f[] egN;
    private static final /* synthetic */ f[] egO;

    public static f[] values() {
        return (f[])egO.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    private f(String string2) {
        this.egM = string2;
    }

    public String getName() {
        return this.egM;
    }

    public float d(ag ag2) {
        switch (this.ordinal()) {
            case 0: {
                return ag2.bBC;
            }
            case 1: {
                return ag2.bBD;
            }
            case 2: {
                return ag2.bBE;
            }
            case 3: {
                return ag2.bBF;
            }
            case 4: {
                return ag2.bBG;
            }
            case 5: {
                return ag2.bBH;
            }
            case 6: {
                return ag2.bBR;
            }
            case 7: {
                return ag2.bBS;
            }
            case 8: {
                return ag2.bBT;
            }
            case 9: {
                return ag2.bBW;
            }
            case 10: {
                return ag2.bBX;
            }
            case 11: {
                return ag2.bBY;
            }
        }
        a.warn("GetFloat not supported for: " + String.valueOf((Object)this));
        return 0.0f;
    }

    public void a(ag ag2, float f2) {
        switch (this.ordinal()) {
            case 0: {
                ag2.bBC = f2;
                return;
            }
            case 1: {
                ag2.bBD = f2;
                return;
            }
            case 2: {
                ag2.bBE = f2;
                return;
            }
            case 3: {
                ag2.bBF = f2;
                return;
            }
            case 4: {
                ag2.bBG = f2;
                return;
            }
            case 5: {
                ag2.bBH = f2;
                return;
            }
            case 6: {
                ag2.bBR = f2;
                return;
            }
            case 7: {
                ag2.bBS = f2;
                return;
            }
            case 8: {
                ag2.bBT = f2;
                return;
            }
            case 9: {
                ag2.bBW = f2;
                return;
            }
            case 10: {
                ag2.bBX = f2;
                return;
            }
            case 11: {
                ag2.bBY = f2;
                return;
            }
        }
        a.warn("SetFloat not supported for: " + String.valueOf((Object)this));
    }

    public static f ic(String string) {
        for (int i2 = 0; i2 < egN.length; ++i2) {
            f f2 = egN[i2];
            if (!f2.getName().equals(string)) continue;
            return f2;
        }
        return null;
    }

    private static /* synthetic */ f[] aCs() {
        return new f[]{egA, egB, egC, egD, egE, egF, egG, egH, egI, egJ, egK, egL};
    }

    static {
        egO = f.aCs();
        egN = f.values();
    }
}

