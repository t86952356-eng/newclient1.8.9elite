/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.pathfinder;

import net.minecraft.entity.c;
import net.minecraft.pathfinding.h;
import net.minecraft.util.bj;
import net.minecraft.util.bt;
import net.minecraft.world.l;

public abstract class a {
    protected l dSW;
    protected bj<h> dSX = new bj();
    protected int dSY;
    protected int dSZ;
    protected int dTa;

    public void a(l l2, c c2) {
        this.dSW = l2;
        this.dSX.CY();
        this.dSY = bt.bL(c2.width + 1.0f);
        this.dSZ = bt.bL(c2.height + 1.0f);
        this.dTa = bt.bL(c2.width + 1.0f);
    }

    public void azm() {
    }

    protected h ag(int n2, int n3, int n4) {
        int n5 = h.y(n2, n3, n4);
        h h2 = this.dSX.hE(n5);
        if (h2 == null) {
            h2 = new h(n2, n3, n4);
            this.dSX.c(n5, h2);
        }
        return h2;
    }

    public abstract h aF(c var1);

    public abstract h b(c var1, double var2, double var4, double var6);

    public abstract int a(h[] var1, c var2, h var3, h var4, float var5);
}

