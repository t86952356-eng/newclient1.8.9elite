/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
package net.minecraft.client.renderer;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import net.minecraft.world.w;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class ActiveRenderInfo {
    public static final IntBuffer bHl = GLAllocation.cF(16);
    public static final FloatBuffer bHm = GLAllocation.cG(16);
    public static final FloatBuffer bHn = GLAllocation.cG(16);
    public static final FloatBuffer bHo = GLAllocation.cG(3);
    private static da Jr = new da(0.0, 0.0, 0.0);
    private static float bHp;
    private static float bHq;
    private static float bHr;
    private static float bHs;
    private static float bHt;

    public static void a(a a2, boolean bl2) {
        GlStateManager.a(2982, bHm);
        GlStateManager.a(2983, bHn);
        GL11.glGetInteger((int)2978, (IntBuffer)bHl);
        float f2 = (bHl.get(0) + bHl.get(2)) / 2;
        float f3 = (bHl.get(1) + bHl.get(3)) / 2;
        GLU.gluUnProject((float)f2, (float)f3, (float)0.0f, (FloatBuffer)bHm, (FloatBuffer)bHn, (IntBuffer)bHl, (FloatBuffer)bHo);
        Jr = new da(bHo.get(0), bHo.get(1), bHo.get(2));
        int n2 = bl2 ? 1 : 0;
        float f4 = a2.pm;
        float f5 = a2.pl;
        bHp = bt.bB(f5 * (float)Math.PI / 180.0f) * (float)(1 - n2 * 2);
        bHr = bt.bx(f5 * (float)Math.PI / 180.0f) * (float)(1 - n2 * 2);
        bHs = -bHr * bt.bx(f4 * (float)Math.PI / 180.0f) * (float)(1 - n2 * 2);
        bHt = bHp * bt.bx(f4 * (float)Math.PI / 180.0f) * (float)(1 - n2 * 2);
        bHq = bt.bB(f4 * (float)Math.PI / 180.0f);
    }

    public static da a(c c2, double d2) {
        double d3 = c2.crF + (c2.gW - c2.crF) * d2;
        double d4 = c2.crG + (c2.gX - c2.crG) * d2;
        double d5 = c2.crH + (c2.gY - c2.crH) * d2;
        double d6 = d3 + ActiveRenderInfo.Jr.dAG;
        double d7 = d4 + ActiveRenderInfo.Jr.dAH;
        double d8 = d5 + ActiveRenderInfo.Jr.dAI;
        return new da(d6, d7, d8);
    }

    public static Block a(w w2, c c2, float f2) {
        da da2 = ActiveRenderInfo.a(c2, f2);
        b b2 = new b(da2);
        IBlockState iBlockState = w2.L(b2);
        Block block = iBlockState.df();
        if (block.xb().zv()) {
            float f3;
            float f4 = 0.0f;
            if (iBlockState.df() instanceof BlockLiquid) {
                f4 = BlockLiquid.bb(iBlockState.b(BlockLiquid.aWV)) - 0.11111111f;
            }
            if (da2.dAH >= (double)(f3 = (float)(b2.wu() + 1) - f4)) {
                block = w2.L(b2.aqX()).df();
            }
        }
        return block;
    }

    public static da mr() {
        return Jr;
    }

    public static float IJ() {
        return bHp;
    }

    public static float IK() {
        return bHq;
    }

    public static float IL() {
        return bHr;
    }

    public static float IM() {
        return bHs;
    }

    public static float IN() {
        return bHt;
    }
}

