/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.WorldVertexBufferUploader;
import net.optifine.bi;

public class Tessellator {
    private final WorldRenderer bPt;
    private final WorldVertexBufferUploader bPu = new WorldVertexBufferUploader();
    private static final Tessellator bPv = new Tessellator(0x200000);

    public static Tessellator Li() {
        return bPv;
    }

    public Tessellator(int n2) {
        this.bPt = new WorldRenderer(n2);
    }

    public void pZ() {
        if (this.bPt.bQj != null) {
            bi.a(this.bPt.bQj);
        }
        this.bPt.Lz();
        this.bPu.b(this.bPt);
    }

    public WorldRenderer Lj() {
        return this.bPt;
    }
}

