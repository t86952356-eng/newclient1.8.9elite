/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.w;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerIronGolemFlower;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderIronGolem
extends RenderLiving<net.minecraft.entity.monster.w> {
    private static final cm bVg = new cm("textures/entity/iron_golem.png");

    public RenderIronGolem(RenderManager renderManager) {
        super(renderManager, new w(), 0.5f);
        this.a(new LayerIronGolemFlower(this));
    }

    protected cm a(net.minecraft.entity.monster.w w2) {
        return bVg;
    }

    protected void a(net.minecraft.entity.monster.w w2, float f2, float f3, float f4) {
        super.b(w2, f2, f3, f4);
        if ((double)w2.cuy >= 0.01) {
            float f5 = 13.0f;
            float f6 = w2.cuz - w2.cuy * (1.0f - f4) + 6.0f;
            float f7 = (Math.abs(f6 % 13.0f - 6.5f) - 3.25f) / 3.25f;
            GlStateManager.d(6.5f * f7, 0.0f, 0.0f, 1.0f);
        }
    }

    @Override
    protected /* synthetic */ void b(r r2, float f2, float f3, float f4) {
        this.a((net.minecraft.entity.monster.w)r2, f2, f3, f4);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((net.minecraft.entity.monster.w)c2);
    }
}

