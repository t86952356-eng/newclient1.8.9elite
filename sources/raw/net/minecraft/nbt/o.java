/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.util.concurrent.Callable;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;

class o
implements Callable<String> {
    final /* synthetic */ String cYr;
    final /* synthetic */ n cYs;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    o(n n2, String string) {
        this.cYs = n2;
        this.cYr = string;
    }

    public String HV() {
        return g.cXY[this.cYs.cYq.get(this.cYr).aeF()];
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

