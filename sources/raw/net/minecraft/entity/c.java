/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package net.minecraft.entity;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.aea;
import hackclient.rise.aec;
import hackclient.rise.akd;
import hackclient.rise.ef;
import hackclient.rise.eh;
import hackclient.rise.el;
import hackclient.rise.eo;
import hackclient.rise.ep;
import hackclient.rise.fc;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.Block$SoundType;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern$PatternHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.command.ab;
import net.minecraft.command.ad;
import net.minecraft.command.aw;
import net.minecraft.enchantment.l;
import net.minecraft.enchantment.u;
import net.minecraft.entity.d;
import net.minecraft.entity.effect.a;
import net.minecraft.entity.f;
import net.minecraft.entity.g;
import net.minecraft.entity.item.i;
import net.minecraft.entity.n;
import net.minecraft.entity.player.e;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.nbt.q;
import net.minecraft.nbt.s;
import net.minecraft.nbt.v;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.aq;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.cl;
import net.minecraft.util.cr;
import net.minecraft.util.da;
import net.minecraft.util.db;
import net.minecraft.world.ai;
import net.minecraft.world.h;
import net.minecraft.world.w;

public abstract class c
implements aw {
    private static final net.minecraft.util.a cru = new net.minecraft.util.a(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    private static int crv;
    private int crw;
    public int tR;
    public int crx;
    public double cry = 1.0;
    public boolean crz;
    public transient c crA;
    public boolean crB;
    public transient c crC;
    public boolean crD;
    public List<akd> crE = new aec<akd>(100);
    public transient w baU;
    public double crF;
    public double crG;
    public double crH;
    public transient aec<Double> crI = new aec(20);
    public double gW;
    public double gX;
    public double gY;
    public double aH;
    public double aI;
    public double aJ;
    public double crJ;
    public double crK;
    public double crL;
    public double ud;
    public double He;
    public double ue;
    public double Hf;
    public double uf;
    public double Hg;
    public float pl;
    public float pm;
    public float crM;
    public float crN;
    public float crO;
    public boolean crP = false;
    public transient net.minecraft.util.a jJ;
    public boolean aO;
    public boolean im;
    public boolean fX = true;
    public boolean crQ = true;
    public boolean crR;
    public boolean crS = false;
    public boolean crT;
    public int crU;
    public final rip.vantage.commons.util.time.a crV = new rip.vantage.commons.util.time.a();
    public boolean crW;
    public boolean crX;
    public boolean crY;
    public boolean crZ;
    private boolean csa;
    public boolean csb;
    public float width = 0.6f;
    public float height = 1.8f;
    public float csc;
    public float csd;
    public float cse;
    public float csf;
    private int csg = 1;
    public double csh;
    public double csi;
    public double csj;
    public double csk;
    public double csl;
    public double csm;
    public double csn;
    public float cso;
    public boolean csp;
    public float csq;
    protected transient Random ta;
    public int aRg;
    public int csr;
    public int ae;
    public int css;
    public int cst;
    public int aY;
    public double csu;
    public double csv;
    public double csw;
    public int Zz;
    public int csx = 1;
    private int csy;
    public boolean csz;
    public int csA;
    protected boolean csB = true;
    protected boolean csC;
    protected transient net.minecraft.entity.a csD;
    private double csE;
    private double csF;
    public boolean csG;
    public int csH;
    public int csI;
    public int csJ;
    public int ao;
    public int ap;
    public int aq;
    public boolean csK;
    public boolean csL;
    public int csM;
    protected boolean csN;
    protected int csO;
    public int csP;
    public int csQ;
    protected transient b csR;
    protected transient da csS;
    protected transient ao csT;
    private boolean csU;
    protected transient UUID csV;
    public float pp;
    public float pq;
    public float pr;
    public boolean aec = false;
    public int csW;
    private final transient ab csX;
    public Render<?> csY;
    private Optional<b> csZ = Optional.empty();
    private boolean cta;
    public rip.vantage.commons.util.time.a aiN = new rip.vantage.commons.util.time.a();
    public rip.vantage.commons.util.time.a ctb = new rip.vantage.commons.util.time.a();
    rip.vantage.commons.util.time.a bN = new rip.vantage.commons.util.time.a();
    public Double ctc;
    public Double ctd;

    protected boolean l(da da2) {
        return false;
    }

    public int getEntityId() {
        return this.crw;
    }

    public void eu(int n2) {
        this.crw = n2;
    }

    public void To() {
        this.Tt();
    }

    public c(w w2) {
        this.crw = crv++;
        this.jJ = cru;
        this.ta = new Random();
        this.csV = bt.h(this.ta);
        this.csX = new ab();
        this.baU = w2;
        this.setPosition(0.0, 0.0, 0.0);
        if (w2 != null) {
            this.csP = w2.dDl.getDimensionId();
        }
        this.csD = new net.minecraft.entity.a(this);
        this.csD.a(0, (byte)0);
        this.csD.a(1, (short)300);
        this.csD.a(3, (byte)0);
        this.csD.a(2, "");
        this.csD.a(4, (byte)0);
        this.IA();
    }

    protected abstract void IA();

    public net.minecraft.entity.a Tp() {
        return this.csD;
    }

    public boolean equals(Object object) {
        return object instanceof c ? ((c)object).crw == this.crw : false;
    }

    public void Tq() {
        this.aiN.aX();
        this.fX = false;
    }

    public void Tr() {
        this.ctb.aX();
        this.crQ = false;
    }

    public int hashCode() {
        return this.crw;
    }

    protected void Ts() {
        if (this.baU != null) {
            while (this.gX > 0.0 && this.gX < 256.0) {
                this.setPosition(this.gW, this.gX, this.gY);
                if (this.baU.a(this, this.Us()).isEmpty()) break;
                this.gX += 1.0;
            }
            this.uf = 0.0;
            this.ue = 0.0;
            this.ud = 0.0;
            this.pm = 0.0f;
        }
    }

    public void Tt() {
        this.csb = true;
    }

    public void o(float f2, float f3) {
        if (f2 != this.width || f3 != this.height) {
            float f4 = this.width;
            this.width = f2;
            this.height = f3;
            this.n(new net.minecraft.util.a(this.Us().dtH, this.Us().dtI, this.Us().dtJ, this.Us().dtH + (double)this.width, this.Us().dtI + (double)this.height, this.Us().dtJ + (double)this.width));
            if (this.width > f4 && !this.csB && !this.baU.dDw) {
                this.y(f4 - this.width, 0.0, f4 - this.width);
            }
        }
    }

    protected void setRotation(float f2, float f3) {
        this.pl = f2 % 360.0f;
        this.pm = f3 % 360.0f;
    }

    public void setPosition(double d2, double d3, double d4) {
        this.gW = d2;
        this.gX = d3;
        this.gY = d4;
        float f2 = this.width / 2.0f;
        float f3 = this.height;
        this.n(new net.minecraft.util.a(d2 - (double)f2, d3, d4 - (double)f2, d2 + (double)f2, d3 + (double)f3, d4 + (double)f2));
    }

    public void p(float f2, float f3) {
        float f4 = this.pm;
        float f5 = this.pl;
        this.pl = (float)((double)this.pl + (double)f2 * 0.15);
        this.pm = (float)((double)this.pm - (double)f3 * 0.15);
        this.pm = bt.I(this.pm, -90.0f, 90.0f);
        this.crO += this.pm - f4;
        this.crM += this.pl - f5;
    }

    public void Dm() {
        if (this.isInvisible() || !this.crT) {
            this.csr = 0;
        }
        if (this.aO) {
            this.tR = 0;
            ++this.crx;
        } else {
            this.crx = 0;
            ++this.tR;
        }
        da da2 = new da(this.csh, this.csi, this.csj);
        if (this.Sd().x(da2) > 0.1) {
            this.aec = true;
        }
        this.csQ = this.isSprinting() ? ++this.csQ : 0;
        this.Tu();
    }

    public void Tu() {
        this.crE.add(new akd(this.gW, this.gX, this.gY));
        this.baU.dDt.eY("entityBaseTick");
        if (this.crC != null && this.crC.csb) {
            this.crC = null;
        }
        if (this.aRg > 10 && (Math.abs(this.crF - this.gW) > 0.2 || Math.abs(this.crG - this.gX) > 0.2 || Math.abs(this.crH - this.gY) > 0.2)) {
            this.aec = true;
        }
        this.csc = this.csd;
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        this.crO = this.pm;
        this.crN = this.crM;
        this.crM = this.pl;
        if (!this.baU.dDw && this.baU instanceof ai) {
            this.baU.dDt.eY("portal");
            MinecraftServer minecraftServer = ((ai)this.baU).awt();
            int n2 = this.Tv();
            if (this.csN) {
                if (minecraftServer.alb()) {
                    if (this.crC == null && this.csO++ >= n2) {
                        this.csO = n2;
                        this.csM = this.TZ();
                        int n3 = this.baU.dDl.getDimensionId() == -1 ? 0 : -1;
                        this.ez(n3);
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
        this.TJ();
        this.ctc = null;
        this.ctd = null;
        this.TH();
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_13)) {
            this.baU.a(this.Us().af(0.001, 0.001, 0.001), Material.bew, this, this.baU.dDl.awe() ? 0.007 : 0.0023333333333333335);
        }
        if (this.baU.dDw) {
            this.csy = 0;
        } else if (this.csy > 0) {
            if (this.csC) {
                this.csy -= 4;
                if (this.csy < 0) {
                    this.csy = 0;
                }
            } else {
                if (this.csy % 20 == 0) {
                    this.a(net.minecraft.util.ad.dvd, 1.0f);
                }
                --this.csy;
            }
        }
        if (this.isInLava()) {
            this.Tw();
            this.csf *= 0.5f;
        }
        if (this.gX < -64.0) {
            this.Ty();
        }
        if (!this.baU.dDw) {
            this.l(0, this.csy > 0);
        }
        this.csB = false;
        this.baU.dDt.ajv();
    }

    public int Tv() {
        return 0;
    }

    protected void Tw() {
        if (!this.csC) {
            this.a(net.minecraft.util.ad.dve, 4.0f);
            this.ev(15);
        }
    }

    public void ev(int n2) {
        int n3 = n2 * 20;
        if (this.csy < (n3 = u.a(this, n3))) {
            this.csy = n3;
        }
    }

    public void Tx() {
        this.csy = 0;
    }

    protected void Ty() {
        this.Tt();
    }

    public boolean L(double d2, double d3, double d4) {
        net.minecraft.util.a a2 = this.Us().ae(d2, d3, d4);
        return this.l(a2);
    }

    private boolean l(net.minecraft.util.a a2) {
        return this.baU.a(this, a2).isEmpty() && !this.baU.u(a2);
    }

    public b Tz() {
        return this.aP(0.2f);
    }

    public b TA() {
        return this.aP(0.500001f);
    }

    protected b aP(float f2) {
        if (ViaLoadingBase.getInstance().getTargetVersion().olderThan(ProtocolVersion.v1_20) || this.csZ.isEmpty()) {
            return new b(this.gW, this.gX - (double)f2, this.gY);
        }
        b b2 = this.csZ.get();
        if (f2 <= 1.0E-5f) {
            return b2;
        }
        Block block = this.baU.L(b2).df();
        return f2 <= 0.5f && block instanceof BlockFence || block instanceof BlockWall || block instanceof BlockFenceGate ? b2 : new b(b2.wt(), bt.aF(this.gX - (double)f2), b2.wx());
    }

    private Optional<b> m(net.minecraft.util.a a2) {
        db db2 = null;
        double d2 = Double.MAX_VALUE;
        for (int i2 = bt.aF(a2.dtH - 1.0E-7) - 1; i2 < bt.aF(a2.dtK + 1.0E-7) + 1; ++i2) {
            for (int i3 = bt.aF(a2.dtI - 1.0E-7) - 1; i3 < bt.aF(a2.dtL + 1.0E-7) + 1; ++i3) {
                for (int i4 = bt.aF(a2.dtJ - 1.0E-7) - 1; i4 < bt.aF(a2.dtM + 1.0E-7) + 1; ++i4) {
                    double d3;
                    b b2 = new b(i2, i3, i4);
                    IBlockState iBlockState = this.baU.L(b2);
                    net.minecraft.util.a a3 = iBlockState.df().a(this.baU, b2, iBlockState);
                    if (a3 == null || !((d3 = b2.ao(this.gW, this.gX, this.gY)) < d2) && (d3 != d2 || db2 != null && db2.h(b2) >= 0)) continue;
                    db2 = new net.minecraft.util.g(b2.wt(), b2.wu(), b2.wx());
                    d2 = d3;
                }
            }
        }
        return Optional.ofNullable(db2);
    }

    protected void a(boolean bl2, da da2) {
        if (!bl2) {
            this.cta = false;
            if (this.csZ.isPresent()) {
                this.csZ = Optional.empty();
            }
            return;
        }
        net.minecraft.util.a a2 = new net.minecraft.util.a(this.jJ.dtH, this.jJ.dtI - 1.0E-6, this.jJ.dtJ, this.jJ.dtK, this.jJ.dtI, this.jJ.dtM);
        Optional<b> optional = this.m(a2);
        if (optional.isEmpty() && !this.cta) {
            if (da2 != null) {
                optional = this.m(a2.ae(-da2.dAG, 0.0, -da2.dAI));
                this.csZ = optional;
            }
        } else {
            this.csZ = optional;
        }
        this.cta = optional.isEmpty();
    }

    public void y(double d2, double d3, double d4) {
        ef ef2 = new ef(new da(this.ud, this.ue, this.uf));
        hackclient.rise.a.a.e().d(ef2);
        if (!ef2.isCancelled()) {
            da da2 = ef2.cZ();
            this.ud = da2.dAG;
            this.ue = da2.dAH;
            this.uf = da2.dAI;
        }
        if (this.csp) {
            this.n(this.Us().ae(d2, d3, d4));
            this.TB();
        } else {
            double d5;
            double d6;
            boolean bl2;
            boolean bl3;
            this.baU.dDt.eY("move");
            double d7 = this.gW;
            double d8 = this.gX;
            double d9 = this.gY;
            if (this.crZ) {
                this.crZ = false;
                d2 *= 0.25;
                d3 *= (double)0.05f;
                d4 *= 0.25;
                this.ud = 0.0;
                this.ue = 0.0;
                this.uf = 0.0;
            }
            double d10 = d2;
            double d11 = d3;
            double d12 = d4;
            el el2 = new el(-1.0);
            hackclient.rise.a.a.e().d(el2);
            double d13 = el2.da();
            boolean bl4 = bl3 = this.aO && this.isSneaking() && this instanceof net.minecraft.entity.player.a;
            if (bl3 || this.crP) {
                double d14 = 0.05;
                while (d2 != 0.0 && this.baU.a(this, this.Us().ae(d2, d13, 0.0)).isEmpty()) {
                    d2 = d2 < d14 && d2 >= -d14 ? 0.0 : (d2 > 0.0 ? (d2 -= d14) : (d2 += d14));
                    d10 = d2;
                }
                while (d4 != 0.0 && this.baU.a(this, this.Us().ae(0.0, d13, d4)).isEmpty()) {
                    d4 = d4 < d14 && d4 >= -d14 ? 0.0 : (d4 > 0.0 ? (d4 -= d14) : (d4 += d14));
                    d12 = d4;
                }
                while (d2 != 0.0 && d4 != 0.0 && this.baU.a(this, this.Us().ae(d2, d13, d4)).isEmpty()) {
                    d2 = d2 < d14 && d2 >= -d14 ? 0.0 : (d2 > 0.0 ? (d2 -= d14) : (d2 += d14));
                    d10 = d2;
                    d4 = d4 < d14 && d4 >= -d14 ? 0.0 : (d4 > 0.0 ? (d4 -= d14) : (d4 += d14));
                    d12 = d4;
                }
            }
            this.crP = false;
            List<net.minecraft.util.a> list = this.baU.a(this, this.Us().ac(d2, d3, d4));
            net.minecraft.util.a a2 = this.Us();
            for (net.minecraft.util.a iterator : list) {
                d3 = iterator.b(this.Us(), d3);
            }
            this.n(this.Us().ae(0.0, d3, 0.0));
            boolean bl5 = bl2 = this.aO || d11 != d3 && d11 < 0.0;
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_13_2) && Math.abs(d2) < Math.abs(d4)) {
                for (net.minecraft.util.a a3 : list) {
                    d4 = a3.c(this.Us(), d4);
                }
                this.n(this.Us().ae(0.0, 0.0, d4));
                for (net.minecraft.util.a a4 : list) {
                    d2 = a4.a(this.Us(), d2);
                }
                this.n(this.Us().ae(d2, 0.0, 0.0));
            } else {
                for (net.minecraft.util.a a5 : list) {
                    d2 = a5.a(this.Us(), d2);
                }
                this.n(this.Us().ae(d2, 0.0, 0.0));
                for (net.minecraft.util.a a6 : list) {
                    d4 = a6.c(this.Us(), d4);
                }
                this.n(this.Us().ae(0.0, 0.0, d4));
            }
            if (this.cso > 0.0f && bl2 && (d10 != d2 || d12 != d4)) {
                double d14 = d2;
                d6 = d3;
                d5 = d4;
                net.minecraft.util.a a7 = this.Us();
                this.n(a2);
                d3 = this.cso;
                List<net.minecraft.util.a> list2 = this.baU.a(this, this.Us().ac(d10, d3, d12));
                net.minecraft.util.a a8 = this.Us();
                net.minecraft.util.a a9 = a8.ac(d10, 0.0, d12);
                double d15 = d3;
                for (net.minecraft.util.a a10 : list2) {
                    d15 = a10.b(a9, d15);
                }
                a8 = a8.ae(0.0, d15, 0.0);
                double d16 = d10;
                double d17 = d12;
                if (ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_13_2) && Math.abs(d16) < Math.abs(d17)) {
                    for (net.minecraft.util.a a11 : list2) {
                        d17 = a11.c(a8, d17);
                    }
                    a8 = a8.ae(0.0, 0.0, d17);
                    for (net.minecraft.util.a a11 : list2) {
                        d16 = a11.a(a8, d16);
                    }
                    a8 = a8.ae(d16, 0.0, 0.0);
                } else {
                    for (net.minecraft.util.a a11 : list2) {
                        d16 = a11.a(a8, d16);
                    }
                    a8 = a8.ae(d16, 0.0, 0.0);
                    for (net.minecraft.util.a a11 : list2) {
                        d17 = a11.c(a8, d17);
                    }
                    a8 = a8.ae(0.0, 0.0, d17);
                }
                Object object = this.Us();
                double d18 = d3;
                for (net.minecraft.util.a a12 : list2) {
                    d18 = a12.b((net.minecraft.util.a)object, d18);
                }
                object = ((net.minecraft.util.a)object).ae(0.0, d18, 0.0);
                double d19 = d10;
                double d20 = d12;
                if (ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_13_2) && Math.abs(d19) < Math.abs(d20)) {
                    for (net.minecraft.util.a a13 : list2) {
                        d20 = a13.c((net.minecraft.util.a)object, d20);
                    }
                    object = ((net.minecraft.util.a)object).ae(0.0, 0.0, d20);
                    for (net.minecraft.util.a a13 : list2) {
                        d19 = a13.a((net.minecraft.util.a)object, d19);
                    }
                    object = ((net.minecraft.util.a)object).ae(d19, 0.0, 0.0);
                } else {
                    for (net.minecraft.util.a a13 : list2) {
                        d19 = a13.a((net.minecraft.util.a)object, d19);
                    }
                    object = ((net.minecraft.util.a)object).ae(d19, 0.0, 0.0);
                    for (net.minecraft.util.a a13 : list2) {
                        d20 = a13.c((net.minecraft.util.a)object, d20);
                    }
                    object = ((net.minecraft.util.a)object).ae(0.0, 0.0, d20);
                }
                double d21 = d16 * d16 + d17 * d17;
                double d22 = d19 * d19 + d20 * d20;
                if (d21 > d22) {
                    d2 = d16;
                    d4 = d17;
                    d3 = ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_13_2) ? -d15 + d3 : -d15;
                    this.n(a8);
                } else {
                    d2 = d19;
                    d4 = d20;
                    d3 = -d18;
                    this.n((net.minecraft.util.a)object);
                }
                for (net.minecraft.util.a a14 : list2) {
                    d3 = a14.b(this.Us(), d3);
                }
                this.n(this.Us().ae(0.0, d3, 0.0));
                if (d14 * d14 + d5 * d5 >= d2 * d2 + d4 * d4) {
                    d2 = d14;
                    d3 = d6;
                    d4 = d5;
                    this.n(a7);
                }
                if (this instanceof net.minecraft.client.entity.c) {
                    this.csW = 0;
                    hackclient.rise.a.a.e().d(new fc(this.Us().dtI - this.gX));
                }
            }
            ++this.csW;
            this.baU.dDt.ajv();
            this.baU.dDt.eY("rest");
            this.TB();
            this.crR = d10 != d2 || d12 != d4;
            this.crW = d11 != d3;
            this.aO = this.crW && d11 < 0.0;
            this.a(this.aO, new da(d2, d3, d4));
            boolean bl6 = this.crB = this.crR && this.l(new da(d2, d3, d4));
            if (this.aO) {
                this.crJ = this.aH;
                this.crK = this.aI;
                this.crL = this.aJ;
                this.aH = this.gW;
                this.aI = this.gX;
                this.aJ = this.gY;
            }
            this.crX = this.crR || this.crW;
            b b2 = this.Tz();
            Block block = this.baU.L(b2).df();
            this.a(d3, this.aO, block, b2);
            if (d10 != d2) {
                this.ud = 0.0;
            }
            if (d12 != d4) {
                this.uf = 0.0;
            }
            if (d11 != d3) {
                block.a(this.baU, this);
            }
            if (this.Iz() && !bl3 && this.crC == null) {
                d6 = this.gW - d7;
                d5 = this.gX - d8;
                double d23 = this.gY - d9;
                if (block != Blocks.cMw) {
                    d5 = 0.0;
                }
                if (block != null && this.aO) {
                    block.a(this.baU, b2, this);
                }
                this.csd = (float)((double)this.csd + (double)bt.aD(d6 * d6 + d23 * d23) * 0.6);
                this.cse = (float)((double)this.cse + (double)bt.aD(d6 * d6 + d5 * d5 + d23 * d23) * 0.6);
                if (this.cse > (float)this.csg && block.xb() != Material.beo) {
                    this.csg = (int)this.cse + 1;
                    if (this.isInWater()) {
                        float f2 = bt.aD(this.ud * this.ud * (double)0.2f + this.ue * this.ue + this.uf * this.uf * (double)0.2f) * 0.35f;
                        if (f2 > 1.0f) {
                            f2 = 1.0f;
                        }
                        this.a(this.TC(), f2, 1.0f + (this.ta.nextFloat() - this.ta.nextFloat()) * 0.4f);
                    }
                    this.a(b2, block);
                }
            }
            try {
                this.TD();
            }
            catch (Throwable throwable) {
                net.minecraft.crash.a a15 = net.minecraft.crash.a.a(throwable, "Checking entity block collision");
                net.minecraft.crash.i i2 = a15.dY("Entity being checked for collision");
                this.a(i2);
                throw new cl(a15);
            }
            boolean bl7 = this.TG();
            if (this.baU.v(this.Us().af(0.001, 0.001, 0.001))) {
                this.ew(1);
                if (!bl7) {
                    ++this.csy;
                    if (this.csy == 0) {
                        this.ev(8);
                    }
                }
            } else if (this.csy <= 0) {
                this.csy = -this.csx;
            }
            if (bl7 && this.csy > 0) {
                this.a("random.fizz", 0.7f, 1.6f + (this.ta.nextFloat() - this.ta.nextFloat()) * 0.4f);
                this.csy = -this.csx;
            }
            this.baU.dDt.ajv();
        }
    }

    private void TB() {
        this.gW = (this.Us().dtH + this.Us().dtK) / 2.0;
        this.gX = this.Us().dtI;
        this.gY = (this.Us().dtJ + this.Us().dtM) / 2.0;
    }

    protected String TC() {
        return "game.neutral.swim";
    }

    protected void TD() {
        b b2 = new b(this.Us().dtH + 0.001, this.Us().dtI + 0.001, this.Us().dtJ + 0.001);
        b b3 = new b(this.Us().dtK - 0.001, this.Us().dtL - 0.001, this.Us().dtM - 0.001);
        if (this.baU.e(b2, b3)) {
            for (int i2 = b2.wt(); i2 <= b3.wt(); ++i2) {
                for (int i3 = b2.wu(); i3 <= b3.wu(); ++i3) {
                    for (int i4 = b2.wx(); i4 <= b3.wx(); ++i4) {
                        b b4 = new b(i2, i3, i4);
                        IBlockState iBlockState = this.baU.L(b4);
                        try {
                            iBlockState.df().a(this.baU, b4, iBlockState, this);
                            continue;
                        }
                        catch (Throwable throwable) {
                            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Colliding entity with block");
                            net.minecraft.crash.i i5 = a2.dY("Block being collided with");
                            net.minecraft.crash.i.a(i5, b4, iBlockState);
                            throw new cl(a2);
                        }
                    }
                }
            }
        }
    }

    protected void a(b b2, Block block) {
        Block$SoundType block$SoundType = block.aSB;
        if (this.baU.L(b2.aqX()).df() == Blocks.cMJ) {
            block$SoundType = Blocks.cMJ.aSB;
            this.a(block$SoundType.xR(), block$SoundType.getVolume() * 0.15f, block$SoundType.xT());
        } else if (!block.xb().zv()) {
            this.a(block$SoundType.xR(), block$SoundType.getVolume() * 0.15f, block$SoundType.xT());
        }
    }

    public void a(String string, float f2, float f3) {
        if (!this.TE()) {
            this.baU.a(this, string, f2, f3);
        }
    }

    public boolean TE() {
        return this.csD.el(4) == 1;
    }

    public void aD(boolean bl2) {
        this.csD.b(4, (byte)(bl2 ? 1 : 0));
    }

    protected boolean Iz() {
        return true;
    }

    protected void a(double d2, boolean bl2, Block block, b b2) {
        if (bl2) {
            if (this.csf > 0.0f) {
                if (block != null) {
                    block.a(this.baU, b2, this, this.csf);
                } else {
                    this.q(this.csf, 1.0f);
                }
                this.csf = 0.0f;
            }
        } else if (d2 < 0.0) {
            this.csf = (float)((double)this.csf - d2);
        }
    }

    public net.minecraft.util.a ID() {
        return null;
    }

    protected void ew(int n2) {
        if (!this.csC) {
            this.a(net.minecraft.util.ad.dvb, (float)n2);
        }
    }

    public final boolean TF() {
        return this.csC;
    }

    public void q(float f2, float f3) {
        if (this.crA != null) {
            this.crA.q(f2, f3);
        }
    }

    public boolean TG() {
        return this.csz || this.baU.be(new b(this.gW, this.gX, this.gY)) || this.baU.be(new b(this.gW, this.gX + (double)this.height, this.gY));
    }

    public boolean isInWater() {
        if (this == net.minecraft.client.d.AZ().bgK && this.bN.T(100L)) {
            ep ep2 = new ep(this.csz);
            hackclient.rise.a.a.e().d(ep2);
            this.csz = ep2.isWater();
            this.bN.aX();
        }
        return this.csz;
    }

    public boolean TH() {
        if (this.baU.a(this.Us().ad(0.0, ViaLoadingBase.getInstance().getTargetVersion().olderThan(ProtocolVersion.v1_13) ? (double)-0.4f : 0.0, 0.0).af(0.001, 0.001, 0.001), Material.bev, this, 0.014)) {
            if (!this.csz && !this.csB) {
                this.TI();
            }
            this.csf = 0.0f;
            this.csz = true;
            this.csy = 0;
        } else {
            this.csz = false;
        }
        return this.csz;
    }

    protected void TI() {
        float f2;
        float f3;
        float f4 = bt.aD(this.ud * this.ud * (double)0.2f + this.ue * this.ue + this.uf * this.uf * (double)0.2f) * 0.2f;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        this.a(this.TL(), f4, 1.0f + (this.ta.nextFloat() - this.ta.nextFloat()) * 0.4f);
        float f5 = bt.aF(this.Us().dtI);
        int n2 = 0;
        while ((float)n2 < 1.0f + this.width * 20.0f) {
            f3 = (this.ta.nextFloat() * 2.0f - 1.0f) * this.width;
            f2 = (this.ta.nextFloat() * 2.0f - 1.0f) * this.width;
            this.baU.a(as.dxa, this.gW + (double)f3, (double)(f5 + 1.0f), this.gY + (double)f2, this.ud, this.ue - (double)(this.ta.nextFloat() * 0.2f), this.uf, new int[0]);
            ++n2;
        }
        n2 = 0;
        while ((float)n2 < 1.0f + this.width * 20.0f) {
            f3 = (this.ta.nextFloat() * 2.0f - 1.0f) * this.width;
            f2 = (this.ta.nextFloat() * 2.0f - 1.0f) * this.width;
            this.baU.a(as.dxb, this.gW + (double)f3, (double)(f5 + 1.0f), this.gY + (double)f2, this.ud, this.ue, this.uf, new int[0]);
            ++n2;
        }
    }

    public void TJ() {
        if (this.isSprinting() && !this.isInWater()) {
            this.TK();
        }
    }

    protected void TK() {
        int n2;
        int n3;
        int n4 = bt.aF(this.gW);
        b b2 = new b(n4, n3 = bt.aF(this.gX - (double)0.2f), n2 = bt.aF(this.gY));
        IBlockState iBlockState = this.baU.L(b2);
        Block block = iBlockState.df();
        if (block.xg() != -1) {
            this.baU.a(as.dxH, this.gW + ((double)this.ta.nextFloat() - 0.5) * (double)this.width, this.Us().dtI + 0.1, this.gY + ((double)this.ta.nextFloat() - 0.5) * (double)this.width, -this.ud * 4.0, 1.5, -this.uf * 4.0, Block.a(iBlockState));
        }
    }

    protected String TL() {
        return "game.neutral.swim.splash";
    }

    public boolean c(Material material) {
        double d2 = this.gX + (double)this.getEyeHeight();
        b b2 = new b(this.gW, d2, this.gY);
        IBlockState iBlockState = this.baU.L(b2);
        Block block = iBlockState.df();
        if (block.xb() == material) {
            float f2 = BlockLiquid.bb(iBlockState.df().c(iBlockState)) - 0.11111111f;
            float f3 = (float)(b2.wu() + 1) - f2;
            return d2 < (double)f3;
        }
        return false;
    }

    public boolean isInLava() {
        return ViaLoadingBase.getInstance().getTargetVersion().olderThan(ProtocolVersion.v1_13) ? this.baU.b(this.Us().ad(-0.1f, -0.4f, -0.1f), Material.bew) : !this.csB && this.ctd != null && this.ctd > 0.0;
    }

    public da a(double d2, double d3, float f2) {
        double d4 = d2 * d2 + d3 * d3;
        if (d4 < 1.0E-7) {
            return new da(0.0, 0.0, 0.0);
        }
        if (d4 > 1.0) {
            if ((d4 = Math.sqrt(d4)) < 1.0E-4) {
                d2 = 0.0;
                d3 = 0.0;
            } else {
                d2 /= d4;
                d3 /= d4;
            }
        }
        float f3 = bt.bx(this.pl * ((float)Math.PI / 180));
        float f4 = bt.bB(this.pl * ((float)Math.PI / 180));
        return new da((d2 *= (double)f2) * (double)f4 - (d3 *= (double)f2) * (double)f3, 0.0, d3 * (double)f4 + d2 * (double)f3);
    }

    public void a(double d2, double d3, float f2, float f3) {
        double d4 = d2 * d2 + d3 * d3;
        if (d4 < 1.0E-7) {
            return;
        }
        if (d4 > 1.0) {
            if ((d4 = Math.sqrt(d4)) < 1.0E-4) {
                d2 = 0.0;
                d3 = 0.0;
            } else {
                d2 /= d4;
                d3 /= d4;
            }
        }
        float f4 = bt.bx(f3 * ((float)Math.PI / 180));
        float f5 = bt.bB(f3 * ((float)Math.PI / 180));
        this.ud += (d2 *= (double)f2) * (double)f5 - (d3 *= (double)f2) * (double)f4;
        this.uf += d3 * (double)f5 + d2 * (double)f4;
    }

    public void l(float f2, float f3, float f4, float f5) {
        float f6 = f2 * f2 + f3 * f3;
        if (f6 < 1.0E-4f) {
            return;
        }
        if ((f6 = bt.bK(f6)) < 1.0f) {
            f6 = 1.0f;
        }
        f6 = f4 / f6;
        float f7 = bt.bx(f5 * ((float)Math.PI / 180));
        float f8 = bt.bB(f5 * ((float)Math.PI / 180));
        this.ud += (double)((f2 *= f6) * f8 - (f3 *= f6) * f7);
        this.uf += (double)(f3 * f8 + f2 * f7);
    }

    public void s(float f2, float f3, float f4) {
        boolean bl2 = this == net.minecraft.client.d.AZ().bgK;
        boolean bl3 = ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_14);
        float f5 = this.pl;
        if (bl2) {
            if (bl3 && !this.aO && ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19_4) && !this.isInWater() && !this.isInLava()) {
                f4 = aea.aER.bgK.cIt.cJK ? (this.isSprinting() ? 0.1f : 0.05f) : (this.isSprinting() ? 0.025999999f : 0.02f);
            }
            eo eo2 = new eo(f3, f2, f4, this.pp);
            hackclient.rise.a.a.e().d(eo2);
            f2 = eo2.getStrafe();
            f3 = eo2.getForward();
            f4 = eo2.getFriction();
            f5 = eo2.getYaw();
            if (eo2.isCancelled()) {
                return;
            }
        }
        if (bl2 && bl3) {
            this.a((double)f2, f3, f4, f5);
        } else {
            this.l(f2, f3, f4, f5);
        }
        if (bl2) {
            hackclient.rise.a.a.e().d(new eh());
        }
    }

    public double[] t(float f2, float f3, float f4) {
        float f5 = this.pl;
        float f6 = f2 * f2 + f3 * f3;
        if (f6 >= 1.0E-4f) {
            if ((f6 = bt.bK(f6)) < 1.0f) {
                f6 = 1.0f;
            }
            f6 = f4 / f6;
            float f7 = bt.bx(f5 * (float)Math.PI / 180.0f);
            float f8 = bt.bB(f5 * (float)Math.PI / 180.0f);
            return new double[]{(f2 *= f6) * f8 - (f3 *= f6) * f7, f3 * f8 + f2 * f7};
        }
        return new double[]{0.0, 0.0};
    }

    public int af(float f2) {
        b b2 = new b(this.gW, this.gX + (double)this.getEyeHeight(), this.gY);
        return this.baU.aJ(b2) ? this.baU.b(b2, 0) : 0;
    }

    public float ag(float f2) {
        b b2 = new b(this.gW, this.gX + (double)this.getEyeHeight(), this.gY);
        return this.baU.aJ(b2) ? this.baU.aR(b2) : 0.0f;
    }

    public void b(w w2) {
        this.baU = w2;
    }

    public void a(double d2, double d3, double d4, float f2, float f3) {
        this.crF = this.gW = d2;
        this.crG = this.gX = d3;
        this.crH = this.gY = d4;
        this.crM = this.pl = f2;
        this.crO = this.pm = f3;
        double d5 = this.crM - f2;
        if (d5 < -180.0) {
            this.crM += 360.0f;
        }
        if (d5 >= 180.0) {
            this.crM -= 360.0f;
        }
        this.setPosition(this.gW, this.gX, this.gY);
        this.setRotation(f2, f3);
    }

    public void a(b b2, float f2, float f3) {
        this.b((double)b2.wt() + 0.5, (double)b2.wu(), (double)b2.wx() + 0.5, f2, f3);
    }

    public void b(double d2, double d3, double d4, float f2, float f3) {
        this.crF = this.gW = d2;
        this.csh = this.gW;
        this.crG = this.gX = d3;
        this.csi = this.gX;
        this.crH = this.gY = d4;
        this.csj = this.gY;
        this.pl = f2;
        this.pm = f3;
        this.setPosition(this.gW, this.gX, this.gY);
    }

    public float S(c c2) {
        float f2 = (float)(this.gW - c2.gW);
        float f3 = (float)(this.gX - c2.gX);
        float f4 = (float)(this.gY - c2.gY);
        return bt.bK(f2 * f2 + f3 * f3 + f4 * f4);
    }

    public double M(double d2, double d3, double d4) {
        double d5 = this.gW - d2;
        double d6 = this.gX - d3;
        double d7 = this.gY - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double aa(b b2) {
        return b2.am(this.gW, this.gX, this.gY);
    }

    public double ab(b b2) {
        return b2.ao(this.gW, this.gX, this.gY);
    }

    public double getDistance(double d2, double d3, double d4) {
        double d5 = this.gW - d2;
        double d6 = this.gX - d3;
        double d7 = this.gY - d4;
        return bt.aD(d5 * d5 + d6 * d6 + d7 * d7);
    }

    public double T(c c2) {
        double d2 = this.gW - c2.gW;
        double d3 = this.gX - c2.gX;
        double d4 = this.gY - c2.gY;
        return d2 * d2 + d3 * d3 + d4 * d4;
    }

    public void n(net.minecraft.entity.player.a a2) {
    }

    public void U(c c2) {
        double d2;
        double d3;
        double d4;
        if (c2.crA != this && c2.crC != this && !c2.csp && !this.csp && (d4 = bt.x(d3 = c2.gW - this.gW, d2 = c2.gY - this.gY)) >= (double)0.01f) {
            d4 = bt.aD(d4);
            d3 /= d4;
            d2 /= d4;
            double d5 = 1.0 / d4;
            if (d5 > 1.0) {
                d5 = 1.0;
            }
            d3 *= d5;
            d2 *= d5;
            d3 *= (double)0.05f;
            d2 *= (double)0.05f;
            d3 *= (double)(1.0f - this.csq);
            d2 *= (double)(1.0f - this.csq);
            if (this.crA == null) {
                this.N(-d3, 0.0, -d2);
            }
            if (c2.crA == null) {
                c2.N(d3, 0.0, d2);
            }
        }
    }

    public void N(double d2, double d3, double d4) {
        this.ud += d2;
        this.ue += d3;
        this.uf += d4;
        this.csL = true;
    }

    protected void TM() {
        this.crY = true;
    }

    public boolean a(net.minecraft.util.ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        this.TM();
        return false;
    }

    public da O(float f2) {
        if (f2 == 1.0f) {
            return this.s(this.pm, this.pl);
        }
        float f3 = this.crO + (this.pm - this.crO) * f2;
        float f4 = this.crM + (this.pl - this.crM) * f2;
        return this.s(f3, f4);
    }

    public da r(float f2, float f3) {
        return this.s(f3, f2);
    }

    public final da s(float f2, float f3) {
        float f4 = bt.bB(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = bt.bx(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = -bt.bB(-f2 * ((float)Math.PI / 180));
        float f7 = bt.bx(-f2 * ((float)Math.PI / 180));
        return new da(f5 * f6, f7, f4 * f6);
    }

    public akd TN() {
        return new akd(this.gW, this.gX, this.gY);
    }

    public da aQ(float f2) {
        return new da(this.gW, this.gX + (double)this.getEyeHeight(), this.gY);
    }

    public ce b(double d2, float f2) {
        da da2 = this.aQ(f2);
        da da3 = this.O(f2);
        da da4 = da2.al(da3.dAG * d2, da3.dAH * d2, da3.dAI * d2);
        return this.baU.a(da2, da4, false, false, true);
    }

    public ce a(double d2, float f2, float f3) {
        da da2 = this.aQ(1.0f);
        da da3 = this.r(f2, f3);
        da da4 = da2.al(da3.dAG * d2, da3.dAH * d2, da3.dAI * d2);
        return this.baU.a(da2, da4, false, false, true);
    }

    public boolean TO() {
        return false;
    }

    public boolean IE() {
        return false;
    }

    public void b(c c2, int n2) {
    }

    public boolean O(double d2, double d3, double d4) {
        double d5 = this.gW - d2;
        double d6 = this.gX - d3;
        double d7 = this.gY - d4;
        double d8 = d5 * d5 + d6 * d6 + d7 * d7;
        return this.an(d8);
    }

    public boolean an(double d2) {
        double d3 = this.Us().aqV();
        if (Double.isNaN(d3)) {
            d3 = 1.0;
        }
        return d2 < (d3 = d3 * 64.0 * this.cry) * d3;
    }

    public boolean j(net.minecraft.nbt.n n2) {
        String string = this.TQ();
        if (!this.csb && string != null) {
            n2.R("id", string);
            this.b(n2);
            return true;
        }
        return false;
    }

    public boolean k(net.minecraft.nbt.n n2) {
        String string = this.TQ();
        if (!this.csb && string != null && this.crA == null) {
            n2.R("id", string);
            this.b(n2);
            return true;
        }
        return false;
    }

    public void b(net.minecraft.nbt.n n2) {
        try {
            net.minecraft.nbt.n n3;
            n2.b("Pos", this.b(this.gW, this.gX, this.gY));
            n2.b("Motion", this.b(this.ud, this.ue, this.uf));
            n2.b("Rotation", this.e(this.pl, this.pm));
            n2.a("FallDistance", this.csf);
            n2.a("Fire", (short)this.csy);
            n2.a("Air", (short)this.Uc());
            n2.o("OnGround", this.aO);
            n2.B("Dimension", this.csP);
            n2.o("Invulnerable", this.csU);
            n2.B("PortalCooldown", this.csM);
            n2.d("UUIDMost", this.Ul().getMostSignificantBits());
            n2.d("UUIDLeast", this.Ul().getLeastSignificantBits());
            if (this.Un() != null && this.Un().length() > 0) {
                n2.R("CustomName", this.Un());
                n2.o("CustomNameVisible", this.Uo());
            }
            this.csX.g(n2);
            if (this.TE()) {
                n2.o("Silent", this.TE());
            }
            this.d(n2);
            if (this.crC != null && this.crC.j(n3 = new net.minecraft.nbt.n())) {
                n2.b("Riding", n3);
            }
        }
        catch (Throwable throwable) {
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Saving entity NBT");
            net.minecraft.crash.i i2 = a2.dY("Entity being saved");
            this.a(i2);
            throw new cl(a2);
        }
    }

    public void a(net.minecraft.nbt.n n2) {
        try {
            v v2 = n2.D("Pos", 6);
            v v3 = n2.D("Motion", 6);
            v v4 = n2.D("Rotation", 5);
            this.ud = v3.gk(0);
            this.ue = v3.gk(1);
            this.uf = v3.gk(2);
            if (Math.abs(this.ud) > 10.0) {
                this.ud = 0.0;
            }
            if (Math.abs(this.ue) > 10.0) {
                this.ue = 0.0;
            }
            if (Math.abs(this.uf) > 10.0) {
                this.uf = 0.0;
            }
            this.csh = this.gW = v2.gk(0);
            this.crF = this.gW;
            this.csi = this.gX = v2.gk(1);
            this.crG = this.gX;
            this.csj = this.gY = v2.gk(2);
            this.crH = this.gY;
            this.crM = this.pl = v4.gl(0);
            this.crO = this.pm = v4.gl(1);
            this.aR(this.pl);
            this.aS(this.pl);
            this.csf = n2.eI("FallDistance");
            this.csy = n2.eF("Fire");
            this.ey(n2.eF("Air"));
            this.aO = n2.eO("OnGround");
            this.csP = n2.eG("Dimension");
            this.csU = n2.eO("Invulnerable");
            this.csM = n2.eG("PortalCooldown");
            if (n2.C("UUIDMost", 4) && n2.C("UUIDLeast", 4)) {
                this.csV = new UUID(n2.eH("UUIDMost"), n2.eH("UUIDLeast"));
            } else if (n2.C("UUID", 8)) {
                this.csV = UUID.fromString(n2.eK("UUID"));
            }
            this.setPosition(this.gW, this.gX, this.gY);
            this.setRotation(this.pl, this.pm);
            if (n2.C("CustomName", 8) && n2.eK("CustomName").length() > 0) {
                this.ec(n2.eK("CustomName"));
            }
            this.aF(n2.eO("CustomNameVisible"));
            this.csX.f(n2);
            this.aD(n2.eO("Silent"));
            this.e(n2);
            if (this.TP()) {
                this.setPosition(this.gW, this.gX, this.gY);
            }
        }
        catch (Throwable throwable) {
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Loading entity NBT");
            net.minecraft.crash.i i2 = a2.dY("Entity being loaded");
            this.a(i2);
            throw new cl(a2);
        }
    }

    protected boolean TP() {
        return true;
    }

    protected final String TQ() {
        return n.ad(this);
    }

    protected abstract void e(net.minecraft.nbt.n var1);

    protected abstract void d(net.minecraft.nbt.n var1);

    public void TR() {
    }

    protected v b(double ... dArray) {
        v v2 = new v();
        for (double d2 : dArray) {
            v2.a(new q(d2));
        }
        return v2;
    }

    protected v e(float ... fArray) {
        v v2 = new v();
        for (float f2 : fArray) {
            v2.a(new s(f2));
        }
        return v2;
    }

    public i d(net.minecraft.item.d d2, int n2) {
        return this.a(d2, n2, 0.0f);
    }

    public i a(net.minecraft.item.d d2, int n2, float f2) {
        return this.a(new co(d2, n2, 0), f2);
    }

    public i a(co co2, float f2) {
        if (co2.cWZ != 0 && co2.bP() != null) {
            i i2 = new i(this.baU, this.gW, this.gX + (double)f2, this.gY, co2);
            i2.Yn();
            this.baU.G(i2);
            return i2;
        }
        return null;
    }

    public boolean TS() {
        return !this.csb;
    }

    public boolean TT() {
        if (this.csp) {
            return false;
        }
        net.minecraft.util.g g2 = new net.minecraft.util.g(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        for (int i2 = 0; i2 < 8; ++i2) {
            int n2 = bt.aF(this.gX + (double)(((float)((i2 >> 0) % 2) - 0.5f) * 0.1f) + (double)this.getEyeHeight());
            int n3 = bt.aF(this.gW + (double)(((float)((i2 >> 1) % 2) - 0.5f) * this.width * 0.8f));
            int n4 = bt.aF(this.gY + (double)(((float)((i2 >> 2) % 2) - 0.5f) * this.width * 0.8f));
            if (g2.wt() == n3 && g2.wu() == n2 && g2.wx() == n4) continue;
            g2.E(n3, n2, n4);
            if (!this.baU.L(g2).df().xe()) continue;
            return true;
        }
        return false;
    }

    public boolean o(net.minecraft.entity.player.a a2) {
        return false;
    }

    public net.minecraft.util.a V(c c2) {
        return null;
    }

    public void TU() {
        if (this.crC.csb) {
            this.crC = null;
        } else {
            this.ud = 0.0;
            this.ue = 0.0;
            this.uf = 0.0;
            this.Dm();
            if (this.crC != null) {
                this.crC.TV();
                this.csF += (double)(this.crC.pl - this.crC.crM);
                this.csE += (double)(this.crC.pm - this.crC.crO);
                while (this.csF >= 180.0) {
                    this.csF -= 360.0;
                }
                while (this.csF < -180.0) {
                    this.csF += 360.0;
                }
                while (this.csE >= 180.0) {
                    this.csE -= 360.0;
                }
                while (this.csE < -180.0) {
                    this.csE += 360.0;
                }
                double d2 = this.csF * 0.5;
                double d3 = this.csE * 0.5;
                float f2 = 10.0f;
                if (d2 > (double)f2) {
                    d2 = f2;
                }
                if (d2 < (double)(-f2)) {
                    d2 = -f2;
                }
                if (d3 > (double)f2) {
                    d3 = f2;
                }
                if (d3 < (double)(-f2)) {
                    d3 = -f2;
                }
                this.csF -= d2;
                this.csE -= d3;
            }
        }
    }

    public void TV() {
        if (this.crA != null) {
            this.crA.setPosition(this.gW, this.gX + this.TW() + this.crA.LJ(), this.gY);
        }
    }

    public double LJ() {
        return 0.0;
    }

    public double TW() {
        return (double)this.height * 0.75;
    }

    public void D(c c2) {
        this.csE = 0.0;
        this.csF = 0.0;
        if (c2 == null) {
            if (this.crC != null) {
                this.b(this.crC.gW, this.crC.Us().dtI + (double)this.crC.height, this.crC.gY, this.pl, this.pm);
                this.crC.crA = null;
            }
            this.crC = null;
        } else {
            if (this.crC != null) {
                this.crC.crA = null;
            }
            if (c2 != null) {
                c c3 = c2.crC;
                while (c3 != null) {
                    if (c3 == this) {
                        return;
                    }
                    c3 = c3.crC;
                }
            }
            this.crC = c2;
            c2.crA = this;
        }
    }

    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.setPosition(d2, d3, d4);
        this.setRotation(f2, f3);
        List<net.minecraft.util.a> list = this.baU.a(this, this.Us().af(0.03125, 0.0, 0.03125));
        if (!list.isEmpty()) {
            double d5 = 0.0;
            for (net.minecraft.util.a a2 : list) {
                if (!(a2.dtL > d5)) continue;
                d5 = a2.dtL;
            }
            this.setPosition(d2, d3 += d5 - this.Us().dtI, d4);
        }
    }

    public float TX() {
        return ViaLoadingBase.getInstance().getTargetVersion().getVersion() <= 47 ? 0.1f : 0.0f;
    }

    public da TY() {
        return null;
    }

    public void ac(b b2) {
        if (this.csM > 0) {
            this.csM = this.TZ();
        } else {
            if (!this.baU.dDw && !b2.equals(this.csR)) {
                this.csR = b2;
                BlockPattern$PatternHelper blockPattern$PatternHelper = Blocks.cNa.M(this.baU, b2);
                double d2 = blockPattern$PatternHelper.Af().asL() == net.minecraft.util.ap.dwH ? (double)blockPattern$PatternHelper.Ae().wx() : (double)blockPattern$PatternHelper.Ae().wt();
                double d3 = blockPattern$PatternHelper.Af().asL() == net.minecraft.util.ap.dwH ? this.gY : this.gW;
                d3 = Math.abs(bt.aj(d3 - (double)(blockPattern$PatternHelper.Af().asD().asB() == net.minecraft.util.aq.dwP ? 1 : 0), d2, d2 - (double)blockPattern$PatternHelper.Ah()));
                double d4 = bt.aj(this.gX - 1.0, blockPattern$PatternHelper.Ae().wu(), blockPattern$PatternHelper.Ae().wu() - blockPattern$PatternHelper.Ai());
                this.csS = new da(d3, d4, 0.0);
                this.csT = blockPattern$PatternHelper.Af();
            }
            this.csN = true;
        }
    }

    public int TZ() {
        return 300;
    }

    public void P(double d2, double d3, double d4) {
        this.ud = d2;
        this.ue = d3;
        this.uf = d4;
    }

    public void a(byte by2) {
    }

    public void Ua() {
    }

    public co[] Ub() {
        return null;
    }

    public void c(int n2, co co2) {
    }

    public boolean isBurning() {
        boolean bl2 = this.baU != null && this.baU.dDw;
        return !this.csC && (this.csy > 0 || bl2 && this.ex(0));
    }

    public boolean isRiding() {
        return this.crC != null;
    }

    public boolean isSneaking() {
        return this.ex(1);
    }

    public void setSneaking(boolean bl2) {
        this.l(1, bl2);
    }

    public boolean isSprinting() {
        return this.ex(3);
    }

    public void setSprinting(boolean bl2) {
        this.l(3, bl2);
    }

    public boolean isInvisible() {
        return this.ex(5);
    }

    public boolean p(net.minecraft.entity.player.a a2) {
        return a2.CZ() ? false : this.isInvisible();
    }

    public void ak(boolean bl2) {
        this.l(5, bl2);
    }

    public boolean isEating() {
        return this.ex(4);
    }

    public void aE(boolean bl2) {
        this.l(4, bl2);
    }

    protected boolean ex(int n2) {
        return (this.csD.el(0) & 1 << n2) != 0;
    }

    public void l(int n2, boolean bl2) {
        byte by2 = this.csD.el(0);
        if (bl2) {
            this.csD.b(0, (byte)(by2 | 1 << n2));
        } else {
            this.csD.b(0, (byte)(by2 & ~(1 << n2)));
        }
    }

    public int Uc() {
        return this.csD.em(1);
    }

    public void ey(int n2) {
        this.csD.b(1, (short)n2);
    }

    public void b(a a2) {
        this.a(net.minecraft.util.ad.dvc, 5.0f);
        ++this.csy;
        if (this.csy == 0) {
            this.ev(8);
        }
    }

    public void R(r r2) {
    }

    protected boolean x(double d2, double d3, double d4) {
        b b2 = new b(d2, d3, d4);
        double d5 = d2 - (double)b2.wt();
        double d6 = d3 - (double)b2.wu();
        double d7 = d4 - (double)b2.wx();
        List<net.minecraft.util.a> list = this.baU.r(this.Us());
        if (list.isEmpty() && !this.baU.aV(b2)) {
            return false;
        }
        int n2 = 3;
        double d8 = 9999.0;
        if (!this.baU.aV(b2.arb()) && d5 < d8) {
            d8 = d5;
            n2 = 0;
        }
        if (!this.baU.aV(b2.arc()) && 1.0 - d5 < d8) {
            d8 = 1.0 - d5;
            n2 = 1;
        }
        if (!this.baU.aV(b2.aqX()) && 1.0 - d6 < d8) {
            d8 = 1.0 - d6;
            n2 = 3;
        }
        if (!this.baU.aV(b2.aqZ()) && d7 < d8) {
            d8 = d7;
            n2 = 4;
        }
        if (!this.baU.aV(b2.ara()) && 1.0 - d7 < d8) {
            d8 = 1.0 - d7;
            n2 = 5;
        }
        float f2 = this.ta.nextFloat() * 0.2f + 0.1f;
        if (n2 == 0) {
            this.ud = -f2;
        }
        if (n2 == 1) {
            this.ud = f2;
        }
        if (n2 == 3) {
            this.ue = f2;
        }
        if (n2 == 4) {
            this.uf = -f2;
        }
        if (n2 == 5) {
            this.uf = f2;
        }
        return true;
    }

    public void Ud() {
        this.crZ = true;
        this.csf = 0.0f;
    }

    @Override
    public String xU() {
        if (this.xV()) {
            return this.Un();
        }
        String string = n.ad(this);
        if (string == null) {
            string = "generic";
        }
        return cr.gm("entity." + string + ".name");
    }

    public c[] Ue() {
        return null;
    }

    public boolean W(c c2) {
        return this == c2;
    }

    public float Uf() {
        return 0.0f;
    }

    public void aR(float f2) {
    }

    public void aS(float f2) {
    }

    public boolean IC() {
        return true;
    }

    public boolean X(c c2) {
        return false;
    }

    public String toString() {
        return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", this.getClass().getSimpleName(), this.xU(), this.crw, this.baU == null ? "~NULL~" : this.baU.avH().aln(), this.gW, this.gX, this.gY);
    }

    public boolean a(net.minecraft.util.ad ad2) {
        return this.csU && ad2 != net.minecraft.util.ad.dvk && !ad2.asq();
    }

    public void Y(c c2) {
        this.b(c2.gW, c2.gX, c2.gY, c2.pl, c2.pm);
    }

    public void Z(c c2) {
        net.minecraft.nbt.n n2 = new net.minecraft.nbt.n();
        c2.b(n2);
        this.a(n2);
        this.csM = c2.csM;
        this.csR = c2.csR;
        this.csS = c2.csS;
        this.csT = c2.csT;
    }

    public void ez(int n2) {
        if (!this.baU.dDw && !this.csb) {
            this.baU.dDt.eY("changeDimension");
            MinecraftServer minecraftServer = MinecraftServer.afs();
            int n3 = this.csP;
            ai ai2 = minecraftServer.ha(n3);
            ai ai3 = minecraftServer.ha(n2);
            this.csP = n2;
            if (n3 == 1 && n2 == 1) {
                ai3 = minecraftServer.ha(0);
                this.csP = 0;
            }
            this.baU.H(this);
            this.csb = false;
            this.baU.dDt.eY("reposition");
            minecraftServer.alE().a(this, n3, ai2, ai3);
            this.baU.dDt.fa("reloading");
            c c2 = n.a(n.ad(this), (w)ai3);
            if (c2 != null) {
                c2.Z(this);
                if (n3 == 1 && n2 == 1) {
                    b b2 = this.baU.aT(ai3.avE());
                    c2.a(b2, c2.pl, c2.pm);
                }
                ai3.G(c2);
            }
            this.csb = true;
            this.baU.dDt.ajv();
            ai2.awl();
            ai3.awl();
            this.baU.dDt.ajv();
        }
    }

    public float a(h h2, w w2, b b2, IBlockState iBlockState) {
        return iBlockState.df().A(this);
    }

    public boolean a(h h2, w w2, b b2, IBlockState iBlockState, float f2) {
        return true;
    }

    public int Ug() {
        return 3;
    }

    public da Uh() {
        return this.csS;
    }

    public ao Ui() {
        return this.csT;
    }

    public boolean Uj() {
        return false;
    }

    public void a(net.minecraft.crash.i i2) {
        i2.a("Entity Type", new d(this));
        i2.b("Entity ID", this.crw);
        i2.a("Entity Name", new net.minecraft.entity.e(this));
        i2.b("Entity's Exact location", String.format("%.2f, %.2f, %.2f", this.gW, this.gX, this.gY));
        i2.b("Entity's Block location", net.minecraft.crash.i.K(bt.aF(this.gW), bt.aF(this.gX), bt.aF(this.gY)));
        i2.b("Entity's Momentum", String.format("%.2f, %.2f, %.2f", this.ud, this.ue, this.uf));
        i2.a("Entity's Rider", new f(this));
        i2.a("Entity's Vehicle", new g(this));
    }

    public boolean Uk() {
        return this.isBurning();
    }

    public UUID Ul() {
        return this.csV;
    }

    public boolean Um() {
        return true;
    }

    @Override
    public ba xW() {
        net.minecraft.util.s s2 = new net.minecraft.util.s(this.xU());
        s2.arp().a(this.Ur());
        s2.arp().gc(this.Ul().toString());
        return s2;
    }

    public void ec(String string) {
        this.csD.b(2, string);
    }

    public String Un() {
        return this.csD.ep(2);
    }

    public boolean xV() {
        return this.csD.ep(2).length() > 0;
    }

    public void aF(boolean bl2) {
        this.csD.b(3, (byte)(bl2 ? 1 : 0));
    }

    public boolean Uo() {
        return this.csD.el(3) == 1;
    }

    public void Q(double d2, double d3, double d4) {
        this.b(d2, d3, d4, this.pl, this.pm);
    }

    public boolean Up() {
        return this.Uo();
    }

    public void eA(int n2) {
    }

    public ao aT(float f2) {
        return net.minecraft.util.ao.hz(bt.aF((double)(f2 * 4.0f / 360.0f) + 0.5) & 3);
    }

    public ao Uq() {
        return this.aT(this.pl);
    }

    protected net.minecraft.event.c Ur() {
        net.minecraft.nbt.n n2 = new net.minecraft.nbt.n();
        String string = n.ad(this);
        n2.R("id", this.Ul().toString());
        if (string != null) {
            n2.R("type", string);
        }
        n2.R("name", this.xU());
        return new net.minecraft.event.c(net.minecraft.event.d.cKX, new net.minecraft.util.s(n2.toString()));
    }

    public boolean a(e e2) {
        return true;
    }

    public net.minecraft.util.a Us() {
        return this.jJ;
    }

    public void n(net.minecraft.util.a a2) {
        this.jJ = a2;
    }

    public float getEyeHeight() {
        return this.height * 0.85f;
    }

    public boolean Ut() {
        return this.csa;
    }

    public void aG(boolean bl2) {
        this.csa = bl2;
    }

    public boolean f(int n2, co co2) {
        return false;
    }

    @Override
    public void a(ba ba2) {
    }

    @Override
    public boolean c(int n2, String string) {
        return true;
    }

    @Override
    public b yl() {
        return new b(this.gW, this.gX + 0.5, this.gY);
    }

    @Override
    public da Sd() {
        return new da(this.gW, this.gX, this.gY);
    }

    @Override
    public w Se() {
        return this.baU;
    }

    @Override
    public c Sf() {
        return this;
    }

    @Override
    public boolean Sg() {
        return false;
    }

    @Override
    public void a(ad ad2, int n2) {
        this.csX.a(this, ad2, n2);
    }

    public ab Uu() {
        return this.csX;
    }

    public void aa(c c2) {
        this.csX.a(c2.Uu());
    }

    public net.minecraft.nbt.n Uv() {
        return null;
    }

    public void l(net.minecraft.nbt.n n2) {
    }

    public boolean a(net.minecraft.entity.player.a a2, da da2) {
        return false;
    }

    public boolean Uw() {
        return false;
    }

    protected void c(r r2, c c2) {
        if (c2 instanceof r) {
            l.a((r)c2, (c)r2);
        }
        l.b(r2, c2);
    }
}

