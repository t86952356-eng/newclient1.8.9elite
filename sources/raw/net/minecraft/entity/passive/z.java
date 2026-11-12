/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.entity.ai.al;
import net.minecraft.entity.ai.ap;
import net.minecraft.entity.ai.aq;
import net.minecraft.entity.ai.bb;
import net.minecraft.entity.ai.bc;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.bf;
import net.minecraft.entity.ai.u;
import net.minecraft.entity.ai.x;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.effect.a;
import net.minecraft.entity.h;
import net.minecraft.entity.item.i;
import net.minecraft.entity.item.w;
import net.minecraft.entity.monster.at;
import net.minecraft.entity.monster.au;
import net.minecraft.entity.monster.aw;
import net.minecraft.entity.p;
import net.minecraft.entity.passive.aa;
import net.minecraft.entity.passive.ab;
import net.minecraft.entity.passive.ac;
import net.minecraft.entity.passive.ad;
import net.minecraft.entity.passive.ae;
import net.minecraft.entity.passive.af;
import net.minecraft.entity.passive.ag;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.pathfinding.f;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.s;
import net.minecraft.util.t;
import net.minecraft.world.e;

public class z
extends h
implements net.minecraft.entity.ae,
net.minecraft.entity.af {
    private int cHp;
    private boolean cHq;
    private boolean cHr;
    net.minecraft.village.c cAd;
    private net.minecraft.entity.player.a cHs;
    private net.minecraft.village.b cHt;
    private int cHu;
    private boolean cHv;
    private boolean cHw;
    private int cHx;
    private String cHy;
    private int cHz;
    private int cHA;
    private boolean cHB;
    private boolean cHC;
    private final net.minecraft.inventory.ad cHD = new net.minecraft.inventory.ad("Items", false, 8);
    private static final ab[][][][] cHE = new ab[][][][]{{{{new aa(Items.cPS, new ag(18, 22)), new aa(Items.cRW, new ag(15, 19)), new aa(Items.cRV, new ag(15, 19)), new af(Items.cPT, new ag(-4, -2))}, {new aa(d.I(Blocks.cMW), new ag(8, 13)), new af(Items.cSe, new ag(-3, -2))}, {new aa(d.I(Blocks.cNm), new ag(7, 12)), new af(Items.cPi, new ag(-5, -7))}, {new af(Items.cRg, new ag(-6, -10)), new af(Items.cRd, new ag(1, 1))}}, {{new aa(Items.cPJ, new ag(15, 20)), new aa(Items.cPl, new ag(16, 24)), new ac(Items.cQY, new ag(6, 6), Items.cQZ, new ag(6, 6))}, {new ae(Items.cQV, new ag(7, 8))}}, {{new aa(d.I(Blocks.cLN), new ag(16, 22)), new af(Items.cRi, new ag(3, 4))}, {new af(new co(d.I(Blocks.cLN), 1, 0), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 1), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 2), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 3), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 4), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 5), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 6), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 7), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 8), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 9), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 10), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 11), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 12), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 13), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 14), new ag(1, 2)), new af(new co(d.I(Blocks.cLN), 1, 15), new ag(1, 2))}}, {{new aa(Items.cPJ, new ag(15, 20)), new af(Items.cPk, new ag(-12, -8))}, {new af(Items.cPj, new ag(2, 3)), new ac(d.I(Blocks.cLp), new ag(10, 10), Items.cQo, new ag(6, 10))}}}, {{{new aa(Items.cQO, new ag(24, 36)), new ad()}, {new aa(Items.cQP, new ag(8, 10)), new af(Items.cQU, new ag(10, 12)), new af(d.I(Blocks.cLZ), new ag(3, 4))}, {new aa(Items.cRR, new ag(2, 2)), new af(Items.cQW, new ag(10, 12)), new af(d.I(Blocks.cLy), new ag(-5, -3))}, {new ad()}, {new ad()}, {new af(Items.cSs, new ag(20, 22))}}}, {{{new aa(Items.cRx, new ag(36, 40)), new aa(Items.cPo, new ag(8, 10))}, {new af(Items.cQG, new ag(-4, -1)), new af(new co(Items.cRa, 1, net.minecraft.item.b.cUN.ado()), new ag(-2, -1))}, {new af(Items.cRL, new ag(7, 11)), new af(d.I(Blocks.cMZ), new ag(-3, -1))}, {new af(Items.cRO, new ag(3, 11))}}}, {{{new aa(Items.cPl, new ag(16, 24)), new af(Items.cQc, new ag(4, 6))}, {new aa(Items.cPn, new ag(7, 9)), new af(Items.cQd, new ag(10, 14))}, {new aa(Items.cPm, new ag(3, 4)), new ae(Items.cQh, new ag(16, 19))}, {new af(Items.cQb, new ag(5, 7)), new af(Items.cQa, new ag(9, 11)), new af(Items.cPY, new ag(5, 7)), new af(Items.cPZ, new ag(11, 15))}}, {{new aa(Items.cPl, new ag(16, 24)), new af(Items.cPg, new ag(6, 8))}, {new aa(Items.cPn, new ag(7, 9)), new ae(Items.cPp, new ag(9, 10))}, {new aa(Items.cPm, new ag(3, 4)), new ae(Items.cPy, new ag(12, 15)), new ae(Items.cPB, new ag(9, 12))}}, {{new aa(Items.cPl, new ag(16, 24)), new ae(Items.cPe, new ag(5, 7))}, {new aa(Items.cPn, new ag(7, 9)), new ae(Items.cPf, new ag(9, 11))}, {new aa(Items.cPm, new ag(3, 4)), new ae(Items.cPA, new ag(12, 15))}}}, {{{new aa(Items.cRm, new ag(14, 18)), new aa(Items.cRo, new ag(14, 18))}, {new aa(Items.cPl, new ag(16, 24)), new af(Items.cRn, new ag(-7, -5)), new af(Items.cRp, new ag(-8, -6))}}, {{new aa(Items.cQJ, new ag(9, 12)), new af(Items.cPW, new ag(2, 4))}, {new ae(Items.cPV, new ag(7, 12))}, {new af(Items.cQE, new ag(8, 10))}}}};

    public z(net.minecraft.world.w w2) {
        this(w2, 0);
    }

    public z(net.minecraft.world.w w2, int n2) {
        super(w2);
        this.fA(n2);
        this.o(0.6f, 1.8f);
        ((f)this.UU()).bR(true);
        ((f)this.UU()).bQ(true);
        this.ctS.a(0, new net.minecraft.entity.ai.au(this));
        this.ctS.a(1, new net.minecraft.entity.ai.c<au>(this, au.class, 8.0f, 0.6, 0.6));
        this.ctS.a(1, new net.minecraft.entity.ai.ba(this));
        this.ctS.a(1, new x(this));
        this.ctS.a(2, new net.minecraft.entity.ai.ab(this));
        this.ctS.a(3, new aq(this));
        this.ctS.a(4, new al(this, true));
        this.ctS.a(5, new net.minecraft.entity.ai.ae(this, 0.6));
        this.ctS.a(6, new bc(this));
        this.ctS.a(7, new net.minecraft.entity.ai.r(this));
        this.ctS.a(9, new bf(this, net.minecraft.entity.player.a.class, 3.0f, 1.0f));
        this.ctS.a(9, new bb(this));
        this.ctS.a(9, new bd(this, 0.6));
        this.ctS.a(10, new be(this, p.class, 8.0f));
        this.aI(true);
    }

    private void abp() {
        if (!this.cHC) {
            this.cHC = true;
            if (this.Uz()) {
                this.ctS.a(8, new ap(this, 0.32));
            } else if (this.abq() == 0) {
                this.ctS.a(6, new u(this, 0.6));
            }
        }
    }

    @Override
    protected void Uy() {
        if (this.abq() == 0) {
            this.ctS.a(8, new u(this, 0.6));
        }
        super.Uy();
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwp).ap(0.5);
    }

    @Override
    protected void Vf() {
        if (--this.cHp <= 0) {
            b b2 = new b(this);
            this.baU.avS().aw(b2);
            this.cHp = 70 + this.ta.nextInt(50);
            this.cAd = this.baU.avS().e(b2, 32);
            if (this.cAd == null) {
                this.UG();
            } else {
                Object object = this.cAd.aum();
                this.c((b)object, (int)((float)this.cAd.aun() * 1.0f));
                if (this.cHB) {
                    this.cHB = false;
                    this.cAd.hY(5);
                }
            }
        }
        if (!this.abt() && this.cHu > 0) {
            --this.cHu;
            if (this.cHu <= 0) {
                if (this.cHv) {
                    for (Object object : this.cHt) {
                        if (!((net.minecraft.village.a)object).auf()) continue;
                        ((net.minecraft.village.a)object).hW(this.ta.nextInt(6) + this.ta.nextInt(6) + 2);
                    }
                    this.abu();
                    this.cHv = false;
                    if (this.cAd != null && this.cHy != null) {
                        this.baU.a((c)this, (byte)14);
                        this.cAd.H(this.cHy, 1);
                    }
                }
                this.b(new net.minecraft.potion.d(net.minecraft.potion.a.dgF.dhb, 200, 0));
            }
        }
        super.Vf();
    }

    @Override
    public boolean q(net.minecraft.entity.player.a a2) {
        boolean bl2;
        co co2 = a2.cHV.acE();
        boolean bl3 = bl2 = co2 != null && co2.bP() == Items.cRN;
        if (!bl2 && this.TS() && !this.abt() && !this.Uz()) {
            if (!(this.baU.dDw || this.cHt != null && this.cHt.size() <= 0)) {
                this.s(a2);
                a2.a(this);
            }
            a2.a(net.minecraft.stats.n.dqg);
            return true;
        }
        return super.q(a2);
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, 0);
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.B("Profession", this.abq());
        n2.B("Riches", this.cHx);
        n2.B("Career", this.cHz);
        n2.B("CareerLevel", this.cHA);
        n2.o("Willing", this.cHw);
        if (this.cHt != null) {
            n2.b("Offers", this.cHt.auj());
        }
        v v2 = new v();
        for (int i2 = 0; i2 < this.cHD.YI(); ++i2) {
            co co2 = this.cHD.fi(i2);
            if (co2 == null) continue;
            v2.a(co2.t(new n()));
        }
        n2.b("Inventory", v2);
    }

    @Override
    public void e(n n2) {
        g g2;
        super.e(n2);
        this.fA(n2.eG("Profession"));
        this.cHx = n2.eG("Riches");
        this.cHz = n2.eG("Career");
        this.cHA = n2.eG("CareerLevel");
        this.cHw = n2.eO("Willing");
        if (n2.C("Offers", 10)) {
            g2 = n2.eN("Offers");
            this.cHt = new net.minecraft.village.b((n)g2);
        }
        g2 = n2.D("Inventory", 10);
        for (int i2 = 0; i2 < ((v)g2).aeS(); ++i2) {
            co co2 = co.s(((v)g2).gi(i2));
            if (co2 == null) continue;
            this.cHD.ak(co2);
        }
        this.aI(true);
        this.abp();
    }

    @Override
    protected boolean Vd() {
        return false;
    }

    @Override
    protected String Vb() {
        return this.abt() ? "mob.villager.haggle" : "mob.villager.idle";
    }

    @Override
    protected String VN() {
        return "mob.villager.hit";
    }

    @Override
    protected String VO() {
        return "mob.villager.death";
    }

    public void fA(int n2) {
        this.csD.b(16, n2);
    }

    public int abq() {
        return Math.max(this.csD.en(16) % 5, 0);
    }

    public boolean abr() {
        return this.cHq;
    }

    public void bD(boolean bl2) {
        this.cHq = bl2;
    }

    public void bE(boolean bl2) {
        this.cHr = bl2;
    }

    public boolean abs() {
        return this.cHr;
    }

    @Override
    public void T(r r2) {
        super.T(r2);
        if (this.cAd != null && r2 != null) {
            this.cAd.ae(r2);
            if (r2 instanceof net.minecraft.entity.player.a) {
                int n2 = -1;
                if (this.Uz()) {
                    n2 = -3;
                }
                this.cAd.H(r2.xU(), n2);
                if (this.TS()) {
                    this.baU.a((c)this, (byte)13);
                }
            }
        }
    }

    @Override
    public void b(net.minecraft.util.ad ad2) {
        if (this.cAd != null) {
            c c2 = ad2.dk();
            if (c2 != null) {
                if (c2 instanceof net.minecraft.entity.player.a) {
                    this.cAd.H(c2.xU(), -2);
                } else if (c2 instanceof aw) {
                    this.cAd.auw();
                }
            } else {
                net.minecraft.entity.player.a a2 = this.baU.f(this, 16.0);
                if (a2 != null) {
                    this.cAd.auw();
                }
            }
        }
        super.b(ad2);
    }

    @Override
    public void s(net.minecraft.entity.player.a a2) {
        this.cHs = a2;
    }

    @Override
    public net.minecraft.entity.player.a WB() {
        return this.cHs;
    }

    public boolean abt() {
        return this.cHs != null;
    }

    public boolean bF(boolean bl2) {
        if (!this.cHw && bl2 && this.abx()) {
            boolean bl3 = false;
            for (int i2 = 0; i2 < this.cHD.YI(); ++i2) {
                co co2 = this.cHD.fi(i2);
                if (co2 != null) {
                    if (co2.bP() == Items.cPT && co2.cWZ >= 3) {
                        bl3 = true;
                        this.cHD.ap(i2, 3);
                    } else if ((co2.bP() == Items.cRW || co2.bP() == Items.cRV) && co2.cWZ >= 12) {
                        bl3 = true;
                        this.cHD.ap(i2, 12);
                    }
                }
                if (!bl3) continue;
                this.baU.a((c)this, (byte)18);
                this.cHw = true;
                break;
            }
        }
        return this.cHw;
    }

    public void bG(boolean bl2) {
        this.cHw = bl2;
    }

    @Override
    public void a(net.minecraft.village.a a2) {
        a2.aue();
        this.ctL = -this.UY();
        this.a("mob.villager.yes", this.VZ(), this.Wa());
        int n2 = 3 + this.ta.nextInt(4);
        if (a2.auc() == 1 || this.ta.nextInt(5) == 0) {
            this.cHu = 40;
            this.cHv = true;
            this.cHw = true;
            this.cHy = this.cHs != null ? this.cHs.xU() : null;
            n2 += 5;
        }
        if (a2.atY().bP() == Items.cRS) {
            this.cHx += a2.atY().cWZ;
        }
        if (a2.auh()) {
            this.baU.G(new w(this.baU, this.gW, this.gX + 0.5, this.gY, n2));
        }
    }

    @Override
    public void Y(co co2) {
        if (!this.baU.dDw && this.ctL > -this.UY() + 20) {
            this.ctL = -this.UY();
            if (co2 != null) {
                this.a("mob.villager.yes", this.VZ(), this.Wa());
            } else {
                this.a("mob.villager.no", this.VZ(), this.Wa());
            }
        }
    }

    @Override
    public net.minecraft.village.b t(net.minecraft.entity.player.a a2) {
        if (this.cHt == null) {
            this.abu();
        }
        return this.cHt;
    }

    private void abu() {
        ab[][][] abArray = cHE[this.abq()];
        if (this.cHz != 0 && this.cHA != 0) {
            ++this.cHA;
        } else {
            this.cHz = this.ta.nextInt(abArray.length) + 1;
            this.cHA = 1;
        }
        if (this.cHt == null) {
            this.cHt = new net.minecraft.village.b();
        }
        int n2 = this.cHz - 1;
        int n3 = this.cHA - 1;
        ab[][] abArray2 = abArray[n2];
        if (n3 >= 0 && n3 < abArray2.length) {
            ab[] abArray3;
            for (ab ab2 : abArray3 = abArray2[n3]) {
                ab2.a(this.cHt, this.ta);
            }
        }
    }

    @Override
    public void a(net.minecraft.village.b b2) {
    }

    @Override
    public ba xW() {
        String string = this.Un();
        if (string != null && string.length() > 0) {
            s s2 = new s(string);
            s2.arp().a(this.Ur());
            s2.arp().gc(this.Ul().toString());
            return s2;
        }
        if (this.cHt == null) {
            this.abu();
        }
        String string2 = null;
        switch (this.abq()) {
            case 0: {
                if (this.cHz == 1) {
                    string2 = "farmer";
                    break;
                }
                if (this.cHz == 2) {
                    string2 = "fisherman";
                    break;
                }
                if (this.cHz == 3) {
                    string2 = "shepherd";
                    break;
                }
                if (this.cHz != 4) break;
                string2 = "fletcher";
                break;
            }
            case 1: {
                string2 = "librarian";
                break;
            }
            case 2: {
                string2 = "cleric";
                break;
            }
            case 3: {
                if (this.cHz == 1) {
                    string2 = "armor";
                    break;
                }
                if (this.cHz == 2) {
                    string2 = "weapon";
                    break;
                }
                if (this.cHz != 3) break;
                string2 = "tool";
                break;
            }
            case 4: {
                if (this.cHz == 1) {
                    string2 = "butcher";
                    break;
                }
                if (this.cHz != 2) break;
                string2 = "leather";
            }
        }
        if (string2 != null) {
            t t2 = new t("entity.Villager." + string2, new Object[0]);
            t2.arp().a(this.Ur());
            t2.arp().gc(this.Ul().toString());
            return t2;
        }
        return super.xW();
    }

    @Override
    public float getEyeHeight() {
        float f2 = 1.62f;
        if (this.Uz()) {
            f2 = (float)((double)f2 - 0.81);
        }
        return f2;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 12) {
            this.a(as.dxE);
        } else if (by2 == 13) {
            this.a(as.dxq);
        } else if (by2 == 14) {
            this.a(as.dxr);
        } else {
            super.a(by2);
        }
    }

    private void a(as as2) {
        for (int i2 = 0; i2 < 5; ++i2) {
            double d2 = this.ta.nextGaussian() * 0.02;
            double d3 = this.ta.nextGaussian() * 0.02;
            double d4 = this.ta.nextGaussian() * 0.02;
            this.baU.a(as2, this.gW + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, this.gX + 1.0 + (double)(this.ta.nextFloat() * this.height), this.gY + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, d2, d3, d4, new int[0]);
        }
    }

    @Override
    public net.minecraft.entity.ab a(e e2, net.minecraft.entity.ab ab2) {
        ab2 = super.a(e2, ab2);
        this.fA(this.baU.dDk.nextInt(5));
        this.abp();
        return ab2;
    }

    public void abv() {
        this.cHB = true;
    }

    public z i(h h2) {
        z z2 = new z(this.baU);
        z2.a(this.baU.bg(new b(z2)), null);
        return z2;
    }

    @Override
    public boolean Vp() {
        return false;
    }

    @Override
    public void b(a a2) {
        if (!this.baU.dDw && !this.csb) {
            at at2 = new at(this.baU);
            at2.b(this.gW, this.gX, this.gY, this.pl, this.pm);
            at2.a(this.baU.bg(new b(at2)), null);
            at2.aJ(this.Vt());
            if (this.xV()) {
                at2.ec(this.Un());
                at2.aF(this.Uo());
            }
            this.baU.G(at2);
            this.Tt();
        }
    }

    public net.minecraft.inventory.ad abw() {
        return this.cHD;
    }

    @Override
    protected void c(i i2) {
        co co2 = i2.Yk();
        d d2 = co2.bP();
        if (this.l(d2)) {
            co co3 = this.cHD.ak(co2);
            if (co3 == null) {
                i2.Tt();
            } else {
                co2.cWZ = co3.cWZ;
            }
        }
    }

    private boolean l(d d2) {
        return d2 == Items.cPT || d2 == Items.cRW || d2 == Items.cRV || d2 == Items.cPS || d2 == Items.cPR;
    }

    public boolean abx() {
        return this.fB(1);
    }

    public boolean aby() {
        return this.fB(2);
    }

    public boolean abz() {
        boolean bl2;
        boolean bl3 = bl2 = this.abq() == 0;
        return bl2 ? !this.fB(5) : !this.fB(1);
    }

    private boolean fB(int n2) {
        boolean bl2 = this.abq() == 0;
        for (int i2 = 0; i2 < this.cHD.YI(); ++i2) {
            co co2 = this.cHD.fi(i2);
            if (co2 == null) continue;
            if (co2.bP() == Items.cPT && co2.cWZ >= 3 * n2 || co2.bP() == Items.cRW && co2.cWZ >= 12 * n2 || co2.bP() == Items.cRV && co2.cWZ >= 12 * n2) {
                return true;
            }
            if (!bl2 || co2.bP() != Items.cPS || co2.cWZ < 9 * n2) continue;
            return true;
        }
        return false;
    }

    public boolean abA() {
        for (int i2 = 0; i2 < this.cHD.YI(); ++i2) {
            co co2 = this.cHD.fi(i2);
            if (co2 == null || co2.bP() != Items.cPR && co2.bP() != Items.cRW && co2.bP() != Items.cRV) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean f(int n2, co co2) {
        if (super.f(n2, co2)) {
            return true;
        }
        int n3 = n2 - 300;
        if (n3 >= 0 && n3 < this.cHD.YI()) {
            this.cHD.g(n3, co2);
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ h a(h h2) {
        return this.i(h2);
    }
}

