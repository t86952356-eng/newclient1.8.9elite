/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.entity.item.k;
import net.minecraft.entity.player.a;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ah;
import net.minecraft.inventory.b;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.util.ad;
import net.minecraft.world.q;
import net.minecraft.world.w;

public abstract class o
extends k
implements net.minecraft.world.n {
    private co[] cCR = new co[36];
    private boolean cCS = true;

    public o(w w2) {
        super(w2);
    }

    public o(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4);
    }

    @Override
    public void c(ad ad2) {
        super.c(ad2);
        if (this.baU.Si().gw("doEntityDrops")) {
            ah.a(this.baU, this, (ab)this);
        }
    }

    @Override
    public co fi(int n2) {
        return this.cCR[n2];
    }

    @Override
    public co ap(int n2, int n3) {
        if (this.cCR[n2] != null) {
            if (this.cCR[n2].cWZ <= n3) {
                co co2 = this.cCR[n2];
                this.cCR[n2] = null;
                return co2;
            }
            co co3 = this.cCR[n2].ge(n3);
            if (this.cCR[n2].cWZ == 0) {
                this.cCR[n2] = null;
            }
            return co3;
        }
        return null;
    }

    @Override
    public co fj(int n2) {
        if (this.cCR[n2] != null) {
            co co2 = this.cCR[n2];
            this.cCR[n2] = null;
            return co2;
        }
        return null;
    }

    @Override
    public void g(int n2, co co2) {
        this.cCR[n2] = co2;
        if (co2 != null && co2.cWZ > this.YJ()) {
            co2.cWZ = this.YJ();
        }
    }

    @Override
    public void Lw() {
    }

    @Override
    public boolean v(a a2) {
        return !this.csb && a2.T(this) <= 64.0;
    }

    @Override
    public void w(a a2) {
    }

    @Override
    public void x(a a2) {
    }

    @Override
    public boolean h(int n2, co co2) {
        return true;
    }

    @Override
    public String xU() {
        return this.xV() ? this.Un() : "container.minecart";
    }

    @Override
    public int YJ() {
        return 64;
    }

    @Override
    public void ez(int n2) {
        this.cCS = false;
        super.ez(n2);
    }

    @Override
    public void Tt() {
        if (this.cCS) {
            ah.a(this.baU, this, (ab)this);
        }
        super.Tt();
    }

    @Override
    protected void d(n n2) {
        super.d(n2);
        v v2 = new v();
        for (int i2 = 0; i2 < this.cCR.length; ++i2) {
            if (this.cCR[i2] == null) continue;
            n n3 = new n();
            n3.a("Slot", (byte)i2);
            this.cCR[i2].t(n3);
            v2.a(n3);
        }
        n2.b("Items", v2);
    }

    @Override
    protected void e(n n2) {
        super.e(n2);
        v v2 = n2.D("Items", 10);
        this.cCR = new co[this.YI()];
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            n n3 = v2.gi(i2);
            int n4 = n3.eE("Slot") & 0xFF;
            if (n4 < 0 || n4 >= this.cCR.length) continue;
            this.cCR[n4] = co.s(n3);
        }
    }

    @Override
    public boolean o(a a2) {
        if (!this.baU.dDw) {
            a2.a(this);
        }
        return true;
    }

    @Override
    protected void Yy() {
        int n2 = 15 - b.c(this);
        float f2 = 0.98f + (float)n2 * 0.001f;
        this.ud *= (double)f2;
        this.ue *= 0.0;
        this.uf *= (double)f2;
    }

    @Override
    public int cx(int n2) {
        return 0;
    }

    @Override
    public void K(int n2, int n3) {
    }

    @Override
    public int IG() {
        return 0;
    }

    @Override
    public boolean IH() {
        return false;
    }

    @Override
    public void a(q q2) {
    }

    @Override
    public q II() {
        return q.dCy;
    }

    @Override
    public void clear() {
        for (int i2 = 0; i2 < this.cCR.length; ++i2) {
            this.cCR[i2] = null;
        }
    }
}

