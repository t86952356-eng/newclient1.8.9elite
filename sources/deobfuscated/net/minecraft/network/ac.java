/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.channel.nio.NioEventLoopGroup
 */
package net.minecraft.network;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.nio.NioEventLoopGroup;
import net.minecraft.util.bo;

class ac
extends bo<NioEventLoopGroup> {
    ac() {
    }

    protected NioEventLoopGroup afl() {
        return new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build());
    }

    @Override
    protected /* synthetic */ Object afm() {
        return this.afl();
    }
}

