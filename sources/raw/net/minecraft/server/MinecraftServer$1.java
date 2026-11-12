/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.server;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.be;

class MinecraftServer$1
implements be {
    private long fa = System.currentTimeMillis();

    MinecraftServer$1(MinecraftServer minecraftServer) {
    }

    @Override
    public void cv(String string) {
    }

    @Override
    public void cu(String string) {
    }

    @Override
    public void bv(int n2) {
        if (System.currentTimeMillis() - this.fa >= 1000L) {
            this.fa = System.currentTimeMillis();
            MinecraftServer.dku.info("Converting... " + n2 + "%");
        }
    }

    @Override
    public void Ao() {
    }

    @Override
    public void cx(String string) {
    }
}

