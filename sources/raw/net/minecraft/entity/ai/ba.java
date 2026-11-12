/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.z;
import net.minecraft.entity.player.a;
import net.minecraft.inventory.b;

public class ba
extends e {
    private final z czW;

    public ba(z z2) {
        this.czW = z2;
        this.eO(5);
    }

    @Override
    public boolean WC() {
        if (!this.czW.TS()) {
            return false;
        }
        if (this.czW.isInWater()) {
            return false;
        }
        if (!this.czW.aO) {
            return false;
        }
        if (this.czW.crY) {
            return false;
        }
        a a2 = this.czW.WB();
        return a2 != null && !(this.czW.T((c)a2) > 16.0) && a2.cHY instanceof b;
    }

    @Override
    public void WG() {
        this.czW.UU().aiL();
    }

    @Override
    public void WE() {
        this.czW.s(null);
    }
}

