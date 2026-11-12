/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.av;
import net.minecraft.client.model.d;
import net.minecraft.client.model.f;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.monster.au;
import net.optifine.entity.model.g;
import net.optifine.entity.model.l;

public class bf
extends l {
    public bf() {
        super(au.class, "zombie", 0.5f);
    }

    @Override
    public d aCn() {
        return new av();
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderZombie renderZombie = new RenderZombie(renderManager);
        Render.a(renderZombie, (f)d2);
        renderZombie.bWL = d2;
        renderZombie.bUm = f2;
        return renderZombie;
    }
}

