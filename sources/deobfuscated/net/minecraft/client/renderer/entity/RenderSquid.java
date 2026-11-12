/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.w;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderSquid
extends RenderLiving<w> {
    private static final cm bWp = new cm("textures/entity/squid.png");

    public RenderSquid(RenderManager renderManager, d d2, float f2) {
        super(renderManager, d2, f2);
    }

    protected cm a(w w2) {
        return bWp;
    }

    protected void a(w w2, float f2, float f3, float f4) {
        float f5 = w2.cHa + (w2.cGZ - w2.cHa) * f4;
        float f6 = w2.cHc + (w2.cHb - w2.cHc) * f4;
        GlStateManager.j(0.0f, 0.5f, 0.0f);
        GlStateManager.d(180.0f - f3, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(f5, 1.0f, 0.0f, 0.0f);
        GlStateManager.d(f6, 0.0f, 1.0f, 0.0f);
        GlStateManager.j(0.0f, -1.2f, 0.0f);
    }

    protected float a(w w2, float f2) {
        return w2.cHg + (w2.cHf - w2.cHg) * f2;
    }

    @Override
    protected /* synthetic */ float d(r r2, float f2) {
        return this.a((w)r2, f2);
    }

    @Override
    protected /* synthetic */ void b(r r2, float f2, float f3, float f4) {
        this.a((w)r2, f2, f3, f4);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((w)c2);
    }
}

