/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import java.util.concurrent.Callable;
import net.minecraft.crash.i;
import net.minecraft.util.b;
import net.minecraft.world.w;

class x
implements Callable<String> {
    final /* synthetic */ b dDE;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    x(w w2, b b2) {
        this.dDE = b2;
    }

    public String HV() {
        return i.Z(this.dDE);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

