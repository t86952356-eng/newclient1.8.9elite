/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.util.concurrent.Callable;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;

class p
implements Callable<String> {
    final /* synthetic */ int cYt;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    p(n n2, int n3) {
        this.cYt = n3;
    }

    public String HV() {
        return g.cXY[this.cYt];
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

