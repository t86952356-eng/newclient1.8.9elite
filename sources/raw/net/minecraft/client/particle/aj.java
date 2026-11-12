/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.d;
import net.minecraft.client.particle.ae;
import net.minecraft.client.particle.ah;
import net.minecraft.client.particle.ai;
import net.minecraft.client.particle.c;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.item.ar;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class aj
extends ae {
    private int bGw;
    private final c bGx;
    private v bGy;
    boolean bGq;

    public aj(w w2, double d2, double d3, double d4, double d5, double d6, double d7, c c2, n n2) {
        super(w2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.ud = d5;
        this.ue = d6;
        this.uf = d7;
        this.bGx = c2;
        this.bGd = 8;
        if (n2 != null) {
            this.bGy = n2.D("Explosions", 10);
            if (this.bGy.aeS() == 0) {
                this.bGy = null;
            } else {
                this.bGd = this.bGy.aeS() * 2 - 1;
                for (int i2 = 0; i2 < this.bGy.aeS(); ++i2) {
                    n n3 = this.bGy.gi(i2);
                    if (!n3.eO("Flicker")) continue;
                    this.bGq = true;
                    this.bGd += 15;
                    break;
                }
            }
        }
    }

    @Override
    public void a(WorldRenderer worldRenderer, net.minecraft.entity.c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    @Override
    public void Dm() {
        int n2;
        if (this.bGw == 0 && this.bGy != null) {
            n2 = this.IF();
            boolean bl2 = false;
            if (this.bGy.aeS() >= 3) {
                bl2 = true;
            } else {
                for (int i2 = 0; i2 < this.bGy.aeS(); ++i2) {
                    n n3 = this.bGy.gi(i2);
                    if (n3.eE("Type") != 1) continue;
                    bl2 = true;
                    break;
                }
            }
            String string = "fireworks." + (bl2 ? "largeBlast" : "blast") + (n2 != 0 ? "_far" : "");
            this.baU.a(this.gW, this.gX, this.gY, string, 20.0f, 0.95f + this.ta.nextFloat() * 0.1f, true);
        }
        if (this.bGw % 2 == 0 && this.bGy != null && this.bGw / 2 < this.bGy.aeS()) {
            n2 = this.bGw / 2;
            n n4 = this.bGy.gi(n2);
            byte by2 = n4.eE("Type");
            boolean bl3 = n4.eO("Trail");
            boolean bl4 = n4.eO("Flicker");
            int[] nArray = n4.eM("Colors");
            int[] nArray2 = n4.eM("FadeColors");
            if (nArray.length == 0) {
                nArray = new int[]{ar.cWc[0]};
            }
            if (by2 == 1) {
                this.a(0.5, 4, nArray, nArray2, bl3, bl4);
            } else if (by2 == 2) {
                this.a(0.5, new double[][]{{0.0, 1.0}, {0.3455, 0.309}, {0.9511, 0.309}, {0.3795918367346939, -0.12653061224489795}, {0.6122448979591837, -0.8040816326530612}, {0.0, -0.35918367346938773}}, nArray, nArray2, bl3, bl4, false);
            } else if (by2 == 3) {
                this.a(0.5, new double[][]{{0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}}, nArray, nArray2, bl3, bl4, true);
            } else if (by2 == 4) {
                this.a(nArray, nArray2, bl3, bl4);
            } else {
                this.a(0.25, 2, nArray, nArray2, bl3, bl4);
            }
            int n5 = nArray[0];
            float f2 = (float)((n5 & 0xFF0000) >> 16) / 255.0f;
            float f3 = (float)((n5 & 0xFF00) >> 8) / 255.0f;
            float f4 = (float)((n5 & 0xFF) >> 0) / 255.0f;
            ah ah2 = new ah(this.baU, this.gW, this.gX, this.gY);
            ah2.h(f2, f3, f4);
            this.bGx.a(ah2);
        }
        ++this.bGw;
        if (this.bGw > this.bGd) {
            if (this.bGq) {
                n2 = this.IF() ? 1 : 0;
                String string = "fireworks." + (n2 != 0 ? "twinkle_far" : "twinkle");
                this.baU.a(this.gW, this.gX, this.gY, string, 20.0f, 0.9f + this.ta.nextFloat() * 0.15f, true);
            }
            this.Tt();
        }
    }

    private boolean IF() {
        d d2 = d.AZ();
        return d2 == null || d2.BC() == null || d2.BC().M(this.gW, this.gX, this.gY) >= 256.0;
    }

    private void a(double d2, double d3, double d4, double d5, double d6, double d7, int[] nArray, int[] nArray2, boolean bl2, boolean bl3) {
        ai ai2 = new ai(this.baU, d2, d3, d4, d5, d6, d7, this.bGx);
        ai2.aj(0.99f);
        ai2.al(bl2);
        ai2.am(bl3);
        int n2 = this.ta.nextInt(nArray.length);
        ai2.cu(nArray[n2]);
        if (nArray2 != null && nArray2.length > 0) {
            ai2.cv(nArray2[this.ta.nextInt(nArray2.length)]);
        }
        this.bGx.a(ai2);
    }

    private void a(double d2, int n2, int[] nArray, int[] nArray2, boolean bl2, boolean bl3) {
        double d3 = this.gW;
        double d4 = this.gX;
        double d5 = this.gY;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                for (int i4 = -n2; i4 <= n2; ++i4) {
                    double d6 = (double)i3 + (this.ta.nextDouble() - this.ta.nextDouble()) * 0.5;
                    double d7 = (double)i2 + (this.ta.nextDouble() - this.ta.nextDouble()) * 0.5;
                    double d8 = (double)i4 + (this.ta.nextDouble() - this.ta.nextDouble()) * 0.5;
                    double d9 = (double)bt.aD(d6 * d6 + d7 * d7 + d8 * d8) / d2 + this.ta.nextGaussian() * 0.05;
                    this.a(d3, d4, d5, d6 / d9, d7 / d9, d8 / d9, nArray, nArray2, bl2, bl3);
                    if (i2 == -n2 || i2 == n2 || i3 == -n2 || i3 == n2) continue;
                    i4 += n2 * 2 - 1;
                }
            }
        }
    }

    private void a(double d2, double[][] dArray, int[] nArray, int[] nArray2, boolean bl2, boolean bl3, boolean bl4) {
        double d3 = dArray[0][0];
        double d4 = dArray[0][1];
        this.a(this.gW, this.gX, this.gY, d3 * d2, d4 * d2, 0.0, nArray, nArray2, bl2, bl3);
        float f2 = this.ta.nextFloat() * (float)Math.PI;
        double d5 = bl4 ? 0.034 : 0.34;
        for (int i2 = 0; i2 < 3; ++i2) {
            double d6 = (double)f2 + (double)((float)i2 * (float)Math.PI) * d5;
            double d7 = d3;
            double d8 = d4;
            for (int i3 = 1; i3 < dArray.length; ++i3) {
                double d9 = dArray[i3][0];
                double d10 = dArray[i3][1];
                for (double d11 = 0.25; d11 <= 1.0; d11 += 0.25) {
                    double d12 = (d7 + (d9 - d7) * d11) * d2;
                    double d13 = (d8 + (d10 - d8) * d11) * d2;
                    double d14 = d12 * Math.sin(d6);
                    d12 *= Math.cos(d6);
                    for (double d15 = -1.0; d15 <= 1.0; d15 += 2.0) {
                        this.a(this.gW, this.gX, this.gY, d12 * d15, d13, d14 * d15, nArray, nArray2, bl2, bl3);
                    }
                }
                d7 = d9;
                d8 = d10;
            }
        }
    }

    private void a(int[] nArray, int[] nArray2, boolean bl2, boolean bl3) {
        double d2 = this.ta.nextGaussian() * 0.05;
        double d3 = this.ta.nextGaussian() * 0.05;
        for (int i2 = 0; i2 < 70; ++i2) {
            double d4 = this.ud * 0.5 + this.ta.nextGaussian() * 0.15 + d2;
            double d5 = this.uf * 0.5 + this.ta.nextGaussian() * 0.15 + d3;
            double d6 = this.ue * 0.5 + this.ta.nextDouble() * 0.5;
            this.a(this.gW, this.gX, this.gY, d4, d6, d5, nArray, nArray2, bl2, bl3);
        }
    }

    @Override
    public int Ir() {
        return 0;
    }
}

