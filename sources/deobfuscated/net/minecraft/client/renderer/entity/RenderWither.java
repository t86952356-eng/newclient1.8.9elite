/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.at;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerWitherAura;
import net.minecraft.entity.boss.a;
import net.minecraft.entity.boss.d;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderWither
extends RenderLiving<d> {
    private static final cm bWx = new cm("textures/entity/wither/wither_invulnerable.png");
    private static final cm bWy = new cm("textures/entity/wither/wither.png");

    public RenderWither(RenderManager renderManager) {
        super(renderManager, new at(0.0f), 1.0f);
        this.a(new LayerWitherAura(this));
    }

    @Override
    public void a(d d2, double d3, double d4, double d5, float f2, float f3) {
        a.a(d2, true);
        super.a(d2, d3, d4, d5, f2, f3);
    }

    protected cm a(d d2) {
        int n2 = d2.XJ();
        return n2 > 0 && (n2 > 80 || n2 / 5 % 2 != 1) ? bWx : bWy;
    }

    @Override
    protected void a(d d2, float f2) {
        float f3 = 2.0f;
        int n2 = d2.XJ();
        if (n2 > 0) {
            f3 -= ((float)n2 - f2) / 220.0f * 0.5f;
        }
        GlStateManager.i(f3, f3, f3);
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.a((d)r2, f2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((d)c2);
    }
}

