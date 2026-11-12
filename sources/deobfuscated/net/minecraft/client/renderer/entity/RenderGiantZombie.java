/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderGiantZombie$1;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.p;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderGiantZombie
extends RenderLiving<p> {
    private static final cm bUU = new cm("textures/entity/zombie/zombie.png");
    private final float bUV;

    public RenderGiantZombie(RenderManager renderManager, d d2, float f2, float f3) {
        super(renderManager, d2, f2 * f3);
        this.bUV = f3;
        this.a(new LayerHeldItem(this));
        this.a(new RenderGiantZombie$1(this, this));
    }

    @Override
    public void Nr() {
        GlStateManager.j(0.0f, 0.1875f, 0.0f);
    }

    @Override
    protected void a(p p2, float f2) {
        GlStateManager.i(this.bUV, this.bUV, this.bUV);
    }

    protected cm a(p p2) {
        return bUU;
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.a((p)r2, f2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((p)c2);
    }
}

