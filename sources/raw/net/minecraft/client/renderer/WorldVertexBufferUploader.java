/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer;

import java.nio.ByteBuffer;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.WorldVertexBufferUploader$1;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.renderer.vertex.VertexFormatElement;
import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage;
import net.minecraft.src.a;
import net.optifine.reflect.g;
import net.optifine.shaders.z;
import org.lwjgl.opengl.GL11;

public class WorldVertexBufferUploader {
    public void b(WorldRenderer worldRenderer) {
        if (worldRenderer.LC() > 0) {
            int n2;
            Object object;
            int n3;
            if (worldRenderer.LD() == 7 && a.apk()) {
                worldRenderer.LL();
            }
            VertexFormat vertexFormat = worldRenderer.LB();
            int n4 = vertexFormat.OT();
            ByteBuffer byteBuffer = worldRenderer.LA();
            List<VertexFormatElement> list = vertexFormat.Mp();
            boolean bl2 = g.epI.aDA();
            boolean bl3 = g.epJ.aDA();
            block12: for (n3 = 0; n3 < list.size(); ++n3) {
                VertexFormatElement vertexFormatElement = list.get(n3);
                object = vertexFormatElement.OW();
                if (bl2) {
                    g.a(object, g.epI, vertexFormat, n3, n4, byteBuffer);
                    continue;
                }
                int n5 = vertexFormatElement.OV().Pb();
                n2 = vertexFormatElement.OY();
                byteBuffer.position(vertexFormat.dT(n3));
                switch (WorldVertexBufferUploader$1.bQq[((Enum)object).ordinal()]) {
                    case 1: {
                        GL11.glVertexPointer((int)vertexFormatElement.OX(), (int)n5, (int)n4, (ByteBuffer)byteBuffer);
                        GL11.glEnableClientState((int)32884);
                        continue block12;
                    }
                    case 2: {
                        OpenGlHelper.df(OpenGlHelper.bMI + n2);
                        GL11.glTexCoordPointer((int)vertexFormatElement.OX(), (int)n5, (int)n4, (ByteBuffer)byteBuffer);
                        GL11.glEnableClientState((int)32888);
                        OpenGlHelper.df(OpenGlHelper.bMI);
                        continue block12;
                    }
                    case 3: {
                        GL11.glColorPointer((int)vertexFormatElement.OX(), (int)n5, (int)n4, (ByteBuffer)byteBuffer);
                        GL11.glEnableClientState((int)32886);
                        continue block12;
                    }
                    case 4: {
                        GL11.glNormalPointer((int)n5, (int)n4, (ByteBuffer)byteBuffer);
                        GL11.glEnableClientState((int)32885);
                    }
                }
            }
            if (worldRenderer.LE()) {
                worldRenderer.LF();
            } else if (a.aoG()) {
                z.a(worldRenderer.LD(), 0, worldRenderer.LC(), worldRenderer);
            } else {
                GL11.glDrawArrays((int)worldRenderer.LD(), (int)0, (int)worldRenderer.LC());
            }
            int n6 = list.size();
            block13: for (n3 = 0; n3 < n6; ++n3) {
                object = list.get(n3);
                VertexFormatElement$EnumUsage vertexFormatElement$EnumUsage = ((VertexFormatElement)object).OW();
                if (bl3) {
                    g.a((Object)vertexFormatElement$EnumUsage, g.epJ, vertexFormat, n3, n4, byteBuffer);
                    continue;
                }
                n2 = ((VertexFormatElement)object).OY();
                switch (vertexFormatElement$EnumUsage) {
                    case ccu: {
                        GL11.glDisableClientState((int)32884);
                        continue block13;
                    }
                    case ccx: {
                        OpenGlHelper.df(OpenGlHelper.bMI + n2);
                        GL11.glDisableClientState((int)32888);
                        OpenGlHelper.df(OpenGlHelper.bMI);
                        continue block13;
                    }
                    case ccw: {
                        GL11.glDisableClientState((int)32886);
                        GlStateManager.JX();
                        continue block13;
                    }
                    case ccv: {
                        GL11.glDisableClientState((int)32885);
                    }
                }
            }
        }
        worldRenderer.aX();
    }
}

