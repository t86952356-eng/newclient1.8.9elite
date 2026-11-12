/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.uniform;

import net.minecraft.src.a;
import net.minecraft.util.b;
import net.optifine.shaders.ah;
import net.optifine.shaders.uniform.g;
import net.optifine.shaders.uniform.h;
import net.optifine.shaders.uniform.i;
import net.optifine.shaders.uniform.j;
import net.optifine.shaders.uniform.k;
import net.optifine.shaders.uniform.l;
import net.optifine.shaders.uniform.n;
import net.optifine.shaders.uniform.o;

public final class e
extends Enum<e> {
    public static final /* enum */ e eJj = new e("biome");
    public static final /* enum */ e eJk = new e("temperature");
    public static final /* enum */ e eJl = new e("rainfall");
    public static final /* enum */ e eJm = new e(ah.eAh);
    public static final /* enum */ e eJn = new e(ah.eAi);
    public static final /* enum */ e eJo = new e(ah.eAj);
    public static final /* enum */ e eJp = new e(ah.eAk);
    public static final /* enum */ e eJq = new e(ah.eAp);
    public static final /* enum */ e eJr = new e(ah.eAq);
    public static final /* enum */ e eJs = new e(ah.eAr);
    public static final /* enum */ e eJt = new e(ah.eAs);
    public static final /* enum */ e eJu = new e(ah.eAt);
    public static final /* enum */ e eJv = new e(ah.eAu);
    public static final /* enum */ e eJw = new e(ah.eAv);
    public static final /* enum */ e eJx = new e(ah.eAw);
    public static final /* enum */ e eJy = new e(ah.eAx);
    public static final /* enum */ e eJz = new e(ah.eAy);
    public static final /* enum */ e eJA = new e(ah.eAz);
    public static final /* enum */ e eJB = new e(ah.eAA);
    public static final /* enum */ e eJC = new e(ah.eAB);
    public static final /* enum */ e eJD = new e(ah.eAC);
    public static final /* enum */ e eJE = new e(ah.eAT);
    public static final /* enum */ e eJF = new e(ah.eAU);
    public static final /* enum */ e eJG = new e(ah.eAV, new String[]{"x", "y"});
    public static final /* enum */ e eJH = new e(ah.eAX, new String[]{"x", "y"});
    public static final /* enum */ e eJI = new e(ah.eAY);
    public static final /* enum */ e eJJ = new e(ah.eAZ);
    public static final /* enum */ e eJK = new e(ah.eBa);
    public static final /* enum */ e eJL = new e(ah.eBb);
    public static final /* enum */ e eJM = new e(ah.eBc);
    public static final /* enum */ e eJN = new e(ah.eBd);
    public static final /* enum */ e eJO = new e(ah.eBe);
    public static final /* enum */ e eJP = new e(ah.eBf, new String[]{"x", "y"});
    public static final /* enum */ e eJQ = new e(ah.eAI, new String[]{"x", "y", "z"});
    public static final /* enum */ e eJR = new e(ah.eAH, new String[]{"x", "y", "z"});
    public static final /* enum */ e eJS = new e(ah.eAD, new String[]{"x", "y", "z"});
    public static final /* enum */ e eJT = new e(ah.eAE, new String[]{"x", "y", "z"});
    public static final /* enum */ e eJU = new e(ah.eAF, new String[]{"x", "y", "z"});
    public static final /* enum */ e eJV = new e(ah.eAG, new String[]{"x", "y", "z"});
    public static final /* enum */ e eJW = new e(ah.eAo, new String[]{"r", "g", "b"});
    public static final /* enum */ e eJX = new e(ah.eAM, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ e eJY = new e(ah.eAN, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ e eJZ = new e(ah.eAL, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ e eKa = new e(ah.eAJ, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ e eKb = new e(ah.eAK, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ e eKc = new e(ah.eAO, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ e eKd = new e(ah.eAP, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ e eKe = new e(ah.eAQ, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ e eKf = new e(ah.eAR, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ e eKg = new e(ah.eAS, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    private final String name;
    private n eKi;
    private String[] eKj;
    private String[] eKk;
    private static final /* synthetic */ e[] eKl;

    public static e[] values() {
        return (e[])eKl.clone();
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private e(String string2) {
        this.name = string2;
    }

    private e(n n3) {
        this.name = n3.getName();
        this.eKi = n3;
        if (!e.a(n3, g.class, h.class)) {
            throw new IllegalArgumentException("Invalid uniform type for enum: " + String.valueOf((Object)this) + ", uniform: " + n3.getClass().getName());
        }
    }

    private e(n n3, String[] stringArray) {
        this.name = n3.getName();
        this.eKi = n3;
        this.eKj = stringArray;
        if (!e.a(n3, j.class, i.class, k.class, l.class)) {
            throw new IllegalArgumentException("Invalid uniform type for enum: " + String.valueOf((Object)this) + ", uniform: " + n3.getClass().getName());
        }
    }

    private e(n n3, String[] stringArray, String[] stringArray2) {
        this.name = n3.getName();
        this.eKi = n3;
        this.eKj = stringArray;
        this.eKk = stringArray2;
        if (!e.a(n3, o.class)) {
            throw new IllegalArgumentException("Invalid uniform type for enum: " + String.valueOf((Object)this) + ", uniform: " + n3.getClass().getName());
        }
    }

    public String getName() {
        return this.name;
    }

    public n aIH() {
        return this.eKi;
    }

    public String[] aII() {
        return this.eKj;
    }

    public String[] aIJ() {
        return this.eKk;
    }

    public float bR(int n2, int n3) {
        if (this.eKj == null || n2 >= 0 && n2 <= this.eKj.length) {
            if (this.eKk == null || n3 >= 0 && n3 <= this.eKk.length) {
                switch (this.ordinal()) {
                    case 0: {
                        b b2 = ah.aGR();
                        net.minecraft.world.biome.j j2 = ah.aGQ().aF(b2);
                        return j2.dHo;
                    }
                    case 1: {
                        b b3 = ah.aGR();
                        net.minecraft.world.biome.j j3 = ah.aGQ().aF(b3);
                        return j3 != null ? j3.bi(b3) : 0.0f;
                    }
                    case 2: {
                        b b4 = ah.aGR();
                        net.minecraft.world.biome.j j4 = ah.aGQ().aF(b4);
                        return j4 != null ? j4.axb() : 0.0f;
                    }
                }
                if (this.eKi instanceof g) {
                    return ((g)this.eKi).getValue();
                }
                if (this.eKi instanceof h) {
                    return ((h)this.eKi).aHt();
                }
                if (this.eKi instanceof j) {
                    return ((j)this.eKi).aIM()[n2];
                }
                if (this.eKi instanceof i) {
                    return ((i)this.eKi).aIL()[n2];
                }
                if (this.eKi instanceof k) {
                    return ((k)this.eKi).aIL()[n2];
                }
                if (this.eKi instanceof l) {
                    return ((l)this.eKi).aIL()[n2];
                }
                if (this.eKi instanceof o) {
                    return ((o)this.eKi).bT(n2, n3);
                }
                throw new IllegalArgumentException("Unknown uniform type: " + String.valueOf((Object)this));
            }
            a.warn("Invalid index2, parameter: " + String.valueOf((Object)this) + ", index: " + n3);
            return 0.0f;
        }
        a.warn("Invalid index1, parameter: " + String.valueOf((Object)this) + ", index: " + n2);
        return 0.0f;
    }

    private static boolean a(Object object, Class ... classArray) {
        if (object == null) {
            return false;
        }
        Class<?> clazz = object.getClass();
        for (int i2 = 0; i2 < classArray.length; ++i2) {
            Class clazz2 = classArray[i2];
            if (!clazz2.isAssignableFrom(clazz)) continue;
            return true;
        }
        return false;
    }

    private static /* synthetic */ e[] aIK() {
        return new e[]{eJj, eJk, eJl, eJm, eJn, eJo, eJp, eJq, eJr, eJs, eJt, eJu, eJv, eJw, eJx, eJy, eJz, eJA, eJB, eJC, eJD, eJE, eJF, eJG, eJH, eJI, eJJ, eJK, eJL, eJM, eJN, eJO, eJP, eJQ, eJR, eJS, eJT, eJU, eJV, eJW, eJX, eJY, eJZ, eKa, eKb, eKc, eKd, eKe, eKf, eKg};
    }

    static {
        eKl = e.aIK();
    }
}

