/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerMooshroomMushroom;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.i;
import net.minecraft.util.cm;

public class RenderMooshroom
extends RenderLiving<i> {
    private static final cm bVP = new cm("textures/entity/cow/mooshroom.png");

    public RenderMooshroom(RenderManager renderManager, d d2, float f2) {
        super(renderManager, d2, f2);
        this.a(new LayerMooshroomMushroom(this));
    }

    protected cm a(i i2) {
        return bVP;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((i)c2);
    }
}

