/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.entity.aa;
import net.minecraft.init.Blocks;
import net.minecraft.util.be;
import net.minecraft.util.bt;
import net.minecraft.world.ap;
import net.minecraft.world.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.chunk.a;
import net.minecraft.world.chunk.f;
import net.minecraft.world.gen.feature.l;
import net.minecraft.world.gen.feature.v;
import net.minecraft.world.gen.g;
import net.minecraft.world.gen.h;
import net.minecraft.world.gen.n;
import net.minecraft.world.gen.p;
import net.minecraft.world.gen.s;
import net.minecraft.world.gen.structure.bb;
import net.minecraft.world.gen.structure.k;
import net.minecraft.world.gen.structure.m;
import net.minecraft.world.gen.structure.u;
import net.minecraft.world.t;
import net.minecraft.world.w;

public class d
implements net.minecraft.world.chunk.h {
    private final Random dKG;
    private final s dKH;
    private final s dKI;
    private final s dKJ;
    private final net.minecraft.world.gen.t dKK;
    public s dKo;
    public s dKL;
    public s dKM;
    private final w dKN;
    private final boolean dKO;
    private final ap dKP;
    private final double[] dKQ;
    private final float[] dKR;
    private g dKS;
    private Block dKT = Blocks.cLl;
    private double[] dKU = new double[256];
    private final net.minecraft.world.gen.m dKV = new n();
    private final m dKW = new m();
    private final u dKX = new u();
    private final net.minecraft.world.gen.structure.h dKY = new net.minecraft.world.gen.structure.h();
    private final k dKZ = new k();
    private final net.minecraft.world.gen.m dLa = new p();
    private final bb dLb = new bb();
    private j[] dKr;
    double[] dLc;
    double[] dLd;
    double[] dLe;
    double[] dLf;

    public d(w w2, long l2, boolean bl2, String string) {
        this.dKN = w2;
        this.dKO = bl2;
        this.dKP = w2.avH().awC();
        this.dKG = new Random(l2);
        this.dKH = new s(this.dKG, 16);
        this.dKI = new s(this.dKG, 16);
        this.dKJ = new s(this.dKG, 8);
        this.dKK = new net.minecraft.world.gen.t(this.dKG, 4);
        this.dKo = new s(this.dKG, 10);
        this.dKL = new s(this.dKG, 16);
        this.dKM = new s(this.dKG, 8);
        this.dKQ = new double[825];
        this.dKR = new float[25];
        for (int i2 = -2; i2 <= 2; ++i2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                float f2;
                this.dKR[i2 + 2 + (i3 + 2) * 5] = f2 = 10.0f / bt.bK((float)(i2 * i2 + i3 * i3) + 0.2f);
            }
        }
        if (string != null) {
            this.dKS = h.gI(string).ayi();
            this.dKT = this.dKS.dMr ? Blocks.cLn : Blocks.cLl;
            w2.id(this.dKS.dMd);
        }
    }

    public void b(int n2, int n3, f f2) {
        this.dKr = this.dKN.avp().a(this.dKr, n2 * 4 - 2, n3 * 4 - 2, 10, 10);
        this.ac(n2 * 4, 0, n3 * 4);
        for (int i2 = 0; i2 < 4; ++i2) {
            int n4 = i2 * 5;
            int n5 = (i2 + 1) * 5;
            for (int i3 = 0; i3 < 4; ++i3) {
                int n6 = (n4 + i3) * 33;
                int n7 = (n4 + i3 + 1) * 33;
                int n8 = (n5 + i3) * 33;
                int n9 = (n5 + i3 + 1) * 33;
                for (int i4 = 0; i4 < 32; ++i4) {
                    double d2 = 0.125;
                    double d3 = this.dKQ[n6 + i4];
                    double d4 = this.dKQ[n7 + i4];
                    double d5 = this.dKQ[n8 + i4];
                    double d6 = this.dKQ[n9 + i4];
                    double d7 = (this.dKQ[n6 + i4 + 1] - d3) * 0.125;
                    double d8 = (this.dKQ[n7 + i4 + 1] - d4) * 0.125;
                    double d9 = (this.dKQ[n8 + i4 + 1] - d5) * 0.125;
                    double d10 = (this.dKQ[n9 + i4 + 1] - d6) * 0.125;
                    for (int i5 = 0; i5 < 8; ++i5) {
                        double d11 = 0.25;
                        double d12 = d3;
                        double d13 = d4;
                        double d14 = (d5 - d3) * 0.25;
                        double d15 = (d6 - d4) * 0.25;
                        for (int i6 = 0; i6 < 4; ++i6) {
                            double d16 = 0.25;
                            double d17 = (d13 - d12) * 0.25;
                            double d18 = d12 - d17;
                            for (int i7 = 0; i7 < 4; ++i7) {
                                double d19;
                                d18 += d17;
                                if (d19 > 0.0) {
                                    f2.a(i2 * 4 + i6, i4 * 8 + i5, i3 * 4 + i7, Blocks.cLd.xM());
                                    continue;
                                }
                                if (i4 * 8 + i5 >= this.dKS.dMd) continue;
                                f2.a(i2 * 4 + i6, i4 * 8 + i5, i3 * 4 + i7, this.dKT.xM());
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

    public void a(int n2, int n3, f f2, j[] jArray) {
        double d2 = 0.03125;
        this.dKU = this.dKK.a(this.dKU, n2 * 16, n3 * 16, 16, 16, 0.0625, 0.0625, 1.0);
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                j j2 = jArray[i3 + i2 * 16];
                j2.a(this.dKN, this.dKG, f2, n2 * 16 + i2, n3 * 16 + i3, this.dKU[i3 + i2 * 16]);
            }
        }
    }

    @Override
    public a H(int n2, int n3) {
        this.dKG.setSeed((long)n2 * 341873128712L + (long)n3 * 132897987541L);
        f f2 = new f();
        this.b(n2, n3, f2);
        this.dKr = this.dKN.avp().b(this.dKr, n2 * 16, n3 * 16, 16, 16);
        this.a(n2, n3, f2, this.dKr);
        if (this.dKS.dMe) {
            this.dKV.a(this, this.dKN, n2, n3, f2);
        }
        if (this.dKS.dMm) {
            this.dLa.a(this, this.dKN, n2, n3, f2);
        }
        if (this.dKS.dMj && this.dKO) {
            this.dKY.a(this, this.dKN, n2, n3, f2);
        }
        if (this.dKS.dMi && this.dKO) {
            this.dKX.a(this, this.dKN, n2, n3, f2);
        }
        if (this.dKS.dMh && this.dKO) {
            this.dKW.a(this, this.dKN, n2, n3, f2);
        }
        if (this.dKS.dMk && this.dKO) {
            this.dKZ.a(this, this.dKN, n2, n3, f2);
        }
        if (this.dKS.dMl && this.dKO) {
            this.dLb.a(this, this.dKN, n2, n3, f2);
        }
        a a2 = new a(this.dKN, f2, n2, n3);
        byte[] byArray = a2.axD();
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            byArray[i2] = (byte)this.dKr[i2].dHo;
        }
        a2.axy();
        return a2;
    }

    private void ac(int n2, int n3, int n4) {
        this.dLf = this.dKL.a(this.dLf, n2, n4, 5, 5, this.dKS.dLR, this.dKS.dLS, this.dKS.dLT);
        float f2 = this.dKS.dLN;
        float f3 = this.dKS.dLO;
        this.dLc = this.dKJ.a(this.dLc, n2, n3, n4, 5, 33, 5, f2 / this.dKS.dLU, f3 / this.dKS.dLV, f2 / this.dKS.dLW);
        this.dLd = this.dKH.a(this.dLd, n2, n3, n4, 5, 33, 5, f2, f3, f2);
        this.dLe = this.dKI.a(this.dLe, n2, n3, n4, 5, 33, 5, f2, f3, f2);
        n4 = 0;
        n2 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i2 = 0; i2 < 5; ++i2) {
            for (int i3 = 0; i3 < 5; ++i3) {
                float f4 = 0.0f;
                float f5 = 0.0f;
                float f6 = 0.0f;
                int n7 = 2;
                j j2 = this.dKr[i2 + 2 + (i3 + 2) * 10];
                for (int i4 = -2; i4 <= 2; ++i4) {
                    for (int i5 = -2; i5 <= 2; ++i5) {
                        j j3 = this.dKr[i2 + i4 + 2 + (i3 + i5 + 2) * 10];
                        float f7 = this.dKS.dMa + j3.dHc * this.dKS.dLZ;
                        float f8 = this.dKS.dMc + j3.dHd * this.dKS.dMb;
                        if (this.dKP == ap.dEG && f7 > 0.0f) {
                            f7 = 1.0f + f7 * 2.0f;
                            f8 = 1.0f + f8 * 4.0f;
                        }
                        float f9 = this.dKR[i4 + 2 + (i5 + 2) * 5] / (f7 + 2.0f);
                        if (j3.dHc > j2.dHc) {
                            f9 /= 2.0f;
                        }
                        f4 += f8 * f9;
                        f5 += f7 * f9;
                        f6 += f9;
                    }
                }
                f4 /= f6;
                f5 /= f6;
                f4 = f4 * 0.9f + 0.1f;
                f5 = (f5 * 4.0f - 1.0f) / 8.0f;
                double d2 = this.dLf[n6] / 8000.0;
                if (d2 < 0.0) {
                    d2 = -d2 * 0.3;
                }
                if ((d2 = d2 * 3.0 - 2.0) < 0.0) {
                    if ((d2 /= 2.0) < -1.0) {
                        d2 = -1.0;
                    }
                    d2 /= 1.4;
                    d2 /= 2.0;
                } else {
                    if (d2 > 1.0) {
                        d2 = 1.0;
                    }
                    d2 /= 8.0;
                }
                ++n6;
                double d3 = f5;
                double d4 = f4;
                d3 += d2 * 0.2;
                d3 = d3 * (double)this.dKS.dLX / 8.0;
                double d5 = (double)this.dKS.dLX + d3 * 4.0;
                for (int i6 = 0; i6 < 33; ++i6) {
                    double d6 = ((double)i6 - d5) * (double)this.dKS.dLY * 128.0 / 256.0 / d4;
                    if (d6 < 0.0) {
                        d6 *= 4.0;
                    }
                    double d7 = this.dLd[n5] / (double)this.dKS.dLQ;
                    double d8 = this.dLe[n5] / (double)this.dKS.dLP;
                    double d9 = (this.dLc[n5] / 10.0 + 1.0) / 2.0;
                    double d10 = bt.ai(d7, d8, d9) - d6;
                    if (i6 > 29) {
                        double d11 = (float)(i6 - 29) / 3.0f;
                        d10 = d10 * (1.0 - d11) + -10.0 * d11;
                    }
                    this.dKQ[n5] = d10;
                    ++n5;
                }
            }
        }
    }

    @Override
    public boolean E(int n2, int n3) {
        return true;
    }

    @Override
    public void a(net.minecraft.world.chunk.h h2, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        BlockFalling.aUB = true;
        int n7 = n2 * 16;
        int n8 = n3 * 16;
        net.minecraft.util.b b2 = new net.minecraft.util.b(n7, 0, n8);
        j j2 = this.dKN.aF(b2.C(16, 0, 16));
        this.dKG.setSeed(this.dKN.avD());
        long l2 = this.dKG.nextLong() / 2L * 2L + 1L;
        long l3 = this.dKG.nextLong() / 2L * 2L + 1L;
        this.dKG.setSeed((long)n2 * l2 + (long)n3 * l3 ^ this.dKN.avD());
        boolean bl2 = false;
        b b3 = new b(n2, n3);
        if (this.dKS.dMj && this.dKO) {
            this.dKY.a(this.dKN, this.dKG, b3);
        }
        if (this.dKS.dMi && this.dKO) {
            bl2 = this.dKX.a(this.dKN, this.dKG, b3);
        }
        if (this.dKS.dMh && this.dKO) {
            this.dKW.a(this.dKN, this.dKG, b3);
        }
        if (this.dKS.dMk && this.dKO) {
            this.dKZ.a(this.dKN, this.dKG, b3);
        }
        if (this.dKS.dMl && this.dKO) {
            this.dLb.a(this.dKN, this.dKG, b3);
        }
        if (j2 != j.dGh && j2 != j.dGw && this.dKS.dMn && !bl2 && this.dKG.nextInt(this.dKS.dMo) == 0) {
            n6 = this.dKG.nextInt(16) + 8;
            n5 = this.dKG.nextInt(256);
            n4 = this.dKG.nextInt(16) + 8;
            new v(Blocks.cLl).b(this.dKN, this.dKG, b2.C(n6, n5, n4));
        }
        if (!bl2 && this.dKG.nextInt(this.dKS.dMq / 10) == 0 && this.dKS.dMp) {
            n6 = this.dKG.nextInt(16) + 8;
            n5 = this.dKG.nextInt(this.dKG.nextInt(248) + 8);
            n4 = this.dKG.nextInt(16) + 8;
            if (n5 < this.dKN.avB() || this.dKG.nextInt(this.dKS.dMq / 8) == 0) {
                new v(Blocks.cLn).b(this.dKN, this.dKG, b2.C(n6, n5, n4));
            }
        }
        if (this.dKS.dMf) {
            for (n6 = 0; n6 < this.dKS.dMg; ++n6) {
                n5 = this.dKG.nextInt(16) + 8;
                n4 = this.dKG.nextInt(256);
                int n9 = this.dKG.nextInt(16) + 8;
                new l().b(this.dKN, this.dKG, b2.C(n5, n4, n9));
            }
        }
        j2.a(this.dKN, this.dKG, new net.minecraft.util.b(n7, 0, n8));
        t.a(this.dKN, j2, n7 + 8, n8 + 8, 16, 16, this.dKG);
        b2 = b2.C(8, 0, 8);
        for (n6 = 0; n6 < 16; ++n6) {
            for (n5 = 0; n5 < 16; ++n5) {
                net.minecraft.util.b b4 = this.dKN.aS(b2.C(n6, 0, n5));
                net.minecraft.util.b b5 = b4.aqY();
                if (this.dKN.aW(b5)) {
                    this.dKN.a(b5, Blocks.cMK.xM(), 2);
                }
                if (!this.dKN.g(b4, true)) continue;
                this.dKN.a(b4, Blocks.cMJ.xM(), 2);
            }
        }
        BlockFalling.aUB = false;
    }

    @Override
    public boolean a(net.minecraft.world.chunk.h h2, a a2, int n2, int n3) {
        boolean bl2 = false;
        if (this.dKS.dMl && this.dKO && a2.axO() < 3600L) {
            bl2 |= this.dLb.a(this.dKN, this.dKG, new b(n2, n3));
        }
        return bl2;
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
    public List<net.minecraft.world.biome.m> a(aa aa2, net.minecraft.util.b b2) {
        j j2 = this.dKN.aF(b2);
        if (this.dKO) {
            if (aa2 == aa.cvX && this.dKZ.bu(b2)) {
                return this.dKZ.ayG();
            }
            if (aa2 == aa.cvX && this.dKS.dMl && this.dLb.al(this.dKN, b2)) {
                return this.dLb.ayX();
            }
        }
        return j2.a(aa2);
    }

    @Override
    public net.minecraft.util.b a(w w2, String string, net.minecraft.util.b b2) {
        return "Stronghold".equals(string) && this.dKW != null ? this.dKW.am(w2, b2) : null;
    }

    @Override
    public int Hn() {
        return 0;
    }

    @Override
    public void a(a a2, int n2, int n3) {
        if (this.dKS.dMj && this.dKO) {
            this.dKY.a(this, this.dKN, n2, n3, null);
        }
        if (this.dKS.dMi && this.dKO) {
            this.dKX.a(this, this.dKN, n2, n3, null);
        }
        if (this.dKS.dMh && this.dKO) {
            this.dKW.a(this, this.dKN, n2, n3, null);
        }
        if (this.dKS.dMk && this.dKO) {
            this.dKZ.a(this, this.dKN, n2, n3, null);
        }
        if (this.dKS.dMl && this.dKO) {
            this.dLb.a(this, this.dKN, n2, n3, null);
        }
    }

    @Override
    public a H(net.minecraft.util.b b2) {
        return this.H(b2.wt() >> 4, b2.wx() >> 4);
    }
}

