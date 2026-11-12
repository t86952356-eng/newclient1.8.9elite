/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 */
package net.minecraft.client.renderer.chunk;

import com.google.common.util.concurrent.ListenableFuture;

class ChunkRenderWorker$1
implements Runnable {
    final /* synthetic */ ListenableFuture bTa;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    ChunkRenderWorker$1() {
        void var2_-1;
        this.bTa = var2_-1;
    }

    @Override
    public void run() {
        this.bTa.cancel(false);
    }
}

