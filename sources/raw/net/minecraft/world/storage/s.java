/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.storage;

import java.util.concurrent.Callable;
import net.minecraft.crash.i;
import net.minecraft.world.storage.o;

class s
implements Callable<String> {
    final /* synthetic */ o dUw;

    s(o o2) {
        this.dUw = o2;
    }

    public String HV() {
        return i.K(this.dUw.dTW, this.dUw.dTX, this.dUw.dTY);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

