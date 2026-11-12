/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer.entity;

import hackclient.rise.agg;
import net.minecraft.block.Block;
import net.minecraft.client.d;
import net.minecraft.client.model.f;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.c;
import net.minecraft.entity.p;
import net.minecraft.src.a;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.minecraft.world.w;
import net.optifine.entity.model.g;
import net.optifine.shaders.ah;
import org.lwjgl.opengl.GL11;

public abstract class Render<T extends c>
implements g {
    private static final cm bUk = new cm("textures/misc/shadow.png");
    protected final RenderManager bUl;
    public float bUm;
    protected float bUn = 1.0f;
    private Class bUo = null;
    private cm bUp = null;

    protected Render(RenderManager renderManager) {
        this.bUl = renderManager;
    }

    public boolean a(T t2, ICamera iCamera, double d2, double d3, double d4) {
        net.minecraft.util.a a2 = ((c)t2).Us();
        if (a2.aqW() || a2.aqV() == 0.0) {
            a2 = new net.minecraft.util.a(((c)t2).gW - 2.0, ((c)t2).gX - 2.0, ((c)t2).gY - 2.0, ((c)t2).gW + 2.0, ((c)t2).gX + 2.0, ((c)t2).gY + 2.0);
        }
        double d5 = 0.1 + (double)((c)t2).TX();
        a2 = a2.ad(d5, d5, d5);
        return ((c)t2).O(d2, d3, d4) && (((c)t2).csK || iCamera.k(a2));
    }

    public void a(T t2, double d2, double d3, double d4, float f2, float f3) {
        if (((c)t2).crQ) {
            this.a(t2, d2, d3, d4);
        }
    }

    protected void a(T t2, double d2, double d3, double d4) {
        if (this.M(t2)) {
            this.a(t2, ((c)t2).xW().getFormattedText(), d2, d3, d4);
        }
    }

    protected boolean M(T t2) {
        return ((c)t2).Up() && ((c)t2).xV();
    }

    protected void a(T t2, double d2, double d3, double d4, String string, float f2, double d5) {
        this.a(t2, string, d2, d3, d4);
    }

    protected abstract cm L(T var1);

    protected boolean N(T t2) {
        cm cm2 = this.L(t2);
        if (this.bUp != null) {
            cm2 = this.bUp;
        }
        if (cm2 == null) {
            return false;
        }
        this.a(cm2);
        return true;
    }

    public void a(cm cm2) {
        this.bUl.aIK.a(cm2);
    }

    public void dz(int n2) {
        this.bUl.aIK.dz(n2);
    }

    private void a(c c2, double d2, double d3, double d4, float f2) {
        GlStateManager.JA();
        TextureMap textureMap = d.AZ().Bu();
        TextureAtlasSprite textureAtlasSprite = textureMap.dq("minecraft:blocks/fire_layer_0");
        TextureAtlasSprite textureAtlasSprite2 = textureMap.dq("minecraft:blocks/fire_layer_1");
        GlStateManager.JV();
        GlStateManager.j((float)d2, (float)d3, (float)d4);
        float f3 = c2.width * 1.4f;
        GlStateManager.i(f3, f3, f3);
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = c2.height / f3;
        float f7 = (float)(c2.gX - c2.Us().dtI);
        GlStateManager.d(-this.bUl.bVE, 0.0f, 1.0f, 0.0f);
        GlStateManager.j(0.0f, 0.0f, -0.3f + (float)((int)f6) * 0.02f);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        float f8 = 0.0f;
        int n2 = 0;
        boolean bl2 = a.LE();
        if (bl2) {
            worldRenderer.d(av.dxV);
        }
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        while (f6 > 0.0f) {
            TextureAtlasSprite textureAtlasSprite3 = n2 % 2 == 0 ? textureAtlasSprite : textureAtlasSprite2;
            worldRenderer.c(textureAtlasSprite3);
            this.a(TextureMap.bZE);
            float f9 = textureAtlasSprite3.NY();
            float f10 = textureAtlasSprite3.Oa();
            float f11 = textureAtlasSprite3.NZ();
            float f12 = textureAtlasSprite3.Ob();
            if (n2 / 2 % 2 == 0) {
                float f13 = f11;
                f11 = f9;
                f9 = f13;
            }
            worldRenderer.F(f4 - 0.0f, 0.0f - f7, f8).r(f11, f12).Lx();
            worldRenderer.F(-f4 - 0.0f, 0.0f - f7, f8).r(f9, f12).Lx();
            worldRenderer.F(-f4 - 0.0f, 1.4f - f7, f8).r(f9, f10).Lx();
            worldRenderer.F(f4 - 0.0f, 1.4f - f7, f8).r(f11, f10).Lx();
            f6 -= 0.45f;
            f7 -= 0.45f;
            f4 *= 0.9f;
            f8 += 0.03f;
            ++n2;
        }
        tessellator.pZ();
        if (bl2) {
            worldRenderer.d(null);
            GlStateManager.Kb();
        }
        GlStateManager.JW();
        GlStateManager.Jz();
    }

    private void b(c c2, double d2, double d3, double d4, float f2, float f3) {
        if (!a.aoG() || !ah.eBC) {
            GlStateManager.tQ();
            GlStateManager.P(770, 771);
            this.bUl.aIK.a(bUk);
            w w2 = this.Nm();
            GlStateManager.an(false);
            float f4 = this.bUm;
            if (c2 instanceof p) {
                p p2 = (p)c2;
                f4 *= p2.Vi();
                if (p2.Uz()) {
                    f4 *= 0.5f;
                }
            }
            double d5 = c2.csh + (c2.gW - c2.csh) * (double)f3;
            double d6 = c2.csi + (c2.gX - c2.csi) * (double)f3;
            double d7 = c2.csj + (c2.gY - c2.csj) * (double)f3;
            int n2 = bt.aF(d5 - (double)f4);
            int n3 = bt.aF(d5 + (double)f4);
            int n4 = bt.aF(d6 - (double)f4);
            int n5 = bt.aF(d6);
            int n6 = bt.aF(d7 - (double)f4);
            int n7 = bt.aF(d7 + (double)f4);
            double d8 = d2 - d5;
            double d9 = d3 - d6;
            double d10 = d4 - d7;
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            worldRenderer.a(7, DefaultVertexFormats.cbI);
            for (b b2 : b.c(new b(n2, n4, n6), new b(n3, n5, n7))) {
                Block block = w2.L(b2.aqY()).df();
                if (block.xg() == -1 || w2.aP(b2) <= 3) continue;
                this.a(block, d2, d3, d4, b2, f2, f4, d8, d9, d10);
            }
            tessellator.pZ();
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.tR();
            GlStateManager.an(true);
        }
    }

    private w Nm() {
        return this.bUl.baU;
    }

    private void a(Block block, double d2, double d3, double d4, b b2, float f2, float f3, double d5, double d6, double d7) {
        if (block.xf()) {
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            double d8 = ((double)f2 - (d3 - ((double)b2.wu() + d6)) / 2.0) * 0.5 * (double)this.Nm().aR(b2);
            if (d8 >= 0.0) {
                if (d8 > 1.0) {
                    d8 = 1.0;
                }
                double d9 = (double)b2.wt() + block.xp() + d5;
                double d10 = (double)b2.wt() + block.xq() + d5;
                double d11 = (double)b2.wu() + block.xr() + d6 + 0.015625;
                double d12 = (double)b2.wx() + block.xt() + d7;
                double d13 = (double)b2.wx() + block.xu() + d7;
                float f4 = (float)((d2 - d9) / 2.0 / (double)f3 + 0.5);
                float f5 = (float)((d2 - d10) / 2.0 / (double)f3 + 0.5);
                float f6 = (float)((d4 - d12) / 2.0 / (double)f3 + 0.5);
                float f7 = (float)((d4 - d13) / 2.0 / (double)f3 + 0.5);
                worldRenderer.F(d9, d11, d12).r(f4, f6).g(1.0f, 1.0f, 1.0f, (float)d8).Lx();
                worldRenderer.F(d9, d11, d13).r(f4, f7).g(1.0f, 1.0f, 1.0f, (float)d8).Lx();
                worldRenderer.F(d10, d11, d13).r(f5, f7).g(1.0f, 1.0f, 1.0f, (float)d8).Lx();
                worldRenderer.F(d10, d11, d12).r(f5, f6).g(1.0f, 1.0f, 1.0f, (float)d8).Lx();
            }
        }
    }

    public static void b(net.minecraft.util.a a2, double d2, double d3, double d4) {
        GlStateManager.JO();
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        worldRenderer.G(d2, d3, d4);
        worldRenderer.a(7, DefaultVertexFormats.cbH);
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtJ).n(0.0f, 0.0f, -1.0f).Lx();
        worldRenderer.F(a2.dtK, a2.dtL, a2.dtJ).n(0.0f, 0.0f, -1.0f).Lx();
        worldRenderer.F(a2.dtK, a2.dtI, a2.dtJ).n(0.0f, 0.0f, -1.0f).Lx();
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtJ).n(0.0f, 0.0f, -1.0f).Lx();
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtM).n(0.0f, 0.0f, 1.0f).Lx();
        worldRenderer.F(a2.dtK, a2.dtI, a2.dtM).n(0.0f, 0.0f, 1.0f).Lx();
        worldRenderer.F(a2.dtK, a2.dtL, a2.dtM).n(0.0f, 0.0f, 1.0f).Lx();
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtM).n(0.0f, 0.0f, 1.0f).Lx();
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtJ).n(0.0f, -1.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtK, a2.dtI, a2.dtJ).n(0.0f, -1.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtK, a2.dtI, a2.dtM).n(0.0f, -1.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtM).n(0.0f, -1.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtM).n(0.0f, 1.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtK, a2.dtL, a2.dtM).n(0.0f, 1.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtK, a2.dtL, a2.dtJ).n(0.0f, 1.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtJ).n(0.0f, 1.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtM).n(-1.0f, 0.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtM).n(-1.0f, 0.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtJ).n(-1.0f, 0.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtJ).n(-1.0f, 0.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtK, a2.dtI, a2.dtJ).n(1.0f, 0.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtK, a2.dtL, a2.dtJ).n(1.0f, 0.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtK, a2.dtL, a2.dtM).n(1.0f, 0.0f, 0.0f).Lx();
        worldRenderer.F(a2.dtK, a2.dtI, a2.dtM).n(1.0f, 0.0f, 0.0f).Lx();
        tessellator.pZ();
        worldRenderer.G(0.0, 0.0, 0.0);
        GlStateManager.JN();
    }

    public void c(c c2, double d2, double d3, double d4, float f2, float f3) {
        if (this.bUl.bjA != null) {
            double d5;
            float f4;
            if (this.bUl.bjA.chk && this.bUm > 0.0f && !c2.isInvisible() && this.bUl.Nv() && (f4 = (float)((1.0 - (d5 = this.bUl.J(c2.gW, c2.gX, c2.gY)) / 256.0) * (double)this.bUn)) > 0.0f) {
                this.b(c2, d2, d3, d4, f4, f3);
            }
            if (!(!c2.Uk() || c2 instanceof net.minecraft.entity.player.a && ((net.minecraft.entity.player.a)c2).CZ())) {
                this.a(c2, d2, d3, d4, f3);
            }
        }
    }

    public agg Nn() {
        return this.bUl.EA();
    }

    protected void a(T t2, String string, double d2, double d3, double d4) {
        double d5 = ((c)t2).T(this.bUl.bVD);
        if (d5 <= 625.0) {
            agg agg2 = this.Nn();
            float f2 = 1.6f;
            float f3 = 0.02666667f;
            GlStateManager.JV();
            GlStateManager.j((float)d2 + 0.0f, (float)d3 + ((c)t2).height + 0.5f, (float)d4);
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            GlStateManager.d(-this.bUl.bVE, 0.0f, 1.0f, 0.0f);
            GlStateManager.d(this.bUl.bVF, d.AZ().aIY.chP == 2 ? -1.0f : 1.0f, 0.0f, 0.0f);
            GlStateManager.i(-0.02666667f, -0.02666667f, 0.02666667f);
            GlStateManager.JA();
            GlStateManager.an(false);
            GlStateManager.JD();
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 1, 0);
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            int n2 = agg2.bQ(string);
            int n3 = n2 / 2;
            GlStateManager.JO();
            worldRenderer.a(7, DefaultVertexFormats.cbF);
            worldRenderer.F(-n3 - 1, -1.0, 0.0).g(0.0f, 0.0f, 0.0f, 0.25f).Lx();
            worldRenderer.F(-n3 - 1, 8.0, 0.0).g(0.0f, 0.0f, 0.0f, 0.25f).Lx();
            worldRenderer.F(n3 + 1, 8.0, 0.0).g(0.0f, 0.0f, 0.0f, 0.25f).Lx();
            worldRenderer.F(n3 + 1, -1.0, 0.0).g(0.0f, 0.0f, 0.0f, 0.25f).Lx();
            tessellator.pZ();
            GlStateManager.JN();
            agg2.a(string, (double)(-n2 / 2), 0.0, 0x20FFFFFF);
            GlStateManager.JE();
            GlStateManager.an(true);
            agg2.a(string, (double)(-n2 / 2), 0.0, -1);
            GlStateManager.Jz();
            GlStateManager.tR();
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.JW();
        }
    }

    public RenderManager BF() {
        return this.bUl;
    }

    public boolean No() {
        return false;
    }

    public void d(T t2, double d2, double d3, double d4, float f2, float f3) {
    }

    @Override
    public Class Np() {
        return this.bUo;
    }

    @Override
    public void f(Class clazz) {
        this.bUo = clazz;
    }

    @Override
    public cm Nq() {
        return this.bUp;
    }

    @Override
    public void i(cm cm2) {
        this.bUp = cm2;
    }

    public static void a(RenderBiped renderBiped, f f2) {
        renderBiped.bUt = f2;
    }
}

