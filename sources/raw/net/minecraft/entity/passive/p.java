/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCarrot;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.ad;
import net.minecraft.entity.passive.l;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.w;

class p
extends ad {
    private final l cGE;
    private boolean cGF;
    private boolean cGG = false;

    public p(l l2) {
        super(l2, 0.7f, 16);
        this.cGE = l2;
    }

    @Override
    public boolean WC() {
        if (this.cyG <= 0) {
            if (!this.cGE.baU.Si().gw("mobGriefing")) {
                return false;
            }
            this.cGG = false;
            this.cGF = this.cGE.aaZ();
        }
        return super.WC();
    }

    @Override
    public boolean WD() {
        return this.cGG && super.WD();
    }

    @Override
    public void WG() {
        super.WG();
    }

    @Override
    public void WE() {
        super.WE();
    }

    @Override
    public void WF() {
        super.WF();
        this.cGE.UR().d((double)this.cyI.wt() + 0.5, this.cyI.wu() + 1, (double)this.cyI.wx() + 0.5, 10.0f, this.cGE.Vg());
        if (this.WT()) {
            w w2 = this.cGE.baU;
            b b2 = this.cyI.aqX();
            IBlockState iBlockState = w2.L(b2);
            Block block = iBlockState.df();
            if (this.cGG && block instanceof BlockCarrot && iBlockState.b(BlockCarrot.aTy) == 7) {
                w2.a(b2, Blocks.cLc.xM(), 2);
                w2.c(b2, true);
                this.cGE.abb();
            }
            this.cGG = false;
            this.cyG = 10;
        }
    }

    @Override
    protected boolean ab(w w2, b b2) {
        IBlockState iBlockState;
        Block block = w2.L(b2).df();
        if (block == Blocks.cMm && (block = (iBlockState = w2.L(b2 = b2.aqX())).df()) instanceof BlockCarrot && iBlockState.b(BlockCarrot.aTy) == 7 && this.cGF && !this.cGG) {
            this.cGG = true;
            return true;
        }
        return false;
    }
}

