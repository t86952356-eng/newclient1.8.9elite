/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.n;
import net.minecraft.entity.player.a;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.util.as;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public abstract class h
extends j {
    protected int cti;
    protected int ctj;
    protected int ctk;
    private float ctl = -1.0f;
    private float ctm;

    public h(w w2) {
        super(w2);
    }

    public abstract h a(h var1);

    @Override
    public boolean q(a a2) {
        co co2 = a2.cHV.acE();
        if (co2 != null && co2.bP() == Items.cRN) {
            h h2;
            Class<? extends c> clazz;
            if (!this.baU.dDw && (clazz = n.eE(co2.yc())) != null && this.getClass() == clazz && (h2 = this.a(this)) != null) {
                h2.eC(-24000);
                h2.b(this.gW, this.gX, this.gY, 0.0f, 0.0f);
                this.baU.G(h2);
                if (co2.aen()) {
                    h2.ec(co2.getDisplayName());
                }
                if (!a2.cIt.cJM) {
                    --co2.cWZ;
                    if (co2.cWZ <= 0) {
                        a2.cHV.g(a2.cHV.cJE, null);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(12, (byte)0);
    }

    public int Ux() {
        return this.baU.dDw ? (int)this.csD.el(12) : this.cti;
    }

    public void m(int n2, boolean bl2) {
        int n3;
        int n4 = n3 = this.Ux();
        if ((n3 += n2 * 20) > 0) {
            n3 = 0;
            if (n4 < 0) {
                this.Uy();
            }
        }
        int n5 = n3 - n4;
        this.eC(n3);
        if (bl2) {
            this.ctj += n5;
            if (this.ctk == 0) {
                this.ctk = 40;
            }
        }
        if (this.Ux() == 0) {
            this.eC(this.ctj);
        }
    }

    public void eB(int n2) {
        this.m(n2, false);
    }

    public void eC(int n2) {
        this.csD.b(12, (byte)bt.F(n2, -1, 1));
        this.cti = n2;
        this.aH(this.Uz());
    }

    @Override
    public void d(net.minecraft.nbt.n n2) {
        super.d(n2);
        n2.B("Age", this.Ux());
        n2.B("ForcedAge", this.ctj);
    }

    @Override
    public void e(net.minecraft.nbt.n n2) {
        super.e(n2);
        this.eC(n2.eG("Age"));
        this.ctj = n2.eG("ForcedAge");
    }

    @Override
    public void Dn() {
        super.Dn();
        if (this.baU.dDw) {
            if (this.ctk > 0) {
                if (this.ctk % 4 == 0) {
                    this.baU.a(as.dxr, this.gW + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, this.gX + 0.5 + (double)(this.ta.nextFloat() * this.height), this.gY + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, 0.0, 0.0, 0.0, new int[0]);
                }
                --this.ctk;
            }
            this.aH(this.Uz());
        } else {
            int n2 = this.Ux();
            if (n2 < 0) {
                this.eC(++n2);
                if (n2 == 0) {
                    this.Uy();
                }
            } else if (n2 > 0) {
                this.eC(--n2);
            }
        }
    }

    protected void Uy() {
    }

    @Override
    public boolean Uz() {
        return this.Ux() < 0;
    }

    public void aH(boolean bl2) {
        this.aU(bl2 ? 0.5f : 1.0f);
    }

    @Override
    public final void o(float f2, float f3) {
        boolean bl2 = this.ctl > 0.0f;
        this.ctl = f2;
        this.ctm = f3;
        if (!bl2) {
            this.aU(1.0f);
        }
    }

    protected final void aU(float f2) {
        super.o(this.ctl * f2, this.ctm * f2);
    }
}

