/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.entity.player;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.bu;
import hackclient.rise.cl;
import hackclient.rise.di;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.ac;
import net.minecraft.entity.ae;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.item.k;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.n;
import net.minecraft.entity.o;
import net.minecraft.entity.p;
import net.minecraft.entity.player.d;
import net.minecraft.entity.player.e;
import net.minecraft.entity.player.f;
import net.minecraft.entity.player.g;
import net.minecraft.entity.player.i;
import net.minecraft.entity.r;
import net.minecraft.entity.z;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.t;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.item.y;
import net.minecraft.nbt.v;
import net.minecraft.scoreboard.b;
import net.minecraft.scoreboard.h;
import net.minecraft.scoreboard.l;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.ag;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.aw;
import net.minecraft.util.ba;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import net.minecraft.util.s;
import net.minecraft.world.ao;
import net.minecraft.world.m;
import net.minecraft.world.q;
import net.minecraft.world.w;
import rise.Client;
import rise.event.impl.HitSlowDownEvent;
import rise.module.impl.player.Scaffold;
import rise.util.InstanceAccess;

public abstract class a
extends r
implements InstanceAccess,
Serializable {
    public g cHV = new g(this);
    private net.minecraft.inventory.ag cHW = new net.minecraft.inventory.ag();
    public net.minecraft.inventory.b cHX;
    public net.minecraft.inventory.b cHY;
    protected aw cHZ = new aw();
    protected int cIa;
    public float cIb;
    public float cIc;
    public int cId;
    public double cIe;
    public double cIf;
    public double cIg;
    public double cIh;
    public double cIi;
    public double cIj;
    protected boolean cIk;
    public net.minecraft.util.b cIl;
    private int cIm;
    public float cIn;
    public float cIo;
    public float cIp;
    private net.minecraft.util.b cIq;
    private boolean cIr;
    private net.minecraft.util.b cIs;
    public i cIt = new i();
    public int cIu;
    public int cIv;
    public float cIw;
    private int cIx;
    public co cIy;
    public int cIz;
    protected float cIA = 0.1f;
    public float cIB = 0.02f;
    private int cIC;
    public GameProfile bEH;
    private boolean cID = false;
    public net.minecraft.entity.projectile.d cIE;
    public rip.vantage.commons.util.time.a cIF = new rip.vantage.commons.util.time.a();

    public a(w w2, GameProfile gameProfile) {
        super(w2);
        this.csV = a.e(gameProfile);
        this.bEH = gameProfile;
        this.cHY = this.cHX = new t(this.cHV, !w2.dDw, this);
        net.minecraft.util.b b2 = w2.avE();
        this.b((double)b2.wt() + 0.5, (double)(b2.wu() + 1), (double)b2.wx() + 0.5, 0.0f, 0.0f);
        this.cuR = 180.0f;
        this.csx = 20;
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.VX().c(aj.cwq).ap(1.0);
        this.a(aj.cwp).ap(0.1f);
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, (byte)0);
        this.csD.a(17, Float.valueOf(0.0f));
        this.csD.a(18, 0);
        this.csD.a(10, (byte)0);
    }

    public co abF() {
        return this.cIy;
    }

    public int abG() {
        return this.cIz;
    }

    public boolean isUsingItem() {
        return this.cIy != null;
    }

    public int abH() {
        return this.isUsingItem() ? this.cIy.aeh() - this.cIz : 0;
    }

    public void abI() {
        if (this.cIy != null) {
            this.cIy.b(this.baU, this, this.cIz);
        }
        this.abJ();
    }

    public void abJ() {
        this.cIy = null;
        this.cIz = 0;
        if (!this.baU.dDw) {
            this.aE(false);
        }
    }

    public boolean abK() {
        return this.isUsingItem() && this.cIy.bP().ap(this.cIy) == net.minecraft.item.a.cUz;
    }

    @Override
    public void Dm() {
        this.csp = this.CZ();
        if (this.CZ()) {
            this.aO = false;
        }
        if (this.cIy != null) {
            co co2 = this.cHV.acE();
            if (co2 == this.cIy) {
                if (this.cIz <= 25 && this.cIz % 4 == 0) {
                    this.b(co2, 5);
                }
                if (--this.cIz == 0 && !this.baU.dDw) {
                    this.abL();
                }
            } else {
                this.abJ();
            }
        }
        if (this.cId > 0) {
            --this.cId;
        }
        if (this.Wg()) {
            ++this.cIm;
            if (this.cIm > 100) {
                this.cIm = 100;
            }
            if (!this.baU.dDw) {
                if (!this.abQ()) {
                    this.a(true, true, false);
                } else if (this.baU.avr()) {
                    this.a(false, true, true);
                }
            }
        } else if (this.cIm > 0) {
            ++this.cIm;
            if (this.cIm >= 110) {
                this.cIm = 0;
            }
        }
        super.Dm();
        if (!this.baU.dDw && this.cHY != null && !this.cHY.i(this)) {
            this.Dq();
            this.cHY = this.cHX;
        }
        if (this.isBurning() && this.cIt.cJJ) {
            this.Tx();
        }
        this.cIe = this.cIh;
        this.cIf = this.cIi;
        this.cIg = this.cIj;
        double d2 = this.gW - this.cIh;
        double d3 = this.gX - this.cIi;
        double d4 = this.gY - this.cIj;
        double d5 = 10.0;
        if (d2 > 10.0) {
            this.cIe = this.cIh = this.gW;
        }
        if (d4 > 10.0) {
            this.cIg = this.cIj = this.gY;
        }
        if (d3 > 10.0) {
            this.cIf = this.cIi = this.gX;
        }
        if (d2 < -10.0) {
            this.cIe = this.cIh = this.gW;
        }
        if (d4 < -10.0) {
            this.cIg = this.cIj = this.gY;
        }
        if (d3 < -10.0) {
            this.cIf = this.cIi = this.gX;
        }
        this.cIh += d2 * 0.25;
        this.cIj += d4 * 0.25;
        this.cIi += d3 * 0.25;
        if (this.crC == null) {
            this.cIs = null;
        }
        if (!this.baU.dDw) {
            this.cHZ.M(this);
            this.a(net.minecraft.stats.n.dpH);
            if (this.TS()) {
                this.a(net.minecraft.stats.n.dpI);
            }
        }
        int n2 = 29999999;
        double d6 = bt.ah(this.gW, -2.9999999E7, 2.9999999E7);
        double d7 = bt.ah(this.gY, -2.9999999E7, 2.9999999E7);
        if (d6 != this.gW || d7 != this.gY) {
            this.setPosition(d6, this.gX, d7);
        }
    }

    @Override
    public int Tv() {
        return this.cIt.cJJ ? 0 : 80;
    }

    @Override
    protected String TC() {
        return "game.player.swim";
    }

    @Override
    protected String TL() {
        return "game.player.swim.splash";
    }

    @Override
    public int TZ() {
        return 10;
    }

    @Override
    public void a(String string, float f2, float f3) {
        this.baU.a(this, string, f2, f3);
    }

    protected void b(co co2, int n2) {
        if (co2.aei() == net.minecraft.item.a.cUy) {
            this.a("random.drink", 0.5f, this.baU.dDk.nextFloat() * 0.1f + 0.9f);
        }
        if (co2.aei() == net.minecraft.item.a.cUx) {
            for (int i2 = 0; i2 < n2; ++i2) {
                da da2 = new da(((double)this.ta.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
                da2 = da2.bO(-this.pm * (float)Math.PI / 180.0f);
                da2 = da2.bP(-this.pl * (float)Math.PI / 180.0f);
                double d2 = (double)(-this.ta.nextFloat()) * 0.6 - 0.3;
                da da3 = new da(((double)this.ta.nextFloat() - 0.5) * 0.3, d2, 0.6);
                da3 = da3.bO(-this.pm * (float)Math.PI / 180.0f);
                da3 = da3.bP(-this.pl * (float)Math.PI / 180.0f);
                da3 = da3.al(this.gW, this.gX + (double)this.getEyeHeight(), this.gY);
                if (co2.ads()) {
                    this.baU.a(as.dxG, da3.dAG, da3.dAH, da3.dAI, da2.dAG, da2.dAH + 0.05, da2.dAI, net.minecraft.item.d.p(co2.bP()), co2.yc());
                    continue;
                }
                this.baU.a(as.dxG, da3.dAG, da3.dAH, da3.dAI, da2.dAG, da2.dAH + 0.05, da2.dAI, net.minecraft.item.d.p(co2.bP()));
            }
            this.a("random.eat", 0.5f + 0.5f * (float)this.ta.nextInt(2), (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f + 1.0f);
        }
    }

    protected void abL() {
        if (this.cIy != null) {
            this.b(this.cIy, 16);
            int n2 = this.cIy.cWZ;
            co co2 = this.cIy.b(this.baU, this);
            if (co2 != this.cIy || co2 != null && co2.cWZ != n2) {
                co[] coArray = this.cHV.cJC;
                this.d(bu.class);
                coArray[bu.bQ()] = co2;
                if (co2.cWZ == 0) {
                    co[] coArray2 = this.cHV.cJC;
                    this.d(bu.class);
                    coArray2[bu.bQ()] = null;
                }
            }
            this.abJ();
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 9) {
            this.abL();
        } else if (by2 == 23) {
            this.cID = false;
        } else if (by2 == 22) {
            this.cID = true;
        } else {
            super.a(by2);
        }
    }

    @Override
    protected boolean Wb() {
        return this.getHealth() <= 0.0f || this.Wg();
    }

    protected void Dq() {
        this.cHY = this.cHX;
    }

    @Override
    public void TU() {
        if (!this.baU.dDw && this.isSneaking()) {
            this.D((c)null);
            this.setSneaking(false);
        } else {
            double d2 = this.gW;
            double d3 = this.gX;
            double d4 = this.gY;
            float f2 = this.pl;
            float f3 = this.pm;
            super.TU();
            this.cIb = this.cIc;
            this.cIc = 0.0f;
            this.U(this.gW - d2, this.gX - d3, this.gY - d4);
            if (this.crC instanceof net.minecraft.entity.passive.k) {
                this.pm = f3;
                this.pl = f2;
                this.cuF = ((net.minecraft.entity.passive.k)this.crC).cuF;
            }
        }
    }

    @Override
    public void Ts() {
        this.o(0.6f, 1.8f);
        super.Ts();
        this.aY(this.getMaxHealth());
        this.cuv = 0;
    }

    @Override
    protected void DB() {
        super.DB();
        this.VW();
        this.pn = this.pl;
    }

    @Override
    public void Dn() {
        if (this.cIa > 0) {
            --this.cIa;
        }
        if (this.baU.agm() == net.minecraft.world.f.dBR && this.baU.Si().gw("naturalRegeneration")) {
            if (this.getHealth() < this.getMaxHealth() && this.aRg % 20 == 0) {
                this.P(1.0f);
            }
            if (this.cHZ.atf() && this.aRg % 10 == 0) {
                this.cHZ.hB(this.cHZ.getFoodLevel() + 1);
            }
        }
        this.cHV.acI();
        this.cIb = this.cIc;
        if (this.isInWater() && a.aER.bgK.bkr.jr) {
            this.ue -= (double)0.04f;
        }
        super.Dn();
        net.minecraft.entity.ai.attributes.e e2 = this.a(aj.cwp);
        if (!this.baU.dDw) {
            e2.ap(this.cIt.getWalkSpeed());
        }
        this.cuI = this.cIB;
        if (this.isSprinting()) {
            this.cuI = (float)((double)this.cuI + (double)this.cIB * 0.3);
        }
        this.aX((float)e2.XB());
        float f2 = bt.aD(this.ud * this.ud + this.uf * this.uf);
        float f3 = (float)(Math.atan(-this.ue * (double)0.2f) * 15.0);
        if (f2 > 0.1f) {
            f2 = 0.1f;
        }
        if (!this.aO || this.getHealth() <= 0.0f) {
            f2 = 0.0f;
        }
        if (this.aO || this.getHealth() <= 0.0f) {
            f3 = 0.0f;
        }
        this.cIc += (f2 - this.cIc) * 0.4f;
        this.cuC += (f3 - this.cuC) * 0.8f;
        if (this.getHealth() > 0.0f && !this.CZ()) {
            net.minecraft.util.a a2 = this.crC != null && !this.crC.csb ? this.Us().p(this.crC.Us()).ad(1.0, 0.0, 1.0) : this.Us().ad(1.0, 0.5, 1.0);
            List<c> list = this.baU.b(this, a2);
            for (int i2 = 0; i2 < list.size(); ++i2) {
                c c2 = list.get(i2);
                if (c2.csb) continue;
                this.ao(c2);
            }
        }
    }

    private void ao(c c2) {
        c2.n(this);
    }

    public int abM() {
        return this.csD.en(18);
    }

    public void fC(int n2) {
        this.csD.b(18, n2);
    }

    public void fD(int n2) {
        int n3 = this.abM();
        this.csD.b(18, n3 + n2);
    }

    @Override
    public void b(ad ad2) {
        super.b(ad2);
        this.o(0.2f, 0.2f);
        this.setPosition(this.gW, this.gX, this.gY);
        this.ue = 0.1f;
        if (this.xU().equals("Notch")) {
            this.a(new co(Items.cPi, 1), true, false);
        }
        if (!this.baU.Si().gw("keepInventory")) {
            this.cHV.acJ();
        }
        this.ud = -bt.bB((this.cuu + this.pp) * (float)Math.PI / 180.0f) * 0.1f;
        this.uf = -bt.bx((this.cuu + this.pp) * (float)Math.PI / 180.0f) * 0.1f;
        this.a(net.minecraft.stats.n.dpZ);
        this.b(net.minecraft.stats.n.dpI);
    }

    @Override
    protected String VN() {
        return "game.player.hurt";
    }

    @Override
    protected String VO() {
        return "game.player.die";
    }

    @Override
    public void b(c c2, int n2) {
        this.fD(n2);
        Collection<net.minecraft.scoreboard.g> collection = this.acc().a(b.dju);
        if (c2 instanceof a) {
            this.a(net.minecraft.stats.n.dqc);
            collection.addAll(this.acc().a(b.djt));
            collection.addAll(this.ap(c2));
        } else {
            this.a(net.minecraft.stats.n.dqa);
        }
        for (net.minecraft.scoreboard.g g2 : collection) {
            net.minecraft.scoreboard.d d2 = this.acc().b(this.xU(), g2);
            d2.akl();
        }
    }

    private Collection<net.minecraft.scoreboard.g> ap(c c2) {
        int n2;
        h h2;
        int n3;
        h h3 = this.acc().fs(this.xU());
        if (h3 != null && (n3 = h3.akz().asv()) >= 0 && n3 < b.djx.length) {
            for (net.minecraft.scoreboard.g g2 : this.acc().a(b.djx[n3])) {
                net.minecraft.scoreboard.d d2 = this.acc().b(c2.xU(), g2);
                d2.akl();
            }
        }
        if ((h2 = this.acc().fs(c2.xU())) != null && (n2 = h2.akz().asv()) >= 0 && n2 < b.djw.length) {
            return this.acc().a(b.djw[n2]);
        }
        return Lists.newArrayList();
    }

    public net.minecraft.entity.item.i V(boolean bl2) {
        return this.a(this.cHV.ap(this.cHV.cJE, bl2 && this.cHV.acE() != null ? this.cHV.acE().cWZ : 1), false, true);
    }

    public net.minecraft.entity.item.i d(co co2, boolean bl2) {
        return this.a(co2, false, false);
    }

    public net.minecraft.entity.item.i a(co co2, boolean bl2, boolean bl3) {
        if (co2 == null) {
            return null;
        }
        if (co2.cWZ == 0) {
            return null;
        }
        double d2 = this.gX - (double)0.3f + (double)this.getEyeHeight();
        net.minecraft.entity.item.i i2 = new net.minecraft.entity.item.i(this.baU, this.gW, d2, this.gY, co2);
        i2.fc(40);
        if (bl3) {
            i2.ej(this.xU());
        }
        if (bl2) {
            float f2 = this.ta.nextFloat() * 0.5f;
            float f3 = this.ta.nextFloat() * (float)Math.PI * 2.0f;
            i2.ud = -bt.bx(f3) * f2;
            i2.uf = bt.bB(f3) * f2;
            i2.ue = 0.2f;
        } else {
            float f4 = 0.3f;
            i2.ud = -bt.bx(this.pp / 180.0f * (float)Math.PI) * bt.bB(this.pm / 180.0f * (float)Math.PI) * f4;
            i2.uf = bt.bB(this.pp / 180.0f * (float)Math.PI) * bt.bB(this.pm / 180.0f * (float)Math.PI) * f4;
            i2.ue = -bt.bx(this.pm / 180.0f * (float)Math.PI) * f4 + 0.1f;
            float f5 = this.ta.nextFloat() * (float)Math.PI * 2.0f;
            f4 = 0.02f * this.ta.nextFloat();
            i2.ud += Math.cos(f5) * (double)f4;
            i2.ue += (double)((this.ta.nextFloat() - this.ta.nextFloat()) * 0.1f);
            i2.uf += Math.sin(f5) * (double)f4;
        }
        this.a(i2);
        if (bl3) {
            this.a(net.minecraft.stats.n.dpW);
        }
        return i2;
    }

    protected void a(net.minecraft.entity.item.i i2) {
        this.baU.G(i2);
    }

    public float E(Block block) {
        float f2 = this.cHV.G(block);
        if (f2 > 1.0f) {
            int n2 = net.minecraft.enchantment.l.K(this);
            this.d(bu.class);
            co co2 = bu.bO();
            if (n2 > 0 && co2 != null) {
                f2 += (float)(n2 * n2 + 1);
            }
        }
        if (this.a(net.minecraft.potion.a.dgy)) {
            f2 *= 1.0f + (float)(this.b(net.minecraft.potion.a.dgy).ajf() + 1) * 0.2f;
        }
        if (this.a(net.minecraft.potion.a.dgz)) {
            float f3 = 1.0f;
            switch (this.b(net.minecraft.potion.a.dgz).ajf()) {
                case 0: {
                    f3 = 0.3f;
                    break;
                }
                case 1: {
                    f3 = 0.09f;
                    break;
                }
                case 2: {
                    f3 = 0.0027f;
                    break;
                }
                default: {
                    f3 = 8.1E-4f;
                }
            }
            f2 *= f3;
        }
        if (this.c(Material.bev) && !net.minecraft.enchantment.l.Q(this)) {
            f2 /= 5.0f;
        }
        if (!this.aO) {
            f2 /= 5.0f;
        }
        return f2;
    }

    public boolean F(Block block) {
        return this.cHV.H(block);
    }

    @Override
    public void e(net.minecraft.nbt.n n2) {
        super.e(n2);
        this.csV = a.e(this.bEH);
        v v2 = n2.D("Inventory", 10);
        this.cHV.b(v2);
        this.cHV.cJE = n2.eG("SelectedItemSlot");
        this.cIk = n2.eO("Sleeping");
        this.cIm = n2.eF("SleepTimer");
        this.cIw = n2.eI("XpP");
        this.cIu = n2.eG("XpLevel");
        this.cIv = n2.eG("XpTotal");
        this.cIx = n2.eG("XpSeed");
        if (this.cIx == 0) {
            this.cIx = this.ta.nextInt();
        }
        this.fC(n2.eG("Score"));
        if (this.cIk) {
            this.cIl = new net.minecraft.util.b(this);
            this.a(true, true, false);
        }
        if (n2.C("SpawnX", 99) && n2.C("SpawnY", 99) && n2.C("SpawnZ", 99)) {
            this.cIq = new net.minecraft.util.b(n2.eG("SpawnX"), n2.eG("SpawnY"), n2.eG("SpawnZ"));
            this.cIr = n2.eO("SpawnForced");
        }
        this.cHZ.E(n2);
        this.cIt.p(n2);
        if (n2.C("EnderItems", 9)) {
            v v3 = n2.D("EnderItems", 10);
            this.cHW.c(v3);
        }
    }

    @Override
    public void d(net.minecraft.nbt.n n2) {
        super.d(n2);
        n2.b("Inventory", this.cHV.a(new v()));
        n2.B("SelectedItemSlot", this.cHV.cJE);
        n2.o("Sleeping", this.cIk);
        n2.a("SleepTimer", (short)this.cIm);
        n2.a("XpP", this.cIw);
        n2.B("XpLevel", this.cIu);
        n2.B("XpTotal", this.cIv);
        n2.B("XpSeed", this.cIx);
        n2.B("Score", this.abM());
        if (this.cIq != null) {
            n2.B("SpawnX", this.cIq.wt());
            n2.B("SpawnY", this.cIq.wu());
            n2.B("SpawnZ", this.cIq.wx());
            n2.o("SpawnForced", this.cIr);
        }
        this.cHZ.F(n2);
        this.cIt.o(n2);
        n2.b("EnderItems", this.cHW.adk());
        co co2 = this.cHV.acE();
        if (co2 != null && co2.bP() != null) {
            n2.b("SelectedItem", co2.t(new net.minecraft.nbt.n()));
        }
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        if (this.cIt.cJJ && !ad2.asd()) {
            return false;
        }
        this.cuM = 0;
        if (this.getHealth() <= 0.0f) {
            return false;
        }
        if (this.Wg() && !this.baU.dDw) {
            this.a(true, true, false);
        }
        if (ad2.asn()) {
            if (this.baU.agm() == net.minecraft.world.f.dBR) {
                f2 = 0.0f;
            }
            if (this.baU.agm() == net.minecraft.world.f.dBS) {
                f2 = f2 / 2.0f + 1.0f;
            }
            if (this.baU.agm() == net.minecraft.world.f.dBU) {
                f2 = f2 * 3.0f / 2.0f;
            }
        }
        if (f2 == 0.0f) {
            return false;
        }
        c c2 = ad2.dk();
        if (c2 instanceof net.minecraft.entity.projectile.a && ((net.minecraft.entity.projectile.a)c2).cJY != null) {
            c2 = ((net.minecraft.entity.projectile.a)c2).cJY;
        }
        return super.a(ad2, f2);
    }

    public boolean D(a a2) {
        l l2 = this.Vw();
        l l3 = a2.Vw();
        return l2 == null || !l2.b(l3) || l2.aku();
    }

    @Override
    protected void aZ(float f2) {
        this.cHV.aZ(f2);
    }

    @Override
    public int VQ() {
        return this.cHV.VQ();
    }

    public float abN() {
        int n2 = 0;
        for (co co2 : this.cHV.cJD) {
            if (co2 == null) continue;
            ++n2;
        }
        return (float)n2 / (float)this.cHV.cJD.length;
    }

    @Override
    protected void b(ad ad2, float f2) {
        if (!this.a(ad2)) {
            if (!ad2.asb() && this.abK() && f2 > 0.0f) {
                f2 = (1.0f + f2) * 0.5f;
            }
            f2 = this.c(ad2, f2);
            float f3 = f2 = this.d(ad2, f2);
            f2 = Math.max(f2 - this.Wi(), 0.0f);
            this.bb(this.Wi() - (f3 - f2));
            if (f2 != 0.0f) {
                this.bs(ad2.asc());
                float f4 = this.getHealth();
                this.aY(this.getHealth() - f2);
                this.VR().a(ad2, f4, f2);
                if (f2 < 3.4028235E37f) {
                    this.a(net.minecraft.stats.n.dpY, Math.round(f2 * 10.0f));
                }
            }
        }
    }

    public void a(ag ag2) {
    }

    public void a(net.minecraft.command.server.e e2) {
    }

    public void a(ae ae2) {
    }

    public void a(ab ab2) {
    }

    public void a(net.minecraft.entity.passive.f f2, ab ab2) {
    }

    public void a(m m2) {
    }

    public void G(co co2) {
    }

    public boolean aq(c c2) {
        co co2;
        if (this.CZ()) {
            if (c2 instanceof ab) {
                this.a((ab)((Object)c2));
            }
            return false;
        }
        co co3 = this.abO();
        co co4 = co2 = co3 != null ? co3.aeg() : null;
        if (!c2.o(this)) {
            if (co3 != null && c2 instanceof r) {
                if (this.cIt.cJM) {
                    co3 = co2;
                }
                if (co3.a(this, (r)c2)) {
                    if (co3.cWZ <= 0 && !this.cIt.cJM) {
                        this.abP();
                    }
                    return true;
                }
            }
            return false;
        }
        if (co3 != null && co3 == this.abO()) {
            if (co3.cWZ <= 0 && !this.cIt.cJM) {
                this.abP();
            } else if (co3.cWZ < co2.cWZ && this.cIt.cJM) {
                co3.cWZ = co2.cWZ;
            }
        }
        return true;
    }

    public co abO() {
        return this.cHV.acE();
    }

    public void abP() {
        this.d(bu.class);
        this.cHV.g(bu.bQ(), null);
    }

    @Override
    public double LJ() {
        return -0.35;
    }

    public void ar(c c2) {
        if (c2.IC() && !c2.X(this)) {
            float f2 = (float)this.a(aj.cwq).XB();
            int n2 = 0;
            float f3 = c2 instanceof r ? net.minecraft.enchantment.l.b(this.Vk(), ((r)c2).VY()) : net.minecraft.enchantment.l.b(this.Vk(), z.cvT);
            n2 += net.minecraft.enchantment.l.I(this);
            if (this.isSprinting()) {
                ++n2;
            }
            if (f2 > 0.0f || f3 > 0.0f) {
                boolean bl2;
                boolean bl3 = bl2 = this.csf > 0.0f && !this.aO && !this.isOnLadder() && !this.isInWater() && !this.a(net.minecraft.potion.a.dgK) && this.crC == null && c2 instanceof r;
                if (bl2 && f2 > 0.0f) {
                    f2 *= 1.5f;
                }
                f2 += f3;
                boolean bl4 = false;
                int n3 = net.minecraft.enchantment.l.J(this);
                if (c2 instanceof r && n3 > 0 && !c2.isBurning()) {
                    bl4 = true;
                    c2.ev(1);
                }
                double d2 = c2.ud;
                double d3 = c2.ue;
                double d4 = c2.uf;
                boolean bl5 = c2.a(ad.L(this), f2);
                if (bl5) {
                    ac ac2;
                    Object object;
                    if (n2 > 0) {
                        c2.N(-bt.bx(this.pp * (float)Math.PI / 180.0f) * (float)n2 * 0.5f, 0.1, bt.bB(this.pp * (float)Math.PI / 180.0f) * (float)n2 * 0.5f);
                        object = new HitSlowDownEvent(0.6, false);
                        Client.a.e().d((di)object);
                        this.ud *= ((HitSlowDownEvent)object).getSlowDown();
                        this.uf *= ((HitSlowDownEvent)object).getSlowDown();
                        this.setSprinting(((HitSlowDownEvent)object).isSprint());
                    }
                    if (c2 instanceof e && c2.crY) {
                        ((e)c2).cIX.B(new net.minecraft.network.play.server.t(c2));
                        c2.crY = false;
                        c2.ud = d2;
                        c2.ue = d3;
                        c2.uf = d4;
                    }
                    if (bl2) {
                        this.E(c2);
                    }
                    if (f3 > 0.0f) {
                        this.F(c2);
                    }
                    if (f2 >= 18.0f) {
                        this.a(net.minecraft.stats.b.dpe);
                    }
                    this.ae(c2);
                    if (c2 instanceof r) {
                        net.minecraft.enchantment.l.a((r)c2, (c)this);
                    }
                    net.minecraft.enchantment.l.b(this, c2);
                    object = this.abO();
                    c c3 = c2;
                    if (c2 instanceof net.minecraft.entity.boss.c && (ac2 = ((net.minecraft.entity.boss.c)c2).cBq) instanceof r) {
                        c3 = (r)((Object)ac2);
                    }
                    if (object != null && c3 instanceof r) {
                        ((co)object).a((r)c3, this);
                        if (((co)object).cWZ <= 0) {
                            this.abP();
                        }
                    }
                    if (c2 instanceof r) {
                        this.a(net.minecraft.stats.n.dpX, Math.round(f2 * 10.0f));
                        if (n3 > 0) {
                            c2.ev(n3 * 4);
                        }
                    }
                    this.bs(0.3f);
                } else if (bl4) {
                    c2.Tx();
                }
            }
        }
    }

    public void E(c c2) {
    }

    public void F(c c2) {
    }

    public void Dp() {
    }

    @Override
    public void Tt() {
        super.Tt();
        this.cHX.E(this);
        if (this.cHY != null) {
            this.cHY.E(this);
        }
    }

    @Override
    public boolean TT() {
        return !this.cIk && super.TT();
    }

    public boolean Dt() {
        return false;
    }

    public GameProfile Ie() {
        return this.bEH;
    }

    public d aj(net.minecraft.util.b b2) {
        if (!this.baU.dDw) {
            if (this.Wg() || !this.TS()) {
                return d.cIS;
            }
            if (!this.baU.dDl.avW()) {
                return d.cIP;
            }
            if (this.baU.avr()) {
                return d.cIQ;
            }
            if (Math.abs(this.gW - (double)b2.wt()) > 3.0 || Math.abs(this.gX - (double)b2.wu()) > 2.0 || Math.abs(this.gY - (double)b2.wx()) > 3.0) {
                return d.cIR;
            }
            double d2 = 8.0;
            double d3 = 5.0;
            List<aa> list = this.baU.a(aa.class, new net.minecraft.util.a((double)b2.wt() - 8.0, (double)b2.wu() - 5.0, (double)b2.wx() - 8.0, (double)b2.wt() + 8.0, (double)b2.wu() + 5.0, (double)b2.wx() + 8.0));
            if (!list.isEmpty()) {
                return d.cIT;
            }
        }
        if (this.isRiding()) {
            this.D((c)null);
        }
        this.o(0.2f, 0.2f);
        if (this.baU.aJ(b2)) {
            net.minecraft.util.ao ao2 = this.baU.L(b2).b(BlockDirectional.aTB);
            float f2 = 0.5f;
            float f3 = 0.5f;
            switch (ao2) {
                case dwt: {
                    f3 = 0.9f;
                    break;
                }
                case dws: {
                    f3 = 0.1f;
                    break;
                }
                case dwu: {
                    f2 = 0.1f;
                    break;
                }
                case dwv: {
                    f2 = 0.9f;
                }
            }
            this.u(ao2);
            this.setPosition((float)b2.wt() + f2, (float)b2.wu() + 0.6875f, (float)b2.wx() + f3);
        } else {
            this.setPosition((float)b2.wt() + 0.5f, (float)b2.wu() + 0.6875f, (float)b2.wx() + 0.5f);
        }
        this.cIk = true;
        this.cIm = 0;
        this.cIl = b2;
        this.ue = 0.0;
        this.uf = 0.0;
        this.ud = 0.0;
        if (!this.baU.dDw) {
            this.baU.avI();
        }
        return d.cIO;
    }

    private void u(net.minecraft.util.ao ao2) {
        this.cIn = 0.0f;
        this.cIp = 0.0f;
        switch (ao2) {
            case dwt: {
                this.cIp = -1.8f;
                break;
            }
            case dws: {
                this.cIp = 1.8f;
                break;
            }
            case dwu: {
                this.cIn = 1.8f;
                break;
            }
            case dwv: {
                this.cIn = -1.8f;
            }
        }
    }

    public void a(boolean bl2, boolean bl3, boolean bl4) {
        this.o(0.6f, 1.8f);
        IBlockState iBlockState = this.baU.L(this.cIl);
        if (this.cIl != null && iBlockState.df() == Blocks.cLE) {
            this.baU.a(this.cIl, iBlockState.a(BlockBed.aTd, false), 4);
            net.minecraft.util.b b2 = BlockBed.b(this.baU, this.cIl, 0);
            if (b2 == null) {
                b2 = this.cIl.aqX();
            }
            this.setPosition((float)b2.wt() + 0.5f, (float)b2.wu() + 0.1f, (float)b2.wx() + 0.5f);
        }
        this.cIk = false;
        if (!this.baU.dDw && bl3) {
            this.baU.avI();
        }
        int n2 = this.cIm = bl2 ? 0 : 100;
        if (bl4) {
            this.a(this.cIl, false);
        }
    }

    private boolean abQ() {
        return this.baU.L(this.cIl).df() == Blocks.cLE;
    }

    public static net.minecraft.util.b c(w w2, net.minecraft.util.b b2, boolean bl2) {
        Block block = w2.L(b2).df();
        if (block != Blocks.cLE) {
            if (!bl2) {
                return null;
            }
            boolean bl3 = block.xz();
            boolean bl4 = w2.L(b2.aqX()).df().xz();
            return bl3 && bl4 ? b2 : null;
        }
        return BlockBed.b(w2, b2, 0);
    }

    public float abR() {
        if (this.cIl != null) {
            net.minecraft.util.ao ao2 = this.baU.L(this.cIl).b(BlockDirectional.aTB);
            switch (ao2) {
                case dwt: {
                    return 90.0f;
                }
                case dws: {
                    return 270.0f;
                }
                case dwu: {
                    return 0.0f;
                }
                case dwv: {
                    return 180.0f;
                }
            }
        }
        return 0.0f;
    }

    @Override
    public boolean Wg() {
        return this.cIk;
    }

    public boolean abS() {
        return this.cIk && this.cIm >= 100;
    }

    public int abT() {
        return this.cIm;
    }

    public void b(ba ba2) {
    }

    public net.minecraft.util.b abU() {
        return this.cIq;
    }

    public boolean abV() {
        return this.cIr;
    }

    public void a(net.minecraft.util.b b2, boolean bl2) {
        if (b2 != null) {
            this.cIq = b2;
            this.cIr = bl2;
        } else {
            this.cIq = null;
            this.cIr = false;
        }
    }

    public void a(net.minecraft.stats.f f2) {
        this.a(f2, 1);
    }

    public void a(net.minecraft.stats.f f2, int n2) {
    }

    public void b(net.minecraft.stats.f f2) {
    }

    @Override
    public void jump() {
        super.jump();
        float f2 = ViaLoadingBase.getInstance().getTargetVersion().getVersion() <= 47 ? 0.8f : 0.2f;
        float f3 = ViaLoadingBase.getInstance().getTargetVersion().getVersion() <= 47 ? 0.2f : 0.05f;
        this.a(net.minecraft.stats.n.dpV);
        if (this.isSprinting()) {
            this.bs(f2);
        } else {
            this.bs(f3);
        }
    }

    @Override
    public void t(float f2, float f3) {
        double d2 = this.gW;
        double d3 = this.gX;
        double d4 = this.gY;
        if (this.cIt.cJK && this.crC == null) {
            double d5 = this.ue;
            float f4 = this.cuI;
            this.cuI = this.cIt.getFlySpeed() * (float)(this.isSprinting() ? 2 : 1);
            super.t(f2, f3);
            this.ue = d5 * 0.6;
            this.cuI = f4;
        } else {
            super.t(f2, f3);
        }
        this.T(this.gW - d2, this.gX - d3, this.gY - d4);
    }

    @Override
    public float Wf() {
        Scaffold scaffold;
        if (this instanceof net.minecraft.client.entity.c && (scaffold = Client.a.g().c(Scaffold.class)) != null && scaffold.isEnabled() && ((Boolean)scaffold.ahc.wD()).booleanValue()) {
            if (Minecraft.getMinecraft().aIY.chs.Re()) {
                return 0.13000001f;
            }
            return 0.1f;
        }
        return (float)this.a(aj.cwp).XB();
    }

    public void T(double d2, double d3, double d4) {
        if (this.crC == null) {
            if (this.c(Material.bev)) {
                int n2 = Math.round(bt.aD(d2 * d2 + d3 * d3 + d4 * d4) * 100.0f);
                if (n2 > 0) {
                    this.a(net.minecraft.stats.n.dpQ, n2);
                    this.bs(0.015f * (float)n2 * 0.01f);
                }
            } else if (this.isInWater()) {
                int n3 = Math.round(bt.aD(d2 * d2 + d4 * d4) * 100.0f);
                if (n3 > 0) {
                    this.a(net.minecraft.stats.n.dpM, n3);
                    this.bs(0.015f * (float)n3 * 0.01f);
                }
            } else if (this.isOnLadder()) {
                if (d3 > 0.0) {
                    this.a(net.minecraft.stats.n.dpO, (int)Math.round(d3 * 100.0));
                }
            } else if (this.aO) {
                int n4 = Math.round(bt.aD(d2 * d2 + d4 * d4) * 100.0f);
                if (n4 > 0) {
                    this.a(net.minecraft.stats.n.dpJ, n4);
                    if (this.isSprinting()) {
                        this.a(net.minecraft.stats.n.dpL, n4);
                        this.bs(0.099999994f * (float)n4 * 0.01f);
                    } else {
                        if (this.isSneaking()) {
                            this.a(net.minecraft.stats.n.dpK, n4);
                        }
                        this.bs(0.01f * (float)n4 * 0.01f);
                    }
                }
            } else {
                int n5 = Math.round(bt.aD(d2 * d2 + d4 * d4) * 100.0f);
                if (n5 > 25) {
                    this.a(net.minecraft.stats.n.dpP, n5);
                }
            }
        }
    }

    private void U(double d2, double d3, double d4) {
        int n2;
        if (this.crC != null && (n2 = Math.round(bt.aD(d2 * d2 + d3 * d3 + d4 * d4) * 100.0f)) > 0) {
            if (this.crC instanceof k) {
                this.a(net.minecraft.stats.n.dpR, n2);
                if (this.cIs == null) {
                    this.cIs = new net.minecraft.util.b(this);
                } else if (this.cIs.am(bt.aF(this.gW), bt.aF(this.gX), bt.aF(this.gY)) >= 1000000.0) {
                    this.a(net.minecraft.stats.b.doP);
                }
            } else if (this.crC instanceof net.minecraft.entity.item.b) {
                this.a(net.minecraft.stats.n.dpS, n2);
            } else if (this.crC instanceof net.minecraft.entity.passive.k) {
                this.a(net.minecraft.stats.n.dpT, n2);
            } else if (this.crC instanceof net.minecraft.entity.passive.f) {
                this.a(net.minecraft.stats.n.dpU, n2);
            }
        }
    }

    @Override
    public void q(float f2, float f3) {
        if (!this.cIt.cJL) {
            if (f2 >= 2.0f) {
                this.a(net.minecraft.stats.n.dpN, (int)Math.round((double)f2 * 100.0));
            }
            super.q(f2, f3);
        }
    }

    @Override
    protected void TI() {
        if (!this.CZ()) {
            super.TI();
        }
    }

    @Override
    protected String eM(int n2) {
        return n2 > 4 ? "game.player.hurt.fall.big" : "game.player.hurt.fall.small";
    }

    @Override
    public void R(r r2) {
        o o2;
        if (r2 instanceof net.minecraft.entity.monster.aw) {
            this.a(net.minecraft.stats.b.doR);
        }
        if ((o2 = n.ctF.get(n.ac(r2))) != null) {
            this.a(o2.ctJ);
        }
    }

    @Override
    public void Ud() {
        if (!this.cIt.cJK) {
            super.Ud();
        }
    }

    @Override
    public co eH(int n2) {
        return this.cHV.fJ(n2);
    }

    public void fE(int n2) {
        this.fD(n2);
        int n3 = Integer.MAX_VALUE - this.cIv;
        if (n2 > n3) {
            n2 = n3;
        }
        this.cIw += (float)n2 / (float)this.abX();
        this.cIv += n2;
        while (this.cIw >= 1.0f) {
            this.cIw = (this.cIw - 1.0f) * (float)this.abX();
            this.fG(1);
            this.cIw /= (float)this.abX();
        }
    }

    public int abW() {
        return this.cIx;
    }

    public void fF(int n2) {
        this.cIu -= n2;
        if (this.cIu < 0) {
            this.cIu = 0;
            this.cIw = 0.0f;
            this.cIv = 0;
        }
        this.cIx = this.ta.nextInt();
    }

    public void fG(int n2) {
        this.cIu += n2;
        if (this.cIu < 0) {
            this.cIu = 0;
            this.cIw = 0.0f;
            this.cIv = 0;
        }
        if (n2 > 0 && this.cIu % 5 == 0 && (float)this.cIC < (float)this.aRg - 100.0f) {
            float f2 = this.cIu > 30 ? 1.0f : (float)this.cIu / 30.0f;
            this.baU.a((c)this, "random.levelup", f2 * 0.75f, 1.0f);
            this.cIC = this.aRg;
        }
    }

    public int abX() {
        return this.cIu >= 30 ? 112 + (this.cIu - 30) * 9 : (this.cIu >= 15 ? 37 + (this.cIu - 15) * 5 : 7 + this.cIu * 2);
    }

    public void bs(float f2) {
        if (!this.cIt.cJJ && !this.baU.dDw) {
            this.cHZ.bs(f2);
        }
    }

    public aw abY() {
        return this.cHZ;
    }

    public boolean bJ(boolean bl2) {
        return (bl2 || this.cHZ.atf()) && !this.cIt.cJJ;
    }

    public boolean abZ() {
        return this.getHealth() > 0.0f && this.getHealth() < this.getMaxHealth();
    }

    public void c(co co2, int n2) {
        if (co2 != this.cIy) {
            this.cIy = co2;
            this.cIz = n2;
            if (!this.baU.dDw) {
                this.aE(true);
            }
        }
    }

    public boolean aca() {
        return this.cIt.cJN;
    }

    public boolean a(net.minecraft.util.b b2, net.minecraft.util.ao ao2, co co2) {
        if (this.cIt.cJN) {
            return true;
        }
        if (co2 == null) {
            return false;
        }
        net.minecraft.util.b b3 = b2.x(ao2.asC());
        Block block = this.baU.L(b3).df();
        return co2.w(block) || co2.aes();
    }

    @Override
    protected int r(a a2) {
        if (this.baU.Si().gw("keepInventory")) {
            return 0;
        }
        int n2 = this.cIu * 7;
        return n2 > 100 ? 100 : n2;
    }

    @Override
    protected boolean isPlayer() {
        return true;
    }

    @Override
    public boolean Up() {
        return true;
    }

    public void b(a a2, boolean bl2) {
        if (bl2) {
            this.cHV.a(a2.cHV);
            this.aY(a2.getHealth());
            this.cHZ = a2.cHZ;
            this.cIu = a2.cIu;
            this.cIv = a2.cIv;
            this.cIw = a2.cIw;
            this.fC(a2.abM());
            this.csR = a2.csR;
            this.csS = a2.csS;
            this.csT = a2.csT;
        } else if (this.baU.Si().gw("keepInventory")) {
            this.cHV.a(a2.cHV);
            this.cIu = a2.cIu;
            this.cIv = a2.cIv;
            this.cIw = a2.cIw;
            this.fC(a2.abM());
        }
        this.cIx = a2.cIx;
        this.cHW = a2.cHW;
        this.Tp().b(10, a2.Tp().el(10));
    }

    @Override
    protected boolean Iz() {
        return !this.cIt.cJK;
    }

    public void Ds() {
    }

    public void a(ao ao2) {
    }

    @Override
    public String xU() {
        return this.bEH.getName();
    }

    public net.minecraft.inventory.ag acb() {
        return this.cHW;
    }

    @Override
    public co eG(int n2) {
        return n2 == 0 ? this.cHV.acE() : this.cHV.cJD[n2 - 1];
    }

    @Override
    public co Vk() {
        return this.cHV.acE();
    }

    @Override
    public void c(int n2, co co2) {
        this.cHV.cJD[n2] = co2;
    }

    @Override
    public boolean p(a a2) {
        if (!this.isInvisible()) {
            return false;
        }
        if (a2.CZ()) {
            return false;
        }
        l l2 = this.Vw();
        return l2 == null || a2 == null || a2.Vw() != l2 || !l2.akv();
    }

    public abstract boolean CZ();

    @Override
    public co[] Ub() {
        return this.cHV.cJD;
    }

    @Override
    public boolean Um() {
        return !this.cIt.cJK;
    }

    public net.minecraft.scoreboard.i acc() {
        return this.baU.SD();
    }

    @Override
    public l Vw() {
        return this.acc().fs(this.xU());
    }

    @Override
    public ba xW() {
        s s2 = new s(h.a(this.Vw(), this.xU()));
        s2.arp().a(new net.minecraft.event.a(net.minecraft.event.b.cKM, "/msg " + this.xU() + " "));
        s2.arp().a(this.Ur());
        s2.arp().gc(this.xU());
        return s2;
    }

    @Override
    public float getEyeHeight() {
        float f2 = 1.62f;
        if (!cl.bN.T(60L)) {
            f2 = (float)((double)1.62f - (this.csi + (this.gX - this.csi) * (double)Minecraft.getMinecraft().bgC.bWY - cl.y));
        }
        if (this.Wg()) {
            f2 = 0.2f;
        }
        if (this.isSneaking() && this.cIF.T(100L)) {
            f2 -= 0.08f;
        }
        return f2;
    }

    @Override
    public void bb(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.Tp().b(17, Float.valueOf(f2));
    }

    @Override
    public float Wi() {
        return this.Tp().eo(17);
    }

    public static UUID e(GameProfile gameProfile) {
        UUID uUID = gameProfile.getId();
        if (uUID == null) {
            uUID = a.el(gameProfile.getName());
        }
        return uUID;
    }

    public static UUID el(String string) {
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + string).getBytes(Charsets.UTF_8));
    }

    public boolean b(q q2) {
        if (q2.isEmpty()) {
            return true;
        }
        co co2 = this.abO();
        return co2 != null && co2.aen() && co2.getDisplayName().equals(q2.avn());
    }

    public boolean c(f f2) {
        return (this.Tp().el(10) & f2.acz()) == f2.acz();
    }

    @Override
    public boolean Sg() {
        return MinecraftServer.afs().dkG[0].Si().gw("sendCommandFeedback");
    }

    @Override
    public boolean f(int n2, co co2) {
        if (n2 >= 0 && n2 < this.cHV.cJC.length) {
            this.cHV.g(n2, co2);
            return true;
        }
        int n3 = n2 - 100;
        if (n3 >= 0 && n3 < this.cHV.cJD.length) {
            int n4 = n3 + 1;
            if (co2 != null && co2.bP() != null && (co2.bP() instanceof y ? p.W(co2) != n4 : n4 != 4 || co2.bP() != Items.cSb && !(co2.bP() instanceof af))) {
                return false;
            }
            this.cHV.g(n3 + this.cHV.cJC.length, co2);
            return true;
        }
        int n5 = n2 - 200;
        if (n5 >= 0 && n5 < this.cHW.YI()) {
            this.cHW.g(n5, co2);
            return true;
        }
        return false;
    }

    public boolean acd() {
        return this.cID;
    }

    public void bK(boolean bl2) {
        this.cID = bl2;
    }
}

