/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.ad;
import net.minecraft.entity.passive.z;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class u
extends ad {
    private final z cyb;
    private boolean cyc;
    private boolean cyd;
    private int cye;

    public u(z z2, double d2) {
        super(z2, d2, 16);
        this.cyb = z2;
    }

    @Override
    public boolean WC() {
        if (this.cyG <= 0) {
            if (!this.cyb.baU.Si().gw("mobGriefing")) {
                return false;
            }
            this.cye = -1;
            this.cyc = this.cyb.abA();
            this.cyd = this.cyb.abz();
        }
        return super.WC();
    }

    @Override
    public boolean WD() {
        return this.cye >= 0 && super.WD();
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
        this.cyb.UR().d((double)this.cyI.wt() + 0.5, this.cyI.wu() + 1, (double)this.cyI.wx() + 0.5, 10.0f, this.cyb.Vg());
        if (this.WT()) {
            w w2 = this.cyb.baU;
            b b2 = this.cyI.aqX();
            IBlockState iBlockState = w2.L(b2);
            Block block = iBlockState.df();
            if (this.cye == 0 && block instanceof BlockCrops && iBlockState.b(BlockCrops.aTy) == 7) {
                w2.c(b2, true);
            } else if (this.cye == 1 && block == Blocks.cLc) {
                net.minecraft.inventory.ad ad2 = this.cyb.abw();
                for (int i2 = 0; i2 < ad2.YI(); ++i2) {
                    co co2 = ad2.fi(i2);
                    boolean bl2 = false;
                    if (co2 != null) {
                        if (co2.bP() == Items.cPR) {
                            w2.a(b2, Blocks.cMl.xM(), 3);
                            bl2 = true;
                        } else if (co2.bP() == Items.cRW) {
                            w2.a(b2, Blocks.cOe.xM(), 3);
                            bl2 = true;
                        } else if (co2.bP() == Items.cRV) {
                            w2.a(b2, Blocks.cOd.xM(), 3);
                            bl2 = true;
                        }
                    }
                    if (!bl2) continue;
                    --co2.cWZ;
                    if (co2.cWZ > 0) break;
                    ad2.g(i2, null);
                    break;
                }
            }
            this.cye = -1;
            this.cyG = 10;
        }
    }

    @Override
    protected boolean ab(w w2, b b2) {
        Block block = w2.L(b2).df();
        if (block == Blocks.cMm) {
            IBlockState iBlockState = w2.L(b2 = b2.aqX());
            block = iBlockState.df();
            if (block instanceof BlockCrops && iBlockState.b(BlockCrops.aTy) == 7 && this.cyd && (this.cye == 0 || this.cye < 0)) {
                this.cye = 0;
                return true;
            }
            if (block == Blocks.cLc && this.cyc && (this.cye == 1 || this.cye < 0)) {
                this.cye = 1;
                return true;
            }
        }
        return false;
    }
}

