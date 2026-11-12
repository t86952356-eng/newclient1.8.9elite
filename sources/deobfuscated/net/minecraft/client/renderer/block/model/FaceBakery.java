/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.ReadableVector3f
 *  org.lwjgl.util.vector.Vector3f
 *  org.lwjgl.util.vector.Vector4f
 */
package net.minecraft.client.renderer.block.model;

import net.minecraft.client.renderer.EnumFaceDirection;
import net.minecraft.client.renderer.EnumFaceDirection$Constants;
import net.minecraft.client.renderer.EnumFaceDirection$VertexInformation;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.BlockFaceUV;
import net.minecraft.client.renderer.block.model.BlockPartFace;
import net.minecraft.client.renderer.block.model.BlockPartRotation;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.ModelRotation;
import net.minecraft.src.a;
import net.minecraft.util.ao;
import net.minecraft.util.bt;
import net.minecraft.util.db;
import net.minecraftforge.client.model.d;
import net.optifine.model.b;
import net.optifine.reflect.g;
import net.optifine.shaders.ah;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class FaceBakery {
    private static final float bQR = 1.0f / (float)Math.cos(0.3926991f) - 1.0f;
    private static final float bQS = 1.0f / (float)Math.cos(0.7853981633974483) - 1.0f;

    public BakedQuad a(Vector3f vector3f, Vector3f vector3f2, BlockPartFace blockPartFace, TextureAtlasSprite textureAtlasSprite, ao ao2, ModelRotation modelRotation, BlockPartRotation blockPartRotation, boolean bl2, boolean bl3) {
        return this.a(vector3f, vector3f2, blockPartFace, textureAtlasSprite, ao2, (d)modelRotation, blockPartRotation, bl2, bl3);
    }

    public BakedQuad a(Vector3f vector3f, Vector3f vector3f2, BlockPartFace blockPartFace, TextureAtlasSprite textureAtlasSprite, ao ao2, d d2, BlockPartRotation blockPartRotation, boolean bl2, boolean bl3) {
        int[] nArray = this.a(blockPartFace, textureAtlasSprite, ao2, this.a(vector3f, vector3f2), d2, blockPartRotation, bl2, bl3);
        ao ao3 = FaceBakery.g(nArray);
        if (bl2) {
            this.a(nArray, ao3, blockPartFace.bQK, textureAtlasSprite);
        }
        if (blockPartRotation == null) {
            this.a(nArray, ao3);
        }
        if (g.eoX.aDA()) {
            g.g(g.eoX, nArray, ao3);
        }
        return new BakedQuad(nArray, blockPartFace.bQI, ao3);
    }

    private int[] a(BlockPartFace blockPartFace, TextureAtlasSprite textureAtlasSprite, ao ao2, float[] fArray, d d2, BlockPartRotation blockPartRotation, boolean bl2, boolean bl3) {
        int n2 = 28;
        if (a.aoG()) {
            n2 = 56;
        }
        int[] nArray = new int[n2];
        for (int i2 = 0; i2 < 4; ++i2) {
            this.a(nArray, i2, ao2, blockPartFace, fArray, textureAtlasSprite, d2, blockPartRotation, bl2, bl3);
        }
        return nArray;
    }

    private int k(ao ao2) {
        float f2 = FaceBakery.l(ao2);
        int n2 = bt.F((int)(f2 * 255.0f), 0, 255);
        return 0xFF000000 | n2 << 16 | n2 << 8 | n2;
    }

    public static float l(ao ao2) {
        switch (ao2) {
            case dwq: {
                if (a.aoG()) {
                    return ah.eEj;
                }
                return 0.5f;
            }
            case dwr: {
                return 1.0f;
            }
            case dws: 
            case dwt: {
                if (a.aoG()) {
                    return ah.eEl;
                }
                return 0.8f;
            }
            case dwu: 
            case dwv: {
                if (a.aoG()) {
                    return ah.eEk;
                }
                return 0.6f;
            }
        }
        return 1.0f;
    }

    private float[] a(Vector3f vector3f, Vector3f vector3f2) {
        float[] fArray = new float[ao.values().length];
        fArray[EnumFaceDirection$Constants.bKu] = vector3f.x / 16.0f;
        fArray[EnumFaceDirection$Constants.bKt] = vector3f.y / 16.0f;
        fArray[EnumFaceDirection$Constants.bKs] = vector3f.z / 16.0f;
        fArray[EnumFaceDirection$Constants.bKr] = vector3f2.x / 16.0f;
        fArray[EnumFaceDirection$Constants.bKq] = vector3f2.y / 16.0f;
        fArray[EnumFaceDirection$Constants.bKp] = vector3f2.z / 16.0f;
        return fArray;
    }

    private void a(int[] nArray, int n2, ao ao2, BlockPartFace blockPartFace, float[] fArray, TextureAtlasSprite textureAtlasSprite, d d2, BlockPartRotation blockPartRotation, boolean bl2, boolean bl3) {
        ao ao3 = d2.r(ao2);
        int n3 = bl3 ? this.k(ao3) : -1;
        EnumFaceDirection$VertexInformation enumFaceDirection$VertexInformation = EnumFaceDirection.h(ao2).cB(n2);
        Vector3f vector3f = new Vector3f(fArray[enumFaceDirection$VertexInformation.bKv], fArray[enumFaceDirection$VertexInformation.bKw], fArray[enumFaceDirection$VertexInformation.bKx]);
        this.a(vector3f, blockPartRotation);
        int n4 = this.a(vector3f, ao2, n2, d2, bl2);
        b.a(vector3f);
        this.a(nArray, n4, n2, vector3f, n3, textureAtlasSprite, blockPartFace.bQK);
    }

    private void a(int[] nArray, int n2, int n3, Vector3f vector3f, int n4, TextureAtlasSprite textureAtlasSprite, BlockFaceUV blockFaceUV) {
        int n5 = nArray.length / 4;
        int n6 = n2 * n5;
        nArray[n6] = Float.floatToRawIntBits(vector3f.x);
        nArray[n6 + 1] = Float.floatToRawIntBits(vector3f.y);
        nArray[n6 + 2] = Float.floatToRawIntBits(vector3f.z);
        nArray[n6 + 3] = n4;
        nArray[n6 + 4] = Float.floatToRawIntBits(textureAtlasSprite.al((double)blockFaceUV.dn(n3) * 0.999 + (double)blockFaceUV.dn((n3 + 2) % 4) * 0.001));
        nArray[n6 + 4 + 1] = Float.floatToRawIntBits(textureAtlasSprite.am((double)blockFaceUV.j_do(n3) * 0.999 + (double)blockFaceUV.j_do((n3 + 2) % 4) * 0.001));
    }

    private void a(Vector3f vector3f, BlockPartRotation blockPartRotation) {
        if (blockPartRotation != null) {
            Matrix4f matrix4f = this.Mf();
            Vector3f vector3f2 = new Vector3f(0.0f, 0.0f, 0.0f);
            switch (blockPartRotation.bQM) {
                case dwH: {
                    Matrix4f.rotate((float)(blockPartRotation.bQN * ((float)Math.PI / 180)), (Vector3f)new Vector3f(1.0f, 0.0f, 0.0f), (Matrix4f)matrix4f, (Matrix4f)matrix4f);
                    vector3f2.set(0.0f, 1.0f, 1.0f);
                    break;
                }
                case dwI: {
                    Matrix4f.rotate((float)(blockPartRotation.bQN * ((float)Math.PI / 180)), (Vector3f)new Vector3f(0.0f, 1.0f, 0.0f), (Matrix4f)matrix4f, (Matrix4f)matrix4f);
                    vector3f2.set(1.0f, 0.0f, 1.0f);
                    break;
                }
                case dwJ: {
                    Matrix4f.rotate((float)(blockPartRotation.bQN * ((float)Math.PI / 180)), (Vector3f)new Vector3f(0.0f, 0.0f, 1.0f), (Matrix4f)matrix4f, (Matrix4f)matrix4f);
                    vector3f2.set(1.0f, 1.0f, 0.0f);
                }
            }
            if (blockPartRotation.bQO) {
                if (Math.abs(blockPartRotation.bQN) == 22.5f) {
                    vector3f2.scale(bQR);
                } else {
                    vector3f2.scale(bQS);
                }
                Vector3f.add((Vector3f)vector3f2, (Vector3f)new Vector3f(1.0f, 1.0f, 1.0f), (Vector3f)vector3f2);
            } else {
                vector3f2.set(1.0f, 1.0f, 1.0f);
            }
            this.a(vector3f, new Vector3f((ReadableVector3f)blockPartRotation.bQL), matrix4f, vector3f2);
        }
    }

    public int a(Vector3f vector3f, ao ao2, int n2, ModelRotation modelRotation, boolean bl2) {
        return this.a(vector3f, ao2, n2, modelRotation, bl2);
    }

    public int a(Vector3f vector3f, ao ao2, int n2, d d2, boolean bl2) {
        if (d2 == ModelRotation.cfs) {
            return n2;
        }
        if (g.epq.aDA()) {
            g.g(g.epq, vector3f, d2.QD());
        } else {
            this.a(vector3f, new Vector3f(0.5f, 0.5f, 0.5f), ((ModelRotation)d2).QC(), new Vector3f(1.0f, 1.0f, 1.0f));
        }
        return d2.c(ao2, n2);
    }

    private void a(Vector3f vector3f, Vector3f vector3f2, Matrix4f matrix4f, Vector3f vector3f3) {
        Vector4f vector4f = new Vector4f(vector3f.x - vector3f2.x, vector3f.y - vector3f2.y, vector3f.z - vector3f2.z, 1.0f);
        Matrix4f.transform((Matrix4f)matrix4f, (Vector4f)vector4f, (Vector4f)vector4f);
        vector4f.x *= vector3f3.x;
        vector4f.y *= vector3f3.y;
        vector4f.z *= vector3f3.z;
        vector3f.set(vector4f.x + vector3f2.x, vector4f.y + vector3f2.y, vector4f.z + vector3f2.z);
    }

    private Matrix4f Mf() {
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.setIdentity();
        return matrix4f;
    }

    public static ao g(int[] nArray) {
        int n2 = nArray.length / 4;
        int n3 = n2 * 2;
        int n4 = n2 * 3;
        Vector3f vector3f = new Vector3f(Float.intBitsToFloat(nArray[0]), Float.intBitsToFloat(nArray[1]), Float.intBitsToFloat(nArray[2]));
        Vector3f vector3f2 = new Vector3f(Float.intBitsToFloat(nArray[n2]), Float.intBitsToFloat(nArray[n2 + 1]), Float.intBitsToFloat(nArray[n2 + 2]));
        Vector3f vector3f3 = new Vector3f(Float.intBitsToFloat(nArray[n3]), Float.intBitsToFloat(nArray[n3 + 1]), Float.intBitsToFloat(nArray[n3 + 2]));
        Vector3f vector3f4 = new Vector3f();
        Vector3f vector3f5 = new Vector3f();
        Vector3f vector3f6 = new Vector3f();
        Vector3f.sub((Vector3f)vector3f, (Vector3f)vector3f2, (Vector3f)vector3f4);
        Vector3f.sub((Vector3f)vector3f3, (Vector3f)vector3f2, (Vector3f)vector3f5);
        Vector3f.cross((Vector3f)vector3f5, (Vector3f)vector3f4, (Vector3f)vector3f6);
        float f2 = (float)Math.sqrt(vector3f6.x * vector3f6.x + vector3f6.y * vector3f6.y + vector3f6.z * vector3f6.z);
        vector3f6.x /= f2;
        vector3f6.y /= f2;
        vector3f6.z /= f2;
        ao ao2 = null;
        float f3 = 0.0f;
        for (ao ao3 : ao.values()) {
            db db2 = ao3.asM();
            Vector3f vector3f7 = new Vector3f((float)db2.wt(), (float)db2.wu(), (float)db2.wx());
            float f4 = Vector3f.dot((Vector3f)vector3f6, (Vector3f)vector3f7);
            if (!(f4 >= 0.0f) || !(f4 > f3)) continue;
            f3 = f4;
            ao2 = ao3;
        }
        if (ao2 == null) {
            return ao.dwr;
        }
        return ao2;
    }

    public void a(int[] nArray, ao ao2, BlockFaceUV blockFaceUV, TextureAtlasSprite textureAtlasSprite) {
        for (int i2 = 0; i2 < 4; ++i2) {
            this.a(i2, nArray, ao2, blockFaceUV, textureAtlasSprite);
        }
    }

    private void a(int[] nArray, ao ao2) {
        float f2;
        int n2;
        int[] nArray2 = new int[nArray.length];
        System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
        float[] fArray = new float[ao.values().length];
        fArray[EnumFaceDirection$Constants.bKu] = 999.0f;
        fArray[EnumFaceDirection$Constants.bKt] = 999.0f;
        fArray[EnumFaceDirection$Constants.bKs] = 999.0f;
        fArray[EnumFaceDirection$Constants.bKr] = -999.0f;
        fArray[EnumFaceDirection$Constants.bKq] = -999.0f;
        fArray[EnumFaceDirection$Constants.bKp] = -999.0f;
        int n3 = nArray.length / 4;
        for (int i2 = 0; i2 < 4; ++i2) {
            n2 = n3 * i2;
            float f3 = Float.intBitsToFloat(nArray2[n2]);
            float f4 = Float.intBitsToFloat(nArray2[n2 + 1]);
            f2 = Float.intBitsToFloat(nArray2[n2 + 2]);
            if (f3 < fArray[EnumFaceDirection$Constants.bKu]) {
                fArray[EnumFaceDirection$Constants.bKu] = f3;
            }
            if (f4 < fArray[EnumFaceDirection$Constants.bKt]) {
                fArray[EnumFaceDirection$Constants.bKt] = f4;
            }
            if (f2 < fArray[EnumFaceDirection$Constants.bKs]) {
                fArray[EnumFaceDirection$Constants.bKs] = f2;
            }
            if (f3 > fArray[EnumFaceDirection$Constants.bKr]) {
                fArray[EnumFaceDirection$Constants.bKr] = f3;
            }
            if (f4 > fArray[EnumFaceDirection$Constants.bKq]) {
                fArray[EnumFaceDirection$Constants.bKq] = f4;
            }
            if (!(f2 > fArray[EnumFaceDirection$Constants.bKp])) continue;
            fArray[EnumFaceDirection$Constants.bKp] = f2;
        }
        EnumFaceDirection enumFaceDirection = EnumFaceDirection.h(ao2);
        for (n2 = 0; n2 < 4; ++n2) {
            int n4 = n3 * n2;
            EnumFaceDirection$VertexInformation enumFaceDirection$VertexInformation = enumFaceDirection.cB(n2);
            f2 = fArray[enumFaceDirection$VertexInformation.bKv];
            float f5 = fArray[enumFaceDirection$VertexInformation.bKw];
            float f6 = fArray[enumFaceDirection$VertexInformation.bKx];
            nArray[n4] = Float.floatToRawIntBits(f2);
            nArray[n4 + 1] = Float.floatToRawIntBits(f5);
            nArray[n4 + 2] = Float.floatToRawIntBits(f6);
            for (int i3 = 0; i3 < 4; ++i3) {
                int n5 = n3 * i3;
                float f7 = Float.intBitsToFloat(nArray2[n5]);
                float f8 = Float.intBitsToFloat(nArray2[n5 + 1]);
                float f9 = Float.intBitsToFloat(nArray2[n5 + 2]);
                if (!bt.x(f2, f7) || !bt.x(f5, f8) || !bt.x(f6, f9)) continue;
                nArray[n4 + 4] = nArray2[n5 + 4];
                nArray[n4 + 4 + 1] = nArray2[n5 + 4 + 1];
            }
        }
    }

    private void a(int n2, int[] nArray, ao ao2, BlockFaceUV blockFaceUV, TextureAtlasSprite textureAtlasSprite) {
        int n3 = nArray.length / 4;
        int n4 = n3 * n2;
        float f2 = Float.intBitsToFloat(nArray[n4]);
        float f3 = Float.intBitsToFloat(nArray[n4 + 1]);
        float f4 = Float.intBitsToFloat(nArray[n4 + 2]);
        if (f2 < -0.1f || f2 >= 1.1f) {
            f2 -= (float)bt.bL(f2);
        }
        if (f3 < -0.1f || f3 >= 1.1f) {
            f3 -= (float)bt.bL(f3);
        }
        if (f4 < -0.1f || f4 >= 1.1f) {
            f4 -= (float)bt.bL(f4);
        }
        float f5 = 0.0f;
        float f6 = 0.0f;
        switch (ao2) {
            case dwq: {
                f5 = f2 * 16.0f;
                f6 = (1.0f - f4) * 16.0f;
                break;
            }
            case dwr: {
                f5 = f2 * 16.0f;
                f6 = f4 * 16.0f;
                break;
            }
            case dws: {
                f5 = (1.0f - f2) * 16.0f;
                f6 = (1.0f - f3) * 16.0f;
                break;
            }
            case dwt: {
                f5 = f2 * 16.0f;
                f6 = (1.0f - f3) * 16.0f;
                break;
            }
            case dwu: {
                f5 = f4 * 16.0f;
                f6 = (1.0f - f3) * 16.0f;
                break;
            }
            case dwv: {
                f5 = (1.0f - f4) * 16.0f;
                f6 = (1.0f - f3) * 16.0f;
            }
        }
        int n5 = blockFaceUV.dq(n2) * n3;
        nArray[n5 + 4] = Float.floatToRawIntBits(textureAtlasSprite.al(f5));
        nArray[n5 + 4 + 1] = Float.floatToRawIntBits(textureAtlasSprite.am(f6));
    }
}

