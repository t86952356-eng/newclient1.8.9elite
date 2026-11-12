/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.y;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.m;
import net.minecraft.util.cm;

public class RenderLeashKnot
extends Render<m> {
    private static final cm bVt = new cm("textures/entity/lead_knot.png");
    private final y bVu = new y();

    public RenderLeashKnot(RenderManager renderManager) {
        super(renderManager);
    }

    @Override
    public void a(m m2, double d2, double d3, double d4, float f2, float f3) {
        GlStateManager.JV();
        GlStateManager.JI();
        GlStateManager.j((float)d2, (float)d3, (float)d4);
        float f4 = 0.0625f;
        GlStateManager.JS();
        GlStateManager.i(-1.0f, -1.0f, 1.0f);
        GlStateManager.tL();
        this.N(m2);
        this.bVu.a(m2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GlStateManager.JW();
        super.a(m2, d2, d3, d4, f2, f3);
    }

    protected cm a(m m2) {
        return bVt;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((m)c2);
    }
}

