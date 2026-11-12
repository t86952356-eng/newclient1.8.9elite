/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.d;
import net.minecraft.client.model.m;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.e;
import net.optifine.entity.model.ap;
import net.optifine.entity.model.g;

public class t
extends ap {
    public t() {
        super(e.class, "cow", 0.7f);
    }

    @Override
    public d aCn() {
        return new m();
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        return new RenderCow(renderManager, d2, f2);
    }
}

