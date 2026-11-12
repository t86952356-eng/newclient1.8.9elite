/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer;

import net.minecraft.client.renderer.ChunkRenderContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.src.a;
import net.minecraft.util.av;
import net.optifine.render.i;
import net.optifine.shaders.aj;
import org.lwjgl.opengl.GL11;

public class VboRenderList
extends ChunkRenderContainer {
    private double bIC;
    private double bID;
    private double bIE;

    @Override
    public void a(av av2) {
        if (this.Mq) {
            if (!a.apg()) {
                for (RenderChunk renderChunk : this.bIF) {
                    VertexBuffer vertexBuffer = renderChunk.du(av2.ordinal());
                    GlStateManager.JV();
                    this.a(renderChunk);
                    renderChunk.MY();
                    vertexBuffer.OI();
                    this.Lr();
                    vertexBuffer.dO(7);
                    GlStateManager.JW();
                }
            } else {
                int n2 = Integer.MIN_VALUE;
                int n3 = Integer.MIN_VALUE;
                i i2 = null;
                for (RenderChunk renderChunk : this.bIF) {
                    VertexBuffer vertexBuffer = renderChunk.du(av2.ordinal());
                    i i3 = vertexBuffer.OL();
                    if (i3 != i2 || n2 != renderChunk.bTE || n3 != renderChunk.bTF) {
                        if (i2 != null) {
                            this.a(n2, n3, i2);
                        }
                        n2 = renderChunk.bTE;
                        n3 = renderChunk.bTF;
                        i2 = i3;
                    }
                    vertexBuffer.dO(7);
                }
                if (i2 != null) {
                    this.a(n2, n3, i2);
                }
            }
            OpenGlHelper.W(OpenGlHelper.bNo, 0);
            GlStateManager.JX();
            this.bIF.clear();
        }
    }

    public void Lr() {
        if (a.aoG()) {
            aj.aHc();
        } else {
            GL11.glVertexPointer((int)3, (int)5126, (int)28, (long)0L);
            GL11.glColorPointer((int)4, (int)5121, (int)28, (long)12L);
            GL11.glTexCoordPointer((int)2, (int)5126, (int)28, (long)16L);
            OpenGlHelper.df(OpenGlHelper.bMJ);
            GL11.glTexCoordPointer((int)2, (int)5122, (int)28, (long)24L);
            OpenGlHelper.df(OpenGlHelper.bMI);
        }
    }

    @Override
    public void A(double d2, double d3, double d4) {
        this.bIC = d2;
        this.bID = d3;
        this.bIE = d4;
        super.A(d2, d3, d4);
    }

    private void a(int n2, int n3, i i2) {
        GlStateManager.JV();
        this.u(n2, 0, n3);
        i2.a(this);
        GlStateManager.JW();
    }

    public void u(int n2, int n3, int n4) {
        GlStateManager.j((float)((double)n2 - this.bIC), (float)((double)n3 - this.bID), (float)((double)n4 - this.bIE));
    }
}

