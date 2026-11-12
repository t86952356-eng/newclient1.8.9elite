/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.entity.item.k;
import net.minecraft.entity.item.m;
import net.minecraft.entity.player.a;
import net.minecraft.world.w;

public class p
extends k {
    public p(w w2) {
        super(w2);
    }

    public p(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4);
    }

    @Override
    public boolean o(a a2) {
        if (this.crA != null && this.crA instanceof a && this.crA != a2) {
            return true;
        }
        if (this.crA != null && this.crA != a2) {
            return false;
        }
        if (!this.baU.dDw) {
            a2.D(this);
        }
        return true;
    }

    @Override
    public void b(int n2, int n3, int n4, boolean bl2) {
        if (bl2) {
            if (this.crA != null) {
                this.crA.D(null);
            }
            if (this.YA() == 0) {
                this.ff(-this.YB());
                this.fe(10);
                this.be(50.0f);
                this.TM();
            }
        }
    }

    @Override
    public m Wm() {
        return m.cCG;
    }
}

