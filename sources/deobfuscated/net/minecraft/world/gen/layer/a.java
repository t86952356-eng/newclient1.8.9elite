/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.layer;

import net.minecraft.util.cl;
import net.minecraft.world.ap;
import net.minecraft.world.gen.g;
import net.minecraft.world.gen.h;
import net.minecraft.world.gen.layer.b;
import net.minecraft.world.gen.layer.c;
import net.minecraft.world.gen.layer.d;
import net.minecraft.world.gen.layer.e;
import net.minecraft.world.gen.layer.f;
import net.minecraft.world.gen.layer.i;
import net.minecraft.world.gen.layer.j;
import net.minecraft.world.gen.layer.k;
import net.minecraft.world.gen.layer.l;
import net.minecraft.world.gen.layer.m;
import net.minecraft.world.gen.layer.n;
import net.minecraft.world.gen.layer.o;
import net.minecraft.world.gen.layer.p;
import net.minecraft.world.gen.layer.q;
import net.minecraft.world.gen.layer.r;
import net.minecraft.world.gen.layer.s;
import net.minecraft.world.gen.layer.t;
import net.minecraft.world.gen.layer.u;
import net.minecraft.world.gen.layer.v;
import net.minecraft.world.gen.layer.w;

public abstract class a {
    private long dPk;
    protected a dPl;
    private long dPm;
    protected long dPn;

    public static a[] a(long l2, ap ap2, String string) {
        int n2;
        a a2 = new n(1L);
        a2 = new l(2000L, a2);
        d d2 = new d(1L, a2);
        w w2 = new w(2001L, d2);
        d d3 = new d(2L, w2);
        d3 = new d(50L, d3);
        d3 = new d(70L, d3);
        p p2 = new p(2L, d3);
        f f2 = new f(2L, p2);
        d d4 = new d(3L, f2);
        j j2 = new j(2L, d4, k.dPw);
        j2 = new j(2L, j2, k.dPx);
        j2 = new j(3L, j2, k.dPy);
        w w3 = new w(2002L, j2);
        w3 = new w(2003L, w3);
        d d5 = new d(4L, w3);
        e e2 = new e(5L, d5);
        i i2 = new i(4L, e2);
        a a3 = w.a(1000L, i2, 0);
        g g2 = null;
        int n3 = n2 = 4;
        if (ap2 == ap.dEH && string.length() > 0) {
            g2 = h.gI(string).ayi();
            n2 = g2.dMt;
            n3 = g2.dMu;
        }
        if (ap2 == ap.dEF) {
            n2 = 6;
        }
        a a4 = w.a(1000L, a3, 0);
        r r2 = new r(100L, a4);
        net.minecraft.world.gen.layer.g g3 = new net.minecraft.world.gen.layer.g(200L, a3, ap2, string);
        a a5 = w.a(1000L, g3, 2);
        net.minecraft.world.gen.layer.h h2 = new net.minecraft.world.gen.layer.h(1000L, a5);
        a a6 = w.a(1000L, r2, 2);
        a a7 = new m(1000L, h2, a6);
        a a8 = w.a(1000L, r2, 2);
        a8 = w.a(1000L, a8, n3);
        q q2 = new q(1L, a8);
        u u2 = new u(1000L, q2);
        a7 = new o(1001L, a7);
        for (int i3 = 0; i3 < n2; ++i3) {
            a7 = new w(1000 + i3, a7);
            if (i3 == 0) {
                a7 = new d(3L, a7);
            }
            if (i3 != 1 && n2 != 1) continue;
            a7 = new t(1000L, a7);
        }
        u u3 = new u(1000L, a7);
        s s2 = new s(100L, u3, u2);
        v v2 = new v(10L, s2);
        s2.O(l2);
        v2.O(l2);
        return new a[]{s2, v2, s2};
    }

    public a(long l2) {
        this.dPn = l2;
        this.dPn *= this.dPn * 6364136223846793005L + 1442695040888963407L;
        this.dPn += l2;
        this.dPn *= this.dPn * 6364136223846793005L + 1442695040888963407L;
        this.dPn += l2;
        this.dPn *= this.dPn * 6364136223846793005L + 1442695040888963407L;
        this.dPn += l2;
    }

    public void O(long l2) {
        this.dPk = l2;
        if (this.dPl != null) {
            this.dPl.O(l2);
        }
        this.dPk *= this.dPk * 6364136223846793005L + 1442695040888963407L;
        this.dPk += this.dPn;
        this.dPk *= this.dPk * 6364136223846793005L + 1442695040888963407L;
        this.dPk += this.dPn;
        this.dPk *= this.dPk * 6364136223846793005L + 1442695040888963407L;
        this.dPk += this.dPn;
    }

    public void b(long l2, long l3) {
        this.dPm = this.dPk;
        this.dPm *= this.dPm * 6364136223846793005L + 1442695040888963407L;
        this.dPm += l2;
        this.dPm *= this.dPm * 6364136223846793005L + 1442695040888963407L;
        this.dPm += l3;
        this.dPm *= this.dPm * 6364136223846793005L + 1442695040888963407L;
        this.dPm += l2;
        this.dPm *= this.dPm * 6364136223846793005L + 1442695040888963407L;
        this.dPm += l3;
    }

    protected int iB(int n2) {
        int n3 = (int)((this.dPm >> 24) % (long)n2);
        if (n3 < 0) {
            n3 += n2;
        }
        this.dPm *= this.dPm * 6364136223846793005L + 1442695040888963407L;
        this.dPm += this.dPk;
        return n3;
    }

    public abstract int[] B(int var1, int var2, int var3, int var4);

    protected static boolean bh(int n2, int n3) {
        if (n2 == n3) {
            return true;
        }
        if (n2 != net.minecraft.world.biome.j.dGR.dHo && n2 != net.minecraft.world.biome.j.dGS.dHo) {
            net.minecraft.world.biome.j j2 = net.minecraft.world.biome.j.io(n2);
            net.minecraft.world.biome.j j3 = net.minecraft.world.biome.j.io(n3);
            try {
                return j2 != null && j3 != null && j2.b(j3);
            }
            catch (Throwable throwable) {
                net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Comparing biomes");
                net.minecraft.crash.i i2 = a2.dY("Biomes being compared");
                i2.b("Biome A ID", n2);
                i2.b("Biome B ID", n3);
                i2.a("Biome A", new b(j2));
                i2.a("Biome B", new c(j3));
                throw new cl(a2);
            }
        }
        return n3 == net.minecraft.world.biome.j.dGR.dHo || n3 == net.minecraft.world.biome.j.dGS.dHo;
    }

    protected static boolean iC(int n2) {
        return n2 == net.minecraft.world.biome.j.dGf.dHo || n2 == net.minecraft.world.biome.j.dGD.dHo || n2 == net.minecraft.world.biome.j.dGp.dHo;
    }

    protected int o(int ... nArray) {
        return nArray[this.iB(nArray.length)];
    }

    protected int C(int n2, int n3, int n4, int n5) {
        return n3 == n4 && n4 == n5 ? n3 : (n2 == n3 && n2 == n4 ? n2 : (n2 == n3 && n2 == n5 ? n2 : (n2 == n4 && n2 == n5 ? n2 : (n2 == n3 && n4 != n5 ? n2 : (n2 == n4 && n3 != n5 ? n2 : (n2 == n5 && n3 != n4 ? n2 : (n3 == n4 && n2 != n5 ? n3 : (n3 == n5 && n2 != n4 ? n3 : (n4 == n5 && n2 != n3 ? n4 : this.o(n2, n3, n4, n5))))))))));
    }
}

