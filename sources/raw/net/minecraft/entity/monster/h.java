/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.e;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

class h
extends net.minecraft.entity.ai.e {
    private final e cEh;

    public h(e e2) {
        this.cEh = e2;
    }

    @Override
    public boolean WC() {
        return this.cEh.baU.Si().gw("mobGriefing") && this.cEh.Zh().df().xb() != Material.beo && this.cEh.VB().nextInt(2000) == 0;
    }

    @Override
    public void WF() {
        Random random = this.cEh.VB();
        w w2 = this.cEh.baU;
        int n2 = bt.aF(this.cEh.gW - 1.0 + random.nextDouble() * 2.0);
        int n3 = bt.aF(this.cEh.gX + random.nextDouble() * 2.0);
        int n4 = bt.aF(this.cEh.gY - 1.0 + random.nextDouble() * 2.0);
        b b2 = new b(n2, n3, n4);
        Block block = w2.L(b2).df();
        Block block2 = w2.L(b2.aqY()).df();
        if (this.a(w2, b2, this.cEh.Zh().df(), block, block2)) {
            w2.a(b2, this.cEh.Zh(), 3);
            this.cEh.E(Blocks.cLc.xM());
        }
    }

    private boolean a(w w2, b b2, Block block, Block block2, Block block3) {
        return block.d(w2, b2) && block2.xb() == Material.beo && block3.xb() != Material.beo && block3.xf();
    }
}

