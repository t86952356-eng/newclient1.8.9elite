/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.expr;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.d;
import net.minecraft.client.multiplayer.j;
import net.minecraft.src.a;
import net.minecraft.util.bt;
import net.optifine.expr.f;
import net.optifine.expr.l;
import net.optifine.expr.m;
import net.optifine.expr.o;
import net.optifine.expr.r;
import net.optifine.expr.t;
import net.optifine.shaders.uniform.q;
import net.optifine.util.z;

public final class k
extends Enum<k> {
    public static final /* enum */ k eia = new k(10, f.ehO, "+", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eib = new k(10, f.ehO, "-", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eic = new k(11, f.ehO, "*", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eid = new k(11, f.ehO, "/", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eie = new k(11, f.ehO, "%", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eif = new k(12, f.ehO, "neg", new f[]{f.ehO});
    public static final /* enum */ k eig = new k(f.ehO, "pi", new f[0]);
    public static final /* enum */ k eih = new k(f.ehO, "sin", new f[]{f.ehO});
    public static final /* enum */ k eii = new k(f.ehO, "cos", new f[]{f.ehO});
    public static final /* enum */ k eij = new k(f.ehO, "asin", new f[]{f.ehO});
    public static final /* enum */ k eik = new k(f.ehO, "acos", new f[]{f.ehO});
    public static final /* enum */ k eil = new k(f.ehO, "tan", new f[]{f.ehO});
    public static final /* enum */ k eim = new k(f.ehO, "atan", new f[]{f.ehO});
    public static final /* enum */ k ein = new k(f.ehO, "atan2", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eio = new k(f.ehO, "torad", new f[]{f.ehO});
    public static final /* enum */ k eip = new k(f.ehO, "todeg", new f[]{f.ehO});
    public static final /* enum */ k eiq = new k(f.ehO, "min", new t().b(f.ehO).c(f.ehO));
    public static final /* enum */ k eir = new k(f.ehO, "max", new t().b(f.ehO).c(f.ehO));
    public static final /* enum */ k eis = new k(f.ehO, "clamp", new f[]{f.ehO, f.ehO, f.ehO});
    public static final /* enum */ k eit = new k(f.ehO, "abs", new f[]{f.ehO});
    public static final /* enum */ k eiu = new k(f.ehO, "floor", new f[]{f.ehO});
    public static final /* enum */ k eiv = new k(f.ehO, "ceil", new f[]{f.ehO});
    public static final /* enum */ k eiw = new k(f.ehO, "exp", new f[]{f.ehO});
    public static final /* enum */ k eix = new k(f.ehO, "frac", new f[]{f.ehO});
    public static final /* enum */ k eiy = new k(f.ehO, "log", new f[]{f.ehO});
    public static final /* enum */ k eiz = new k(f.ehO, "pow", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eiA = new k(f.ehO, "random", new f[0]);
    public static final /* enum */ k eiB = new k(f.ehO, "round", new f[]{f.ehO});
    public static final /* enum */ k eiC = new k(f.ehO, "signum", new f[]{f.ehO});
    public static final /* enum */ k eiD = new k(f.ehO, "sqrt", new f[]{f.ehO});
    public static final /* enum */ k eiE = new k(f.ehO, "fmod", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eiF = new k(f.ehO, "time", new f[0]);
    public static final /* enum */ k eiG = new k(f.ehO, "if", new t().b(f.ehQ, f.ehO).c(f.ehQ, f.ehO).d(f.ehO));
    public static final /* enum */ k eiH = new k(12, f.ehQ, "!", new f[]{f.ehQ});
    public static final /* enum */ k eiI = new k(3, f.ehQ, "&&", new f[]{f.ehQ, f.ehQ});
    public static final /* enum */ k eiJ = new k(2, f.ehQ, "||", new f[]{f.ehQ, f.ehQ});
    public static final /* enum */ k eiK = new k(8, f.ehQ, ">", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eiL = new k(8, f.ehQ, ">=", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eiM = new k(8, f.ehQ, "<", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eiN = new k(8, f.ehQ, "<=", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eiO = new k(7, f.ehQ, "==", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eiP = new k(7, f.ehQ, "!=", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eiQ = new k(7, f.ehQ, "between", new f[]{f.ehO, f.ehO, f.ehO});
    public static final /* enum */ k eiR = new k(7, f.ehQ, "equals", new f[]{f.ehO, f.ehO, f.ehO});
    public static final /* enum */ k eiS = new k(f.ehQ, "in", new t().b(f.ehO).c(f.ehO).d(f.ehO));
    public static final /* enum */ k eiT = new k(f.ehO, "smooth", new t().b(f.ehO).c(f.ehO).jx(4));
    public static final /* enum */ k eiU = new k(f.ehQ, "true", new f[0]);
    public static final /* enum */ k eiV = new k(f.ehQ, "false", new f[0]);
    public static final /* enum */ k eiW = new k(f.ehP, "vec2", new f[]{f.ehO, f.ehO});
    public static final /* enum */ k eiX = new k(f.ehP, "vec3", new f[]{f.ehO, f.ehO, f.ehO});
    public static final /* enum */ k eiY = new k(f.ehP, "vec4", new f[]{f.ehO, f.ehO, f.ehO, f.ehO});
    private int eiZ;
    private f eja;
    private String gK;
    private r ejb;
    public static k[] ejc;
    private static final Map<Integer, Float> ejd;
    private static final /* synthetic */ k[] eje;

    public static k[] values() {
        return (k[])eje.clone();
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    private k(f f2, String string2, f[] fArray) {
    }

    private k(int n3, f f2, String string2, f[] fArray) {
    }

    private k(f f2, String string2, r r2) {
    }

    private k(int n3, f f2, String string2, r r2) {
        this.eiZ = n3;
        this.eja = f2;
        this.gK = string2;
        this.ejb = r2;
    }

    public String getName() {
        return this.gK;
    }

    public int aCy() {
        return this.eiZ;
    }

    public f aCq() {
        return this.eja;
    }

    public r aCz() {
        return this.ejb;
    }

    public int a(l[] lArray) {
        return this.ejb.b(lArray).length;
    }

    public f[] b(l[] lArray) {
        return this.ejb.b(lArray);
    }

    public float c(l[] lArray) {
        switch (this.ordinal()) {
            case 0: {
                return k.a(lArray, 0) + k.a(lArray, 1);
            }
            case 1: {
                return k.a(lArray, 0) - k.a(lArray, 1);
            }
            case 2: {
                return k.a(lArray, 0) * k.a(lArray, 1);
            }
            case 3: {
                return k.a(lArray, 0) / k.a(lArray, 1);
            }
            case 4: {
                float f2 = k.a(lArray, 0);
                float f3 = k.a(lArray, 1);
                return f2 - f3 * (float)((int)(f2 / f3));
            }
            case 5: {
                return -k.a(lArray, 0);
            }
            case 6: {
                return bt.dyT;
            }
            case 7: {
                return bt.bx(k.a(lArray, 0));
            }
            case 8: {
                return bt.bB(k.a(lArray, 0));
            }
            case 9: {
                return z.cn(k.a(lArray, 0));
            }
            case 10: {
                return z.co(k.a(lArray, 0));
            }
            case 11: {
                return (float)Math.tan(k.a(lArray, 0));
            }
            case 12: {
                return (float)Math.atan(k.a(lArray, 0));
            }
            case 13: {
                return (float)bt.y(k.a(lArray, 0), k.a(lArray, 1));
            }
            case 14: {
                return z.cq(k.a(lArray, 0));
            }
            case 15: {
                return z.cp(k.a(lArray, 0));
            }
            case 16: {
                return this.d(lArray);
            }
            case 17: {
                return this.e(lArray);
            }
            case 18: {
                return bt.I(k.a(lArray, 0), k.a(lArray, 1), k.a(lArray, 2));
            }
            case 19: {
                return bt.bz(k.a(lArray, 0));
            }
            case 22: {
                return (float)Math.exp(k.a(lArray, 0));
            }
            case 20: {
                return bt.bL(k.a(lArray, 0));
            }
            case 21: {
                return bt.bM(k.a(lArray, 0));
            }
            case 23: {
                return (float)bt.aK(k.a(lArray, 0));
            }
            case 24: {
                return (float)Math.log(k.a(lArray, 0));
            }
            case 25: {
                return (float)Math.pow(k.a(lArray, 0), k.a(lArray, 1));
            }
            case 26: {
                return (float)Math.random();
            }
            case 27: {
                return Math.round(k.a(lArray, 0));
            }
            case 28: {
                return Math.signum(k.a(lArray, 0));
            }
            case 29: {
                return bt.bK(k.a(lArray, 0));
            }
            case 30: {
                float f4 = k.a(lArray, 0);
                float f5 = k.a(lArray, 1);
                return f4 - f5 * (float)bt.bL(f4 / f5);
            }
            case 31: {
                d d2 = d.AZ();
                j j2 = d2.bgF;
                if (j2 == null) {
                    return 0.0f;
                }
                return (float)(j2.getTotalWorldTime() % 24000L) + a.bWY;
            }
            case 32: {
                int n2 = (lArray.length - 1) / 2;
                for (int i2 = 0; i2 < n2; ++i2) {
                    int n3 = i2 * 2;
                    if (!k.b(lArray, n3)) continue;
                    return k.a(lArray, n3 + 1);
                }
                return k.a(lArray, n2 * 2);
            }
            case 45: {
                int n4 = (int)k.a(lArray, 0);
                float f6 = k.a(lArray, 1);
                float f7 = lArray.length > 2 ? k.a(lArray, 2) : 1.0f;
                float f8 = lArray.length > 3 ? k.a(lArray, 3) : f7;
                float f9 = q.b(n4, f6, f7, f8);
                return f9;
            }
        }
        a.warn("Unknown function type: " + String.valueOf((Object)this));
        return 0.0f;
    }

    private float d(l[] lArray) {
        if (lArray.length == 2) {
            return Math.min(k.a(lArray, 0), k.a(lArray, 1));
        }
        float f2 = k.a(lArray, 0);
        for (int i2 = 1; i2 < lArray.length; ++i2) {
            float f3 = k.a(lArray, i2);
            if (!(f3 < f2)) continue;
            f2 = f3;
        }
        return f2;
    }

    private float e(l[] lArray) {
        if (lArray.length == 2) {
            return Math.max(k.a(lArray, 0), k.a(lArray, 1));
        }
        float f2 = k.a(lArray, 0);
        for (int i2 = 1; i2 < lArray.length; ++i2) {
            float f3 = k.a(lArray, i2);
            if (!(f3 > f2)) continue;
            f2 = f3;
        }
        return f2;
    }

    private static float a(l[] lArray, int n2) {
        o o2 = (o)lArray[n2];
        float f2 = o2.aCr();
        return f2;
    }

    public boolean f(l[] lArray) {
        switch (this.ordinal()) {
            case 46: {
                return true;
            }
            case 47: {
                return false;
            }
            case 33: {
                return !k.b(lArray, 0);
            }
            case 34: {
                return k.b(lArray, 0) && k.b(lArray, 1);
            }
            case 35: {
                return k.b(lArray, 0) || k.b(lArray, 1);
            }
            case 36: {
                return k.a(lArray, 0) > k.a(lArray, 1);
            }
            case 37: {
                return k.a(lArray, 0) >= k.a(lArray, 1);
            }
            case 38: {
                return k.a(lArray, 0) < k.a(lArray, 1);
            }
            case 39: {
                return k.a(lArray, 0) <= k.a(lArray, 1);
            }
            case 40: {
                return k.a(lArray, 0) == k.a(lArray, 1);
            }
            case 41: {
                return k.a(lArray, 0) != k.a(lArray, 1);
            }
            case 42: {
                float f2 = k.a(lArray, 0);
                return f2 >= k.a(lArray, 1) && f2 <= k.a(lArray, 2);
            }
            case 43: {
                float f3 = k.a(lArray, 0) - k.a(lArray, 1);
                float f4 = k.a(lArray, 2);
                return Math.abs(f3) <= f4;
            }
            case 44: {
                float f5 = k.a(lArray, 0);
                for (int i2 = 1; i2 < lArray.length; ++i2) {
                    float f6 = k.a(lArray, i2);
                    if (f5 != f6) continue;
                    return true;
                }
                return false;
            }
        }
        a.warn("Unknown function type: " + String.valueOf((Object)this));
        return false;
    }

    private static boolean b(l[] lArray, int n2) {
        m m2 = (m)lArray[n2];
        boolean bl2 = m2.aCt();
        return bl2;
    }

    public float[] g(l[] lArray) {
        switch (this.ordinal()) {
            case 48: {
                return new float[]{k.a(lArray, 0), k.a(lArray, 1)};
            }
            case 49: {
                return new float[]{k.a(lArray, 0), k.a(lArray, 1), k.a(lArray, 2)};
            }
            case 50: {
                return new float[]{k.a(lArray, 0), k.a(lArray, 1), k.a(lArray, 2), k.a(lArray, 3)};
            }
        }
        a.warn("Unknown function type: " + String.valueOf((Object)this));
        return null;
    }

    public static k ii(String string) {
        for (int i2 = 0; i2 < ejc.length; ++i2) {
            k k2 = ejc[i2];
            if (k2 == null || k2.getName() == null || !k2.getName().equals(string)) continue;
            return k2;
        }
        return null;
    }

    private static /* synthetic */ k[] aCA() {
        return new k[]{eia, eib, eic, eid, eie, eif, eig, eih, eii, eij, eik, eil, eim, ein, eio, eip, eiq, eir, eis, eit, eiu, eiv, eiw, eix, eiy, eiz, eiA, eiB, eiC, eiD, eiE, eiF, eiG, eiH, eiI, eiJ, eiK, eiL, eiM, eiN, eiO, eiP, eiQ, eiR, eiS, eiT, eiU, eiV, eiW, eiX, eiY};
    }

    static {
        eje = k.aCA();
        ejc = k.values();
        ejd = new HashMap<Integer, Float>();
    }
}

