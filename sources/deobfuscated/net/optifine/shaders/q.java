/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import java.util.Iterator;
import net.minecraft.client.renderer.ViewFrustum;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.b;
import net.optifine.d;
import net.optifine.shaders.o;

public class q
implements Iterator<RenderChunk> {
    private final ViewFrustum evt;
    private final o evu;
    private final d evv = new d(0, 0, 0);

    public q(ViewFrustum viewFrustum, b b2, b b3, int n2, int n3) {
        this.evt = viewFrustum;
        this.evu = new o(b2, b3, n2, n3);
    }

    @Override
    public boolean hasNext() {
        return this.evu.hasNext();
    }

    public RenderChunk aEw() {
        b b2 = this.evu.aEu();
        this.evv.ah(b2.wt() << 4, b2.wu() << 4, b2.wx() << 4);
        RenderChunk renderChunk = this.evt.R(this.evv);
        return renderChunk;
    }

    @Override
    public void remove() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public /* synthetic */ Object next() {
        return this.aEw();
    }
}

