/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.aj;

class BlockSkull$1
implements Predicate<BlockWorldState> {
    BlockSkull$1() {
    }

    public boolean a(BlockWorldState blockWorldState) {
        return blockWorldState.yU() != null && blockWorldState.yU().df() == Blocks.cOg && blockWorldState.Aa() instanceof aj && ((aj)blockWorldState.Aa()).aqT() == 1;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((BlockWorldState)object);
    }
}

