/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.l;

public class BlockBreakable
extends Block {
    private final boolean aTi;

    protected BlockBreakable(Material material, boolean bl2) {
        this(material, bl2, material.zK());
    }

    protected BlockBreakable(Material material, boolean bl2, MapColor mapColor) {
        super(material, mapColor);
        this.aTi = bl2;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        IBlockState iBlockState = l2.L(b2);
        Block block = iBlockState.df();
        if (this == Blocks.cLy || this == Blocks.cOI) {
            if (l2.L(b2.x(ao2.asC())) != iBlockState) {
                return true;
            }
            if (block == this) {
                return false;
            }
        }
        return (this.aTi || block != this) && super.a(l2, b2, ao2);
    }
}

