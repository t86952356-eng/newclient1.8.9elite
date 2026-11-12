/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import java.util.Random;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.monster.ae;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.w;

class ag
extends e {
    private final ae cER;
    private int cES;

    public ag(ae ae2) {
        this.cER = ae2;
    }

    public void ZG() {
        if (this.cES == 0) {
            this.cES = 20;
        }
    }

    @Override
    public boolean WC() {
        return this.cES > 0;
    }

    @Override
    public void WF() {
        --this.cES;
        if (this.cES <= 0) {
            w w2 = this.cER.baU;
            Random random = this.cER.VB();
            b b2 = new b(this.cER);
            int n2 = 0;
            while (n2 <= 5 && n2 >= -5) {
                int n3 = 0;
                while (n3 <= 10 && n3 >= -10) {
                    int n4 = 0;
                    while (n4 <= 10 && n4 >= -10) {
                        b b3 = b2.C(n3, n2, n4);
                        IBlockState iBlockState = w2.L(b3);
                        if (iBlockState.df() == Blocks.cNg) {
                            if (w2.Si().gw("mobGriefing")) {
                                w2.c(b3, true);
                            } else {
                                w2.a(b3, iBlockState.b(BlockSilverfish.baw).za(), 3);
                            }
                            if (random.nextBoolean()) {
                                return;
                            }
                        }
                        n4 = n4 <= 0 ? 1 - n4 : 0 - n4;
                    }
                    n3 = n3 <= 0 ? 1 - n3 : 0 - n3;
                }
                n2 = n2 <= 0 ? 1 - n2 : 0 - n2;
            }
        }
    }
}

