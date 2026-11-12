/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.p;
import net.minecraft.pathfinding.b;
import net.minecraft.pathfinding.f;
import net.minecraft.pathfinding.h;

public abstract class k
extends e {
    protected p cxk;
    protected net.minecraft.util.b cxl = net.minecraft.util.b.dtN;
    protected BlockDoor cxm;
    boolean cxn;
    float cxo;
    float cxp;

    public k(p p2) {
        this.cxk = p2;
        if (!(p2.UU() instanceof f)) {
            throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
        }
    }

    @Override
    public boolean WC() {
        if (!this.cxk.crR) {
            return false;
        }
        f f2 = (f)this.cxk.UU();
        b b2 = f2.aiH();
        if (b2 != null && !b2.kM() && f2.aiS()) {
            for (int i2 = 0; i2 < Math.min(b2.aiE() + 2, b2.aiD()); ++i2) {
                h h2 = b2.gG(i2);
                this.cxl = new net.minecraft.util.b(h2.dgk, h2.dgl + 1, h2.dgm);
                if (!(this.cxk.M(this.cxl.wt(), this.cxk.gX, this.cxl.wx()) <= 2.25)) continue;
                this.cxm = this.af(this.cxl);
                if (this.cxm == null) continue;
                return true;
            }
            this.cxl = new net.minecraft.util.b(this.cxk).aqX();
            this.cxm = this.af(this.cxl);
            return this.cxm != null;
        }
        return false;
    }

    @Override
    public boolean WD() {
        return !this.cxn;
    }

    @Override
    public void WG() {
        this.cxn = false;
        this.cxo = (float)((double)((float)this.cxl.wt() + 0.5f) - this.cxk.gW);
        this.cxp = (float)((double)((float)this.cxl.wx() + 0.5f) - this.cxk.gY);
    }

    @Override
    public void WF() {
        float f2;
        float f3 = (float)((double)((float)this.cxl.wt() + 0.5f) - this.cxk.gW);
        float f4 = this.cxo * f3 + this.cxp * (f2 = (float)((double)((float)this.cxl.wx() + 0.5f) - this.cxk.gY));
        if (f4 < 0.0f) {
            this.cxn = true;
        }
    }

    private BlockDoor af(net.minecraft.util.b b2) {
        Block block = this.cxk.baU.L(b2).df();
        return block instanceof BlockDoor && block.xb() == Material.ber ? (BlockDoor)block : null;
    }
}

