/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.s;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.k;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderGhast
extends RenderLiving<k> {
    private static final cm bUS = new cm("textures/entity/ghast/ghast.png");
    private static final cm bUT = new cm("textures/entity/ghast/ghast_shooting.png");

    public RenderGhast(RenderManager renderManager) {
        super(renderManager, new s(), 0.5f);
    }

    protected cm a(k k2) {
        return k2.Zk() ? bUT : bUS;
    }

    @Override
    protected void a(k k2, float f2) {
        float f3 = 1.0f;
        float f4 = 4.5f;
        float f5 = 4.5f;
        GlStateManager.i(4.5f, 4.5f, 4.5f);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.a((k)r2, f2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((k)c2);
    }
}

