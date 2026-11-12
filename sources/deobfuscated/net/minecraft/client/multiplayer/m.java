/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.multiplayer;

import java.util.concurrent.Callable;
import net.minecraft.client.multiplayer.j;

class m
implements Callable<String> {
    final /* synthetic */ j bEp;

    m(j j2) {
        this.bEp = j2;
    }

    public String HV() {
        return this.bEp.bEk.bgK.Dw();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

