/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.model.aw;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;

public class LayerVillagerArmor
extends LayerBipedArmor {
    public LayerVillagerArmor(RendererLivingEntity<?> rendererLivingEntity) {
        super(rendererLivingEntity);
    }

    @Override
    protected void Nl() {
        this.bXf = new aw(0.5f, 0.0f, true);
        this.bXg = new aw(1.0f, 0.0f, true);
    }
}

