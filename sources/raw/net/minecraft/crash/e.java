/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.crash;

import java.util.concurrent.Callable;
import net.minecraft.crash.a;

class e
implements Callable<String> {
    e(a a2) {
    }

    public String HV() {
        return System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

