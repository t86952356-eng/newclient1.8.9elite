/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.BlockBeacon$1;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.j;
import net.minecraft.util.b;

class BlockBeacon$1$1
implements Runnable {
    final /* synthetic */ b aTa;
    final /* synthetic */ BlockBeacon$1 aTb;

    BlockBeacon$1$1() {
        this.aTb = var1_1;
        this.aTa = var2_2;
    }

    @Override
    public void run() {
        d d2 = this.aTb.aSY.K(this.aTa);
        if (d2 instanceof j) {
            ((j)d2).aqj();
            this.aTb.aSY.c(this.aTa, Blocks.cOa, 1, 0);
        }
    }
}

