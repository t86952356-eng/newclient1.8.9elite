/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.block.Block;
import net.minecraft.entity.ab;
import net.minecraft.entity.ai.aa;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.ai.au;
import net.minecraft.entity.ai.az;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.v;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.h;
import net.minecraft.entity.j;
import net.minecraft.entity.passive.ai;
import net.minecraft.entity.passive.b;
import net.minecraft.entity.passive.m;
import net.minecraft.entity.passive.n;
import net.minecraft.entity.passive.o;
import net.minecraft.entity.passive.p;
import net.minecraft.entity.passive.q;
import net.minecraft.entity.passive.s;
import net.minecraft.entity.passive.t;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.pathfinding.f;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.bt;
import net.minecraft.util.cr;
import net.minecraft.util.da;
import net.minecraft.world.e;
import net.minecraft.world.w;

public class l
extends b {
    private final m<ai> cGt;
    private int cGu = 0;
    private int cGv = 0;
    private boolean cGw = false;
    private boolean cGx = false;
    private int cGy = 0;
    private q cGz = q.cGI;
    private int cGA = 0;
    private final a cGB = null;

    public l(w w2) {
        super(w2);
        this.o(0.6f, 0.7f);
        this.ctP = new net.minecraft.entity.passive.r(this, this);
        this.ctO = new s(this);
        ((f)this.UU()).bQ(true);
        this.ctR.bw(2.5f);
        this.ctS.a(1, new au(this));
        this.ctS.a(1, new o(this, 1.33));
        this.ctS.a(2, new az(this, 1.0, Items.cRV, false));
        this.ctS.a(2, new az(this, 1.0, Items.cSa, false));
        this.ctS.a(2, new az(this, 1.0, d.I(Blocks.cLP), false));
        this.ctS.a(3, new aa(this, 0.8));
        this.ctS.a(5, new p(this));
        this.ctS.a(5, new bd(this, 0.6));
        this.ctS.a(11, new be(this, a.class, 10.0f));
        this.cGt = new m<ai>(this, ai.class, 16.0f, 1.33, 1.33);
        this.ctS.a(4, this.cGt);
        this.as(0.0);
    }

    @Override
    protected float Wc() {
        return this.ctO.Xl() && this.ctO.getY() > this.gX + 0.5 ? 0.5f : this.cGz.abd();
    }

    public void a(q q2) {
        this.cGz = q2;
    }

    public float bn(float f2) {
        return this.cGv == 0 ? 0.0f : ((float)this.cGu + f2) / (float)this.cGv;
    }

    public void as(double d2) {
        this.UU().setSpeed(d2);
        this.ctO.k(this.ctO.getX(), this.ctO.getY(), this.ctO.getZ(), d2);
    }

    public void a(boolean bl2, q q2) {
        super.aK(bl2);
        if (!bl2) {
            if (this.cGz == q.cGL) {
                this.cGz = q.cGI;
            }
        } else {
            this.as(1.5 * (double)q2.abc());
            this.a(this.aaX(), this.VZ(), ((this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f + 1.0f) * 0.8f);
        }
        this.cGw = bl2;
    }

    public void b(q q2) {
        this.a(true, q2);
        this.cGv = q2.abe();
        this.cGu = 0;
    }

    public boolean aaS() {
        return this.cGw;
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(18, (byte)0);
    }

    @Override
    public void Vf() {
        if (this.ctO.getSpeed() > 0.8) {
            this.a(q.cGK);
        } else if (this.cGz != q.cGL) {
            this.a(q.cGI);
        }
        if (this.cGy > 0) {
            --this.cGy;
        }
        if (this.cGA > 0) {
            this.cGA -= this.ta.nextInt(3);
            if (this.cGA < 0) {
                this.cGA = 0;
            }
        }
        if (this.aO) {
            Object object;
            if (!this.cGx) {
                this.a(false, q.cGH);
                this.aaW();
            }
            if (this.aaY() == 99 && this.cGy == 0 && (object = this.UW()) != null && this.T((c)object) < 16.0) {
                this.t(((r)object).gW, ((r)object).gY);
                this.ctO.k(((r)object).gW, ((r)object).gX, ((r)object).gY, this.ctO.getSpeed());
                this.b(q.cGL);
                this.cGx = true;
            }
            if (!((net.minecraft.entity.passive.r)(object = (net.minecraft.entity.passive.r)this.ctP)).abg()) {
                if (this.ctO.Xl() && this.cGy == 0) {
                    net.minecraft.pathfinding.b b2 = this.ctR.aiH();
                    da da2 = new da(this.ctO.getX(), this.ctO.getY(), this.ctO.getZ());
                    if (b2 != null && b2.aiE() < b2.aiD()) {
                        da2 = b2.at(this);
                    }
                    this.t(da2.dAG, da2.dAI);
                    this.b(this.cGz);
                }
            } else if (!((net.minecraft.entity.passive.r)object).abh()) {
                this.aaT();
            }
        }
        this.cGx = this.aO;
    }

    @Override
    public void TJ() {
    }

    private void t(double d2, double d3) {
        this.pl = (float)(bt.y(d3 - this.gY, d2 - this.gW) * 180.0 / Math.PI) - 90.0f;
    }

    private void aaT() {
        ((net.minecraft.entity.passive.r)this.ctP).bA(true);
    }

    private void aaU() {
        ((net.minecraft.entity.passive.r)this.ctP).bA(false);
    }

    private void aaV() {
        this.cGy = this.aba();
    }

    private void aaW() {
        this.aaV();
        this.aaU();
    }

    @Override
    public void Dn() {
        super.Dn();
        if (this.cGu != this.cGv) {
            if (this.cGu == 0 && !this.baU.dDw) {
                this.baU.a((c)this, (byte)1);
            }
            ++this.cGu;
        } else if (this.cGv != 0) {
            this.cGu = 0;
            this.cGv = 0;
        }
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(10.0);
        this.a(aj.cwp).ap(0.3f);
    }

    @Override
    public void d(net.minecraft.nbt.n n2) {
        super.d(n2);
        n2.B("RabbitType", this.aaY());
        n2.B("MoreCarrotTicks", this.cGA);
    }

    @Override
    public void e(net.minecraft.nbt.n n2) {
        super.e(n2);
        this.fz(n2.eG("RabbitType"));
        this.cGA = n2.eG("MoreCarrotTicks");
    }

    protected String aaX() {
        return "mob.rabbit.hop";
    }

    @Override
    protected String Vb() {
        return "mob.rabbit.idle";
    }

    @Override
    protected String VN() {
        return "mob.rabbit.hurt";
    }

    @Override
    protected String VO() {
        return "mob.rabbit.death";
    }

    @Override
    public boolean ag(c c2) {
        if (this.aaY() == 99) {
            this.a("mob.attack", 1.0f, (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f + 1.0f);
            return c2.a(ad.ac(this), 8.0f);
        }
        return c2.a(ad.ac(this), 3.0f);
    }

    @Override
    public int VQ() {
        return this.aaY() == 99 ? 8 : super.VQ();
    }

    @Override
    public boolean a(ad ad2, float f2) {
        return !this.a(ad2) && super.a(ad2, f2);
    }

    @Override
    protected void VP() {
        this.a(new co(Items.cRv, 1), 0.0f);
    }

    @Override
    protected void a(boolean bl2, int n2) {
        int n3;
        int n4 = this.ta.nextInt(2) + this.ta.nextInt(1 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            this.d(Items.cRw, 1);
        }
        n4 = this.ta.nextInt(2);
        for (n3 = 0; n3 < n4; ++n3) {
            if (this.isBurning()) {
                this.d(Items.cRt, 1);
                continue;
            }
            this.d(Items.cRs, 1);
        }
    }

    private boolean k(d d2) {
        return d2 == Items.cRV || d2 == Items.cSa || d2 == d.I(Blocks.cLP);
    }

    public l g(h h2) {
        l l2 = new l(this.baU);
        if (h2 instanceof l) {
            l2.fz(this.ta.nextBoolean() ? this.aaY() : ((l)h2).aaY());
        }
        return l2;
    }

    @Override
    public boolean ac(co co2) {
        return co2 != null && this.k(co2.bP());
    }

    public int aaY() {
        return this.csD.el(18);
    }

    public void fz(int n2) {
        if (n2 == 99) {
            this.ctS.a(this.cGt);
            this.ctS.a(4, new n(this));
            this.ctT.a(1, new v((j)this, false, new Class[0]));
            this.ctT.a(2, new ag<a>((j)this, a.class, true));
            this.ctT.a(2, new ag<ai>((j)this, ai.class, true));
            if (!this.xV()) {
                this.ec(cr.gm("entity.KillerBunny.name"));
            }
        }
        this.csD.b(18, (byte)n2);
    }

    @Override
    public ab a(e e2, ab ab2) {
        ab2 = super.a(e2, ab2);
        int n2 = this.ta.nextInt(6);
        boolean bl2 = false;
        if (ab2 instanceof t) {
            n2 = ((t)ab2).cGU;
            bl2 = true;
        } else {
            ab2 = new t(n2);
        }
        this.fz(n2);
        if (bl2) {
            this.eC(-24000);
        }
        return ab2;
    }

    private boolean aaZ() {
        return this.cGA == 0;
    }

    protected int aba() {
        return this.cGz.getDuration();
    }

    protected void abb() {
        this.baU.a(as.dxI, this.gW + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, this.gX + 0.5 + (double)(this.ta.nextFloat() * this.height), this.gY + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, 0.0, 0.0, 0.0, Block.a(Blocks.cOd.aM(7)));
        this.cGA = 100;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 1) {
            this.TK();
            this.cGv = 10;
            this.cGu = 0;
        } else {
            super.a(by2);
        }
    }

    @Override
    public /* synthetic */ h a(h h2) {
        return this.g(h2);
    }
}

