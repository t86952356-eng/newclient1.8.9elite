/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.storage;

import java.util.concurrent.Callable;
import net.minecraft.world.storage.o;

class w
implements Callable<String> {
    final /* synthetic */ o dUA;

    w(o o2) {
        this.dUA = o2;
    }

    public String HV() {
        return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", this.dUA.dUf, this.dUA.dUe, this.dUA.dUh, this.dUA.dUg);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

