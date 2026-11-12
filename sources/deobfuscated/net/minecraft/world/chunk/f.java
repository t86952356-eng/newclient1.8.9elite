/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.chunk;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

public class f {
    private final short[] dJj = new short[65536];
    private final IBlockState dJk = Blocks.cLc.xM();

    public IBlockState S(int n2, int n3, int n4) {
        int n5 = n2 << 12 | n4 << 8 | n3;
        return this.is(n5);
    }

    public IBlockState is(int n2) {
        if (n2 >= 0 && n2 < this.dJj.length) {
            IBlockState iBlockState = Block.aRW.hS(this.dJj[n2]);
            return iBlockState != null ? iBlockState : this.dJk;
        }
        throw new IndexOutOfBoundsException("The coordinate is out of range");
    }

    public void a(int n2, int n3, int n4, IBlockState iBlockState) {
        int n5 = n2 << 12 | n4 << 8 | n3;
        this.a(n5, iBlockState);
    }

    public void a(int n2, IBlockState iBlockState) {
        if (n2 < 0 || n2 >= this.dJj.length) {
            throw new IndexOutOfBoundsException("The coordinate is out of range");
        }
        this.dJj[n2] = (short)Block.aRW.x(iBlockState);
    }
}

