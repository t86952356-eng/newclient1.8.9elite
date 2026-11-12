/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer;

import hackclient.rise.fw;
import net.minecraft.block.Block;
import net.minecraft.client.d;
import net.minecraft.client.entity.c;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.bo;
import net.minecraft.item.co;
import net.minecraft.src.a;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.minecraft.world.storage.f;
import net.optifine.ao;
import net.optifine.reflect.g;
import net.optifine.shaders.ah;
import org.lwjgl.opengl.GL11;

public class ItemRenderer {
    private static final cm bMe = new cm("textures/map/map_background.png");
    private static final cm bMf = new cm("textures/misc/underwater.png");
    private final d bMg;
    private co kn;
    public float bMh;
    public float bMi;
    private final RenderManager bMj;
    private final RenderItem bMk;
    private boolean bMl;
    private int bMm = -1;

    public ItemRenderer(d d2) {
        this.bMg = d2;
        this.bMj = d2.BF();
        this.bMk = d2.BG();
    }

    public void a(r r2, co co2, ItemCameraTransforms$TransformType transformType) {
        if (co2 != null) {
            net.minecraft.item.d d2 = co2.bP();
            Block block = Block.f(d2);
            GlStateManager.JV();
            if (this.bMk.Q(co2)) {
                GlStateManager.i(2.0f, 2.0f, 2.0f);
                if (!(!this.A(block) || a.aoG() && ah.eym)) {
                    GlStateManager.an(false);
                }
            }
            this.bMk.a(co2, r2, transformType);
            if (this.A(block)) {
                GlStateManager.an(true);
            }
            GlStateManager.JW();
        }
    }

    private boolean A(Block block) {
        return block != null && block.xo() == av.dxY;
    }

    private void l(float f2, float f3) {
        GlStateManager.JV();
        GlStateManager.d(f2, 1.0f, 0.0f, 0.0f);
        GlStateManager.d(f3, 0.0f, 1.0f, 0.0f);
        RenderHelper.Lg();
        GlStateManager.JW();
    }

    private void a(net.minecraft.client.entity.a a2) {
        int n2 = this.bMg.bgF.b(new b(a2.gW, a2.gX + (double)a2.getEyeHeight(), a2.gY), 0);
        if (a.apa()) {
            n2 = ao.f(this.bMg.BC(), n2);
        }
        float f2 = n2 & 0xFFFF;
        float f3 = n2 >> 16;
        OpenGlHelper.a(OpenGlHelper.bMJ, f2, f3);
    }

    private void b(c c2, float f2) {
        float f3 = c2.bky + (c2.bkv - c2.bky) * f2;
        float f4 = c2.bkx + (c2.bku - c2.bkx) * f2;
        GlStateManager.d((c2.pm - f3) * 0.1f, 1.0f, 0.0f, 0.0f);
        GlStateManager.d((c2.pl - f4) * 0.1f, 0.0f, 1.0f, 0.0f);
    }

    private float aw(float f2) {
        float f3 = 1.0f - f2 / 45.0f + 0.1f;
        f3 = bt.I(f3, 0.0f, 1.0f);
        f3 = -bt.bB(f3 * (float)Math.PI) * 0.5f + 0.5f;
        return f3;
    }

    private void a(RenderPlayer renderPlayer) {
        GlStateManager.JV();
        GlStateManager.d(54.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(64.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.d(-62.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.j(0.25f, -0.85f, 0.75f);
        renderPlayer.e(this.bMg.bgK);
        GlStateManager.JW();
    }

    private void b(RenderPlayer renderPlayer) {
        GlStateManager.JV();
        GlStateManager.d(92.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(45.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.d(41.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.j(-0.3f, -1.1f, 0.45f);
        renderPlayer.f(this.bMg.bgK);
        GlStateManager.JW();
    }

    private void b(net.minecraft.client.entity.a a2) {
        this.bMg.Bq().a(a2.Dd());
        Render render = this.bMj.O(this.bMg.bgK);
        RenderPlayer renderPlayer = (RenderPlayer)render;
        if (!a2.isInvisible()) {
            GlStateManager.JI();
            this.a(renderPlayer);
            this.b(renderPlayer);
            GlStateManager.JH();
        }
    }

    private void a(net.minecraft.client.entity.a a2, float f2, float f3, float f4) {
        float f5 = -0.4f * bt.bx(bt.bK(f4) * (float)Math.PI);
        float f6 = 0.2f * bt.bx(bt.bK(f4) * (float)Math.PI * 2.0f);
        float f7 = -0.2f * bt.bx(f4 * (float)Math.PI);
        GlStateManager.j(f5, f6, f7);
        float f8 = this.aw(f2);
        GlStateManager.j(0.0f, 0.04f, -0.72f);
        GlStateManager.j(0.0f, f3 * -1.2f, 0.0f);
        GlStateManager.j(0.0f, f8 * -0.5f, 0.0f);
        GlStateManager.d(90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(f8 * -85.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.d(0.0f, 1.0f, 0.0f, 0.0f);
        this.b(a2);
        float f9 = bt.bx(f4 * f4 * (float)Math.PI);
        float f10 = bt.bx(bt.bK(f4) * (float)Math.PI);
        GlStateManager.d(f9 * -20.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(f10 * -20.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.d(f10 * -80.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.i(0.38f, 0.38f, 0.38f);
        GlStateManager.d(90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(180.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.d(0.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.j(-1.0f, -1.0f, 0.0f);
        GlStateManager.i(0.015625f, 0.015625f, 0.015625f);
        this.bMg.Bq().a(bMe);
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)-1.0f);
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(-7.0, 135.0, 0.0).r(0.0, 1.0).Lx();
        worldRenderer.F(135.0, 135.0, 0.0).r(1.0, 1.0).Lx();
        worldRenderer.F(135.0, -7.0, 0.0).r(1.0, 0.0).Lx();
        worldRenderer.F(-7.0, -7.0, 0.0).r(0.0, 0.0).Lx();
        tessellator.pZ();
        f f11 = Items.cRh.a(this.kn, this.bMg.bgF);
        if (f11 != null) {
            this.bMg.bgT.Jp().a(f11, false);
        }
    }

    public void a(net.minecraft.client.entity.a a2, float f2, float f3) {
        float f4 = -0.3f * bt.bx(bt.bK(f3) * (float)Math.PI);
        float f5 = 0.4f * bt.bx(bt.bK(f3) * (float)Math.PI * 2.0f);
        float f6 = -0.4f * bt.bx(f3 * (float)Math.PI);
        GlStateManager.j(f4, f5, f6);
        GlStateManager.j(0.64000005f, -0.6f, -0.71999997f);
        GlStateManager.j(0.0f, f2 * -0.6f, 0.0f);
        GlStateManager.d(45.0f, 0.0f, 1.0f, 0.0f);
        float f7 = bt.bx(f3 * f3 * (float)Math.PI);
        float f8 = bt.bx(bt.bK(f3) * (float)Math.PI);
        GlStateManager.d(f8 * 70.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(f7 * -20.0f, 0.0f, 0.0f, 1.0f);
        this.bMg.Bq().a(a2.Dd());
        GlStateManager.j(-1.0f, 3.6f, 3.5f);
        GlStateManager.d(120.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.d(200.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.d(-135.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.i(1.0f, 1.0f, 1.0f);
        GlStateManager.j(5.6f, 0.0f, 0.0f);
        Render render = this.bMj.O(this.bMg.bgK);
        GlStateManager.JI();
        RenderPlayer renderPlayer = (RenderPlayer)render;
        renderPlayer.e(this.bMg.bgK);
        GlStateManager.JH();
    }

    public void ax(float f2) {
        float f3 = -0.4f * bt.bx(bt.bK(f2) * (float)Math.PI);
        float f4 = 0.2f * bt.bx(bt.bK(f2) * (float)Math.PI * 2.0f);
        float f5 = -0.2f * bt.bx(f2 * (float)Math.PI);
        GlStateManager.j(f3, f4, f5);
    }

    private void a(net.minecraft.client.entity.a a2, float f2) {
        float f3 = (float)a2.abG() - f2 + 1.0f;
        float f4 = f3 / (float)this.kn.aeh();
        float f5 = bt.bz(bt.bB(f3 / 4.0f * (float)Math.PI) * 0.1f);
        if (f4 >= 0.8f) {
            f5 = 0.0f;
        }
        GlStateManager.j(0.0f, f5, 0.0f);
        float f6 = 1.0f - (float)Math.pow(f4, 27.0);
        GlStateManager.j(f6 * 0.6f, f6 * -0.5f, f6 * 0.0f);
        GlStateManager.d(f6 * 90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(f6 * 10.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.d(f6 * 30.0f, 0.0f, 0.0f, 1.0f);
    }

    public void m(float f2, float f3) {
        GlStateManager.j(0.56f, -0.52f, -0.71999997f);
        GlStateManager.j(0.0f, f2 * -0.6f, 0.0f);
        GlStateManager.d(45.0f, 0.0f, 1.0f, 0.0f);
        float f4 = bt.bx(f3 * f3 * (float)Math.PI);
        float f5 = bt.bx(bt.bK(f3) * (float)Math.PI);
        GlStateManager.d(f4 * -20.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(f5 * -20.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.d(f5 * -80.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.i(0.4f, 0.4f, 0.4f);
    }

    private void a(float f2, net.minecraft.client.entity.a a2) {
        GlStateManager.d(-18.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.d(-12.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(-8.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.j(-0.9f, 0.2f, 0.0f);
        float f3 = (float)this.kn.aeh() - ((float)a2.abG() - f2 + 1.0f);
        float f4 = f3 / 20.0f;
        f4 = (f4 * f4 + f4 * 2.0f) / 3.0f;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        if (f4 > 0.1f) {
            float f5 = bt.bx((f3 - 0.1f) * 1.3f);
            float f6 = f4 - 0.1f;
            float f7 = f5 * f6;
            GlStateManager.j(f7 * 0.0f, f7 * 0.01f, f7 * 0.0f);
        }
        GlStateManager.j(f4 * 0.0f, f4 * 0.0f, f4 * 0.1f);
        GlStateManager.i(1.0f, 1.0f, 1.0f + f4 * 0.2f);
    }

    public void Kl() {
        GlStateManager.j(-0.5f, 0.2f, 0.0f);
        GlStateManager.d(30.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(-80.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.d(60.0f, 0.0f, 1.0f, 0.0f);
    }

    public void Km() {
        this.bMl = true;
    }

    public boolean O(co co2) {
        if (co2.bP().adx()) {
            GlStateManager.d(180.0f, 0.0f, 1.0f, 0.0f);
        }
        GlStateManager.j(0.58800083f, 0.36999986f, -0.77000016f);
        GlStateManager.j(0.0f, -0.3f, 0.0f);
        GlStateManager.i(1.5f, 1.5f, 1.5f);
        GlStateManager.d(50.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(335.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.j(-0.9375f, -0.0625f, 0.0f);
        GlStateManager.i(-2.0f, 2.0f, -2.0f);
        if (this.bMk.Q(co2)) {
            GlStateManager.i(0.58823526f, 0.58823526f, 0.58823526f);
            GlStateManager.d(-25.0f, 0.0f, 0.0f, 1.0f);
            GlStateManager.d(0.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.d(135.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.j(0.0f, -0.25f, -0.125f);
            GlStateManager.i(0.5f, 0.5f, 0.5f);
            return true;
        }
        GlStateManager.i(0.5f, 0.5f, 0.5f);
        return false;
    }

    public void ay(float f2) {
        if (!a.aoG() || !ah.aGI()) {
            float f3 = 1.0f - (this.bMi + (this.bMh - this.bMi) * f2);
            c c2 = this.bMg.bgK;
            float f4 = c2.ba(f2);
            float f5 = c2.crO + (c2.pm - c2.crO) * f2;
            float f6 = c2.crM + (c2.pl - c2.crM) * f2;
            this.l(f5, f6);
            this.a(c2);
            this.b(c2, f2);
            GlStateManager.JS();
            GlStateManager.JV();
            if (this.kn != null) {
                net.minecraft.item.a a2 = this.kn.aei();
                int n2 = c2.abG();
                boolean bl2 = n2 > 0;
                fw fw2 = new fw(a2, bl2, f3, f2, f4, this.kn);
                hackclient.rise.a.a.e().d(fw2);
                a2 = fw2.dD();
                bl2 = fw2.db();
                f3 = fw2.dE();
                f4 = fw2.dF();
                if (this.kn.bP() instanceof bo) {
                    this.a(c2, f5, f3, f4);
                } else if (bl2) {
                    if (!fw2.isCancelled()) {
                        switch (a2) {
                            case cUw: {
                                this.m(f3, 0.0f);
                                break;
                            }
                            case cUx: 
                            case cUy: {
                                this.a(c2, f2);
                                this.m(f3, 0.0f);
                                break;
                            }
                            case cUz: {
                                this.m(f3, 0.0f);
                                this.Kl();
                                break;
                            }
                            case cUA: {
                                this.m(f3, 0.0f);
                                this.a(f2, c2);
                            }
                        }
                    }
                } else if (!fw2.isCancelled()) {
                    this.ax(f4);
                    this.m(f3, f4);
                }
                ItemCameraTransforms$TransformType itemCameraTransforms$TransformType = ItemCameraTransforms$TransformType.bRn;
                if (this.bMl) {
                    itemCameraTransforms$TransformType = this.O(this.kn) ? ItemCameraTransforms$TransformType.bRn : ItemCameraTransforms$TransformType.bRl;
                    this.bMl = false;
                }
                this.a((r)c2, this.kn, itemCameraTransforms$TransformType);
            } else if (!c2.isInvisible()) {
                this.a(c2, f3, f4);
            }
            GlStateManager.JW();
            GlStateManager.JT();
            RenderHelper.Lf();
        }
    }

    public void az(float f2) {
    }

    private void a(float f2, TextureAtlasSprite textureAtlasSprite) {
        this.bMg.Bq().a(TextureMap.bZE);
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        float f3 = 0.1f;
        GlStateManager.e(0.1f, 0.1f, 0.1f, 0.5f);
        GlStateManager.JV();
        float f4 = -1.0f;
        float f5 = 1.0f;
        float f6 = -1.0f;
        float f7 = 1.0f;
        float f8 = -0.5f;
        float f9 = textureAtlasSprite.NY();
        float f10 = textureAtlasSprite.NZ();
        float f11 = textureAtlasSprite.Oa();
        float f12 = textureAtlasSprite.Ob();
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(-1.0, -1.0, -0.5).r(f10, f12).Lx();
        worldRenderer.F(1.0, -1.0, -0.5).r(f9, f12).Lx();
        worldRenderer.F(1.0, 1.0, -0.5).r(f9, f11).Lx();
        worldRenderer.F(-1.0, 1.0, -0.5).r(f10, f11).Lx();
        tessellator.pZ();
        GlStateManager.JW();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void aA(float f2) {
        if (!a.aoG() || ah.aFm()) {
            this.bMg.Bq().a(bMf);
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            float f3 = this.bMg.bgK.ag(f2);
            GlStateManager.e(f3, f3, f3, 0.5f);
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 1, 0);
            GlStateManager.JV();
            float f4 = 4.0f;
            float f5 = -1.0f;
            float f6 = 1.0f;
            float f7 = -1.0f;
            float f8 = 1.0f;
            float f9 = -0.5f;
            float f10 = -this.bMg.bgK.pl / 64.0f;
            float f11 = this.bMg.bgK.pm / 64.0f;
            worldRenderer.a(7, DefaultVertexFormats.cbG);
            worldRenderer.F(-1.0, -1.0, -0.5).r(4.0f + f10, 4.0f + f11).Lx();
            worldRenderer.F(1.0, -1.0, -0.5).r(0.0f + f10, 4.0f + f11).Lx();
            worldRenderer.F(1.0, 1.0, -0.5).r(0.0f + f10, 0.0f + f11).Lx();
            worldRenderer.F(-1.0, 1.0, -0.5).r(4.0f + f10, 0.0f + f11).Lx();
            tessellator.pZ();
            GlStateManager.JW();
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.tR();
        }
    }

    private void aB(float f2) {
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 0.9f);
        GlStateManager.cJ(519);
        GlStateManager.an(false);
        GlStateManager.tQ();
        GlStateManager.h(770, 771, 1, 0);
        float f3 = 1.0f;
        for (int i2 = 0; i2 < 2; ++i2) {
            GlStateManager.JV();
            TextureAtlasSprite textureAtlasSprite = this.bMg.Bu().dq("minecraft:blocks/fire_layer_1");
            this.bMg.Bq().a(TextureMap.bZE);
            float f4 = textureAtlasSprite.NY();
            float f5 = textureAtlasSprite.NZ();
            float f6 = textureAtlasSprite.Oa();
            float f7 = textureAtlasSprite.Ob();
            float f8 = -0.5f;
            float f9 = 0.5f;
            float f10 = -0.5f;
            float f11 = 0.5f;
            float f12 = -0.5f;
            GlStateManager.j((float)(-(i2 * 2 - 1)) * 0.24f, -0.3f, 0.0f);
            GlStateManager.d((float)(i2 * 2 - 1) * 10.0f, 0.0f, 1.0f, 0.0f);
            worldRenderer.a(7, DefaultVertexFormats.cbG);
            worldRenderer.c(textureAtlasSprite);
            worldRenderer.F(-0.5, -0.5, -0.5).r(f5, f7).Lx();
            worldRenderer.F(0.5, -0.5, -0.5).r(f4, f7).Lx();
            worldRenderer.F(0.5, 0.5, -0.5).r(f4, f6).Lx();
            worldRenderer.F(-0.5, 0.5, -0.5).r(f5, f6).Lx();
            tessellator.pZ();
            GlStateManager.JW();
        }
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.tR();
        GlStateManager.an(true);
        GlStateManager.cJ(515);
    }

    public void Kn() {
        this.bMi = this.bMh;
        c c2 = this.bMg.bgK;
        co co2 = c2.cHV.cJC[c2.cHV.cJE];
        boolean bl2 = false;
        if (this.kn != null && co2 != null) {
            if (!this.kn.aL(co2)) {
                boolean bl3;
                if (g.epw.aDA() && !(bl3 = g.b((Object)this.kn.bP(), g.epw, this.kn, co2, this.bMm != c2.cHV.cJE))) {
                    this.kn = co2;
                    this.bMm = c2.cHV.cJE;
                    return;
                }
                bl2 = true;
            }
        } else {
            bl2 = this.kn != null || co2 != null;
        }
        float f2 = 0.4f;
        float f3 = bl2 ? 0.0f : 1.0f;
        float f4 = bt.I(f3 - this.bMh, -0.4f, 0.4f);
        this.bMh += f4;
        if (this.bMh < 0.1f) {
            this.kn = co2;
            this.bMm = c2.cHV.cJE;
            if (a.aoG()) {
                ah.bd(co2);
            }
        }
    }

    public void Ko() {
        this.bMh = 0.0f;
    }

    public void Kp() {
        this.bMh = 0.0f;
    }
}

