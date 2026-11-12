/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net.minecraft.item;

import com.google.common.base.Function;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.item.bt;
import net.minecraft.item.co;
import net.minecraft.world.d;

public class aq
extends bt {
    public aq(Block block, Block block2, Function<co, String> function) {
        super(block, block2, function);
    }

    @Override
    public int e(co co2, int n2) {
        BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType = BlockDoublePlant$EnumPlantType.aW(co2.yc());
        return blockDoublePlant$EnumPlantType != BlockDoublePlant$EnumPlantType.aUj && blockDoublePlant$EnumPlantType != BlockDoublePlant$EnumPlantType.aUk ? super.e(co2, n2) : d.A(0.5, 1.0);
    }
}

