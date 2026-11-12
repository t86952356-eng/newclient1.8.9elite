/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.crash;

import java.util.concurrent.Callable;
import net.minecraft.crash.a;

class c
implements Callable<String> {
    c(a a2) {
    }

    public String HV() {
        return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

