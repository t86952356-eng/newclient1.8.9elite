/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.chunk;

import java.util.concurrent.Callable;
import net.minecraft.crash.i;
import net.minecraft.util.b;
import net.minecraft.world.chunk.a;

class c
implements Callable<String> {
    final /* synthetic */ b dJd;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    c(a a2, b b2) {
        this.dJd = b2;
    }

    public String HV() {
        return i.Z(this.dJd);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

