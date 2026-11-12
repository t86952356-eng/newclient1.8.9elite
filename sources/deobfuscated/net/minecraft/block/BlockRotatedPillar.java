/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.util.ap;

public abstract class BlockRotatedPillar
extends Block {
    public static final PropertyEnum<ap> baa = PropertyEnum.c("axis", ap.class);

    protected BlockRotatedPillar(Material material) {
        super(material, material.zK());
    }

    protected BlockRotatedPillar(Material material, MapColor mapColor) {
        super(material, mapColor);
    }
}

