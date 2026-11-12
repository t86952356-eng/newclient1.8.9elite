/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.al;
import net.minecraft.client.model.d;
import net.minecraft.client.model.f;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSkeleton;
import net.minecraft.entity.monster.ah;
import net.optifine.entity.model.g;
import net.optifine.entity.model.l;

public class av
extends l {
    public av() {
        super(ah.class, "skeleton", 0.7f);
    }

    @Override
    public d aCn() {
        return new al();
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderSkeleton renderSkeleton = new RenderSkeleton(renderManager);
        Render.a(renderSkeleton, (f)d2);
        renderSkeleton.bWL = d2;
        renderSkeleton.bUm = f2;
        return renderSkeleton;
    }
}

