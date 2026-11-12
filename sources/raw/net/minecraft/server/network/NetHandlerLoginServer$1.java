/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.Future
 */
package net.minecraft.server.network;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;
import net.minecraft.server.network.NetHandlerLoginServer;

class NetHandlerLoginServer$1
implements ChannelFutureListener {
    final /* synthetic */ NetHandlerLoginServer dnx;

    NetHandlerLoginServer$1(NetHandlerLoginServer netHandlerLoginServer) {
        this.dnx = netHandlerLoginServer;
    }

    public void a(ChannelFuture channelFuture) {
        this.dnx.dnq.gp(this.dnx.dnp.alW());
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

