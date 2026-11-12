/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.d;
import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class by
extends ae {
    private r ko;

    protected by(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.bGi = 1.0f;
        this.bGh = 1.0f;
        this.bGg = 1.0f;
        this.uf = 0.0;
        this.ue = 0.0;
        this.ud = 0.0;
        this.bGf = 0.0f;
        this.bGd = 30;
    }

    @Override
    public int Ir() {
        return 3;
    }

    @Override
    public void Dm() {
        super.Dm();
        if (this.ko == null) {
            net.minecraft.entity.monster.r r2 = new net.minecraft.entity.monster.r(this.baU);
            r2.Zp();
            this.ko = r2;
        }
    }

    @Override
    public void a(WorldRenderer worldRenderer, c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (this.ko != null) {
            RenderManager renderManager = d.AZ().BF();
            renderManager.I(net.minecraft.client.particle.ae.bGl, net.minecraft.client.particle.ae.bGm, net.minecraft.client.particle.ae.bGn);
            float f8 = 0.42553192f;
            float f9 = ((float)this.bGc + f2) / (float)this.bGd;
            GlStateManager.an(true);
            GlStateManager.tQ();
            GlStateManager.JE();
            GlStateManager.P(770, 771);
            float f10 = 240.0f;
            OpenGlHelper.a(OpenGlHelper.bMJ, 240.0f, 240.0f);
            GlStateManager.JV();
            float f11 = 0.05f + 0.5f * bt.bx(f9 * (float)Math.PI);
            GlStateManager.e(1.0f, 1.0f, 1.0f, f11);
            GlStateManager.j(0.0f, 1.8f, 0.0f);
            GlStateManager.d(180.0f - c2.pl, 0.0f, 1.0f, 0.0f);
            GlStateManager.d(60.0f - 150.0f * f9 - c2.pm, 1.0f, 0.0f, 0.0f);
            GlStateManager.j(0.0f, -0.4f, -1.5f);
            GlStateManager.i(0.42553192f, 0.42553192f, 0.42553192f);
            this.ko.crM = 0.0f;
            this.ko.pl = 0.0f;
            this.ko.cuH = 0.0f;
            this.ko.pn = 0.0f;
            renderManager.e(this.ko, 0.0, 0.0, 0.0, 0.0f, f2);
            GlStateManager.JW();
            GlStateManager.JE();
        }
    }
}

