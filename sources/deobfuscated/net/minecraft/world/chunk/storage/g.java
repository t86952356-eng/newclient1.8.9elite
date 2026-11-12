/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.chunk.storage;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.chunk.i;

public class g {
    private final int dJE;
    private int dJF;
    private int dJG;
    private char[] dJH;
    private i dJI;
    private i dJJ;

    public g(int n2, boolean bl2) {
        this.dJE = n2;
        this.dJH = new char[4096];
        this.dJI = new i();
        if (bl2) {
            this.dJJ = new i();
        }
    }

    public IBlockState V(int n2, int n3, int n4) {
        IBlockState iBlockState = Block.aRW.hS(this.dJH[n3 << 8 | n4 << 4 | n2]);
        return iBlockState != null ? iBlockState : Blocks.cLc.xM();
    }

    public void b(int n2, int n3, int n4, IBlockState iBlockState) {
        if (net.optifine.reflect.g.epV.F(iBlockState)) {
            iBlockState = (IBlockState)net.optifine.reflect.g.g(iBlockState, net.optifine.reflect.g.epW, new Object[0]);
        }
        IBlockState iBlockState2 = this.V(n2, n3, n4);
        Block block = iBlockState2.df();
        Block block2 = iBlockState.df();
        if (block != Blocks.cLc) {
            --this.dJF;
            if (block.xi()) {
                --this.dJG;
            }
        }
        if (block2 != Blocks.cLc) {
            ++this.dJF;
            if (block2.xi()) {
                ++this.dJG;
            }
        }
        this.dJH[n3 << 8 | n4 << 4 | n2] = (char)Block.aRW.x(iBlockState);
    }

    public Block W(int n2, int n3, int n4) {
        return this.V(n2, n3, n4).df();
    }

    public int X(int n2, int n3, int n4) {
        IBlockState iBlockState = this.V(n2, n3, n4);
        return iBlockState.df().c(iBlockState);
    }

    public boolean isEmpty() {
        return this.dJF == 0;
    }

    public boolean axW() {
        return this.dJG > 0;
    }

    public int axX() {
        return this.dJE;
    }

    public void z(int n2, int n3, int n4, int n5) {
        this.dJJ.u(n2, n3, n4, n5);
    }

    public int Y(int n2, int n3, int n4) {
        return this.dJJ.T(n2, n3, n4);
    }

    public void A(int n2, int n3, int n4, int n5) {
        this.dJI.u(n2, n3, n4, n5);
    }

    public int Z(int n2, int n3, int n4) {
        return this.dJI.T(n2, n3, n4);
    }

    public void axY() {
        IBlockState iBlockState = Blocks.cLc.xM();
        int n2 = 0;
        int n3 = 0;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < 16; ++i4) {
                    Block block = this.W(i4, i2, i3);
                    if (block == Blocks.cLc) continue;
                    ++n2;
                    if (!block.xi()) continue;
                    ++n3;
                }
            }
        }
        this.dJF = n2;
        this.dJG = n3;
    }

    public char[] axZ() {
        return this.dJH;
    }

    public void a(char[] cArray) {
        this.dJH = cArray;
    }

    public i aya() {
        return this.dJI;
    }

    public i ayb() {
        return this.dJJ;
    }

    public void a(i i2) {
        this.dJI = i2;
    }

    public void b(i i2) {
        this.dJJ = i2;
    }

    public int ayc() {
        return this.dJF;
    }
}

