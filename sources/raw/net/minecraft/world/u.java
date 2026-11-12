/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern$PatternHelper;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.util.ap;
import net.minecraft.util.aq;
import net.minecraft.util.bq;
import net.minecraft.util.bt;
import net.minecraft.util.g;
import net.minecraft.world.ai;
import net.minecraft.world.b;
import net.minecraft.world.v;

public class u {
    private final ai dCL;
    private final Random dCM;
    private final bq<v> dCN = new bq();
    private final List<Long> dCO = Lists.newArrayList();

    public u(ai ai2) {
        this.dCL = ai2;
        this.dCM = new Random(ai2.avD());
    }

    public void g(c c2, float f2) {
        if (this.dCL.dDl.getDimensionId() != 1) {
            if (!this.h(c2, f2)) {
                this.ax(c2);
                this.h(c2, f2);
            }
        } else {
            int n2 = bt.aF(c2.gW);
            int n3 = bt.aF(c2.gX) - 1;
            int n4 = bt.aF(c2.gY);
            boolean bl2 = true;
            boolean bl3 = false;
            for (int i2 = -2; i2 <= 2; ++i2) {
                for (int i3 = -2; i3 <= 2; ++i3) {
                    for (int i4 = -1; i4 < 3; ++i4) {
                        int n5 = n2 + i3 * 1 + i2 * 0;
                        int n6 = n3 + i4;
                        int n7 = n4 + i3 * 0 - i2 * 1;
                        boolean bl4 = i4 < 0;
                        this.dCL.d(new net.minecraft.util.b(n5, n6, n7), bl4 ? Blocks.cMb.xM() : Blocks.cLc.xM());
                    }
                }
            }
            c2.b((double)n2, (double)n3, (double)n4, c2.pl, 0.0f);
            c2.uf = 0.0;
            c2.ue = 0.0;
            c2.ud = 0.0;
        }
    }

    public boolean h(c c2, float f2) {
        int n2 = 128;
        double d2 = -1.0;
        int n3 = bt.aF(c2.gW);
        int n4 = bt.aF(c2.gY);
        boolean bl2 = true;
        net.minecraft.util.b b2 = net.minecraft.util.b.dtN;
        long l2 = b.aK(n3, n4);
        if (this.dCN.C(l2)) {
            var12_10 = this.dCN.B(l2);
            d2 = 0.0;
            b2 = var12_10;
            ((v)var12_10).dCP = this.dCL.getTotalWorldTime();
            bl2 = false;
        } else {
            var12_10 = new net.minecraft.util.b(c2);
            for (int i2 = -128; i2 <= 128; ++i2) {
                for (int i3 = -128; i3 <= 128; ++i3) {
                    net.minecraft.util.b b3 = var12_10.C(i2, this.dCL.avM() - 1 - var12_10.wu(), i3);
                    while (b3.wu() >= 0) {
                        net.minecraft.util.b b4 = b3.aqY();
                        if (this.dCL.L(b3).df() == Blocks.cNa) {
                            while (this.dCL.L(b4 = b3.aqY()).df() == Blocks.cNa) {
                                b3 = b4;
                            }
                            double d3 = b3.i(var12_10);
                            if (d2 < 0.0 || d3 < d2) {
                                d2 = d3;
                                b2 = b3;
                            }
                        }
                        b3 = b4;
                    }
                }
            }
        }
        if (d2 >= 0.0) {
            if (bl2) {
                this.dCN.a(l2, new v(this, b2, this.dCL.getTotalWorldTime()));
                this.dCO.add(l2);
            }
            double d4 = (double)b2.wt() + 0.5;
            double d5 = (double)b2.wu() + 0.5;
            double d6 = (double)b2.wx() + 0.5;
            BlockPattern$PatternHelper blockPattern$PatternHelper = Blocks.cNa.M(this.dCL, b2);
            boolean bl3 = blockPattern$PatternHelper.Af().asD().asB() == aq.dwP;
            double d7 = blockPattern$PatternHelper.Af().asL() == ap.dwH ? (double)blockPattern$PatternHelper.Ae().wx() : (double)blockPattern$PatternHelper.Ae().wt();
            d5 = (double)(blockPattern$PatternHelper.Ae().wu() + 1) - c2.Uh().dAH * (double)blockPattern$PatternHelper.Ai();
            if (bl3) {
                d7 += 1.0;
            }
            if (blockPattern$PatternHelper.Af().asL() == ap.dwH) {
                d6 = d7 + (1.0 - c2.Uh().dAG) * (double)blockPattern$PatternHelper.Ah() * (double)blockPattern$PatternHelper.Af().asD().asB().asS();
            } else {
                d4 = d7 + (1.0 - c2.Uh().dAG) * (double)blockPattern$PatternHelper.Ah() * (double)blockPattern$PatternHelper.Af().asD().asB().asS();
            }
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            if (blockPattern$PatternHelper.Af().asC() == c2.Ui()) {
                f3 = 1.0f;
                f4 = 1.0f;
            } else if (blockPattern$PatternHelper.Af().asC() == c2.Ui().asC()) {
                f3 = -1.0f;
                f4 = -1.0f;
            } else if (blockPattern$PatternHelper.Af().asC() == c2.Ui().asD()) {
                f5 = 1.0f;
                f6 = -1.0f;
            } else {
                f5 = -1.0f;
                f6 = 1.0f;
            }
            double d8 = c2.ud;
            double d9 = c2.uf;
            c2.ud = d8 * (double)f3 + d9 * (double)f6;
            c2.uf = d8 * (double)f5 + d9 * (double)f4;
            c2.pl = f2 - (float)(c2.Ui().asC().asA() * 90) + (float)(blockPattern$PatternHelper.Af().asA() * 90);
            c2.b(d4, d5, d6, c2.pl, c2.pm);
            return true;
        }
        return false;
    }

    public boolean ax(c c2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        double d2;
        int n10;
        double d3;
        int n11;
        int n12 = 16;
        double d4 = -1.0;
        int n13 = bt.aF(c2.gW);
        int n14 = bt.aF(c2.gX);
        int n15 = bt.aF(c2.gY);
        int n16 = n13;
        int n17 = n14;
        int n18 = n15;
        int n19 = 0;
        int n20 = this.dCM.nextInt(4);
        g g2 = new g();
        for (n11 = n13 - 16; n11 <= n13 + 16; ++n11) {
            d3 = (double)n11 + 0.5 - c2.gW;
            for (n10 = n15 - 16; n10 <= n15 + 16; ++n10) {
                d2 = (double)n10 + 0.5 - c2.gY;
                block2: for (n9 = this.dCL.avM() - 1; n9 >= 0; --n9) {
                    if (!this.dCL.aG(g2.E(n11, n9, n10))) continue;
                    while (n9 > 0 && this.dCL.aG(g2.E(n11, n9 - 1, n10))) {
                        --n9;
                    }
                    for (n8 = n20; n8 < n20 + 4; ++n8) {
                        n7 = n8 % 2;
                        n6 = 1 - n7;
                        if (n8 % 4 >= 2) {
                            n7 = -n7;
                            n6 = -n6;
                        }
                        for (n5 = 0; n5 < 3; ++n5) {
                            for (n4 = 0; n4 < 4; ++n4) {
                                for (int i2 = -1; i2 < 4; ++i2) {
                                    n3 = n11 + (n4 - 1) * n7 + n5 * n6;
                                    n2 = n9 + i2;
                                    int n21 = n10 + (n4 - 1) * n6 - n5 * n7;
                                    g2.E(n3, n2, n21);
                                    if (i2 < 0 && !this.dCL.L(g2).df().xb().zw() || i2 >= 0 && !this.dCL.aG(g2)) continue block2;
                                }
                            }
                        }
                        double d5 = (double)n9 + 0.5 - c2.gX;
                        double d6 = d3 * d3 + d5 * d5 + d2 * d2;
                        if (!(d4 < 0.0) && !(d6 < d4)) continue;
                        d4 = d6;
                        n16 = n11;
                        n17 = n9;
                        n18 = n10;
                        n19 = n8 % 4;
                    }
                }
            }
        }
        if (d4 < 0.0) {
            for (n11 = n13 - 16; n11 <= n13 + 16; ++n11) {
                d3 = (double)n11 + 0.5 - c2.gW;
                for (n10 = n15 - 16; n10 <= n15 + 16; ++n10) {
                    d2 = (double)n10 + 0.5 - c2.gY;
                    block10: for (n9 = this.dCL.avM() - 1; n9 >= 0; --n9) {
                        if (!this.dCL.aG(g2.E(n11, n9, n10))) continue;
                        while (n9 > 0 && this.dCL.aG(g2.E(n11, n9 - 1, n10))) {
                            --n9;
                        }
                        for (n8 = n20; n8 < n20 + 2; ++n8) {
                            n7 = n8 % 2;
                            n6 = 1 - n7;
                            for (int i3 = 0; i3 < 4; ++i3) {
                                for (n4 = -1; n4 < 4; ++n4) {
                                    int n22 = n11 + (i3 - 1) * n7;
                                    n3 = n9 + n4;
                                    n2 = n10 + (i3 - 1) * n6;
                                    g2.E(n22, n3, n2);
                                    if (n4 < 0 && !this.dCL.L(g2).df().xb().zw() || n4 >= 0 && !this.dCL.aG(g2)) continue block10;
                                }
                            }
                            double d7 = (double)n9 + 0.5 - c2.gX;
                            double d8 = d3 * d3 + d7 * d7 + d2 * d2;
                            if (!(d4 < 0.0) && !(d8 < d4)) continue;
                            d4 = d8;
                            n16 = n11;
                            n17 = n9;
                            n18 = n10;
                            n19 = n8 % 2;
                        }
                    }
                }
            }
        }
        n11 = n16;
        int n23 = n17;
        int n24 = n18;
        n10 = n19 % 2;
        int n25 = 1 - n10;
        if (n19 % 4 >= 2) {
            n10 = -n10;
            n25 = -n25;
        }
        if (d4 < 0.0) {
            n23 = n17 = bt.F(n17, 70, this.dCL.avM() - 10);
            for (int i4 = -1; i4 <= 1; ++i4) {
                for (n9 = 1; n9 < 3; ++n9) {
                    for (n8 = -1; n8 < 3; ++n8) {
                        n7 = n11 + (n9 - 1) * n10 + i4 * n25;
                        n6 = n23 + n8;
                        n5 = n24 + (n9 - 1) * n25 - i4 * n10;
                        n4 = n8 < 0 ? 1 : 0;
                        this.dCL.d(new net.minecraft.util.b(n7, n6, n5), n4 != 0 ? Blocks.cMb.xM() : Blocks.cLc.xM());
                    }
                }
            }
        }
        IBlockState iBlockState = Blocks.cNa.xM().a(BlockPortal.aXV, n10 != 0 ? ap.dwH : ap.dwJ);
        for (n9 = 0; n9 < 4; ++n9) {
            for (n8 = 0; n8 < 4; ++n8) {
                for (n7 = -1; n7 < 4; ++n7) {
                    n6 = n11 + (n8 - 1) * n10;
                    n5 = n23 + n7;
                    n4 = n24 + (n8 - 1) * n25;
                    boolean bl2 = n8 == 0 || n8 == 3 || n7 == -1 || n7 == 3;
                    this.dCL.a(new net.minecraft.util.b(n6, n5, n4), bl2 ? Blocks.cMb.xM() : iBlockState, 2);
                }
            }
            for (n8 = 0; n8 < 4; ++n8) {
                for (n7 = -1; n7 < 4; ++n7) {
                    n6 = n11 + (n8 - 1) * n10;
                    n5 = n23 + n7;
                    n4 = n24 + (n8 - 1) * n25;
                    net.minecraft.util.b b2 = new net.minecraft.util.b(n6, n5, n4);
                    this.dCL.c(b2, this.dCL.L(b2).df());
                }
            }
        }
        return true;
    }

    public void H(long l2) {
        if (l2 % 100L == 0L) {
            Iterator<Long> iterator = this.dCO.iterator();
            long l3 = l2 - 300L;
            while (iterator.hasNext()) {
                Long l4 = iterator.next();
                v v2 = this.dCN.B(l4);
                if (v2 != null && v2.dCP >= l3) continue;
                iterator.remove();
                this.dCN.E(l4);
            }
        }
    }
}

