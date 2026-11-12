/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.renderer.chunk;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.client.renderer.RegionRenderCacheBuilder;
import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status;
import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.client.renderer.chunk.RenderChunk;

public class ChunkCompileTaskGenerator {
    private final RenderChunk bSo;
    private final ReentrantLock bSp = new ReentrantLock();
    private final List<Runnable> bSq = Lists.newArrayList();
    private final ChunkCompileTaskGenerator$Type bSr;
    private RegionRenderCacheBuilder bSs;
    private CompiledChunk bSt;
    private ChunkCompileTaskGenerator$Status bSu = ChunkCompileTaskGenerator$Status.bSv;
    private boolean fY;

    public ChunkCompileTaskGenerator(RenderChunk renderChunk, ChunkCompileTaskGenerator$Type chunkCompileTaskGenerator$Type) {
        this.bSo = renderChunk;
        this.bSr = chunkCompileTaskGenerator$Type;
    }

    public ChunkCompileTaskGenerator$Status MD() {
        return this.bSu;
    }

    public RenderChunk ME() {
        return this.bSo;
    }

    public CompiledChunk MF() {
        return this.bSt;
    }

    public void a(CompiledChunk compiledChunk) {
        this.bSt = compiledChunk;
    }

    public RegionRenderCacheBuilder MG() {
        return this.bSs;
    }

    public void a(RegionRenderCacheBuilder regionRenderCacheBuilder) {
        this.bSs = regionRenderCacheBuilder;
    }

    public void a(ChunkCompileTaskGenerator$Status chunkCompileTaskGenerator$Status) {
        this.bSp.lock();
        try {
            this.bSu = chunkCompileTaskGenerator$Status;
        }
        finally {
            this.bSp.unlock();
        }
    }

    public void MH() {
        this.bSp.lock();
        try {
            if (this.bSr == ChunkCompileTaskGenerator$Type.bSA && this.bSu != ChunkCompileTaskGenerator$Status.bSy) {
                this.bSo.ap(true);
            }
            this.fY = true;
            this.bSu = ChunkCompileTaskGenerator$Status.bSy;
            for (Runnable runnable : this.bSq) {
                runnable.run();
            }
        }
        finally {
            this.bSp.unlock();
        }
    }

    public void g(Runnable runnable) {
        this.bSp.lock();
        try {
            this.bSq.add(runnable);
            if (this.fY) {
                runnable.run();
            }
        }
        finally {
            this.bSp.unlock();
        }
    }

    public ReentrantLock MI() {
        return this.bSp;
    }

    public ChunkCompileTaskGenerator$Type MJ() {
        return this.bSr;
    }

    public boolean kM() {
        return this.fY;
    }
}

