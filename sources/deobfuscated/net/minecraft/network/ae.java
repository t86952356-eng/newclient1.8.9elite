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

class ae
extends bo<LocalEventLoopGroup> {
    ae() {
    }

    protected LocalEventLoopGroup afo() {
        return new LocalEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Server IO #%d").setDaemon(true).build());
    }

    @Override
    protected /* synthetic */ Object afm() {
        return this.afo();
    }
}

