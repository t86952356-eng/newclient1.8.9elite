/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.layer;

import java.util.concurrent.Callable;
import net.minecraft.world.biome.j;

class c
implements Callable<String> {
    final /* synthetic */ j dPp;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    c(j j2) {
        this.dPp = j2;
    }

    public String HV() {
        return String.valueOf(this.dPp);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

