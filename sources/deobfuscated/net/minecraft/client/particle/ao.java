/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.c;
import net.minecraft.util.b;
import net.minecraft.util.cm;
import net.minecraft.world.w;

public class ao
extends ae {
    private static final cm bGA = new cm("textures/particle/footprint.png");
    private int bGB;
    private final int bGC;
    private final TextureManager bGD;

    protected ao(TextureManager textureManager, w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.bGD = textureManager;
        this.uf = 0.0;
        this.ue = 0.0;
        this.ud = 0.0;
        this.bGC = 200;
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        float f9 = ((float)this.bGB + f2) / (float)this.bGC;
        if ((f8 = 2.0f - (f9 *= f9) * 2.0f) > 1.0f) {
            f8 = 1.0f;
        }
        f8 *= 0.2f;
        GlStateManager.JA();
        float f10 = 0.125f;
        float f11 = (float)(this.gW - bGl);
        float f12 = (float)(this.gX - bGm);
        float f13 = (float)(this.gY - bGn);
        float f14 = this.baU.aR(new b(this));
        this.bGD.a(bGA);
        GlStateManager.tQ();
        GlStateManager.P(770, 771);
        worldRenderer.a(7, DefaultVertexFormats.cbI);
        worldRenderer.F(f11 - 0.125f, f12, f13 + 0.125f).r(0.0, 1.0).g(f14, f14, f14, f8).Lx();
        worldRenderer.F(f11 + 0.125f, f12, f13 + 0.125f).r(1.0, 1.0).g(f14, f14, f14, f8).Lx();
        worldRenderer.F(f11 + 0.125f, f12, f13 - 0.125f).r(1.0, 0.0).g(f14, f14, f14, f8).Lx();
        worldRenderer.F(f11 - 0.125f, f12, f13 - 0.125f).r(0.0, 0.0).g(f14, f14, f14, f8).Lx();
        Tessellator.Li().pZ();
        GlStateManager.tR();
        GlStateManager.Jz();
    }

    @Override
    public void Dm() {
        ++this.bGB;
        if (this.bGB == this.bGC) {
            this.Tt();
        }
    }

    @Override
    public int Ir() {
        return 3;
    }
}

