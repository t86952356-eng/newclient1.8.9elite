/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.chunk;

import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher;

class ChunkRenderDispatcher$1
implements Runnable {
    final /* synthetic */ ChunkCompileTaskGenerator bSO;
    final /* synthetic */ ChunkRenderDispatcher bSP;

    ChunkRenderDispatcher$1() {
        this.bSP = var1_1;
        this.bSO = var2_2;
    }

    @Override
    public void run() {
        this.bSP.bSG.remove(this.bSO);
    }
}

