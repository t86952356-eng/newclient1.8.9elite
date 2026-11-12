/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.pathfinding;

import net.minecraft.entity.c;
import net.minecraft.entity.p;
import net.minecraft.pathfinding.b;
import net.minecraft.pathfinding.f;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class e
extends f {
    private net.minecraft.util.b dgh;

    public e(p p2, w w2) {
        super(p2, w2);
    }

    @Override
    public b al(net.minecraft.util.b b2) {
        this.dgh = b2;
        return super.al(b2);
    }

    @Override
    public b au(c c2) {
        this.dgh = new net.minecraft.util.b(c2);
        return super.au(c2);
    }

    @Override
    public boolean e(c c2, double d2) {
        b b2 = this.au(c2);
        if (b2 != null) {
            return this.a(b2, d2);
        }
        this.dgh = new net.minecraft.util.b(c2);
        this.LL = d2;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void aiI() {
        block4: {
            block5: {
                if (!this.aiK()) {
                    super.aiI();
                    return;
                }
                if (this.dgh == null) return;
                double d2 = this.cxk.width * this.cxk.width;
                if (!(this.cxk.ab(this.dgh) >= d2)) break block4;
                if (this.cxk.gX <= (double)this.dgh.wu()) break block5;
                net.minecraft.util.b b2 = new net.minecraft.util.b(this.dgh.wt(), bt.aF(this.cxk.gX), this.dgh.wx());
                if (!(this.cxk.ab(b2) >= d2)) break block4;
            }
            this.cxk.US().k(this.dgh.wt(), this.dgh.wu(), this.dgh.wx(), this.LL);
            return;
        }
        this.dgh = null;
    }
}

