/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.storage;

import java.util.concurrent.Callable;
import net.minecraft.world.storage.o;

class t
implements Callable<String> {
    final /* synthetic */ o dUx;

    t(o o2) {
        this.dUx = o2;
    }

    public String HV() {
        return String.format("%d game time, %d day time", this.dUx.dTZ, this.dUx.worldTime);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

