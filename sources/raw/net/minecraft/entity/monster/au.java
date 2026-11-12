/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.monster;

import com.google.common.base.Predicate;
import java.util.Calendar;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.ac;
import net.minecraft.entity.ai.ae;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.entity.ai.attributes.e;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.v;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.monster.ab;
import net.minecraft.entity.monster.av;
import net.minecraft.entity.monster.d;
import net.minecraft.entity.monster.w;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.entity.z;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.pathfinding.f;
import net.minecraft.util.ad;
import net.minecraft.util.ah;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.g;

public class au
extends aa {
    protected static final net.minecraft.entity.ai.attributes.d cFp = new net.minecraft.entity.ai.attributes.g(null, "zombie.spawnReinforcements", 0.0, 0.0, 1.0).eg("Spawn Reinforcements Chance");
    private static final UUID cFq = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
    private static final a cFr = new a(cFq, "Baby speed boost", 0.5, 1);
    private final net.minecraft.entity.ai.g cFs = new net.minecraft.entity.ai.g(this);
    private int cFt;
    private boolean cFu = false;
    private float cFv = -1.0f;
    private float cFw;

    public au(net.minecraft.world.w w2) {
        super(w2);
        ((f)this.UU()).bR(true);
        this.ctS.a(0, new net.minecraft.entity.ai.au(this));
        this.ctS.a(2, new net.minecraft.entity.ai.b(this, net.minecraft.entity.player.a.class, 1.0, false));
        this.ctS.a(5, new ae(this, 1.0));
        this.ctS.a(7, new bd(this, 1.0));
        this.ctS.a(8, new be(this, net.minecraft.entity.player.a.class, 8.0f));
        this.ctS.a(8, new net.minecraft.entity.ai.z(this));
        this.ZE();
        this.o(0.6f, 1.95f);
    }

    protected void ZE() {
        this.ctS.a(4, new net.minecraft.entity.ai.b(this, net.minecraft.entity.passive.z.class, 1.0, true));
        this.ctS.a(4, new net.minecraft.entity.ai.b(this, w.class, 1.0, true));
        this.ctS.a(6, new ac(this, 1.0, false));
        this.ctT.a(1, new v((j)this, true, ab.class));
        this.ctT.a(2, new ag<net.minecraft.entity.player.a>((j)this, net.minecraft.entity.player.a.class, true));
        this.ctT.a(2, new ag<net.minecraft.entity.passive.z>((j)this, net.minecraft.entity.passive.z.class, false));
        this.ctT.a(2, new ag<w>((j)this, w.class, true));
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwn).ap(35.0);
        this.a(aj.cwp).ap(0.23f);
        this.a(aj.cwq).ap(3.0);
        this.VX().c(cFp).ap(this.ta.nextDouble() * (double)0.1f);
    }

    @Override
    protected void IA() {
        super.IA();
        this.Tp().a(12, (byte)0);
        this.Tp().a(13, (byte)0);
        this.Tp().a(14, (byte)0);
    }

    @Override
    public int VQ() {
        int n2 = super.VQ() + 2;
        if (n2 > 20) {
            n2 = 20;
        }
        return n2;
    }

    public boolean ZN() {
        return this.cFu;
    }

    public void bj(boolean bl2) {
        if (this.cFu != bl2) {
            this.cFu = bl2;
            if (bl2) {
                this.ctS.a(1, this.cFs);
            } else {
                this.ctS.a(this.cFs);
            }
        }
    }

    @Override
    public boolean Uz() {
        return this.Tp().el(12) == 1;
    }

    @Override
    protected int r(net.minecraft.entity.player.a a2) {
        if (this.Uz()) {
            this.ctM = (int)((float)this.ctM * 2.5f);
        }
        return super.r(a2);
    }

    public void bk(boolean bl2) {
        this.Tp().b(12, (byte)(bl2 ? 1 : 0));
        if (this.baU != null && !this.baU.dDw) {
            e e2 = this.a(aj.cwp);
            e2.d(cFr);
            if (bl2) {
                e2.c(cFr);
            }
        }
        this.bm(bl2);
    }

    public boolean ZO() {
        return this.Tp().el(13) == 1;
    }

    public void bl(boolean bl2) {
        this.Tp().b(13, (byte)(bl2 ? 1 : 0));
    }

    @Override
    public void Dn() {
        if (this.baU.avr() && !this.baU.dDw && !this.Uz()) {
            float f2 = this.ag(1.0f);
            b b2 = new b(this.gW, Math.round(this.gX), this.gY);
            if (f2 > 0.5f && this.ta.nextFloat() * 30.0f < (f2 - 0.4f) * 2.0f && this.baU.aM(b2)) {
                boolean bl2 = true;
                co co2 = this.eG(4);
                if (co2 != null) {
                    if (co2.aed()) {
                        co2.gf(co2.aef() + this.ta.nextInt(2));
                        if (co2.aef() >= co2.adt()) {
                            this.X(co2);
                            this.c(4, (co)null);
                        }
                    }
                    bl2 = false;
                }
                if (bl2) {
                    this.ev(8);
                }
            }
        }
        if (this.isRiding() && this.UW() != null && this.crC instanceof net.minecraft.entity.passive.d) {
            ((p)this.crC).UU().a(this.UU().aiH(), 1.5);
        }
        super.Dn();
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (super.a(ad2, f2)) {
            r r2 = this.UW();
            if (r2 == null && ad2.dk() instanceof r) {
                r2 = (r)ad2.dk();
            }
            if (r2 != null && this.baU.agm() == net.minecraft.world.f.dBU && (double)this.ta.nextFloat() < this.a(cFp).XB()) {
                int n2 = bt.aF(this.gW);
                int n3 = bt.aF(this.gX);
                int n4 = bt.aF(this.gY);
                au au2 = new au(this.baU);
                for (int i2 = 0; i2 < 50; ++i2) {
                    int n5;
                    int n6;
                    int n7 = n2 + bt.b(this.ta, 7, 40) * bt.b(this.ta, -1, 1);
                    if (!net.minecraft.world.w.v(this.baU, new b(n7, (n6 = n3 + bt.b(this.ta, 7, 40) * bt.b(this.ta, -1, 1)) - 1, n5 = n4 + bt.b(this.ta, 7, 40) * bt.b(this.ta, -1, 1))) || this.baU.aP(new b(n7, n6, n5)) >= 10) continue;
                    au2.setPosition(n7, n6, n5);
                    if (this.baU.p(n7, n6, n5, 7.0) || !this.baU.a(au2.Us(), (c)au2) || !this.baU.a((c)au2, au2.Us()).isEmpty() || this.baU.u(au2.Us())) continue;
                    this.baU.G(au2);
                    au2.S(r2);
                    au2.a(this.baU.bg(new b(au2)), null);
                    this.a(cFp).c(new a("Zombie reinforcement caller charge", -0.05f, 0));
                    au2.a(cFp).c(new a("Zombie reinforcement callee charge", -0.05f, 0));
                    break;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void Dm() {
        if (!this.baU.dDw && this.ZP()) {
            int n2 = this.ZR();
            this.cFt -= n2;
            if (this.cFt <= 0) {
                this.ZQ();
            }
        }
        super.Dm();
    }

    @Override
    public boolean ag(c c2) {
        boolean bl2 = super.ag(c2);
        if (bl2) {
            int n2 = this.baU.agm().auZ();
            if (this.Vk() == null && this.isBurning() && this.ta.nextFloat() < (float)n2 * 0.3f) {
                c2.ev(2 * n2);
            }
        }
        return bl2;
    }

    @Override
    protected String Vb() {
        return "mob.zombie.say";
    }

    @Override
    protected String VN() {
        return "mob.zombie.hurt";
    }

    @Override
    protected String VO() {
        return "mob.zombie.death";
    }

    @Override
    protected void a(b b2, Block block) {
        this.a("mob.zombie.step", 0.15f, 1.0f);
    }

    @Override
    protected net.minecraft.item.d Vc() {
        return Items.cRx;
    }

    @Override
    public z VY() {
        return z.cvU;
    }

    @Override
    protected void VP() {
        switch (this.ta.nextInt(3)) {
            case 0: {
                this.d(Items.cPn, 1);
                break;
            }
            case 1: {
                this.d(Items.cRV, 1);
                break;
            }
            case 2: {
                this.d(Items.cRW, 1);
            }
        }
    }

    @Override
    protected void a(net.minecraft.world.e e2) {
        super.a(e2);
        float f2 = this.ta.nextFloat();
        float f3 = this.baU.agm() == net.minecraft.world.f.dBU ? 0.05f : 0.01f;
        if (f2 < f3) {
            int n2 = this.ta.nextInt(3);
            if (n2 == 0) {
                this.c(0, new co(Items.cPp));
            } else {
                this.c(0, new co(Items.cPe));
            }
        }
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        if (this.Uz()) {
            n2.o("IsBaby", true);
        }
        if (this.ZO()) {
            n2.o("IsVillager", true);
        }
        n2.B("ConversionTime", this.ZP() ? this.cFt : -1);
        n2.o("CanBreakDoors", this.ZN());
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        if (n2.eO("IsBaby")) {
            this.bk(true);
        }
        if (n2.eO("IsVillager")) {
            this.bl(true);
        }
        if (n2.C("ConversionTime", 99) && n2.eG("ConversionTime") > -1) {
            this.fr(n2.eG("ConversionTime"));
        }
        this.bj(n2.eO("CanBreakDoors"));
    }

    @Override
    public void R(r r2) {
        super.R(r2);
        if ((this.baU.agm() == net.minecraft.world.f.dBT || this.baU.agm() == net.minecraft.world.f.dBU) && r2 instanceof net.minecraft.entity.passive.z) {
            if (this.baU.agm() != net.minecraft.world.f.dBU && this.ta.nextBoolean()) {
                return;
            }
            p p2 = (p)r2;
            au au2 = new au(this.baU);
            au2.Y(r2);
            this.baU.H(r2);
            au2.a(this.baU.bg(new b(au2)), null);
            au2.bl(true);
            if (r2.Uz()) {
                au2.bk(true);
            }
            au2.aJ(p2.Vt());
            if (p2.xV()) {
                au2.ec(p2.Un());
                au2.aF(p2.Uo());
            }
            this.baU.G(au2);
            this.baU.b(null, 1016, new b((int)this.gW, (int)this.gX, (int)this.gY), 0);
        }
    }

    @Override
    public float getEyeHeight() {
        float f2 = 1.74f;
        if (this.Uz()) {
            f2 = (float)((double)f2 - 0.81);
        }
        return f2;
    }

    @Override
    protected boolean V(co co2) {
        return (co2.bP() != Items.cQT || !this.Uz() || !this.isRiding()) && super.V(co2);
    }

    @Override
    public net.minecraft.entity.ab a(net.minecraft.world.e e2, net.minecraft.entity.ab ab2) {
        Object object;
        ab2 = super.a(e2, ab2);
        float f2 = e2.auY();
        this.aI(this.ta.nextFloat() < 0.55f * f2);
        if (ab2 == null) {
            ab2 = new av(this, this.baU.dDk.nextFloat() < 0.05f, this.baU.dDk.nextFloat() < 0.05f);
        }
        if (ab2 instanceof av) {
            object = (av)ab2;
            if (((av)object).cFx) {
                this.bl(true);
            }
            if (((av)object).byp) {
                this.bk(true);
                if ((double)this.baU.dDk.nextFloat() < 0.05) {
                    Predicate<c> predicate = this.baU.a(net.minecraft.entity.passive.d.class, this.Us().ad(5.0, 3.0, 5.0), ah.dvH);
                    if (!predicate.isEmpty()) {
                        net.minecraft.entity.passive.d d2 = (net.minecraft.entity.passive.d)predicate.get(0);
                        d2.bo(true);
                        this.D(d2);
                    }
                } else if ((double)this.baU.dDk.nextFloat() < 0.05) {
                    net.minecraft.entity.passive.d d3 = new net.minecraft.entity.passive.d(this.baU);
                    d3.b(this.gW, this.gX, this.gY, this.pl, 0.0f);
                    d3.a(e2, null);
                    d3.bo(true);
                    this.baU.G(d3);
                    this.D(d3);
                }
            }
        }
        this.bj(this.ta.nextFloat() < f2 * 0.1f);
        this.a(e2);
        this.b(e2);
        if (this.eG(4) == null && ((Calendar)(object = this.baU.avO())).get(2) + 1 == 10 && ((Calendar)object).get(5) == 31 && this.ta.nextFloat() < 0.25f) {
            this.c(4, new co(this.ta.nextFloat() < 0.1f ? Blocks.cNb : Blocks.cMW));
            this.ctX[4] = 0.0f;
        }
        this.a(aj.cwo).c(new a("Random spawn bonus", this.ta.nextDouble() * (double)0.05f, 0));
        double d4 = this.ta.nextDouble() * 1.5 * (double)f2;
        if (d4 > 1.0) {
            this.a(aj.cwn).c(new a("Random zombie-spawn bonus", d4, 2));
        }
        if (this.ta.nextFloat() < f2 * 0.05f) {
            this.a(cFp).c(new a("Leader zombie bonus", this.ta.nextDouble() * 0.25 + 0.5, 0));
            this.a(aj.cwm).c(new a("Leader zombie bonus", this.ta.nextDouble() * 3.0 + 1.0, 2));
            this.bj(true);
        }
        return ab2;
    }

    @Override
    public boolean q(net.minecraft.entity.player.a a2) {
        co co2 = a2.abO();
        if (co2 != null && co2.bP() == Items.cQs && co2.yc() == 0 && this.ZO() && this.a(net.minecraft.potion.a.dgN)) {
            if (!a2.cIt.cJM) {
                --co2.cWZ;
            }
            if (co2.cWZ <= 0) {
                a2.cHV.g(a2.cHV.cJE, null);
            }
            if (!this.baU.dDw) {
                this.fr(this.ta.nextInt(2401) + 3600);
            }
            return true;
        }
        return false;
    }

    protected void fr(int n2) {
        this.cFt = n2;
        this.Tp().b(14, (byte)1);
        this.eL(net.minecraft.potion.a.dgN.dhb);
        this.b(new net.minecraft.potion.d(net.minecraft.potion.a.dgA.dhb, n2, Math.min(this.baU.agm().auZ() - 1, 0)));
        this.baU.a((c)this, (byte)16);
    }

    @Override
    public void a(byte by2) {
        if (by2 == 16) {
            if (!this.TE()) {
                this.baU.a(this.gW + 0.5, this.gX + 0.5, this.gY + 0.5, "mob.zombie.remedy", 1.0f + this.ta.nextFloat(), this.ta.nextFloat() * 0.7f + 0.3f, false);
            }
        } else {
            super.a(by2);
        }
    }

    @Override
    protected boolean Vd() {
        return !this.ZP();
    }

    public boolean ZP() {
        return this.Tp().el(14) == 1;
    }

    protected void ZQ() {
        net.minecraft.entity.passive.z z2 = new net.minecraft.entity.passive.z(this.baU);
        z2.Y(this);
        z2.a(this.baU.bg(new b(z2)), null);
        z2.abv();
        if (this.Uz()) {
            z2.eC(-24000);
        }
        this.baU.H(this);
        z2.aJ(this.Vt());
        if (this.xV()) {
            z2.ec(this.Un());
            z2.aF(this.Uo());
        }
        this.baU.G(z2);
        z2.b(new net.minecraft.potion.d(net.minecraft.potion.a.dgE.dhb, 200, 0));
        this.baU.b(null, 1017, new b((int)this.gW, (int)this.gX, (int)this.gY), 0);
    }

    protected int ZR() {
        int n2 = 1;
        if (this.ta.nextFloat() < 0.01f) {
            int n3 = 0;
            g g2 = new g();
            for (int i2 = (int)this.gW - 4; i2 < (int)this.gW + 4 && n3 < 14; ++i2) {
                for (int i3 = (int)this.gX - 4; i3 < (int)this.gX + 4 && n3 < 14; ++i3) {
                    for (int i4 = (int)this.gY - 4; i4 < (int)this.gY + 4 && n3 < 14; ++i4) {
                        Block block = this.baU.L(g2.E(i2, i3, i4)).df();
                        if (block != Blocks.cNk && block != Blocks.cLE) continue;
                        if (this.ta.nextFloat() < 0.3f) {
                            ++n2;
                        }
                        ++n3;
                    }
                }
            }
        }
        return n2;
    }

    public void bm(boolean bl2) {
        this.bj(bl2 ? 0.5f : 1.0f);
    }

    @Override
    public final void o(float f2, float f3) {
        boolean bl2 = this.cFv > 0.0f && this.cFw > 0.0f;
        this.cFv = f2;
        this.cFw = f3;
        if (!bl2) {
            this.bj(1.0f);
        }
    }

    protected final void bj(float f2) {
        super.o(this.cFv * f2, this.cFw * f2);
    }

    @Override
    public double LJ() {
        return this.Uz() ? 0.0 : -0.35;
    }

    @Override
    public void b(ad ad2) {
        super.b(ad2);
        if (ad2.dk() instanceof d && !(this instanceof ab) && ((d)ad2.dk()).Zb() && ((d)ad2.dk()).Ze()) {
            ((d)ad2.dk()).Zf();
            this.a(new co(Items.cSb, 1, 2), 0.0f);
        }
    }
}

