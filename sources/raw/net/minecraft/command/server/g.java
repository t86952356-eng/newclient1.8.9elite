/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import java.util.concurrent.Callable;
import net.minecraft.command.server.e;

class g
implements Callable<String> {
    final /* synthetic */ e cpa;

    g(e e2) {
        this.cpa = e2;
    }

    public String HV() {
        return this.cpa.xU();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

