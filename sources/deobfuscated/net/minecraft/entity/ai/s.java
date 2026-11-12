/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.y;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.pathfinding.d;
import net.minecraft.pathfinding.f;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class s
extends e {
    private final y cxR;
    private r cxS;
    w cxM;
    private final double cxT;
    private final d cxU;
    private int cxV;
    float cxW;
    float cxX;
    private boolean cxY;

    public s(y y2, double d2, float f2, float f3) {
        this.cxR = y2;
        this.cxM = y2.baU;
        this.cxT = d2;
        this.cxU = y2.UU();
        this.cxX = f2;
        this.cxW = f3;
        this.eO(3);
        if (!(y2.UU() instanceof f)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
        }
    }

    @Override
    public boolean WC() {
        r r2 = this.cxR.abn();
        if (r2 == null) {
            return false;
        }
        if (r2 instanceof a && ((a)r2).CZ()) {
            return false;
        }
        if (this.cxR.abm()) {
            return false;
        }
        if (this.cxR.T((c)r2) < (double)(this.cxX * this.cxX)) {
            return false;
        }
        this.cxS = r2;
        return true;
    }

    @Override
    public boolean WD() {
        return !this.cxU.aiK() && this.cxR.T((c)this.cxS) > (double)(this.cxW * this.cxW) && !this.cxR.abm();
    }

    @Override
    public void WG() {
        this.cxV = 0;
        this.cxY = ((f)this.cxR.UU()).aiR();
        ((f)this.cxR.UU()).bQ(false);
    }

    @Override
    public void WE() {
        this.cxS = null;
        this.cxU.aiL();
        ((f)this.cxR.UU()).bQ(true);
    }

    private boolean ag(b b2) {
        IBlockState iBlockState = this.cxM.L(b2);
        Block block = iBlockState.df();
        return block == Blocks.cLc || !block.xf();
    }

    @Override
    public void WF() {
        this.cxR.UR().b(this.cxS, 10.0f, this.cxR.Vg());
        if (!this.cxR.abm() && --this.cxV <= 0) {
            this.cxV = 10;
            if (!this.cxU.e(this.cxS, this.cxT) && !this.cxR.Vq() && this.cxR.T((c)this.cxS) >= 144.0) {
                int n2 = bt.aF(this.cxS.gW) - 2;
                int n3 = bt.aF(this.cxS.gY) - 2;
                int n4 = bt.aF(this.cxS.Us().dtI);
                for (int i2 = 0; i2 <= 4; ++i2) {
                    for (int i3 = 0; i3 <= 4; ++i3) {
                        if (i2 >= 1 && i3 >= 1 && i2 <= 3 && i3 <= 3 || !w.v(this.cxM, new b(n2 + i2, n4 - 1, n3 + i3)) || !this.ag(new b(n2 + i2, n4, n3 + i3)) || !this.ag(new b(n2 + i2, n4 + 1, n3 + i3))) continue;
                        this.cxR.b((double)((float)(n2 + i2) + 0.5f), (double)n4, (double)((float)(n3 + i3) + 0.5f), this.cxR.pl, this.cxR.pm);
                        this.cxU.aiL();
                        return;
                    }
                }
            }
        }
    }
}

