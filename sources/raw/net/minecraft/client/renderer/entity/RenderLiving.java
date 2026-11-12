/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.c;
import net.minecraft.entity.l;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.src.a;
import net.optifine.shaders.ah;

public abstract class RenderLiving<T extends p>
extends RendererLivingEntity<T> {
    public RenderLiving(RenderManager renderManager, d d2, float f2) {
        super(renderManager, d2, f2);
    }

    @Override
    protected boolean b(T t2) {
        return super.F(t2) && (((r)t2).Up() || ((c)t2).xV() && t2 == this.bUl.bgM);
    }

    @Override
    public boolean a(T t2, ICamera iCamera, double d2, double d3, double d4) {
        if (super.a(t2, iCamera, d2, d3, d4)) {
            return true;
        }
        if (((p)t2).Vq() && ((p)t2).Vr() != null) {
            c c2 = ((p)t2).Vr();
            return iCamera.k(c2.Us());
        }
        return false;
    }

    @Override
    public void a(T t2, double d2, double d3, double d4, float f2, float f3) {
        super.a(t2, d2, d3, d4, f2, f3);
        this.b(t2, d2, d3, d4, f2, f3);
    }

    public void a(T t2, float f2) {
        int n2 = ((c)t2).af(f2);
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        OpenGlHelper.a(OpenGlHelper.bMJ, (float)n3 / 1.0f, (float)n4 / 1.0f);
    }

    private double H(double d2, double d3, double d4) {
        return d2 + (d3 - d2) * d4;
    }

    protected void b(T t2, double d2, double d3, double d4, float f2, float f3) {
        c c2;
        if (!(a.aoG() && ah.eye || (c2 = ((p)t2).Vr()) == null)) {
            float f4;
            float f5;
            float f6;
            float f7;
            int n2;
            d3 -= (1.6 - (double)((p)t2).height) * 0.5;
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            double d5 = this.H(c2.crM, c2.pl, f3 * 0.5f) * 0.01745329238474369;
            double d6 = this.H(c2.crO, c2.pm, f3 * 0.5f) * 0.01745329238474369;
            double d7 = Math.cos(d5);
            double d8 = Math.sin(d5);
            double d9 = Math.sin(d6);
            if (c2 instanceof l) {
                d7 = 0.0;
                d8 = 0.0;
                d9 = -1.0;
            }
            double d10 = Math.cos(d6);
            double d11 = this.H(c2.crF, c2.gW, f3) - d7 * 0.7 - d8 * 0.5 * d10;
            double d12 = this.H(c2.crG + (double)c2.getEyeHeight() * 0.7, c2.gX + (double)c2.getEyeHeight() * 0.7, f3) - d9 * 0.5 - 0.25;
            double d13 = this.H(c2.crH, c2.gY, f3) - d8 * 0.7 + d7 * 0.5 * d10;
            double d14 = this.H(((p)t2).cuG, ((p)t2).cuF, f3) * 0.01745329238474369 + 1.5707963267948966;
            d7 = Math.cos(d14) * (double)((p)t2).width * 0.4;
            d8 = Math.sin(d14) * (double)((p)t2).width * 0.4;
            double d15 = this.H(((p)t2).crF, ((p)t2).gW, f3) + d7;
            double d16 = this.H(((p)t2).crG, ((p)t2).gX, f3);
            double d17 = this.H(((p)t2).crH, ((p)t2).gY, f3) + d8;
            d2 += d7;
            d4 += d8;
            double d18 = (float)(d11 - d15);
            double d19 = (float)(d12 - d16);
            double d20 = (float)(d13 - d17);
            GlStateManager.JO();
            GlStateManager.JA();
            GlStateManager.JI();
            if (a.aoG()) {
                ah.aGw();
            }
            int n3 = 24;
            double d21 = 0.025;
            worldRenderer.a(5, DefaultVertexFormats.cbF);
            for (n2 = 0; n2 <= 24; ++n2) {
                f7 = 0.5f;
                f6 = 0.4f;
                f5 = 0.3f;
                if (n2 % 2 == 0) {
                    f7 *= 0.7f;
                    f6 *= 0.7f;
                    f5 *= 0.7f;
                }
                f4 = (float)n2 / 24.0f;
                worldRenderer.F(d2 + d18 * (double)f4 + 0.0, d3 + d19 * (double)(f4 * f4 + f4) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f), d4 + d20 * (double)f4).g(f7, f6, f5, 1.0f).Lx();
                worldRenderer.F(d2 + d18 * (double)f4 + 0.025, d3 + d19 * (double)(f4 * f4 + f4) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f) + 0.025, d4 + d20 * (double)f4).g(f7, f6, f5, 1.0f).Lx();
            }
            tessellator.pZ();
            worldRenderer.a(5, DefaultVertexFormats.cbF);
            for (n2 = 0; n2 <= 24; ++n2) {
                f7 = 0.5f;
                f6 = 0.4f;
                f5 = 0.3f;
                if (n2 % 2 == 0) {
                    f7 *= 0.7f;
                    f6 *= 0.7f;
                    f5 *= 0.7f;
                }
                f4 = (float)n2 / 24.0f;
                worldRenderer.F(d2 + d18 * (double)f4 + 0.0, d3 + d19 * (double)(f4 * f4 + f4) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f) + 0.025, d4 + d20 * (double)f4).g(f7, f6, f5, 1.0f).Lx();
                worldRenderer.F(d2 + d18 * (double)f4 + 0.025, d3 + d19 * (double)(f4 * f4 + f4) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f), d4 + d20 * (double)f4 + 0.025).g(f7, f6, f5, 1.0f).Lx();
            }
            tessellator.pZ();
            if (a.aoG()) {
                ah.aGx();
            }
            GlStateManager.Jz();
            GlStateManager.JN();
            GlStateManager.JH();
        }
    }

    @Override
    protected /* synthetic */ boolean F(r r2) {
        return this.b((p)r2);
    }

    @Override
    protected /* synthetic */ boolean M(c c2) {
        return this.b((p)c2);
    }
}

