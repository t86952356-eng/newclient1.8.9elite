/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer.tileentity;

import hackclient.rise.agg;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureCompass;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.c;
import net.minecraft.entity.item.i;
import net.minecraft.entity.item.j;
import net.minecraft.init.Items;
import net.minecraft.item.bo;
import net.minecraft.item.ci;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.src.a;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.minecraft.world.storage.f;
import net.optifine.reflect.g;
import net.optifine.shaders.ah;
import org.lwjgl.opengl.GL11;

public class RenderItemFrame
extends Render<j> {
    private static final cm cai = new cm("textures/map/map_background.png");
    private final Minecraft caj = Minecraft.getMinecraft();
    private final ModelResourceLocation cak = new ModelResourceLocation("item_frame", "normal");
    private final ModelResourceLocation cal = new ModelResourceLocation("item_frame", "map");
    private final RenderItem cam;
    private static double can = 4096.0;

    public RenderItemFrame(RenderManager renderManager, RenderItem renderItem) {
        super(renderManager);
        this.cam = renderItem;
    }

    @Override
    public void a(j j2, double d2, double d3, double d4, float f2, float f3) {
        GlStateManager.JV();
        b b2 = j2.UN();
        double d5 = (double)b2.wt() - j2.gW + d2;
        double d6 = (double)b2.wu() - j2.gX + d3;
        double d7 = (double)b2.wx() - j2.gY + d4;
        GlStateManager.C(d5 + 0.5, d6 + 0.5, d7 + 0.5);
        GlStateManager.d(180.0f - j2.pl, 0.0f, 1.0f, 0.0f);
        this.bUl.aIK.a(TextureMap.bZE);
        BlockRendererDispatcher blockRendererDispatcher = this.caj.BE();
        ModelManager modelManager = blockRendererDispatcher.IY().IV();
        IBakedModel iBakedModel = j2.Yt() != null && j2.Yt().bP() == Items.cRh ? modelManager.a(this.cal) : modelManager.a(this.cak);
        GlStateManager.JV();
        GlStateManager.j(-0.5f, -0.5f, -0.5f);
        blockRendererDispatcher.IZ().a(iBakedModel, 1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.JW();
        GlStateManager.j(0.0f, 0.0f, 0.4375f);
        this.b(j2);
        GlStateManager.JW();
        this.a(j2, d2 + (double)((float)j2.cty.asH() * 0.3f), d3 - 0.25, d4 + (double)((float)j2.cty.asJ() * 0.3f));
    }

    protected cm a(j j2) {
        return null;
    }

    private void b(j j2) {
        co co2 = j2.Yt();
        if (co2 != null) {
            c c2;
            if (!this.c(j2)) {
                return;
            }
            if (!a.doh) {
                c2 = this.caj.bgK;
                double d2 = j2.M(c2.gW, c2.gX, c2.gY);
                if (d2 > 4096.0) {
                    return;
                }
            }
            c2 = new i(j2.baU, 0.0, 0.0, 0.0, co2);
            d d3 = ((i)c2).Yk().bP();
            ((i)c2).Yk().cWZ = 1;
            ((i)c2).cCu = 0.0f;
            GlStateManager.JV();
            GlStateManager.JA();
            int n2 = j2.Yu();
            if (d3 instanceof bo) {
                n2 = n2 % 4 * 2;
            }
            GlStateManager.d((float)n2 * 360.0f / 8.0f, 0.0f, 0.0f, 1.0f);
            if (!g.a(g.eqH, j2, this)) {
                if (d3 instanceof bo) {
                    this.bUl.aIK.a(cai);
                    GlStateManager.d(180.0f, 0.0f, 0.0f, 1.0f);
                    float f2 = 0.0078125f;
                    GlStateManager.i(0.0078125f, 0.0078125f, 0.0078125f);
                    GlStateManager.j(-64.0f, -64.0f, 0.0f);
                    f f3 = Items.cRh.a(((i)c2).Yk(), j2.baU);
                    GlStateManager.j(0.0f, 0.0f, -1.0f);
                    if (f3 != null) {
                        this.caj.bgT.Jp().a(f3, true);
                    }
                } else {
                    TextureAtlasSprite textureAtlasSprite = null;
                    if (d3 == Items.cQU) {
                        textureAtlasSprite = this.caj.Bu().dq(TextureCompass.bZv);
                        this.caj.Bq().a(TextureMap.bZE);
                        if (textureAtlasSprite instanceof TextureCompass) {
                            TextureCompass textureCompass = (TextureCompass)textureAtlasSprite;
                            double d4 = textureCompass.bZt;
                            double d5 = textureCompass.bZu;
                            textureCompass.bZt = 0.0;
                            textureCompass.bZu = 0.0;
                            textureCompass.a(j2.baU, j2.gW, j2.gY, bt.bN(180 + j2.cty.asA() * 90), false, true);
                            textureCompass.bZt = d4;
                            textureCompass.bZu = d5;
                        } else {
                            textureAtlasSprite = null;
                        }
                    }
                    GlStateManager.i(0.5f, 0.5f, 0.5f);
                    if (!this.cam.Q(((i)c2).Yk()) || d3 instanceof ci) {
                        GlStateManager.d(180.0f, 0.0f, 1.0f, 0.0f);
                    }
                    GlStateManager.Jw();
                    RenderHelper.Lg();
                    this.cam.a(((i)c2).Yk(), ItemCameraTransforms$TransformType.bRr);
                    RenderHelper.Lf();
                    GlStateManager.Jx();
                    if (textureAtlasSprite != null && textureAtlasSprite.Of() > 0) {
                        textureAtlasSprite.Od();
                    }
                }
            }
            GlStateManager.Jz();
            GlStateManager.JW();
        }
    }

    @Override
    protected void a(j j2, double d2, double d3, double d4) {
        if (Minecraft.AV() && j2.Yt() != null && j2.Yt().aen() && this.bUl.bgM == j2) {
            float f2;
            float f3 = 1.6f;
            float f4 = 0.02666667f;
            double d5 = j2.T(this.bUl.bVD);
            float f5 = f2 = j2.isSneaking() ? 32.0f : 64.0f;
            if (d5 < (double)(f2 * f2)) {
                String string = j2.Yt().getDisplayName();
                if (j2.isSneaking()) {
                    agg agg2 = this.Nn();
                    GlStateManager.JV();
                    GlStateManager.j((float)d2 + 0.0f, (float)d3 + j2.height + 0.5f, (float)d4);
                    GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                    GlStateManager.d(-this.bUl.bVE, 0.0f, 1.0f, 0.0f);
                    GlStateManager.d(this.bUl.bVF, 1.0f, 0.0f, 0.0f);
                    GlStateManager.i(-0.02666667f, -0.02666667f, 0.02666667f);
                    GlStateManager.JA();
                    GlStateManager.j(0.0f, 9.374999f, 0.0f);
                    GlStateManager.an(false);
                    GlStateManager.tQ();
                    GlStateManager.P(770, 771);
                    Tessellator tessellator = Tessellator.Li();
                    WorldRenderer worldRenderer = tessellator.Lj();
                    int n2 = agg2.bQ(string) / 2;
                    GlStateManager.JO();
                    worldRenderer.a(7, DefaultVertexFormats.cbF);
                    worldRenderer.F(-n2 - 1, -1.0, 0.0).g(0.0f, 0.0f, 0.0f, 0.25f).Lx();
                    worldRenderer.F(-n2 - 1, 8.0, 0.0).g(0.0f, 0.0f, 0.0f, 0.25f).Lx();
                    worldRenderer.F(n2 + 1, 8.0, 0.0).g(0.0f, 0.0f, 0.0f, 0.25f).Lx();
                    worldRenderer.F(n2 + 1, -1.0, 0.0).g(0.0f, 0.0f, 0.0f, 0.25f).Lx();
                    tessellator.pZ();
                    GlStateManager.JN();
                    GlStateManager.an(true);
                    agg2.a(string, (double)(-agg2.bQ(string) / 2), 0.0, 0x20FFFFFF);
                    GlStateManager.Jz();
                    GlStateManager.tR();
                    GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.JW();
                } else {
                    this.a(j2, string, d2, d3, d4);
                }
            }
        }
    }

    private boolean c(j j2) {
        if (ah.eye) {
            return false;
        }
        if (!a.doh) {
            c c2 = this.caj.BC();
            double d2 = j2.M(c2.gW, c2.gX, c2.gY);
            return !(d2 > can);
        }
        return true;
    }

    public static void OD() {
        Minecraft minecraft = a.AZ();
        double d2 = a.F(minecraft.aIY.chV, 1.0f, 120.0f);
        double d3 = Math.max(6.0 * (double)minecraft.bgA / d2, 16.0);
        can = d3 * d3;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((j)c2);
    }
}

