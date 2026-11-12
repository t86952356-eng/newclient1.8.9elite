/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.aa;
import net.minecraft.init.Blocks;
import net.minecraft.util.be;
import net.minecraft.util.bt;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.m;
import net.minecraft.world.chunk.a;
import net.minecraft.world.chunk.f;
import net.minecraft.world.chunk.h;
import net.minecraft.world.gen.s;
import net.minecraft.world.w;

public class b
implements h {
    private final Random dKj;
    private final s dKk;
    private final s dKl;
    private final s dKm;
    public s dKn;
    public s dKo;
    private final w dKp;
    private double[] dKq;
    private j[] dKr;
    double[] dKs;
    double[] dKt;
    double[] dKu;
    double[] dKv;
    double[] dKw;

    public b(w w2, long l2) {
        this.dKp = w2;
        this.dKj = new Random(l2);
        this.dKk = new s(this.dKj, 16);
        this.dKl = new s(this.dKj, 16);
        this.dKm = new s(this.dKj, 8);
        this.dKn = new s(this.dKj, 10);
        this.dKo = new s(this.dKj, 16);
    }

    public void a(int n2, int n3, f f2) {
        int n4 = 2;
        int n5 = 3;
        int n6 = 33;
        int n7 = 3;
        this.dKq = this.a(this.dKq, n2 * 2, 0, n3 * 2, 3, 33, 3);
        for (int i2 = 0; i2 < 2; ++i2) {
            for (int i3 = 0; i3 < 2; ++i3) {
                for (int i4 = 0; i4 < 32; ++i4) {
                    double d2 = 0.25;
                    double d3 = this.dKq[((i2 + 0) * 3 + i3 + 0) * 33 + i4 + 0];
                    double d4 = this.dKq[((i2 + 0) * 3 + i3 + 1) * 33 + i4 + 0];
                    double d5 = this.dKq[((i2 + 1) * 3 + i3 + 0) * 33 + i4 + 0];
                    double d6 = this.dKq[((i2 + 1) * 3 + i3 + 1) * 33 + i4 + 0];
                    double d7 = (this.dKq[((i2 + 0) * 3 + i3 + 0) * 33 + i4 + 1] - d3) * 0.25;
                    double d8 = (this.dKq[((i2 + 0) * 3 + i3 + 1) * 33 + i4 + 1] - d4) * 0.25;
                    double d9 = (this.dKq[((i2 + 1) * 3 + i3 + 0) * 33 + i4 + 1] - d5) * 0.25;
                    double d10 = (this.dKq[((i2 + 1) * 3 + i3 + 1) * 33 + i4 + 1] - d6) * 0.25;
                    for (int i5 = 0; i5 < 4; ++i5) {
                        double d11 = 0.125;
                        double d12 = d3;
                        double d13 = d4;
                        double d14 = (d5 - d3) * 0.125;
                        double d15 = (d6 - d4) * 0.125;
                        for (int i6 = 0; i6 < 8; ++i6) {
                            double d16 = 0.125;
                            double d17 = d12;
                            double d18 = (d13 - d12) * 0.125;
                            for (int i7 = 0; i7 < 8; ++i7) {
                                IBlockState iBlockState = null;
                                if (d17 > 0.0) {
                                    iBlockState = Blocks.cNJ.xM();
                                }
                                int n8 = i6 + i2 * 8;
                                int n9 = i5 + i4 * 4;
                                int n10 = i7 + i3 * 8;
                                f2.a(n8, n9, n10, iBlockState);
                                d17 += d18;
                            }
                            d12 += d14;
                            d13 += d15;
                        }
                        d3 += d7;
                        d4 += d8;
                        d5 += d9;
                        d6 += d10;
                    }
                }
            }
        }
    }

    public void a(f f2) {
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                boolean bl2 = true;
                int n2 = -1;
                IBlockState iBlockState = Blocks.cNJ.xM();
                IBlockState iBlockState2 = Blocks.cNJ.xM();
                for (int i4 = 127; i4 >= 0; --i4) {
                    IBlockState iBlockState3 = f2.S(i2, i4, i3);
                    if (iBlockState3.df().xb() == Material.beo) {
                        n2 = -1;
                        continue;
                    }
                    if (iBlockState3.df() != Blocks.cLd) continue;
                    if (n2 == -1) {
                        n2 = 1;
                        if (i4 >= 0) {
                            f2.a(i2, i4, i3, iBlockState);
                            continue;
                        }
                        f2.a(i2, i4, i3, iBlockState2);
                        continue;
                    }
                    if (n2 <= 0) continue;
                    --n2;
                    f2.a(i2, i4, i3, iBlockState2);
                }
            }
        }
    }

    @Override
    public a H(int n2, int n3) {
        this.dKj.setSeed((long)n2 * 341873128712L + (long)n3 * 132897987541L);
        f f2 = new f();
        this.dKr = this.dKp.avp().b(this.dKr, n2 * 16, n3 * 16, 16, 16);
        this.a(n2, n3, f2);
        this.a(f2);
        a a2 = new a(this.dKp, f2, n2, n3);
        byte[] byArray = a2.axD();
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            byArray[i2] = (byte)this.dKr[i2].dHo;
        }
        a2.axy();
        return a2;
    }

    private double[] a(double[] dArray, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (dArray == null) {
            dArray = new double[n5 * n6 * n7];
        }
        double d2 = 684.412;
        double d3 = 684.412;
        this.dKv = this.dKn.a(this.dKv, n2, n4, n5, n7, 1.121, 1.121, 0.5);
        this.dKw = this.dKo.a(this.dKw, n2, n4, n5, n7, 200.0, 200.0, 0.5);
        this.dKs = this.dKm.a(this.dKs, n2, n3, n4, n5, n6, n7, (d2 *= 2.0) / 80.0, 4.277575000000001, d2 / 80.0);
        this.dKt = this.dKk.a(this.dKt, n2, n3, n4, n5, n6, n7, d2, 684.412, d2);
        this.dKu = this.dKl.a(this.dKu, n2, n3, n4, n5, n6, n7, d2, 684.412, d2);
        int n8 = 0;
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n7; ++i3) {
                float f2 = (float)(i2 + n2) / 1.0f;
                float f3 = (float)(i3 + n4) / 1.0f;
                float f4 = 100.0f - bt.bK(f2 * f2 + f3 * f3) * 8.0f;
                if (f4 > 80.0f) {
                    f4 = 80.0f;
                }
                if (f4 < -100.0f) {
                    f4 = -100.0f;
                }
                for (int i4 = 0; i4 < n6; ++i4) {
                    double d4;
                    double d5 = 0.0;
                    double d6 = this.dKt[n8] / 512.0;
                    double d7 = this.dKu[n8] / 512.0;
                    double d8 = (this.dKs[n8] / 10.0 + 1.0) / 2.0;
                    d5 = d8 < 0.0 ? d6 : (d8 > 1.0 ? d7 : d6 + (d7 - d6) * d8);
                    d5 -= 8.0;
                    d5 += (double)f4;
                    int n9 = 2;
                    if (i4 > n6 / 2 - n9) {
                        d4 = (float)(i4 - (n6 / 2 - n9)) / 64.0f;
                        d4 = bt.ah(d4, 0.0, 1.0);
                        d5 = d5 * (1.0 - d4) + -3000.0 * d4;
                    }
                    if (i4 < (n9 = 8)) {
                        d4 = (float)(n9 - i4) / ((float)n9 - 1.0f);
                        d5 = d5 * (1.0 - d4) + -30.0 * d4;
                    }
                    dArray[n8] = d5;
                    ++n8;
                }
            }
        }
        return dArray;
    }

    @Override
    public boolean E(int n2, int n3) {
        return true;
    }

    @Override
    public void a(h h2, int n2, int n3) {
        BlockFalling.aUB = true;
        net.minecraft.util.b b2 = new net.minecraft.util.b(n2 * 16, 0, n3 * 16);
        this.dKp.aF(b2.C(16, 0, 16)).a(this.dKp, this.dKp.dDk, b2);
        BlockFalling.aUB = false;
    }

    @Override
    public boolean a(h h2, a a2, int n2, int n3) {
        return false;
    }

    @Override
    public boolean a(boolean bl2, be be2) {
        return true;
    }

    @Override
    public void Hj() {
    }

    @Override
    public boolean Hk() {
        return false;
    }

    @Override
    public boolean Hl() {
        return true;
    }

    @Override
    public String Hm() {
        return "RandomLevelSource";
    }

    @Override
    public List<m> a(aa aa2, net.minecraft.util.b b2) {
        return this.dKp.aF(b2).a(aa2);
    }

    @Override
    public net.minecraft.util.b a(w w2, String string, net.minecraft.util.b b2) {
        return null;
    }

    @Override
    public int Hn() {
        return 0;
    }

    @Override
    public void a(a a2, int n2, int n3) {
    }

    @Override
    public a H(net.minecraft.util.b b2) {
        return this.H(b2.wt() >> 4, b2.wx() >> 4);
    }
}

