/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.chunk;

import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher;

class ChunkRenderDispatcher$2
implements Runnable {
    final /* synthetic */ ChunkCompileTaskGenerator bSQ;
    final /* synthetic */ ChunkRenderDispatcher bSR;

    ChunkRenderDispatcher$2() {
        this.bSR = var1_1;
        this.bSQ = var2_2;
    }

    @Override
    public void run() {
        this.bSR.bSG.remove(this.bSQ);
    }
}

