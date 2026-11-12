/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.effect;

import java.util.List;
import net.minecraft.block.material.Material;
import net.minecraft.entity.c;
import net.minecraft.entity.effect.b;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.world.f;
import net.minecraft.world.w;

public class a
extends b {
    private int cBA;
    public long cBB;
    private int cBC;

    public a(w w2, double d2, double d3, double d4) {
        super(w2);
        this.b(d2, d3, d4, 0.0f, 0.0f);
        this.cBA = 2;
        this.cBB = this.ta.nextLong();
        this.cBC = this.ta.nextInt(3) + 1;
        net.minecraft.util.b b2 = new net.minecraft.util.b(this);
        if (!w2.dDw && w2.Si().gw("doFireTick") && (w2.agm() == f.dBT || w2.agm() == f.dBU) && w2.f(b2, 10)) {
            if (w2.L(b2).df().xb() == Material.beo && Blocks.cMd.d(w2, b2)) {
                w2.d(b2, Blocks.cMd.xM());
            }
            for (int i2 = 0; i2 < 4; ++i2) {
                net.minecraft.util.b b3 = b2.C(this.ta.nextInt(3) - 1, this.ta.nextInt(3) - 1, this.ta.nextInt(3) - 1);
                if (w2.L(b3).df().xb() != Material.beo || !Blocks.cMd.d(w2, b3)) continue;
                w2.d(b3, Blocks.cMd.xM());
            }
        }
    }

    @Override
    public void Dm() {
        super.Dm();
        if (this.cBA == 2) {
            this.baU.a(this.gW, this.gX, this.gY, "ambient.weather.thunder", 10000.0f, 0.8f + this.ta.nextFloat() * 0.2f);
            this.baU.a(this.gW, this.gX, this.gY, "random.explode", 2.0f, 0.5f + this.ta.nextFloat() * 0.2f);
        }
        --this.cBA;
        if (this.cBA < 0) {
            if (this.cBC == 0) {
                this.Tt();
            } else if (this.cBA < -this.ta.nextInt(10)) {
                --this.cBC;
                this.cBA = 1;
                this.cBB = this.ta.nextLong();
                net.minecraft.util.b b2 = new net.minecraft.util.b(this);
                if (!this.baU.dDw && this.baU.Si().gw("doFireTick") && this.baU.f(b2, 10) && this.baU.L(b2).df().xb() == Material.beo && Blocks.cMd.d(this.baU, b2)) {
                    this.baU.d(b2, Blocks.cMd.xM());
                }
            }
        }
        if (this.cBA >= 0) {
            if (this.baU.dDw) {
                this.baU.if(2);
            } else {
                double d2 = 3.0;
                List<c> list = this.baU.b(this, new net.minecraft.util.a(this.gW - 3.0, this.gX - 3.0, this.gY - 3.0, this.gW + 3.0, this.gX + 6.0 + 3.0, this.gY + 3.0));
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    c c2 = list.get(i2);
                    c2.b(this);
                }
            }
        }
    }

    @Override
    protected void IA() {
    }

    @Override
    protected void e(n n2) {
    }

    @Override
    protected void d(n n2) {
    }
}

