/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.inventory.ad;
import net.minecraft.inventory.v;

class w
extends ad {
    final /* synthetic */ v cTI;

    w(v v2, String string, boolean bl2, int n2) {
        this.cTI = v2;
        super(string, bl2, n2);
    }

    @Override
    public void Lw() {
        super.Lw();
        this.cTI.b(this);
    }
}

