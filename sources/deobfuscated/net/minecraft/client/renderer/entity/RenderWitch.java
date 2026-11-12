/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.as;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItemWitch;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.at;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderWitch
extends RenderLiving<at> {
    private static final cm bWw = new cm("textures/entity/witch.png");

    public RenderWitch(RenderManager renderManager) {
        super(renderManager, new as(0.0f), 0.5f);
        this.a(new LayerHeldItemWitch(this));
    }

    @Override
    public void a(at at2, double d2, double d3, double d4, float f2, float f3) {
        ((as)this.bWL).bCM = at2.Vk() != null;
        super.a(at2, d2, d3, d4, f2, f3);
    }

    protected cm a(at at2) {
        return bWw;
    }

    @Override
    public void Nr() {
        GlStateManager.j(0.0f, 0.1875f, 0.0f);
    }

    @Override
    protected void a(at at2, float f2) {
        float f3 = 0.9375f;
        GlStateManager.i(0.9375f, 0.9375f, 0.9375f);
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.a((at)r2, f2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((at)c2);
    }
}

