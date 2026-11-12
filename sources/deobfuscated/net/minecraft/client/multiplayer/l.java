/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.multiplayer;

import java.util.concurrent.Callable;
import net.minecraft.client.multiplayer.j;

class l
implements Callable<String> {
    final /* synthetic */ j bEo;

    l(j j2) {
        this.bEo = j2;
    }

    public String HV() {
        return this.bEo.bEj.size() + " total; " + String.valueOf(this.bEo.bEj);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

