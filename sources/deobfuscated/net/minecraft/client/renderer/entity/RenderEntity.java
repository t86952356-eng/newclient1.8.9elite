/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.util.cm;

public class RenderEntity
extends Render<c> {
    public RenderEntity(RenderManager renderManager) {
        super(renderManager);
    }

    @Override
    public void a(c c2, double d2, double d3, double d4, float f2, float f3) {
        GlStateManager.JV();
        RenderEntity.b(c2.Us(), d2 - c2.csh, d3 - c2.csi, d4 - c2.csj);
        GlStateManager.JW();
        super.a(c2, d2, d3, d4, f2, f3);
    }

    @Override
    protected cm L(c c2) {
        return null;
    }
}

