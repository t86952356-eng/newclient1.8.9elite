/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.av;
import net.minecraft.client.model.d;
import net.minecraft.client.model.f;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPigZombie;
import net.minecraft.entity.monster.ab;
import net.optifine.entity.model.g;
import net.optifine.entity.model.l;

public class ao
extends l {
    public ao() {
        super(ab.class, "zombie_pigman", 0.5f);
    }

    @Override
    public d aCn() {
        return new av();
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderPigZombie renderPigZombie = new RenderPigZombie(renderManager);
        Render.a(renderPigZombie, (f)d2);
        renderPigZombie.bWL = d2;
        renderPigZombie.bUm = f2;
        return renderPigZombie;
    }
}

