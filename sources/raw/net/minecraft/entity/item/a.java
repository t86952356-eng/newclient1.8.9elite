/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.c;
import net.minecraft.entity.item.k;
import net.minecraft.entity.item.m;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.item.y;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.cn;
import net.minecraft.util.da;
import net.minecraft.world.ai;
import net.minecraft.world.w;

public class a
extends r {
    private static final cn cBD = new cn(0.0f, 0.0f, 0.0f);
    private static final cn cBE = new cn(0.0f, 0.0f, 0.0f);
    private static final cn cBF = new cn(-10.0f, 0.0f, -10.0f);
    private static final cn cBG = new cn(-15.0f, 0.0f, 10.0f);
    private static final cn cBH = new cn(-1.0f, 0.0f, -1.0f);
    private static final cn cBI = new cn(1.0f, 0.0f, 1.0f);
    private final co[] cBJ = new co[5];
    private boolean cBK;
    private long cBL;
    private int cBM;
    private boolean cBN;
    private cn cBO = cBD;
    private cn cBP = cBE;
    private cn cBQ = cBF;
    private cn cBR = cBG;
    private cn cBS = cBH;
    private cn cBT = cBI;

    public a(w w2) {
        super(w2);
        this.aD(true);
        this.csp = this.XQ();
        this.o(0.5f, 1.975f);
    }

    public a(w w2, double d2, double d3, double d4) {
        this(w2);
        this.setPosition(d2, d3, d4);
    }

    @Override
    public boolean Dy() {
        return super.Dy() && !this.XQ();
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(10, (byte)0);
        this.csD.a(11, cBD);
        this.csD.a(12, cBE);
        this.csD.a(13, cBF);
        this.csD.a(14, cBG);
        this.csD.a(15, cBH);
        this.csD.a(16, cBI);
    }

    @Override
    public co Vk() {
        return this.cBJ[0];
    }

    @Override
    public co eG(int n2) {
        return this.cBJ[n2];
    }

    @Override
    public co eH(int n2) {
        return this.cBJ[n2 + 1];
    }

    @Override
    public void c(int n2, co co2) {
        this.cBJ[n2] = co2;
    }

    @Override
    public co[] Ub() {
        return this.cBJ;
    }

    @Override
    public boolean f(int n2, co co2) {
        int n3;
        if (n2 == 99) {
            n3 = 0;
        } else {
            n3 = n2 - 100 + 1;
            if (n3 < 0 || n3 >= this.cBJ.length) {
                return false;
            }
        }
        if (!(co2 == null || p.W(co2) == n3 || n3 == 4 && co2.bP() instanceof af)) {
            return false;
        }
        this.c(n3, co2);
        return true;
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        v v2 = new v();
        for (int i2 = 0; i2 < this.cBJ.length; ++i2) {
            n n3 = new n();
            if (this.cBJ[i2] != null) {
                this.cBJ[i2].t(n3);
            }
            v2.a(n3);
        }
        n2.b("Equipment", v2);
        if (this.Uo() && (this.Un() == null || this.Un().length() == 0)) {
            n2.o("CustomNameVisible", this.Uo());
        }
        n2.o("Invisible", this.isInvisible());
        n2.o("Small", this.XP());
        n2.o("ShowArms", this.XR());
        n2.B("DisabledSlots", this.cBM);
        n2.o("NoGravity", this.XQ());
        n2.o("NoBasePlate", this.XS());
        if (this.XT()) {
            n2.o("Marker", this.XT());
        }
        n2.b("Pose", this.XL());
    }

    @Override
    public void e(n n2) {
        g g2;
        super.e(n2);
        if (n2.C("Equipment", 9)) {
            g2 = n2.D("Equipment", 10);
            for (int i2 = 0; i2 < this.cBJ.length; ++i2) {
                this.cBJ[i2] = co.s(g2.gi(i2));
            }
        }
        this.ak(n2.eO("Invisible"));
        this.aP(n2.eO("Small"));
        this.aR(n2.eO("ShowArms"));
        this.cBM = n2.eG("DisabledSlots");
        this.aQ(n2.eO("NoGravity"));
        this.aS(n2.eO("NoBasePlate"));
        this.aT(n2.eO("Marker"));
        this.cBN = !this.XT();
        this.csp = this.XQ();
        g2 = n2.eN("Pose");
        this.n((n)g2);
    }

    private void n(n n2) {
        v v2 = n2.D("Head", 5);
        if (v2.aeS() > 0) {
            this.a(new cn(v2));
        } else {
            this.a(cBD);
        }
        v v3 = n2.D("Body", 5);
        if (v3.aeS() > 0) {
            this.b(new cn(v3));
        } else {
            this.b(cBE);
        }
        v v4 = n2.D("LeftArm", 5);
        if (v4.aeS() > 0) {
            this.c(new cn(v4));
        } else {
            this.c(cBF);
        }
        v v5 = n2.D("RightArm", 5);
        if (v5.aeS() > 0) {
            this.d(new cn(v5));
        } else {
            this.d(cBG);
        }
        v v6 = n2.D("LeftLeg", 5);
        if (v6.aeS() > 0) {
            this.e(new cn(v6));
        } else {
            this.e(cBH);
        }
        v v7 = n2.D("RightLeg", 5);
        if (v7.aeS() > 0) {
            this.f(new cn(v7));
        } else {
            this.f(cBI);
        }
    }

    private n XL() {
        n n2 = new n();
        if (!cBD.equals(this.cBO)) {
            n2.b("Head", this.cBO.atC());
        }
        if (!cBE.equals(this.cBP)) {
            n2.b("Body", this.cBP.atC());
        }
        if (!cBF.equals(this.cBQ)) {
            n2.b("LeftArm", this.cBQ.atC());
        }
        if (!cBG.equals(this.cBR)) {
            n2.b("RightArm", this.cBR.atC());
        }
        if (!cBH.equals(this.cBS)) {
            n2.b("LeftLeg", this.cBS.atC());
        }
        if (!cBI.equals(this.cBT)) {
            n2.b("RightLeg", this.cBT.atC());
        }
        return n2;
    }

    @Override
    public boolean IE() {
        return false;
    }

    @Override
    protected void ah(c c2) {
    }

    @Override
    protected void Wh() {
        List<c> list = this.baU.b(this, this.Us());
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                c c2 = list.get(i2);
                if (!(c2 instanceof k) || ((k)c2).Wm() != m.cCG || !(this.T(c2) <= 0.2)) continue;
                c2.U(this);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean a(net.minecraft.entity.player.a var1_1, da var2_2) {
        block20: {
            block22: {
                block23: {
                    block21: {
                        if (this.XT()) {
                            return false;
                        }
                        if (this.baU.dDw || var1_1.CZ()) break block20;
                        var3_3 = 0;
                        var4_4 = var1_1.abO();
                        v0 = var5_5 = var4_4 != null;
                        if (var5_5 && var4_4.bP() instanceof y) {
                            var6_6 = (y)var4_4.bP();
                            if (var6_6.cVH == 3) {
                                var3_3 = 1;
                            } else if (var6_6.cVH == 2) {
                                var3_3 = 2;
                            } else if (var6_6.cVH == 1) {
                                var3_3 = 3;
                            } else if (var6_6.cVH == 0) {
                                var3_3 = 4;
                            }
                        }
                        if (var5_5 && (var4_4.bP() == Items.cSb || var4_4.bP() == d.I(Blocks.cMW))) {
                            var3_3 = 4;
                        }
                        var6_7 = 0.1;
                        var8_8 = 0.9;
                        var10_9 = 0.4;
                        var12_10 = 1.6;
                        var14_11 = 0;
                        var15_12 = this.XP();
                        v1 = var16_13 = var15_12 != false ? var2_2.dAH * 2.0 : var2_2.dAH;
                        if (!(var16_13 >= 0.1)) break block21;
                        v2 = var15_12 != false ? 0.8 : 0.45;
                        if (!(var16_13 < 0.1 + v2) || this.cBJ[1] == null) break block21;
                        var14_11 = 1;
                        break block22;
                    }
                    v3 = var15_12 != false ? 0.3 : 0.0;
                    if (!(var16_13 >= 0.9 + v3)) break block23;
                    v4 = var15_12 != false ? 1.0 : 0.7;
                    if (!(var16_13 < 0.9 + v4) || this.cBJ[3] == null) break block23;
                    var14_11 = 3;
                    break block22;
                }
                if (!(var16_13 >= 0.4)) ** GOTO lbl-1000
                v5 = var15_12 != false ? 1.0 : 0.8;
                if (var16_13 < 0.4 + v5 && this.cBJ[2] != null) {
                    var14_11 = 2;
                } else if (var16_13 >= 1.6 && this.cBJ[4] != null) {
                    var14_11 = 4;
                }
            }
            v6 = var18_14 = this.cBJ[var14_11] != null;
            if ((this.cBM & 1 << var14_11) != 0 || (this.cBM & 1 << var3_3) != 0) {
                var14_11 = var3_3;
                if ((this.cBM & 1 << var3_3) != 0) {
                    if ((this.cBM & 1) != 0) {
                        return true;
                    }
                    var14_11 = 0;
                }
            }
            if (var5_5 && var3_3 == 0 && !this.XR()) {
                return true;
            }
            if (var5_5) {
                this.b(var1_1, var3_3);
            } else if (var18_14) {
                this.b(var1_1, var14_11);
            }
            return true;
        }
        return true;
    }

    private void b(net.minecraft.entity.player.a a2, int n2) {
        co co2 = this.cBJ[n2];
        if (!(co2 != null && (this.cBM & 1 << n2 + 8) != 0 || co2 == null && (this.cBM & 1 << n2 + 16) != 0)) {
            int n3 = a2.cHV.cJE;
            co co3 = a2.cHV.fi(n3);
            if (a2.cIt.cJM && (co2 == null || co2.bP() == d.I(Blocks.cLc)) && co3 != null) {
                co co4 = co3.aeg();
                co4.cWZ = 1;
                this.c(n2, co4);
            } else if (co3 != null && co3.cWZ > 1) {
                if (co2 == null) {
                    co co5 = co3.aeg();
                    co5.cWZ = 1;
                    this.c(n2, co5);
                    --co3.cWZ;
                }
            } else {
                this.c(n2, co3);
                a2.cHV.g(n3, co2);
            }
        }
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.baU.dDw) {
            return false;
        }
        if (ad.dvk.equals(ad2)) {
            this.Tt();
            return false;
        }
        if (!(this.a(ad2) || this.cBK || this.XT())) {
            if (ad2.arZ()) {
                this.XO();
                this.Tt();
                return false;
            }
            if (ad.dvb.equals(ad2)) {
                if (!this.isBurning()) {
                    this.ev(5);
                } else {
                    this.bc(0.15f);
                }
                return false;
            }
            if (ad.dvd.equals(ad2) && this.getHealth() > 0.5f) {
                this.bc(4.0f);
                return false;
            }
            boolean bl2 = "arrow".equals(ad2.asl());
            boolean bl3 = "player".equals(ad2.asl());
            if (!bl3 && !bl2) {
                return false;
            }
            if (ad2.asf() instanceof net.minecraft.entity.projectile.a) {
                ad2.asf().Tt();
            }
            if (ad2.dk() instanceof net.minecraft.entity.player.a && !((net.minecraft.entity.player.a)ad2.dk()).cIt.cJN) {
                return false;
            }
            if (ad2.asq()) {
                this.XM();
                this.Tt();
                return false;
            }
            long l2 = this.baU.getTotalWorldTime();
            if (l2 - this.cBL > 5L && !bl2) {
                this.cBL = l2;
            } else {
                this.XN();
                this.XM();
                this.Tt();
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean an(double d2) {
        double d3 = this.Us().aqV() * 4.0;
        if (Double.isNaN(d3) || d3 == 0.0) {
            d3 = 4.0;
        }
        return d2 < (d3 *= 64.0) * d3;
    }

    private void XM() {
        if (this.baU instanceof ai) {
            ((ai)this.baU).a(as.dxI, this.gW, this.gX + (double)this.height / 1.5, this.gY, 10, (double)(this.width / 4.0f), (double)(this.height / 4.0f), (double)(this.width / 4.0f), 0.05, Block.a(Blocks.cLh.xM()));
        }
    }

    private void bc(float f2) {
        float f3 = this.getHealth();
        if ((f3 -= f2) <= 0.5f) {
            this.XO();
            this.Tt();
        } else {
            this.aY(f3);
        }
    }

    private void XN() {
        Block.a(this.baU, new b(this), new co(Items.cSn));
        this.XO();
    }

    private void XO() {
        for (int i2 = 0; i2 < this.cBJ.length; ++i2) {
            if (this.cBJ[i2] == null || this.cBJ[i2].cWZ <= 0) continue;
            if (this.cBJ[i2] != null) {
                Block.a(this.baU, new b(this).aqX(), this.cBJ[i2]);
            }
            this.cBJ[i2] = null;
        }
    }

    @Override
    protected float u(float f2, float f3) {
        this.cuG = this.crM;
        this.cuF = this.pl;
        return 0.0f;
    }

    @Override
    public float getEyeHeight() {
        return this.Uz() ? this.height * 0.5f : this.height * 0.9f;
    }

    @Override
    public void t(float f2, float f3) {
        if (!this.XQ()) {
            super.t(f2, f3);
        }
    }

    @Override
    public void Dm() {
        cn cn2;
        cn cn3;
        cn cn4;
        cn cn5;
        cn cn6;
        super.Dm();
        cn cn7 = this.csD.es(11);
        if (!this.cBO.equals(cn7)) {
            this.a(cn7);
        }
        if (!this.cBP.equals(cn6 = this.csD.es(12))) {
            this.b(cn6);
        }
        if (!this.cBQ.equals(cn5 = this.csD.es(13))) {
            this.c(cn5);
        }
        if (!this.cBR.equals(cn4 = this.csD.es(14))) {
            this.d(cn4);
        }
        if (!this.cBS.equals(cn3 = this.csD.es(15))) {
            this.e(cn3);
        }
        if (!this.cBT.equals(cn2 = this.csD.es(16))) {
            this.f(cn2);
        }
        boolean bl2 = this.XT();
        if (!this.cBN && bl2) {
            this.aO(false);
        } else {
            if (!this.cBN || bl2) {
                return;
            }
            this.aO(true);
        }
        this.cBN = bl2;
    }

    private void aO(boolean bl2) {
        double d2 = this.gW;
        double d3 = this.gX;
        double d4 = this.gY;
        if (bl2) {
            this.o(0.5f, 1.975f);
        } else {
            this.o(0.0f, 0.0f);
        }
        this.setPosition(d2, d3, d4);
    }

    @Override
    protected void VI() {
        this.ak(this.cBK);
    }

    @Override
    public void ak(boolean bl2) {
        this.cBK = bl2;
        super.ak(bl2);
    }

    @Override
    public boolean Uz() {
        return this.XP();
    }

    @Override
    public void To() {
        this.Tt();
    }

    @Override
    public boolean Uw() {
        return this.isInvisible();
    }

    private void aP(boolean bl2) {
        byte by2 = this.csD.el(10);
        by2 = bl2 ? (byte)(by2 | 1) : (byte)(by2 & 0xFFFFFFFE);
        this.csD.b(10, by2);
    }

    public boolean XP() {
        return (this.csD.el(10) & 1) != 0;
    }

    private void aQ(boolean bl2) {
        byte by2 = this.csD.el(10);
        by2 = bl2 ? (byte)(by2 | 2) : (byte)(by2 & 0xFFFFFFFD);
        this.csD.b(10, by2);
    }

    public boolean XQ() {
        return (this.csD.el(10) & 2) != 0;
    }

    private void aR(boolean bl2) {
        byte by2 = this.csD.el(10);
        by2 = bl2 ? (byte)(by2 | 4) : (byte)(by2 & 0xFFFFFFFB);
        this.csD.b(10, by2);
    }

    public boolean XR() {
        return (this.csD.el(10) & 4) != 0;
    }

    private void aS(boolean bl2) {
        byte by2 = this.csD.el(10);
        by2 = bl2 ? (byte)(by2 | 8) : (byte)(by2 & 0xFFFFFFF7);
        this.csD.b(10, by2);
    }

    public boolean XS() {
        return (this.csD.el(10) & 8) != 0;
    }

    private void aT(boolean bl2) {
        byte by2 = this.csD.el(10);
        by2 = bl2 ? (byte)(by2 | 0x10) : (byte)(by2 & 0xFFFFFFEF);
        this.csD.b(10, by2);
    }

    public boolean XT() {
        return (this.csD.el(10) & 0x10) != 0;
    }

    public void a(cn cn2) {
        this.cBO = cn2;
        this.csD.b(11, cn2);
    }

    public void b(cn cn2) {
        this.cBP = cn2;
        this.csD.b(12, cn2);
    }

    public void c(cn cn2) {
        this.cBQ = cn2;
        this.csD.b(13, cn2);
    }

    public void d(cn cn2) {
        this.cBR = cn2;
        this.csD.b(14, cn2);
    }

    public void e(cn cn2) {
        this.cBS = cn2;
        this.csD.b(15, cn2);
    }

    public void f(cn cn2) {
        this.cBT = cn2;
        this.csD.b(16, cn2);
    }

    public cn XU() {
        return this.cBO;
    }

    public cn XV() {
        return this.cBP;
    }

    public cn XW() {
        return this.cBQ;
    }

    public cn XX() {
        return this.cBR;
    }

    public cn XY() {
        return this.cBS;
    }

    public cn XZ() {
        return this.cBT;
    }

    @Override
    public boolean TO() {
        return super.TO() && !this.XT();
    }
}

