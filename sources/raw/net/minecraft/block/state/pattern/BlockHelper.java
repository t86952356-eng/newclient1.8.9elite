/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.block.state.pattern;

import com.google.common.base.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public class BlockHelper
implements Predicate<IBlockState> {
    private final Block bfI;

    private BlockHelper(Block block) {
        this.bfI = block;
    }

    public static BlockHelper x(Block block) {
        return new BlockHelper(block);
    }

    public boolean o(IBlockState iBlockState) {
        return iBlockState != null && iBlockState.df() == this.bfI;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.o((IBlockState)object);
    }
}

