/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.chunk;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.av;

class ChunkRenderDispatcher$3
implements Runnable {
    final /* synthetic */ av bSS;
    final /* synthetic */ WorldRenderer bST;
    final /* synthetic */ RenderChunk bSU;
    final /* synthetic */ CompiledChunk bSV;
    final /* synthetic */ ChunkRenderDispatcher bSW;

    ChunkRenderDispatcher$3() {
        this.bSW = var1_1;
        this.bSS = var2_2;
        this.bST = var3_3;
        this.bSU = var4_4;
        this.bSV = var5_5;
    }

    @Override
    public void run() {
        this.bSW.a(this.bSS, this.bST, this.bSU, this.bSV);
    }
}

