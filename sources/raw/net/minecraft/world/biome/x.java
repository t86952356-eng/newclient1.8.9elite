/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import java.util.Arrays;
import java.util.Random;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.chunk.f;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.gen.t;
import net.minecraft.world.w;

public class x
extends j {
    private IBlockState[] dHQ;
    private long dHR;
    private t dHS;
    private t dHT;
    private t dHU;
    private final boolean dHV;
    private final boolean dHW;

    public x(int n2, boolean bl2, boolean bl3) {
        super(n2);
        this.dHV = bl2;
        this.dHW = bl3;
        this.awU();
        this.B(2.0f, 0.0f);
        this.dHj.clear();
        this.dGZ = Blocks.cLo.xM().a(BlockSand.bab, BlockSand$EnumType.bad);
        this.dHa = Blocks.cOw.xM();
        this.dHh.dFB = -999;
        this.dHh.dFE = 20;
        this.dHh.dFG = 3;
        this.dHh.dFH = 5;
        this.dHh.dFC = 0;
        this.dHj.clear();
        if (bl3) {
            this.dHh.dFB = 5;
        }
    }

    @Override
    public a j(Random random) {
        return this.dHp;
    }

    @Override
    public int bk(b b2) {
        return 10387789;
    }

    @Override
    public int bj(b b2) {
        return 9470285;
    }

    @Override
    public void a(w w2, Random random, b b2) {
        super.a(w2, random, b2);
    }

    @Override
    public void a(w w2, Random random, f f2, int n2, int n3, double d2) {
        int n4;
        int n5;
        if (this.dHQ == null || this.dHR != w2.avD()) {
            this.K(w2.avD());
        }
        if (this.dHS == null || this.dHT == null || this.dHR != w2.avD()) {
            Random random2 = new Random(this.dHR);
            this.dHS = new t(random2, 4);
            this.dHT = new t(random2, 1);
        }
        this.dHR = w2.avD();
        double d3 = 0.0;
        if (this.dHV) {
            n5 = (n2 & 0xFFFFFFF0) + (n3 & 0xF);
            n4 = (n3 & 0xFFFFFFF0) + (n2 & 0xF);
            double d4 = Math.min(Math.abs(d2), this.dHS.D((double)n5 * 0.25, (double)n4 * 0.25));
            if (d4 > 0.0) {
                double d5 = 0.001953125;
                d3 = d4 * d4 * 2.5;
                double d6 = Math.abs(this.dHT.D((double)n5 * 0.001953125, (double)n4 * 0.001953125));
                double d7 = Math.ceil(d6 * 50.0) + 14.0;
                if (d3 > d7) {
                    d3 = d7;
                }
                d3 += 64.0;
            }
        }
        n5 = n2 & 0xF;
        n4 = n3 & 0xF;
        int n6 = w2.avB();
        IBlockState iBlockState = Blocks.cOw.xM();
        IBlockState iBlockState2 = this.dHa;
        int n7 = (int)(d2 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        boolean bl2 = Math.cos(d2 / 3.0 * Math.PI) > 0.0;
        int n8 = -1;
        boolean bl3 = false;
        for (int i2 = 255; i2 >= 0; --i2) {
            IBlockState iBlockState3;
            if (f2.S(n4, i2, n5).df().xb() == Material.beo && i2 < (int)d3) {
                f2.a(n4, i2, n5, Blocks.cLd.xM());
            }
            if (i2 <= random.nextInt(5)) {
                f2.a(n4, i2, n5, Blocks.cLj.xM());
                continue;
            }
            IBlockState iBlockState4 = f2.S(n4, i2, n5);
            if (iBlockState4.df().xb() == Material.beo) {
                n8 = -1;
                continue;
            }
            if (iBlockState4.df() != Blocks.cLd) continue;
            if (n8 == -1) {
                bl3 = false;
                if (n7 <= 0) {
                    iBlockState = null;
                    iBlockState2 = Blocks.cLd.xM();
                } else if (i2 >= n6 - 4 && i2 <= n6 + 1) {
                    iBlockState = Blocks.cOw.xM();
                    iBlockState2 = this.dHa;
                }
                if (i2 < n6 && (iBlockState == null || iBlockState.df().xb() == Material.beo)) {
                    iBlockState = Blocks.cLl.xM();
                }
                n8 = n7 + Math.max(0, i2 - n6);
                if (i2 < n6 - 1) {
                    f2.a(n4, i2, n5, iBlockState2);
                    if (iBlockState2.df() != Blocks.cOw) continue;
                    f2.a(n4, i2, n5, iBlockState2.df().xM().a(BlockColored.aTw, net.minecraft.item.b.cUD));
                    continue;
                }
                if (this.dHW && i2 > 86 + n7 * 2) {
                    if (bl2) {
                        f2.a(n4, i2, n5, Blocks.cLf.xM().a(BlockDirt.aTC, BlockDirt$DirtType.aTF));
                        continue;
                    }
                    f2.a(n4, i2, n5, Blocks.cLe.xM());
                    continue;
                }
                if (i2 <= n6 + 3 + n7) {
                    f2.a(n4, i2, n5, this.dGZ);
                    bl3 = true;
                    continue;
                }
                iBlockState3 = i2 >= 64 && i2 <= 127 ? (bl2 ? Blocks.cOB.xM() : this.L(n2, i2, n3)) : Blocks.cOw.xM().a(BlockColored.aTw, net.minecraft.item.b.cUD);
                f2.a(n4, i2, n5, iBlockState3);
                continue;
            }
            if (n8 <= 0) continue;
            --n8;
            if (bl3) {
                f2.a(n4, i2, n5, Blocks.cOw.xM().a(BlockColored.aTw, net.minecraft.item.b.cUD));
                continue;
            }
            iBlockState3 = this.L(n2, i2, n3);
            f2.a(n4, i2, n5, iBlockState3);
        }
    }

    private void K(long l2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        this.dHQ = new IBlockState[64];
        Arrays.fill(this.dHQ, Blocks.cOB.xM());
        Random random = new Random(l2);
        this.dHU = new t(random, 1);
        for (n8 = 0; n8 < 64; ++n8) {
            if ((n8 += random.nextInt(5) + 1) >= 64) continue;
            this.dHQ[n8] = Blocks.cOw.xM().a(BlockColored.aTw, net.minecraft.item.b.cUD);
        }
        n8 = random.nextInt(4) + 2;
        for (n7 = 0; n7 < n8; ++n7) {
            n6 = random.nextInt(3) + 1;
            n5 = random.nextInt(64);
            for (n4 = 0; n5 + n4 < 64 && n4 < n6; ++n4) {
                this.dHQ[n5 + n4] = Blocks.cOw.xM().a(BlockColored.aTw, net.minecraft.item.b.cUG);
            }
        }
        n7 = random.nextInt(4) + 2;
        for (n6 = 0; n6 < n7; ++n6) {
            n5 = random.nextInt(3) + 2;
            n4 = random.nextInt(64);
            for (n3 = 0; n4 + n3 < 64 && n3 < n5; ++n3) {
                this.dHQ[n4 + n3] = Blocks.cOw.xM().a(BlockColored.aTw, net.minecraft.item.b.cUO);
            }
        }
        n6 = random.nextInt(4) + 2;
        for (n5 = 0; n5 < n6; ++n5) {
            n4 = random.nextInt(3) + 1;
            n3 = random.nextInt(64);
            for (n2 = 0; n3 + n2 < 64 && n2 < n4; ++n2) {
                this.dHQ[n3 + n2] = Blocks.cOw.xM().a(BlockColored.aTw, net.minecraft.item.b.cUQ);
            }
        }
        n5 = random.nextInt(3) + 3;
        n4 = 0;
        for (n3 = 0; n3 < n5; ++n3) {
            n2 = 1;
            n4 += random.nextInt(16) + 4;
            for (int i2 = 0; n4 + i2 < 64 && i2 < 1; ++i2) {
                this.dHQ[n4 + i2] = Blocks.cOw.xM().a(BlockColored.aTw, net.minecraft.item.b.cUC);
                if (n4 + i2 > 1 && random.nextBoolean()) {
                    this.dHQ[n4 + i2 - 1] = Blocks.cOw.xM().a(BlockColored.aTw, net.minecraft.item.b.cUK);
                }
                if (n4 + i2 >= 63 || !random.nextBoolean()) continue;
                this.dHQ[n4 + i2 + 1] = Blocks.cOw.xM().a(BlockColored.aTw, net.minecraft.item.b.cUK);
            }
        }
    }

    private IBlockState L(int n2, int n3, int n4) {
        int n5 = (int)Math.round(this.dHU.D((double)n2 * 1.0 / 512.0, (double)n2 * 1.0 / 512.0) * 2.0);
        return this.dHQ[(n3 + n5 + 64) % 64];
    }

    @Override
    protected j in(int n2) {
        boolean bl2 = this.dHo == j.dGQ.dHo;
        x x2 = new x(n2, bl2, this.dHW);
        if (!bl2) {
            x2.a(dFV);
            x2.gE(this.dGX + " M");
        } else {
            x2.gE(this.dGX + " (Bryce)");
        }
        x2.s(this.lp, true);
        return x2;
    }
}

