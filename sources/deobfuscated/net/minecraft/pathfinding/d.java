/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.pathfinding;

import java.util.List;
import net.minecraft.entity.ai.attributes.e;
import net.minecraft.entity.aj;
import net.minecraft.entity.p;
import net.minecraft.pathfinding.b;
import net.minecraft.pathfinding.c;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import net.minecraft.world.a;
import net.minecraft.world.l;
import net.minecraft.world.w;

public abstract class d {
    protected p cxk;
    protected w baU;
    protected b dga;
    protected double LL;
    private final e dgb;
    private int dgc;
    private int dgd;
    private da dge = new da(0.0, 0.0, 0.0);
    private float dgf = 1.0f;
    private final c dgg;

    public d(p p2, w w2) {
        this.cxk = p2;
        this.baU = w2;
        this.dgb = p2.a(aj.cwn);
        this.dgg = this.aiF();
    }

    protected abstract c aiF();

    public void setSpeed(double d2) {
        this.LL = d2;
    }

    public float aiG() {
        return (float)this.dgb.XB();
    }

    public final b V(double d2, double d3, double d4) {
        return this.al(new net.minecraft.util.b(bt.aF(d2), (int)d3, bt.aF(d4)));
    }

    public b al(net.minecraft.util.b b2) {
        if (!this.aiN()) {
            return null;
        }
        float f2 = this.aiG();
        this.baU.dDt.eY("pathfind");
        net.minecraft.util.b b3 = new net.minecraft.util.b(this.cxk);
        int n2 = (int)(f2 + 8.0f);
        a a2 = new a(this.baU, b3.C(-n2, -n2, -n2), b3.C(n2, n2, n2), 0);
        b b4 = this.dgg.a((l)a2, (net.minecraft.entity.c)this.cxk, b2, f2);
        this.baU.dDt.ajv();
        return b4;
    }

    public boolean n(double d2, double d3, double d4, double d5) {
        b b2 = this.V(bt.aF(d2), (int)d3, bt.aF(d4));
        return this.a(b2, d5);
    }

    public void bw(float f2) {
        this.dgf = f2;
    }

    public b au(net.minecraft.entity.c c2) {
        if (!this.aiN()) {
            return null;
        }
        float f2 = this.aiG();
        this.baU.dDt.eY("pathfind");
        net.minecraft.util.b b2 = new net.minecraft.util.b(this.cxk).aqX();
        int n2 = (int)(f2 + 16.0f);
        a a2 = new a(this.baU, b2.C(-n2, -n2, -n2), b2.C(n2, n2, n2), 0);
        b b3 = this.dgg.a((l)a2, (net.minecraft.entity.c)this.cxk, c2, f2);
        this.baU.dDt.ajv();
        return b3;
    }

    public boolean e(net.minecraft.entity.c c2, double d2) {
        b b2 = this.au(c2);
        return b2 != null && this.a(b2, d2);
    }

    public boolean a(b b2, double d2) {
        if (b2 == null) {
            this.dga = null;
            return false;
        }
        if (!b2.a(this.dga)) {
            this.dga = b2;
        }
        this.aiP();
        if (this.dga.aiD() == 0) {
            return false;
        }
        this.LL = d2;
        da da2 = this.aiM();
        this.dgd = this.dgc;
        this.dge = da2;
        return true;
    }

    public b aiH() {
        return this.dga;
    }

    public void aiI() {
        ++this.dgc;
        if (!this.aiK()) {
            Object object;
            da da2;
            if (this.aiN()) {
                this.aiJ();
            } else if (this.dga != null && this.dga.aiE() < this.dga.aiD()) {
                da2 = this.aiM();
                object = this.dga.d(this.cxk, this.dga.aiE());
                if (da2.dAH > ((da)object).dAH && !this.cxk.aO && bt.aF(da2.dAG) == bt.aF(((da)object).dAG) && bt.aF(da2.dAI) == bt.aF(((da)object).dAI)) {
                    this.dga.gI(this.dga.aiE() + 1);
                }
            }
            if (!this.aiK() && (da2 = this.dga.at(this.cxk)) != null) {
                object = new net.minecraft.util.a(da2.dAG, da2.dAH, da2.dAI, da2.dAG, da2.dAH, da2.dAI).ad(0.5, 0.5, 0.5);
                List<net.minecraft.util.a> list = this.baU.a((net.minecraft.entity.c)this.cxk, ((net.minecraft.util.a)object).ac(0.0, -1.0, 0.0));
                double d2 = -1.0;
                object = ((net.minecraft.util.a)object).ae(0.0, 1.0, 0.0);
                for (net.minecraft.util.a a2 : list) {
                    d2 = a2.b((net.minecraft.util.a)object, d2);
                }
                this.cxk.US().k(da2.dAG, da2.dAH + d2, da2.dAI, this.LL);
            }
        }
    }

    protected void aiJ() {
        int n2;
        da da2 = this.aiM();
        int n3 = this.dga.aiD();
        for (int i2 = this.dga.aiE(); i2 < this.dga.aiD(); ++i2) {
            if (this.dga.gG((int)i2).dgl == (int)da2.dAH) continue;
            n3 = i2;
            break;
        }
        float f2 = this.cxk.width * this.cxk.width * this.dgf;
        for (n2 = this.dga.aiE(); n2 < n3; ++n2) {
            da da3 = this.dga.d(this.cxk, n2);
            if (!(da2.y(da3) < (double)f2)) continue;
            this.dga.gI(n2 + 1);
        }
        n2 = bt.bM(this.cxk.width);
        int n4 = (int)this.cxk.height + 1;
        int n5 = n2;
        for (int i3 = n3 - 1; i3 >= this.dga.aiE(); --i3) {
            if (!this.a(da2, this.dga.d(this.cxk, i3), n2, n4, n5)) continue;
            this.dga.gI(i3);
            break;
        }
        this.n(da2);
    }

    protected void n(da da2) {
        if (this.dgc - this.dgd > 100) {
            if (da2.y(this.dge) < 2.25) {
                this.aiL();
            }
            this.dgd = this.dgc;
            this.dge = da2;
        }
    }

    public boolean aiK() {
        return this.dga == null || this.dga.kM();
    }

    public void aiL() {
        this.dga = null;
    }

    protected abstract da aiM();

    protected abstract boolean aiN();

    protected boolean aiO() {
        return this.cxk.isInWater() || this.cxk.isInLava();
    }

    protected void aiP() {
    }

    protected abstract boolean a(da var1, da var2, int var3, int var4, int var5);
}

