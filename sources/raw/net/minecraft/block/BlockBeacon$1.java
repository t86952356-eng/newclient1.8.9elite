/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.BlockBeacon$1$1;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.ai;
import net.minecraft.world.chunk.a;
import net.minecraft.world.w;

class BlockBeacon$1
implements Runnable {
    final /* synthetic */ w aSY;
    final /* synthetic */ b aSZ;

    BlockBeacon$1() {
        this.aSY = var1_1;
        this.aSZ = var2_2;
    }

    @Override
    public void run() {
        b b2;
        a a2 = this.aSY.aK(this.aSZ);
        for (int i2 = this.aSZ.wu() - 1; i2 >= 0 && a2.aM(b2 = new b(this.aSZ.wt(), i2, this.aSZ.wx())); --i2) {
            IBlockState iBlockState = this.aSY.L(b2);
            if (iBlockState.df() != Blocks.cOa) continue;
            ((ai)this.aSY).f(new BlockBeacon$1$1(this, b2));
        }
    }
}

