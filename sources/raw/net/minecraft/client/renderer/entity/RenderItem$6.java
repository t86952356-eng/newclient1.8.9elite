/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.co;

class RenderItem$6
implements ItemMeshDefinition {
    RenderItem$6(RenderItem renderItem) {
    }

    @Override
    public ModelResourceLocation L(co co2) {
        return new ModelResourceLocation("spawn_egg", "inventory");
    }
}

