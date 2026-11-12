/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.av;
import net.minecraft.client.renderer.entity.RenderPigZombie;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;

class RenderPigZombie$1
extends LayerBipedArmor {
    RenderPigZombie$1(RenderPigZombie renderPigZombie, RendererLivingEntity rendererLivingEntity) {
        super(rendererLivingEntity);
    }

    @Override
    protected void Nl() {
        this.bXf = new av(0.5f, true);
        this.bXg = new av(1.0f, true);
    }
}

