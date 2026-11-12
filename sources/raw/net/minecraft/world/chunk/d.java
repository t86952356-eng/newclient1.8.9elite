/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.chunk;

import java.util.concurrent.Callable;
import net.minecraft.crash.i;
import net.minecraft.util.b;
import net.minecraft.world.chunk.a;

class d
implements Callable<String> {
    final /* synthetic */ b dJe;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    d(a a2, b b2) {
        this.dJe = b2;
    }

    public String HV() {
        return i.Z(this.dJe);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

