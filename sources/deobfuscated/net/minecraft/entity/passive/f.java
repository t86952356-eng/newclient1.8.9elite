/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.passive;

import com.google.common.base.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.Block$SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.ab;
import net.minecraft.entity.ai.aa;
import net.minecraft.entity.ai.ao;
import net.minecraft.entity.ai.as;
import net.minecraft.entity.ai.attributes.d;
import net.minecraft.entity.ai.au;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.t;
import net.minecraft.entity.ai.z;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.b;
import net.minecraft.entity.passive.g;
import net.minecraft.entity.passive.h;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.potion.a;
import net.minecraft.server.management.PreYggdrasilConverter;
import net.minecraft.util.ad;
import net.minecraft.util.bt;
import net.minecraft.util.cr;
import net.minecraft.world.e;
import net.minecraft.world.w;

public class f
extends b
implements net.minecraft.inventory.aa {
    private static final Predicate<c> cFK = new g();
    private static final d cFL = new net.minecraft.entity.ai.attributes.g(null, "horse.jumpStrength", 0.7, 0.0, 2.0).eg("Jump Strength").aN(true);
    private static final String[] cFM = new String[]{null, "textures/entity/horse/armor/horse_armor_iron.png", "textures/entity/horse/armor/horse_armor_gold.png", "textures/entity/horse/armor/horse_armor_diamond.png"};
    private static final String[] cFN = new String[]{"", "meo", "goo", "dio"};
    private static final int[] cFO = new int[]{0, 5, 7, 11};
    private static final String[] cFP = new String[]{"textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png"};
    private static final String[] cFQ = new String[]{"hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb"};
    private static final String[] cFR = new String[]{null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png"};
    private static final String[] cFS = new String[]{"", "wo_", "wmo", "wdo", "bdo"};
    private int cFT;
    private int cFU;
    private int cFV;
    public int cFW;
    public int cFX;
    protected boolean cFY;
    private net.minecraft.inventory.a cFZ;
    private boolean cGa;
    protected int cGb;
    protected float cGc;
    private boolean cGd;
    private float cGe;
    private float cGf;
    private float cGg;
    private float cGh;
    private float cGi;
    private float cGj;
    private int cGk;
    private String cGl;
    private final String[] cGm = new String[3];
    private boolean cGn = false;

    public f(w w2) {
        super(w2);
        this.o(1.4f, 1.6f);
        this.csC = false;
        this.bs(false);
        ((net.minecraft.pathfinding.f)this.UU()).bQ(true);
        this.ctS.a(0, new au(this));
        this.ctS.a(1, new ao(this, 1.2));
        this.ctS.a(1, new as(this, 1.2));
        this.ctS.a(2, new aa(this, 1.0));
        this.ctS.a(4, new t(this, 1.0));
        this.ctS.a(6, new bd(this, 0.7));
        this.ctS.a(7, new be(this, net.minecraft.entity.player.a.class, 6.0f));
        this.ctS.a(8, new z(this));
        this.aap();
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, 0);
        this.csD.a(19, (byte)0);
        this.csD.a(20, 0);
        this.csD.a(21, String.valueOf(""));
        this.csD.a(22, 0);
    }

    public void fs(int n2) {
        this.csD.b(19, (byte)n2);
        this.aaw();
    }

    public int ZX() {
        return this.csD.el(19);
    }

    public void ft(int n2) {
        this.csD.b(20, n2);
        this.aaw();
    }

    public int ZY() {
        return this.csD.en(20);
    }

    @Override
    public String xU() {
        if (this.xV()) {
            return this.Un();
        }
        int n2 = this.ZX();
        switch (n2) {
            default: {
                return cr.gm("entity.horse.name");
            }
            case 1: {
                return cr.gm("entity.donkey.name");
            }
            case 2: {
                return cr.gm("entity.mule.name");
            }
            case 3: {
                return cr.gm("entity.zombiehorse.name");
            }
            case 4: 
        }
        return cr.gm("entity.skeletonhorse.name");
    }

    private boolean fu(int n2) {
        return (this.csD.en(16) & n2) != 0;
    }

    private void p(int n2, boolean bl2) {
        int n3 = this.csD.en(16);
        if (bl2) {
            this.csD.b(16, n3 | n2);
        } else {
            this.csD.b(16, n3 & ~n2);
        }
    }

    public boolean ZZ() {
        return !this.Uz();
    }

    public boolean aaa() {
        return this.fu(2);
    }

    public boolean aab() {
        return this.ZZ();
    }

    public String Wz() {
        return this.csD.ep(21);
    }

    public void ek(String string) {
        this.csD.b(21, string);
    }

    public float aac() {
        return 0.5f;
    }

    @Override
    public void aH(boolean bl2) {
        if (bl2) {
            this.aU(this.aac());
        } else {
            this.aU(1.0f);
        }
    }

    public boolean aad() {
        return this.cFY;
    }

    public void bp(boolean bl2) {
        this.p(2, bl2);
    }

    public void bq(boolean bl2) {
        this.cFY = bl2;
    }

    @Override
    public boolean Vp() {
        return !this.aaD() && super.Vp();
    }

    @Override
    protected void aV(float f2) {
        if (f2 > 6.0f && this.aag()) {
            this.bv(false);
        }
    }

    public boolean aae() {
        return this.fu(8);
    }

    public int aaf() {
        return this.csD.en(22);
    }

    private int ad(co co2) {
        if (co2 == null) {
            return 0;
        }
        net.minecraft.item.d d2 = co2.bP();
        return d2 == Items.cSo ? 1 : (d2 == Items.cSp ? 2 : (d2 == Items.cSq ? 3 : 0));
    }

    public boolean aag() {
        return this.fu(32);
    }

    public boolean aah() {
        return this.fu(64);
    }

    public boolean aai() {
        return this.fu(16);
    }

    public boolean aaj() {
        return this.cGa;
    }

    public void ae(co co2) {
        this.csD.b(22, this.ad(co2));
        this.aaw();
    }

    public void br(boolean bl2) {
        this.p(16, bl2);
    }

    public void bs(boolean bl2) {
        this.p(8, bl2);
    }

    public void bt(boolean bl2) {
        this.cGa = bl2;
    }

    public void bu(boolean bl2) {
        this.p(4, bl2);
    }

    public int aak() {
        return this.cGb;
    }

    public void fv(int n2) {
        this.cGb = n2;
    }

    public int fw(int n2) {
        int n3 = bt.F(this.aak() + n2, 0, this.aau());
        this.fv(n3);
        return n3;
    }

    @Override
    public boolean a(ad ad2, float f2) {
        c c2 = ad2.dk();
        return (this.crA == null || !this.crA.equals(c2)) && super.a(ad2, f2);
    }

    @Override
    public int VQ() {
        return cFO[this.aaf()];
    }

    @Override
    public boolean IE() {
        return this.crA == null;
    }

    public boolean aal() {
        int n2 = bt.aF(this.gW);
        int n3 = bt.aF(this.gY);
        this.baU.aF(new net.minecraft.util.b(n2, 0, n3));
        return true;
    }

    public void aam() {
        if (!this.baU.dDw && this.aae()) {
            this.d(net.minecraft.item.d.I(Blocks.cMg), 1);
            this.bs(false);
        }
    }

    private void aan() {
        this.aaG();
        if (!this.TE()) {
            this.baU.a(this, "eating", 1.0f, 1.0f + (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f);
        }
    }

    @Override
    public void q(float f2, float f3) {
        int n2;
        if (f2 > 1.0f) {
            this.a("mob.horse.land", 0.4f, 1.0f);
        }
        if ((n2 = bt.bM((f2 * 0.5f - 3.0f) * f3)) > 0) {
            Block block;
            this.a(ad.dvj, (float)n2);
            if (this.crA != null) {
                this.crA.a(ad.dvj, (float)n2);
            }
            if ((block = this.baU.L(new net.minecraft.util.b(this.gW, this.gX - 0.2 - (double)this.crM, this.gY)).df()).xb() != Material.beo && !this.TE()) {
                Block$SoundType block$SoundType = block.aSB;
                this.baU.a(this, block$SoundType.xR(), block$SoundType.getVolume() * 0.5f, block$SoundType.xT() * 0.75f);
            }
        }
    }

    private int aao() {
        int n2 = this.ZX();
        return !this.aae() || n2 != 1 && n2 != 2 ? 2 : 17;
    }

    private void aap() {
        net.minecraft.inventory.a a2 = this.cFZ;
        this.cFZ = new net.minecraft.inventory.a("HorseChest", this.aao());
        this.cFZ.es(this.xU());
        if (a2 != null) {
            a2.b(this);
            int n2 = Math.min(a2.YI(), this.cFZ.YI());
            for (int i2 = 0; i2 < n2; ++i2) {
                co co2 = a2.fi(i2);
                if (co2 == null) continue;
                this.cFZ.g(i2, co2.aeg());
            }
        }
        this.cFZ.a(this);
        this.aaq();
    }

    private void aaq() {
        if (!this.baU.dDw) {
            this.bu(this.cFZ.fi(0) != null);
            if (this.aaB()) {
                this.ae(this.cFZ.fi(1));
            }
        }
    }

    @Override
    public void a(net.minecraft.inventory.ad ad2) {
        int n2 = this.aaf();
        boolean bl2 = this.aas();
        this.aaq();
        if (this.aRg > 20) {
            if (n2 == 0 && n2 != this.aaf()) {
                this.a("mob.horse.armor", 0.5f, 1.0f);
            } else if (n2 != this.aaf()) {
                this.a("mob.horse.armor", 0.5f, 1.0f);
            }
            if (!bl2 && this.aas()) {
                this.a("mob.horse.leather", 0.5f, 1.0f);
            }
        }
    }

    @Override
    public boolean UB() {
        this.aal();
        return super.UB();
    }

    protected f d(c c2, double d2) {
        double d3 = Double.MAX_VALUE;
        c c3 = null;
        for (c c4 : this.baU.a(c2, c2.Us().ac(d2, d2, d2), cFK)) {
            double d4 = c4.M(c2.gW, c2.gX, c2.gY);
            if (!(d4 < d3)) continue;
            c3 = c4;
            d3 = d4;
        }
        return (f)c3;
    }

    public double aar() {
        return this.a(cFL).XB();
    }

    @Override
    protected String VO() {
        this.aaG();
        int n2 = this.ZX();
        return n2 == 3 ? "mob.horse.zombie.death" : (n2 == 4 ? "mob.horse.skeleton.death" : (n2 != 1 && n2 != 2 ? "mob.horse.death" : "mob.horse.donkey.death"));
    }

    @Override
    protected net.minecraft.item.d Vc() {
        boolean bl2 = this.ta.nextInt(4) == 0;
        int n2 = this.ZX();
        return n2 == 4 ? Items.cRb : (n2 == 3 ? (bl2 ? null : Items.cRx) : Items.cQJ);
    }

    @Override
    protected String VN() {
        int n2;
        this.aaG();
        if (this.ta.nextInt(3) == 0) {
            this.aaI();
        }
        return (n2 = this.ZX()) == 3 ? "mob.horse.zombie.hit" : (n2 == 4 ? "mob.horse.skeleton.hit" : (n2 != 1 && n2 != 2 ? "mob.horse.hit" : "mob.horse.donkey.hit"));
    }

    public boolean aas() {
        return this.fu(4);
    }

    @Override
    protected String Vb() {
        int n2;
        this.aaG();
        if (this.ta.nextInt(10) == 0 && !this.Wb()) {
            this.aaI();
        }
        return (n2 = this.ZX()) == 3 ? "mob.horse.zombie.idle" : (n2 == 4 ? "mob.horse.skeleton.idle" : (n2 != 1 && n2 != 2 ? "mob.horse.idle" : "mob.horse.donkey.idle"));
    }

    protected String aat() {
        this.aaG();
        this.aaI();
        int n2 = this.ZX();
        return n2 != 3 && n2 != 4 ? (n2 != 1 && n2 != 2 ? "mob.horse.angry" : "mob.horse.donkey.angry") : null;
    }

    @Override
    protected void a(net.minecraft.util.b b2, Block block) {
        Block$SoundType block$SoundType = block.aSB;
        if (this.baU.L(b2.aqX()).df() == Blocks.cMJ) {
            block$SoundType = Blocks.cMJ.aSB;
        }
        if (!block.xb().zv()) {
            int n2 = this.ZX();
            if (this.crA != null && n2 != 1 && n2 != 2) {
                ++this.cGk;
                if (this.cGk > 5 && this.cGk % 3 == 0) {
                    this.a("mob.horse.gallop", block$SoundType.getVolume() * 0.15f, block$SoundType.xT());
                    if (n2 == 0 && this.ta.nextInt(10) == 0) {
                        this.a("mob.horse.breathe", block$SoundType.getVolume() * 0.6f, block$SoundType.xT());
                    }
                } else if (this.cGk <= 5) {
                    this.a("mob.horse.wood", block$SoundType.getVolume() * 0.15f, block$SoundType.xT());
                }
            } else if (block$SoundType == Block.aRZ) {
                this.a("mob.horse.wood", block$SoundType.getVolume() * 0.15f, block$SoundType.xT());
            } else {
                this.a("mob.horse.soft", block$SoundType.getVolume() * 0.15f, block$SoundType.xT());
            }
        }
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.VX().c(cFL);
        this.a(aj.cwm).ap(53.0);
        this.a(aj.cwp).ap(0.225f);
    }

    @Override
    public int Vj() {
        return 6;
    }

    public int aau() {
        return 100;
    }

    @Override
    protected float VZ() {
        return 0.8f;
    }

    @Override
    public int UY() {
        return 400;
    }

    public boolean aav() {
        return this.ZX() == 0 || this.aaf() > 0;
    }

    private void aaw() {
        this.cGl = null;
    }

    public boolean aax() {
        return this.cGn;
    }

    private void aay() {
        int n2;
        this.cGl = "horse/";
        this.cGm[0] = null;
        this.cGm[1] = null;
        this.cGm[2] = null;
        int n3 = this.ZX();
        int n4 = this.ZY();
        if (n3 == 0) {
            n2 = n4 & 0xFF;
            int n5 = (n4 & 0xFF00) >> 8;
            if (n2 >= cFP.length) {
                this.cGn = false;
                return;
            }
            this.cGm[0] = cFP[n2];
            this.cGl = this.cGl + cFQ[n2];
            if (n5 >= cFR.length) {
                this.cGn = false;
                return;
            }
            this.cGm[1] = cFR[n5];
            this.cGl = this.cGl + cFS[n5];
        } else {
            this.cGm[0] = "";
            this.cGl = this.cGl + "_" + n3 + "_";
        }
        n2 = this.aaf();
        if (n2 >= cFM.length) {
            this.cGn = false;
        } else {
            this.cGm[2] = cFM[n2];
            this.cGl = this.cGl + cFN[n2];
            this.cGn = true;
        }
    }

    public String aaz() {
        if (this.cGl == null) {
            this.aay();
        }
        return this.cGl;
    }

    public String[] aaA() {
        if (this.cGl == null) {
            this.aay();
        }
        return this.cGm;
    }

    public void A(net.minecraft.entity.player.a a2) {
        if (!this.baU.dDw && (this.crA == null || this.crA == a2) && this.aaa()) {
            this.cFZ.es(this.xU());
            a2.a(this, this.cFZ);
        }
    }

    @Override
    public boolean q(net.minecraft.entity.player.a a2) {
        co co2 = a2.cHV.acE();
        if (co2 != null && co2.bP() == Items.cRN) {
            return super.q(a2);
        }
        if (!this.aaa() && this.aaD()) {
            return false;
        }
        if (this.aaa() && this.ZZ() && a2.isSneaking()) {
            this.A(a2);
            return true;
        }
        if (this.aab() && this.crA != null) {
            return super.q(a2);
        }
        if (co2 != null) {
            boolean bl2 = false;
            if (this.aaB()) {
                int n2 = -1;
                if (co2.bP() == Items.cSo) {
                    n2 = 1;
                } else if (co2.bP() == Items.cSp) {
                    n2 = 2;
                } else if (co2.bP() == Items.cSq) {
                    n2 = 3;
                }
                if (n2 >= 0) {
                    if (!this.aaa()) {
                        this.aaJ();
                        return true;
                    }
                    this.A(a2);
                    return true;
                }
            }
            if (!bl2 && !this.aaD()) {
                float f2 = 0.0f;
                int n3 = 0;
                int n4 = 0;
                if (co2.bP() == Items.cPS) {
                    f2 = 2.0f;
                    n3 = 20;
                    n4 = 3;
                } else if (co2.bP() == Items.cRc) {
                    f2 = 1.0f;
                    n3 = 30;
                    n4 = 3;
                } else if (Block.f(co2.bP()) == Blocks.cOz) {
                    f2 = 20.0f;
                    n3 = 180;
                } else if (co2.bP() == Items.cPi) {
                    f2 = 3.0f;
                    n3 = 60;
                    n4 = 3;
                } else if (co2.bP() == Items.cSa) {
                    f2 = 4.0f;
                    n3 = 60;
                    n4 = 5;
                    if (this.aaa() && this.Ux() == 0) {
                        bl2 = true;
                        this.z(a2);
                    }
                } else if (co2.bP() == Items.cQs) {
                    f2 = 10.0f;
                    n3 = 240;
                    n4 = 10;
                    if (this.aaa() && this.Ux() == 0) {
                        bl2 = true;
                        this.z(a2);
                    }
                }
                if (this.getHealth() < this.getMaxHealth() && f2 > 0.0f) {
                    this.P(f2);
                    bl2 = true;
                }
                if (!this.ZZ() && n3 > 0) {
                    this.eB(n3);
                    bl2 = true;
                }
                if (n4 > 0 && (bl2 || !this.aaa()) && n4 < this.aau()) {
                    bl2 = true;
                    this.fw(n4);
                }
                if (bl2) {
                    this.aan();
                }
            }
            if (!this.aaa() && !bl2) {
                if (co2 != null && co2.a(a2, this)) {
                    return true;
                }
                this.aaJ();
                return true;
            }
            if (!bl2 && this.aaC() && !this.aae() && co2.bP() == net.minecraft.item.d.I(Blocks.cMg)) {
                this.bs(true);
                this.a("mob.chickenplop", 1.0f, (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f + 1.0f);
                bl2 = true;
                this.aap();
            }
            if (!bl2 && this.aab() && !this.aas() && co2.bP() == Items.cQE) {
                this.A(a2);
                return true;
            }
            if (bl2) {
                if (!a2.cIt.cJM && --co2.cWZ == 0) {
                    a2.cHV.g(a2.cHV.cJE, null);
                }
                return true;
            }
        }
        if (this.aab() && this.crA == null) {
            if (co2 != null && co2.a(a2, this)) {
                return true;
            }
            this.B(a2);
            return true;
        }
        return super.q(a2);
    }

    private void B(net.minecraft.entity.player.a a2) {
        a2.pl = this.pl;
        a2.pm = this.pm;
        this.bv(false);
        this.bw(false);
        if (!this.baU.dDw) {
            a2.D(this);
        }
    }

    public boolean aaB() {
        return this.ZX() == 0;
    }

    public boolean aaC() {
        int n2 = this.ZX();
        return n2 == 2 || n2 == 1;
    }

    @Override
    protected boolean Wb() {
        return this.crA != null && this.aas() || this.aag() || this.aah();
    }

    public boolean aaD() {
        int n2 = this.ZX();
        return n2 == 3 || n2 == 4;
    }

    public boolean aaE() {
        return this.aaD() || this.ZX() == 2;
    }

    @Override
    public boolean ac(co co2) {
        return false;
    }

    private void aaF() {
        this.cFW = 1;
    }

    @Override
    public void b(ad ad2) {
        super.b(ad2);
        if (!this.baU.dDw) {
            this.aaK();
        }
    }

    @Override
    public void Dn() {
        if (this.ta.nextInt(200) == 0) {
            this.aaF();
        }
        super.Dn();
        if (!this.baU.dDw) {
            f f2;
            if (this.ta.nextInt(900) == 0 && this.cuv == 0) {
                this.P(1.0f);
            }
            if (!this.aag() && this.crA == null && this.ta.nextInt(300) == 0 && this.baU.L(new net.minecraft.util.b(bt.aF(this.gW), bt.aF(this.gX) - 1, bt.aF(this.gY))).df() == Blocks.cLe) {
                this.bv(true);
            }
            if (this.aag() && ++this.cFT > 50) {
                this.cFT = 0;
                this.bv(false);
            }
            if (this.aai() && !this.ZZ() && !this.aag() && (f2 = this.d(this, 16.0)) != null && this.T((c)f2) > 4.0) {
                this.ctR.au(f2);
            }
        }
    }

    @Override
    public void Dm() {
        super.Dm();
        if (this.baU.dDw && this.csD.Tg()) {
            this.csD.Tk();
            this.aaw();
        }
        if (this.cFU > 0 && ++this.cFU > 30) {
            this.cFU = 0;
            this.p(128, false);
        }
        if (!this.baU.dDw && this.cFV > 0 && ++this.cFV > 20) {
            this.cFV = 0;
            this.bw(false);
        }
        if (this.cFW > 0 && ++this.cFW > 8) {
            this.cFW = 0;
        }
        if (this.cFX > 0) {
            ++this.cFX;
            if (this.cFX > 300) {
                this.cFX = 0;
            }
        }
        this.cGf = this.cGe;
        if (this.aag()) {
            this.cGe += (1.0f - this.cGe) * 0.4f + 0.05f;
            if (this.cGe > 1.0f) {
                this.cGe = 1.0f;
            }
        } else {
            this.cGe += (0.0f - this.cGe) * 0.4f - 0.05f;
            if (this.cGe < 0.0f) {
                this.cGe = 0.0f;
            }
        }
        this.cGh = this.cGg;
        if (this.aah()) {
            this.cGe = 0.0f;
            this.cGf = 0.0f;
            this.cGg += (1.0f - this.cGg) * 0.4f + 0.05f;
            if (this.cGg > 1.0f) {
                this.cGg = 1.0f;
            }
        } else {
            this.cGd = false;
            this.cGg += (0.8f * this.cGg * this.cGg * this.cGg - this.cGg) * 0.6f - 0.05f;
            if (this.cGg < 0.0f) {
                this.cGg = 0.0f;
            }
        }
        this.cGj = this.cGi;
        if (this.fu(128)) {
            this.cGi += (1.0f - this.cGi) * 0.7f + 0.05f;
            if (this.cGi > 1.0f) {
                this.cGi = 1.0f;
            }
        } else {
            this.cGi += (0.0f - this.cGi) * 0.7f - 0.05f;
            if (this.cGi < 0.0f) {
                this.cGi = 0.0f;
            }
        }
    }

    private void aaG() {
        if (!this.baU.dDw) {
            this.cFU = 1;
            this.p(128, true);
        }
    }

    private boolean aaH() {
        return this.crA == null && this.crC == null && this.aaa() && this.ZZ() && !this.aaE() && this.getHealth() >= this.getMaxHealth() && this.ZT();
    }

    @Override
    public void aE(boolean bl2) {
        this.p(32, bl2);
    }

    public void bv(boolean bl2) {
        this.aE(bl2);
    }

    public void bw(boolean bl2) {
        if (bl2) {
            this.bv(false);
        }
        this.p(64, bl2);
    }

    private void aaI() {
        if (!this.baU.dDw) {
            this.cFV = 1;
            this.bw(true);
        }
    }

    public void aaJ() {
        this.aaI();
        String string = this.aat();
        if (string != null) {
            this.a(string, this.VZ(), this.Wa());
        }
    }

    public void aaK() {
        this.a((c)this, this.cFZ);
        this.aam();
    }

    private void a(c c2, net.minecraft.inventory.a a2) {
        if (a2 != null && !this.baU.dDw) {
            for (int i2 = 0; i2 < a2.YI(); ++i2) {
                co co2 = a2.fi(i2);
                if (co2 == null) continue;
                this.a(co2, 0.0f);
            }
        }
    }

    public boolean C(net.minecraft.entity.player.a a2) {
        this.ek(a2.Ul().toString());
        this.bp(true);
        return true;
    }

    @Override
    public void t(float f2, float f3) {
        if (this.crA != null && this.crA instanceof r && this.aas()) {
            this.crM = this.pl = this.crA.pl;
            this.pm = this.crA.pm * 0.5f;
            this.setRotation(this.pl, this.pm);
            this.pn = this.cuF = this.pl;
            f2 = ((r)this.crA).cuV * 0.5f;
            f3 = ((r)this.crA).cuW;
            if (f3 <= 0.0f) {
                f3 *= 0.25f;
                this.cGk = 0;
            }
            if (this.aO && this.cGc == 0.0f && this.aah() && !this.cGd) {
                f2 = 0.0f;
                f3 = 0.0f;
            }
            if (this.cGc > 0.0f && !this.aad() && this.aO) {
                this.ue = this.aar() * (double)this.cGc;
                if (this.a(a.dgD)) {
                    this.ue += (double)((float)(this.b(a.dgD).ajf() + 1) * 0.1f);
                }
                this.bq(true);
                this.csL = true;
                if (f3 > 0.0f) {
                    float f4 = bt.bx(this.pl * (float)Math.PI / 180.0f);
                    float f5 = bt.bB(this.pl * (float)Math.PI / 180.0f);
                    this.ud += (double)(-0.4f * f4 * this.cGc);
                    this.uf += (double)(0.4f * f5 * this.cGc);
                    this.a("mob.horse.jump", 0.4f, 1.0f);
                }
                this.cGc = 0.0f;
            }
            this.cso = 1.0f;
            this.cuI = this.Wf() * 0.1f;
            if (!this.baU.dDw) {
                this.aX((float)this.a(aj.cwp).XB());
                super.t(f2, f3);
            }
            if (this.aO) {
                this.cGc = 0.0f;
                this.bq(false);
            }
            this.cux = this.cuy;
            double d2 = this.gW - this.crF;
            double d3 = this.gY - this.crH;
            float f6 = bt.aD(d2 * d2 + d3 * d3) * 4.0f;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            this.cuy += (f6 - this.cuy) * 0.4f;
            this.cuz += this.cuy;
        } else {
            this.cso = 0.5f;
            this.cuI = 0.02f;
            super.t(f2, f3);
        }
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.o("EatingHaystack", this.aag());
        n2.o("ChestedHorse", this.aae());
        n2.o("HasReproduced", this.aaj());
        n2.o("Bred", this.aai());
        n2.B("Type", this.ZX());
        n2.B("Variant", this.ZY());
        n2.B("Temper", this.aak());
        n2.o("Tame", this.aaa());
        n2.R("OwnerUUID", this.Wz());
        if (this.aae()) {
            v v2 = new v();
            for (int i2 = 2; i2 < this.cFZ.YI(); ++i2) {
                co co2 = this.cFZ.fi(i2);
                if (co2 == null) continue;
                n n3 = new n();
                n3.a("Slot", (byte)i2);
                co2.t(n3);
                v2.a(n3);
            }
            n2.b("Items", v2);
        }
        if (this.cFZ.fi(1) != null) {
            n2.b("ArmorItem", this.cFZ.fi(1).t(new n()));
        }
        if (this.cFZ.fi(0) != null) {
            n2.b("SaddleItem", this.cFZ.fi(0).t(new n()));
        }
    }

    @Override
    public void e(n n2) {
        Object object;
        Object object2;
        super.e(n2);
        this.bv(n2.eO("EatingHaystack"));
        this.br(n2.eO("Bred"));
        this.bs(n2.eO("ChestedHorse"));
        this.bt(n2.eO("HasReproduced"));
        this.fs(n2.eG("Type"));
        this.ft(n2.eG("Variant"));
        this.fv(n2.eG("Temper"));
        this.bp(n2.eO("Tame"));
        String string = "";
        if (n2.C("OwnerUUID", 8)) {
            string = n2.eK("OwnerUUID");
        } else {
            object2 = n2.eK("Owner");
            string = PreYggdrasilConverter.fF((String)object2);
        }
        if (string.length() > 0) {
            this.ek(string);
        }
        if ((object2 = this.VX().ef("Speed")) != null) {
            this.a(aj.cwp).ap(object2.Xy() * 0.25);
        }
        if (this.aae()) {
            object = n2.D("Items", 10);
            this.aap();
            for (int i2 = 0; i2 < ((v)object).aeS(); ++i2) {
                n n3 = ((v)object).gi(i2);
                int n4 = n3.eE("Slot") & 0xFF;
                if (n4 < 2 || n4 >= this.cFZ.YI()) continue;
                this.cFZ.g(n4, co.s(n3));
            }
        }
        if (n2.C("ArmorItem", 10) && (object = co.s(n2.eN("ArmorItem"))) != null && f.j(((co)object).bP())) {
            this.cFZ.g(1, (co)object);
        }
        if (n2.C("SaddleItem", 10)) {
            object = co.s(n2.eN("SaddleItem"));
            if (object != null && ((co)object).bP() == Items.cQE) {
                this.cFZ.g(0, (co)object);
            }
        } else if (n2.eO("Saddle")) {
            this.cFZ.g(0, new co(Items.cQE));
        }
        this.aaq();
    }

    @Override
    public boolean a(b b2) {
        if (b2 == this) {
            return false;
        }
        if (b2.getClass() != this.getClass()) {
            return false;
        }
        f f2 = (f)b2;
        if (this.aaH() && f2.aaH()) {
            int n2;
            int n3 = this.ZX();
            return n3 == (n2 = f2.ZX()) || n3 == 0 && n2 == 1 || n3 == 1 && n2 == 0;
        }
        return false;
    }

    @Override
    public net.minecraft.entity.h a(net.minecraft.entity.h h2) {
        f f2 = (f)h2;
        f f3 = new f(this.baU);
        int n2 = this.ZX();
        int n3 = f2.ZX();
        int n4 = 0;
        if (n2 == n3) {
            n4 = n2;
        } else if (n2 == 0 && n3 == 1 || n2 == 1 && n3 == 0) {
            n4 = 2;
        }
        if (n4 == 0) {
            int n5 = this.ta.nextInt(9);
            int n6 = n5 < 4 ? this.ZY() & 0xFF : (n5 < 8 ? f2.ZY() & 0xFF : this.ta.nextInt(7));
            int n7 = this.ta.nextInt(5);
            n6 = n7 < 2 ? (n6 |= this.ZY() & 0xFF00) : (n7 < 4 ? (n6 |= f2.ZY() & 0xFF00) : (n6 |= this.ta.nextInt(5) << 8 & 0xFF00));
            f3.ft(n6);
        }
        f3.fs(n4);
        double d2 = this.a(aj.cwm).Xy() + h2.a(aj.cwm).Xy() + (double)this.aaL();
        f3.a(aj.cwm).ap(d2 / 3.0);
        double d3 = this.a(cFL).Xy() + h2.a(cFL).Xy() + this.aaM();
        f3.a(cFL).ap(d3 / 3.0);
        double d4 = this.a(aj.cwp).Xy() + h2.a(aj.cwp).Xy() + this.aaN();
        f3.a(aj.cwp).ap(d4 / 3.0);
        return f3;
    }

    @Override
    public ab a(e e2, ab ab2) {
        ab2 = super.a(e2, ab2);
        int n2 = 0;
        int n3 = 0;
        if (ab2 instanceof h) {
            n2 = ((h)ab2).cGo;
            n3 = ((h)ab2).cGp & 0xFF | this.ta.nextInt(5) << 8;
        } else {
            if (this.ta.nextInt(10) == 0) {
                n2 = 1;
            } else {
                int n4 = this.ta.nextInt(7);
                int n5 = this.ta.nextInt(5);
                n2 = 0;
                n3 = n4 | n5 << 8;
            }
            ab2 = new h(n2, n3);
        }
        this.fs(n2);
        this.ft(n3);
        if (this.ta.nextInt(5) == 0) {
            this.eC(-24000);
        }
        if (n2 != 4 && n2 != 3) {
            this.a(aj.cwm).ap(this.aaL());
            if (n2 == 0) {
                this.a(aj.cwp).ap(this.aaN());
            } else {
                this.a(aj.cwp).ap(0.175f);
            }
        } else {
            this.a(aj.cwm).ap(15.0);
            this.a(aj.cwp).ap(0.2f);
        }
        if (n2 != 2 && n2 != 1) {
            this.a(cFL).ap(this.aaM());
        } else {
            this.a(cFL).ap(0.5);
        }
        this.aY(this.getMaxHealth());
        return ab2;
    }

    public float bk(float f2) {
        return this.cGf + (this.cGe - this.cGf) * f2;
    }

    public float bl(float f2) {
        return this.cGh + (this.cGg - this.cGh) * f2;
    }

    public float bm(float f2) {
        return this.cGj + (this.cGi - this.cGj) * f2;
    }

    public void fx(int n2) {
        if (this.aas()) {
            if (n2 < 0) {
                n2 = 0;
            } else {
                this.cGd = true;
                this.aaI();
            }
            this.cGc = n2 >= 90 ? 1.0f : 0.4f + 0.4f * (float)n2 / 90.0f;
        }
    }

    protected void bx(boolean bl2) {
        net.minecraft.util.as as2 = bl2 ? net.minecraft.util.as.dxE : net.minecraft.util.as.dxh;
        for (int i2 = 0; i2 < 7; ++i2) {
            double d2 = this.ta.nextGaussian() * 0.02;
            double d3 = this.ta.nextGaussian() * 0.02;
            double d4 = this.ta.nextGaussian() * 0.02;
            this.baU.a(as2, this.gW + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, this.gX + 0.5 + (double)(this.ta.nextFloat() * this.height), this.gY + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, d2, d3, d4, new int[0]);
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 7) {
            this.bx(true);
        } else if (by2 == 6) {
            this.bx(false);
        } else {
            super.a(by2);
        }
    }

    @Override
    public void TV() {
        super.TV();
        if (this.cGh > 0.0f) {
            float f2 = bt.bx(this.cuF * (float)Math.PI / 180.0f);
            float f3 = bt.bB(this.cuF * (float)Math.PI / 180.0f);
            float f4 = 0.7f * this.cGh;
            float f5 = 0.15f * this.cGh;
            this.crA.setPosition(this.gW + (double)(f4 * f2), this.gX + this.TW() + this.crA.LJ() + (double)f5, this.gY - (double)(f4 * f3));
            if (this.crA instanceof r) {
                ((r)this.crA).cuF = this.cuF;
            }
        }
    }

    private float aaL() {
        return 15.0f + (float)this.ta.nextInt(8) + (float)this.ta.nextInt(9);
    }

    private double aaM() {
        return (double)0.4f + this.ta.nextDouble() * 0.2 + this.ta.nextDouble() * 0.2 + this.ta.nextDouble() * 0.2;
    }

    private double aaN() {
        return ((double)0.45f + this.ta.nextDouble() * 0.3 + this.ta.nextDouble() * 0.3 + this.ta.nextDouble() * 0.3) * 0.25;
    }

    public static boolean j(net.minecraft.item.d d2) {
        return d2 == Items.cSo || d2 == Items.cSp || d2 == Items.cSq;
    }

    @Override
    public boolean isOnLadder() {
        return false;
    }

    @Override
    public float getEyeHeight() {
        return this.height;
    }

    @Override
    public boolean f(int n2, co co2) {
        int n3;
        if (n2 == 499 && this.aaC()) {
            if (co2 == null && this.aae()) {
                this.bs(false);
                this.aap();
                return true;
            }
            if (co2 != null && co2.bP() == net.minecraft.item.d.I(Blocks.cMg) && !this.aae()) {
                this.bs(true);
                this.aap();
                return true;
            }
        }
        if ((n3 = n2 - 400) >= 0 && n3 < 2 && n3 < this.cFZ.YI()) {
            if (n3 == 0 && co2 != null && co2.bP() != Items.cQE) {
                return false;
            }
            if (n3 != 1 || (co2 == null || f.j(co2.bP())) && this.aaB()) {
                this.cFZ.g(n3, co2);
                this.aaq();
                return true;
            }
            return false;
        }
        int n4 = n2 - 500 + 2;
        if (n4 >= 2 && n4 < this.cFZ.YI()) {
            this.cFZ.g(n4, co2);
            return true;
        }
        return false;
    }
}

