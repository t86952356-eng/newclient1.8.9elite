/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.optifine;

import java.awt.Dimension;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.src.a;
import net.optifine.util.ak;
import org.lwjgl.opengl.GL11;

public class az {
    private final String edx;
    private final int edy;
    private final int edz;
    private final int[] edA;
    private final boolean edB;
    private final int[][] edC;
    private IntBuffer[] edD;
    private final Dimension[] edE;

    public az(String string, int n2, int n3, int[] nArray, boolean bl2) {
        this.edx = string;
        this.edy = n2;
        this.edz = n3;
        this.edA = nArray;
        this.edB = bl2;
        this.edE = az.a(n2, n3, string);
        this.edC = az.a(nArray, n2, n3, this.edE);
        if (bl2) {
            this.edD = az.a(this.edE, this.edC);
        }
    }

    public static Dimension[] a(int n2, int n3, String string) {
        int n4 = ak.kA(n2);
        int n5 = ak.kA(n3);
        if (n4 == n2 && n5 == n3) {
            ArrayList<Dimension> arrayList = new ArrayList<Dimension>();
            int n6 = n4;
            int n7 = n5;
            while (true) {
                if ((n6 /= 2) <= 0 && (n7 /= 2) <= 0) {
                    Dimension[] dimensionArray = arrayList.toArray(new Dimension[arrayList.size()]);
                    return dimensionArray;
                }
                if (n6 <= 0) {
                    n6 = 1;
                }
                if (n7 <= 0) {
                    n7 = 1;
                }
                int n8 = n6 * n7 * 4;
                Dimension dimension = new Dimension(n6, n7);
                arrayList.add(dimension);
            }
        }
        a.warn("Mipmaps not possible (power of 2 dimensions needed), texture: " + string + ", dim: " + n2 + "x" + n3);
        return new Dimension[0];
    }

    public static int[][] a(int[] nArray, int n2, int n3, Dimension[] dimensionArray) {
        int[] nArray2 = nArray;
        int n4 = n2;
        boolean bl2 = true;
        int[][] nArrayArray = new int[dimensionArray.length][];
        for (int i2 = 0; i2 < dimensionArray.length; ++i2) {
            Dimension dimension = dimensionArray[i2];
            int n5 = dimension.width;
            int n6 = dimension.height;
            int[] nArray3 = new int[n5 * n6];
            nArrayArray[i2] = nArray3;
            int n7 = i2 + 1;
            if (bl2) {
                for (int i3 = 0; i3 < n5; ++i3) {
                    for (int i4 = 0; i4 < n6; ++i4) {
                        int n8;
                        int n9 = nArray2[i3 * 2 + 0 + (i4 * 2 + 0) * n4];
                        int n10 = nArray2[i3 * 2 + 1 + (i4 * 2 + 0) * n4];
                        int n11 = nArray2[i3 * 2 + 1 + (i4 * 2 + 1) * n4];
                        int n12 = nArray2[i3 * 2 + 0 + (i4 * 2 + 1) * n4];
                        nArray3[i3 + i4 * n5] = n8 = az.H(n9, n10, n11, n12);
                    }
                }
            }
            nArray2 = nArray3;
            n4 = n5;
            if (n5 > 1 && n6 > 1) continue;
            bl2 = false;
        }
        return nArrayArray;
    }

    public static int H(int n2, int n3, int n4, int n5) {
        int n6 = az.bF(n2, n3);
        int n7 = az.bF(n4, n5);
        int n8 = az.bF(n6, n7);
        return n8;
    }

    private static int bF(int n2, int n3) {
        int n4 = (n2 & 0xFF000000) >> 24 & 0xFF;
        int n5 = (n3 & 0xFF000000) >> 24 & 0xFF;
        int n6 = (n4 + n5) / 2;
        if (n4 == 0 && n5 == 0) {
            n4 = 1;
            n5 = 1;
        } else {
            if (n4 == 0) {
                n2 = n3;
                n6 /= 2;
            }
            if (n5 == 0) {
                n3 = n2;
                n6 /= 2;
            }
        }
        int n7 = (n2 >> 16 & 0xFF) * n4;
        int n8 = (n2 >> 8 & 0xFF) * n4;
        int n9 = (n2 & 0xFF) * n4;
        int n10 = (n3 >> 16 & 0xFF) * n5;
        int n11 = (n3 >> 8 & 0xFF) * n5;
        int n12 = (n3 & 0xFF) * n5;
        int n13 = (n7 + n10) / (n4 + n5);
        int n14 = (n8 + n11) / (n4 + n5);
        int n15 = (n9 + n12) / (n4 + n5);
        return n6 << 24 | n13 << 16 | n14 << 8 | n15;
    }

    private int bG(int n2, int n3) {
        int n4 = (n2 & 0xFF000000) >> 24 & 0xFF;
        int n5 = (n3 & 0xFF000000) >> 24 & 0xFF;
        return (n4 + n3 >> 1 << 24) + ((n4 & 0xFEFEFE) + (n5 & 0xFEFEFE) >> 1);
    }

    public static IntBuffer[] a(Dimension[] dimensionArray, int[][] nArray) {
        if (dimensionArray == null) {
            return null;
        }
        IntBuffer[] intBufferArray = new IntBuffer[dimensionArray.length];
        for (int i2 = 0; i2 < dimensionArray.length; ++i2) {
            Dimension dimension = dimensionArray[i2];
            int n2 = dimension.width * dimension.height;
            IntBuffer intBuffer = GLAllocation.cF(n2);
            int[] nArray2 = nArray[i2];
            intBuffer.clear();
            intBuffer.put(nArray2);
            intBuffer.clear();
            intBufferArray[i2] = intBuffer;
        }
        return intBufferArray;
    }

    public static void b(int n2, int n3, String string) {
        Dimension[] dimensionArray = az.a(n2, n3, string);
        for (int i2 = 0; i2 < dimensionArray.length; ++i2) {
            Dimension dimension = dimensionArray[i2];
            int n4 = dimension.width;
            int n5 = dimension.height;
            int n6 = i2 + 1;
            GL11.glTexImage2D((int)3553, (int)n6, (int)6408, (int)n4, (int)n5, (int)0, (int)32993, (int)33639, (ByteBuffer)null);
        }
    }
}

