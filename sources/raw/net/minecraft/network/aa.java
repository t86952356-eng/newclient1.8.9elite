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
import net.minecraft.network.aj;

class aa {
    private final aj dad;
    private final GenericFutureListener<? extends Future<? super Void>>[] dae;

    public aa(aj aj2, GenericFutureListener<? extends Future<? super Void>> ... genericFutureListenerArray) {
        this.dad = aj2;
        this.dae = genericFutureListenerArray;
    }
}

