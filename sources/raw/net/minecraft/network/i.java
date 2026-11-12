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
import net.minecraft.network.h;
import net.minecraft.util.s;

class i
implements GenericFutureListener<Future<? super Void>> {
    final /* synthetic */ s cZj;
    final /* synthetic */ h cZk;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    i(h h2, s s2) {
        this.cZk = h2;
        this.cZj = s2;
    }

    public void operationComplete(Future<? super Void> future) {
        this.cZk.cYU.i(this.cZj);
    }
}

