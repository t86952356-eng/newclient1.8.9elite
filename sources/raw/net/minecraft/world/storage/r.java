/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.storage;

import java.util.concurrent.Callable;
import net.minecraft.world.storage.o;

class r
implements Callable<String> {
    final /* synthetic */ o dUv;

    r(o o2) {
        this.dUv = o2;
    }

    public String HV() {
        return this.dUv.dTV;
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

