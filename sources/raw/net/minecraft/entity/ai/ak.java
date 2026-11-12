/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockBed$EnumPartType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.ad;
import net.minecraft.entity.passive.j;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.m;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class ak
extends ad {
    private final j czc;

    public ak(j j2, double d2) {
        super(j2, d2, 8);
        this.czc = j2;
    }

    @Override
    public boolean WC() {
        return this.czc.abl() && !this.czc.abm() && super.WC();
    }

    @Override
    public boolean WD() {
        return super.WD();
    }

    @Override
    public void WG() {
        super.WG();
        this.czc.abo().aL(false);
    }

    @Override
    public void WE() {
        super.WE();
        this.czc.aL(false);
    }

    @Override
    public void WF() {
        super.WF();
        this.czc.abo().aL(false);
        if (!this.WT()) {
            this.czc.aL(false);
        } else if (!this.czc.abm()) {
            this.czc.aL(true);
        }
    }

    @Override
    protected boolean ab(w w2, b b2) {
        if (!w2.aG(b2.aqX())) {
            return false;
        }
        IBlockState iBlockState = w2.L(b2);
        Block block = iBlockState.df();
        if (block == Blocks.cMg) {
            d d2 = w2.K(b2);
            return d2 instanceof m && ((m)d2).dsE < 1;
        }
        if (block == Blocks.cMo) {
            return true;
        }
        return block == Blocks.cLE && iBlockState.b(BlockBed.aTc) != BlockBed$EnumPartType.aTe;
    }
}

