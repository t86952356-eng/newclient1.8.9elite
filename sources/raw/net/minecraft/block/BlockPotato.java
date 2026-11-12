/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockPotato
extends BlockCrops {
    @Override
    protected d ya() {
        return Items.cRW;
    }

    @Override
    protected d yb() {
        return Items.cRW;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        super.a(w2, b2, iBlockState, f2, n2);
        if (!w2.dDw && iBlockState.b(aTy) >= 7 && w2.dDk.nextInt(50) == 0) {
            BlockPotato.a(w2, b2, new co(Items.cRY));
        }
    }
}

