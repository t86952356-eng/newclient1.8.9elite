/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.server;

import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

class MinecraftServer$3
implements Callable<String> {
    final /* synthetic */ MinecraftServer dls;

    MinecraftServer$3(MinecraftServer minecraftServer) {
        this.dls = minecraftServer;
    }

    public String HV() {
        return this.dls.dkH.ale() + " / " + this.dls.dkH.getMaxPlayers() + "; " + String.valueOf(this.dls.dkH.amB());
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

