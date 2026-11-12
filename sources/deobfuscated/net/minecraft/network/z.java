/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 */
package net.minecraft.network;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import net.minecraft.network.r;

class z
extends ChannelInitializer<Channel> {
    final /* synthetic */ r dac;

    z(r r2) {
        this.dac = r2;
    }

    protected void initChannel(Channel channel) {
        channel.pipeline().addLast("packet_handler", (ChannelHandler)this.dac);
    }
}

