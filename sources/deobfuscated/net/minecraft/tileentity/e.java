/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import java.util.concurrent.Callable;
import net.minecraft.tileentity.d;

class e
implements Callable<String> {
    final /* synthetic */ d drg;

    e(d d2) {
        this.drg = d2;
    }

    public String HV() {
        return d.drd.get(this.drg.getClass()) + " // " + this.drg.getClass().getCanonicalName();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

