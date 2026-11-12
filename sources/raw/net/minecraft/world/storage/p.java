/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.storage;

import java.util.concurrent.Callable;
import net.minecraft.world.storage.o;

class p
implements Callable<String> {
    final /* synthetic */ o dUt;

    p(o o2) {
        this.dUt = o2;
    }

    public String HV() {
        return String.valueOf(this.dUt.avD());
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

