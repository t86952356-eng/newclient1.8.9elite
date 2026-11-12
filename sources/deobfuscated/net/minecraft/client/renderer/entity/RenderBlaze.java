/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.g;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.a;
import net.minecraft.util.cm;

public class RenderBlaze
extends RenderLiving<a> {
    private static final cm bUv = new cm("textures/entity/blaze.png");

    public RenderBlaze(RenderManager renderManager) {
        super(renderManager, new g(), 0.5f);
    }

    protected cm a(a a2) {
        return bUv;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((a)c2);
    }
}

