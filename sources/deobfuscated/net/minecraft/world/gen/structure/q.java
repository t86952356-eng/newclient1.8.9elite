/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.concurrent.Callable;
import net.minecraft.world.b;
import net.minecraft.world.gen.structure.o;

class q
implements Callable<String> {
    final /* synthetic */ int dQo;
    final /* synthetic */ int dQp;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    q(o o2, int n2, int n3) {
        this.dQo = n2;
        this.dQp = n3;
    }

    public String HV() {
        return String.valueOf(b.aK(this.dQo, this.dQp));
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

