/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer.entity;

import hackclient.rise.a;
import hackclient.rise.xm;
import java.util.Random;
import net.minecraft.client.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.entity.c;
import net.minecraft.entity.item.i;
import net.minecraft.item.co;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import org.lwjgl.opengl.GL11;

public class RenderEntityItem
extends Render<i> {
    private static final Random bUK = new Random();
    public static long bUL;
    private static double bUM;
    private final RenderItem bUN;
    private final Random bUO = new Random();
    xm bUP;

    public RenderEntityItem(RenderManager renderManager, RenderItem renderItem) {
        super(renderManager);
        this.bUN = renderItem;
        this.bUm = 0.15f;
        this.bUn = 0.75f;
    }

    private int a(i i2, double d2, double d3, double d4, float f2, IBakedModel iBakedModel) {
        float f3;
        co co2 = i2.Yk();
        net.minecraft.item.d d5 = co2.bP();
        if (d5 == null) {
            return 0;
        }
        boolean bl2 = iBakedModel.Ms();
        int n2 = this.P(co2);
        float f4 = 0.25f;
        float f5 = bt.bx(((float)i2.VG() + f2) / 10.0f + i2.cCu) * 0.1f + 0.1f;
        float f6 = iBakedModel.Qn().b((ItemCameraTransforms$TransformType)ItemCameraTransforms$TransformType.bRq).bRJ.y;
        GlStateManager.j((float)d2, (float)d3 + f5 + 0.25f * f6, (float)d4);
        if (bl2 || this.bUl.bjA != null) {
            f3 = (((float)i2.VG() + f2) / 20.0f + i2.cCu) * 57.295776f;
            GlStateManager.d(f3, 0.0f, 1.0f, 0.0f);
        }
        if (!bl2) {
            f3 = -0.0f * (float)(n2 - 1) * 0.5f;
            float f7 = -0.0f * (float)(n2 - 1) * 0.5f;
            float f8 = -0.046875f * (float)(n2 - 1) * 0.5f;
            GlStateManager.j(f3, f7, f8);
        }
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        return n2;
    }

    private int P(co co2) {
        int n2 = 1;
        if (co2.cWZ > 48) {
            n2 = 5;
        } else if (co2.cWZ > 32) {
            n2 = 4;
        } else if (co2.cWZ > 16) {
            n2 = 3;
        } else if (co2.cWZ > 1) {
            n2 = 2;
        }
        return n2;
    }

    @Override
    public void a(i i2, double d2, double d3, double d4, float f2, float f3) {
        if (this.bUP == null) {
            this.bUP = a.a.g().c(xm.class);
        }
        if (this.bUP != null && this.bUP.isEnabled()) {
            co co2;
            if (!i2.aO) {
                i2.pm = (float)((double)i2.pm + (bUM *= (double)1.005f));
            }
            d d5 = d.AZ();
            bUM = 2.0;
            if (!d5.bhn) {
                bUM = 0.0;
            }
            int n2 = (co2 = i2.Yk()) != null && co2.bP() != null ? net.minecraft.item.d.p(co2.bP()) + co2.yc() : 187;
            bUK.setSeed(n2);
            d.AZ().Bq().a(this.b(i2));
            d.AZ().Bq().k(this.b(i2)).f(false, false);
            GlStateManager.JS();
            GlStateManager.e(516, 0.1f);
            GlStateManager.tQ();
            RenderHelper.Lg();
            GlStateManager.h(770, 771, 1, 0);
            GlStateManager.JV();
            IBakedModel iBakedModel = d5.BG().Ns().M(co2);
            boolean bl2 = iBakedModel.Ms();
            boolean bl3 = iBakedModel.Ms();
            int n3 = this.P(co2);
            GlStateManager.j((float)d2, (float)d3, (float)d4);
            if (iBakedModel.Ms()) {
                GlStateManager.i(0.5f, 0.5f, 0.5f);
            }
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)i2.pl, (float)0.0f, (float)0.0f, (float)1.0f);
            GlStateManager.C(0.0, 0.0, bl3 ? -0.08 : -0.04);
            if (bl3 || d5.BF().bjA != null) {
                if (bl3) {
                    if (!i2.aO) {
                        i2.pm = (float)((double)i2.pm + bUM);
                    }
                } else if (!(Double.isNaN(i2.gW) || Double.isNaN(i2.gX) || Double.isNaN(i2.gY) || i2.baU == null)) {
                    i2.pm = i2.aO ? 0.0f : (float)((double)i2.pm + bUM);
                }
                GlStateManager.d(i2.pm, 1.0f, 0.0f, 0.0f);
            }
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            for (int i3 = 0; i3 < n3; ++i3) {
                GlStateManager.JV();
                if (bl2) {
                    if (i3 > 0) {
                        float f4 = (bUK.nextFloat() * 2.0f - 1.0f) * 0.15f;
                        float f5 = (bUK.nextFloat() * 2.0f - 1.0f) * 0.15f;
                        float f6 = (bUK.nextFloat() * 2.0f - 1.0f) * 0.15f;
                        GlStateManager.j(f4, f5, f6);
                    }
                    d5.BG().a(co2, iBakedModel);
                    GlStateManager.JW();
                    continue;
                }
                d5.BG().a(co2, iBakedModel);
                GlStateManager.JW();
                GlStateManager.j(0.0f, 0.0f, 0.05375f);
            }
            GlStateManager.JW();
            GlStateManager.JT();
            GlStateManager.tR();
            d.AZ().Bq().a(this.b(i2));
            d.AZ().Bq().k(this.b(i2)).NI();
        } else {
            co co3 = i2.Yk();
            this.bUO.setSeed(187L);
            boolean bl4 = false;
            if (this.N(i2)) {
                this.bUl.aIK.k(this.b(i2)).f(false, false);
                bl4 = true;
            }
            GlStateManager.JS();
            GlStateManager.e(516, 0.1f);
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 1, 0);
            GlStateManager.JV();
            IBakedModel iBakedModel = this.bUN.Ns().M(co3);
            int n4 = this.a(i2, d2, d3, d4, f3, iBakedModel);
            for (int i4 = 0; i4 < n4; ++i4) {
                float f7;
                float f8;
                float f9;
                if (iBakedModel.Ms()) {
                    GlStateManager.JV();
                    if (i4 > 0) {
                        f9 = (this.bUO.nextFloat() * 2.0f - 1.0f) * 0.15f;
                        f8 = (this.bUO.nextFloat() * 2.0f - 1.0f) * 0.15f;
                        f7 = (this.bUO.nextFloat() * 2.0f - 1.0f) * 0.15f;
                        GlStateManager.j(f9, f8, f7);
                    }
                    GlStateManager.i(0.5f, 0.5f, 0.5f);
                    iBakedModel.Qn().a(ItemCameraTransforms$TransformType.bRq);
                    this.bUN.a(co3, iBakedModel);
                    GlStateManager.JW();
                    continue;
                }
                GlStateManager.JV();
                iBakedModel.Qn().a(ItemCameraTransforms$TransformType.bRq);
                this.bUN.a(co3, iBakedModel);
                GlStateManager.JW();
                f9 = iBakedModel.Qn().bRj.bRJ.x;
                f8 = iBakedModel.Qn().bRj.bRJ.y;
                f7 = iBakedModel.Qn().bRj.bRJ.z;
                GlStateManager.j(0.0f * f9, 0.0f * f8, 0.046875f * f7);
            }
            GlStateManager.JW();
            GlStateManager.JT();
            GlStateManager.tR();
            this.N(i2);
            if (bl4) {
                this.bUl.aIK.k(this.b(i2)).NI();
            }
            super.a(i2, d2, d3, d4, f2, f3);
        }
    }

    protected cm b(i i2) {
        return TextureMap.bZE;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.b((i)c2);
    }

    static {
        bUM = 0.0;
    }
}

