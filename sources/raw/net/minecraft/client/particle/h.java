/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.particle.ae;
import net.minecraft.client.particle.bx;
import net.minecraft.client.particle.g;
import net.minecraft.world.w;

public class h
implements bx {
    @Override
    public ae a(int n2, w w2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        IBlockState iBlockState = Block.aL(nArray[0]);
        return iBlockState.df().xg() == -1 ? null : new g(w2, d2, d3, d4, d5, d6, d7, iBlockState).Iv();
    }
}

