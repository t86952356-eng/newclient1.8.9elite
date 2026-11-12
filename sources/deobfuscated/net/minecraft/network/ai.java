/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net.minecraft.network;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.network.ab;
import net.minecraft.network.r;
import net.minecraft.util.s;

class ai
implements GenericFutureListener<Future<? super Void>> {
    final /* synthetic */ r daq;
    final /* synthetic */ s dar;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ai(ab ab2, r r2, s s2) {
        this.daq = r2;
        this.dar = s2;
    }

    public void operationComplete(Future<? super Void> future) {
        this.daq.i(this.dar);
    }
}

