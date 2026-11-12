/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package net.optifine.shaders;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.block.Block;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.world.l;
import net.optifine.shaders.ah;
import net.optifine.shaders.b;
import org.lwjgl.opengl.GL20;

public class z {
    int evZ;
    int ewa;
    int ewb;
    int ewc;
    boolean ewd;
    boolean ewe;
    boolean ewf;
    boolean ewg;
    long[] ewh = new long[10];
    int ewi = 0;

    public z() {
        this.ewh[this.ewi] = 0L;
    }

    public static void d(WorldRenderer worldRenderer) {
        worldRenderer.bQi = new z();
    }

    public void S(long l2) {
        ++this.ewi;
        this.ewh[this.ewi] = l2;
    }

    public void aET() {
        this.ewh[this.ewi] = 0L;
        --this.ewi;
    }

    public static void b(IBlockState iBlockState, net.minecraft.util.b b2, l l2, WorldRenderer worldRenderer) {
        int n2;
        int n3;
        Block block = iBlockState.df();
        if (iBlockState instanceof BlockStateBase) {
            BlockStateBase blockStateBase = (BlockStateBase)iBlockState;
            n3 = blockStateBase.zW();
            n2 = blockStateBase.yc();
        } else {
            n3 = Block.i(block);
            n2 = block.c(iBlockState);
        }
        int n4 = b.bJ(n3, n2);
        if (n4 >= 0) {
            n3 = n4;
        }
        int n5 = block.xg();
        int n6 = ((n5 & 0xFFFF) << 16) + (n3 & 0xFFFF);
        int n7 = n2 & 0xFFFF;
        worldRenderer.bQi.S(((long)n7 << 32) + (long)n6);
    }

    public static void e(WorldRenderer worldRenderer) {
        worldRenderer.bQi.aET();
    }

    public static boolean a(boolean bl2, WorldRenderer worldRenderer) {
        worldRenderer.bQi.aET();
        return bl2;
    }

    public static void f(WorldRenderer worldRenderer) {
        z z2 = worldRenderer.bQi;
        VertexFormat vertexFormat = worldRenderer.LB();
        z2.evZ = vertexFormat.OT() / 4;
        z2.ewe = z2.ewd = vertexFormat.ON();
        z2.ewf = vertexFormat.dQ(0);
        z2.ewa = z2.ewd ? vertexFormat.OO() / 4 : 0;
        z2.ewb = z2.ewf ? vertexFormat.dR(0) / 4 : 0;
        z2.ewc = 8;
    }

    public static void g(WorldRenderer worldRenderer) {
        if (worldRenderer.bPT == 0) {
            z.f(worldRenderer);
        }
    }

    public static void h(WorldRenderer worldRenderer) {
        z z2 = worldRenderer.bQi;
        if (z2.evZ == 14) {
            if (worldRenderer.bPX == 7 && worldRenderer.bPT % 4 == 0) {
                z2.a(worldRenderer, worldRenderer.Lv() - 4 * z2.evZ);
            }
            long l2 = z2.ewh[z2.ewi];
            int n2 = worldRenderer.Lv() - 14 + 12;
            worldRenderer.bPQ.put(n2, (int)l2);
            worldRenderer.bPQ.put(n2 + 1, (int)(l2 >> 32));
        }
    }

    public static void a(WorldRenderer worldRenderer, int[] nArray) {
        if (worldRenderer.bPT == 0) {
            z.f(worldRenderer);
        }
        z z2 = worldRenderer.bQi;
        if (z2.evZ == 14) {
            long l2 = z2.ewh[z2.ewi];
            int n2 = 12;
            while (n2 + 1 < nArray.length) {
                nArray[n2] = (int)l2;
                nArray[n2 + 1] = (int)(l2 >> 32);
                n2 += 14;
            }
        }
    }

    public static void a(WorldRenderer worldRenderer, ByteBuffer byteBuffer) {
        if (worldRenderer.bPT == 0) {
            z.f(worldRenderer);
        }
        z z2 = worldRenderer.bQi;
        if (z2.evZ == 14) {
            long l2 = z2.ewh[z2.ewi];
            int n2 = byteBuffer.limit() / 4;
            int n3 = 12;
            while (n3 + 1 < n2) {
                int n4 = (int)l2;
                int n5 = (int)(l2 >> 32);
                byteBuffer.putInt(n3 * 4, n4);
                byteBuffer.putInt((n3 + 1) * 4, n5);
                n3 += 14;
            }
        }
    }

    public static void i(WorldRenderer worldRenderer) {
        z z2 = worldRenderer.bQi;
        if (z2.evZ == 14 && worldRenderer.bPX == 7 && worldRenderer.bPT % 4 == 0) {
            z2.a(worldRenderer, worldRenderer.Lv() - 4 * z2.evZ);
        }
    }

    public void a(WorldRenderer worldRenderer, int n2) {
        FloatBuffer floatBuffer = worldRenderer.bPS;
        IntBuffer intBuffer = worldRenderer.bPQ;
        int n3 = worldRenderer.Lv();
        float f2 = floatBuffer.get(n2 + 0 * this.evZ);
        float f3 = floatBuffer.get(n2 + 0 * this.evZ + 1);
        float f4 = floatBuffer.get(n2 + 0 * this.evZ + 2);
        float f5 = floatBuffer.get(n2 + 0 * this.evZ + this.ewb);
        float f6 = floatBuffer.get(n2 + 0 * this.evZ + this.ewb + 1);
        float f7 = floatBuffer.get(n2 + 1 * this.evZ);
        float f8 = floatBuffer.get(n2 + 1 * this.evZ + 1);
        float f9 = floatBuffer.get(n2 + 1 * this.evZ + 2);
        float f10 = floatBuffer.get(n2 + 1 * this.evZ + this.ewb);
        float f11 = floatBuffer.get(n2 + 1 * this.evZ + this.ewb + 1);
        float f12 = floatBuffer.get(n2 + 2 * this.evZ);
        float f13 = floatBuffer.get(n2 + 2 * this.evZ + 1);
        float f14 = floatBuffer.get(n2 + 2 * this.evZ + 2);
        float f15 = floatBuffer.get(n2 + 2 * this.evZ + this.ewb);
        float f16 = floatBuffer.get(n2 + 2 * this.evZ + this.ewb + 1);
        float f17 = floatBuffer.get(n2 + 3 * this.evZ);
        float f18 = floatBuffer.get(n2 + 3 * this.evZ + 1);
        float f19 = floatBuffer.get(n2 + 3 * this.evZ + 2);
        float f20 = floatBuffer.get(n2 + 3 * this.evZ + this.ewb);
        float f21 = floatBuffer.get(n2 + 3 * this.evZ + this.ewb + 1);
        float f22 = f13 - f3;
        float f23 = f19 - f9;
        float f24 = f18 - f8;
        float f25 = f14 - f4;
        float f26 = f22 * f23 - f24 * f25;
        float f27 = f17 - f7;
        float f28 = f12 - f2;
        float f29 = f25 * f27 - f23 * f28;
        float f30 = f28 * f24 - f27 * f22;
        float f31 = f26 * f26 + f29 * f29 + f30 * f30;
        float f32 = (double)f31 != 0.0 ? (float)(1.0 / Math.sqrt(f31)) : 1.0f;
        f26 *= f32;
        f29 *= f32;
        f30 *= f32;
        f28 = f7 - f2;
        f22 = f8 - f3;
        f25 = f9 - f4;
        float f33 = f10 - f5;
        float f34 = f11 - f6;
        f27 = f12 - f2;
        f24 = f13 - f3;
        f23 = f14 - f4;
        float f35 = f15 - f5;
        float f36 = f16 - f6;
        float f37 = f33 * f36 - f35 * f34;
        float f38 = f37 != 0.0f ? 1.0f / f37 : 1.0f;
        float f39 = (f36 * f28 - f34 * f27) * f38;
        float f40 = (f36 * f22 - f34 * f24) * f38;
        float f41 = (f36 * f25 - f34 * f23) * f38;
        float f42 = (f33 * f27 - f35 * f28) * f38;
        float f43 = (f33 * f24 - f35 * f22) * f38;
        float f44 = (f33 * f23 - f35 * f25) * f38;
        f31 = f39 * f39 + f40 * f40 + f41 * f41;
        f32 = (double)f31 != 0.0 ? (float)(1.0 / Math.sqrt(f31)) : 1.0f;
        f39 *= f32;
        f40 *= f32;
        f41 *= f32;
        f31 = f42 * f42 + f43 * f43 + f44 * f44;
        f32 = (double)f31 != 0.0 ? (float)(1.0 / Math.sqrt(f31)) : 1.0f;
        float f45 = f30 * f40 - f29 * f41;
        float f46 = f26 * f41 - f30 * f39;
        float f47 = f29 * f39 - f26 * f40;
        float f48 = (f42 *= f32) * f45 + (f43 *= f32) * f46 + (f44 *= f32) * f47 < 0.0f ? -1.0f : 1.0f;
        int n4 = (int)(f26 * 127.0f) & 0xFF;
        int n5 = (int)(f29 * 127.0f) & 0xFF;
        int n6 = (int)(f30 * 127.0f) & 0xFF;
        int n7 = (n6 << 16) + (n5 << 8) + n4;
        intBuffer.put(n2 + 0 * this.evZ + this.ewa, n7);
        intBuffer.put(n2 + 1 * this.evZ + this.ewa, n7);
        intBuffer.put(n2 + 2 * this.evZ + this.ewa, n7);
        intBuffer.put(n2 + 3 * this.evZ + this.ewa, n7);
        int n8 = ((int)(f39 * 32767.0f) & 0xFFFF) + (((int)(f40 * 32767.0f) & 0xFFFF) << 16);
        int n9 = ((int)(f41 * 32767.0f) & 0xFFFF) + (((int)(f48 * 32767.0f) & 0xFFFF) << 16);
        intBuffer.put(n2 + 0 * this.evZ + 10, n8);
        intBuffer.put(n2 + 0 * this.evZ + 10 + 1, n9);
        intBuffer.put(n2 + 1 * this.evZ + 10, n8);
        intBuffer.put(n2 + 1 * this.evZ + 10 + 1, n9);
        intBuffer.put(n2 + 2 * this.evZ + 10, n8);
        intBuffer.put(n2 + 2 * this.evZ + 10 + 1, n9);
        intBuffer.put(n2 + 3 * this.evZ + 10, n8);
        intBuffer.put(n2 + 3 * this.evZ + 10 + 1, n9);
        float f49 = (f5 + f10 + f15 + f20) / 4.0f;
        float f50 = (f6 + f11 + f16 + f21) / 4.0f;
        floatBuffer.put(n2 + 0 * this.evZ + 8, f49);
        floatBuffer.put(n2 + 0 * this.evZ + 8 + 1, f50);
        floatBuffer.put(n2 + 1 * this.evZ + 8, f49);
        floatBuffer.put(n2 + 1 * this.evZ + 8 + 1, f50);
        floatBuffer.put(n2 + 2 * this.evZ + 8, f49);
        floatBuffer.put(n2 + 2 * this.evZ + 8 + 1, f50);
        floatBuffer.put(n2 + 3 * this.evZ + 8, f49);
        floatBuffer.put(n2 + 3 * this.evZ + 8 + 1, f50);
    }

    public static void j(WorldRenderer worldRenderer) {
        if (worldRenderer.LB().ON() && worldRenderer.bPX == 7 && worldRenderer.bPT % 4 == 0) {
            z z2 = worldRenderer.bQi;
            z.f(worldRenderer);
            int n2 = worldRenderer.bPT * z2.evZ;
            for (int i2 = 0; i2 < n2; i2 += z2.evZ * 4) {
                z2.a(worldRenderer, i2);
            }
        }
    }

    public static void a(int n2, int n3, int n4, WorldRenderer worldRenderer) {
        if (n4 != 0) {
            VertexFormat vertexFormat = worldRenderer.LB();
            int n5 = vertexFormat.OT();
            if (n5 == 56) {
                ByteBuffer byteBuffer = worldRenderer.LA();
                byteBuffer.position(32);
                GL20.glVertexAttribPointer((int)ah.ezj, (int)2, (int)5126, (boolean)false, (int)n5, (ByteBuffer)byteBuffer);
                byteBuffer.position(40);
                GL20.glVertexAttribPointer((int)ah.ezk, (int)4, (int)5122, (boolean)false, (int)n5, (ByteBuffer)byteBuffer);
                byteBuffer.position(48);
                GL20.glVertexAttribPointer((int)ah.ezi, (int)3, (int)5122, (boolean)false, (int)n5, (ByteBuffer)byteBuffer);
                byteBuffer.position(0);
                GL20.glEnableVertexAttribArray((int)ah.ezj);
                GL20.glEnableVertexAttribArray((int)ah.ezk);
                GL20.glEnableVertexAttribArray((int)ah.ezi);
                GlStateManager.r(n2, n3, n4);
                GL20.glDisableVertexAttribArray((int)ah.ezj);
                GL20.glDisableVertexAttribArray((int)ah.ezk);
                GL20.glDisableVertexAttribArray((int)ah.ezi);
            } else {
                GlStateManager.r(n2, n3, n4);
            }
        }
    }
}

