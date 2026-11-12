/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.inventory.ad;
import net.minecraft.inventory.j;

class k
extends ad {
    final /* synthetic */ j cTh;

    k(j j2, String string, boolean bl2, int n2) {
        this.cTh = j2;
        super(string, bl2, n2);
    }

    @Override
    public int YJ() {
        return 64;
    }

    @Override
    public void Lw() {
        super.Lw();
        this.cTh.b(this);
    }
}

