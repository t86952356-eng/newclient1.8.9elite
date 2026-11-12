/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer;

import java.nio.FloatBuffer;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.da;
import org.lwjgl.opengl.GL11;

public class RenderHelper {
    private static final FloatBuffer bPo = GLAllocation.cG(16);
    private static final da bPp = new da(0.2f, 1.0, -0.7f).atR();
    private static final da bPq = new da(-0.2f, 1.0, 0.7f).atR();

    public static void Lf() {
        GlStateManager.JA();
        GlStateManager.cI(0);
        GlStateManager.cI(1);
        GlStateManager.JC();
    }

    public static void Lg() {
        GlStateManager.Jz();
        GlStateManager.cH(0);
        GlStateManager.cH(1);
        GlStateManager.JB();
        GlStateManager.O(1032, 5634);
        float f2 = 0.4f;
        float f3 = 0.6f;
        float f4 = 0.0f;
        GL11.glLight((int)16384, (int)4611, (FloatBuffer)RenderHelper.i(RenderHelper.bPp.dAG, RenderHelper.bPp.dAH, RenderHelper.bPp.dAI, 0.0));
        GL11.glLight((int)16384, (int)4609, (FloatBuffer)RenderHelper.f(0.6f, 0.6f, 0.6f, 1.0f));
        GL11.glLight((int)16384, (int)4608, (FloatBuffer)RenderHelper.f(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight((int)16384, (int)4610, (FloatBuffer)RenderHelper.f(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight((int)16385, (int)4611, (FloatBuffer)RenderHelper.i(RenderHelper.bPq.dAG, RenderHelper.bPq.dAH, RenderHelper.bPq.dAI, 0.0));
        GL11.glLight((int)16385, (int)4609, (FloatBuffer)RenderHelper.f(0.6f, 0.6f, 0.6f, 1.0f));
        GL11.glLight((int)16385, (int)4608, (FloatBuffer)RenderHelper.f(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight((int)16385, (int)4610, (FloatBuffer)RenderHelper.f(0.0f, 0.0f, 0.0f, 1.0f));
        GlStateManager.cP(7424);
        GL11.glLightModel((int)2899, (FloatBuffer)RenderHelper.f(0.4f, 0.4f, 0.4f, 1.0f));
    }

    private static FloatBuffer i(double d2, double d3, double d4, double d5) {
        return RenderHelper.f((float)d2, (float)d3, (float)d4, (float)d5);
    }

    private static FloatBuffer f(float f2, float f3, float f4, float f5) {
        bPo.clear();
        bPo.put(f2).put(f3).put(f4).put(f5);
        bPo.flip();
        return bPo;
    }

    public static void Lh() {
        GlStateManager.JV();
        GlStateManager.d(-30.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(165.0f, 1.0f, 0.0f, 0.0f);
        RenderHelper.Lg();
        GlStateManager.JW();
    }
}

