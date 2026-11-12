/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Floats
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer;

import com.google.common.primitives.Floats;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.BitSet;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.WorldRenderer$State;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.renderer.vertex.VertexFormatElement;
import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage;
import net.minecraft.src.a;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.optifine.bi;
import net.optifine.render.g;
import net.optifine.shaders.z;
import net.optifine.util.ak;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.GL11;

public class WorldRenderer {
    private ByteBuffer bPP;
    public IntBuffer bPQ;
    private ShortBuffer bPR;
    public FloatBuffer bPS;
    public int bPT;
    private VertexFormatElement bPU;
    private int bPV;
    private boolean bPW;
    public int bPX;
    private double bPY;
    private double bPZ;
    private double bQa;
    private VertexFormat bQb;
    private boolean bQc;
    private av bQd = null;
    private boolean[] bQe = new boolean[256];
    private TextureAtlasSprite[] bQf = null;
    private TextureAtlasSprite[] bQg = null;
    private TextureAtlasSprite bQh = null;
    public z bQi;
    public g bPc = null;
    public BitSet bQj = null;
    public BitSet bIH = new BitSet();
    private boolean bQk = false;
    private ByteBuffer bQl;

    public WorldRenderer(int n2) {
        this.bPP = GLAllocation.cE(n2 * 4);
        this.bPQ = this.bPP.asIntBuffer();
        this.bPR = this.bPP.asShortBuffer();
        this.bPS = this.bPP.asFloatBuffer();
        z.d(this);
    }

    private void dk(int n2) {
        if (n2 > this.bPQ.remaining()) {
            int n3 = this.bPP.capacity();
            int n4 = n3 % 0x200000;
            int n5 = n4 + (((this.bPQ.position() + n2) * 4 - n4) / 0x200000 + 1) * 0x200000;
            LogManager.getLogger().warn("Needed to grow BufferBuilder buffer: Old size " + n3 + " bytes, new size " + n5 + " bytes.");
            int n6 = this.bPQ.position();
            ByteBuffer byteBuffer = GLAllocation.cE(n5);
            this.bPP.position(0);
            byteBuffer.put(this.bPP);
            byteBuffer.rewind();
            this.bPP = byteBuffer;
            this.bPS = this.bPP.asFloatBuffer();
            this.bPQ = this.bPP.asIntBuffer();
            this.bPQ.position(n6);
            this.bPR = this.bPP.asShortBuffer();
            this.bPR.position(n6 << 1);
            if (this.bQf != null) {
                TextureAtlasSprite[] textureAtlasSpriteArray = this.bQf;
                int n7 = this.LG();
                this.bQf = new TextureAtlasSprite[n7];
                System.arraycopy(textureAtlasSpriteArray, 0, this.bQf, 0, Math.min(textureAtlasSpriteArray.length, this.bQf.length));
                this.bQg = null;
            }
        }
    }

    public void l(float f2, float f3, float f4) {
        int n4;
        int n5;
        int n6 = this.bPT / 4;
        float[] fArray = new float[n6];
        for (int i2 = 0; i2 < n6; ++i2) {
            fArray[i2] = WorldRenderer.a(this.bPS, (float)((double)f2 + this.bPY), (float)((double)f3 + this.bPZ), (float)((double)f4 + this.bQa), this.bQb.OS(), i2 * this.bQb.OT());
        }
        Integer[] integerArray = new Integer[n6];
        for (int i3 = 0; i3 < integerArray.length; ++i3) {
            integerArray[i3] = i3;
        }
        Arrays.sort(integerArray, (n2, n3) -> Floats.compare((float)fArray[n3], (float)fArray[n2]));
        BitSet bitSet = new BitSet();
        int n7 = this.bQb.OT();
        int[] nArray = new int[n7];
        int n8 = 0;
        while ((n8 = bitSet.nextClearBit(n8)) < integerArray.length) {
            n5 = integerArray[n8];
            if (n5 != n8) {
                this.bPQ.limit(n5 * n7 + n7);
                this.bPQ.position(n5 * n7);
                this.bPQ.get(nArray);
                n4 = n5;
                int n9 = integerArray[n5];
                while (n4 != n8) {
                    this.bPQ.limit(n9 * n7 + n7);
                    this.bPQ.position(n9 * n7);
                    IntBuffer intBuffer = this.bPQ.slice();
                    this.bPQ.limit(n4 * n7 + n7);
                    this.bPQ.position(n4 * n7);
                    this.bPQ.put(intBuffer);
                    bitSet.set(n4);
                    n4 = n9;
                    n9 = integerArray[n9];
                }
                this.bPQ.limit(n8 * n7 + n7);
                this.bPQ.position(n8 * n7);
                this.bPQ.put(nArray);
            }
            bitSet.set(n8);
            ++n8;
        }
        this.bPQ.limit(this.bPQ.capacity());
        this.bPQ.position(this.Lv());
        if (this.bQf != null) {
            TextureAtlasSprite[] textureAtlasSpriteArray = new TextureAtlasSprite[this.bPT / 4];
            for (n5 = 0; n5 < integerArray.length; ++n5) {
                n4 = integerArray[n5];
                textureAtlasSpriteArray[n5] = this.bQf[n4];
            }
            System.arraycopy(textureAtlasSpriteArray, 0, this.bQf, 0, textureAtlasSpriteArray.length);
        }
    }

    public WorldRenderer$State Lu() {
        this.bPQ.rewind();
        int n2 = this.Lv();
        this.bPQ.limit(n2);
        int[] nArray = new int[n2];
        this.bPQ.get(nArray);
        this.bPQ.limit(this.bPQ.capacity());
        this.bPQ.position(n2);
        TextureAtlasSprite[] textureAtlasSpriteArray = null;
        if (this.bQf != null) {
            int n3 = this.bPT / 4;
            textureAtlasSpriteArray = new TextureAtlasSprite[n3];
            System.arraycopy(this.bQf, 0, textureAtlasSpriteArray, 0, n3);
        }
        return new WorldRenderer$State(this, nArray, new VertexFormat(this.bQb), textureAtlasSpriteArray);
    }

    public int Lv() {
        return this.bPT * this.bQb.OS();
    }

    private static float a(FloatBuffer floatBuffer, float f2, float f3, float f4, int n2, int n3) {
        float f5 = floatBuffer.get(n3);
        float f6 = floatBuffer.get(n3 + 1);
        float f7 = floatBuffer.get(n3 + 2);
        float f8 = floatBuffer.get(n3 + n2);
        float f9 = floatBuffer.get(n3 + n2 + 1);
        float f10 = floatBuffer.get(n3 + n2 + 2);
        float f11 = floatBuffer.get(n3 + n2 * 2);
        float f12 = floatBuffer.get(n3 + n2 * 2 + 1);
        float f13 = floatBuffer.get(n3 + n2 * 2 + 2);
        float f14 = floatBuffer.get(n3 + n2 * 3);
        float f15 = floatBuffer.get(n3 + n2 * 3 + 1);
        float f16 = floatBuffer.get(n3 + n2 * 3 + 2);
        float f17 = (f5 + f8 + f11 + f14) * 0.25f - f2;
        float f18 = (f6 + f9 + f12 + f15) * 0.25f - f3;
        float f19 = (f7 + f10 + f13 + f16) * 0.25f - f4;
        return f17 * f17 + f18 * f18 + f19 * f19;
    }

    public void a(WorldRenderer$State worldRenderer$State) {
        this.bPQ.clear();
        this.dk(worldRenderer$State.LN().length);
        this.bPQ.put(worldRenderer$State.LN());
        this.bPT = worldRenderer$State.LC();
        this.bQb = new VertexFormat(worldRenderer$State.LB());
        if (worldRenderer$State.bQp != null) {
            if (this.bQf == null) {
                this.bQf = this.bQg;
            }
            if (this.bQf == null || this.bQf.length < this.LG()) {
                this.bQf = new TextureAtlasSprite[this.LG()];
            }
            TextureAtlasSprite[] textureAtlasSpriteArray = worldRenderer$State.bQp;
            System.arraycopy(textureAtlasSpriteArray, 0, this.bQf, 0, textureAtlasSpriteArray.length);
        } else {
            if (this.bQf != null) {
                this.bQg = this.bQf;
            }
            this.bQf = null;
        }
    }

    public void aX() {
        this.bPT = 0;
        this.bPU = null;
        this.bPV = 0;
        this.bQh = null;
        if (bi.bd()) {
            if (this.bQj == null) {
                this.bQj = this.bIH;
            }
            this.bQj.clear();
        } else if (this.bQj != null) {
            this.bQj = null;
        }
        this.bQk = false;
    }

    public void a(int n2, VertexFormat vertexFormat) {
        this.bQc = true;
        this.aX();
        this.bPX = n2;
        this.bQb = vertexFormat;
        this.bPU = vertexFormat.dS(this.bPV);
        this.bPW = false;
        this.bPP.limit(this.bPP.capacity());
        if (a.aoG()) {
            z.f(this);
        }
        if (a.LE()) {
            if (this.bQd != null) {
                if (this.bQf == null) {
                    this.bQf = this.bQg;
                }
                if (this.bQf == null || this.bQf.length < this.LG()) {
                    this.bQf = new TextureAtlasSprite[this.LG()];
                }
            }
        } else {
            if (this.bQf != null) {
                this.bQg = this.bQf;
            }
            this.bQf = null;
        }
    }

    public WorldRenderer r(double d2, double d3) {
        if (this.bQh != null && this.bQf != null) {
            d2 = this.bQh.aF((float)d2);
            d3 = this.bQh.aG((float)d3);
            this.bQf[this.bPT / 4] = this.bQh;
        }
        int n2 = this.bPT * this.bQb.OT() + this.bQb.dT(this.bPV);
        switch (this.bPU.OV()) {
            case ccj: {
                this.bPP.putFloat(n2, (float)d2);
                this.bPP.putFloat(n2 + 4, (float)d3);
                break;
            }
            case cco: 
            case ccp: {
                this.bPP.putInt(n2, (int)d2);
                this.bPP.putInt(n2 + 4, (int)d3);
                break;
            }
            case ccm: 
            case ccn: {
                this.bPP.putShort(n2, (short)d3);
                this.bPP.putShort(n2 + 2, (short)d2);
                break;
            }
            case cck: 
            case ccl: {
                this.bPP.put(n2, (byte)d3);
                this.bPP.put(n2 + 1, (byte)d2);
            }
        }
        this.Ly();
        return this;
    }

    public WorldRenderer aa(int n2, int n3) {
        int n4 = this.bPT * this.bQb.OT() + this.bQb.dT(this.bPV);
        switch (this.bPU.OV()) {
            case ccj: {
                this.bPP.putFloat(n4, n2);
                this.bPP.putFloat(n4 + 4, n3);
                break;
            }
            case cco: 
            case ccp: {
                this.bPP.putInt(n4, n2);
                this.bPP.putInt(n4 + 4, n3);
                break;
            }
            case ccm: 
            case ccn: {
                this.bPP.putShort(n4, (short)n3);
                this.bPP.putShort(n4 + 2, (short)n2);
                break;
            }
            case cck: 
            case ccl: {
                this.bPP.put(n4, (byte)n3);
                this.bPP.put(n4 + 1, (byte)n2);
            }
        }
        this.Ly();
        return this;
    }

    public void q(int n2, int n3, int n4, int n5) {
        int n6 = (this.bPT - 4) * this.bQb.OS() + this.bQb.dR(1) / 4;
        int n7 = this.bQb.OT() >> 2;
        this.bPQ.put(n6, n2);
        this.bPQ.put(n6 + n7, n3);
        this.bPQ.put(n6 + n7 * 2, n4);
        this.bPQ.put(n6 + n7 * 3, n5);
    }

    public void E(double d2, double d3, double d4) {
        int n2 = this.bQb.OS();
        int n3 = (this.bPT - 4) * n2;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n4 = n3 + i2 * n2;
            int n5 = n4 + 1;
            int n6 = n5 + 1;
            this.bPQ.put(n4, Float.floatToRawIntBits((float)(d2 + this.bPY) + Float.intBitsToFloat(this.bPQ.get(n4))));
            this.bPQ.put(n5, Float.floatToRawIntBits((float)(d3 + this.bPZ) + Float.intBitsToFloat(this.bPQ.get(n5))));
            this.bPQ.put(n6, Float.floatToRawIntBits((float)(d4 + this.bQa) + Float.intBitsToFloat(this.bPQ.get(n6))));
        }
    }

    public int dl(int n2) {
        return ((this.bPT - n2) * this.bQb.OT() + this.bQb.OQ()) / 4;
    }

    public static int r(int n2, int n3, int n4, int n5) {
        int n6 = bt.F(n5, 0, 255) << 24;
        n6 |= bt.F(n2, 0, 255) << 16;
        n6 |= bt.F(n3, 0, 255) << 8;
        return n6 |= bt.F(n4, 0, 255);
    }

    public void a(float f2, float f3, float f4, int n2) {
        int n3 = this.dl(n2);
        int n4 = -1;
        if (!this.bPW) {
            n4 = this.bPQ.get(n3);
            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                int n5 = (int)((float)(n4 & 0xFF) * f2);
                int n6 = (int)((float)(n4 >> 8 & 0xFF) * f3);
                int n7 = (int)((float)(n4 >> 16 & 0xFF) * f4);
                n4 &= 0xFF000000;
                n4 = n4 | n7 << 16 | n6 << 8 | n5;
            } else {
                int n8 = (int)((float)(n4 >> 24 & 0xFF) * f2);
                int n9 = (int)((float)(n4 >> 16 & 0xFF) * f3);
                int n10 = (int)((float)(n4 >> 8 & 0xFF) * f4);
                n4 &= 0xFF;
                n4 = n4 | n8 << 24 | n9 << 16 | n10 << 8;
            }
        }
        this.bPQ.put(n3, n4);
    }

    private void ab(int n2, int n3) {
        int n4 = this.dl(n3);
        int n5 = n2 >> 16 & 0xFF;
        int n6 = n2 >> 8 & 0xFF;
        int n7 = n2 & 0xFF;
        int n8 = n2 >> 24 & 0xFF;
        this.b(n4, n5, n6, n7, n8);
    }

    public void b(float f2, float f3, float f4, int n2) {
        int n3 = this.dl(n2);
        int n4 = bt.F((int)(f2 * 255.0f), 0, 255);
        int n5 = bt.F((int)(f3 * 255.0f), 0, 255);
        int n6 = bt.F((int)(f4 * 255.0f), 0, 255);
        this.b(n3, n4, n5, n6, 255);
    }

    public void b(int n2, int n3, int n4, int n5, int n6) {
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            this.bPQ.put(n2, n6 << 24 | n5 << 16 | n4 << 8 | n3);
        } else {
            this.bPQ.put(n2, n3 << 24 | n4 << 16 | n5 << 8 | n6);
        }
    }

    public void Lw() {
        this.bPW = true;
    }

    public WorldRenderer g(float f2, float f3, float f4, float f5) {
        return this.s((int)(f2 * 255.0f), (int)(f3 * 255.0f), (int)(f4 * 255.0f), (int)(f5 * 255.0f));
    }

    public WorldRenderer s(int n2, int n3, int n4, int n5) {
        if (!this.bPW) {
            int n6 = this.bPT * this.bQb.OT() + this.bQb.dT(this.bPV);
            switch (this.bPU.OV()) {
                case ccj: {
                    this.bPP.putFloat(n6, (float)n2 / 255.0f);
                    this.bPP.putFloat(n6 + 4, (float)n3 / 255.0f);
                    this.bPP.putFloat(n6 + 8, (float)n4 / 255.0f);
                    this.bPP.putFloat(n6 + 12, (float)n5 / 255.0f);
                    break;
                }
                case cco: 
                case ccp: {
                    this.bPP.putFloat(n6, n2);
                    this.bPP.putFloat(n6 + 4, n3);
                    this.bPP.putFloat(n6 + 8, n4);
                    this.bPP.putFloat(n6 + 12, n5);
                    break;
                }
                case ccm: 
                case ccn: {
                    this.bPP.putShort(n6, (short)n2);
                    this.bPP.putShort(n6 + 2, (short)n3);
                    this.bPP.putShort(n6 + 4, (short)n4);
                    this.bPP.putShort(n6 + 6, (short)n5);
                    break;
                }
                case cck: 
                case ccl: {
                    if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                        this.bPP.put(n6, (byte)n2);
                        this.bPP.put(n6 + 1, (byte)n3);
                        this.bPP.put(n6 + 2, (byte)n4);
                        this.bPP.put(n6 + 3, (byte)n5);
                        break;
                    }
                    this.bPP.put(n6, (byte)n5);
                    this.bPP.put(n6 + 1, (byte)n4);
                    this.bPP.put(n6 + 2, (byte)n3);
                    this.bPP.put(n6 + 3, (byte)n2);
                }
            }
            this.Ly();
        }
        return this;
    }

    public void c(int[] nArray) {
        if (a.aoG()) {
            z.a(this, nArray);
        }
        this.dk(nArray.length);
        this.bPQ.position(this.Lv());
        this.bPQ.put(nArray);
        this.bPT += nArray.length / this.bQb.OS();
        if (a.aoG()) {
            z.i(this);
        }
    }

    public void Lx() {
        ++this.bPT;
        this.dk(this.bQb.OS());
        this.bPV = 0;
        this.bPU = this.bQb.dS(this.bPV);
        if (a.aoG()) {
            z.h(this);
        }
    }

    public WorldRenderer F(double d2, double d3, double d4) {
        if (a.aoG()) {
            z.g(this);
        }
        int n2 = this.bPT * this.bQb.OT() + this.bQb.dT(this.bPV);
        switch (this.bPU.OV()) {
            case ccj: {
                this.bPP.putFloat(n2, (float)(d2 + this.bPY));
                this.bPP.putFloat(n2 + 4, (float)(d3 + this.bPZ));
                this.bPP.putFloat(n2 + 8, (float)(d4 + this.bQa));
                break;
            }
            case cco: 
            case ccp: {
                this.bPP.putInt(n2, Float.floatToRawIntBits((float)(d2 + this.bPY)));
                this.bPP.putInt(n2 + 4, Float.floatToRawIntBits((float)(d3 + this.bPZ)));
                this.bPP.putInt(n2 + 8, Float.floatToRawIntBits((float)(d4 + this.bQa)));
                break;
            }
            case ccm: 
            case ccn: {
                this.bPP.putShort(n2, (short)(d2 + this.bPY));
                this.bPP.putShort(n2 + 2, (short)(d3 + this.bPZ));
                this.bPP.putShort(n2 + 4, (short)(d4 + this.bQa));
                break;
            }
            case cck: 
            case ccl: {
                this.bPP.put(n2, (byte)(d2 + this.bPY));
                this.bPP.put(n2 + 1, (byte)(d3 + this.bPZ));
                this.bPP.put(n2 + 2, (byte)(d4 + this.bQa));
            }
        }
        this.Ly();
        return this;
    }

    public void m(float f2, float f3, float f4) {
        int n2 = (byte)(f2 * 127.0f) & 0xFF;
        int n3 = (byte)(f3 * 127.0f) & 0xFF;
        int n4 = (byte)(f4 * 127.0f) & 0xFF;
        int n5 = n2 | n3 << 8 | n4 << 16;
        int n6 = this.bQb.OT() >> 2;
        int n7 = (this.bPT - 4) * n6 + this.bQb.OO() / 4;
        this.bPQ.put(n7, n5);
        this.bPQ.put(n7 + n6, n5);
        this.bPQ.put(n7 + n6 * 2, n5);
        this.bPQ.put(n7 + n6 * 3, n5);
    }

    private void Ly() {
        ++this.bPV;
        this.bPV %= this.bQb.OU();
        this.bPU = this.bQb.dS(this.bPV);
        if (this.bPU.OW() == VertexFormatElement$EnumUsage.ccA) {
            this.Ly();
        }
    }

    public WorldRenderer n(float f2, float f3, float f4) {
        int n2 = this.bPT * this.bQb.OT() + this.bQb.dT(this.bPV);
        switch (this.bPU.OV()) {
            case ccj: {
                this.bPP.putFloat(n2, f2);
                this.bPP.putFloat(n2 + 4, f3);
                this.bPP.putFloat(n2 + 8, f4);
                break;
            }
            case cco: 
            case ccp: {
                this.bPP.putInt(n2, (int)f2);
                this.bPP.putInt(n2 + 4, (int)f3);
                this.bPP.putInt(n2 + 8, (int)f4);
                break;
            }
            case ccm: 
            case ccn: {
                this.bPP.putShort(n2, (short)((int)(f2 * 32767.0f) & 0xFFFF));
                this.bPP.putShort(n2 + 2, (short)((int)(f3 * 32767.0f) & 0xFFFF));
                this.bPP.putShort(n2 + 4, (short)((int)(f4 * 32767.0f) & 0xFFFF));
                break;
            }
            case cck: 
            case ccl: {
                this.bPP.put(n2, (byte)((int)(f2 * 127.0f) & 0xFF));
                this.bPP.put(n2 + 1, (byte)((int)(f3 * 127.0f) & 0xFF));
                this.bPP.put(n2 + 2, (byte)((int)(f4 * 127.0f) & 0xFF));
            }
        }
        this.Ly();
        return this;
    }

    public void G(double d2, double d3, double d4) {
        this.bPY = d2;
        this.bPZ = d3;
        this.bQa = d4;
    }

    public void Lz() {
        if (!this.bQc) {
            throw new IllegalStateException("Not building!");
        }
        this.bQc = false;
        this.bPP.position(0);
        this.bPP.limit(this.Lv() * 4);
    }

    public ByteBuffer LA() {
        return this.bQk ? this.bQl : this.bPP;
    }

    public VertexFormat LB() {
        return this.bQb;
    }

    public int LC() {
        return this.bQk ? this.bPT / 4 * 6 : this.bPT;
    }

    public int LD() {
        return this.bQk ? 4 : this.bPX;
    }

    public void dm(int n2) {
        for (int i2 = 0; i2 < 4; ++i2) {
            this.ab(n2, i2 + 1);
        }
    }

    public void o(float f2, float f3, float f4) {
        for (int i2 = 0; i2 < 4; ++i2) {
            this.b(f2, f3, f4, i2 + 1);
        }
    }

    public void b(TextureAtlasSprite textureAtlasSprite) {
        if (this.bQj != null && textureAtlasSprite != null && textureAtlasSprite.Ok() >= 0) {
            this.bQj.set(textureAtlasSprite.Ok());
        }
        if (this.bQf != null) {
            int n2 = this.bPT / 4;
            this.bQf[n2 - 1] = textureAtlasSprite;
        }
    }

    public void c(TextureAtlasSprite textureAtlasSprite) {
        if (this.bQj != null && textureAtlasSprite != null && textureAtlasSprite.Ok() >= 0) {
            this.bQj.set(textureAtlasSprite.Ok());
        }
        if (this.bQf != null) {
            this.bQh = textureAtlasSprite;
        }
    }

    public boolean LE() {
        return this.bQf != null;
    }

    public void LF() {
        if (this.bQf != null) {
            int n2 = a.AZ().Bu().Ox();
            if (this.bQe.length <= n2) {
                this.bQe = new boolean[n2 + 1];
            }
            Arrays.fill(this.bQe, false);
            int n3 = -1;
            int n4 = this.bPT / 4;
            for (int i2 = 0; i2 < n4; ++i2) {
                int n5;
                TextureAtlasSprite textureAtlasSprite = this.bQf[i2];
                if (textureAtlasSprite == null || this.bQe[n5 = textureAtlasSprite.Oj()]) continue;
                if (textureAtlasSprite == ak.eOI) {
                    if (n3 >= 0) continue;
                    n3 = i2;
                    continue;
                }
                i2 = this.a(textureAtlasSprite, i2) - 1;
                if (this.bQd == av.dxY) continue;
                this.bQe[n5] = true;
            }
            if (n3 >= 0) {
                this.a(ak.eOI, n3);
            }
        }
    }

    private int a(TextureAtlasSprite textureAtlasSprite, int n2) {
        GL11.glBindTexture((int)3553, (int)textureAtlasSprite.bZg);
        int n3 = -1;
        int n4 = -1;
        int n5 = this.bPT / 4;
        for (int i2 = n2; i2 < n5; ++i2) {
            TextureAtlasSprite textureAtlasSprite2 = this.bQf[i2];
            if (textureAtlasSprite2 == textureAtlasSprite) {
                if (n4 >= 0) continue;
                n4 = i2;
                continue;
            }
            if (n4 < 0) continue;
            this.ac(n4, i2);
            if (this.bQd == av.dxY) {
                return i2;
            }
            n4 = -1;
            if (n3 >= 0) continue;
            n3 = i2;
        }
        if (n4 >= 0) {
            this.ac(n4, n5);
        }
        if (n3 < 0) {
            n3 = n5;
        }
        return n3;
    }

    private void ac(int n2, int n3) {
        int n4 = n3 - n2;
        if (n4 > 0) {
            int n5 = n2 * 4;
            int n6 = n4 * 4;
            GL11.glDrawArrays((int)this.bPX, (int)n5, (int)n6);
        }
    }

    public void d(av av2) {
        this.bQd = av2;
        if (av2 == null) {
            if (this.bQf != null) {
                this.bQg = this.bQf;
            }
            this.bQf = null;
            this.bQh = null;
        }
    }

    private int LG() {
        return this.bPQ.capacity() * 4 / (this.bQb.OS() * 4);
    }

    public g b(IBlockState iBlockState, b b2) {
        if (this.bPc == null) {
            this.bPc = new g(iBlockState, b2);
        } else {
            this.bPc.c(iBlockState, b2);
        }
        return this.bPc;
    }

    public boolean LH() {
        return this.bQc;
    }

    public double LI() {
        return this.bPY;
    }

    public double LJ() {
        return this.bPZ;
    }

    public double LK() {
        return this.bQa;
    }

    public av xo() {
        return this.bQd;
    }

    public void c(float f2, float f3, float f4, float f5, int n2) {
        int n3 = this.dl(n2);
        int n4 = -1;
        if (!this.bPW) {
            n4 = this.bPQ.get(n3);
            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                int n5 = (int)((float)(n4 & 0xFF) * f2);
                int n6 = (int)((float)(n4 >> 8 & 0xFF) * f3);
                int n7 = (int)((float)(n4 >> 16 & 0xFF) * f4);
                int n8 = (int)((float)(n4 >> 24 & 0xFF) * f5);
                n4 = n8 << 24 | n7 << 16 | n6 << 8 | n5;
            } else {
                int n9 = (int)((float)(n4 >> 24 & 0xFF) * f2);
                int n10 = (int)((float)(n4 >> 16 & 0xFF) * f3);
                int n11 = (int)((float)(n4 >> 8 & 0xFF) * f4);
                int n12 = (int)((float)(n4 & 0xFF) * f5);
                n4 = n9 << 24 | n10 << 16 | n11 << 8 | n12;
            }
        }
        this.bPQ.put(n3, n4);
    }

    public void LL() {
        if (this.bPX == 7) {
            if (this.bQl == null) {
                this.bQl = GLAllocation.cE(this.bPP.capacity() * 2);
            }
            if (this.bQl.capacity() < this.bPP.capacity() * 2) {
                this.bQl = GLAllocation.cE(this.bPP.capacity() * 2);
            }
            int n2 = this.bQb.OT();
            int n3 = this.bPP.limit();
            this.bPP.rewind();
            this.bQl.clear();
            for (int i2 = 0; i2 < this.bPT; i2 += 4) {
                this.bPP.limit((i2 + 3) * n2);
                this.bPP.position(i2 * n2);
                this.bQl.put(this.bPP);
                this.bPP.limit((i2 + 1) * n2);
                this.bPP.position(i2 * n2);
                this.bQl.put(this.bPP);
                this.bPP.limit((i2 + 2 + 2) * n2);
                this.bPP.position((i2 + 2) * n2);
                this.bQl.put(this.bPP);
            }
            this.bPP.limit(n3);
            this.bPP.rewind();
            this.bQl.flip();
            this.bQk = true;
        }
    }

    public boolean LM() {
        return this.bPW;
    }
}

