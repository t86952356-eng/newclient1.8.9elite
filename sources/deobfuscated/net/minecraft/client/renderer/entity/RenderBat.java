/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.e;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class RenderBat
extends RenderLiving<net.minecraft.entity.passive.c> {
    private static final cm bUr = new cm("textures/entity/bat.png");

    public RenderBat(RenderManager renderManager) {
        super(renderManager, new e(), 0.25f);
    }

    protected cm a(net.minecraft.entity.passive.c c2) {
        return bUr;
    }

    @Override
    protected void a(net.minecraft.entity.passive.c c2, float f2) {
        GlStateManager.i(0.35f, 0.35f, 0.35f);
    }

    protected void a(net.minecraft.entity.passive.c c2, float f2, float f3, float f4) {
        if (!c2.ZV()) {
            GlStateManager.j(0.0f, bt.bB(f2 * 0.3f) * 0.1f, 0.0f);
        } else {
            GlStateManager.j(0.0f, -0.1f, 0.0f);
        }
        super.b(c2, f2, f3, f4);
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.a((net.minecraft.entity.passive.c)r2, f2);
    }

    @Override
    protected /* synthetic */ void b(r r2, float f2, float f3, float f4) {
        this.a((net.minecraft.entity.passive.c)r2, f2, f3, f4);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((net.minecraft.entity.passive.c)c2);
    }
}

