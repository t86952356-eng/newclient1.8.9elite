/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderMinecart;
import net.minecraft.entity.item.s;
import net.minecraft.init.Blocks;
import net.minecraft.util.bt;

public class RenderTntMinecart
extends RenderMinecart<s> {
    public RenderTntMinecart(RenderManager renderManager) {
        super(renderManager);
    }

    @Override
    protected void a(s s2, float f2, IBlockState iBlockState) {
        int n2 = s2.YS();
        if (n2 > -1 && (float)n2 - f2 + 1.0f < 10.0f) {
            float f3 = 1.0f - ((float)n2 - f2 + 1.0f) / 10.0f;
            f3 = bt.I(f3, 0.0f, 1.0f);
            f3 *= f3;
            f3 *= f3;
            float f4 = 1.0f + f3 * 0.3f;
            GlStateManager.i(f4, f4, f4);
        }
        super.a(s2, f2, iBlockState);
        if (n2 > -1 && n2 / 5 % 2 == 0) {
            BlockRendererDispatcher blockRendererDispatcher = Minecraft.getMinecraft().BE();
            GlStateManager.JO();
            GlStateManager.JA();
            GlStateManager.tQ();
            GlStateManager.P(770, 772);
            GlStateManager.e(1.0f, 1.0f, 1.0f, (1.0f - ((float)n2 - f2 + 1.0f) / 100.0f) * 0.8f);
            GlStateManager.JV();
            blockRendererDispatcher.a(Blocks.cLY.xM(), 1.0f);
            GlStateManager.JW();
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.tR();
            GlStateManager.Jz();
            GlStateManager.JN();
        }
    }
}

