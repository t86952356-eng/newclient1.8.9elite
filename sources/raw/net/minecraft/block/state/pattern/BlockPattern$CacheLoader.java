/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 */
package net.minecraft.block.state.pattern;

import com.google.common.cache.CacheLoader;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.util.b;
import net.minecraft.world.w;

class BlockPattern$CacheLoader
extends CacheLoader<b, BlockWorldState> {
    private final w bfN;
    private final boolean bfO;

    public BlockPattern$CacheLoader(w w2, boolean bl2) {
        this.bfN = w2;
        this.bfO = bl2;
    }

    public BlockWorldState F(b b2) {
        return new BlockWorldState(this.bfN, b2, this.bfO);
    }

    public /* synthetic */ Object load(Object object) {
        return this.F((b)object);
    }
}

