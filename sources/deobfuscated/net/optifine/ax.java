/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import net.minecraft.src.a;
import net.minecraft.world.w;
import net.optifine.r;

public class ax {
    private r edp = null;
    private final float[][] edq = new float[16][3];
    private final float[][] edr = new float[16][3];

    public ax(r r2) {
        this.edp = r2;
    }

    public r aBG() {
        return this.edp;
    }

    public boolean a(w w2, float f2, int[] nArray, boolean bl2) {
        if (this.edp == null) {
            return false;
        }
        int n2 = this.edp.getHeight();
        if (bl2 && n2 < 64) {
            return false;
        }
        int n3 = this.edp.getWidth();
        if (n3 < 16) {
            ax.warn("Invalid lightmap width: " + n3);
            this.edp = null;
            return false;
        }
        int n4 = 0;
        if (bl2) {
            n4 = n3 * 16 * 2;
        }
        float f3 = 1.1666666f * (w2.bS(1.0f) - 0.2f);
        if (w2.avQ() > 0) {
            f3 = 1.0f;
        }
        f3 = a.bE(f3);
        float f4 = f3 * (float)(n3 - 1);
        float f5 = a.bE(f2 + 0.5f) * (float)(n3 - 1);
        float f6 = a.bE(a.aoH().chW);
        boolean bl3 = f6 > 1.0E-4f;
        float[][] fArray = this.edp.aAv();
        this.a(fArray, f4, n4, n3, this.edq);
        this.a(fArray, f5, n4 + 16 * n3, n3, this.edr);
        float[] fArray2 = new float[3];
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                int n5;
                for (n5 = 0; n5 < 3; ++n5) {
                    float f7 = a.bE(this.edq[i2][n5] + this.edr[i3][n5]);
                    if (bl3) {
                        float f8 = 1.0f - f7;
                        f8 = 1.0f - f8 * f8 * f8 * f8;
                        f7 = f6 * f8 + (1.0f - f6) * f7;
                    }
                    fArray2[n5] = f7;
                }
                n5 = (int)(fArray2[0] * 255.0f);
                int n6 = (int)(fArray2[1] * 255.0f);
                int n7 = (int)(fArray2[2] * 255.0f);
                nArray[i2 * 16 + i3] = 0xFF000000 | n5 << 16 | n6 << 8 | n7;
            }
        }
        return true;
    }

    private void a(float[][] fArray, float f2, int n2, int n3, float[][] fArray2) {
        int n4;
        int n5 = (int)Math.floor(f2);
        if (n5 == (n4 = (int)Math.ceil(f2))) {
            for (int i2 = 0; i2 < 16; ++i2) {
                float[] fArray3 = fArray[n2 + i2 * n3 + n5];
                float[] fArray4 = fArray2[i2];
                System.arraycopy(fArray3, 0, fArray4, 0, 3);
            }
        } else {
            float f3 = 1.0f - (f2 - (float)n5);
            float f4 = 1.0f - ((float)n4 - f2);
            for (int i3 = 0; i3 < 16; ++i3) {
                float[] fArray5 = fArray[n2 + i3 * n3 + n5];
                float[] fArray6 = fArray[n2 + i3 * n3 + n4];
                float[] fArray7 = fArray2[i3];
                for (int i4 = 0; i4 < 3; ++i4) {
                    fArray7[i4] = fArray5[i4] * f3 + fArray6[i4] * f4;
                }
            }
        }
    }

    private static void fN(String string) {
        a.fN("CustomColors: " + string);
    }

    private static void warn(String string) {
        a.warn("CustomColors: " + string);
    }
}

