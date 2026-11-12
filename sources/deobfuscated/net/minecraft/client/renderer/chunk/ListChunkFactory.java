/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.chunk;

import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.chunk.IRenderChunkFactory;
import net.minecraft.client.renderer.chunk.ListedRenderChunk;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class ListChunkFactory
implements IRenderChunkFactory {
    @Override
    public RenderChunk a(w w2, RenderGlobal renderGlobal, b b2, int n2) {
        return new ListedRenderChunk(w2, renderGlobal, b2, n2);
    }
}

