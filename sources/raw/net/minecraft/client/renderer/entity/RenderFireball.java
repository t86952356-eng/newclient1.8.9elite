/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.projectile.c;
import net.minecraft.init.Items;
import net.minecraft.util.cm;

public class RenderFireball
extends Render<c> {
    private final float bUQ;

    public RenderFireball(RenderManager renderManager, float f2) {
        super(renderManager);
        this.bUQ = f2;
    }

    @Override
    public void a(c c2, double d2, double d3, double d4, float f2, float f3) {
        GlStateManager.JV();
        this.N(c2);
        GlStateManager.j((float)d2, (float)d3, (float)d4);
        GlStateManager.JS();
        GlStateManager.i(this.bUQ, this.bUQ, this.bUQ);
        TextureAtlasSprite textureAtlasSprite = d.AZ().BG().Ns().g(Items.cRP);
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        float f4 = textureAtlasSprite.NY();
        float f5 = textureAtlasSprite.NZ();
        float f6 = textureAtlasSprite.Oa();
        float f7 = textureAtlasSprite.Ob();
        float f8 = 1.0f;
        float f9 = 0.5f;
        float f10 = 0.25f;
        GlStateManager.d(180.0f - this.bUl.bVE, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(-this.bUl.bVF, 1.0f, 0.0f, 0.0f);
        worldRenderer.a(7, DefaultVertexFormats.cbJ);
        worldRenderer.F(-0.5, -0.25, 0.0).r(f4, f7).n(0.0f, 1.0f, 0.0f).Lx();
        worldRenderer.F(0.5, -0.25, 0.0).r(f5, f7).n(0.0f, 1.0f, 0.0f).Lx();
        worldRenderer.F(0.5, 0.75, 0.0).r(f5, f6).n(0.0f, 1.0f, 0.0f).Lx();
        worldRenderer.F(-0.5, 0.75, 0.0).r(f4, f6).n(0.0f, 1.0f, 0.0f).Lx();
        tessellator.pZ();
        GlStateManager.JT();
        GlStateManager.JW();
        super.a(c2, d2, d3, d4, f2, f3);
    }

    protected cm a(c c2) {
        return TextureMap.bZE;
    }

    @Override
    protected /* synthetic */ cm L(net.minecraft.entity.c c2) {
        return this.a((c)c2);
    }
}

