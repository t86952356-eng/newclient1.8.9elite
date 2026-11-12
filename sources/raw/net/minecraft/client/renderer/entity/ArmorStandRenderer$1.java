/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.b;
import net.minecraft.client.renderer.entity.ArmorStandRenderer;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;

class ArmorStandRenderer$1
extends LayerBipedArmor {
    ArmorStandRenderer$1(ArmorStandRenderer armorStandRenderer, RendererLivingEntity rendererLivingEntity) {
        super(rendererLivingEntity);
    }

    @Override
    protected void Nl() {
        this.bXf = new b(0.5f);
        this.bXg = new b(1.0f);
    }
}

