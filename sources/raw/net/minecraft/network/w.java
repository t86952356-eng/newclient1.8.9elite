/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net.minecraft.network;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.network.a;
import net.minecraft.network.aj;
import net.minecraft.network.r;

class w
implements Runnable {
    final /* synthetic */ a cZU;
    final /* synthetic */ a cZV;
    final /* synthetic */ aj cZW;
    final /* synthetic */ GenericFutureListener[] cZX;
    final /* synthetic */ r cZY;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    w(r r2, a a2, a a3, aj aj2, GenericFutureListener[] genericFutureListenerArray) {
        this.cZY = r2;
        this.cZU = a2;
        this.cZV = a3;
        this.cZW = aj2;
        this.cZX = genericFutureListenerArray;
    }

    @Override
    public void run() {
        if (this.cZU != this.cZV) {
            this.cZY.a(this.cZU);
        }
        ChannelFuture channelFuture = this.cZY.cZJ.writeAndFlush((Object)this.cZW);
        if (this.cZX != null) {
            channelFuture.addListeners(this.cZX);
        }
        channelFuture.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
    }
}

