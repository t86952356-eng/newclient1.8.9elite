/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import java.nio.FloatBuffer;
import java.util.Arrays;

public class x {
    static void b(float[] fArray, float[] fArray2, float[] fArray3) {
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = 0; i3 < 4; ++i3) {
                fArray[4 * i2 + i3] = fArray2[4 * i2 + 0] * fArray3[0 + i3] + fArray2[4 * i2 + 1] * fArray3[4 + i3] + fArray2[4 * i2 + 2] * fArray3[8 + i3] + fArray2[4 * i2 + 3] * fArray3[12 + i3];
            }
        }
    }

    static void c(float[] fArray, float[] fArray2, float[] fArray3) {
        fArray[0] = fArray2[0] * fArray3[0] + fArray2[4] * fArray3[1] + fArray2[8] * fArray3[2] + fArray2[12] * fArray3[3];
        fArray[1] = fArray2[1] * fArray3[0] + fArray2[5] * fArray3[1] + fArray2[9] * fArray3[2] + fArray2[13] * fArray3[3];
        fArray[2] = fArray2[2] * fArray3[0] + fArray2[6] * fArray3[1] + fArray2[10] * fArray3[2] + fArray2[14] * fArray3[3];
        fArray[3] = fArray2[3] * fArray3[0] + fArray2[7] * fArray3[1] + fArray2[11] * fArray3[2] + fArray2[15] * fArray3[3];
    }

    static void c(float[] fArray, float[] fArray2) {
        fArray[0] = fArray2[5] * fArray2[10] * fArray2[15] - fArray2[5] * fArray2[11] * fArray2[14] - fArray2[9] * fArray2[6] * fArray2[15] + fArray2[9] * fArray2[7] * fArray2[14] + fArray2[13] * fArray2[6] * fArray2[11] - fArray2[13] * fArray2[7] * fArray2[10];
        fArray[1] = -fArray2[1] * fArray2[10] * fArray2[15] + fArray2[1] * fArray2[11] * fArray2[14] + fArray2[9] * fArray2[2] * fArray2[15] - fArray2[9] * fArray2[3] * fArray2[14] - fArray2[13] * fArray2[2] * fArray2[11] + fArray2[13] * fArray2[3] * fArray2[10];
        fArray[2] = fArray2[1] * fArray2[6] * fArray2[15] - fArray2[1] * fArray2[7] * fArray2[14] - fArray2[5] * fArray2[2] * fArray2[15] + fArray2[5] * fArray2[3] * fArray2[14] + fArray2[13] * fArray2[2] * fArray2[7] - fArray2[13] * fArray2[3] * fArray2[6];
        fArray[3] = -fArray2[1] * fArray2[6] * fArray2[11] + fArray2[1] * fArray2[7] * fArray2[10] + fArray2[5] * fArray2[2] * fArray2[11] - fArray2[5] * fArray2[3] * fArray2[10] - fArray2[9] * fArray2[2] * fArray2[7] + fArray2[9] * fArray2[3] * fArray2[6];
        fArray[4] = -fArray2[4] * fArray2[10] * fArray2[15] + fArray2[4] * fArray2[11] * fArray2[14] + fArray2[8] * fArray2[6] * fArray2[15] - fArray2[8] * fArray2[7] * fArray2[14] - fArray2[12] * fArray2[6] * fArray2[11] + fArray2[12] * fArray2[7] * fArray2[10];
        fArray[5] = fArray2[0] * fArray2[10] * fArray2[15] - fArray2[0] * fArray2[11] * fArray2[14] - fArray2[8] * fArray2[2] * fArray2[15] + fArray2[8] * fArray2[3] * fArray2[14] + fArray2[12] * fArray2[2] * fArray2[11] - fArray2[12] * fArray2[3] * fArray2[10];
        fArray[6] = -fArray2[0] * fArray2[6] * fArray2[15] + fArray2[0] * fArray2[7] * fArray2[14] + fArray2[4] * fArray2[2] * fArray2[15] - fArray2[4] * fArray2[3] * fArray2[14] - fArray2[12] * fArray2[2] * fArray2[7] + fArray2[12] * fArray2[3] * fArray2[6];
        fArray[7] = fArray2[0] * fArray2[6] * fArray2[11] - fArray2[0] * fArray2[7] * fArray2[10] - fArray2[4] * fArray2[2] * fArray2[11] + fArray2[4] * fArray2[3] * fArray2[10] + fArray2[8] * fArray2[2] * fArray2[7] - fArray2[8] * fArray2[3] * fArray2[6];
        fArray[8] = fArray2[4] * fArray2[9] * fArray2[15] - fArray2[4] * fArray2[11] * fArray2[13] - fArray2[8] * fArray2[5] * fArray2[15] + fArray2[8] * fArray2[7] * fArray2[13] + fArray2[12] * fArray2[5] * fArray2[11] - fArray2[12] * fArray2[7] * fArray2[9];
        fArray[9] = -fArray2[0] * fArray2[9] * fArray2[15] + fArray2[0] * fArray2[11] * fArray2[13] + fArray2[8] * fArray2[1] * fArray2[15] - fArray2[8] * fArray2[3] * fArray2[13] - fArray2[12] * fArray2[1] * fArray2[11] + fArray2[12] * fArray2[3] * fArray2[9];
        fArray[10] = fArray2[0] * fArray2[5] * fArray2[15] - fArray2[0] * fArray2[7] * fArray2[13] - fArray2[4] * fArray2[1] * fArray2[15] + fArray2[4] * fArray2[3] * fArray2[13] + fArray2[12] * fArray2[1] * fArray2[7] - fArray2[12] * fArray2[3] * fArray2[5];
        fArray[11] = -fArray2[0] * fArray2[5] * fArray2[11] + fArray2[0] * fArray2[7] * fArray2[9] + fArray2[4] * fArray2[1] * fArray2[11] - fArray2[4] * fArray2[3] * fArray2[9] - fArray2[8] * fArray2[1] * fArray2[7] + fArray2[8] * fArray2[3] * fArray2[5];
        fArray[12] = -fArray2[4] * fArray2[9] * fArray2[14] + fArray2[4] * fArray2[10] * fArray2[13] + fArray2[8] * fArray2[5] * fArray2[14] - fArray2[8] * fArray2[6] * fArray2[13] - fArray2[12] * fArray2[5] * fArray2[10] + fArray2[12] * fArray2[6] * fArray2[9];
        fArray[13] = fArray2[0] * fArray2[9] * fArray2[14] - fArray2[0] * fArray2[10] * fArray2[13] - fArray2[8] * fArray2[1] * fArray2[14] + fArray2[8] * fArray2[2] * fArray2[13] + fArray2[12] * fArray2[1] * fArray2[10] - fArray2[12] * fArray2[2] * fArray2[9];
        fArray[14] = -fArray2[0] * fArray2[5] * fArray2[14] + fArray2[0] * fArray2[6] * fArray2[13] + fArray2[4] * fArray2[1] * fArray2[14] - fArray2[4] * fArray2[2] * fArray2[13] - fArray2[12] * fArray2[1] * fArray2[6] + fArray2[12] * fArray2[2] * fArray2[5];
        fArray[15] = fArray2[0] * fArray2[5] * fArray2[10] - fArray2[0] * fArray2[6] * fArray2[9] - fArray2[4] * fArray2[1] * fArray2[10] + fArray2[4] * fArray2[2] * fArray2[9] + fArray2[8] * fArray2[1] * fArray2[6] - fArray2[8] * fArray2[2] * fArray2[5];
        float f2 = fArray2[0] * fArray[0] + fArray2[1] * fArray[4] + fArray2[2] * fArray[8] + fArray2[3] * fArray[12];
        if ((double)f2 != 0.0) {
            int n2 = 0;
            while (n2 < 16) {
                int n3 = n2++;
                fArray[n3] = fArray[n3] / f2;
            }
        } else {
            Arrays.fill(fArray, 0.0f);
        }
    }

    static void a(FloatBuffer floatBuffer, FloatBuffer floatBuffer2, float[] fArray, float[] fArray2) {
        floatBuffer2.get(fArray2);
        x.c(fArray, fArray2);
        floatBuffer.put(fArray);
    }
}

