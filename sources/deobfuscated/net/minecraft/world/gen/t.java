/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen;

import java.util.Random;
import net.minecraft.world.gen.q;
import net.minecraft.world.gen.u;

public class t
extends q {
    private final u[] dNH;
    private final int dNI;

    public t(Random random, int n2) {
        this.dNI = n2;
        this.dNH = new u[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.dNH[i2] = new u(random);
        }
    }

    public double D(double d2, double d3) {
        double d4 = 0.0;
        double d5 = 1.0;
        for (int i2 = 0; i2 < this.dNI; ++i2) {
            d4 += this.dNH[i2].E(d2 * d5, d3 * d5) / d5;
            d5 /= 2.0;
        }
        return d4;
    }

    public double[] a(double[] dArray, double d2, double d3, int n2, int n3, double d4, double d5, double d6) {
        return this.a(dArray, d2, d3, n2, n3, d4, d5, d6, 0.5);
    }

    public double[] a(double[] dArray, double d2, double d3, int n2, int n3, double d4, double d5, double d6, double d7) {
        if (dArray != null && dArray.length >= n2 * n3) {
            for (int i2 = 0; i2 < dArray.length; ++i2) {
                dArray[i2] = 0.0;
            }
        } else {
            dArray = new double[n2 * n3];
        }
        double d8 = 1.0;
        double d9 = 1.0;
        for (int i3 = 0; i3 < this.dNI; ++i3) {
            this.dNH[i3].b(dArray, d2, d3, n2, n3, d4 * d9 * d8, d5 * d9 * d8, 0.55 / d8);
            d9 *= d6;
            d8 *= d7;
        }
        return dArray;
    }
}

