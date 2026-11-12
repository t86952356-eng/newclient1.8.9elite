/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 */
package net.minecraft.client.renderer.chunk;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import net.minecraft.client.d;
import net.minecraft.client.renderer.RegionRenderCacheBuilder;
import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator;
import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status;
import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher;
import net.minecraft.client.renderer.chunk.ChunkRenderWorker$1;
import net.minecraft.client.renderer.chunk.ChunkRenderWorker$2;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.crash.a;
import net.minecraft.entity.c;
import net.minecraft.util.av;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChunkRenderWorker
implements Runnable {
    private static final Logger bSX = LogManager.getLogger();
    private final ChunkRenderDispatcher bSY;
    private final RegionRenderCacheBuilder bSZ;

    public ChunkRenderWorker(ChunkRenderDispatcher chunkRenderDispatcher) {
        this(chunkRenderDispatcher, null);
    }

    public ChunkRenderWorker(ChunkRenderDispatcher chunkRenderDispatcher, RegionRenderCacheBuilder regionRenderCacheBuilder) {
        this.bSY = chunkRenderDispatcher;
        this.bSZ = regionRenderCacheBuilder;
    }

    @Override
    public void run() {
        try {
            while (true) {
                this.a(this.bSY.MO());
            }
        }
        catch (InterruptedException interruptedException) {
            bSX.debug("Stopping due to interrupt");
            return;
        }
        catch (Throwable throwable) {
            a a2 = a.a(throwable, "Batching chunks");
            d.AZ().a(d.AZ().c(a2));
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(ChunkCompileTaskGenerator chunkCompileTaskGenerator) {
        chunkCompileTaskGenerator.MI().lock();
        try {
            if (chunkCompileTaskGenerator.MD() != ChunkCompileTaskGenerator$Status.bSv) {
                if (!chunkCompileTaskGenerator.kM()) {
                    bSX.warn("Chunk render task was " + String.valueOf((Object)chunkCompileTaskGenerator.MD()) + " when I expected it to be pending; ignoring task");
                }
                return;
            }
            chunkCompileTaskGenerator.a(ChunkCompileTaskGenerator$Status.bSw);
        }
        finally {
            chunkCompileTaskGenerator.MI().unlock();
        }
        c c2 = d.AZ().BC();
        if (c2 == null) {
            chunkCompileTaskGenerator.MH();
        } else {
            chunkCompileTaskGenerator.a(this.MG());
            float f2 = (float)c2.gW;
            float f3 = (float)c2.gX + c2.getEyeHeight();
            float f4 = (float)c2.gY;
            ChunkCompileTaskGenerator$Type chunkCompileTaskGenerator$Type = chunkCompileTaskGenerator.MJ();
            if (chunkCompileTaskGenerator$Type == ChunkCompileTaskGenerator$Type.bSA) {
                chunkCompileTaskGenerator.ME().b(f2, f3, f4, chunkCompileTaskGenerator);
            } else if (chunkCompileTaskGenerator$Type == ChunkCompileTaskGenerator$Type.bSB) {
                chunkCompileTaskGenerator.ME().a(f2, f3, f4, chunkCompileTaskGenerator);
            }
            chunkCompileTaskGenerator.MI().lock();
            try {
                if (chunkCompileTaskGenerator.MD() != ChunkCompileTaskGenerator$Status.bSw) {
                    if (!chunkCompileTaskGenerator.kM()) {
                        bSX.warn("Chunk render task was " + String.valueOf((Object)chunkCompileTaskGenerator.MD()) + " when I expected it to be compiling; aborting task");
                    }
                    this.b(chunkCompileTaskGenerator);
                    return;
                }
                chunkCompileTaskGenerator.a(ChunkCompileTaskGenerator$Status.bSx);
            }
            finally {
                chunkCompileTaskGenerator.MI().unlock();
            }
            CompiledChunk compiledChunk = chunkCompileTaskGenerator.MF();
            ArrayList arrayList = Lists.newArrayList();
            if (chunkCompileTaskGenerator$Type == ChunkCompileTaskGenerator$Type.bSA) {
                for (ListenableFuture listenableFuture : av.values()) {
                    if (!compiledChunk.h((av)listenableFuture)) continue;
                    arrayList.add(this.bSY.a((av)listenableFuture, chunkCompileTaskGenerator.MG().b((av)listenableFuture), chunkCompileTaskGenerator.ME(), compiledChunk));
                }
            } else if (chunkCompileTaskGenerator$Type == ChunkCompileTaskGenerator$Type.bSB) {
                arrayList.add(this.bSY.a(av.dxY, chunkCompileTaskGenerator.MG().b(av.dxY), chunkCompileTaskGenerator.ME(), compiledChunk));
            }
            ListenableFuture listenableFuture = Futures.allAsList((Iterable)arrayList);
            chunkCompileTaskGenerator.g(new ChunkRenderWorker$1(this, listenableFuture));
            Futures.addCallback((ListenableFuture)listenableFuture, (FutureCallback)new ChunkRenderWorker$2(this, chunkCompileTaskGenerator, compiledChunk));
        }
    }

    private RegionRenderCacheBuilder MG() {
        return this.bSZ != null ? this.bSZ : this.bSY.MN();
    }

    private void b(ChunkCompileTaskGenerator chunkCompileTaskGenerator) {
        if (this.bSZ == null) {
            this.bSY.b(chunkCompileTaskGenerator.MG());
        }
    }
}

