/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.storage;

import java.util.concurrent.Callable;
import net.minecraft.world.storage.o;

class u
implements Callable<String> {
    final /* synthetic */ o dUy;

    u(o o2) {
        this.dUy = o2;
    }

    public String HV() {
        return String.valueOf(this.dUy.csP);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

