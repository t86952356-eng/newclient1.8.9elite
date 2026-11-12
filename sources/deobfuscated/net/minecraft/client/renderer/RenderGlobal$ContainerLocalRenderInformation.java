/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.ao;

public class RenderGlobal$ContainerLocalRenderInformation {
    final RenderChunk bPm;
    ao aWT;
    int bPn;

    public RenderGlobal$ContainerLocalRenderInformation(RenderChunk renderChunk, ao ao2, int n2) {
        this.bPm = renderChunk;
        this.aWT = ao2;
        this.bPn = n2;
    }

    public void a(byte by2, ao ao2) {
        this.bPn = this.bPn | by2 | 1 << ao2.ordinal();
    }

    public boolean i(ao ao2) {
        return (this.bPn & 1 << ao2.ordinal()) > 0;
    }

    private void a(ao ao2, int n2) {
        this.aWT = ao2;
        this.bPn = n2;
    }
}

