/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderCaveSpider;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.c;
import net.optifine.entity.model.ay;
import net.optifine.entity.model.g;

public class p
extends ay {
    public p() {
        super(c.class, "cave_spider", 0.7f);
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderCaveSpider renderCaveSpider = new RenderCaveSpider(renderManager);
        renderCaveSpider.bWL = d2;
        renderCaveSpider.bUm = f2;
        return renderCaveSpider;
    }
}

