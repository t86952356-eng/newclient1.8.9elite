/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Maps
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package net.minecraft.entity;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.aii;
import hackclient.rise.bs;
import hackclient.rise.ed;
import hackclient.rise.ee;
import hackclient.rise.fz;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.Block$SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.entity.ai.attributes.c;
import net.minecraft.entity.ai.attributes.d;
import net.minecraft.entity.ai.attributes.h;
import net.minecraft.entity.aj;
import net.minecraft.entity.item.i;
import net.minecraft.entity.item.w;
import net.minecraft.entity.passive.ai;
import net.minecraft.entity.passive.y;
import net.minecraft.entity.player.e;
import net.minecraft.entity.s;
import net.minecraft.entity.z;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.network.play.server.m;
import net.minecraft.network.play.server.o;
import net.minecraft.scoreboard.l;
import net.minecraft.util.ab;
import net.minecraft.util.ad;
import net.minecraft.util.ah;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.da;

public abstract class r
extends net.minecraft.entity.c
implements Serializable {
    private static final UUID cuj = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
    private static final a cuk = new a(cuj, "Sprinting speed boost", 0.3f, 2).aM(false);
    private c cul;
    private final ab cum = new ab(this);
    private final Map<Integer, net.minecraft.potion.d> cun = Maps.newHashMap();
    private final co[] cuo = new co[5];
    public boolean cup;
    public int cuq;
    public int cur;
    public int cus;
    public int zf;
    public int cut;
    public float cuu;
    public int cuv;
    public float cuw;
    public float km;
    public float cux;
    public float cuy;
    public float cuz;
    public int cuA = 20;
    public float cuB;
    public float cuC;
    public float cuD;
    public float cuE;
    public float cuF;
    public float cuG;
    public float pn;
    public float cuH;
    public float cuI = 0.02f;
    protected net.minecraft.entity.player.a cuJ;
    protected int cuK;
    protected boolean cuL;
    protected int cuM;
    protected float cuN;
    protected float cuO;
    protected float cuP;
    protected float cuQ;
    protected float cuR;
    protected int cuS;
    protected float cuT;
    public boolean cuU;
    public float cuV;
    public float cuW;
    protected float cuX;
    protected int cuY;
    protected double cuZ;
    protected double cva;
    protected double cvb;
    protected double cvc;
    protected double cvd;
    private boolean cve = true;
    private r cvf;
    private int cvg;
    private r cvh;
    private int cvi;
    private float cvj;
    public int cvk;
    public int cvl;
    private float cvm;

    @Override
    public void To() {
        this.a(ad.dvk, Float.MAX_VALUE);
    }

    public r(net.minecraft.world.w w2) {
        super(w2);
        this.UQ();
        this.aY(this.getMaxHealth());
        this.crz = true;
        this.cuE = (float)((Math.random() + 1.0) * (double)0.01f);
        this.setPosition(this.gW, this.gX, this.gY);
        this.cuD = (float)Math.random() * 12398.0f;
        this.pn = this.pl = (float)(Math.random() * Math.PI * 2.0);
        this.cso = 0.6f;
    }

    @Override
    protected void IA() {
        this.csD.a(7, 0);
        this.csD.a(8, (byte)0);
        this.csD.a(9, (byte)0);
        this.csD.a(6, Float.valueOf(1.0f));
    }

    protected void UQ() {
        this.VX().c(aj.cwm);
        this.VX().c(aj.cwo);
        this.VX().c(aj.cwp);
    }

    @Override
    protected void a(double d2, boolean bl2, Block block, b b2) {
        if (!this.isInWater()) {
            this.TH();
        }
        if (!this.baU.dDw && this.csf > 3.0f && bl2) {
            IBlockState iBlockState = this.baU.L(b2);
            Block block2 = iBlockState.df();
            float f2 = bt.bM(this.csf - 3.0f);
            if (block2.xb() != Material.beo) {
                double d3 = Math.min(0.2f + f2 / 15.0f, 10.0f);
                if (d3 > 2.5) {
                    d3 = 2.5;
                }
                int n2 = (int)(150.0 * d3);
                ((net.minecraft.world.ai)this.baU).a(as.dxI, this.gW, this.gX, this.gY, n2, 0.0, 0.0, 0.0, (double)0.15f, Block.a(iBlockState));
            }
        }
        super.a(d2, bl2, block, b2);
    }

    public boolean Vy() {
        return false;
    }

    @Override
    public void Tu() {
        boolean bl2;
        this.zf = this.cus;
        this.cuw = this.km;
        super.Tu();
        this.baU.dDt.eY("livingEntityBaseTick");
        boolean bl3 = this instanceof net.minecraft.entity.player.a;
        if (this.TS()) {
            double d2;
            if (this.TT()) {
                this.a(ad.dvf, 1.0f);
            } else if (bl3 && !this.baU.Sv().w(this.Us()) && (d2 = this.baU.Sv().aD(this) + this.baU.Sv().axs()) < 0.0) {
                this.a(ad.dvf, (float)Math.max(1, bt.aF(-d2 * this.baU.Sv().axt())));
            }
        }
        if (this.TF() || this.baU.dDw) {
            this.Tx();
        }
        boolean bl4 = bl2 = bl3 && ((net.minecraft.entity.player.a)this).cIt.cJJ;
        if (this.TS()) {
            if (this.c(Material.bev)) {
                if (!(this.Vy() || this.isPotionActive(net.minecraft.potion.a.dgI.dhb) || bl2)) {
                    this.ey(this.eI(this.Uc()));
                    if (this.Uc() == -20) {
                        this.ey(0);
                        for (int i2 = 0; i2 < 8; ++i2) {
                            float f2 = this.ta.nextFloat() - this.ta.nextFloat();
                            float f3 = this.ta.nextFloat() - this.ta.nextFloat();
                            float f4 = this.ta.nextFloat() - this.ta.nextFloat();
                            this.baU.a(as.dxa, this.gW + (double)f2, this.gX + (double)f3, this.gY + (double)f4, this.ud, this.ue, this.uf, new int[0]);
                        }
                        this.a(ad.dvg, 2.0f);
                    }
                }
                if (!this.baU.dDw && this.isRiding() && this.crC instanceof r) {
                    this.D(null);
                }
            } else {
                this.ey(300);
            }
        }
        if (this.TS() && this.TG()) {
            this.Tx();
        }
        this.cuB = this.cuC;
        if (this.cus > 0) {
            --this.cus;
        }
        if (this.csA > 0 && !(this instanceof e)) {
            --this.csA;
        }
        if (this.getHealth() <= 0.0f) {
            this.Vz();
        }
        if (this.cuK > 0) {
            --this.cuK;
        } else {
            this.cuJ = null;
        }
        if (this.cvh != null && !this.cvh.TS()) {
            this.cvh = null;
        }
        if (this.cvf != null) {
            if (!this.cvf.TS()) {
                this.T(null);
            } else if (this.aRg - this.cvg > 100) {
                this.T(null);
            }
        }
        this.VH();
        this.cuQ = this.cuP;
        this.cuG = this.cuF;
        this.cuH = this.pn;
        this.crM = this.pl;
        this.crO = this.pm;
        this.baU.dDt.ajv();
    }

    public boolean Uz() {
        return false;
    }

    protected void Vz() {
        ++this.cuv;
        if (this.cuv == 20) {
            int n2;
            if (!this.baU.dDw && (this.cuK > 0 || this.isPlayer()) && this.VA() && this.baU.Si().gw("doMobLoot")) {
                int n3;
                for (n2 = this.r(this.cuJ); n2 > 0; n2 -= n3) {
                    n3 = w.fl(n2);
                    this.baU.G(new w(this.baU, this.gW, this.gX, this.gY, n3));
                }
            }
            this.Tt();
            for (n2 = 0; n2 < 20; ++n2) {
                double d2 = this.ta.nextGaussian() * 0.02;
                double d3 = this.ta.nextGaussian() * 0.02;
                double d4 = this.ta.nextGaussian() * 0.02;
                this.baU.a(as.dwW, this.gW + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, this.gX + (double)(this.ta.nextFloat() * this.height), this.gY + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, d2, d3, d4, new int[0]);
            }
        }
    }

    protected boolean VA() {
        return !this.Uz();
    }

    protected int eI(int n2) {
        int n3 = net.minecraft.enchantment.l.Q((net.minecraft.entity.c)this);
        return n3 > 0 && this.ta.nextInt(n3 + 1) > 0 ? n2 : n2 - 1;
    }

    protected int r(net.minecraft.entity.player.a a2) {
        return 0;
    }

    protected boolean isPlayer() {
        return false;
    }

    public Random VB() {
        return this.ta;
    }

    public r VC() {
        return this.cvf;
    }

    public int VD() {
        return this.cvg;
    }

    public void T(r r2) {
        this.cvf = r2;
        this.cvg = this.aRg;
    }

    public r VE() {
        return this.cvh;
    }

    public int VF() {
        return this.cvi;
    }

    public void ae(net.minecraft.entity.c c2) {
        this.cvh = c2 instanceof r ? (r)c2 : null;
        this.cvi = this.aRg;
    }

    public int VG() {
        return this.cuM;
    }

    @Override
    public void d(n n2) {
        n2.a("HealF", this.getHealth());
        n2.a("Health", (short)Math.ceil(this.getHealth()));
        n2.a("HurtTime", (short)this.cus);
        n2.B("HurtByTimestamp", this.cvg);
        n2.a("DeathTime", (short)this.cuv);
        n2.a("AbsorptionAmount", this.Wi());
        for (co co2 : this.Ub()) {
            if (co2 == null) continue;
            this.cul.a(co2.aew());
        }
        n2.b("Attributes", aj.a(this.VX()));
        for (co co2 : this.Ub()) {
            if (co2 == null) continue;
            this.cul.b(co2.aew());
        }
        if (!this.cun.isEmpty()) {
            v v2 = new v();
            for (net.minecraft.potion.d d2 : this.cun.values()) {
                v2.a(d2.z(new n()));
            }
            n2.b("ActiveEffects", v2);
        }
    }

    @Override
    public void e(n n2) {
        g g2;
        this.bb(n2.eI("AbsorptionAmount"));
        if (n2.C("Attributes", 9) && this.baU != null && !this.baU.dDw) {
            aj.a(this.VX(), n2.D("Attributes", 10));
        }
        if (n2.C("ActiveEffects", 9)) {
            g2 = n2.D("ActiveEffects", 10);
            for (int i2 = 0; i2 < ((v)g2).aeS(); ++i2) {
                n n3 = ((v)g2).gi(i2);
                net.minecraft.potion.d d2 = net.minecraft.potion.d.A(n3);
                if (d2 == null) continue;
                this.cun.put(d2.aje(), d2);
            }
        }
        if (n2.C("HealF", 99)) {
            this.aY(n2.eI("HealF"));
        } else {
            g2 = n2.eB("Health");
            if (g2 == null) {
                this.aY(this.getMaxHealth());
            } else if (g2.aeF() == 5) {
                this.aY(((net.minecraft.nbt.s)g2).aeO());
            } else if (g2.aeF() == 2) {
                this.aY(((net.minecraft.nbt.y)g2).aeL());
            }
        }
        this.cus = n2.eF("HurtTime");
        this.cuv = n2.eF("DeathTime");
        this.cvg = n2.eG("HurtByTimestamp");
    }

    protected void VH() {
        boolean bl2;
        Iterator<Integer> iterator = this.cun.keySet().iterator();
        while (iterator.hasNext()) {
            Integer n2 = iterator.next();
            net.minecraft.potion.d d2 = this.cun.get(n2);
            if (!d2.aa(this)) {
                if (this.baU.dDw) continue;
                iterator.remove();
                this.e(d2);
                continue;
            }
            if (d2.getDuration() % 600 != 0) continue;
            this.a(d2, false);
        }
        if (this.cve) {
            if (!this.baU.dDw) {
                this.VI();
            }
            this.cve = false;
        }
        int n3 = this.csD.en(7);
        boolean bl3 = bl2 = this.csD.el(8) > 0;
        if (n3 > 0) {
            boolean bl4 = false;
            if (!this.isInvisible()) {
                bl4 = this.ta.nextBoolean();
            } else {
                boolean bl5 = bl4 = this.ta.nextInt(15) == 0;
            }
            if (bl2) {
                bl4 &= this.ta.nextInt(5) == 0;
            }
            if (bl4 && n3 > 0) {
                double d3 = (double)(n3 >> 16 & 0xFF) / 255.0;
                double d4 = (double)(n3 >> 8 & 0xFF) / 255.0;
                double d5 = (double)(n3 >> 0 & 0xFF) / 255.0;
                this.baU.a(bl2 ? as.dxm : as.dxl, this.gW + (this.ta.nextDouble() - 0.5) * (double)this.width, this.gX + this.ta.nextDouble() * (double)this.height, this.gY + (this.ta.nextDouble() - 0.5) * (double)this.width, d3, d4, d5, new int[0]);
            }
        }
    }

    protected void VI() {
        if (this.cun.isEmpty()) {
            this.VJ();
            this.ak(false);
        } else {
            int n2 = net.minecraft.potion.g.d(this.cun.values());
            this.csD.b(8, (byte)(net.minecraft.potion.g.e(this.cun.values()) ? 1 : 0));
            this.csD.b(7, n2);
            this.ak(this.isPotionActive(net.minecraft.potion.a.dgJ.dhb));
        }
    }

    protected void VJ() {
        this.csD.b(8, (byte)0);
        this.csD.b(7, 0);
    }

    public void VK() {
        Iterator<Integer> iterator = this.cun.keySet().iterator();
        while (iterator.hasNext()) {
            Integer n2 = iterator.next();
            net.minecraft.potion.d d2 = this.cun.get(n2);
            if (this.baU.dDw) continue;
            iterator.remove();
            this.e(d2);
        }
    }

    public Collection<net.minecraft.potion.d> VL() {
        return this.cun.values();
    }

    public boolean isPotionActive(int n2) {
        return this.cun.containsKey(n2);
    }

    public boolean a(net.minecraft.potion.a a2) {
        return this.isPotionActive(a2.dhb);
    }

    public net.minecraft.potion.d b(net.minecraft.potion.a a2) {
        return this.cun.get(a2.dhb);
    }

    public net.minecraft.potion.d eJ(int n2) {
        return this.cun.get(n2);
    }

    public void b(net.minecraft.potion.d d2) {
        if (this.c(d2)) {
            if (this.cun.containsKey(d2.aje())) {
                this.cun.get(d2.aje()).g(d2);
                this.a(this.cun.get(d2.aje()), true);
            } else {
                this.cun.put(d2.aje(), d2);
                this.d(d2);
            }
        }
    }

    public boolean c(net.minecraft.potion.d d2) {
        if (this.VY() == z.cvU) {
            int n2 = d2.aje();
            return n2 != net.minecraft.potion.a.dgF.dhb && n2 != net.minecraft.potion.a.dgO.dhb;
        }
        return true;
    }

    public boolean VM() {
        return this.VY() == z.cvU;
    }

    public void eK(int n2) {
        this.cun.remove(n2);
    }

    public void eL(int n2) {
        net.minecraft.potion.d d2 = this.cun.remove(n2);
        if (d2 != null) {
            this.e(d2);
        }
    }

    protected void d(net.minecraft.potion.d d2) {
        this.cve = true;
        if (!this.baU.dDw) {
            net.minecraft.potion.a.dgt[d2.aje()].b(this, this.VX(), d2.ajf());
        }
    }

    protected void a(net.minecraft.potion.d d2, boolean bl2) {
        this.cve = true;
        if (bl2 && !this.baU.dDw) {
            net.minecraft.potion.a.dgt[d2.aje()].a(this, this.VX(), d2.ajf());
            net.minecraft.potion.a.dgt[d2.aje()].b(this, this.VX(), d2.ajf());
        }
    }

    protected void e(net.minecraft.potion.d d2) {
        this.cve = true;
        if (!this.baU.dDw) {
            net.minecraft.potion.a.dgt[d2.aje()].a(this, this.VX(), d2.ajf());
        }
    }

    public void P(float f2) {
        float f3 = this.getHealth();
        if (f3 > 0.0f) {
            this.aY(f3 + f2);
        }
    }

    public final float getHealth() {
        return this.csD.eo(6);
    }

    public void aY(float f2) {
        this.csD.b(6, Float.valueOf(bt.I(f2, 0.0f, this.getMaxHealth())));
    }

    @Override
    public boolean a(ad ad2, float f2) {
        Object object;
        if (this.a(ad2)) {
            return false;
        }
        if (this.baU.dDw) {
            return false;
        }
        this.cuM = 0;
        if (this.getHealth() <= 0.0f) {
            return false;
        }
        if (ad2.ask() && this.a(net.minecraft.potion.a.dgH)) {
            return false;
        }
        if ((ad2 == ad.dvo || ad2 == ad.dvp) && this.eG(4) != null) {
            this.eG(4).b((int)(f2 * 4.0f + this.ta.nextFloat() * f2 * 2.0f), this);
            f2 *= 0.75f;
        }
        this.cuy = 1.5f;
        boolean bl2 = true;
        if ((float)this.csA > (float)this.cuA / 2.0f) {
            if (f2 <= this.cuT) {
                return false;
            }
            this.b(ad2, f2 - this.cuT);
            this.cuT = f2;
            bl2 = false;
        } else {
            this.cuT = f2;
            this.csA = this.cuA;
            this.b(ad2, f2);
            this.cut = 10;
            this.cus = 10;
        }
        this.cuu = 0.0f;
        net.minecraft.entity.c c2 = ad2.dk();
        if (c2 != null) {
            if (c2 instanceof r) {
                this.T((r)c2);
            }
            if (c2 instanceof net.minecraft.entity.player.a) {
                this.cuK = 100;
                this.cuJ = (net.minecraft.entity.player.a)c2;
            } else if (c2 instanceof ai && ((y)(object = (ai)c2)).abl()) {
                this.cuK = 100;
                this.cuJ = null;
            }
        }
        if (bl2) {
            this.baU.a((net.minecraft.entity.c)this, (byte)2);
            if (ad2 != ad.dvg) {
                this.TM();
            }
            if (c2 != null) {
                double d2 = c2.gW - this.gW;
                double d3 = c2.gY - this.gY;
                while (d2 * d2 + d3 * d3 < 1.0E-4) {
                    d2 = (Math.random() - Math.random()) * 0.01;
                    d3 = (Math.random() - Math.random()) * 0.01;
                }
                this.cuu = (float)(bt.y(d3, d2) * 180.0 / Math.PI - (double)this.pp);
                this.a(c2, f2, d2, d3);
            } else {
                this.cuu = (int)(Math.random() * 2.0) * 180;
            }
        }
        if (this.getHealth() <= 0.0f) {
            object = this.VO();
            if (bl2 && object != null) {
                this.a((String)object, this.VZ(), this.Wa());
            }
            this.b(ad2);
        } else {
            object = this.VN();
            if (bl2 && object != null) {
                this.a((String)object, this.VZ(), this.Wa());
            }
        }
        return true;
    }

    public void X(co co2) {
        this.a("random.break", 0.8f, 0.8f + this.baU.dDk.nextFloat() * 0.4f);
        for (int i2 = 0; i2 < 5; ++i2) {
            da da2 = new da(((double)this.ta.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
            da2 = da2.bO(-this.pm * (float)Math.PI / 180.0f);
            da2 = da2.bP(-this.pl * (float)Math.PI / 180.0f);
            double d2 = (double)(-this.ta.nextFloat()) * 0.6 - 0.3;
            da da3 = new da(((double)this.ta.nextFloat() - 0.5) * 0.3, d2, 0.6);
            da3 = da3.bO(-this.pm * (float)Math.PI / 180.0f);
            da3 = da3.bP(-this.pl * (float)Math.PI / 180.0f);
            da3 = da3.al(this.gW, this.gX + (double)this.getEyeHeight(), this.gY);
            this.baU.a(as.dxG, da3.dAG, da3.dAH, da3.dAI, da2.dAG, da2.dAH + 0.05, da2.dAI, net.minecraft.item.d.p(co2.bP()));
        }
    }

    public void b(ad ad2) {
        net.minecraft.entity.c c2 = ad2.dk();
        r r2 = this.VS();
        if (this.cuS >= 0 && r2 != null) {
            r2.b(this, this.cuS);
        }
        if (c2 != null) {
            c2.R(this);
        }
        this.cuL = true;
        this.VR().aX();
        if (!this.baU.dDw) {
            int n2 = 0;
            if (c2 instanceof net.minecraft.entity.player.a) {
                n2 = net.minecraft.enchantment.l.P((r)c2);
            }
            if (this.VA() && this.baU.Si().gw("doMobLoot")) {
                this.a(this.cuK > 0, n2);
                this.b(this.cuK > 0, n2);
                if (this.cuK > 0 && this.ta.nextFloat() < 0.025f + (float)n2 * 0.01f) {
                    this.VP();
                }
            }
        }
        this.baU.a((net.minecraft.entity.c)this, (byte)3);
    }

    protected void b(boolean bl2, int n2) {
    }

    public void a(net.minecraft.entity.c c2, float f2, double d2, double d3) {
        if (this.ta.nextDouble() >= this.a(aj.cwo).XB()) {
            this.csL = true;
            float f3 = bt.aD(d2 * d2 + d3 * d3);
            float f4 = 0.4f;
            this.ud /= 2.0;
            this.ue /= 2.0;
            this.uf /= 2.0;
            this.ud -= d2 / (double)f3 * (double)0.4f;
            this.ue += (double)0.4f;
            this.uf -= d3 / (double)f3 * (double)0.4f;
            if (this.ue > (double)0.4f) {
                this.ue = 0.4f;
            }
        }
    }

    protected String VN() {
        return "game.neutral.hurt";
    }

    protected String VO() {
        return "game.neutral.die";
    }

    protected void VP() {
    }

    protected void a(boolean bl2, int n2) {
    }

    public boolean isOnLadder() {
        int n2;
        int n3;
        int n4 = bt.aF(this.gW);
        Block block = this.baU.L(new b(n4, n3 = bt.aF(this.Us().dtI), n2 = bt.aF(this.gY))).df();
        return !(block != Blocks.cMw && block != Blocks.cNp || this instanceof net.minecraft.entity.player.a && ((net.minecraft.entity.player.a)this).CZ());
    }

    @Override
    public boolean TS() {
        return !this.csb && this.getHealth() > 0.0f;
    }

    @Override
    public void q(float f2, float f3) {
        super.q(f2, f3);
        net.minecraft.potion.d d2 = this.b(net.minecraft.potion.a.dgD);
        float f4 = d2 != null ? (float)(d2.ajf() + 1) : 0.0f;
        int n2 = bt.bM((f2 - 3.0f - f4) * f3);
        if (n2 > 0) {
            this.a(this.eM(n2), 1.0f, 1.0f);
            this.a(ad.dvj, (float)n2);
            int n3 = bt.aF(this.gW);
            int n4 = bt.aF(this.gX - (double)0.2f);
            int n5 = bt.aF(this.gY);
            Block block = this.baU.L(new b(n3, n4, n5)).df();
            if (block.xb() != Material.beo) {
                Block$SoundType block$SoundType = block.aSB;
                this.a(block$SoundType.xR(), block$SoundType.getVolume() * 0.5f, block$SoundType.xT() * 0.75f);
            }
        }
    }

    protected String eM(int n2) {
        return n2 > 4 ? "game.neutral.hurt.fall.big" : "game.neutral.hurt.fall.small";
    }

    @Override
    public void Ua() {
        this.cut = 10;
        this.cus = 10;
        this.cuu = 0.0f;
    }

    public int VQ() {
        int n2 = 0;
        for (co co2 : this.Ub()) {
            if (co2 == null || !(co2.bP() instanceof net.minecraft.item.y)) continue;
            int n3 = ((net.minecraft.item.y)co2.bP()).cVI;
            n2 += n3;
        }
        return n2;
    }

    protected void aZ(float f2) {
    }

    protected float c(ad ad2, float f2) {
        if (!ad2.asb()) {
            int n2 = 25 - this.VQ();
            float f3 = f2 * (float)n2;
            this.aZ(f2);
            f2 = f3 / 25.0f;
        }
        return f2;
    }

    protected float d(ad ad2, float f2) {
        float f3;
        int n2;
        int n3;
        if (ad2.ase()) {
            return f2;
        }
        if (this.a(net.minecraft.potion.a.dgG) && ad2 != ad.dvk) {
            n3 = (this.b(net.minecraft.potion.a.dgG).ajf() + 1) * 5;
            n2 = 25 - n3;
            f3 = f2 * (float)n2;
            f2 = f3 / 25.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        n3 = net.minecraft.enchantment.l.a(this.Ub(), ad2);
        if (n3 > 20) {
            n3 = 20;
        }
        if (n3 > 0 && n3 <= 20) {
            n2 = 25 - n3;
            f3 = f2 * (float)n2;
            f2 = f3 / 25.0f;
        }
        return f2;
    }

    protected void b(ad ad2, float f2) {
        if (!this.a(ad2)) {
            f2 = this.c(ad2, f2);
            float f3 = f2 = this.d(ad2, f2);
            f2 = Math.max(f2 - this.Wi(), 0.0f);
            this.bb(this.Wi() - (f3 - f2));
            if (f2 != 0.0f) {
                float f4 = this.getHealth();
                this.aY(f4 - f2);
                this.VR().a(ad2, f4, f2);
                this.bb(this.Wi() - f2);
            }
        }
    }

    public ab VR() {
        return this.cum;
    }

    public r VS() {
        return this.cum.arQ() != null ? this.cum.arQ() : (this.cuJ != null ? this.cuJ : (this.cvf != null ? this.cvf : null));
    }

    public final float getMaxHealth() {
        return (float)this.a(aj.cwm).XB();
    }

    public final int VT() {
        return this.csD.el(9);
    }

    public final void eN(int n2) {
        this.csD.b(9, (byte)n2);
    }

    public int VU() {
        int n2 = this.a(net.minecraft.potion.a.dgy) ? 6 - (1 + this.b(net.minecraft.potion.a.dgy).ajf()) : (this.a(net.minecraft.potion.a.dgz) ? 6 + (1 + this.b(net.minecraft.potion.a.dgz).ajf()) * 2 : 6);
        fz fz2 = new fz(n2);
        hackclient.rise.a.a.e().d(fz2);
        n2 = fz2.dK();
        return (int)((float)n2 * net.minecraft.client.d.AZ().bgC.dAp);
    }

    public void swingItem() {
        if (!this.cup || this.cuq >= this.VU() / 2 || this.cuq < 0) {
            this.cuq = -1;
            this.cup = true;
            if (this.baU instanceof net.minecraft.world.ai) {
                ((net.minecraft.world.ai)this.baU).awu().a(this, new m(this, 0));
            }
        }
    }

    public void VV() {
        if (this.baU instanceof net.minecraft.world.ai) {
            ((net.minecraft.world.ai)this.baU).awu().a(this, new m(this, 0));
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 2) {
            this.cuy = 1.5f;
            this.csA = this.cuA;
            this.cut = 10;
            this.cus = 10;
            this.cuu = 0.0f;
            String string = this.VN();
            if (string != null) {
                this.a(this.VN(), this.VZ(), (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f + 1.0f);
            }
            this.a(ad.dvl, 0.0f);
        } else if (by2 == 3) {
            String string = this.VO();
            if (string != null) {
                this.a(this.VO(), this.VZ(), (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f + 1.0f);
            }
            this.aY(0.0f);
            this.b(ad.dvl);
        } else {
            super.a(by2);
        }
    }

    @Override
    protected void Ty() {
        this.a(ad.dvk, 4.0f);
    }

    protected void VW() {
        int n2 = this.VU();
        if (this.cup) {
            ++this.cuq;
            if (this.cuq >= n2) {
                this.cuq = 0;
                this.cup = false;
            }
        } else {
            this.cuq = 0;
        }
        this.km = (float)this.cuq / (float)n2;
    }

    public net.minecraft.entity.ai.attributes.e a(d d2) {
        return this.VX().b(d2);
    }

    public c VX() {
        if (this.cul == null) {
            this.cul = new h();
        }
        return this.cul;
    }

    public z VY() {
        return z.cvT;
    }

    public abstract co Vk();

    public abstract co eG(int var1);

    public abstract co eH(int var1);

    @Override
    public abstract void c(int var1, co var2);

    @Override
    public void setSprinting(boolean bl2) {
        super.setSprinting(bl2);
        net.minecraft.entity.ai.attributes.e e2 = this.a(aj.cwp);
        if (e2.h(cuj) != null) {
            e2.d(cuk);
        }
        if (bl2) {
            e2.c(cuk);
        }
    }

    @Override
    public abstract co[] Ub();

    protected float VZ() {
        return 1.0f;
    }

    protected float Wa() {
        return this.Uz() ? (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f + 1.5f : (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f + 1.0f;
    }

    protected boolean Wb() {
        return this.getHealth() <= 0.0f;
    }

    public void af(net.minecraft.entity.c c2) {
        double d2 = c2.gW;
        double d3 = c2.Us().dtI + (double)c2.height;
        double d4 = c2.gY;
        boolean bl2 = true;
        for (int i2 = -1; i2 <= 1; ++i2) {
            for (int i3 = -1; i3 < 1; ++i3) {
                if (i2 == 0 && i3 == 0) continue;
                int n2 = (int)(this.gW + (double)i2);
                int n3 = (int)(this.gY + (double)i3);
                net.minecraft.util.a a2 = this.Us().ae(i2, 1.0, i3);
                if (!this.baU.r(a2).isEmpty()) continue;
                if (net.minecraft.world.w.v(this.baU, new b(n2, (int)this.gX, n3))) {
                    this.Q(this.gW + (double)i2, this.gX + 1.0, this.gY + (double)i3);
                    return;
                }
                if (!net.minecraft.world.w.v(this.baU, new b(n2, (int)this.gX - 1, n3)) && this.baU.L(new b(n2, (int)this.gX - 1, n3)).df().xb() != Material.bev) continue;
                d2 = this.gW + (double)i2;
                d3 = this.gX + 1.0;
                d4 = this.gY + (double)i3;
            }
        }
        this.Q(d2, d3, d4);
    }

    @Override
    public boolean Up() {
        return false;
    }

    protected float Wc() {
        return 0.42f;
    }

    protected void jump() {
        if (this.cvl <= 1) {
            return;
        }
        float f2 = this.Wc();
        if (this.a(net.minecraft.potion.a.dgD)) {
            f2 += (float)(this.b(net.minecraft.potion.a.dgD).ajf() + 1) * 0.1f;
        }
        if (this == net.minecraft.client.d.AZ().bgK) {
            ed ed2 = new ed(f2, this.pp);
            hackclient.rise.a.a.e().d(ed2);
            f2 = ed2.getJumpMotion();
            this.pp = ed2.getYaw();
            this.pq = ed2.getYaw();
            if (ed2.isCancelled()) {
                return;
            }
        }
        this.cvl = 0;
        this.ue = f2;
        if (this.isSprinting()) {
            float f3 = this.pp * ((float)Math.PI / 180);
            double d2 = ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_20_5) ? 0.2 : (double)0.2f;
            net.minecraft.client.d d3 = net.minecraft.client.d.AZ();
            if (d3.bgK.bkD) {
                f3 = (float)(aii.direction() * 57.29577951308232);
                f3 *= (float)Math.PI / 180;
            }
            this.ud -= (double)bt.bx(f3) * d2;
            this.uf += (double)bt.bB(f3) * d2;
        }
        this.csL = true;
    }

    protected void Wd() {
        this.ue += (double)0.04f;
    }

    protected void We() {
        this.ue += (double)0.04f;
    }

    public void t(float f2, float f3) {
        float f4;
        if (this.Dy()) {
            ++this.cvl;
            if (!this.isInWater() || this instanceof net.minecraft.entity.player.a && ((net.minecraft.entity.player.a)this).cIt.cJK) {
                if (!this.isInLava() || this instanceof net.minecraft.entity.player.a && ((net.minecraft.entity.player.a)this).cIt.cJK) {
                    boolean bl2 = ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_14);
                    float f5 = 0.91f;
                    var5_8 = this.baU.L((b)this.TA()).df().aSF;
                    if (this.aO) {
                        f5 = var5_8 * 0.91f;
                    }
                    float f6 = bl2 ? var5_8 : f5;
                    f4 = (bl2 ? 0.21600002f : 0.16277136f) / (f6 * f6 * f6);
                    float f7 = this.aO ? this.Wf() * f4 : this.cuI;
                    this.s(f2, f3, f7);
                    f5 = 0.91f;
                    if (this.aO) {
                        f5 = this.baU.L((b)this.TA()).df().aSF * 0.91f;
                    }
                    if (this.isOnLadder()) {
                        boolean bl3;
                        float f8 = 0.15f;
                        this.ud = bt.ah(this.ud, -0.15f, 0.15f);
                        this.uf = bt.ah(this.uf, -0.15f, 0.15f);
                        this.csf = 0.0f;
                        if (this.ue < -0.15) {
                            this.ue = -0.15;
                        }
                        boolean bl4 = bl3 = this.isSneaking() && this instanceof net.minecraft.entity.player.a;
                        if (bl3 && this.ue < 0.0) {
                            this.ue = 0.0;
                        }
                    }
                    this.y(this.ud, this.ue, this.uf);
                    if ((this.crR || ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_14) && this.cuU) && this.isOnLadder()) {
                        this.ue = 0.2;
                    }
                    this.ue = !(!this.baU.dDw || this.baU.aJ(new b((int)this.gW, 0, (int)this.gY)) && this.baU.aK(new b((int)this.gW, 0, (int)this.gY)).isLoaded()) ? (this.gX > 0.0 ? -0.1 : 0.0) : (this.ue -= 0.08);
                    this.ue *= (double)0.98f;
                    this.ud *= (double)f5;
                    this.uf *= (double)f5;
                } else {
                    double d2 = this.gX;
                    this.s(f2, f3, 0.02f);
                    this.y(this.ud, this.ue, this.uf);
                    boolean bl5 = ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_13);
                    this.ud *= bl5 ? 0.5 : 0.5;
                    this.uf *= bl5 ? 0.5 : 0.5;
                    if (bl5) {
                        if (this.ctd == null || this.ctd <= 0.4) {
                            this.ue *= (double)0.8f;
                            if (!this.isSprinting()) {
                                this.ue -= 0.005;
                            }
                        } else {
                            this.ue *= 0.5;
                        }
                    } else {
                        this.ue *= 0.5;
                    }
                    this.ue -= 0.02;
                    if (this.crR && this.L(this.ud, this.ue + (double)0.6f - this.gX + d2, this.uf)) {
                        this.ue = 0.3f;
                    }
                }
            } else {
                double d3 = this.gX;
                var5_8 = this.isSprinting() ? 0.9f : 0.8f;
                float f9 = 0.02f;
                f4 = net.minecraft.enchantment.l.R(this);
                if (f4 > 3.0f) {
                    f4 = 3.0f;
                }
                if (!this.aO) {
                    f4 *= 0.5f;
                }
                if (f4 > 0.0f) {
                    var5_8 += (0.54600006f - var5_8) * f4 / 3.0f;
                    f9 += (this.Wf() * 1.0f - f9) * f4 / 3.0f;
                }
                this.s(f2, f3, f9);
                this.y(this.ud, this.ue, this.uf);
                this.ud *= (double)var5_8;
                this.ue *= (double)0.8f;
                this.uf *= (double)var5_8;
                if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_13)) {
                    if (!this.isSprinting()) {
                        this.ue -= 0.005;
                    }
                } else {
                    this.ue -= 0.02;
                }
                if (this.crR && this.L(this.ud, this.ue + (double)0.6f - this.gX + d3, this.uf)) {
                    this.ue = 0.3f;
                }
            }
        }
        this.cux = this.cuy;
        double d4 = this.gW - this.crF;
        double d5 = this.gY - this.crH;
        f4 = bt.aD(d4 * d4 + d5 * d5) * 4.0f;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        this.cuy += (f4 - this.cuy) * 0.4f;
        this.cuz += this.cuy;
    }

    public float Wf() {
        return this.cvj;
    }

    public void aX(float f2) {
        this.cvj = f2;
    }

    public boolean ag(net.minecraft.entity.c c2) {
        this.ae(c2);
        return false;
    }

    public boolean Wg() {
        return false;
    }

    @Override
    public void Dm() {
        super.Dm();
        if (!this.baU.dDw) {
            int n2 = this.VT();
            if (n2 > 0) {
                if (this.cur <= 0) {
                    this.cur = 20 * (30 - n2);
                }
                --this.cur;
                if (this.cur <= 0) {
                    this.eN(n2 - 1);
                }
            }
            for (int i2 = 0; i2 < 5; ++i2) {
                co co2 = this.cuo[i2];
                co co3 = this.eG(i2);
                if (co.d(co3, co2)) continue;
                ((net.minecraft.world.ai)this.baU).awu().a(this, new net.minecraft.network.play.server.e(this.getEntityId(), i2, co3));
                if (co2 != null) {
                    this.cul.a(co2.aew());
                }
                if (co3 != null) {
                    this.cul.b(co3.aew());
                }
                this.cuo[i2] = co3 == null ? null : co3.aeg();
            }
            if (this.aRg % 20 == 0) {
                this.VR().aX();
            }
        }
        this.Dn();
        float f2 = this.pl;
        if (this == net.minecraft.client.d.AZ().bgK && bs.fk != null) {
            f2 = bs.fk.x;
        }
        double d2 = this.gW - this.crF;
        double d3 = this.gY - this.crH;
        float f3 = (float)(d2 * d2 + d3 * d3);
        float f4 = this.cuF;
        float f5 = 0.0f;
        this.cuN = this.cuO;
        float f6 = 0.0f;
        if (f3 > 0.0025000002f) {
            f6 = 1.0f;
            f5 = (float)Math.sqrt(f3) * 3.0f;
            f4 = (float)bt.y(d3, d2) * 180.0f / (float)Math.PI - 90.0f;
        }
        if (this.km > 0.0f) {
            f4 = f2;
        }
        if (!this.aO) {
            f6 = 0.0f;
        }
        this.cuO += (f6 - this.cuO) * 0.3f;
        this.baU.dDt.eY("headTurn");
        f5 = this.u(f4, f5);
        this.baU.dDt.ajv();
        this.baU.dDt.eY("rangeChecks");
        while (this.pl - this.crM < -180.0f) {
            this.crM -= 360.0f;
        }
        while (this.pl - this.crM >= 180.0f) {
            this.crM += 360.0f;
        }
        while (this.cuF - this.cuG < -180.0f) {
            this.cuG -= 360.0f;
        }
        while (this.cuF - this.cuG >= 180.0f) {
            this.cuG += 360.0f;
        }
        while (this.pm - this.crO < -180.0f) {
            this.crO -= 360.0f;
        }
        while (this.pm - this.crO >= 180.0f) {
            this.crO += 360.0f;
        }
        while (this.pn - this.cuH < -180.0f) {
            this.cuH -= 360.0f;
        }
        while (this.pn - this.cuH >= 180.0f) {
            this.cuH += 360.0f;
        }
        this.baU.dDt.ajv();
        this.cuP += f5;
    }

    protected float u(float f2, float f3) {
        boolean bl2;
        float f4 = this.pl;
        if (this == net.minecraft.client.d.AZ().bgK && bs.fk != null) {
            f4 = bs.fk.x;
        }
        float f5 = bt.bN(f2 - this.cuF);
        this.cuF += f5 * 0.3f;
        float f6 = bt.bN(f4 - this.cuF);
        boolean bl3 = bl2 = f6 < -90.0f || f6 >= 90.0f;
        if (f6 < -75.0f) {
            f6 = -75.0f;
        }
        if (f6 >= 75.0f) {
            f6 = 75.0f;
        }
        this.cuF = f4 - f6;
        if (f6 * f6 > 2500.0f) {
            this.cuF += f6 * 0.2f;
        }
        if (bl2) {
            f3 *= -1.0f;
        }
        return f3;
    }

    public void Dn() {
        double d2;
        double d3;
        if (this.cvk > 0) {
            --this.cvk;
        }
        if (this.cuY > 0) {
            d3 = this.gW + (this.cuZ - this.gW) / (double)this.cuY;
            d2 = this.gX + (this.cva - this.gX) / (double)this.cuY;
            double d4 = this.gY + (this.cvb - this.gY) / (double)this.cuY;
            double d5 = bt.aJ(this.cvc - (double)this.pl);
            this.pl = (float)((double)this.pl + d5 / (double)this.cuY);
            this.pm = (float)((double)this.pm + (this.cvd - (double)this.pm) / (double)this.cuY);
            --this.cuY;
            this.setPosition(d3, d2, d4);
            this.setRotation(this.pl, this.pm);
        } else if (!this.Dy()) {
            this.ud *= 0.98;
            this.ue *= 0.98;
            this.uf *= 0.98;
        }
        d3 = 0.005;
        if (this == net.minecraft.client.d.AZ().bgK) {
            ee ee2 = new ee(d3);
            hackclient.rise.a.a.e().d(ee2);
            d3 = ee2.cY();
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_8)) {
            if (Math.abs(this.ud) < 0.003) {
                this.ud = 0.0;
            }
            if (Math.abs(this.ue) < 0.003) {
                this.ue = 0.0;
            }
            if (Math.abs(this.uf) < 0.003) {
                this.uf = 0.0;
            }
        } else {
            if (Math.abs(this.ud) < 0.005) {
                this.ud = 0.0;
            }
            if (Math.abs(this.ue) < 0.005) {
                this.ue = 0.0;
            }
            if (Math.abs(this.uf) < 0.005) {
                this.uf = 0.0;
            }
        }
        this.baU.dDt.eY("ai");
        if (this.Wb()) {
            this.cuU = false;
            this.cuV = 0.0f;
            this.cuW = 0.0f;
            this.cuX = 0.0f;
        } else if (this.Dy()) {
            this.baU.dDt.eY("newAi");
            this.DB();
            this.baU.dDt.ajv();
        }
        this.baU.dDt.ajv();
        this.baU.dDt.eY("jump");
        if (this.cuU) {
            boolean bl2;
            d2 = this.isInLava() ? (this.ctd != null ? this.ctd : 0.0) : (this.ctc != null ? this.ctc : 0.0);
            boolean bl3 = bl2 = this.isInWater() && d2 > 0.0;
            if (!bl2 || this.aO && d2 <= 0.4) {
                if (this.isInLava() && (!this.aO || d2 > 0.4)) {
                    this.ue += (double)0.04f;
                } else if ((this.aO || bl2) && this.cvk == 0) {
                    this.jump();
                    this.cvk = 10;
                }
            } else {
                this.ue += (double)0.04f;
            }
        } else {
            this.cvk = 0;
        }
        this.baU.dDt.ajv();
        this.baU.dDt.eY("travel");
        this.cuV *= 0.98f;
        this.cuW *= 0.98f;
        this.cuX *= 0.9f;
        this.t(this.cuV, this.cuW);
        this.baU.dDt.ajv();
        this.baU.dDt.eY("push");
        if (!this.baU.dDw) {
            this.Wh();
        }
        this.baU.dDt.ajv();
    }

    protected void DB() {
    }

    protected void Wh() {
        List<net.minecraft.entity.c> list = this.baU.a(this, this.Us().ad(0.2f, 0.0, 0.2f), (Predicate<? super net.minecraft.entity.c>)Predicates.and(ah.dvJ, (Predicate)new s(this)));
        if (!list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                net.minecraft.entity.c c2 = list.get(i2);
                this.ah(c2);
            }
        }
    }

    protected void ah(net.minecraft.entity.c c2) {
        c2.U(this);
    }

    @Override
    public void D(net.minecraft.entity.c c2) {
        if (this.crC != null && c2 == null) {
            if (!this.baU.dDw) {
                this.af(this.crC);
            }
            if (this.crC != null) {
                this.crC.crA = null;
            }
            this.crC = null;
        } else {
            super.D(c2);
        }
    }

    @Override
    public void TU() {
        super.TU();
        this.cuN = this.cuO;
        this.cuO = 0.0f;
        this.csf = 0.0f;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.cuZ = d2;
        this.cva = d3;
        this.cvb = d4;
        this.cvc = f2;
        this.cvd = f3;
        this.cuY = n2;
    }

    public void aK(boolean bl2) {
        this.cuU = bl2;
    }

    public void c(net.minecraft.entity.c c2, int n2) {
        if (!c2.csb && !this.baU.dDw) {
            net.minecraft.entity.w w2 = ((net.minecraft.world.ai)this.baU).awu();
            if (c2 instanceof i) {
                w2.a(c2, new o(c2.getEntityId(), this.getEntityId()));
            }
            if (c2 instanceof net.minecraft.entity.projectile.a) {
                w2.a(c2, new o(c2.getEntityId(), this.getEntityId()));
            }
            if (c2 instanceof w) {
                w2.a(c2, new o(c2.getEntityId(), this.getEntityId()));
            }
        }
    }

    public boolean ai(net.minecraft.entity.c c2) {
        return this.baU.d(new da(this.gW, this.gX + (double)this.getEyeHeight(), this.gY), new da(c2.gW, c2.gX + (double)c2.getEyeHeight(), c2.gY)) == null;
    }

    @Override
    public da TY() {
        return this.O(1.0f);
    }

    @Override
    public da O(float f2) {
        if (this instanceof net.minecraft.client.entity.c) {
            return super.O(f2);
        }
        if (f2 == 1.0f) {
            return this.s(this.pm, this.pn);
        }
        float f3 = this.crO + (this.pm - this.crO) * f2;
        float f4 = this.cuH + (this.pn - this.cuH) * f2;
        return this.s(f3, f4);
    }

    public float ba(float f2) {
        float f3 = this.km - this.cuw;
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        return this.cuw + f3 * f2;
    }

    public boolean Dy() {
        return !this.baU.dDw;
    }

    @Override
    public boolean TO() {
        return !this.csb;
    }

    @Override
    public boolean IE() {
        return !this.csb;
    }

    @Override
    protected void TM() {
        this.crY = this.ta.nextDouble() >= this.a(aj.cwo).XB();
    }

    @Override
    public float Uf() {
        return this.pn;
    }

    @Override
    public void aR(float f2) {
        this.pn = f2;
    }

    @Override
    public void aS(float f2) {
        this.cuF = f2;
    }

    public float Wi() {
        return this.cvm;
    }

    public void bb(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.cvm = f2;
    }

    public l Vw() {
        return this.baU.SD().fs(this.Ul().toString());
    }

    public boolean U(r r2) {
        return this.a(r2.Vw());
    }

    public boolean a(l l2) {
        return this.Vw() != null && this.Vw().b(l2);
    }

    public void Wj() {
    }

    public void Wk() {
    }

    protected void Wl() {
        this.cve = true;
    }
}

