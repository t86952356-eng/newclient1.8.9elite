/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.c;
import net.minecraft.entity.item.v;
import net.minecraft.init.Blocks;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class RenderTNTPrimed
extends Render<v> {
    public RenderTNTPrimed(RenderManager renderManager) {
        super(renderManager);
        this.bUm = 0.5f;
    }

    @Override
    public void a(v v2, double d2, double d3, double d4, float f2, float f3) {
        float f4;
        BlockRendererDispatcher blockRendererDispatcher = Minecraft.getMinecraft().BE();
        GlStateManager.JV();
        GlStateManager.j((float)d2, (float)d3 + 0.5f, (float)d4);
        if ((float)v2.cDI - f3 + 1.0f < 10.0f) {
            f4 = 1.0f - ((float)v2.cDI - f3 + 1.0f) / 10.0f;
            f4 = bt.I(f4, 0.0f, 1.0f);
            f4 *= f4;
            f4 *= f4;
            float f5 = 1.0f + f4 * 0.3f;
            GlStateManager.i(f5, f5, f5);
        }
        f4 = (1.0f - ((float)v2.cDI - f3 + 1.0f) / 100.0f) * 0.8f;
        this.N(v2);
        GlStateManager.j(-0.5f, -0.5f, 0.5f);
        blockRendererDispatcher.a(Blocks.cLY.xM(), v2.ag(f3));
        GlStateManager.j(0.0f, 0.0f, 1.0f);
        if (v2.cDI / 5 % 2 == 0) {
            GlStateManager.JO();
            GlStateManager.JA();
            GlStateManager.tQ();
            GlStateManager.P(770, 772);
            GlStateManager.e(1.0f, 1.0f, 1.0f, f4);
            GlStateManager.k(-3.0f, -3.0f);
            GlStateManager.JJ();
            blockRendererDispatcher.a(Blocks.cLY.xM(), 1.0f);
            GlStateManager.k(0.0f, 0.0f);
            GlStateManager.JK();
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.tR();
            GlStateManager.Jz();
            GlStateManager.JN();
        }
        GlStateManager.JW();
        super.a(v2, d2, d3, d4, f2, f3);
    }

    protected cm a(v v2) {
        return TextureMap.bZE;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((v)c2);
    }
}

