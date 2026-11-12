/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.server.network;

import net.minecraft.network.r;
import net.minecraft.network.status.client.b;
import net.minecraft.network.status.server.a;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ba;
import net.minecraft.util.s;

public class NetHandlerStatusServer
implements net.minecraft.network.status.b {
    private static final ba dnG = new s("Status request has been handled.");
    private final MinecraftServer dnH;
    private final r dnI;
    private boolean dnJ;

    public NetHandlerStatusServer(MinecraftServer minecraftServer, r r2) {
        this.dnH = minecraftServer;
        this.dnI = r2;
    }

    @Override
    public void f(ba ba2) {
    }

    @Override
    public void a(net.minecraft.network.status.client.a a2) {
        if (this.dnJ) {
            this.dnI.i(dnG);
        } else {
            this.dnJ = true;
            this.dnI.B(new a(this.dnH.alT()));
        }
    }

    @Override
    public void a(b b2) {
        this.dnI.B(new net.minecraft.network.status.server.b(b2.aiw()));
        this.dnI.i(dnG);
    }
}

