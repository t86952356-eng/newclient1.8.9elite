/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.WorldVertexBufferUploader;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.src.a;

public class VertexBufferUploader
extends WorldVertexBufferUploader {
    private VertexBuffer bPH = null;

    @Override
    public void b(WorldRenderer worldRenderer) {
        if (worldRenderer.LD() == 7 && a.apk()) {
            worldRenderer.LL();
            this.bPH.dP(worldRenderer.LD());
        }
        this.bPH.a(worldRenderer.LA());
        worldRenderer.aX();
    }

    public void a(VertexBuffer vertexBuffer) {
        this.bPH = vertexBuffer;
    }
}

