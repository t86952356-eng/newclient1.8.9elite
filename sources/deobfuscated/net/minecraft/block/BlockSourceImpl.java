/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.dispenser.e;
import net.minecraft.tileentity.d;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockSourceImpl
implements e {
    private final w baU;
    private final b baV;

    public BlockSourceImpl(w w2, b b2) {
        this.baU = w2;
        this.baV = b2;
    }

    @Override
    public w de() {
        return this.baU;
    }

    @Override
    public double getX() {
        return (double)this.baV.wt() + 0.5;
    }

    @Override
    public double getY() {
        return (double)this.baV.wu() + 0.5;
    }

    @Override
    public double getZ() {
        return (double)this.baV.wx() + 0.5;
    }

    @Override
    public b dg() {
        return this.baV;
    }

    @Override
    public int zg() {
        IBlockState iBlockState = this.baU.L(this.baV);
        return iBlockState.df().c(iBlockState);
    }

    @Override
    public <T extends d> T zh() {
        return (T)this.baU.K(this.baV);
    }
}

