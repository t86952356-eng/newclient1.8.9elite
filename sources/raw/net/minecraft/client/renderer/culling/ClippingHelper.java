/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.culling;

public class ClippingHelper {
    public float[][] bTX = new float[6][4];
    public float[] bTY = new float[16];
    public float[] bTZ = new float[16];
    public float[] bUa = new float[16];
    public boolean qW = false;

    private float a(float[] fArray, float f2, float f3, float f4) {
        return fArray[0] * f2 + fArray[1] * f3 + fArray[2] * f4 + fArray[3];
    }

    public boolean f(double d2, double d3, double d4, double d5, double d6, double d7) {
        if (this.qW) {
            return true;
        }
        float f2 = (float)d2;
        float f3 = (float)d3;
        float f4 = (float)d4;
        float f5 = (float)d5;
        float f6 = (float)d6;
        float f7 = (float)d7;
        for (int i2 = 0; i2 < 6; ++i2) {
            float[] fArray = this.bTX[i2];
            float f8 = fArray[0];
            float f9 = fArray[1];
            float f10 = fArray[2];
            float f11 = fArray[3];
            if (!(f8 * f2 + f9 * f3 + f10 * f4 + f11 <= 0.0f) || !(f8 * f5 + f9 * f3 + f10 * f4 + f11 <= 0.0f) || !(f8 * f2 + f9 * f6 + f10 * f4 + f11 <= 0.0f) || !(f8 * f5 + f9 * f6 + f10 * f4 + f11 <= 0.0f) || !(f8 * f2 + f9 * f3 + f10 * f7 + f11 <= 0.0f) || !(f8 * f5 + f9 * f3 + f10 * f7 + f11 <= 0.0f) || !(f8 * f2 + f9 * f6 + f10 * f7 + f11 <= 0.0f) || !(f8 * f5 + f9 * f6 + f10 * f7 + f11 <= 0.0f)) continue;
            return false;
        }
        return true;
    }

    public boolean g(double d2, double d3, double d4, double d5, double d6, double d7) {
        if (this.qW) {
            return true;
        }
        float f2 = (float)d2;
        float f3 = (float)d3;
        float f4 = (float)d4;
        float f5 = (float)d5;
        float f6 = (float)d6;
        float f7 = (float)d7;
        for (int i2 = 0; i2 < 6; ++i2) {
            float[] fArray = this.bTX[i2];
            float f8 = fArray[0];
            float f9 = fArray[1];
            float f10 = fArray[2];
            float f11 = fArray[3];
            if (!(i2 < 4 ? f8 * f2 + f9 * f3 + f10 * f4 + f11 <= 0.0f || f8 * f5 + f9 * f3 + f10 * f4 + f11 <= 0.0f || f8 * f2 + f9 * f6 + f10 * f4 + f11 <= 0.0f || f8 * f5 + f9 * f6 + f10 * f4 + f11 <= 0.0f || f8 * f2 + f9 * f3 + f10 * f7 + f11 <= 0.0f || f8 * f5 + f9 * f3 + f10 * f7 + f11 <= 0.0f || f8 * f2 + f9 * f6 + f10 * f7 + f11 <= 0.0f || f8 * f5 + f9 * f6 + f10 * f7 + f11 <= 0.0f : f8 * f2 + f9 * f3 + f10 * f4 + f11 <= 0.0f && f8 * f5 + f9 * f3 + f10 * f4 + f11 <= 0.0f && f8 * f2 + f9 * f6 + f10 * f4 + f11 <= 0.0f && f8 * f5 + f9 * f6 + f10 * f4 + f11 <= 0.0f && f8 * f2 + f9 * f3 + f10 * f7 + f11 <= 0.0f && f8 * f5 + f9 * f3 + f10 * f7 + f11 <= 0.0f && f8 * f2 + f9 * f6 + f10 * f7 + f11 <= 0.0f && f8 * f5 + f9 * f6 + f10 * f7 + f11 <= 0.0f)) continue;
            return false;
        }
        return true;
    }
}

