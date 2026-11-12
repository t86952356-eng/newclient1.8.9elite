/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.t;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.util.a;
import net.minecraft.util.cm;
import net.minecraft.util.da;
import org.lwjgl.opengl.GL11;

public class RenderGuardian
extends RenderLiving<net.minecraft.entity.monster.r> {
    private static final cm bUW = new cm("textures/entity/guardian.png");
    private static final cm bUX = new cm("textures/entity/guardian_elder.png");
    private static final cm bUY = new cm("textures/entity/guardian_beam.png");
    int bUZ;

    public RenderGuardian(RenderManager renderManager) {
        super(renderManager, new t(), 0.5f);
        this.bUZ = ((t)this.bWL).Ha();
    }

    @Override
    public boolean a(net.minecraft.entity.monster.r r2, ICamera iCamera, double d2, double d3, double d4) {
        r r3;
        if (super.a(r2, iCamera, d2, d3, d4)) {
            return true;
        }
        if (r2.Zq() && (r3 = r2.Zr()) != null) {
            da da2 = this.a(r3, (double)r3.height * 0.5, 1.0f);
            da da3 = this.a(r2, (double)r2.getEyeHeight(), 1.0f);
            return iCamera.k(a.h(da3.dAG, da3.dAH, da3.dAI, da2.dAG, da2.dAH, da2.dAI));
        }
        return false;
    }

    private da a(r r2, double d2, float f2) {
        double d3 = r2.csh + (r2.gW - r2.csh) * (double)f2;
        double d4 = d2 + r2.csi + (r2.gX - r2.csi) * (double)f2;
        double d5 = r2.csj + (r2.gY - r2.csj) * (double)f2;
        return new da(d3, d4, d5);
    }

    @Override
    public void a(net.minecraft.entity.monster.r r2, double d2, double d3, double d4, float f2, float f3) {
        if (this.bUZ != ((t)this.bWL).Ha()) {
            this.bWL = new t();
            this.bUZ = ((t)this.bWL).Ha();
        }
        super.a(r2, d2, d3, d4, f2, f3);
        r r3 = r2.Zr();
        if (r3 != null) {
            float f4 = r2.bi(f3);
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            this.a(bUY);
            GL11.glTexParameterf((int)3553, (int)10242, (float)10497.0f);
            GL11.glTexParameterf((int)3553, (int)10243, (float)10497.0f);
            GlStateManager.JA();
            GlStateManager.JI();
            GlStateManager.tR();
            GlStateManager.an(true);
            float f5 = 240.0f;
            OpenGlHelper.a(OpenGlHelper.bMJ, 240.0f, 240.0f);
            GlStateManager.h(770, 1, 1, 0);
            float f6 = (float)r2.baU.getTotalWorldTime() + f3;
            float f7 = f6 * 0.5f % 1.0f;
            float f8 = r2.getEyeHeight();
            GlStateManager.JV();
            GlStateManager.j((float)d2, (float)d3 + f8, (float)d4);
            da da2 = this.a(r3, (double)r3.height * 0.5, f3);
            da da3 = this.a(r2, (double)f8, f3);
            da da4 = da2.v(da3);
            double d5 = da4.atS() + 1.0;
            da4 = da4.atR();
            float f9 = (float)Math.acos(da4.dAH);
            float f10 = (float)Math.atan2(da4.dAI, da4.dAG);
            GlStateManager.d((1.5707964f + -f10) * 57.295776f, 0.0f, 1.0f, 0.0f);
            GlStateManager.d(f9 * 57.295776f, 1.0f, 0.0f, 0.0f);
            boolean bl2 = true;
            double d6 = (double)f6 * 0.05 * -1.5;
            worldRenderer.a(7, DefaultVertexFormats.cbI);
            float f11 = f4 * f4;
            int n2 = 64 + (int)(f11 * 240.0f);
            int n3 = 32 + (int)(f11 * 192.0f);
            int n4 = 128 - (int)(f11 * 64.0f);
            double d7 = 0.2;
            double d8 = 0.282;
            double d9 = 0.0 + Math.cos(d6 + 2.356194490192345) * 0.282;
            double d10 = 0.0 + Math.sin(d6 + 2.356194490192345) * 0.282;
            double d11 = 0.0 + Math.cos(d6 + 0.7853981633974483) * 0.282;
            double d12 = 0.0 + Math.sin(d6 + 0.7853981633974483) * 0.282;
            double d13 = 0.0 + Math.cos(d6 + 3.9269908169872414) * 0.282;
            double d14 = 0.0 + Math.sin(d6 + 3.9269908169872414) * 0.282;
            double d15 = 0.0 + Math.cos(d6 + 5.497787143782138) * 0.282;
            double d16 = 0.0 + Math.sin(d6 + 5.497787143782138) * 0.282;
            double d17 = 0.0 + Math.cos(d6 + Math.PI) * 0.2;
            double d18 = 0.0 + Math.sin(d6 + Math.PI) * 0.2;
            double d19 = 0.0 + Math.cos(d6 + 0.0) * 0.2;
            double d20 = 0.0 + Math.sin(d6 + 0.0) * 0.2;
            double d21 = 0.0 + Math.cos(d6 + 1.5707963267948966) * 0.2;
            double d22 = 0.0 + Math.sin(d6 + 1.5707963267948966) * 0.2;
            double d23 = 0.0 + Math.cos(d6 + 4.71238898038469) * 0.2;
            double d24 = 0.0 + Math.sin(d6 + 4.71238898038469) * 0.2;
            double d25 = 0.0;
            double d26 = 0.4999;
            double d27 = -1.0f + f7;
            double d28 = d5 * 2.5 + d27;
            worldRenderer.F(d17, d5, d18).r(0.4999, d28).s(n2, n3, n4, 255).Lx();
            worldRenderer.F(d17, 0.0, d18).r(0.4999, d27).s(n2, n3, n4, 255).Lx();
            worldRenderer.F(d19, 0.0, d20).r(0.0, d27).s(n2, n3, n4, 255).Lx();
            worldRenderer.F(d19, d5, d20).r(0.0, d28).s(n2, n3, n4, 255).Lx();
            worldRenderer.F(d21, d5, d22).r(0.4999, d28).s(n2, n3, n4, 255).Lx();
            worldRenderer.F(d21, 0.0, d22).r(0.4999, d27).s(n2, n3, n4, 255).Lx();
            worldRenderer.F(d23, 0.0, d24).r(0.0, d27).s(n2, n3, n4, 255).Lx();
            worldRenderer.F(d23, d5, d24).r(0.0, d28).s(n2, n3, n4, 255).Lx();
            double d29 = 0.0;
            if (r2.aRg % 2 == 0) {
                d29 = 0.5;
            }
            worldRenderer.F(d9, d5, d10).r(0.5, d29 + 0.5).s(n2, n3, n4, 255).Lx();
            worldRenderer.F(d11, d5, d12).r(1.0, d29 + 0.5).s(n2, n3, n4, 255).Lx();
            worldRenderer.F(d15, d5, d16).r(1.0, d29).s(n2, n3, n4, 255).Lx();
            worldRenderer.F(d13, d5, d14).r(0.5, d29).s(n2, n3, n4, 255).Lx();
            tessellator.pZ();
            GlStateManager.JW();
        }
    }

    @Override
    protected void a(net.minecraft.entity.monster.r r2, float f2) {
        if (r2.Zo()) {
            GlStateManager.i(2.35f, 2.35f, 2.35f);
        }
    }

    protected cm a(net.minecraft.entity.monster.r r2) {
        return r2.Zo() ? bUX : bUW;
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.a((net.minecraft.entity.monster.r)r2, f2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((net.minecraft.entity.monster.r)c2);
    }
}

