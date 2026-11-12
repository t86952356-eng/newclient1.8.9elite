/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.q;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.j;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderEndermite
extends RenderLiving<j> {
    private static final cm bUJ = new cm("textures/entity/endermite.png");

    public RenderEndermite(RenderManager renderManager) {
        super(renderManager, new q(), 0.3f);
    }

    protected float a(j j2) {
        return 180.0f;
    }

    protected cm b(j j2) {
        return bUJ;
    }

    @Override
    protected /* synthetic */ float G(r r2) {
        return this.a((j)r2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.b((j)c2);
    }
}

