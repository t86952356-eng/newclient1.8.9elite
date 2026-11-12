/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.entity.ai.k;
import net.minecraft.entity.p;
import net.minecraft.world.f;

public class g
extends k {
    private int cwY;
    private int cwZ = -1;

    public g(p p2) {
        super(p2);
    }

    @Override
    public boolean WC() {
        if (!super.WC()) {
            return false;
        }
        if (!this.cxk.baU.Si().gw("mobGriefing")) {
            return false;
        }
        BlockDoor blockDoor = this.cxm;
        return !BlockDoor.f(this.cxk.baU, this.cxl);
    }

    @Override
    public void WG() {
        super.WG();
        this.cwY = 0;
    }

    @Override
    public boolean WD() {
        double d2 = this.cxk.aa(this.cxl);
        if (this.cwY <= 240) {
            BlockDoor blockDoor = this.cxm;
            if (!BlockDoor.f(this.cxk.baU, this.cxl) && d2 < 4.0) {
                boolean bl2 = true;
                return bl2;
            }
        }
        boolean bl3 = false;
        return bl3;
    }

    @Override
    public void WE() {
        super.WE();
        this.cxk.baU.b(this.cxk.getEntityId(), this.cxl, -1);
    }

    @Override
    public void WF() {
        super.WF();
        if (this.cxk.VB().nextInt(20) == 0) {
            this.cxk.baU.e(1010, this.cxl, 0);
        }
        ++this.cwY;
        int n2 = (int)((float)this.cwY / 240.0f * 10.0f);
        if (n2 != this.cwZ) {
            this.cxk.baU.b(this.cxk.getEntityId(), this.cxl, n2);
            this.cwZ = n2;
        }
        if (this.cwY == 240 && this.cxk.baU.agm() == f.dBU) {
            this.cxk.baU.aL(this.cxl);
            this.cxk.baU.e(1012, this.cxl, 0);
            this.cxk.baU.e(2001, this.cxl, Block.i(this.cxm));
        }
    }
}

