/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.ag;
import net.minecraft.entity.ai.au;
import net.minecraft.entity.ai.b;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.i;
import net.minecraft.entity.ai.v;
import net.minecraft.entity.ai.z;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.effect.a;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.monster.ah;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.world.w;

public class d
extends aa {
    private int cDV;
    private int cDW;
    private int cDX = 30;
    private int cDY = 3;
    private int cDZ = 0;

    public d(w w2) {
        super(w2);
        this.ctS.a(1, new au(this));
        this.ctS.a(2, new i(this));
        this.ctS.a(3, new net.minecraft.entity.ai.c<net.minecraft.entity.passive.j>(this, net.minecraft.entity.passive.j.class, 6.0f, 1.0, 1.2));
        this.ctS.a(4, new b(this, 1.0, false));
        this.ctS.a(5, new bd(this, 0.8));
        this.ctS.a(6, new be(this, net.minecraft.entity.player.a.class, 8.0f));
        this.ctS.a(6, new z(this));
        this.ctT.a(1, new ag<net.minecraft.entity.player.a>((j)this, net.minecraft.entity.player.a.class, true));
        this.ctT.a(2, new v((j)this, false, new Class[0]));
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwp).ap(0.25);
    }

    @Override
    public int Ug() {
        return this.UW() == null ? 3 : 3 + (int)(this.getHealth() - 1.0f);
    }

    @Override
    public void q(float f2, float f3) {
        super.q(f2, f3);
        this.cDW = (int)((float)this.cDW + f2 * 1.5f);
        if (this.cDW > this.cDX - 5) {
            this.cDW = this.cDX - 5;
        }
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, (byte)-1);
        this.csD.a(17, (byte)0);
        this.csD.a(18, (byte)0);
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        if (this.csD.el(17) == 1) {
            n2.o("powered", true);
        }
        n2.a("Fuse", (short)this.cDX);
        n2.a("ExplosionRadius", (byte)this.cDY);
        n2.o("ignited", this.Zd());
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        this.csD.b(17, (byte)(n2.eO("powered") ? 1 : 0));
        if (n2.C("Fuse", 99)) {
            this.cDX = n2.eF("Fuse");
        }
        if (n2.C("ExplosionRadius", 99)) {
            this.cDY = n2.eE("ExplosionRadius");
        }
        if (n2.eO("ignited")) {
            this.YR();
        }
    }

    @Override
    public void Dm() {
        if (this.TS()) {
            int n2;
            this.cDV = this.cDW;
            if (this.Zd()) {
                this.fm(1);
            }
            if ((n2 = this.Zc()) > 0 && this.cDW == 0) {
                this.a("creeper.primed", 1.0f, 0.5f);
            }
            this.cDW += n2;
            if (this.cDW < 0) {
                this.cDW = 0;
            }
            if (this.cDW >= this.cDX) {
                this.cDW = this.cDX;
                this.YV();
            }
        }
        super.Dm();
    }

    @Override
    protected String VN() {
        return "mob.creeper.say";
    }

    @Override
    protected String VO() {
        return "mob.creeper.death";
    }

    @Override
    public void b(ad ad2) {
        super.b(ad2);
        if (ad2.dk() instanceof ah) {
            int n2 = net.minecraft.item.d.p(Items.cSu);
            int n3 = net.minecraft.item.d.p(Items.cSF);
            int n4 = n2 + this.ta.nextInt(n3 - n2 + 1);
            this.d(net.minecraft.item.d.fT(n4), 1);
        } else if (ad2.dk() instanceof d && ad2.dk() != this && ((d)ad2.dk()).Zb() && ((d)ad2.dk()).Ze()) {
            ((d)ad2.dk()).Zf();
            this.a(new co(Items.cSb, 1, 4), 0.0f);
        }
    }

    @Override
    public boolean ag(c c2) {
        return true;
    }

    public boolean Zb() {
        return this.csD.el(17) == 1;
    }

    public float bf(float f2) {
        return ((float)this.cDV + (float)(this.cDW - this.cDV) * f2) / (float)(this.cDX - 2);
    }

    @Override
    protected net.minecraft.item.d Vc() {
        return Items.cPL;
    }

    public int Zc() {
        return this.csD.el(16);
    }

    public void fm(int n2) {
        this.csD.b(16, (byte)n2);
    }

    @Override
    public void b(a a2) {
        super.b(a2);
        this.csD.b(17, (byte)1);
    }

    @Override
    protected boolean q(net.minecraft.entity.player.a a2) {
        co co2 = a2.cHV.acE();
        if (co2 != null && co2.bP() == Items.cPh) {
            this.baU.a(this.gW + 0.5, this.gX + 0.5, this.gY + 0.5, "fire.ignite", 1.0f, this.ta.nextFloat() * 0.4f + 0.8f);
            a2.swingItem();
            if (!this.baU.dDw) {
                this.YR();
                co2.b(1, (r)a2);
                return true;
            }
        }
        return super.q(a2);
    }

    private void YV() {
        if (!this.baU.dDw) {
            boolean bl2 = this.baU.Si().gw("mobGriefing");
            float f2 = this.Zb() ? 2.0f : 1.0f;
            this.baU.a(this, this.gW, this.gX, this.gY, (float)this.cDY * f2, bl2);
            this.Tt();
        }
    }

    public boolean Zd() {
        return this.csD.el(18) != 0;
    }

    public void YR() {
        this.csD.b(18, (byte)1);
    }

    public boolean Ze() {
        return this.cDZ < 1 && this.baU.Si().gw("doMobLoot");
    }

    public void Zf() {
        ++this.cDZ;
    }
}

