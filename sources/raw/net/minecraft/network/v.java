/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net.minecraft.network;

import hackclient.rise.fi;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.network.a;
import net.minecraft.network.r;

class v
implements Runnable {
    final /* synthetic */ a cZP;
    final /* synthetic */ a cZQ;
    final /* synthetic */ fi cZR;
    final /* synthetic */ GenericFutureListener[] cZS;
    final /* synthetic */ r cZT;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    v(r r2, a a2, a a3, fi fi2, GenericFutureListener[] genericFutureListenerArray) {
        this.cZT = r2;
        this.cZP = a2;
        this.cZQ = a3;
        this.cZR = fi2;
        this.cZS = genericFutureListenerArray;
    }

    @Override
    public void run() {
        if (this.cZP != this.cZQ) {
            this.cZT.a(this.cZP);
        }
        ChannelFuture channelFuture = this.cZT.cZJ.writeAndFlush(this.cZR.dq());
        if (this.cZS != null) {
            channelFuture.addListeners(this.cZS);
        }
        channelFuture.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
    }
}

