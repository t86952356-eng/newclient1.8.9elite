/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MaterialLiquid
extends Material {
    public MaterialLiquid(MapColor mapColor) {
        super(mapColor);
        this.zD();
        this.zH();
    }

    @Override
    public boolean zv() {
        return true;
    }

    @Override
    public boolean zy() {
        return false;
    }

    @Override
    public boolean zw() {
        return false;
    }
}

