/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListenableFutureTask
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer.chunk;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import net.minecraft.client.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RegionRenderCacheBuilder;
import net.minecraft.client.renderer.VertexBufferUploader;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.WorldVertexBufferUploader;
import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher$1;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher$2;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher$3;
import net.minecraft.client.renderer.chunk.ChunkRenderWorker;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.client.renderer.chunk.ListedRenderChunk;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.util.av;
import net.minecraft.util.bt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class ChunkRenderDispatcher {
    private static final Logger bSD = LogManager.getLogger();
    private static final ThreadFactory bSE = new ThreadFactoryBuilder().setNameFormat("Chunk Batcher %d").setDaemon(true).build();
    private final List<ChunkRenderWorker> bSF = Lists.newArrayList();
    private final BlockingQueue<ChunkCompileTaskGenerator> bSG = Queues.newArrayBlockingQueue((int)100);
    private final BlockingQueue<RegionRenderCacheBuilder> bSH;
    private final WorldVertexBufferUploader bSI = new WorldVertexBufferUploader();
    private final VertexBufferUploader bSJ = new VertexBufferUploader();
    private final Queue<ListenableFutureTask<?>> bSK = Queues.newArrayDeque();
    private final ChunkRenderWorker bSL;
    private final int bSM;
    private final List<RegionRenderCacheBuilder> bSN = new ArrayList<RegionRenderCacheBuilder>();

    public ChunkRenderDispatcher() {
        this(-1);
    }

    public ChunkRenderDispatcher(int n2) {
        int n3;
        int n4 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / 0xA00000);
        int n5 = Math.max(1, bt.F(Runtime.getRuntime().availableProcessors() - 2, 1, n4 / 5));
        this.bSM = n2 < 0 ? bt.F(n5 * 8, 1, n4) : n2;
        for (n3 = 0; n3 < n5; ++n3) {
            ChunkRenderWorker chunkRenderWorker = new ChunkRenderWorker(this);
            Thread thread = bSE.newThread(chunkRenderWorker);
            thread.start();
            this.bSF.add(chunkRenderWorker);
        }
        this.bSH = Queues.newArrayBlockingQueue((int)this.bSM);
        for (n3 = 0; n3 < this.bSM; ++n3) {
            this.bSH.add(new RegionRenderCacheBuilder());
        }
        this.bSL = new ChunkRenderWorker(this, new RegionRenderCacheBuilder());
    }

    public String MM() {
        return String.format("pC: %03d, pU: %1d, aB: %1d", this.bSG.size(), this.bSK.size(), this.bSH.size());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean t(long l2) {
        long l3;
        boolean bl2;
        boolean bl3 = false;
        do {
            bl2 = false;
            ListenableFutureTask<?> listenableFutureTask = null;
            Queue<ListenableFutureTask<?>> queue = this.bSK;
            synchronized (queue) {
                listenableFutureTask = this.bSK.poll();
            }
            if (listenableFutureTask == null) continue;
            listenableFutureTask.run();
            bl2 = true;
            bl3 = true;
        } while (l2 != 0L && bl2 && (l3 = l2 - System.nanoTime()) >= 0L);
        return bl3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c(RenderChunk renderChunk) {
        boolean bl2;
        renderChunk.MU().lock();
        try {
            ChunkCompileTaskGenerator chunkCompileTaskGenerator = renderChunk.MV();
            chunkCompileTaskGenerator.g(new ChunkRenderDispatcher$1(this, chunkCompileTaskGenerator));
            boolean bl3 = this.bSG.offer(chunkCompileTaskGenerator);
            if (!bl3) {
                chunkCompileTaskGenerator.MH();
            }
            bl2 = bl3;
        }
        finally {
            renderChunk.MU().unlock();
        }
        return bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean d(RenderChunk renderChunk) {
        boolean bl2;
        renderChunk.MU().lock();
        try {
            ChunkCompileTaskGenerator chunkCompileTaskGenerator = renderChunk.MV();
            try {
                this.bSL.a(chunkCompileTaskGenerator);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            bl2 = true;
        }
        finally {
            renderChunk.MU().unlock();
        }
        return bl2;
    }

    public void KJ() {
        this.MP();
        while (this.t(0L)) {
        }
        ArrayList arrayList = Lists.newArrayList();
        while (arrayList.size() != this.bSM) {
            try {
                arrayList.add(this.MN());
            }
            catch (InterruptedException interruptedException) {}
        }
        this.bSH.addAll(arrayList);
    }

    public void b(RegionRenderCacheBuilder regionRenderCacheBuilder) {
        this.bSH.add(regionRenderCacheBuilder);
    }

    public RegionRenderCacheBuilder MN() {
        return this.bSH.take();
    }

    public ChunkCompileTaskGenerator MO() {
        return this.bSG.take();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean e(RenderChunk renderChunk) {
        boolean bl2;
        renderChunk.MU().lock();
        try {
            ChunkCompileTaskGenerator chunkCompileTaskGenerator = renderChunk.MW();
            if (chunkCompileTaskGenerator != null) {
                boolean bl3;
                chunkCompileTaskGenerator.g(new ChunkRenderDispatcher$2(this, chunkCompileTaskGenerator));
                boolean bl4 = bl3 = this.bSG.offer(chunkCompileTaskGenerator);
                return bl4;
            }
            boolean bl5 = true;
            bl2 = true;
        }
        finally {
            renderChunk.MU().unlock();
        }
        return bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ListenableFuture<Object> a(av av2, WorldRenderer worldRenderer, RenderChunk renderChunk, CompiledChunk compiledChunk) {
        if (d.AZ().BD()) {
            if (OpenGlHelper.Kv()) {
                this.a(worldRenderer, renderChunk.du(av2.ordinal()));
            } else {
                this.a(worldRenderer, ((ListedRenderChunk)renderChunk).a(av2, compiledChunk), renderChunk);
            }
            worldRenderer.G(0.0, 0.0, 0.0);
            return Futures.immediateFuture(null);
        }
        ListenableFutureTask listenableFutureTask = ListenableFutureTask.create((Runnable)new ChunkRenderDispatcher$3(this, av2, worldRenderer, renderChunk, compiledChunk), null);
        Queue<ListenableFutureTask<?>> queue = this.bSK;
        synchronized (queue) {
            this.bSK.add(listenableFutureTask);
            return listenableFutureTask;
        }
    }

    private void a(WorldRenderer worldRenderer, int n2, RenderChunk renderChunk) {
        GL11.glNewList((int)n2, (int)4864);
        GlStateManager.JV();
        renderChunk.MY();
        this.bSI.b(worldRenderer);
        GlStateManager.JW();
        GL11.glEndList();
    }

    private void a(WorldRenderer worldRenderer, VertexBuffer vertexBuffer) {
        this.bSJ.a(vertexBuffer);
        this.bSJ.b(worldRenderer);
    }

    public void MP() {
        while (!this.bSG.isEmpty()) {
            ChunkCompileTaskGenerator chunkCompileTaskGenerator = (ChunkCompileTaskGenerator)this.bSG.poll();
            if (chunkCompileTaskGenerator == null) continue;
            chunkCompileTaskGenerator.MH();
        }
    }

    public boolean MQ() {
        return this.bSG.isEmpty() && this.bSK.isEmpty();
    }

    public void Ld() {
        while (this.bSN.size() != this.bSM) {
            try {
                this.t(Long.MAX_VALUE);
                RegionRenderCacheBuilder regionRenderCacheBuilder = this.bSH.poll(100L, TimeUnit.MILLISECONDS);
                if (regionRenderCacheBuilder == null) continue;
                this.bSN.add(regionRenderCacheBuilder);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    public void Le() {
        this.bSH.addAll(this.bSN);
        this.bSN.clear();
    }
}

