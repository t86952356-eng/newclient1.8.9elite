/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import java.util.UUID;
import net.minecraft.entity.ab;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.entity.ai.ax;
import net.minecraft.entity.ai.bg;
import net.minecraft.entity.ai.bh;
import net.minecraft.entity.ai.bk;
import net.minecraft.entity.ai.bl;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.item.i;
import net.minecraft.entity.l;
import net.minecraft.entity.m;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.monster.aw;
import net.minecraft.entity.monster.k;
import net.minecraft.entity.passive.y;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.af;
import net.minecraft.item.ai;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.nbt.n;
import net.minecraft.nbt.s;
import net.minecraft.nbt.v;
import net.minecraft.network.play.server.ac;
import net.minecraft.pathfinding.d;
import net.minecraft.pathfinding.f;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.e;
import net.minecraft.world.w;
import net.optifine.reflect.g;

public abstract class p
extends r {
    public int ctL;
    protected int ctM;
    private final bh ctN;
    protected bk ctO;
    protected bg ctP;
    private final net.minecraft.entity.i ctQ;
    protected d ctR;
    protected final ax ctS;
    protected final ax ctT;
    private r ctU;
    private final bl ctV;
    private final co[] ctW = new co[5];
    protected float[] ctX = new float[5];
    private boolean ctY;
    private boolean ctZ;
    private boolean cua;
    private c cub;
    private n cuc;
    private UUID cud = null;
    private String cue = null;

    public p(w w2) {
        super(w2);
        this.ctS = new ax(w2 != null && w2.dDt != null ? w2.dDt : null);
        this.ctT = new ax(w2 != null && w2.dDt != null ? w2.dDt : null);
        this.ctN = new bh(this);
        this.ctO = new bk(this);
        this.ctP = new bg(this);
        this.ctQ = new net.minecraft.entity.i(this);
        this.ctR = this.i(w2);
        this.ctV = new bl(this);
        for (int i2 = 0; i2 < this.ctX.length; ++i2) {
            this.ctX[i2] = 0.085f;
        }
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.VX().c(aj.cwn).ap(16.0);
    }

    protected d i(w w2) {
        return new f(this, w2);
    }

    public bh UR() {
        return this.ctN;
    }

    public bk US() {
        return this.ctO;
    }

    public bg UT() {
        return this.ctP;
    }

    public d UU() {
        return this.ctR;
    }

    public bl UV() {
        return this.ctV;
    }

    public r UW() {
        return this.ctU;
    }

    public void S(r r2) {
        this.ctU = r2;
        g.a(g.eoR, this, r2);
    }

    public boolean i(Class<? extends r> clazz) {
        return clazz != k.class;
    }

    public void UX() {
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(15, (byte)0);
    }

    public int UY() {
        return 80;
    }

    public void UZ() {
        String string = this.Vb();
        if (string != null) {
            this.a(string, this.VZ(), this.Wa());
        }
    }

    @Override
    public void Tu() {
        super.Tu();
        this.baU.dDt.eY("mobBaseTick");
        if (this.TS() && this.ta.nextInt(1000) < this.ctL++) {
            this.ctL = -this.UY();
            this.UZ();
        }
        this.baU.dDt.ajv();
    }

    @Override
    protected int r(net.minecraft.entity.player.a a2) {
        if (this.ctM > 0) {
            int n2 = this.ctM;
            co[] coArray = this.Ub();
            for (int i2 = 0; i2 < coArray.length; ++i2) {
                if (coArray[i2] == null || !(this.ctX[i2] <= 1.0f)) continue;
                n2 += 1 + this.ta.nextInt(3);
            }
            return n2;
        }
        return this.ctM;
    }

    public void Va() {
        if (this.baU.dDw) {
            for (int i2 = 0; i2 < 20; ++i2) {
                double d2 = this.ta.nextGaussian() * 0.02;
                double d3 = this.ta.nextGaussian() * 0.02;
                double d4 = this.ta.nextGaussian() * 0.02;
                double d5 = 10.0;
                this.baU.a(as.dwW, this.gW + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width - d2 * 10.0, this.gX + (double)(this.ta.nextFloat() * this.height) - d3 * 10.0, this.gY + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width - d4 * 10.0, d2, d3, d4, new int[0]);
            }
        } else {
            this.baU.a((c)this, (byte)20);
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 20) {
            this.Va();
        } else {
            super.a(by2);
        }
    }

    @Override
    public void Dm() {
        if (net.minecraft.src.a.aoM() && this.Vu()) {
            this.Vv();
        } else {
            super.Dm();
            if (!this.baU.dDw) {
                this.UI();
            }
        }
    }

    @Override
    protected float u(float f2, float f3) {
        this.ctQ.UA();
        return f3;
    }

    protected String Vb() {
        return null;
    }

    protected net.minecraft.item.d Vc() {
        return null;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        net.minecraft.item.d d2 = this.Vc();
        if (d2 != null) {
            int n3 = this.ta.nextInt(3);
            if (n2 > 0) {
                n3 += this.ta.nextInt(n2 + 1);
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                this.d(d2, 1);
            }
        }
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.o("CanPickUpLoot", this.Vn());
        n2.o("PersistenceRequired", this.ctZ);
        v v2 = new v();
        for (int i2 = 0; i2 < this.ctW.length; ++i2) {
            n n3 = new n();
            if (this.ctW[i2] != null) {
                this.ctW[i2].t(n3);
            }
            v2.a(n3);
        }
        n2.b("Equipment", v2);
        v v3 = new v();
        for (int i3 = 0; i3 < this.ctX.length; ++i3) {
            v3.a(new s(this.ctX[i3]));
        }
        n2.b("DropChances", v3);
        n2.o("Leashed", this.cua);
        if (this.cub != null) {
            n n4 = new n();
            if (this.cub instanceof r) {
                n4.d("UUIDMost", this.cub.Ul().getMostSignificantBits());
                n4.d("UUIDLeast", this.cub.Ul().getLeastSignificantBits());
            } else if (this.cub instanceof l) {
                b b2 = ((l)this.cub).UN();
                n4.B("X", b2.wt());
                n4.B("Y", b2.wu());
                n4.B("Z", b2.wx());
            }
            n2.b("Leash", n4);
        }
        if (this.Vt()) {
            n2.o("NoAI", this.Vt());
        }
    }

    @Override
    public void e(n n2) {
        int n3;
        v v2;
        super.e(n2);
        if (n2.C("CanPickUpLoot", 1)) {
            this.aI(n2.eO("CanPickUpLoot"));
        }
        this.ctZ = n2.eO("PersistenceRequired");
        if (n2.C("Equipment", 9)) {
            v2 = n2.D("Equipment", 10);
            for (n3 = 0; n3 < this.ctW.length; ++n3) {
                this.ctW[n3] = co.s(v2.gi(n3));
            }
        }
        if (n2.C("DropChances", 9)) {
            v2 = n2.D("DropChances", 5);
            for (n3 = 0; n3 < v2.aeS(); ++n3) {
                this.ctX[n3] = v2.gl(n3);
            }
        }
        this.cua = n2.eO("Leashed");
        if (this.cua && n2.C("Leash", 10)) {
            this.cuc = n2.eN("Leash");
        }
        this.aJ(n2.eO("NoAI"));
    }

    public void aW(float f2) {
        this.cuW = f2;
    }

    @Override
    public void aX(float f2) {
        super.aX(f2);
        this.aW(f2);
    }

    @Override
    public void Dn() {
        super.Dn();
        this.baU.dDt.eY("looting");
        if (!this.baU.dDw && this.Vn() && !this.cuL && this.baU.Si().gw("mobGriefing")) {
            for (i i2 : this.baU.a(i.class, this.Us().ad(1.0, 0.0, 1.0))) {
                if (i2.csb || i2.Yk() == null || i2.Yq()) continue;
                this.c(i2);
            }
        }
        this.baU.dDt.ajv();
    }

    protected void c(i i2) {
        co co2 = i2.Yk();
        int n2 = p.W(co2);
        if (n2 > -1) {
            Object object;
            boolean bl2 = true;
            co co3 = this.eG(n2);
            if (co3 != null) {
                if (n2 == 0) {
                    if (co2.bP() instanceof cp && !(co3.bP() instanceof cp)) {
                        bl2 = true;
                    } else if (co2.bP() instanceof cp && co3.bP() instanceof cp) {
                        object = (cp)co2.bP();
                        cp cp2 = (cp)co3.bP();
                        bl2 = ((cp)object).adI() != cp2.adI() ? ((cp)object).adI() > cp2.adI() : co2.yc() > co3.yc() || co2.aej() && !co3.aej();
                    } else {
                        bl2 = co2.bP() instanceof ai && co3.bP() instanceof ai ? co2.aej() && !co3.aej() : false;
                    }
                } else if (co2.bP() instanceof net.minecraft.item.y && !(co3.bP() instanceof net.minecraft.item.y)) {
                    bl2 = true;
                } else if (co2.bP() instanceof net.minecraft.item.y && co3.bP() instanceof net.minecraft.item.y) {
                    object = (net.minecraft.item.y)co2.bP();
                    net.minecraft.item.y y2 = (net.minecraft.item.y)co3.bP();
                    bl2 = ((net.minecraft.item.y)object).cVI != y2.cVI ? ((net.minecraft.item.y)object).cVI > y2.cVI : co2.yc() > co3.yc() || co2.aej() && !co3.aej();
                } else {
                    bl2 = false;
                }
            }
            if (bl2 && this.V(co2)) {
                if (co3 != null && this.ta.nextFloat() - 0.1f < this.ctX[n2]) {
                    this.a(co3, 0.0f);
                }
                if (co2.bP() == Items.cPm && i2.Ym() != null && (object = this.baU.gz(i2.Ym())) != null) {
                    ((net.minecraft.entity.player.a)object).a(net.minecraft.stats.b.doW);
                }
                this.c(n2, co2);
                this.ctX[n2] = 2.0f;
                this.ctZ = true;
                this.c(i2, 1);
                i2.Tt();
            }
        }
    }

    protected boolean V(co co2) {
        return true;
    }

    protected boolean Vd() {
        return true;
    }

    protected void Ve() {
        Object object = null;
        Object object2 = g.a(g.enN);
        Object object3 = g.a(g.enL);
        if (this.ctZ) {
            this.cuM = 0;
        } else if ((this.cuM & 0x1F) == 31 && (object = g.g(g.eoD, this)) != object2) {
            if (object == object3) {
                this.cuM = 0;
            } else {
                this.Tt();
            }
        } else {
            net.minecraft.entity.player.a a2 = this.baU.f(this, -1.0);
            if (a2 != null) {
                double d2 = a2.gW - this.gW;
                double d3 = a2.gX - this.gX;
                double d4 = a2.gY - this.gY;
                double d5 = d2 * d2 + d3 * d3 + d4 * d4;
                if (this.Vd() && d5 > 16384.0) {
                    this.Tt();
                }
                if (this.cuM > 600 && this.ta.nextInt(800) == 0 && d5 > 1024.0 && this.Vd()) {
                    this.Tt();
                } else if (d5 < 1024.0) {
                    this.cuM = 0;
                }
            }
        }
    }

    @Override
    protected final void DB() {
        ++this.cuM;
        this.baU.dDt.eY("checkDespawn");
        this.Ve();
        this.baU.dDt.ajv();
        this.baU.dDt.eY("sensing");
        this.ctV.Xn();
        this.baU.dDt.ajv();
        this.baU.dDt.eY("targetSelector");
        this.ctT.WW();
        this.baU.dDt.ajv();
        this.baU.dDt.eY("goalSelector");
        this.ctS.WW();
        this.baU.dDt.ajv();
        this.baU.dDt.eY("navigation");
        this.ctR.aiI();
        this.baU.dDt.ajv();
        this.baU.dDt.eY("mob tick");
        this.Vf();
        this.baU.dDt.ajv();
        this.baU.dDt.eY("controls");
        this.baU.dDt.eY("move");
        this.ctO.Xm();
        this.baU.dDt.fa("look");
        this.ctN.Xd();
        this.baU.dDt.fa("jump");
        this.ctP.Xc();
        this.baU.dDt.ajv();
        this.baU.dDt.ajv();
    }

    protected void Vf() {
    }

    public int Vg() {
        return 40;
    }

    public void a(c c2, float f2, float f3) {
        double d2;
        double d3 = c2.gW - this.gW;
        double d4 = c2.gY - this.gY;
        if (c2 instanceof r) {
            r r2 = (r)c2;
            d2 = r2.gX + (double)r2.getEyeHeight() - (this.gX + (double)this.getEyeHeight());
        } else {
            d2 = (c2.Us().dtI + c2.Us().dtL) / 2.0 - (this.gX + (double)this.getEyeHeight());
        }
        double d5 = bt.aD(d3 * d3 + d4 * d4);
        float f4 = (float)(bt.y(d4, d3) * 180.0 / Math.PI) - 90.0f;
        float f5 = (float)(-(bt.y(d2, d5) * 180.0 / Math.PI));
        this.pm = this.v(this.pm, f5, f3);
        this.pl = this.v(this.pl, f4, f2);
    }

    private float v(float f2, float f3, float f4) {
        float f5 = bt.bN(f3 - f2);
        if (f5 > f4) {
            f5 = f4;
        }
        if (f5 < -f4) {
            f5 = -f4;
        }
        return f2 + f5;
    }

    public boolean UB() {
        return true;
    }

    public boolean Vh() {
        return this.baU.a(this.Us(), (c)this) && this.baU.a((c)this, this.Us()).isEmpty() && !this.baU.u(this.Us());
    }

    public float Vi() {
        return 1.0f;
    }

    public int Vj() {
        return 4;
    }

    @Override
    public int Ug() {
        if (this.UW() == null) {
            return 3;
        }
        int n2 = (int)(this.getHealth() - this.getMaxHealth() * 0.33f);
        if ((n2 -= (3 - this.baU.agm().auZ()) * 4) < 0) {
            n2 = 0;
        }
        return n2 + 3;
    }

    @Override
    public co Vk() {
        return this.ctW[0];
    }

    @Override
    public co eG(int n2) {
        return this.ctW[n2];
    }

    @Override
    public co eH(int n2) {
        return this.ctW[n2 + 1];
    }

    @Override
    public void c(int n2, co co2) {
        this.ctW[n2] = co2;
    }

    @Override
    public co[] Ub() {
        return this.ctW;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        for (int i2 = 0; i2 < this.Ub().length; ++i2) {
            boolean bl3;
            co co2 = this.eG(i2);
            boolean bl4 = bl3 = this.ctX[i2] > 1.0f;
            if (co2 == null || !bl2 && !bl3 || !(this.ta.nextFloat() - (float)n2 * 0.01f < this.ctX[i2])) continue;
            if (!bl3 && co2.aed()) {
                int n3 = Math.max(co2.adt() - 25, 1);
                int n4 = co2.adt() - this.ta.nextInt(this.ta.nextInt(n3) + 1);
                if (n4 > n3) {
                    n4 = n3;
                }
                if (n4 < 1) {
                    n4 = 1;
                }
                co2.gf(n4);
            }
            this.a(co2, 0.0f);
        }
    }

    protected void a(e e2) {
        if (this.ta.nextFloat() < 0.15f * e2.auY()) {
            float f2;
            int n2 = this.ta.nextInt(2);
            float f3 = f2 = this.baU.agm() == net.minecraft.world.f.dBU ? 0.1f : 0.25f;
            if (this.ta.nextFloat() < 0.095f) {
                ++n2;
            }
            if (this.ta.nextFloat() < 0.095f) {
                ++n2;
            }
            if (this.ta.nextFloat() < 0.095f) {
                ++n2;
            }
            for (int i2 = 3; i2 >= 0; --i2) {
                net.minecraft.item.d d2;
                co co2 = this.eH(i2);
                if (i2 < 3 && this.ta.nextFloat() < f2) break;
                if (co2 != null || (d2 = p.an(i2 + 1, n2)) == null) continue;
                this.c(i2 + 1, new co(d2));
            }
        }
    }

    public static int W(co co2) {
        if (co2.bP() != net.minecraft.item.d.I(Blocks.cMW) && co2.bP() != Items.cSb) {
            if (co2.bP() instanceof net.minecraft.item.y) {
                switch (((net.minecraft.item.y)co2.bP()).cVH) {
                    case 0: {
                        return 4;
                    }
                    case 1: {
                        return 3;
                    }
                    case 2: {
                        return 2;
                    }
                    case 3: {
                        return 1;
                    }
                }
            }
            return 0;
        }
        return 4;
    }

    public static net.minecraft.item.d an(int n2, int n3) {
        switch (n2) {
            case 4: {
                if (n3 == 0) {
                    return Items.cPU;
                }
                if (n3 == 1) {
                    return Items.cQk;
                }
                if (n3 == 2) {
                    return Items.cPY;
                }
                if (n3 == 3) {
                    return Items.cQc;
                }
                if (n3 == 4) {
                    return Items.cQg;
                }
            }
            case 3: {
                if (n3 == 0) {
                    return Items.cPV;
                }
                if (n3 == 1) {
                    return Items.cQl;
                }
                if (n3 == 2) {
                    return Items.cPZ;
                }
                if (n3 == 3) {
                    return Items.cQd;
                }
                if (n3 == 4) {
                    return Items.cQh;
                }
            }
            case 2: {
                if (n3 == 0) {
                    return Items.cPW;
                }
                if (n3 == 1) {
                    return Items.cQm;
                }
                if (n3 == 2) {
                    return Items.cQa;
                }
                if (n3 == 3) {
                    return Items.cQe;
                }
                if (n3 == 4) {
                    return Items.cQi;
                }
            }
            case 1: {
                if (n3 == 0) {
                    return Items.cPX;
                }
                if (n3 == 1) {
                    return Items.cQn;
                }
                if (n3 == 2) {
                    return Items.cQb;
                }
                if (n3 == 3) {
                    return Items.cQf;
                }
                if (n3 != 4) break;
                return Items.cQj;
            }
        }
        return null;
    }

    protected void b(e e2) {
        float f2 = e2.auY();
        if (this.Vk() != null && this.ta.nextFloat() < 0.25f * f2) {
            net.minecraft.enchantment.l.a(this.ta, this.Vk(), (int)(5.0f + f2 * (float)this.ta.nextInt(18)));
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            co co2 = this.eH(i2);
            if (co2 == null || !(this.ta.nextFloat() < 0.5f * f2)) continue;
            net.minecraft.enchantment.l.a(this.ta, co2, (int)(5.0f + f2 * (float)this.ta.nextInt(18)));
        }
    }

    public ab a(e e2, ab ab2) {
        this.a(aj.cwn).c(new a("Random spawn bonus", this.ta.nextGaussian() * 0.05, 1));
        return ab2;
    }

    public boolean Vl() {
        return false;
    }

    public void Vm() {
        this.ctZ = true;
    }

    public void f(int n2, float f2) {
        this.ctX[n2] = f2;
    }

    public boolean Vn() {
        return this.ctY;
    }

    public void aI(boolean bl2) {
        this.ctY = bl2;
    }

    public boolean Vo() {
        return this.ctZ;
    }

    @Override
    public final boolean o(net.minecraft.entity.player.a a2) {
        if (this.Vq() && this.Vr() == a2) {
            this.h(true, !a2.cIt.cJM);
            return true;
        }
        co co2 = a2.cHV.acE();
        if (co2 != null && co2.bP() == Items.cSr && this.Vp()) {
            if (!(this instanceof y) || !((y)this).abl()) {
                this.a((c)a2, true);
                --co2.cWZ;
                return true;
            }
            if (((y)this).Z(a2)) {
                this.a((c)a2, true);
                --co2.cWZ;
                return true;
            }
        }
        if (this.q(a2)) {
            return true;
        }
        return super.o(a2);
    }

    protected boolean q(net.minecraft.entity.player.a a2) {
        return false;
    }

    protected void UI() {
        if (this.cuc != null) {
            this.Vs();
        }
        if (this.cua) {
            if (!this.TS()) {
                this.h(true, true);
            }
            if (this.cub == null || this.cub.csb) {
                this.h(true, true);
            }
        }
    }

    public void h(boolean bl2, boolean bl3) {
        if (this.cua) {
            this.cua = false;
            this.cub = null;
            if (!this.baU.dDw && bl3) {
                this.d(Items.cSr, 1);
            }
            if (!this.baU.dDw && bl2 && this.baU instanceof net.minecraft.world.ai) {
                ((net.minecraft.world.ai)this.baU).awu().a(this, new ac(1, this, null));
            }
        }
    }

    public boolean Vp() {
        return !this.Vq() && !(this instanceof aw);
    }

    public boolean Vq() {
        return this.cua;
    }

    public c Vr() {
        return this.cub;
    }

    public void a(c c2, boolean bl2) {
        this.cua = true;
        this.cub = c2;
        if (!this.baU.dDw && bl2 && this.baU instanceof net.minecraft.world.ai) {
            ((net.minecraft.world.ai)this.baU).awu().a(this, new ac(1, this, this.cub));
        }
    }

    private void Vs() {
        if (this.cua && this.cuc != null) {
            if (this.cuc.C("UUIDMost", 4) && this.cuc.C("UUIDLeast", 4)) {
                UUID uUID = new UUID(this.cuc.eH("UUIDMost"), this.cuc.eH("UUIDLeast"));
                for (r r2 : this.baU.a(r.class, this.Us().ad(10.0, 10.0, 10.0))) {
                    if (!r2.Ul().equals(uUID)) continue;
                    this.cub = r2;
                    break;
                }
            } else if (this.cuc.C("X", 99) && this.cuc.C("Y", 99) && this.cuc.C("Z", 99)) {
                b b2 = new b(this.cuc.eG("X"), this.cuc.eG("Y"), this.cuc.eG("Z"));
                m m2 = m.aa(this.baU, b2);
                if (m2 == null) {
                    m2 = m.Z(this.baU, b2);
                }
                this.cub = m2;
            } else {
                this.h(false, true);
            }
        }
        this.cuc = null;
    }

    @Override
    public boolean f(int n2, co co2) {
        int n3;
        if (n2 == 99) {
            n3 = 0;
        } else {
            n3 = n2 - 100 + 1;
            if (n3 < 0 || n3 >= this.ctW.length) {
                return false;
            }
        }
        if (co2 == null || p.W(co2) == n3 || n3 == 4 && co2.bP() instanceof af) {
            this.c(n3, co2);
            return true;
        }
        return false;
    }

    @Override
    public boolean Dy() {
        return super.Dy() && !this.Vt();
    }

    public void aJ(boolean bl2) {
        this.csD.b(15, (byte)(bl2 ? 1 : 0));
    }

    public boolean Vt() {
        return this.csD.el(15) != 0;
    }

    private boolean Vu() {
        double d2;
        if (this.Uz()) {
            return false;
        }
        if (this.cus > 0) {
            return false;
        }
        if (this.aRg < 20) {
            return false;
        }
        w w2 = this.Se();
        if (w2 == null) {
            return false;
        }
        if (w2.dCY.size() != 1) {
            return false;
        }
        c c2 = w2.dCY.get(0);
        double d3 = Math.max(Math.abs(this.gW - c2.gW) - 16.0, 0.0);
        double d4 = d3 * d3 + (d2 = Math.max(Math.abs(this.gY - c2.gY) - 16.0, 0.0)) * d2;
        return !this.an(d4);
    }

    private void Vv() {
        float f2;
        ++this.cuM;
        if (this instanceof aa && (f2 = this.ag(1.0f)) > 0.5f) {
            this.cuM += 2;
        }
        this.Ve();
    }

    @Override
    public net.minecraft.scoreboard.l Vw() {
        UUID uUID = this.Ul();
        if (this.cud != uUID) {
            this.cud = uUID;
            this.cue = uUID.toString();
        }
        return this.baU.SD().fs(this.cue);
    }
}

