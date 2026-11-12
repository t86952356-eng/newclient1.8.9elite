/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import java.util.BitSet;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.BlockModelRenderer;
import net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo;
import net.minecraft.client.renderer.BlockModelRenderer$VertexTranslations;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.l;

public class BlockModelRenderer$AmbientOcclusionFace {
    private final float[] bHC = new float[4];
    private final int[] bHD = new int[4];

    public BlockModelRenderer$AmbientOcclusionFace() {
        this(null);
    }

    public BlockModelRenderer$AmbientOcclusionFace(BlockModelRenderer blockModelRenderer) {
    }

    public void IQ() {
        int n2 = 240;
        this.bHD[0] = this.bHD[0] | 0xF0;
        this.bHD[1] = this.bHD[1] | 0xF0;
        this.bHD[2] = this.bHD[2] | 0xF0;
        this.bHD[3] = this.bHD[3] | 0xF0;
        this.bHC[0] = 1.0f;
        this.bHC[1] = 1.0f;
        this.bHC[2] = 1.0f;
        this.bHC[3] = 1.0f;
    }

    public void a(l l2, Block block, b b2, ao ao2, float[] fArray, BitSet bitSet) {
        int n2;
        float f2;
        int n3;
        float f3;
        int n4;
        float f4;
        int n5;
        float f5;
        b b3 = bitSet.get(0) ? b2.x(ao2) : b2;
        BlockModelRenderer$EnumNeighborInfo blockModelRenderer$EnumNeighborInfo = BlockModelRenderer$EnumNeighborInfo.f(ao2);
        b b4 = b3.x(blockModelRenderer$EnumNeighborInfo.bHK[0]);
        b b5 = b3.x(blockModelRenderer$EnumNeighborInfo.bHK[1]);
        b b6 = b3.x(blockModelRenderer$EnumNeighborInfo.bHK[2]);
        b b7 = b3.x(blockModelRenderer$EnumNeighborInfo.bHK[3]);
        int n6 = block.b(l2, b4);
        int n7 = block.b(l2, b5);
        int n8 = block.b(l2, b6);
        int n9 = block.b(l2, b7);
        float f6 = BlockModelRenderer.ak(l2.L(b4).df().xF());
        float f7 = BlockModelRenderer.ak(l2.L(b5).df().xF());
        float f8 = BlockModelRenderer.ak(l2.L(b6).df().xF());
        float f9 = BlockModelRenderer.ak(l2.L(b7).df().xF());
        boolean bl2 = l2.L(b4.x(ao2)).df().wY();
        boolean bl3 = l2.L(b5.x(ao2)).df().wY();
        boolean bl4 = l2.L(b6.x(ao2)).df().wY();
        boolean bl5 = l2.L(b7.x(ao2)).df().wY();
        if (!bl4 && !bl2) {
            f5 = f6;
            n5 = n6;
        } else {
            b b8 = b4.x(blockModelRenderer$EnumNeighborInfo.bHK[2]);
            f5 = BlockModelRenderer.ak(l2.L(b8).df().xF());
            n5 = block.b(l2, b8);
        }
        if (!bl5 && !bl2) {
            f4 = f6;
            n4 = n6;
        } else {
            b b9 = b4.x(blockModelRenderer$EnumNeighborInfo.bHK[3]);
            f4 = BlockModelRenderer.ak(l2.L(b9).df().xF());
            n4 = block.b(l2, b9);
        }
        if (!bl4 && !bl3) {
            f3 = f7;
            n3 = n7;
        } else {
            b b10 = b5.x(blockModelRenderer$EnumNeighborInfo.bHK[2]);
            f3 = BlockModelRenderer.ak(l2.L(b10).df().xF());
            n3 = block.b(l2, b10);
        }
        if (!bl5 && !bl3) {
            f2 = f7;
            n2 = n7;
        } else {
            b b11 = b5.x(blockModelRenderer$EnumNeighborInfo.bHK[3]);
            f2 = BlockModelRenderer.ak(l2.L(b11).df().xF());
            n2 = block.b(l2, b11);
        }
        int n10 = block.b(l2, b2);
        if (bitSet.get(0) || !l2.L(b2.x(ao2)).df().xk()) {
            n10 = block.b(l2, b2.x(ao2));
        }
        float f10 = bitSet.get(0) ? l2.L(b3).df().xF() : l2.L(b2).df().xF();
        f10 = BlockModelRenderer.ak(f10);
        BlockModelRenderer$VertexTranslations blockModelRenderer$VertexTranslations = BlockModelRenderer$VertexTranslations.g(ao2);
        if (bitSet.get(1) && blockModelRenderer$EnumNeighborInfo.bHM) {
            float f11 = (f9 + f6 + f4 + f10) * 0.25f;
            float f12 = (f8 + f6 + f5 + f10) * 0.25f;
            float f13 = (f8 + f7 + f3 + f10) * 0.25f;
            float f14 = (f9 + f7 + f2 + f10) * 0.25f;
            float f15 = fArray[blockModelRenderer$EnumNeighborInfo.bHN[0].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHN[1].bIf];
            float f16 = fArray[blockModelRenderer$EnumNeighborInfo.bHN[2].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHN[3].bIf];
            float f17 = fArray[blockModelRenderer$EnumNeighborInfo.bHN[4].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHN[5].bIf];
            float f18 = fArray[blockModelRenderer$EnumNeighborInfo.bHN[6].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHN[7].bIf];
            float f19 = fArray[blockModelRenderer$EnumNeighborInfo.bHO[0].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHO[1].bIf];
            float f20 = fArray[blockModelRenderer$EnumNeighborInfo.bHO[2].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHO[3].bIf];
            float f21 = fArray[blockModelRenderer$EnumNeighborInfo.bHO[4].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHO[5].bIf];
            float f22 = fArray[blockModelRenderer$EnumNeighborInfo.bHO[6].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHO[7].bIf];
            float f23 = fArray[blockModelRenderer$EnumNeighborInfo.bHP[0].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHP[1].bIf];
            float f24 = fArray[blockModelRenderer$EnumNeighborInfo.bHP[2].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHP[3].bIf];
            float f25 = fArray[blockModelRenderer$EnumNeighborInfo.bHP[4].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHP[5].bIf];
            float f26 = fArray[blockModelRenderer$EnumNeighborInfo.bHP[6].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHP[7].bIf];
            float f27 = fArray[blockModelRenderer$EnumNeighborInfo.bHQ[0].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHQ[1].bIf];
            float f28 = fArray[blockModelRenderer$EnumNeighborInfo.bHQ[2].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHQ[3].bIf];
            float f29 = fArray[blockModelRenderer$EnumNeighborInfo.bHQ[4].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHQ[5].bIf];
            float f30 = fArray[blockModelRenderer$EnumNeighborInfo.bHQ[6].bIf] * fArray[blockModelRenderer$EnumNeighborInfo.bHQ[7].bIf];
            this.bHC[blockModelRenderer$VertexTranslations.bIn] = f11 * f15 + f12 * f16 + f13 * f17 + f14 * f18;
            this.bHC[blockModelRenderer$VertexTranslations.bIo] = f11 * f19 + f12 * f20 + f13 * f21 + f14 * f22;
            this.bHC[blockModelRenderer$VertexTranslations.bIp] = f11 * f23 + f12 * f24 + f13 * f25 + f14 * f26;
            this.bHC[blockModelRenderer$VertexTranslations.bIq] = f11 * f27 + f12 * f28 + f13 * f29 + f14 * f30;
            int n11 = this.g(n9, n6, n4, n10);
            int n12 = this.g(n8, n6, n5, n10);
            int n13 = this.g(n8, n7, n3, n10);
            int n14 = this.g(n9, n7, n2, n10);
            this.bHD[blockModelRenderer$VertexTranslations.bIn] = this.a(n11, n12, n13, n14, f15, f16, f17, f18);
            this.bHD[blockModelRenderer$VertexTranslations.bIo] = this.a(n11, n12, n13, n14, f19, f20, f21, f22);
            this.bHD[blockModelRenderer$VertexTranslations.bIp] = this.a(n11, n12, n13, n14, f23, f24, f25, f26);
            this.bHD[blockModelRenderer$VertexTranslations.bIq] = this.a(n11, n12, n13, n14, f27, f28, f29, f30);
        } else {
            float f31 = (f9 + f6 + f4 + f10) * 0.25f;
            float f32 = (f8 + f6 + f5 + f10) * 0.25f;
            float f33 = (f8 + f7 + f3 + f10) * 0.25f;
            float f34 = (f9 + f7 + f2 + f10) * 0.25f;
            this.bHD[blockModelRenderer$VertexTranslations.bIn] = this.g(n9, n6, n4, n10);
            this.bHD[blockModelRenderer$VertexTranslations.bIo] = this.g(n8, n6, n5, n10);
            this.bHD[blockModelRenderer$VertexTranslations.bIp] = this.g(n8, n7, n3, n10);
            this.bHD[blockModelRenderer$VertexTranslations.bIq] = this.g(n9, n7, n2, n10);
            this.bHC[blockModelRenderer$VertexTranslations.bIn] = f31;
            this.bHC[blockModelRenderer$VertexTranslations.bIo] = f32;
            this.bHC[blockModelRenderer$VertexTranslations.bIp] = f33;
            this.bHC[blockModelRenderer$VertexTranslations.bIq] = f34;
        }
    }

    private int g(int n2, int n3, int n4, int n5) {
        if (n2 == 0) {
            n2 = n5;
        }
        if (n3 == 0) {
            n3 = n5;
        }
        if (n4 == 0) {
            n4 = n5;
        }
        return n2 + n3 + n4 + n5 >> 2 & 0xFF00FF;
    }

    private int a(int n2, int n3, int n4, int n5, float f2, float f3, float f4, float f5) {
        int n6 = (int)((float)(n2 >> 16 & 0xFF) * f2 + (float)(n3 >> 16 & 0xFF) * f3 + (float)(n4 >> 16 & 0xFF) * f4 + (float)(n5 >> 16 & 0xFF) * f5) & 0xFF;
        int n7 = (int)((float)(n2 & 0xFF) * f2 + (float)(n3 & 0xFF) * f3 + (float)(n4 & 0xFF) * f4 + (float)(n5 & 0xFF) * f5) & 0xFF;
        return n6 << 16 | n7;
    }
}

