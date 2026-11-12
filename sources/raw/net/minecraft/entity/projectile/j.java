/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.projectile;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.boss.d;
import net.minecraft.entity.projectile.c;
import net.minecraft.entity.r;
import net.minecraft.potion.a;
import net.minecraft.util.ad;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.world.f;
import net.minecraft.world.h;
import net.minecraft.world.w;

public class j
extends c {
    public j(w w2) {
        super(w2);
        this.o(0.3125f, 0.3125f);
    }

    public j(w w2, r r2, double d2, double d3, double d4) {
        super(w2, r2, d2, d3, d4);
        this.o(0.3125f, 0.3125f);
    }

    @Override
    protected float acM() {
        return this.isInvulnerable() ? 0.73f : super.acM();
    }

    public j(w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4, d5, d6, d7);
        this.o(0.3125f, 0.3125f);
    }

    @Override
    public boolean isBurning() {
        return false;
    }

    @Override
    public float a(h h2, w w2, b b2, IBlockState iBlockState) {
        float f2 = super.a(h2, w2, b2, iBlockState);
        Block block = iBlockState.df();
        if (this.isInvulnerable() && d.D(block)) {
            f2 = Math.min(0.8f, f2);
        }
        return f2;
    }

    @Override
    protected void f(ce ce2) {
        if (!this.baU.dDw) {
            if (ce2.dzw != null) {
                if (this.cKd != null) {
                    if (ce2.dzw.a(ad.ac(this.cKd), 8.0f)) {
                        if (!ce2.dzw.TS()) {
                            this.cKd.P(5.0f);
                        } else {
                            this.c(this.cKd, ce2.dzw);
                        }
                    }
                } else {
                    ce2.dzw.a(ad.dvm, 5.0f);
                }
                if (ce2.dzw instanceof r) {
                    int n2 = 0;
                    if (this.baU.agm() == f.dBT) {
                        n2 = 10;
                    } else if (this.baU.agm() == f.dBU) {
                        n2 = 40;
                    }
                    if (n2 > 0) {
                        ((r)ce2.dzw).b(new net.minecraft.potion.d(a.dgP.dhb, 20 * n2, 1));
                    }
                }
            }
            this.baU.a(this, this.gW, this.gX, this.gY, 1.0f, false, this.baU.Si().gw("mobGriefing"));
            this.Tt();
        }
    }

    @Override
    public boolean TO() {
        return false;
    }

    @Override
    public boolean a(ad ad2, float f2) {
        return false;
    }

    @Override
    protected void IA() {
        this.csD.a(10, (byte)0);
    }

    public boolean isInvulnerable() {
        return this.csD.el(10) == 1;
    }

    public void setInvulnerable(boolean bl2) {
        this.csD.b(10, (byte)(bl2 ? 1 : 0));
    }
}

