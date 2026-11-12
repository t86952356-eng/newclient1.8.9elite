/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.server;

import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

class MinecraftServer$2
implements Callable<String> {
    final /* synthetic */ MinecraftServer dlr;

    MinecraftServer$2(MinecraftServer minecraftServer) {
        this.dlr = minecraftServer;
    }

    public String HV() {
        return this.dlr.dkB.dhU ? this.dlr.dkB.ajw() : "N/A (disabled)";
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

