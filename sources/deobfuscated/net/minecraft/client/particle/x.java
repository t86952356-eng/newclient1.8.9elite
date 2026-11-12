/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.particle.ae;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class x
extends ae {
    private final Material bFS;
    private int bFT;

    protected x(w w2, double d2, double d3, double d4, Material material) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.uf = 0.0;
        this.ue = 0.0;
        this.ud = 0.0;
        if (material == Material.bev) {
            this.bGg = 0.0f;
            this.bGh = 0.0f;
            this.bGi = 1.0f;
        } else {
            this.bGg = 1.0f;
            this.bGh = 0.0f;
            this.bGi = 0.0f;
        }
        this.ct(113);
        this.o(0.01f, 0.01f);
        this.bGf = 0.06f;
        this.bFS = material;
        this.bFT = 40;
        this.bGd = (int)(64.0 / (Math.random() * 0.8 + 0.2));
        this.uf = 0.0;
        this.ue = 0.0;
        this.ud = 0.0;
    }

    @Override
    public int af(float f2) {
        return this.bFS == Material.bev ? super.af(f2) : 257;
    }

    @Override
    public float ag(float f2) {
        return this.bFS == Material.bev ? super.ag(f2) : 1.0f;
    }

    @Override
    public void Dm() {
        b b2;
        IBlockState iBlockState;
        Material material;
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        if (this.bFS == Material.bev) {
            this.bGg = 0.2f;
            this.bGh = 0.3f;
            this.bGi = 1.0f;
        } else {
            this.bGg = 1.0f;
            this.bGh = 16.0f / (float)(40 - this.bFT + 16);
            this.bGi = 4.0f / (float)(40 - this.bFT + 8);
        }
        this.ue -= (double)this.bGf;
        if (this.bFT-- > 0) {
            this.ud *= 0.02;
            this.ue *= 0.02;
            this.uf *= 0.02;
            this.ct(113);
        } else {
            this.ct(112);
        }
        this.y(this.ud, this.ue, this.uf);
        this.ud *= (double)0.98f;
        this.ue *= (double)0.98f;
        this.uf *= (double)0.98f;
        if (this.bGd-- <= 0) {
            this.Tt();
        }
        if (this.aO) {
            if (this.bFS == Material.bev) {
                this.Tt();
                this.baU.a(as.dxb, this.gW, this.gX, this.gY, 0.0, 0.0, 0.0, new int[0]);
            } else {
                this.ct(114);
            }
            this.ud *= (double)0.7f;
            this.uf *= (double)0.7f;
        }
        if ((material = (iBlockState = this.baU.L(b2 = new b(this))).df().xb()).zv() || material.zw()) {
            double d2;
            double d3 = 0.0;
            if (iBlockState.df() instanceof BlockLiquid) {
                d3 = BlockLiquid.bb(iBlockState.b(BlockLiquid.aWV));
            }
            if (this.gX < (d2 = (double)(bt.aF(this.gX) + 1) - d3)) {
                this.Tt();
            }
        }
    }
}

