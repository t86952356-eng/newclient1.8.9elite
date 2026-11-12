/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.BlockRailPowered;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.bi;
import net.minecraft.entity.c;
import net.minecraft.entity.item.m;
import net.minecraft.entity.item.n;
import net.minecraft.entity.item.p;
import net.minecraft.entity.item.q;
import net.minecraft.entity.item.s;
import net.minecraft.entity.monster.w;
import net.minecraft.entity.r;
import net.minecraft.entity.t;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.a;
import net.minecraft.util.ad;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.minecraft.util.da;
import net.minecraft.world.ai;

public abstract class k
extends c
implements net.minecraft.world.p {
    private boolean cCw;
    private String cCx;
    private static final int[][][] cCy = new int[][][]{new int[][]{{0, 0, -1}, {0, 0, 1}}, new int[][]{{-1, 0, 0}, {1, 0, 0}}, new int[][]{{-1, -1, 0}, {1, 0, 0}}, new int[][]{{-1, 0, 0}, {1, -1, 0}}, new int[][]{{0, 0, -1}, {0, -1, 1}}, new int[][]{{0, -1, -1}, {0, 0, 1}}, new int[][]{{0, 0, 1}, {1, 0, 0}}, new int[][]{{0, 0, 1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {1, 0, 0}}};
    private int cCz;
    private double cCA;
    private double cCB;
    private double cCC;
    private double cCD;
    private double cCE;
    private double cCb;
    private double cCc;
    private double cCd;

    public k(net.minecraft.world.w w2) {
        super(w2);
        this.crz = true;
        this.o(0.98f, 0.7f);
    }

    public static k a(net.minecraft.world.w w2, double d2, double d3, double d4, m m2) {
        switch (m2.ordinal()) {
            case 1: {
                return new n(w2, d2, d3, d4);
            }
            case 2: {
                return new q(w2, d2, d3, d4);
            }
            case 3: {
                return new s(w2, d2, d3, d4);
            }
            case 4: {
                return new bi(w2, d2, d3, d4);
            }
            case 5: {
                return new net.minecraft.entity.item.r(w2, d2, d3, d4);
            }
            case 6: {
                return new t(w2, d2, d3, d4);
            }
        }
        return new p(w2, d2, d3, d4);
    }

    @Override
    protected boolean Iz() {
        return false;
    }

    @Override
    protected void IA() {
        this.csD.a(17, new Integer(0));
        this.csD.a(18, new Integer(1));
        this.csD.a(19, new Float(0.0f));
        this.csD.a(20, new Integer(0));
        this.csD.a(21, new Integer(6));
        this.csD.a(22, (byte)0);
    }

    @Override
    public a V(c c2) {
        return c2.IE() ? c2.Us() : null;
    }

    @Override
    public a ID() {
        return null;
    }

    @Override
    public boolean IE() {
        return true;
    }

    public k(net.minecraft.world.w w2, double d2, double d3, double d4) {
        this(w2);
        this.setPosition(d2, d3, d4);
        this.ud = 0.0;
        this.ue = 0.0;
        this.uf = 0.0;
        this.crF = d2;
        this.crG = d3;
        this.crH = d4;
    }

    @Override
    public double TW() {
        return 0.0;
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (!this.baU.dDw && !this.csb) {
            boolean bl2;
            if (this.a(ad2)) {
                return false;
            }
            this.ff(-this.YB());
            this.fe(10);
            this.TM();
            this.be(this.Yz() + f2 * 10.0f);
            boolean bl3 = bl2 = ad2.dk() instanceof net.minecraft.entity.player.a && ((net.minecraft.entity.player.a)ad2.dk()).cIt.cJM;
            if (bl2 || this.Yz() > 40.0f) {
                if (this.crA != null) {
                    this.crA.D(null);
                }
                if (bl2 && !this.xV()) {
                    this.Tt();
                } else {
                    this.c(ad2);
                }
            }
            return true;
        }
        return true;
    }

    public void c(ad ad2) {
        this.Tt();
        if (this.baU.Si().gw("doEntityDrops")) {
            co co2 = new co(Items.cQD, 1);
            if (this.cCx != null) {
                co2.ey(this.cCx);
            }
            this.a(co2, 0.0f);
        }
    }

    @Override
    public void Ua() {
        this.ff(-this.YB());
        this.fe(10);
        this.be(this.Yz() + this.Yz() * 10.0f);
    }

    @Override
    public boolean TO() {
        return !this.csb;
    }

    @Override
    public void Tt() {
        super.Tt();
    }

    @Override
    public void Dm() {
        int n2;
        int n3;
        if (this.YA() > 0) {
            this.fe(this.YA() - 1);
        }
        if (this.Yz() > 0.0f) {
            this.be(this.Yz() - 1.0f);
        }
        if (this.gX < -64.0) {
            this.Ty();
        }
        if (!this.baU.dDw && this.baU instanceof ai) {
            this.baU.dDt.eY("portal");
            MinecraftServer minecraftServer = ((ai)this.baU).awt();
            n3 = this.Tv();
            if (this.csN) {
                if (minecraftServer.alb()) {
                    if (this.crC == null && this.csO++ >= n3) {
                        this.csO = n3;
                        this.csM = this.TZ();
                        n2 = this.baU.dDl.getDimensionId() == -1 ? 0 : -1;
                        this.ez(n2);
                    }
                    this.csN = false;
                }
            } else {
                if (this.csO > 0) {
                    this.csO -= 4;
                }
                if (this.csO < 0) {
                    this.csO = 0;
                }
            }
            if (this.csM > 0) {
                --this.csM;
            }
            this.baU.dDt.ajv();
        }
        if (this.baU.dDw) {
            if (this.cCz > 0) {
                double d2 = this.gW + (this.cCA - this.gW) / (double)this.cCz;
                double d3 = this.gX + (this.cCB - this.gX) / (double)this.cCz;
                double d4 = this.gY + (this.cCC - this.gY) / (double)this.cCz;
                double d5 = bt.aJ(this.cCD - (double)this.pl);
                this.pl = (float)((double)this.pl + d5 / (double)this.cCz);
                this.pm = (float)((double)this.pm + (this.cCE - (double)this.pm) / (double)this.cCz);
                --this.cCz;
                this.setPosition(d2, d3, d4);
                this.setRotation(this.pl, this.pm);
            } else {
                this.setPosition(this.gW, this.gX, this.gY);
                this.setRotation(this.pl, this.pm);
            }
        } else {
            double d6;
            b b2;
            IBlockState iBlockState;
            this.crF = this.gW;
            this.crG = this.gX;
            this.crH = this.gY;
            this.ue -= (double)0.04f;
            int n4 = bt.aF(this.gW);
            if (BlockRailBase.P(this.baU, new b(n4, (n3 = bt.aF(this.gX)) - 1, n2 = bt.aF(this.gY)))) {
                --n3;
            }
            if (BlockRailBase.p(iBlockState = this.baU.L(b2 = new b(n4, n3, n2)))) {
                this.c(b2, iBlockState);
                if (iBlockState.df() == Blocks.cOu) {
                    this.b(n4, n3, n2, iBlockState.b(BlockRailPowered.aZo));
                }
            } else {
                this.Yx();
            }
            this.TD();
            this.pm = 0.0f;
            double d7 = this.crF - this.gW;
            double d8 = this.crH - this.gY;
            if (d7 * d7 + d8 * d8 > 0.001) {
                this.pl = (float)(bt.y(d8, d7) * 180.0 / Math.PI);
                if (this.cCw) {
                    this.pl += 180.0f;
                }
            }
            if ((d6 = (double)bt.bN(this.pl - this.crM)) < -170.0 || d6 >= 170.0) {
                this.pl += 180.0f;
                this.cCw = !this.cCw;
            }
            this.setRotation(this.pl, this.pm);
            for (c c2 : this.baU.b(this, this.Us().ad(0.2f, 0.0, 0.2f))) {
                if (c2 == this.crA || !c2.IE() || !(c2 instanceof k)) continue;
                c2.U(this);
            }
            if (this.crA != null && this.crA.csb) {
                if (this.crA.crC == this) {
                    this.crA.crC = null;
                }
                this.crA = null;
            }
            this.TH();
        }
    }

    protected double Yw() {
        return 0.4;
    }

    public void b(int n2, int n3, int n4, boolean bl2) {
    }

    protected void Yx() {
        double d2 = this.Yw();
        this.ud = bt.ah(this.ud, -d2, d2);
        this.uf = bt.ah(this.uf, -d2, d2);
        if (this.aO) {
            this.ud *= 0.5;
            this.ue *= 0.5;
            this.uf *= 0.5;
        }
        this.y(this.ud, this.ue, this.uf);
        if (!this.aO) {
            this.ud *= (double)0.95f;
            this.ue *= (double)0.95f;
            this.uf *= (double)0.95f;
        }
    }

    protected void c(b b2, IBlockState iBlockState) {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        this.csf = 0.0f;
        da da2 = this.R(this.gW, this.gX, this.gY);
        this.gX = b2.wu();
        boolean bl2 = false;
        boolean bl3 = false;
        BlockRailBase blockRailBase = (BlockRailBase)iBlockState.df();
        if (blockRailBase == Blocks.cLF) {
            bl2 = iBlockState.b(BlockRailPowered.aZo);
            bl3 = !bl2;
        }
        double d9 = 0.0078125;
        BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection = iBlockState.b(blockRailBase.yP());
        switch (blockRailBase$EnumRailDirection) {
            case aYS: {
                this.ud -= 0.0078125;
                this.gX += 1.0;
                break;
            }
            case aYT: {
                this.ud += 0.0078125;
                this.gX += 1.0;
                break;
            }
            case aYU: {
                this.uf += 0.0078125;
                this.gX += 1.0;
                break;
            }
            case aYV: {
                this.uf -= 0.0078125;
                this.gX += 1.0;
            }
        }
        int[][] nArray = cCy[blockRailBase$EnumRailDirection.yc()];
        double d10 = nArray[1][0] - nArray[0][0];
        double d11 = nArray[1][2] - nArray[0][2];
        double d12 = Math.sqrt(d10 * d10 + d11 * d11);
        double d13 = this.ud * d10 + this.uf * d11;
        if (d13 < 0.0) {
            d10 = -d10;
            d11 = -d11;
        }
        if ((d8 = Math.sqrt(this.ud * this.ud + this.uf * this.uf)) > 2.0) {
            d8 = 2.0;
        }
        this.ud = d8 * d10 / d12;
        this.uf = d8 * d11 / d12;
        if (this.crA instanceof r && (d7 = (double)((r)this.crA).cuW) > 0.0) {
            d6 = -Math.sin(this.crA.pl * (float)Math.PI / 180.0f);
            d5 = Math.cos(this.crA.pl * (float)Math.PI / 180.0f);
            d4 = this.ud * this.ud + this.uf * this.uf;
            if (d4 < 0.01) {
                this.ud += d6 * 0.1;
                this.uf += d5 * 0.1;
                bl3 = false;
            }
        }
        if (bl3) {
            d7 = Math.sqrt(this.ud * this.ud + this.uf * this.uf);
            if (d7 < 0.03) {
                this.ud *= 0.0;
                this.ue *= 0.0;
                this.uf *= 0.0;
            } else {
                this.ud *= 0.5;
                this.ue *= 0.0;
                this.uf *= 0.5;
            }
        }
        d7 = 0.0;
        d6 = (double)b2.wt() + 0.5 + (double)nArray[0][0] * 0.5;
        d5 = (double)b2.wx() + 0.5 + (double)nArray[0][2] * 0.5;
        d4 = (double)b2.wt() + 0.5 + (double)nArray[1][0] * 0.5;
        double d14 = (double)b2.wx() + 0.5 + (double)nArray[1][2] * 0.5;
        d10 = d4 - d6;
        d11 = d14 - d5;
        if (d10 == 0.0) {
            this.gW = (double)b2.wt() + 0.5;
            d7 = this.gY - (double)b2.wx();
        } else if (d11 == 0.0) {
            this.gY = (double)b2.wx() + 0.5;
            d7 = this.gW - (double)b2.wt();
        } else {
            d3 = this.gW - d6;
            d2 = this.gY - d5;
            d7 = (d3 * d10 + d2 * d11) * 2.0;
        }
        this.gW = d6 + d10 * d7;
        this.gY = d5 + d11 * d7;
        this.setPosition(this.gW, this.gX, this.gY);
        d3 = this.ud;
        d2 = this.uf;
        if (this.crA != null) {
            d3 *= 0.75;
            d2 *= 0.75;
        }
        double d15 = this.Yw();
        d3 = bt.ah(d3, -d15, d15);
        d2 = bt.ah(d2, -d15, d15);
        this.y(d3, 0.0, d2);
        if (nArray[0][1] != 0 && bt.aF(this.gW) - b2.wt() == nArray[0][0] && bt.aF(this.gY) - b2.wx() == nArray[0][2]) {
            this.setPosition(this.gW, this.gX + (double)nArray[0][1], this.gY);
        } else if (nArray[1][1] != 0 && bt.aF(this.gW) - b2.wt() == nArray[1][0] && bt.aF(this.gY) - b2.wx() == nArray[1][2]) {
            this.setPosition(this.gW, this.gX + (double)nArray[1][1], this.gY);
        }
        this.Yy();
        da da3 = this.R(this.gW, this.gX, this.gY);
        if (da3 != null && da2 != null) {
            double d16 = (da2.dAH - da3.dAH) * 0.05;
            d8 = Math.sqrt(this.ud * this.ud + this.uf * this.uf);
            if (d8 > 0.0) {
                this.ud = this.ud / d8 * (d8 + d16);
                this.uf = this.uf / d8 * (d8 + d16);
            }
            this.setPosition(this.gW, da3.dAH, this.gY);
        }
        int n2 = bt.aF(this.gW);
        int n3 = bt.aF(this.gY);
        if (n2 != b2.wt() || n3 != b2.wx()) {
            d8 = Math.sqrt(this.ud * this.ud + this.uf * this.uf);
            this.ud = d8 * (double)(n2 - b2.wt());
            this.uf = d8 * (double)(n3 - b2.wx());
        }
        if (bl2) {
            double d17 = Math.sqrt(this.ud * this.ud + this.uf * this.uf);
            if (d17 > 0.01) {
                double d18 = 0.06;
                this.ud += this.ud / d17 * 0.06;
                this.uf += this.uf / d17 * 0.06;
            } else if (blockRailBase$EnumRailDirection == BlockRailBase$EnumRailDirection.aYR) {
                if (this.baU.L(b2.arb()).df().xd()) {
                    this.ud = 0.02;
                } else if (this.baU.L(b2.arc()).df().xd()) {
                    this.ud = -0.02;
                }
            } else if (blockRailBase$EnumRailDirection == BlockRailBase$EnumRailDirection.aYQ) {
                if (this.baU.L(b2.aqZ()).df().xd()) {
                    this.uf = 0.02;
                } else if (this.baU.L(b2.ara()).df().xd()) {
                    this.uf = -0.02;
                }
            }
        }
    }

    protected void Yy() {
        if (this.crA != null) {
            this.ud *= (double)0.997f;
            this.ue *= 0.0;
            this.uf *= (double)0.997f;
        } else {
            this.ud *= (double)0.96f;
            this.ue *= 0.0;
            this.uf *= (double)0.96f;
        }
    }

    @Override
    public void setPosition(double d2, double d3, double d4) {
        this.gW = d2;
        this.gX = d3;
        this.gY = d4;
        float f2 = this.width / 2.0f;
        float f3 = this.height;
        this.n(new a(d2 - (double)f2, d3, d4 - (double)f2, d2 + (double)f2, d3 + (double)f3, d4 + (double)f2));
    }

    public da l(double d2, double d3, double d4, double d5) {
        IBlockState iBlockState;
        int n2;
        int n3;
        int n4 = bt.aF(d2);
        if (BlockRailBase.P(this.baU, new b(n4, (n3 = bt.aF(d3)) - 1, n2 = bt.aF(d4)))) {
            --n3;
        }
        if (BlockRailBase.p(iBlockState = this.baU.L(new b(n4, n3, n2)))) {
            BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection = iBlockState.b(((BlockRailBase)iBlockState.df()).yP());
            d3 = n3;
            if (blockRailBase$EnumRailDirection.yQ()) {
                d3 = n3 + 1;
            }
            int[][] nArray = cCy[blockRailBase$EnumRailDirection.yc()];
            double d6 = nArray[1][0] - nArray[0][0];
            double d7 = nArray[1][2] - nArray[0][2];
            double d8 = Math.sqrt(d6 * d6 + d7 * d7);
            if (nArray[0][1] != 0 && bt.aF(d2 += (d6 /= d8) * d5) - n4 == nArray[0][0] && bt.aF(d4 += (d7 /= d8) * d5) - n2 == nArray[0][2]) {
                d3 += (double)nArray[0][1];
            } else if (nArray[1][1] != 0 && bt.aF(d2) - n4 == nArray[1][0] && bt.aF(d4) - n2 == nArray[1][2]) {
                d3 += (double)nArray[1][1];
            }
            return this.R(d2, d3, d4);
        }
        return null;
    }

    public da R(double d2, double d3, double d4) {
        IBlockState iBlockState;
        int n2;
        int n3;
        int n4 = bt.aF(d2);
        if (BlockRailBase.P(this.baU, new b(n4, (n3 = bt.aF(d3)) - 1, n2 = bt.aF(d4)))) {
            --n3;
        }
        if (BlockRailBase.p(iBlockState = this.baU.L(new b(n4, n3, n2)))) {
            BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection = iBlockState.b(((BlockRailBase)iBlockState.df()).yP());
            int[][] nArray = cCy[blockRailBase$EnumRailDirection.yc()];
            double d5 = 0.0;
            double d6 = (double)n4 + 0.5 + (double)nArray[0][0] * 0.5;
            double d7 = (double)n3 + 0.0625 + (double)nArray[0][1] * 0.5;
            double d8 = (double)n2 + 0.5 + (double)nArray[0][2] * 0.5;
            double d9 = (double)n4 + 0.5 + (double)nArray[1][0] * 0.5;
            double d10 = (double)n3 + 0.0625 + (double)nArray[1][1] * 0.5;
            double d11 = (double)n2 + 0.5 + (double)nArray[1][2] * 0.5;
            double d12 = d9 - d6;
            double d13 = (d10 - d7) * 2.0;
            double d14 = d11 - d8;
            if (d12 == 0.0) {
                d2 = (double)n4 + 0.5;
                d5 = d4 - (double)n2;
            } else if (d14 == 0.0) {
                d4 = (double)n2 + 0.5;
                d5 = d2 - (double)n4;
            } else {
                double d15 = d2 - d6;
                double d16 = d4 - d8;
                d5 = (d15 * d12 + d16 * d14) * 2.0;
            }
            d2 = d6 + d12 * d5;
            d3 = d7 + d13 * d5;
            d4 = d8 + d14 * d5;
            if (d13 < 0.0) {
                d3 += 1.0;
            }
            if (d13 > 0.0) {
                d3 += 0.5;
            }
            return new da(d2, d3, d4);
        }
        return null;
    }

    @Override
    protected void e(net.minecraft.nbt.n n2) {
        if (n2.eO("CustomDisplayTile")) {
            int n3 = n2.eG("DisplayData");
            if (n2.C("DisplayTile", 8)) {
                Block block = Block.cq(n2.eK("DisplayTile"));
                if (block == null) {
                    this.D(Blocks.cLc.xM());
                } else {
                    this.D(block.aM(n3));
                }
            } else {
                Block block = Block.aK(n2.eG("DisplayTile"));
                if (block == null) {
                    this.D(Blocks.cLc.xM());
                } else {
                    this.D(block.aM(n3));
                }
            }
            this.fg(n2.eG("DisplayOffset"));
        }
        if (n2.C("CustomName", 8) && n2.eK("CustomName").length() > 0) {
            this.cCx = n2.eK("CustomName");
        }
    }

    @Override
    protected void d(net.minecraft.nbt.n n2) {
        if (this.YF()) {
            n2.o("CustomDisplayTile", true);
            IBlockState iBlockState = this.YC();
            cm cm2 = (cm)Block.aRV.y(iBlockState.df());
            n2.R("DisplayTile", cm2 == null ? "" : cm2.toString());
            n2.B("DisplayData", iBlockState.df().c(iBlockState));
            n2.B("DisplayOffset", this.YD());
        }
        if (this.cCx != null && this.cCx.length() > 0) {
            n2.R("CustomName", this.cCx);
        }
    }

    @Override
    public void U(c c2) {
        if (!(this.baU.dDw || c2.csp || this.csp || c2 == this.crA)) {
            double d2;
            double d3;
            double d4;
            if (c2 instanceof r && !(c2 instanceof net.minecraft.entity.player.a) && !(c2 instanceof w) && this.Wm() == m.cCG && this.ud * this.ud + this.uf * this.uf > 0.01 && this.crA == null && c2.crC == null) {
                c2.D(this);
            }
            if ((d4 = (d3 = c2.gW - this.gW) * d3 + (d2 = c2.gY - this.gY) * d2) >= (double)1.0E-4f) {
                d4 = bt.aD(d4);
                d3 /= d4;
                d2 /= d4;
                double d5 = 1.0 / d4;
                if (d5 > 1.0) {
                    d5 = 1.0;
                }
                d3 *= d5;
                d2 *= d5;
                d3 *= (double)0.1f;
                d2 *= (double)0.1f;
                d3 *= (double)(1.0f - this.csq);
                d2 *= (double)(1.0f - this.csq);
                d3 *= 0.5;
                d2 *= 0.5;
                if (c2 instanceof k) {
                    da da2;
                    double d6 = c2.gW - this.gW;
                    double d7 = c2.gY - this.gY;
                    da da3 = new da(d6, 0.0, d7).atR();
                    double d8 = Math.abs(da3.t(da2 = new da(bt.bB(this.pl * (float)Math.PI / 180.0f), 0.0, bt.bx(this.pl * (float)Math.PI / 180.0f)).atR()));
                    if (d8 < (double)0.8f) {
                        return;
                    }
                    double d9 = c2.ud + this.ud;
                    double d10 = c2.uf + this.uf;
                    if (((k)c2).Wm() == m.cCI && this.Wm() != m.cCI) {
                        this.ud *= (double)0.2f;
                        this.uf *= (double)0.2f;
                        this.N(c2.ud - d3, 0.0, c2.uf - d2);
                        c2.ud *= (double)0.95f;
                        c2.uf *= (double)0.95f;
                    } else if (((k)c2).Wm() != m.cCI && this.Wm() == m.cCI) {
                        c2.ud *= (double)0.2f;
                        c2.uf *= (double)0.2f;
                        c2.N(this.ud + d3, 0.0, this.uf + d2);
                        this.ud *= (double)0.95f;
                        this.uf *= (double)0.95f;
                    } else {
                        this.ud *= (double)0.2f;
                        this.uf *= (double)0.2f;
                        this.N((d9 /= 2.0) - d3, 0.0, (d10 /= 2.0) - d2);
                        c2.ud *= (double)0.2f;
                        c2.uf *= (double)0.2f;
                        c2.N(d9 + d3, 0.0, d10 + d2);
                    }
                } else {
                    this.N(-d3, 0.0, -d2);
                    c2.N(d3 / 4.0, 0.0, d2 / 4.0);
                }
            }
        }
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.cCA = d2;
        this.cCB = d3;
        this.cCC = d4;
        this.cCD = f2;
        this.cCE = f3;
        this.cCz = n2 + 2;
        this.ud = this.cCb;
        this.ue = this.cCc;
        this.uf = this.cCd;
    }

    @Override
    public void P(double d2, double d3, double d4) {
        this.cCb = this.ud = d2;
        this.cCc = this.ue = d3;
        this.cCd = this.uf = d4;
    }

    public void be(float f2) {
        this.csD.b(19, Float.valueOf(f2));
    }

    public float Yz() {
        return this.csD.eo(19);
    }

    public void fe(int n2) {
        this.csD.b(17, n2);
    }

    public int YA() {
        return this.csD.en(17);
    }

    public void ff(int n2) {
        this.csD.b(18, n2);
    }

    public int YB() {
        return this.csD.en(18);
    }

    public abstract m Wm();

    public IBlockState YC() {
        return !this.YF() ? this.Wn() : Block.aL(this.Tp().en(20));
    }

    public IBlockState Wn() {
        return Blocks.cLc.xM();
    }

    public int YD() {
        return !this.YF() ? this.YE() : this.Tp().en(21);
    }

    public int YE() {
        return 6;
    }

    public void D(IBlockState iBlockState) {
        this.Tp().b(20, Block.a(iBlockState));
        this.aW(true);
    }

    public void fg(int n2) {
        this.Tp().b(21, n2);
        this.aW(true);
    }

    public boolean YF() {
        return this.Tp().el(22) == 1;
    }

    public void aW(boolean bl2) {
        this.Tp().b(22, (byte)(bl2 ? 1 : 0));
    }

    @Override
    public void ec(String string) {
        this.cCx = string;
    }

    @Override
    public String xU() {
        return this.cCx != null ? this.cCx : super.xU();
    }

    @Override
    public boolean xV() {
        return this.cCx != null;
    }

    @Override
    public String Un() {
        return this.cCx;
    }

    @Override
    public ba xW() {
        if (this.xV()) {
            net.minecraft.util.s s2 = new net.minecraft.util.s(this.cCx);
            s2.arp().a(this.Ur());
            s2.arp().gc(this.Ul().toString());
            return s2;
        }
        net.minecraft.util.t t2 = new net.minecraft.util.t(this.xU(), new Object[0]);
        t2.arp().a(this.Ur());
        t2.arp().gc(this.Ul().toString());
        return t2;
    }
}

