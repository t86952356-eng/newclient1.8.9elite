/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.multiplayer;

import java.util.concurrent.Callable;
import net.minecraft.client.multiplayer.j;

class k
implements Callable<String> {
    final /* synthetic */ j bEn;

    k(j j2) {
        this.bEn = j2;
    }

    public String HV() {
        return this.bEn.bEi.size() + " total; " + String.valueOf(this.bEn.bEi);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

