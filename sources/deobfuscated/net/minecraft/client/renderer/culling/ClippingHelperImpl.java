/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.culling;

import java.nio.FloatBuffer;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.culling.ClippingHelper;
import net.minecraft.util.bt;

public class ClippingHelperImpl
extends ClippingHelper {
    private static final ClippingHelperImpl bUb = new ClippingHelperImpl();
    private final FloatBuffer bUc = GLAllocation.cG(16);
    private final FloatBuffer bUd = GLAllocation.cG(16);
    private final FloatBuffer bUe = GLAllocation.cG(16);

    public static ClippingHelper Ni() {
        bUb.init();
        return bUb;
    }

    private void c(float[] fArray) {
        float f2 = bt.bK(fArray[0] * fArray[0] + fArray[1] * fArray[1] + fArray[2] * fArray[2]);
        fArray[0] = fArray[0] / f2;
        fArray[1] = fArray[1] / f2;
        fArray[2] = fArray[2] / f2;
        fArray[3] = fArray[3] / f2;
    }

    public void init() {
        this.bUc.clear();
        this.bUd.clear();
        this.bUe.clear();
        GlStateManager.a(2983, this.bUc);
        GlStateManager.a(2982, this.bUd);
        float[] fArray = this.bTY;
        float[] fArray2 = this.bTZ;
        this.bUc.flip().limit(16);
        this.bUc.get(fArray);
        this.bUd.flip().limit(16);
        this.bUd.get(fArray2);
        this.bUa[0] = fArray2[0] * fArray[0] + fArray2[1] * fArray[4] + fArray2[2] * fArray[8] + fArray2[3] * fArray[12];
        this.bUa[1] = fArray2[0] * fArray[1] + fArray2[1] * fArray[5] + fArray2[2] * fArray[9] + fArray2[3] * fArray[13];
        this.bUa[2] = fArray2[0] * fArray[2] + fArray2[1] * fArray[6] + fArray2[2] * fArray[10] + fArray2[3] * fArray[14];
        this.bUa[3] = fArray2[0] * fArray[3] + fArray2[1] * fArray[7] + fArray2[2] * fArray[11] + fArray2[3] * fArray[15];
        this.bUa[4] = fArray2[4] * fArray[0] + fArray2[5] * fArray[4] + fArray2[6] * fArray[8] + fArray2[7] * fArray[12];
        this.bUa[5] = fArray2[4] * fArray[1] + fArray2[5] * fArray[5] + fArray2[6] * fArray[9] + fArray2[7] * fArray[13];
        this.bUa[6] = fArray2[4] * fArray[2] + fArray2[5] * fArray[6] + fArray2[6] * fArray[10] + fArray2[7] * fArray[14];
        this.bUa[7] = fArray2[4] * fArray[3] + fArray2[5] * fArray[7] + fArray2[6] * fArray[11] + fArray2[7] * fArray[15];
        this.bUa[8] = fArray2[8] * fArray[0] + fArray2[9] * fArray[4] + fArray2[10] * fArray[8] + fArray2[11] * fArray[12];
        this.bUa[9] = fArray2[8] * fArray[1] + fArray2[9] * fArray[5] + fArray2[10] * fArray[9] + fArray2[11] * fArray[13];
        this.bUa[10] = fArray2[8] * fArray[2] + fArray2[9] * fArray[6] + fArray2[10] * fArray[10] + fArray2[11] * fArray[14];
        this.bUa[11] = fArray2[8] * fArray[3] + fArray2[9] * fArray[7] + fArray2[10] * fArray[11] + fArray2[11] * fArray[15];
        this.bUa[12] = fArray2[12] * fArray[0] + fArray2[13] * fArray[4] + fArray2[14] * fArray[8] + fArray2[15] * fArray[12];
        this.bUa[13] = fArray2[12] * fArray[1] + fArray2[13] * fArray[5] + fArray2[14] * fArray[9] + fArray2[15] * fArray[13];
        this.bUa[14] = fArray2[12] * fArray[2] + fArray2[13] * fArray[6] + fArray2[14] * fArray[10] + fArray2[15] * fArray[14];
        this.bUa[15] = fArray2[12] * fArray[3] + fArray2[13] * fArray[7] + fArray2[14] * fArray[11] + fArray2[15] * fArray[15];
        float[] fArray3 = this.bTX[0];
        fArray3[0] = this.bUa[3] - this.bUa[0];
        fArray3[1] = this.bUa[7] - this.bUa[4];
        fArray3[2] = this.bUa[11] - this.bUa[8];
        fArray3[3] = this.bUa[15] - this.bUa[12];
        this.c(fArray3);
        float[] fArray4 = this.bTX[1];
        fArray4[0] = this.bUa[3] + this.bUa[0];
        fArray4[1] = this.bUa[7] + this.bUa[4];
        fArray4[2] = this.bUa[11] + this.bUa[8];
        fArray4[3] = this.bUa[15] + this.bUa[12];
        this.c(fArray4);
        float[] fArray5 = this.bTX[2];
        fArray5[0] = this.bUa[3] + this.bUa[1];
        fArray5[1] = this.bUa[7] + this.bUa[5];
        fArray5[2] = this.bUa[11] + this.bUa[9];
        fArray5[3] = this.bUa[15] + this.bUa[13];
        this.c(fArray5);
        float[] fArray6 = this.bTX[3];
        fArray6[0] = this.bUa[3] - this.bUa[1];
        fArray6[1] = this.bUa[7] - this.bUa[5];
        fArray6[2] = this.bUa[11] - this.bUa[9];
        fArray6[3] = this.bUa[15] - this.bUa[13];
        this.c(fArray6);
        float[] fArray7 = this.bTX[4];
        fArray7[0] = this.bUa[3] - this.bUa[2];
        fArray7[1] = this.bUa[7] - this.bUa[6];
        fArray7[2] = this.bUa[11] - this.bUa[10];
        fArray7[3] = this.bUa[15] - this.bUa[14];
        this.c(fArray7);
        float[] fArray8 = this.bTX[5];
        fArray8[0] = this.bUa[3] + this.bUa[2];
        fArray8[1] = this.bUa[7] + this.bUa[6];
        fArray8[2] = this.bUa[11] + this.bUa[10];
        fArray8[3] = this.bUa[15] + this.bUa[14];
        this.c(fArray8);
    }
}

