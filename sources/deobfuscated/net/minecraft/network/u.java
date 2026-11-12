/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.channel.local.LocalEventLoopGroup
 */
package net.minecraft.network;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.local.LocalEventLoopGroup;
import net.minecraft.util.bo;

class u
extends bo<LocalEventLoopGroup> {
    u() {
    }

    protected LocalEventLoopGroup afo() {
        return new LocalEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build());
    }

    @Override
    protected /* synthetic */ Object afm() {
        return this.afo();
    }
}

