/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.block.BlockFurnace;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.k;
import net.minecraft.entity.item.m;
import net.minecraft.entity.player.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class q
extends k {
    private int cCT;
    public double cCU;
    public double cCV;

    public q(w w2) {
        super(w2);
    }

    public q(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4);
    }

    @Override
    public m Wm() {
        return m.cCI;
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, new Byte(0));
    }

    @Override
    public void Dm() {
        super.Dm();
        if (this.cCT > 0) {
            --this.cCT;
        }
        if (this.cCT <= 0) {
            this.cCV = 0.0;
            this.cCU = 0.0;
        }
        this.aX(this.cCT > 0);
        if (this.YK() && this.ta.nextInt(4) == 0) {
            this.baU.a(as.dxi, this.gW, this.gX + 0.8, this.gY, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    protected double Yw() {
        return 0.2;
    }

    @Override
    public void c(ad ad2) {
        super.c(ad2);
        if (!ad2.arZ() && this.baU.Si().gw("doEntityDrops")) {
            this.a(new co(Blocks.cMn, 1), 0.0f);
        }
    }

    @Override
    protected void c(b b2, IBlockState iBlockState) {
        super.c(b2, iBlockState);
        double d2 = this.cCU * this.cCU + this.cCV * this.cCV;
        if (d2 > 1.0E-4 && this.ud * this.ud + this.uf * this.uf > 0.001) {
            d2 = bt.aD(d2);
            this.cCU /= d2;
            this.cCV /= d2;
            if (this.cCU * this.ud + this.cCV * this.uf < 0.0) {
                this.cCU = 0.0;
                this.cCV = 0.0;
            } else {
                double d3 = d2 / this.Yw();
                this.cCU *= d3;
                this.cCV *= d3;
            }
        }
    }

    @Override
    protected void Yy() {
        double d2 = this.cCU * this.cCU + this.cCV * this.cCV;
        if (d2 > 1.0E-4) {
            d2 = bt.aD(d2);
            this.cCU /= d2;
            this.cCV /= d2;
            double d3 = 1.0;
            this.ud *= (double)0.8f;
            this.ue *= 0.0;
            this.uf *= (double)0.8f;
            this.ud += this.cCU * 1.0;
            this.uf += this.cCV * 1.0;
        } else {
            this.ud *= (double)0.98f;
            this.ue *= 0.0;
            this.uf *= (double)0.98f;
        }
        super.Yy();
    }

    @Override
    public boolean o(a a2) {
        co co2 = a2.cHV.acE();
        if (co2 != null && co2.bP() == Items.cPl) {
            if (!a2.cIt.cJM && --co2.cWZ == 0) {
                a2.cHV.g(a2.cHV.cJE, null);
            }
            this.cCT += 3600;
        }
        this.cCU = this.gW - a2.gW;
        this.cCV = this.gY - a2.gY;
        return true;
    }

    @Override
    protected void d(n n2) {
        super.d(n2);
        n2.b("PushX", this.cCU);
        n2.b("PushZ", this.cCV);
        n2.a("Fuel", (short)this.cCT);
    }

    @Override
    protected void e(n n2) {
        super.e(n2);
        this.cCU = n2.eJ("PushX");
        this.cCV = n2.eJ("PushZ");
        this.cCT = n2.eF("Fuel");
    }

    protected boolean YK() {
        return (this.csD.el(16) & 1) != 0;
    }

    protected void aX(boolean bl2) {
        if (bl2) {
            this.csD.b(16, (byte)(this.csD.el(16) | 1));
        } else {
            this.csD.b(16, (byte)(this.csD.el(16) & 0xFFFFFFFE));
        }
    }

    @Override
    public IBlockState Wn() {
        return (this.YK() ? Blocks.cMo : Blocks.cMn).xM().a(BlockFurnace.aVT, net.minecraft.util.ao.dws);
    }
}

