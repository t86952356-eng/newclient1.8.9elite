/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.layer;

import java.util.concurrent.Callable;
import net.minecraft.world.biome.j;

class b
implements Callable<String> {
    final /* synthetic */ j dPo;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    b(j j2) {
        this.dPo = j2;
    }

    public String HV() {
        return String.valueOf(this.dPo);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

