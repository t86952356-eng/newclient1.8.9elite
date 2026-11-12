/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.d;
import net.minecraft.client.model.m;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderMooshroom;
import net.minecraft.entity.passive.i;
import net.optifine.entity.model.ap;
import net.optifine.entity.model.g;

public class al
extends ap {
    public al() {
        super(i.class, "mooshroom", 0.7f);
    }

    @Override
    public d aCn() {
        return new m();
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderMooshroom renderMooshroom = new RenderMooshroom(renderManager, d2, f2);
        return renderMooshroom;
    }
}

