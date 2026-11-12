/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.be;
import net.minecraft.util.bt;
import net.minecraft.world.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.chunk.a;
import net.minecraft.world.chunk.f;
import net.minecraft.world.chunk.h;
import net.minecraft.world.gen.feature.aa;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.gen.feature.m;
import net.minecraft.world.gen.feature.p;
import net.minecraft.world.gen.feature.q;
import net.minecraft.world.gen.feature.r;
import net.minecraft.world.gen.l;
import net.minecraft.world.gen.o;
import net.minecraft.world.gen.s;
import net.minecraft.world.gen.structure.i;
import net.minecraft.world.w;

public class e
implements h {
    private final w dLg;
    private final boolean dLh;
    private final Random dLi;
    private double[] dLj = new double[256];
    private double[] dLk = new double[256];
    private double[] dLl = new double[256];
    private double[] dLm;
    private final s dLn;
    private final s dLo;
    private final s dLp;
    private final s dLq;
    private final s dLr;
    public final s dLs;
    public final s dLt;
    private final m dLu = new m();
    private final p dLv = new p();
    private final q dLw = new q();
    private final ao dLx = new aa(Blocks.cOq.xM(), 14, BlockHelper.x(Blocks.cMX));
    private final r dLy = new r(Blocks.cLm, true);
    private final r dLz = new r(Blocks.cLm, false);
    private final l dLA = new l(Blocks.cLR);
    private final l dLB = new l(Blocks.cLS);
    private final i dLC = new i();
    private final net.minecraft.world.gen.m dLD = new o();
    double[] dKs;
    double[] dKt;
    double[] dKu;
    double[] dKv;
    double[] dKw;

    public e(w w2, boolean bl2, long l2) {
        this.dLg = w2;
        this.dLh = bl2;
        this.dLi = new Random(l2);
        this.dLn = new s(this.dLi, 16);
        this.dLo = new s(this.dLi, 16);
        this.dLp = new s(this.dLi, 8);
        this.dLq = new s(this.dLi, 4);
        this.dLr = new s(this.dLi, 4);
        this.dLs = new s(this.dLi, 10);
        this.dLt = new s(this.dLi, 16);
        w2.id(63);
    }

    public void c(int n2, int n3, f f2) {
        int n4 = 4;
        int n5 = this.dLg.avB() / 2 + 1;
        int n6 = 5;
        int n7 = 17;
        int n8 = 5;
        this.dLm = this.a(this.dLm, n2 * 4, 0, n3 * 4, 5, 17, 5);
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = 0; i3 < 4; ++i3) {
                for (int i4 = 0; i4 < 16; ++i4) {
                    double d2 = 0.125;
                    double d3 = this.dLm[((i2 + 0) * 5 + i3 + 0) * 17 + i4 + 0];
                    double d4 = this.dLm[((i2 + 0) * 5 + i3 + 1) * 17 + i4 + 0];
                    double d5 = this.dLm[((i2 + 1) * 5 + i3 + 0) * 17 + i4 + 0];
                    double d6 = this.dLm[((i2 + 1) * 5 + i3 + 1) * 17 + i4 + 0];
                    double d7 = (this.dLm[((i2 + 0) * 5 + i3 + 0) * 17 + i4 + 1] - d3) * 0.125;
                    double d8 = (this.dLm[((i2 + 0) * 5 + i3 + 1) * 17 + i4 + 1] - d4) * 0.125;
                    double d9 = (this.dLm[((i2 + 1) * 5 + i3 + 0) * 17 + i4 + 1] - d5) * 0.125;
                    double d10 = (this.dLm[((i2 + 1) * 5 + i3 + 1) * 17 + i4 + 1] - d6) * 0.125;
                    for (int i5 = 0; i5 < 8; ++i5) {
                        double d11 = 0.25;
                        double d12 = d3;
                        double d13 = d4;
                        double d14 = (d5 - d3) * 0.25;
                        double d15 = (d6 - d4) * 0.25;
                        for (int i6 = 0; i6 < 4; ++i6) {
                            double d16 = 0.25;
                            double d17 = d12;
                            double d18 = (d13 - d12) * 0.25;
                            for (int i7 = 0; i7 < 4; ++i7) {
                                IBlockState iBlockState = null;
                                if (i4 * 8 + i5 < n5) {
                                    iBlockState = Blocks.cLn.xM();
                                }
                                if (d17 > 0.0) {
                                    iBlockState = Blocks.cMX.xM();
                                }
                                int n9 = i6 + i2 * 4;
                                int n10 = i5 + i4 * 8;
                                int n11 = i7 + i3 * 4;
                                f2.a(n9, n10, n11, iBlockState);
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

    public void d(int n2, int n3, f f2) {
        int n4 = this.dLg.avB() + 1;
        double d2 = 0.03125;
        this.dLj = this.dLq.a(this.dLj, n2 * 16, n3 * 16, 0, 16, 16, 1, 0.03125, 0.03125, 1.0);
        this.dLk = this.dLq.a(this.dLk, n2 * 16, 109, n3 * 16, 16, 1, 16, 0.03125, 1.0, 0.03125);
        this.dLl = this.dLr.a(this.dLl, n2 * 16, n3 * 16, 0, 16, 16, 1, 0.0625, 0.0625, 0.0625);
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                boolean bl2 = this.dLj[i2 + i3 * 16] + this.dLi.nextDouble() * 0.2 > 0.0;
                boolean bl3 = this.dLk[i2 + i3 * 16] + this.dLi.nextDouble() * 0.2 > 0.0;
                int n5 = (int)(this.dLl[i2 + i3 * 16] / 3.0 + 3.0 + this.dLi.nextDouble() * 0.25);
                int n6 = -1;
                IBlockState iBlockState = Blocks.cMX.xM();
                IBlockState iBlockState2 = Blocks.cMX.xM();
                for (int i4 = 127; i4 >= 0; --i4) {
                    if (i4 < 127 - this.dLi.nextInt(5) && i4 > this.dLi.nextInt(5)) {
                        IBlockState iBlockState3 = f2.S(i3, i4, i2);
                        if (iBlockState3.df() != null && iBlockState3.df().xb() != Material.beo) {
                            if (iBlockState3.df() != Blocks.cMX) continue;
                            if (n6 == -1) {
                                if (n5 <= 0) {
                                    iBlockState = null;
                                    iBlockState2 = Blocks.cMX.xM();
                                } else if (i4 >= n4 - 4 && i4 <= n4 + 1) {
                                    iBlockState = Blocks.cMX.xM();
                                    iBlockState2 = Blocks.cMX.xM();
                                    if (bl3) {
                                        iBlockState = Blocks.cLp.xM();
                                        iBlockState2 = Blocks.cMX.xM();
                                    }
                                    if (bl2) {
                                        iBlockState = Blocks.cMY.xM();
                                        iBlockState2 = Blocks.cMY.xM();
                                    }
                                }
                                if (i4 < n4 && (iBlockState == null || iBlockState.df().xb() == Material.beo)) {
                                    iBlockState = Blocks.cLn.xM();
                                }
                                n6 = n5;
                                if (i4 >= n4 - 1) {
                                    f2.a(i3, i4, i2, iBlockState);
                                    continue;
                                }
                                f2.a(i3, i4, i2, iBlockState2);
                                continue;
                            }
                            if (n6 <= 0) continue;
                            --n6;
                            f2.a(i3, i4, i2, iBlockState2);
                            continue;
                        }
                        n6 = -1;
                        continue;
                    }
                    f2.a(i3, i4, i2, Blocks.cLj.xM());
                }
            }
        }
    }

    @Override
    public a H(int n2, int n3) {
        this.dLi.setSeed((long)n2 * 341873128712L + (long)n3 * 132897987541L);
        f f2 = new f();
        this.c(n2, n3, f2);
        this.d(n2, n3, f2);
        this.dLD.a(this, this.dLg, n2, n3, f2);
        if (this.dLh) {
            this.dLC.a(this, this.dLg, n2, n3, f2);
        }
        a a2 = new a(this.dLg, f2, n2, n3);
        j[] jArray = this.dLg.avp().b(null, n2 * 16, n3 * 16, 16, 16);
        byte[] byArray = a2.axD();
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            byArray[i2] = (byte)jArray[i2].dHo;
        }
        a2.axE();
        return a2;
    }

    private double[] a(double[] dArray, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        if (dArray == null) {
            dArray = new double[n5 * n6 * n7];
        }
        double d2 = 684.412;
        double d3 = 2053.236;
        this.dKv = this.dLs.a(this.dKv, n2, n3, n4, n5, 1, n7, 1.0, 0.0, 1.0);
        this.dKw = this.dLt.a(this.dKw, n2, n3, n4, n5, 1, n7, 100.0, 0.0, 100.0);
        this.dKs = this.dLp.a(this.dKs, n2, n3, n4, n5, n6, n7, 8.555150000000001, 34.2206, 8.555150000000001);
        this.dKt = this.dLn.a(this.dKt, n2, n3, n4, n5, n6, n7, 684.412, 2053.236, 684.412);
        this.dKu = this.dLo.a(this.dKu, n2, n3, n4, n5, n6, n7, 684.412, 2053.236, 684.412);
        int n9 = 0;
        double[] dArray2 = new double[n6];
        for (n8 = 0; n8 < n6; ++n8) {
            dArray2[n8] = Math.cos((double)n8 * Math.PI * 6.0 / (double)n6) * 2.0;
            double d4 = n8;
            if (n8 > n6 / 2) {
                d4 = n6 - 1 - n8;
            }
            if (!(d4 < 4.0)) continue;
            d4 = 4.0 - d4;
            int n10 = n8;
            dArray2[n10] = dArray2[n10] - d4 * d4 * d4 * 10.0;
        }
        for (n8 = 0; n8 < n5; ++n8) {
            for (int i2 = 0; i2 < n7; ++i2) {
                double d5 = 0.0;
                for (int i3 = 0; i3 < n6; ++i3) {
                    double d6;
                    double d7 = 0.0;
                    double d8 = dArray2[i3];
                    double d9 = this.dKt[n9] / 512.0;
                    double d10 = this.dKu[n9] / 512.0;
                    double d11 = (this.dKs[n9] / 10.0 + 1.0) / 2.0;
                    d7 = d11 < 0.0 ? d9 : (d11 > 1.0 ? d10 : d9 + (d10 - d9) * d11);
                    d7 -= d8;
                    if (i3 > n6 - 4) {
                        d6 = (float)(i3 - (n6 - 4)) / 3.0f;
                        d7 = d7 * (1.0 - d6) + -10.0 * d6;
                    }
                    if ((double)i3 < 0.0) {
                        d6 = (0.0 - (double)i3) / 4.0;
                        d6 = bt.ah(d6, 0.0, 1.0);
                        d7 = d7 * (1.0 - d6) + -10.0 * d6;
                    }
                    dArray[n9] = d7;
                    ++n9;
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
        int n4;
        BlockFalling.aUB = true;
        net.minecraft.util.b b2 = new net.minecraft.util.b(n2 * 16, 0, n3 * 16);
        b b3 = new b(n2, n3);
        this.dLC.a(this.dLg, this.dLi, b3);
        for (n4 = 0; n4 < 8; ++n4) {
            this.dLz.b(this.dLg, this.dLi, b2.C(this.dLi.nextInt(16) + 8, this.dLi.nextInt(120) + 4, this.dLi.nextInt(16) + 8));
        }
        for (n4 = 0; n4 < this.dLi.nextInt(this.dLi.nextInt(10) + 1) + 1; ++n4) {
            this.dLu.b(this.dLg, this.dLi, b2.C(this.dLi.nextInt(16) + 8, this.dLi.nextInt(120) + 4, this.dLi.nextInt(16) + 8));
        }
        for (n4 = 0; n4 < this.dLi.nextInt(this.dLi.nextInt(10) + 1); ++n4) {
            this.dLv.b(this.dLg, this.dLi, b2.C(this.dLi.nextInt(16) + 8, this.dLi.nextInt(120) + 4, this.dLi.nextInt(16) + 8));
        }
        for (n4 = 0; n4 < 10; ++n4) {
            this.dLw.b(this.dLg, this.dLi, b2.C(this.dLi.nextInt(16) + 8, this.dLi.nextInt(128), this.dLi.nextInt(16) + 8));
        }
        if (this.dLi.nextBoolean()) {
            this.dLA.b(this.dLg, this.dLi, b2.C(this.dLi.nextInt(16) + 8, this.dLi.nextInt(128), this.dLi.nextInt(16) + 8));
        }
        if (this.dLi.nextBoolean()) {
            this.dLB.b(this.dLg, this.dLi, b2.C(this.dLi.nextInt(16) + 8, this.dLi.nextInt(128), this.dLi.nextInt(16) + 8));
        }
        for (n4 = 0; n4 < 16; ++n4) {
            this.dLx.b(this.dLg, this.dLi, b2.C(this.dLi.nextInt(16), this.dLi.nextInt(108) + 10, this.dLi.nextInt(16)));
        }
        for (n4 = 0; n4 < 16; ++n4) {
            this.dLy.b(this.dLg, this.dLi, b2.C(this.dLi.nextInt(16), this.dLi.nextInt(108) + 10, this.dLi.nextInt(16)));
        }
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
        return "HellRandomLevelSource";
    }

    @Override
    public List<net.minecraft.world.biome.m> a(net.minecraft.entity.aa aa2, net.minecraft.util.b b2) {
        if (aa2 == net.minecraft.entity.aa.cvX) {
            if (this.dLC.bv(b2)) {
                return this.dLC.ayF();
            }
            if (this.dLC.al(this.dLg, b2) && this.dLg.L(b2.aqY()).df() == Blocks.cNA) {
                return this.dLC.ayF();
            }
        }
        j j2 = this.dLg.aF(b2);
        return j2.a(aa2);
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
        this.dLC.a(this, this.dLg, n2, n3, null);
    }

    @Override
    public a H(net.minecraft.util.b b2) {
        return this.H(b2.wt() >> 4, b2.wx() >> 4);
    }
}

