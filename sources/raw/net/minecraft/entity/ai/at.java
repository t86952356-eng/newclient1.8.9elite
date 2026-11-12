/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.y;
import net.minecraft.entity.r;

public class at
extends e {
    private final y czx;
    private boolean czy;

    public at(y y2) {
        this.czx = y2;
        this.eO(5);
    }

    @Override
    public boolean WC() {
        if (!this.czx.abl()) {
            return false;
        }
        if (this.czx.isInWater()) {
            return false;
        }
        if (!this.czx.aO) {
            return false;
        }
        r r2 = this.czx.abn();
        return r2 == null || (!(this.czx.T((c)r2) < 144.0) || r2.VC() == null) && this.czy;
    }

    @Override
    public void WG() {
        this.czx.UU().aiL();
        this.czx.aL(true);
    }

    @Override
    public void WE() {
        this.czx.aL(false);
    }

    public void aL(boolean bl2) {
        this.czy = bl2;
    }
}

