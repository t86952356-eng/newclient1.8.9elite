/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.renderer;

import com.google.common.collect.Lists;
import java.util.BitSet;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.optifine.bi;

public abstract class ChunkRenderContainer {
    private double bIC;
    private double bID;
    private double bIE;
    protected List<RenderChunk> bIF = Lists.newArrayListWithCapacity((int)17424);
    protected boolean Mq;
    private BitSet bIG;
    private final BitSet bIH = new BitSet();

    public void A(double d2, double d3, double d4) {
        this.Mq = true;
        this.bIF.clear();
        this.bIC = d2;
        this.bID = d3;
        this.bIE = d4;
        if (bi.bd()) {
            if (this.bIG != null) {
                bi.a(this.bIG);
            } else {
                this.bIG = this.bIH;
            }
            this.bIG.clear();
        } else if (this.bIG != null) {
            bi.a(this.bIG);
            this.bIG = null;
        }
    }

    public void a(RenderChunk renderChunk) {
        b b2 = renderChunk.yl();
        GlStateManager.j((float)((double)b2.wt() - this.bIC), (float)((double)b2.wu() - this.bID), (float)((double)b2.wx() - this.bIE));
    }

    public void a(RenderChunk renderChunk, av av2) {
        BitSet bitSet;
        this.bIF.add(renderChunk);
        if (this.bIG != null && (bitSet = renderChunk.bSt.i(av2)) != null) {
            this.bIG.or(bitSet);
        }
    }

    public abstract void a(av var1);
}

