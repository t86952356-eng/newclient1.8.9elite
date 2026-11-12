/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.projectile;

import java.util.List;
import net.minecraft.entity.projectile.i;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.potion.d;
import net.minecraft.util.a;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.world.w;

public class f
extends i {
    private co cKC;

    public f(w w2) {
        super(w2);
    }

    public f(w w2, r r2, int n2) {
        this(w2, r2, new co(Items.cRD, 1, n2));
    }

    public f(w w2, r r2, co co2) {
        super(w2, r2);
        this.cKC = co2;
    }

    public f(w w2, double d2, double d3, double d4, int n2) {
        this(w2, d2, d3, d4, new co(Items.cRD, 1, n2));
    }

    public f(w w2, double d2, double d3, double d4, co co2) {
        super(w2, d2, d3, d4);
        this.cKC = co2;
    }

    @Override
    protected float Yd() {
        return 0.05f;
    }

    @Override
    protected float Ye() {
        return 0.5f;
    }

    @Override
    protected float Yf() {
        return -20.0f;
    }

    public void fL(int n2) {
        if (this.cKC == null) {
            this.cKC = new co(Items.cRD, 1, 0);
        }
        this.cKC.gf(n2);
    }

    public int acQ() {
        if (this.cKC == null) {
            this.cKC = new co(Items.cRD, 1, 0);
        }
        return this.cKC.yc();
    }

    @Override
    protected void f(ce ce2) {
        if (!this.baU.dDw) {
            a a2;
            List<r> list;
            List<d> list2 = Items.cRD.aH(this.cKC);
            if (list2 != null && !list2.isEmpty() && !(list = this.baU.a(r.class, a2 = this.Us().ad(4.0, 2.0, 4.0))).isEmpty()) {
                for (r r2 : list) {
                    double d2 = this.T(r2);
                    if (!(d2 < 16.0)) continue;
                    double d3 = 1.0 - Math.sqrt(d2) / 4.0;
                    if (r2 == ce2.dzw) {
                        d3 = 1.0;
                    }
                    for (d d4 : list2) {
                        int n2 = d4.aje();
                        if (net.minecraft.potion.a.dgt[n2].aiW()) {
                            net.minecraft.potion.a.dgt[n2].a(this, this.acR(), r2, d4.ajf(), d3);
                            continue;
                        }
                        int n3 = (int)(d3 * (double)d4.getDuration() + 0.5);
                        if (n3 <= 20) continue;
                        r2.b(new d(n2, n3, d4.ajf()));
                    }
                }
            }
            this.baU.e(2002, new b(this), this.acQ());
            this.Tt();
        }
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        if (n2.C("Potion", 10)) {
            this.cKC = co.s(n2.eN("Potion"));
        } else {
            this.fL(n2.eG("potionValue"));
        }
        if (this.cKC == null) {
            this.Tt();
        }
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        if (this.cKC != null) {
            n2.b("Potion", this.cKC.t(new n()));
        }
    }
}

