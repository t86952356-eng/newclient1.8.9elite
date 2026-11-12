/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.item.co;

public class ChestRenderer {
    public void a(Block block, float f2) {
        GlStateManager.e(f2, f2, f2, 1.0f);
        GlStateManager.d(90.0f, 0.0f, 1.0f, 0.0f);
        TileEntityItemStackRenderer.caN.S(new co(block));
    }
}

