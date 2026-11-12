/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderMinecartMobSpawner;
import net.minecraft.entity.ai.bi;
import net.minecraft.src.a;
import net.optifine.entity.model.ai;
import net.optifine.entity.model.g;

public class aj
extends ai {
    public aj() {
        super(bi.class, "spawner_minecart", 0.5f);
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderMinecartMobSpawner renderMinecartMobSpawner = new RenderMinecartMobSpawner(renderManager);
        if (!net.optifine.reflect.g.esx.aDA()) {
            a.warn("Field not found: RenderMinecart.modelMinecart");
            return null;
        }
        net.optifine.reflect.g.a((Object)renderMinecartMobSpawner, net.optifine.reflect.g.esx, (Object)d2);
        renderMinecartMobSpawner.bUm = f2;
        return renderMinecartMobSpawner;
    }
}

