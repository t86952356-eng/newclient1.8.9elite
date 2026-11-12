/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.block.Block;
import net.minecraft.entity.c;
import net.minecraft.entity.h;
import net.minecraft.entity.passive.ak;
import net.minecraft.entity.player.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public abstract class b
extends h
implements ak {
    protected Block cFA = Blocks.cLe;
    private int cFB;
    private a cFC;

    public b(w w2) {
        super(w2);
    }

    @Override
    protected void Vf() {
        if (this.Ux() != 0) {
            this.cFB = 0;
        }
        super.Vf();
    }

    @Override
    public void Dn() {
        super.Dn();
        if (this.Ux() != 0) {
            this.cFB = 0;
        }
        if (this.cFB > 0) {
            --this.cFB;
            if (this.cFB % 10 == 0) {
                double d2 = this.ta.nextGaussian() * 0.02;
                double d3 = this.ta.nextGaussian() * 0.02;
                double d4 = this.ta.nextGaussian() * 0.02;
                this.baU.a(as.dxE, this.gW + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, this.gX + 0.5 + (double)(this.ta.nextFloat() * this.height), this.gY + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, d2, d3, d4, new int[0]);
            }
        }
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        this.cFB = 0;
        return super.a(ad2, f2);
    }

    @Override
    public float ad(net.minecraft.util.b b2) {
        return this.baU.L(b2.aqY()).df() == Blocks.cLe ? 10.0f : this.baU.aR(b2) - 0.5f;
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.B("InLove", this.cFB);
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        this.cFB = n2.eG("InLove");
    }

    @Override
    public boolean UB() {
        int n2;
        int n3;
        int n4 = bt.aF(this.gW);
        net.minecraft.util.b b2 = new net.minecraft.util.b(n4, n3 = bt.aF(this.Us().dtI), n2 = bt.aF(this.gY));
        return this.baU.L(b2.aqY()).df() == this.cFA && this.baU.aO(b2) > 8 && super.UB();
    }

    @Override
    public int UY() {
        return 120;
    }

    @Override
    protected boolean Vd() {
        return false;
    }

    @Override
    protected int r(a a2) {
        return 1 + this.baU.dDk.nextInt(3);
    }

    public boolean ac(co co2) {
        return co2 != null && co2.bP() == Items.cPS;
    }

    @Override
    public boolean q(a a2) {
        co co2 = a2.cHV.acE();
        if (co2 != null) {
            if (this.ac(co2) && this.Ux() == 0 && this.cFB <= 0) {
                this.b(a2, co2);
                this.z(a2);
                return true;
            }
            if (this.Uz() && this.ac(co2)) {
                this.b(a2, co2);
                this.m((int)((float)(-this.Ux() / 20) * 0.1f), true);
                return true;
            }
        }
        return super.q(a2);
    }

    protected void b(a a2, co co2) {
        if (!a2.cIt.cJM) {
            --co2.cWZ;
            if (co2.cWZ <= 0) {
                a2.cHV.g(a2.cHV.cJE, null);
            }
        }
    }

    public void z(a a2) {
        this.cFB = 600;
        this.cFC = a2;
        this.baU.a((c)this, (byte)18);
    }

    public a ZS() {
        return this.cFC;
    }

    public boolean ZT() {
        return this.cFB > 0;
    }

    public void ZU() {
        this.cFB = 0;
    }

    public boolean a(b b2) {
        return b2 != this && b2.getClass() == this.getClass() && this.ZT() && b2.ZT();
    }

    @Override
    public void a(byte by2) {
        if (by2 == 18) {
            for (int i2 = 0; i2 < 7; ++i2) {
                double d2 = this.ta.nextGaussian() * 0.02;
                double d3 = this.ta.nextGaussian() * 0.02;
                double d4 = this.ta.nextGaussian() * 0.02;
                this.baU.a(as.dxE, this.gW + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, this.gX + 0.5 + (double)(this.ta.nextFloat() * this.height), this.gY + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, d2, d3, d4, new int[0]);
            }
        } else {
            super.a(by2);
        }
    }
}

