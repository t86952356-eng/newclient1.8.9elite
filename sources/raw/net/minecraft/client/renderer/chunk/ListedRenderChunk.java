/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.chunk;

import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class ListedRenderChunk
extends RenderChunk {
    private final int bTm = GLAllocation.cC(av.values().length);

    public ListedRenderChunk(w w2, RenderGlobal renderGlobal, b b2, int n2) {
        super(w2, renderGlobal, b2, n2);
    }

    public int a(av av2, CompiledChunk compiledChunk) {
        return !compiledChunk.f(av2) ? this.bTm + av2.ordinal() : -1;
    }

    @Override
    public void Ls() {
        super.Ls();
        GLAllocation.N(this.bTm, av.values().length);
    }
}

