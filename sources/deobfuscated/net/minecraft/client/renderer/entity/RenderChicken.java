/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.d;
import net.minecraft.entity.r;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class RenderChicken
extends RenderLiving<d> {
    private static final cm bUz = new cm("textures/entity/chicken.png");

    public RenderChicken(RenderManager renderManager, net.minecraft.client.model.d d2, float f2) {
        super(renderManager, d2, f2);
    }

    protected cm a(d d2) {
        return bUz;
    }

    protected float a(d d2, float f2) {
        float f3 = d2.cFG + (d2.cFD - d2.cFG) * f2;
        float f4 = d2.cFF + (d2.cFE - d2.cFF) * f2;
        return (bt.bx(f3) + 1.0f) * f4;
    }

    @Override
    protected /* synthetic */ float d(r r2, float f2) {
        return this.a((d)r2, f2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((d)c2);
    }
}

