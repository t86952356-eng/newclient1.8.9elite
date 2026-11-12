/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSpider;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderCaveSpider
extends RenderSpider<net.minecraft.entity.monster.c> {
    private static final cm bUy = new cm("textures/entity/spider/cave_spider.png");

    public RenderCaveSpider(RenderManager renderManager) {
        super(renderManager);
        this.bUm *= 0.7f;
    }

    @Override
    protected void a(net.minecraft.entity.monster.c c2, float f2) {
        GlStateManager.i(0.7f, 0.7f, 0.7f);
    }

    @Override
    protected cm a(net.minecraft.entity.monster.c c2) {
        return bUy;
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.a((net.minecraft.entity.monster.c)r2, f2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((net.minecraft.entity.monster.c)c2);
    }
}

