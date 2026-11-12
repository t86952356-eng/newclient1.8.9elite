/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.crash;

import java.util.concurrent.Callable;
import net.minecraft.crash.a;

class f
implements Callable<String> {
    f(a a2) {
    }

    public String HV() {
        Runtime runtime = Runtime.getRuntime();
        long l2 = runtime.maxMemory();
        long l3 = runtime.totalMemory();
        long l4 = runtime.freeMemory();
        long l5 = l2 / 1024L / 1024L;
        long l6 = l3 / 1024L / 1024L;
        long l7 = l4 / 1024L / 1024L;
        return l4 + " bytes (" + l7 + " MB) / " + l3 + " bytes (" + l6 + " MB) up to " + l2 + " bytes (" + l5 + " MB)";
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

