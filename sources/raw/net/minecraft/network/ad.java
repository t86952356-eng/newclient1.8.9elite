/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.channel.epoll.EpollEventLoopGroup
 */
package net.minecraft.network;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.epoll.EpollEventLoopGroup;
import net.minecraft.util.bo;

class ad
extends bo<EpollEventLoopGroup> {
    ad() {
    }

    protected EpollEventLoopGroup afn() {
        return new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build());
    }

    @Override
    protected /* synthetic */ Object afm() {
        return this.afn();
    }
}

