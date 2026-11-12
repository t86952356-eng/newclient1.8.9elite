/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.particle.ae;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class bf
extends ae {
    protected bf(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.ud *= (double)0.3f;
        this.ue = Math.random() * (double)0.2f + (double)0.1f;
        this.uf *= (double)0.3f;
        this.bGg = 1.0f;
        this.bGh = 1.0f;
        this.bGi = 1.0f;
        this.ct(19 + this.ta.nextInt(4));
        this.o(0.01f, 0.01f);
        this.bGf = 0.06f;
        this.bGd = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        this.ue -= (double)this.bGf;
        this.y(this.ud, this.ue, this.uf);
        this.ud *= (double)0.98f;
        this.ue *= (double)0.98f;
        this.uf *= (double)0.98f;
        if (this.bGd-- <= 0) {
            this.Tt();
        }
        if (this.aO) {
            if (Math.random() < 0.5) {
                this.Tt();
            }
            this.ud *= (double)0.7f;
            this.uf *= (double)0.7f;
        }
        b b2 = new b(this);
        IBlockState iBlockState = this.baU.L(b2);
        Block block = iBlockState.df();
        block.c((l)this.baU, b2);
        Material material = iBlockState.df().xb();
        if (material.zv() || material.zw()) {
            double d2 = 0.0;
            d2 = iBlockState.df() instanceof BlockLiquid ? (double)(1.0f - BlockLiquid.bb(iBlockState.b(BlockLiquid.aWV))) : block.xs();
            double d3 = (double)bt.aF(this.gX) + d2;
            if (this.gX < d3) {
                this.Tt();
            }
        }
    }
}

