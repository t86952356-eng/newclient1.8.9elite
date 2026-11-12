/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import java.util.Calendar;
import net.minecraft.block.Block;
import net.minecraft.enchantment.a;
import net.minecraft.enchantment.l;
import net.minecraft.entity.ab;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.ai.ar;
import net.minecraft.entity.ai.au;
import net.minecraft.entity.ai.b;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.q;
import net.minecraft.entity.ai.v;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.monster.d;
import net.minecraft.entity.monster.w;
import net.minecraft.entity.passive.ai;
import net.minecraft.entity.r;
import net.minecraft.entity.z;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.world.ae;
import net.minecraft.world.e;

public class ah
extends aa
implements net.minecraft.entity.ah {
    private final net.minecraft.entity.ai.a cET = new net.minecraft.entity.ai.a(this, 1.0, 20, 60, 15.0f);
    private final b cEU = new b(this, net.minecraft.entity.player.a.class, 1.2, false);

    public ah(net.minecraft.world.w w2) {
        super(w2);
        this.ctS.a(1, new au(this));
        this.ctS.a(2, new ar(this));
        this.ctS.a(3, new q(this, 1.0));
        this.ctS.a(3, new net.minecraft.entity.ai.c<ai>(this, ai.class, 6.0f, 1.0, 1.2));
        this.ctS.a(4, new bd(this, 1.0));
        this.ctS.a(6, new be(this, net.minecraft.entity.player.a.class, 8.0f));
        this.ctS.a(6, new net.minecraft.entity.ai.z(this));
        this.ctT.a(1, new v((j)this, false, new Class[0]));
        this.ctT.a(2, new ag<net.minecraft.entity.player.a>((j)this, net.minecraft.entity.player.a.class, true));
        this.ctT.a(3, new ag<w>((j)this, w.class, true));
        if (w2 != null && !w2.dDw) {
            this.ZH();
        }
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwp).ap(0.25);
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(13, new Byte(0));
    }

    @Override
    protected String Vb() {
        return "mob.skeleton.say";
    }

    @Override
    protected String VN() {
        return "mob.skeleton.hurt";
    }

    @Override
    protected String VO() {
        return "mob.skeleton.death";
    }

    @Override
    protected void a(net.minecraft.util.b b2, Block block) {
        this.a("mob.skeleton.step", 0.15f, 1.0f);
    }

    @Override
    public boolean ag(c c2) {
        if (super.ag(c2)) {
            if (this.ZI() == 1 && c2 instanceof r) {
                ((r)c2).b(new net.minecraft.potion.d(net.minecraft.potion.a.dgP.id, 200));
            }
            return true;
        }
        return false;
    }

    @Override
    public z VY() {
        return z.cvU;
    }

    @Override
    public void Dn() {
        if (this.baU.avr() && !this.baU.dDw) {
            float f2 = this.ag(1.0f);
            net.minecraft.util.b b2 = new net.minecraft.util.b(this.gW, Math.round(this.gX), this.gY);
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
        if (this.baU.dDw && this.ZI() == 1) {
            this.o(0.72f, 2.535f);
        }
        super.Dn();
    }

    @Override
    public void TU() {
        super.TU();
        if (this.crC instanceof j) {
            j j2 = (j)this.crC;
            this.cuF = j2.cuF;
        }
    }

    @Override
    public void b(ad ad2) {
        super.b(ad2);
        if (ad2.asf() instanceof net.minecraft.entity.projectile.a && ad2.dk() instanceof net.minecraft.entity.player.a) {
            net.minecraft.entity.player.a a2 = (net.minecraft.entity.player.a)ad2.dk();
            double d2 = a2.gW - this.gW;
            double d3 = a2.gY - this.gY;
            if (d2 * d2 + d3 * d3 >= 2500.0) {
                a2.a(net.minecraft.stats.b.doU);
            }
        } else if (ad2.dk() instanceof d && ((d)ad2.dk()).Zb() && ((d)ad2.dk()).Ze()) {
            ((d)ad2.dk()).Zf();
            this.a(new co(Items.cSb, 1, this.ZI() == 1 ? 1 : 0), 0.0f);
        }
    }

    @Override
    protected net.minecraft.item.d Vc() {
        return Items.cPk;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        int n3;
        int n4;
        if (this.ZI() == 1) {
            n4 = this.ta.nextInt(3 + n2) - 1;
            for (n3 = 0; n3 < n4; ++n3) {
                this.d(Items.cPl, 1);
            }
        } else {
            n4 = this.ta.nextInt(3 + n2);
            for (n3 = 0; n3 < n4; ++n3) {
                this.d(Items.cPk, 1);
            }
        }
        n4 = this.ta.nextInt(3 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            this.d(Items.cRb, 1);
        }
    }

    @Override
    protected void VP() {
        if (this.ZI() == 1) {
            this.a(new co(Items.cSb, 1, 1), 0.0f);
        }
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        this.c(0, new co(Items.cPj));
    }

    @Override
    public ab a(e e2, ab ab2) {
        Calendar calendar;
        ab2 = super.a(e2, ab2);
        if (this.baU.dDl instanceof ae && this.VB().nextInt(5) > 0) {
            this.ctS.a(4, this.cEU);
            this.fp(1);
            this.c(0, new co(Items.cPu));
            this.a(aj.cwq).ap(4.0);
        } else {
            this.ctS.a(4, this.cET);
            this.a(e2);
            this.b(e2);
        }
        this.aI(this.ta.nextFloat() < 0.55f * e2.auY());
        if (this.eG(4) == null && (calendar = this.baU.avO()).get(2) + 1 == 10 && calendar.get(5) == 31 && this.ta.nextFloat() < 0.25f) {
            this.c(4, new co(this.ta.nextFloat() < 0.1f ? Blocks.cNb : Blocks.cMW));
            this.ctX[4] = 0.0f;
        }
        return ab2;
    }

    public void ZH() {
        this.ctS.a(this.cEU);
        this.ctS.a(this.cET);
        co co2 = this.Vk();
        if (co2 != null && co2.bP() == Items.cPj) {
            this.ctS.a(4, this.cET);
        } else {
            this.ctS.a(4, this.cEU);
        }
    }

    @Override
    public void g(r r2, float f2) {
        net.minecraft.entity.projectile.a a2 = new net.minecraft.entity.projectile.a(this.baU, this, r2, 1.6f, 14 - this.baU.agm().auZ() * 4);
        int n2 = l.d(a.cqq.cqw, this.Vk());
        int n3 = l.d(a.cqr.cqw, this.Vk());
        a2.at((double)(f2 * 2.0f) + this.ta.nextGaussian() * 0.25 + (double)((float)this.baU.agm().auZ() * 0.11f));
        if (n2 > 0) {
            a2.at(a2.acK() + (double)n2 * 0.5 + 0.5);
        }
        if (n3 > 0) {
            a2.fK(n3);
        }
        if (l.d(a.cqs.cqw, this.Vk()) > 0 || this.ZI() == 1) {
            a2.ev(100);
        }
        this.a("random.bow", 1.0f, 1.0f / (this.VB().nextFloat() * 0.4f + 0.8f));
        this.baU.G(a2);
    }

    public int ZI() {
        return this.csD.el(13);
    }

    public void fp(int n2) {
        this.csD.b(13, (byte)n2);
        boolean bl2 = this.csC = n2 == 1;
        if (n2 == 1) {
            this.o(0.72f, 2.535f);
        } else {
            this.o(0.6f, 1.95f);
        }
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        if (n2.C("SkeletonType", 99)) {
            byte by2 = n2.eE("SkeletonType");
            this.fp(by2);
        }
        this.ZH();
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.a("SkeletonType", (byte)this.ZI());
    }

    @Override
    public void c(int n2, co co2) {
        super.c(n2, co2);
        if (!this.baU.dDw && n2 == 0) {
            this.ZH();
        }
    }

    @Override
    public float getEyeHeight() {
        return this.ZI() == 1 ? super.getEyeHeight() : 1.74f;
    }

    @Override
    public double LJ() {
        return this.Uz() ? 0.0 : -0.35;
    }
}

