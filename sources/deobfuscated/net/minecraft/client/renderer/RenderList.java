/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer;

import java.nio.IntBuffer;
import net.minecraft.client.renderer.ChunkRenderContainer;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.chunk.ListedRenderChunk;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.src.a;
import net.minecraft.util.av;
import org.lwjgl.opengl.GL11;

public class RenderList
extends ChunkRenderContainer {
    private double bIC;
    private double bID;
    private double bIE;
    IntBuffer bPr = GLAllocation.cF(16);

    @Override
    public void a(av av2) {
        if (this.Mq) {
            if (!a.apg()) {
                for (RenderChunk renderChunk : this.bIF) {
                    ListedRenderChunk listedRenderChunk = (ListedRenderChunk)renderChunk;
                    GlStateManager.JV();
                    this.a(renderChunk);
                    GL11.glCallList((int)listedRenderChunk.a(av2, listedRenderChunk.MF()));
                    GlStateManager.JW();
                }
            } else {
                int n2 = Integer.MIN_VALUE;
                int n3 = Integer.MIN_VALUE;
                for (RenderChunk renderChunk : this.bIF) {
                    ListedRenderChunk listedRenderChunk = (ListedRenderChunk)renderChunk;
                    if (n2 != renderChunk.bTE || n3 != renderChunk.bTF) {
                        if (this.bPr.position() > 0) {
                            this.a(n2, n3, this.bPr);
                        }
                        n2 = renderChunk.bTE;
                        n3 = renderChunk.bTF;
                    }
                    if (this.bPr.position() >= this.bPr.capacity()) {
                        IntBuffer intBuffer = GLAllocation.cF(this.bPr.capacity() * 2);
                        this.bPr.flip();
                        intBuffer.put(this.bPr);
                        this.bPr = intBuffer;
                    }
                    this.bPr.put(listedRenderChunk.a(av2, listedRenderChunk.MF()));
                }
                if (this.bPr.position() > 0) {
                    this.a(n2, n3, this.bPr);
                }
            }
            if (a.LE()) {
                GlStateManager.Kb();
            }
            GlStateManager.JX();
            this.bIF.clear();
        }
    }

    @Override
    public void A(double d2, double d3, double d4) {
        this.bIC = d2;
        this.bID = d3;
        this.bIE = d4;
        super.A(d2, d3, d4);
    }

    private void a(int n2, int n3, IntBuffer intBuffer) {
        GlStateManager.JV();
        this.u(n2, 0, n3);
        intBuffer.flip();
        GlStateManager.a(intBuffer);
        intBuffer.clear();
        GlStateManager.JW();
    }

    public void u(int n2, int n3, int n4) {
        GlStateManager.j((float)((double)n2 - this.bIC), (float)((double)n3 - this.bID), (float)((double)n4 - this.bIE));
    }
}

