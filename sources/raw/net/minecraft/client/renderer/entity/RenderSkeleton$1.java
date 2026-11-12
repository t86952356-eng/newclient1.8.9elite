/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.al;
import net.minecraft.client.renderer.entity.RenderSkeleton;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;

class RenderSkeleton$1
extends LayerBipedArmor {
    RenderSkeleton$1(RenderSkeleton renderSkeleton, RendererLivingEntity rendererLivingEntity) {
        super(rendererLivingEntity);
    }

    @Override
    protected void Nl() {
        this.bXf = new al(0.5f, true);
        this.bXg = new al(1.0f, true);
    }
}

