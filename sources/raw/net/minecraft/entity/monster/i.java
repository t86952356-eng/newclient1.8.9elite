/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.e;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

class i
extends net.minecraft.entity.ai.e {
    private final e cEi;

    public i(e e2) {
        this.cEi = e2;
    }

    @Override
    public boolean WC() {
        return this.cEi.baU.Si().gw("mobGriefing") && this.cEi.Zh().df().xb() == Material.beo && this.cEi.VB().nextInt(20) == 0;
    }

    @Override
    public void WF() {
        int n2;
        int n3;
        w w2 = this.cEi.baU;
        Random random = this.cEi.VB();
        int n4 = bt.aF(this.cEi.gW - 2.0 + random.nextDouble() * 4.0);
        b b2 = new b(n4, n3 = bt.aF(this.cEi.gX + random.nextDouble() * 3.0), n2 = bt.aF(this.cEi.gY - 2.0 + random.nextDouble() * 4.0));
        IBlockState iBlockState = w2.L(b2);
        Block block = iBlockState.df();
        if (e.cEc.contains(block)) {
            this.cEi.E(iBlockState);
            w2.d(b2, Blocks.cLc.xM());
        }
    }
}

