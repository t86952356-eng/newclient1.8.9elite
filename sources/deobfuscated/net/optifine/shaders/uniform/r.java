/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.uniform;

import net.optifine.expr.f;
import net.optifine.expr.m;
import net.optifine.expr.o;
import net.optifine.expr.p;
import net.optifine.shaders.uniform.g;
import net.optifine.shaders.uniform.h;
import net.optifine.shaders.uniform.i;
import net.optifine.shaders.uniform.k;
import net.optifine.shaders.uniform.l;
import net.optifine.shaders.uniform.n;

public final class r
extends Enum<r> {
    public static final /* enum */ r eKJ = new r();
    public static final /* enum */ r eKK = new r();
    public static final /* enum */ r eKL = new r();
    public static final /* enum */ r eKM = new r();
    public static final /* enum */ r eKN = new r();
    public static final /* enum */ r eKO = new r();
    private static final /* synthetic */ r[] eKP;

    public static r[] values() {
        return (r[])eKP.clone();
    }

    public static r valueOf(String string) {
        return Enum.valueOf(r.class, string);
    }

    public n jY(String string) {
        switch (this.ordinal()) {
            case 0: {
                return new h(string);
            }
            case 1: {
                return new h(string);
            }
            case 2: {
                return new g(string);
            }
            case 3: {
                return new i(string);
            }
            case 4: {
                return new k(string);
            }
            case 5: {
                return new l(string);
            }
        }
        throw new RuntimeException("Unknown uniform type: " + String.valueOf((Object)this));
    }

    public void a(net.optifine.expr.l l2, n n2) {
        switch (this.ordinal()) {
            case 0: {
                this.a((m)l2, (h)n2);
                return;
            }
            case 1: {
                this.a((o)l2, (h)n2);
                return;
            }
            case 2: {
                this.a((o)l2, (g)n2);
                return;
            }
            case 3: {
                this.a((p)l2, (i)n2);
                return;
            }
            case 4: {
                this.a((p)l2, (k)n2);
                return;
            }
            case 5: {
                this.a((p)l2, (l)n2);
                return;
            }
        }
        throw new RuntimeException("Unknown uniform type: " + String.valueOf((Object)this));
    }

    private void a(m m2, h h2) {
        boolean bl2 = m2.aCt();
        int n2 = bl2 ? 1 : 0;
        h2.km(n2);
    }

    private void a(o o2, h h2) {
        int n2 = (int)o2.aCr();
        h2.km(n2);
    }

    private void a(o o2, g g2) {
        float f2 = o2.aCr();
        g2.cf(f2);
    }

    private void a(p p2, i i2) {
        float[] fArray = p2.aCw();
        if (fArray.length != 2) {
            throw new RuntimeException("Value length is not 2, length: " + fArray.length);
        }
        i2.D(fArray[0], fArray[1]);
    }

    private void a(p p2, k k2) {
        float[] fArray = p2.aCw();
        if (fArray.length != 3) {
            throw new RuntimeException("Value length is not 3, length: " + fArray.length);
        }
        k2.O(fArray[0], fArray[1], fArray[2]);
    }

    private void a(p p2, l l2) {
        float[] fArray = p2.aCw();
        if (fArray.length != 4) {
            throw new RuntimeException("Value length is not 4, length: " + fArray.length);
        }
        l2.p(fArray[0], fArray[1], fArray[2], fArray[3]);
    }

    public boolean a(f f2) {
        switch (this.ordinal()) {
            case 0: {
                return f2 == f.ehQ;
            }
            case 1: {
                return f2 == f.ehO;
            }
            case 2: {
                return f2 == f.ehO;
            }
            case 3: 
            case 4: 
            case 5: {
                return f2 == f.ehP;
            }
        }
        throw new RuntimeException("Unknown uniform type: " + String.valueOf((Object)this));
    }

    public static r jZ(String string) {
        r[] rArray = r.values();
        for (int i2 = 0; i2 < rArray.length; ++i2) {
            r r2 = rArray[i2];
            if (!r2.name().toLowerCase().equals(string)) continue;
            return r2;
        }
        return null;
    }

    private static /* synthetic */ r[] aIT() {
        return new r[]{eKJ, eKK, eKL, eKM, eKN, eKO};
    }

    static {
        eKP = r.aIT();
    }
}

