/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerSlimeGel;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.ai;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderSlime
extends RenderLiving<ai> {
    private static final cm bWk = new cm("textures/entity/slime/slime.png");

    public RenderSlime(RenderManager renderManager, d d2, float f2) {
        super(renderManager, d2, f2);
        this.a(new LayerSlimeGel(this));
    }

    @Override
    public void a(ai ai2, double d2, double d3, double d4, float f2, float f3) {
        this.bUm = 0.25f * (float)ai2.ZJ();
        super.a(ai2, d2, d3, d4, f2, f3);
    }

    @Override
    protected void a(ai ai2, float f2) {
        float f3 = ai2.ZJ();
        float f4 = (ai2.cEX + (ai2.cEW - ai2.cEX) * f2) / (f3 * 0.5f + 1.0f);
        float f5 = 1.0f / (f4 + 1.0f);
        GlStateManager.i(f5 * f3, 1.0f / f5 * f3, f5 * f3);
    }

    protected cm a(ai ai2) {
        return bWk;
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.a((ai)r2, f2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((ai)c2);
    }
}

