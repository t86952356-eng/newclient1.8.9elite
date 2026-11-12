/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.c;
import net.minecraft.entity.projectile.f;
import net.minecraft.init.Items;
import net.minecraft.item.co;

public class RenderPotion
extends RenderSnowball<f> {
    public RenderPotion(RenderManager renderManager, RenderItem renderItem) {
        super(renderManager, Items.cRD, renderItem);
    }

    public co a(f f2) {
        return new co(this.bWm, 1, f2.acQ());
    }

    @Override
    public /* synthetic */ co P(c c2) {
        return this.a((f)c2);
    }
}

