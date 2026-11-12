/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerSaddle;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.k;
import net.minecraft.util.cm;

public class RenderPig
extends RenderLiving<k> {
    private static final cm bVV = new cm("textures/entity/pig/pig.png");

    public RenderPig(RenderManager renderManager, d d2, float f2) {
        super(renderManager, d2, f2);
        this.a(new LayerSaddle(this));
    }

    protected cm a(k k2) {
        return bVV;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((k)c2);
    }
}

