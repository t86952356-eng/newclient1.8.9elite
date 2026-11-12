/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.av;
import net.minecraft.entity.monster.d;
import net.minecraft.entity.monster.w;
import net.minecraft.entity.r;
import net.minecraft.village.c;

public class j
extends av {
    w cxi;
    r cxj;

    public j(w w2) {
        super(w2, false, true);
        this.cxi = w2;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        c c2 = this.cxi.Zs();
        if (c2 == null) {
            return false;
        }
        this.cxj = c2.af(this.cxi);
        if (this.cxj instanceof d) {
            return false;
        }
        if (!this.a(this.cxj, false)) {
            if (this.czA.VB().nextInt(20) == 0) {
                this.cxj = c2.ag(this.cxi);
                return this.a(this.cxj, false);
            }
            return false;
        }
        return true;
    }

    @Override
    public void WG() {
        this.cxi.S(this.cxj);
        super.WG();
    }
}

