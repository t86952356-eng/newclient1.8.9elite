/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.block.BlockRailBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.item.k;
import net.minecraft.entity.item.m;
import net.minecraft.entity.projectile.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.world.h;
import net.minecraft.world.w;

public class s
extends k {
    private int cCZ = -1;

    public s(w w2) {
        super(w2);
    }

    public s(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4);
    }

    @Override
    public m Wm() {
        return m.cCJ;
    }

    @Override
    public IBlockState Wn() {
        return Blocks.cLY.xM();
    }

    @Override
    public void Dm() {
        double d2;
        super.Dm();
        if (this.cCZ > 0) {
            --this.cCZ;
            this.baU.a(as.dxh, this.gW, this.gX + 0.5, this.gY, 0.0, 0.0, 0.0, new int[0]);
        } else if (this.cCZ == 0) {
            this.ar(this.ud * this.ud + this.uf * this.uf);
        }
        if (this.crR && (d2 = this.ud * this.ud + this.uf * this.uf) >= (double)0.01f) {
            this.ar(d2);
        }
    }

    @Override
    public boolean a(ad ad2, float f2) {
        a a2;
        c c2 = ad2.asf();
        if (c2 instanceof a && (a2 = (a)c2).isBurning()) {
            this.ar(a2.ud * a2.ud + a2.ue * a2.ue + a2.uf * a2.uf);
        }
        return super.a(ad2, f2);
    }

    @Override
    public void c(ad ad2) {
        super.c(ad2);
        double d2 = this.ud * this.ud + this.uf * this.uf;
        if (!ad2.arZ() && this.baU.Si().gw("doEntityDrops")) {
            this.a(new co(Blocks.cLY, 1), 0.0f);
        }
        if (ad2.ask() || ad2.arZ() || d2 >= (double)0.01f) {
            this.ar(d2);
        }
    }

    protected void ar(double d2) {
        if (!this.baU.dDw) {
            double d3 = Math.sqrt(d2);
            if (d3 > 5.0) {
                d3 = 5.0;
            }
            this.baU.a(this, this.gW, this.gX, this.gY, (float)(4.0 + this.ta.nextDouble() * 1.5 * d3), true);
            this.Tt();
        }
    }

    @Override
    public void q(float f2, float f3) {
        if (f2 >= 3.0f) {
            float f4 = f2 / 10.0f;
            this.ar(f4 * f4);
        }
        super.q(f2, f3);
    }

    @Override
    public void b(int n2, int n3, int n4, boolean bl2) {
        if (bl2 && this.cCZ < 0) {
            this.YR();
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 10) {
            this.YR();
        } else {
            super.a(by2);
        }
    }

    public void YR() {
        this.cCZ = 80;
        if (!this.baU.dDw) {
            this.baU.a((c)this, (byte)10);
            if (!this.TE()) {
                this.baU.a(this, "game.tnt.primed", 1.0f, 1.0f);
            }
        }
    }

    public int YS() {
        return this.cCZ;
    }

    public boolean YT() {
        return this.cCZ > -1;
    }

    @Override
    public float a(h h2, w w2, b b2, IBlockState iBlockState) {
        return !this.YT() || !BlockRailBase.p(iBlockState) && !BlockRailBase.P(w2, b2.aqX()) ? super.a(h2, w2, b2, iBlockState) : 0.0f;
    }

    @Override
    public boolean a(h h2, w w2, b b2, IBlockState iBlockState, float f2) {
        return (!this.YT() || !BlockRailBase.p(iBlockState) && !BlockRailBase.P(w2, b2.aqX())) && super.a(h2, w2, b2, iBlockState, f2);
    }

    @Override
    protected void e(n n2) {
        super.e(n2);
        if (n2.C("TNTFuse", 99)) {
            this.cCZ = n2.eG("TNTFuse");
        }
    }

    @Override
    protected void d(n n2) {
        super.d(n2);
        n2.B("TNTFuse", this.cCZ);
    }
}

