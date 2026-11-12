/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 */
package net.minecraft.client.network;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import net.minecraft.client.multiplayer.e;
import net.minecraft.client.multiplayer.f;
import net.minecraft.client.network.r;
import net.minecraft.client.network.u;

class t
extends ChannelInitializer<Channel> {
    final /* synthetic */ e bFF;
    final /* synthetic */ f bFG;

    t(r r2, e e2, f f2) {
        this.bFF = e2;
        this.bFG = f2;
    }

    protected void initChannel(Channel channel) {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast(new ChannelHandler[]{new u(this)});
    }
}

