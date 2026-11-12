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
import net.minecraft.client.network.e;
import net.minecraft.network.ab;
import net.minecraft.network.f;
import net.minecraft.network.r;

class ag
extends ChannelInitializer<Channel> {
    final /* synthetic */ ab dao;

    ag(ab ab2) {
        this.dao = ab2;
    }

    protected void initChannel(Channel channel) {
        r r2 = new r(f.cYQ);
        r2.b(new e(this.dao.daj, r2));
        this.dao.dam.add(r2);
        channel.pipeline().addLast("packet_handler", (ChannelHandler)r2);
    }
}

