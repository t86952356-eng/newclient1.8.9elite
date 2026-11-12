/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.av;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPigZombie$1;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.ab;
import net.minecraft.util.cm;

public class RenderPigZombie
extends RenderBiped<ab> {
    private static final cm bVW = new cm("textures/entity/zombie_pigman.png");

    public RenderPigZombie(RenderManager renderManager) {
        super(renderManager, new av(), 0.5f, 1.0f);
        this.a(new LayerHeldItem(this));
        this.a(new RenderPigZombie$1(this, this));
    }

    @Override
    protected cm a(ab ab2) {
        return bVW;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((ab)c2);
    }
}

