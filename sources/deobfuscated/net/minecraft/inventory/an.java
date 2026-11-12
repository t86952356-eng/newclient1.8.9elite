/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.item.w;
import net.minecraft.entity.player.a;
import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.item.co;
import net.minecraft.item.crafting.c;
import net.minecraft.stats.b;
import net.minecraft.util.bt;

public class an
extends ak {
    private final a cUq;
    private int cUr;

    public an(a a2, ab ab2, int n2, int n3, int n4) {
        super(ab2, n2, n3, n4);
        this.cUq = a2;
    }

    @Override
    public boolean H(co co2) {
        return false;
    }

    @Override
    public co cf(int n2) {
        if (this.GJ()) {
            this.cUr += Math.min(n2, this.ls().cWZ);
        }
        return super.cf(n2);
    }

    @Override
    public void a(a a2, co co2) {
        this.al(co2);
        super.a(a2, co2);
    }

    @Override
    protected void d(co co2, int n2) {
        this.cUr += n2;
        this.al(co2);
    }

    @Override
    protected void al(co co2) {
        co2.a(this.cUq.baU, this.cUq, this.cUr);
        if (!this.cUq.baU.dDw) {
            int n2;
            int n3 = this.cUr;
            float f2 = c.aeA().aN(co2);
            if (f2 == 0.0f) {
                n3 = 0;
            } else if (f2 < 1.0f) {
                n2 = bt.bL((float)n3 * f2);
                if (n2 < bt.bM((float)n3 * f2) && Math.random() < (double)((float)n3 * f2 - (float)n2)) {
                    ++n2;
                }
                n3 = n2;
            }
            while (n3 > 0) {
                n2 = w.fl(n3);
                n3 -= n2;
                this.cUq.baU.G(new w(this.cUq.baU, this.cUq.gW, this.cUq.gX + 0.5, this.cUq.gY + 0.5, n2));
            }
        }
        this.cUr = 0;
        if (co2.bP() == Items.cPn) {
            this.cUq.a(b.doJ);
        }
        if (co2.bP() == Items.cQZ) {
            this.cUq.a(b.doO);
        }
    }
}

