/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import net.minecraft.world.w;
import net.optifine.ax;

public class ay {
    private final ax eds;
    private final ax edt;
    private final ax edu;
    private int[] edv = new int[0];
    private int[] edw = new int[0];

    public ay(ax ax2, ax ax3, ax ax4) {
        if (ax3 != null || ax4 != null) {
            if (ax3 == null) {
                ax3 = ax2;
            }
            if (ax4 == null) {
                ax4 = ax3;
            }
        }
        this.eds = ax2;
        this.edt = ax3;
        this.edu = ax4;
    }

    public boolean a(w w2, float f2, int[] nArray, boolean bl2, float f3) {
        if (this.edt == null && this.edu == null) {
            return this.eds.a(w2, f2, nArray, bl2);
        }
        int n2 = w2.dDl.getDimensionId();
        if (n2 != 1 && n2 != -1) {
            boolean bl3;
            float f4 = w2.ca(f3);
            float f5 = w2.bY(f3);
            float f6 = 1.0E-4f;
            boolean bl4 = f4 > 1.0E-4f;
            boolean bl5 = bl3 = f5 > 1.0E-4f;
            if (!bl4 && !bl3) {
                return this.eds.a(w2, f2, nArray, bl2);
            }
            if (f4 > 0.0f) {
                f5 /= f4;
            }
            float f7 = 1.0f - f4;
            float f8 = f4 - f5;
            if (this.edv.length != nArray.length) {
                this.edv = new int[nArray.length];
                this.edw = new int[nArray.length];
            }
            int n3 = 0;
            int[][] nArrayArray = new int[][]{nArray, this.edv, this.edw};
            float[] fArray = new float[3];
            if (f7 > 1.0E-4f && this.eds.a(w2, f2, nArrayArray[n3], bl2)) {
                fArray[n3] = f7;
                ++n3;
            }
            if (f8 > 1.0E-4f && this.edt != null && this.edt.a(w2, f2, nArrayArray[n3], bl2)) {
                fArray[n3] = f8;
                ++n3;
            }
            if (f5 > 1.0E-4f && this.edu != null && this.edu.a(w2, f2, nArrayArray[n3], bl2)) {
                fArray[n3] = f5;
                ++n3;
            }
            return n3 == 2 ? this.a(nArrayArray[0], fArray[0], nArrayArray[1], fArray[1]) : n3 != 3 || this.a(nArrayArray[0], fArray[0], nArrayArray[1], fArray[1], nArrayArray[2], fArray[2]);
        }
        return this.eds.a(w2, f2, nArray, bl2);
    }

    private boolean a(int[] nArray, float f2, int[] nArray2, float f3) {
        if (nArray2.length != nArray.length) {
            return false;
        }
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int n2 = nArray[i2];
            int n3 = n2 >> 16 & 0xFF;
            int n4 = n2 >> 8 & 0xFF;
            int n5 = n2 & 0xFF;
            int n6 = nArray2[i2];
            int n7 = n6 >> 16 & 0xFF;
            int n8 = n6 >> 8 & 0xFF;
            int n9 = n6 & 0xFF;
            int n10 = (int)((float)n3 * f2 + (float)n7 * f3);
            int n11 = (int)((float)n4 * f2 + (float)n8 * f3);
            int n12 = (int)((float)n5 * f2 + (float)n9 * f3);
            nArray[i2] = 0xFF000000 | n10 << 16 | n11 << 8 | n12;
        }
        return true;
    }

    private boolean a(int[] nArray, float f2, int[] nArray2, float f3, int[] nArray3, float f4) {
        if (nArray2.length == nArray.length && nArray3.length == nArray.length) {
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                int n2 = nArray[i2];
                int n3 = n2 >> 16 & 0xFF;
                int n4 = n2 >> 8 & 0xFF;
                int n5 = n2 & 0xFF;
                int n6 = nArray2[i2];
                int n7 = n6 >> 16 & 0xFF;
                int n8 = n6 >> 8 & 0xFF;
                int n9 = n6 & 0xFF;
                int n10 = nArray3[i2];
                int n11 = n10 >> 16 & 0xFF;
                int n12 = n10 >> 8 & 0xFF;
                int n13 = n10 & 0xFF;
                int n14 = (int)((float)n3 * f2 + (float)n7 * f3 + (float)n11 * f4);
                int n15 = (int)((float)n4 * f2 + (float)n8 * f3 + (float)n12 * f4);
                int n16 = (int)((float)n5 * f2 + (float)n9 * f3 + (float)n13 * f4);
                nArray[i2] = 0xFF000000 | n14 << 16 | n15 << 8 | n16;
            }
            return true;
        }
        return false;
    }
}

