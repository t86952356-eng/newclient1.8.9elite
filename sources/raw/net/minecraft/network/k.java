/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network;

import java.util.concurrent.Callable;
import net.minecraft.network.aj;
import net.minecraft.network.h;

class k
implements Callable<String> {
    final /* synthetic */ aj cZm;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    k(h h2, aj aj2) {
        this.cZm = aj2;
    }

    public String HV() {
        return this.cZm.getClass().getCanonicalName();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

