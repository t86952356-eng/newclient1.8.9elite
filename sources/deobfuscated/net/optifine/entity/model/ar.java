/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ai;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSheep;
import net.minecraft.entity.passive.u;
import net.optifine.entity.model.ap;
import net.optifine.entity.model.g;

public class ar
extends ap {
    public ar() {
        super(u.class, "sheep", 0.7f);
    }

    @Override
    public d aCn() {
        return new ai();
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        return new RenderSheep(renderManager, d2, f2);
    }
}

