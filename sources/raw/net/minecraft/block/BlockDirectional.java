/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.ar;

public abstract class BlockDirectional
extends Block {
    public static final PropertyDirection aTB = PropertyDirection.a("facing", ar.dwT);

    protected BlockDirectional(Material material) {
        super(material);
    }

    protected BlockDirectional(Material material, MapColor mapColor) {
        super(material, mapColor);
    }
}

