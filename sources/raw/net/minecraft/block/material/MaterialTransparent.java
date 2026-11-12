/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MaterialTransparent
extends Material {
    public MaterialTransparent(MapColor mapColor) {
        super(mapColor);
        this.zD();
    }

    @Override
    public boolean zw() {
        return false;
    }

    @Override
    public boolean zx() {
        return false;
    }

    @Override
    public boolean zy() {
        return false;
    }
}

