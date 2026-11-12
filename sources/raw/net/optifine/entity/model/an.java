/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ac;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.entity.passive.k;
import net.optifine.entity.model.ap;
import net.optifine.entity.model.g;

public class an
extends ap {
    public an() {
        super(k.class, "pig", 0.7f);
    }

    @Override
    public d aCn() {
        return new ac();
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        return new RenderPig(renderManager, d2, f2);
    }
}

