/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.e;
import net.minecraft.util.cm;

public class RenderCow
extends RenderLiving<e> {
    private static final cm bUA = new cm("textures/entity/cow/cow.png");

    public RenderCow(RenderManager renderManager, d d2, float f2) {
        super(renderManager, d2, f2);
    }

    protected cm a(e e2) {
        return bUA;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((e)c2);
    }
}

