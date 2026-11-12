/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import net.minecraft.client.renderer.culling.ClippingHelper;
import net.minecraft.util.bt;
import net.optifine.shaders.ah;
import net.optifine.shaders.x;

public class c
extends ClippingHelper {
    private static final c euy = new c();
    float[] euz = new float[6];
    float[][] euA = new float[10][4];
    int euB;
    float[] euC = new float[16];
    float[] euD = new float[4];

    @Override
    public boolean f(double d2, double d3, double d4, double d5, double d6, double d7) {
        for (int i2 = 0; i2 < this.euB; ++i2) {
            float[] fArray = this.euA[i2];
            if (!(this.a(fArray, d2, d3, d4) <= 0.0) || !(this.a(fArray, d5, d3, d4) <= 0.0) || !(this.a(fArray, d2, d6, d4) <= 0.0) || !(this.a(fArray, d5, d6, d4) <= 0.0) || !(this.a(fArray, d2, d3, d7) <= 0.0) || !(this.a(fArray, d5, d3, d7) <= 0.0) || !(this.a(fArray, d2, d6, d7) <= 0.0) || !(this.a(fArray, d5, d6, d7) <= 0.0)) continue;
            return false;
        }
        return true;
    }

    private double a(float[] fArray, double d2, double d3, double d4) {
        return (double)fArray[0] * d2 + (double)fArray[1] * d3 + (double)fArray[2] * d4 + (double)fArray[3];
    }

    private double a(float[] fArray, float[] fArray2) {
        return (double)fArray[0] * (double)fArray2[0] + (double)fArray[1] * (double)fArray2[1] + (double)fArray[2] * (double)fArray2[2];
    }

    public static ClippingHelper Ni() {
        euy.init();
        return euy;
    }

    private void g(float[] fArray) {
        float f2 = bt.bK(fArray[0] * fArray[0] + fArray[1] * fArray[1] + fArray[2] * fArray[2]);
        fArray[0] = fArray[0] / f2;
        fArray[1] = fArray[1] / f2;
        fArray[2] = fArray[2] / f2;
        fArray[3] = fArray[3] / f2;
    }

    private void h(float[] fArray) {
        float f2 = bt.bK(fArray[0] * fArray[0] + fArray[1] * fArray[1] + fArray[2] * fArray[2]);
        if (f2 == 0.0f) {
            f2 = 1.0f;
        }
        fArray[0] = fArray[0] / f2;
        fArray[1] = fArray[1] / f2;
        fArray[2] = fArray[2] / f2;
    }

    private void a(float[] fArray, float f2, float f3, float f4, float f5) {
        float f6 = (float)Math.sqrt(f2 * f2 + f3 * f3 + f4 * f4);
        fArray[0] = f2 / f6;
        fArray[1] = f3 / f6;
        fArray[2] = f4 / f6;
        fArray[3] = f5 / f6;
    }

    private void b(float[] fArray, float[] fArray2) {
        fArray[0] = fArray2[0];
        fArray[1] = fArray2[1];
        fArray[2] = fArray2[2];
        fArray[3] = fArray2[3];
    }

    private void a(float[] fArray, float[] fArray2, float[] fArray3) {
        fArray[0] = fArray2[1] * fArray3[2] - fArray2[2] * fArray3[1];
        fArray[1] = fArray2[2] * fArray3[0] - fArray2[0] * fArray3[2];
        fArray[2] = fArray2[0] * fArray3[1] - fArray2[1] * fArray3[0];
    }

    private void i(float[] fArray) {
        this.b(this.euA[this.euB++], fArray);
    }

    private float M(float f2, float f3, float f4) {
        return (float)Math.sqrt(f2 * f2 + f3 * f3 + f4 * f4);
    }

    private float b(float f2, float f3, float f4, float f5, float f6, float f7) {
        return this.M(f2 - f5, f3 - f6, f4 - f7);
    }

    private void a(float[] fArray, float[] fArray2, float[] fArray3, float[] fArray4) {
        this.a(this.euD, fArray2, fArray3);
        this.a(fArray, this.euD, fArray4);
        this.h(fArray);
        float f2 = (float)this.a(fArray2, fArray3);
        float f3 = (float)this.a(fArray, fArray3);
        float f4 = this.b(fArray[0], fArray[1], fArray[2], fArray3[0] * f3, fArray3[1] * f3, fArray3[2] * f3);
        float f5 = this.b(fArray2[0], fArray2[1], fArray2[2], fArray3[0] * f2, fArray3[1] * f2, fArray3[2] * f2);
        float f6 = f4 / f5;
        float f7 = (float)this.a(fArray, fArray2);
        float f8 = this.b(fArray[0], fArray[1], fArray[2], fArray2[0] * f7, fArray2[1] * f7, fArray2[2] * f7);
        float f9 = this.b(fArray3[0], fArray3[1], fArray3[2], fArray2[0] * f2, fArray2[1] * f2, fArray2[2] * f2);
        float f10 = f8 / f9;
        fArray[3] = fArray2[3] * f6 + fArray3[3] * f10;
    }

    public void init() {
        float[] fArray = this.bTY;
        float[] fArray2 = this.bTZ;
        float[] fArray3 = this.bUa;
        System.arraycopy(ah.eED, 0, fArray, 0, 16);
        System.arraycopy(ah.eEF, 0, fArray2, 0, 16);
        x.b(fArray3, fArray2, fArray);
        this.a(this.bTX[0], fArray3[3] - fArray3[0], fArray3[7] - fArray3[4], fArray3[11] - fArray3[8], fArray3[15] - fArray3[12]);
        this.a(this.bTX[1], fArray3[3] + fArray3[0], fArray3[7] + fArray3[4], fArray3[11] + fArray3[8], fArray3[15] + fArray3[12]);
        this.a(this.bTX[2], fArray3[3] + fArray3[1], fArray3[7] + fArray3[5], fArray3[11] + fArray3[9], fArray3[15] + fArray3[13]);
        this.a(this.bTX[3], fArray3[3] - fArray3[1], fArray3[7] - fArray3[5], fArray3[11] - fArray3[9], fArray3[15] - fArray3[13]);
        this.a(this.bTX[4], fArray3[3] - fArray3[2], fArray3[7] - fArray3[6], fArray3[11] - fArray3[10], fArray3[15] - fArray3[14]);
        this.a(this.bTX[5], fArray3[3] + fArray3[2], fArray3[7] + fArray3[6], fArray3[11] + fArray3[10], fArray3[15] + fArray3[14]);
        float[] fArray4 = ah.eyt;
        float f2 = (float)this.a(this.bTX[0], fArray4);
        float f3 = (float)this.a(this.bTX[1], fArray4);
        float f4 = (float)this.a(this.bTX[2], fArray4);
        float f5 = (float)this.a(this.bTX[3], fArray4);
        float f6 = (float)this.a(this.bTX[4], fArray4);
        float f7 = (float)this.a(this.bTX[5], fArray4);
        this.euB = 0;
        if (f2 >= 0.0f) {
            this.b(this.euA[this.euB++], this.bTX[0]);
            if (f2 > 0.0f) {
                if (f4 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[0], this.bTX[2], fArray4);
                }
                if (f5 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[0], this.bTX[3], fArray4);
                }
                if (f6 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[0], this.bTX[4], fArray4);
                }
                if (f7 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[0], this.bTX[5], fArray4);
                }
            }
        }
        if (f3 >= 0.0f) {
            this.b(this.euA[this.euB++], this.bTX[1]);
            if (f3 > 0.0f) {
                if (f4 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[1], this.bTX[2], fArray4);
                }
                if (f5 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[1], this.bTX[3], fArray4);
                }
                if (f6 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[1], this.bTX[4], fArray4);
                }
                if (f7 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[1], this.bTX[5], fArray4);
                }
            }
        }
        if (f4 >= 0.0f) {
            this.b(this.euA[this.euB++], this.bTX[2]);
            if (f4 > 0.0f) {
                if (f2 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[2], this.bTX[0], fArray4);
                }
                if (f3 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[2], this.bTX[1], fArray4);
                }
                if (f6 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[2], this.bTX[4], fArray4);
                }
                if (f7 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[2], this.bTX[5], fArray4);
                }
            }
        }
        if (f5 >= 0.0f) {
            this.b(this.euA[this.euB++], this.bTX[3]);
            if (f5 > 0.0f) {
                if (f2 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[3], this.bTX[0], fArray4);
                }
                if (f3 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[3], this.bTX[1], fArray4);
                }
                if (f6 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[3], this.bTX[4], fArray4);
                }
                if (f7 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[3], this.bTX[5], fArray4);
                }
            }
        }
        if (f6 >= 0.0f) {
            this.b(this.euA[this.euB++], this.bTX[4]);
            if (f6 > 0.0f) {
                if (f2 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[4], this.bTX[0], fArray4);
                }
                if (f3 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[4], this.bTX[1], fArray4);
                }
                if (f4 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[4], this.bTX[2], fArray4);
                }
                if (f5 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[4], this.bTX[3], fArray4);
                }
            }
        }
        if (f7 >= 0.0f) {
            this.b(this.euA[this.euB++], this.bTX[5]);
            if (f7 > 0.0f) {
                if (f2 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[5], this.bTX[0], fArray4);
                }
                if (f3 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[5], this.bTX[1], fArray4);
                }
                if (f4 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[5], this.bTX[2], fArray4);
                }
                if (f5 < 0.0f) {
                    this.a(this.euA[this.euB++], this.bTX[5], this.bTX[3], fArray4);
                }
            }
        }
    }
}

