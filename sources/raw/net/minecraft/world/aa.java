/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import java.util.concurrent.Callable;
import net.minecraft.world.w;

class aa
implements Callable<String> {
    final /* synthetic */ w dDH;

    aa(w w2) {
        this.dDH = w2;
    }

    public String HV() {
        return this.dDH.dDn.Hm();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

