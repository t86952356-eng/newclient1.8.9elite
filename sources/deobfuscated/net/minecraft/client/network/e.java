/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.network;

import net.minecraft.network.handshake.client.a;
import net.minecraft.network.r;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.NetHandlerLoginServer;
import net.minecraft.util.ba;

public class e
implements net.minecraft.network.handshake.a {
    private final MinecraftServer bEB;
    private final r bEC;

    public e(MinecraftServer minecraftServer, r r2) {
        this.bEB = minecraftServer;
        this.bEC = r2;
    }

    @Override
    public void a(a a2) {
        this.bEC.a(a2.afI());
        this.bEC.b(new NetHandlerLoginServer(this.bEB, this.bEC));
    }

    @Override
    public void f(ba ba2) {
    }
}

