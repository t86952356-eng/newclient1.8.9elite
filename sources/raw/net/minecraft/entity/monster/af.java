/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import java.util.Random;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockSilverfish$EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.monster.ae;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

class af
extends bd {
    private final ae cEP;
    private ao aWT;
    private boolean cEQ;

    public af(ae ae2) {
        super(ae2, 1.0, 10);
        this.cEP = ae2;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        if (this.cEP.UW() != null) {
            return false;
        }
        if (!this.cEP.UU().aiK()) {
            return false;
        }
        Random random = this.cEP.VB();
        if (random.nextInt(10) == 0) {
            this.aWT = ao.g(random);
            b b2 = new b(this.cEP.gW, this.cEP.gX + 0.5, this.cEP.gY).x(this.aWT);
            IBlockState iBlockState = this.cEP.baU.L(b2);
            if (BlockSilverfish.w(iBlockState)) {
                this.cEQ = true;
                return true;
            }
        }
        this.cEQ = false;
        return super.WC();
    }

    @Override
    public boolean WD() {
        return !this.cEQ && super.WD();
    }

    @Override
    public void WG() {
        if (!this.cEQ) {
            super.WG();
        } else {
            w w2 = this.cEP.baU;
            b b2 = new b(this.cEP.gW, this.cEP.gX + 0.5, this.cEP.gY).x(this.aWT);
            IBlockState iBlockState = w2.L(b2);
            if (BlockSilverfish.w(iBlockState)) {
                w2.a(b2, Blocks.cNg.xM().a(BlockSilverfish.baw, BlockSilverfish$EnumType.x(iBlockState)), 3);
                this.cEP.Va();
                this.cEP.Tt();
            }
        }
    }
}

