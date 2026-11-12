/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.passive.w;
import net.minecraft.util.bt;

class x
extends e {
    private final w cHn;

    public x(w w2) {
        this.cHn = w2;
    }

    @Override
    public boolean WC() {
        return true;
    }

    @Override
    public void WF() {
        int n2 = this.cHn.VG();
        if (n2 > 100) {
            this.cHn.y(0.0f, 0.0f, 0.0f);
        } else if (this.cHn.VB().nextInt(50) == 0 || !this.cHn.csz || !this.cHn.abk()) {
            float f2 = this.cHn.VB().nextFloat() * (float)Math.PI * 2.0f;
            float f3 = bt.bB(f2) * 0.2f;
            float f4 = -0.1f + this.cHn.VB().nextFloat() * 0.2f;
            float f5 = bt.bx(f2) * 0.2f;
            this.cHn.y(f3, f4, f5);
        }
    }
}

