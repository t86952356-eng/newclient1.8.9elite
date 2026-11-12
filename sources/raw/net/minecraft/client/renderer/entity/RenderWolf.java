/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerWolfCollar;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.ai;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderWolf
extends RenderLiving<ai> {
    private static final cm bWz = new cm("textures/entity/wolf/wolf.png");
    private static final cm bWA = new cm("textures/entity/wolf/wolf_tame.png");
    private static final cm bWB = new cm("textures/entity/wolf/wolf_angry.png");

    public RenderWolf(RenderManager renderManager, d d2, float f2) {
        super(renderManager, d2, f2);
        this.a(new LayerWolfCollar(this));
    }

    protected float a(ai ai2, float f2) {
        return ai2.abC();
    }

    @Override
    public void a(ai ai2, double d2, double d3, double d4, float f2, float f3) {
        if (ai2.abB()) {
            float f4 = ai2.ag(f3) * ai2.bq(f3);
            GlStateManager.k(f4, f4, f4);
        }
        super.a(ai2, d2, d3, d4, f2, f3);
    }

    protected cm a(ai ai2) {
        return ai2.abl() ? bWA : (ai2.ZF() ? bWB : bWz);
    }

    @Override
    protected /* synthetic */ float d(r r2, float f2) {
        return this.a((ai)r2, f2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((ai)c2);
    }
}

