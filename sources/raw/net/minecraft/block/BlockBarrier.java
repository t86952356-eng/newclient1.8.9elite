/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockBarrier
extends Block {
    protected BlockBarrier() {
        super(Material.beW);
        this.xh();
        this.K(6000001.0f);
        this.xD();
        this.aSn = true;
    }

    @Override
    public int xg() {
        return -1;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public float xF() {
        return 1.0f;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
    }
}

