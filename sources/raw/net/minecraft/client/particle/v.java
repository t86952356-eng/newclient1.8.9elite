/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.d;
import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class v
extends ae {
    private final IBlockState bFQ;
    private b bFR;

    protected v(w w2, double d2, double d3, double d4, double d5, double d6, double d7, IBlockState iBlockState) {
        super(w2, d2, d3, d4, d5, d6, d7);
        this.bFQ = iBlockState;
        this.a(d.AZ().BE().IY().A(iBlockState));
        this.bGf = iBlockState.df().aSC;
        this.bGi = 0.6f;
        this.bGh = 0.6f;
        this.bGg = 0.6f;
        this.bGe /= 2.0f;
    }

    public v J(b b2) {
        this.bFR = b2;
        if (this.bFQ.df() == Blocks.cLe) {
            return this;
        }
        int n2 = this.bFQ.df().d((l)this.baU, b2);
        this.bGg *= (float)(n2 >> 16 & 0xFF) / 255.0f;
        this.bGh *= (float)(n2 >> 8 & 0xFF) / 255.0f;
        this.bGi *= (float)(n2 & 0xFF) / 255.0f;
        return this;
    }

    public v Iv() {
        this.bFR = new b(this.gW, this.gX, this.gY);
        Block block = this.bFQ.df();
        if (block == Blocks.cLe) {
            return this;
        }
        int n2 = block.e(this.bFQ);
        this.bGg *= (float)(n2 >> 16 & 0xFF) / 255.0f;
        this.bGh *= (float)(n2 >> 8 & 0xFF) / 255.0f;
        this.bGi *= (float)(n2 & 0xFF) / 255.0f;
        return this;
    }

    @Override
    public int Ir() {
        return 1;
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.bFY + this.bGa / 4.0f) / 16.0f;
        float f9 = f8 + 0.015609375f;
        float f10 = ((float)this.bFZ + this.bGb / 4.0f) / 16.0f;
        float f11 = f10 + 0.015609375f;
        float f12 = 0.1f * this.bGe;
        if (this.bGk != null) {
            f8 = this.bGk.al(this.bGa / 4.0f * 16.0f);
            f9 = this.bGk.al((this.bGa + 1.0f) / 4.0f * 16.0f);
            f10 = this.bGk.am(this.bGb / 4.0f * 16.0f);
            f11 = this.bGk.am((this.bGb + 1.0f) / 4.0f * 16.0f);
        }
        float f13 = (float)(this.crF + (this.gW - this.crF) * (double)f2 - bGl);
        float f14 = (float)(this.crG + (this.gX - this.crG) * (double)f2 - bGm);
        float f15 = (float)(this.crH + (this.gY - this.crH) * (double)f2 - bGn);
        int n2 = this.af(f2);
        int n3 = n2 >> 16 & 0xFFFF;
        int n4 = n2 & 0xFFFF;
        worldRenderer.F(f13 - f3 * f12 - f6 * f12, f14 - f4 * f12, f15 - f5 * f12 - f7 * f12).r(f8, f11).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(n3, n4).Lx();
        worldRenderer.F(f13 - f3 * f12 + f6 * f12, f14 + f4 * f12, f15 - f5 * f12 + f7 * f12).r(f8, f10).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(n3, n4).Lx();
        worldRenderer.F(f13 + f3 * f12 + f6 * f12, f14 + f4 * f12, f15 + f5 * f12 + f7 * f12).r(f9, f10).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(n3, n4).Lx();
        worldRenderer.F(f13 + f3 * f12 - f6 * f12, f14 - f4 * f12, f15 + f5 * f12 - f7 * f12).r(f9, f11).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(n3, n4).Lx();
    }

    @Override
    public int af(float f2) {
        int n2 = super.af(f2);
        int n3 = 0;
        if (this.baU.aJ(this.bFR)) {
            n3 = this.baU.b(this.bFR, 0);
        }
        return n2 == 0 ? n3 : n2;
    }
}

