/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.handler.timeout.ReadTimeoutHandler
 */
package net.minecraft.network;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import net.minecraft.network.ab;
import net.minecraft.network.an;
import net.minecraft.network.f;
import net.minecraft.network.r;
import net.minecraft.server.network.NetHandlerHandshakeTCP;
import net.minecraft.util.bv;
import net.minecraft.util.bw;
import net.minecraft.util.bx;
import net.minecraft.util.by;

class af
extends ChannelInitializer<Channel> {
    final /* synthetic */ ab dan;

    af(ab ab2) {
        this.dan = ab2;
    }

    protected void initChannel(Channel channel) {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("legacy_query", (ChannelHandler)new an(this.dan)).addLast("splitter", (ChannelHandler)new bw()).addLast("decoder", (ChannelHandler)new bv(f.cYQ)).addLast("prepender", (ChannelHandler)new by()).addLast("encoder", (ChannelHandler)new bx(f.cYR));
        r r2 = new r(f.cYQ);
        this.dan.dam.add(r2);
        channel.pipeline().addLast("packet_handler", (ChannelHandler)r2);
        r2.b(new NetHandlerHandshakeTCP(this.dan.daj, r2));
    }
}

