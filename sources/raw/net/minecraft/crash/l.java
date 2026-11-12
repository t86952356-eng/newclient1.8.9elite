/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.crash;

import java.util.concurrent.Callable;
import net.minecraft.crash.i;
import net.minecraft.util.b;

class l
implements Callable<String> {
    final /* synthetic */ b cpr;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    l(b b2) {
        this.cpr = b2;
    }

    public String HV() {
        return i.Z(this.cpr);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

