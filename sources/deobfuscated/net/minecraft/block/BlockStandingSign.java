/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSign;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockStandingSign
extends BlockSign {
    public static final PropertyInteger bbs = PropertyInteger.e("rotation", 0, 15);

    public BlockStandingSign() {
        this.h(this.aSG.zS().a(bbs, 0));
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
        return this.xM().a(bbs, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(bbs);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bbs);
    }
}

