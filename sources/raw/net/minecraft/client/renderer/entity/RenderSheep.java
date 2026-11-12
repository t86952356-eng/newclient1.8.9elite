/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerSheepWool;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.u;
import net.minecraft.util.cm;

public class RenderSheep
extends RenderLiving<u> {
    private static final cm bWg = new cm("textures/entity/sheep/sheep.png");

    public RenderSheep(RenderManager renderManager, d d2, float f2) {
        super(renderManager, d2, f2);
        this.a(new LayerSheepWool(this));
    }

    protected cm a(u u2) {
        return bWg;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((u)c2);
    }
}

