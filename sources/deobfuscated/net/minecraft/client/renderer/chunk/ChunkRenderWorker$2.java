/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 */
package net.minecraft.client.renderer.chunk;

import com.google.common.util.concurrent.FutureCallback;
import java.util.List;
import java.util.concurrent.CancellationException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator;
import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status;
import net.minecraft.client.renderer.chunk.ChunkRenderWorker;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.crash.a;

class ChunkRenderWorker$2
implements FutureCallback<List<Object>> {
    final /* synthetic */ ChunkCompileTaskGenerator bTb;
    final /* synthetic */ CompiledChunk bTc;
    final /* synthetic */ ChunkRenderWorker bTd;

    ChunkRenderWorker$2() {
        this.bTd = var1_1;
        this.bTb = var2_2;
        this.bTc = var3_3;
    }

    public void s(List<Object> list) {
        block6: {
            this.bTd.b(this.bTb);
            this.bTb.MI().lock();
            try {
                if (this.bTb.MD() == ChunkCompileTaskGenerator$Status.bSx) {
                    this.bTb.a(ChunkCompileTaskGenerator$Status.bSy);
                    break block6;
                }
                if (!this.bTb.kM()) {
                    ChunkRenderWorker.bSX.warn("Chunk render task was " + String.valueOf((Object)this.bTb.MD()) + " when I expected it to be uploading; aborting task");
                }
            }
            finally {
                this.bTb.MI().unlock();
            }
            return;
        }
        this.bTb.ME().a(this.bTc);
    }

    public void onFailure(Throwable throwable) {
        this.bTd.b(this.bTb);
        if (!(throwable instanceof CancellationException) && !(throwable instanceof InterruptedException)) {
            Minecraft.getMinecraft().a(a.a(throwable, "Rendering chunk"));
        }
    }

    public /* synthetic */ void onSuccess(Object object) {
        this.s((List)object);
    }
}

