/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.server.network;

import net.minecraft.network.handshake.client.a;
import net.minecraft.network.r;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.NetHandlerLoginServer;
import net.minecraft.server.network.NetHandlerStatusServer;
import net.minecraft.util.ba;
import net.minecraft.util.s;

public class NetHandlerHandshakeTCP
implements net.minecraft.network.handshake.a {
    private final MinecraftServer dni;
    private final r dnj;

    public NetHandlerHandshakeTCP(MinecraftServer minecraftServer, r r2) {
        this.dni = minecraftServer;
        this.dnj = r2;
    }

    @Override
    public void a(a a2) {
        switch (a2.afI()) {
            case cYI: {
                this.dnj.a(net.minecraft.network.a.cYI);
                if (a2.afJ() > 47) {
                    s s2 = new s("Outdated server! I'm still on 1.8.9");
                    this.dnj.B(new net.minecraft.network.login.server.a(s2));
                    this.dnj.i(s2);
                    break;
                }
                if (a2.afJ() < 47) {
                    s s3 = new s("Outdated client! Please use 1.8.9");
                    this.dnj.B(new net.minecraft.network.login.server.a(s3));
                    this.dnj.i(s3);
                    break;
                }
                this.dnj.b(new NetHandlerLoginServer(this.dni, this.dnj));
                break;
            }
            case cYH: {
                this.dnj.a(net.minecraft.network.a.cYH);
                this.dnj.b(new NetHandlerStatusServer(this.dni, this.dnj));
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + String.valueOf((Object)a2.afI()));
            }
        }
    }

    @Override
    public void f(ba ba2) {
    }
}

