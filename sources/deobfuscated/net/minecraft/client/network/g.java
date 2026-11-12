/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net.minecraft.client.network;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import javax.crypto.SecretKey;
import net.minecraft.client.network.f;

class g
implements GenericFutureListener<Future<? super Void>> {
    final /* synthetic */ SecretKey bEI;
    final /* synthetic */ f bEJ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    g(f f2, SecretKey secretKey) {
        this.bEJ = f2;
        this.bEI = secretKey;
    }

    public void operationComplete(Future<? super Void> future) {
        this.bEJ.bEG.a(this.bEI);
    }
}

