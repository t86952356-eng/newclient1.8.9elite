/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.c;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.cm;

public class RenderSnowball<T extends c>
extends Render<T> {
    protected final d bWm;
    private final RenderItem bWn;

    public RenderSnowball(RenderManager renderManager, d d2, RenderItem renderItem) {
        super(renderManager);
        this.bWm = d2;
        this.bWn = renderItem;
    }

    @Override
    public void a(T t2, double d2, double d3, double d4, float f2, float f3) {
        GlStateManager.JV();
        GlStateManager.j((float)d2, (float)d3, (float)d4);
        GlStateManager.JS();
        GlStateManager.i(0.5f, 0.5f, 0.5f);
        GlStateManager.d(-this.bUl.bVE, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(this.bUl.bVF, 1.0f, 0.0f, 0.0f);
        this.a(TextureMap.bZE);
        this.bWn.a(this.P(t2), ItemCameraTransforms$TransformType.bRq);
        GlStateManager.JT();
        GlStateManager.JW();
        super.a(t2, d2, d3, d4, f2, f3);
    }

    public co P(T t2) {
        return new co(this.bWm, 1, 0);
    }

    @Override
    protected cm L(c c2) {
        return TextureMap.bZE;
    }
}

