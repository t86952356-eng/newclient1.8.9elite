/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.by;
import net.minecraft.item.co;

class RenderItem$5
implements ItemMeshDefinition {
    RenderItem$5(RenderItem renderItem) {
    }

    @Override
    public ModelResourceLocation L(co co2) {
        return by.gb(co2.yc()) ? new ModelResourceLocation("bottle_splash", "inventory") : new ModelResourceLocation("bottle_drinkable", "inventory");
    }
}

