/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.crash;

import java.util.concurrent.Callable;
import net.minecraft.crash.i;
import net.minecraft.util.b;

class n
implements Callable<String> {
    final /* synthetic */ b cpt;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    n(b b2) {
        this.cpt = b2;
    }

    public String HV() {
        return i.Z(this.cpt);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

