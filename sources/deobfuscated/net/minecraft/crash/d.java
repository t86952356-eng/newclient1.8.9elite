/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.crash;

import java.util.concurrent.Callable;
import net.minecraft.crash.a;

class d
implements Callable<String> {
    d(a a2) {
    }

    public String HV() {
        return System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

