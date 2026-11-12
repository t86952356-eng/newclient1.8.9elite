/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import java.util.concurrent.Callable;
import net.minecraft.command.server.e;

class f
implements Callable<String> {
    final /* synthetic */ e coZ;

    f(e e2) {
        this.coZ = e2;
    }

    public String HV() {
        return this.coZ.Sy();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

