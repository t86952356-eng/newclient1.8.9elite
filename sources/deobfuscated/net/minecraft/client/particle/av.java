/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.entity.c;
import net.minecraft.util.cm;
import net.minecraft.world.w;

public class av
extends ae {
    private static final cm bGH = new cm("textures/entity/explosion.png");
    private static final VertexFormat bGI = new VertexFormat().a(DefaultVertexFormats.cbM).a(DefaultVertexFormats.cbO).a(DefaultVertexFormats.cbN).a(DefaultVertexFormats.cbP).a(DefaultVertexFormats.cbQ).a(DefaultVertexFormats.cbR);
    private int bGJ;
    private final int bGK;
    private final TextureManager bGL;
    private final float bGM;

    protected av(TextureManager textureManager, w w2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.bGL = textureManager;
        this.bGK = 6 + this.ta.nextInt(4);
        this.bGh = this.bGi = this.ta.nextFloat() * 0.6f + 0.4f;
        this.bGg = this.bGi;
        this.bGM = 1.0f - (float)d5 * 0.5f;
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        int n2 = (int)(((float)this.bGJ + f2) * 15.0f / (float)this.bGK);
        if (n2 <= 15) {
            this.bGL.a(bGH);
            float f8 = (float)(n2 % 4) / 4.0f;
            float f9 = f8 + 0.24975f;
            float f10 = (float)(n2 / 4) / 4.0f;
            float f11 = f10 + 0.24975f;
            float f12 = 2.0f * this.bGM;
            float f13 = (float)(this.crF + (this.gW - this.crF) * (double)f2 - bGl);
            float f14 = (float)(this.crG + (this.gX - this.crG) * (double)f2 - bGm);
            float f15 = (float)(this.crH + (this.gY - this.crH) * (double)f2 - bGn);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.JA();
            RenderHelper.Lf();
            worldRenderer.a(7, bGI);
            worldRenderer.F(f13 - f3 * f12 - f6 * f12, f14 - f4 * f12, f15 - f5 * f12 - f7 * f12).r(f9, f11).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(0, 240).n(0.0f, 1.0f, 0.0f).Lx();
            worldRenderer.F(f13 - f3 * f12 + f6 * f12, f14 + f4 * f12, f15 - f5 * f12 + f7 * f12).r(f9, f10).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(0, 240).n(0.0f, 1.0f, 0.0f).Lx();
            worldRenderer.F(f13 + f3 * f12 + f6 * f12, f14 + f4 * f12, f15 + f5 * f12 + f7 * f12).r(f8, f10).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(0, 240).n(0.0f, 1.0f, 0.0f).Lx();
            worldRenderer.F(f13 + f3 * f12 - f6 * f12, f14 - f4 * f12, f15 + f5 * f12 - f7 * f12).r(f8, f11).g(this.bGg, this.bGh, this.bGi, 1.0f).aa(0, 240).n(0.0f, 1.0f, 0.0f).Lx();
            Tessellator.Li().pZ();
            GlStateManager.Jz();
        }
    }

    @Override
    public int af(float f2) {
        return 61680;
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        ++this.bGJ;
        if (this.bGJ == this.bGK) {
            this.Tt();
        }
    }

    @Override
    public int Ir() {
        return 3;
    }
}

