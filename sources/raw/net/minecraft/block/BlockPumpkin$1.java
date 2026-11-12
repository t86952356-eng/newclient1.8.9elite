/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

class BlockPumpkin$1
implements Predicate<IBlockState> {
    BlockPumpkin$1() {
    }

    public boolean o(IBlockState iBlockState) {
        return iBlockState != null && (iBlockState.df() == Blocks.cMW || iBlockState.df() == Blocks.cNb);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.o((IBlockState)object);
    }
}

