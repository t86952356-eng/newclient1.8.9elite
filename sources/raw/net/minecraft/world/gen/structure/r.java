/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.concurrent.Callable;
import net.minecraft.world.gen.structure.o;

class r
implements Callable<String> {
    final /* synthetic */ o dQq;

    r(o o2) {
        this.dQq = o2;
    }

    public String HV() {
        return this.dQq.getClass().getCanonicalName();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

