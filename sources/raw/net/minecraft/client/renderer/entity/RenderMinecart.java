/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.d;
import net.minecraft.client.model.aa;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.c;
import net.minecraft.entity.item.k;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.minecraft.util.da;

public class RenderMinecart<T extends k>
extends Render<T> {
    private static final cm bVN = new cm("textures/entity/minecart.png");
    protected net.minecraft.client.model.d bVO = new aa();

    public RenderMinecart(RenderManager renderManager) {
        super(renderManager);
        this.bUm = 0.5f;
    }

    @Override
    public void a(T t2, double d2, double d3, double d4, float f2, float f3) {
        GlStateManager.JV();
        this.N(t2);
        long l2 = (long)((c)t2).getEntityId() * 493286711L;
        l2 = l2 * l2 * 4392167121L + l2 * 98761L;
        float f4 = (((float)(l2 >> 16 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f5 = (((float)(l2 >> 20 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f6 = (((float)(l2 >> 24 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        GlStateManager.j(f4, f5, f6);
        double d5 = ((k)t2).csh + (((k)t2).gW - ((k)t2).csh) * (double)f3;
        double d6 = ((k)t2).csi + (((k)t2).gX - ((k)t2).csi) * (double)f3;
        double d7 = ((k)t2).csj + (((k)t2).gY - ((k)t2).csj) * (double)f3;
        double d8 = 0.3f;
        da da2 = ((k)t2).R(d5, d6, d7);
        float f7 = ((k)t2).crO + (((k)t2).pm - ((k)t2).crO) * f3;
        if (da2 != null) {
            da da3 = ((k)t2).l(d5, d6, d7, (double)0.3f);
            da da4 = ((k)t2).l(d5, d6, d7, (double)-0.3f);
            if (da3 == null) {
                da3 = da2;
            }
            if (da4 == null) {
                da4 = da2;
            }
            d2 += da2.dAG - d5;
            d3 += (da3.dAH + da4.dAH) / 2.0 - d6;
            d4 += da2.dAI - d7;
            da da5 = da4.al(-da3.dAG, -da3.dAH, -da3.dAI);
            if (da5.atS() != 0.0) {
                da5 = da5.atR();
                f2 = (float)(Math.atan2(da5.dAI, da5.dAG) * 180.0 / Math.PI);
                f7 = (float)(Math.atan(da5.dAH) * 73.0);
            }
        }
        GlStateManager.j((float)d2, (float)d3 + 0.375f, (float)d4);
        GlStateManager.d(180.0f - f2, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(-f7, 0.0f, 0.0f, 1.0f);
        float f8 = (float)((k)t2).YA() - f3;
        float f9 = ((k)t2).Yz() - f3;
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f8 > 0.0f) {
            GlStateManager.d(bt.bx(f8) * f8 * f9 / 10.0f * (float)((k)t2).YB(), 1.0f, 0.0f, 0.0f);
        }
        int n2 = ((k)t2).YD();
        IBlockState iBlockState = ((k)t2).YC();
        if (iBlockState.df().xg() != -1) {
            GlStateManager.JV();
            this.a(TextureMap.bZE);
            float f10 = 0.75f;
            GlStateManager.i(0.75f, 0.75f, 0.75f);
            GlStateManager.j(-0.5f, (float)(n2 - 8) / 16.0f, 0.5f);
            this.a(t2, f3, iBlockState);
            GlStateManager.JW();
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.N(t2);
        }
        GlStateManager.i(-1.0f, -1.0f, 1.0f);
        this.bVO.a((c)t2, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GlStateManager.JW();
        super.a(t2, d2, d3, d4, f2, f3);
    }

    protected cm a(T t2) {
        return bVN;
    }

    protected void a(T t2, float f2, IBlockState iBlockState) {
        GlStateManager.JV();
        d.AZ().BE().a(iBlockState, ((c)t2).ag(f2));
        GlStateManager.JW();
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((k)c2);
    }
}

