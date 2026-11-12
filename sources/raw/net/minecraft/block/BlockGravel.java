/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.d;

public class BlockGravel
extends BlockFalling {
    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        if (n2 > 3) {
            n2 = 3;
        }
        return random.nextInt(10 - n2 * 3) == 0 ? Items.cQo : d.I(this);
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return MapColor.bdN;
    }
}

