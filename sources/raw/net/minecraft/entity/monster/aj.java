/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.monster.ai;
import net.minecraft.entity.monster.an;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;

class aj
extends e {
    private final ai cEZ;
    private int cFa;

    public aj(ai ai2) {
        this.cEZ = ai2;
        this.eO(2);
    }

    @Override
    public boolean WC() {
        r r2 = this.cEZ.UW();
        return r2 != null && r2.TS() && (!(r2 instanceof a) || !((a)r2).cIt.cJJ);
    }

    @Override
    public void WG() {
        this.cFa = 300;
        super.WG();
    }

    @Override
    public boolean WD() {
        r r2 = this.cEZ.UW();
        return r2 != null && r2.TS() && (!(r2 instanceof a) || !((a)r2).cIt.cJJ) && --this.cFa > 0;
    }

    @Override
    public void WF() {
        this.cEZ.a(this.cEZ.UW(), 10.0f, 10.0f);
        ((an)this.cEZ.US()).c(this.cEZ.pl, this.cEZ.ZA());
    }
}

