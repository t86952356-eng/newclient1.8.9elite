/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBanner;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockBanner$BlockBannerStanding
extends BlockBanner {
    public BlockBanner$BlockBannerStanding() {
        this.h(this.aSG.zS().a(aSW, 0));
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!w2.L(b2.aqY()).df().xb().zw()) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
        }
        super.a(w2, b2, iBlockState, block);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aSW, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aSW);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aSW);
    }
}

