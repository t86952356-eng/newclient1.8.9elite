/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ab;
import net.minecraft.entity.ai.m;
import net.minecraft.entity.ai.o;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.aj;
import net.minecraft.entity.monster.ak;
import net.minecraft.entity.monster.al;
import net.minecraft.entity.monster.am;
import net.minecraft.entity.monster.an;
import net.minecraft.entity.monster.aw;
import net.minecraft.entity.monster.w;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.ap;
import net.minecraft.world.biome.j;
import net.minecraft.world.chunk.a;
import net.minecraft.world.e;
import net.minecraft.world.f;

public class ai
extends p
implements aw {
    public float cEV;
    public float cEW;
    public float cEX;
    private boolean cEY;

    public ai(net.minecraft.world.w w2) {
        super(w2);
        this.ctO = new an(this);
        this.ctS.a(1, new al(this));
        this.ctS.a(2, new aj(this));
        this.ctS.a(3, new ak(this));
        this.ctS.a(5, new am(this));
        this.ctT.a(1, new o(this));
        this.ctT.a(3, new m(this, w.class));
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, (byte)1);
    }

    protected void fq(int n2) {
        this.csD.b(16, (byte)n2);
        this.o(0.51000005f * (float)n2, 0.51000005f * (float)n2);
        this.setPosition(this.gW, this.gX, this.gY);
        this.a(net.minecraft.entity.aj.cwm).ap(n2 * n2);
        this.a(net.minecraft.entity.aj.cwp).ap(0.2f + 0.1f * (float)n2);
        this.aY(this.getMaxHealth());
        this.ctM = n2;
    }

    public int ZJ() {
        return this.csD.el(16);
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.B("Size", this.ZJ() - 1);
        n2.o("wasOnGround", this.cEY);
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        int n3 = n2.eG("Size");
        if (n3 < 0) {
            n3 = 0;
        }
        this.fq(n3 + 1);
        this.cEY = n2.eO("wasOnGround");
    }

    protected as Zw() {
        return as.dxD;
    }

    protected String ZC() {
        return "mob.slime." + (this.ZJ() > 1 ? "big" : "small");
    }

    @Override
    public void Dm() {
        if (!this.baU.dDw && this.baU.agm() == f.dBR && this.ZJ() > 0) {
            this.csb = true;
        }
        this.cEW += (this.cEV - this.cEW) * 0.5f;
        this.cEX = this.cEW;
        super.Dm();
        if (this.aO && !this.cEY) {
            int n2 = this.ZJ();
            for (int i2 = 0; i2 < n2 * 8; ++i2) {
                float f2 = this.ta.nextFloat() * (float)Math.PI * 2.0f;
                float f3 = this.ta.nextFloat() * 0.5f + 0.5f;
                float f4 = bt.bx(f2) * (float)n2 * 0.5f * f3;
                float f5 = bt.bB(f2) * (float)n2 * 0.5f * f3;
                net.minecraft.world.w w2 = this.baU;
                as as2 = this.Zw();
                double d2 = this.gW + (double)f4;
                double d3 = this.gY + (double)f5;
                w2.a(as2, d2, this.Us().dtI, d3, 0.0, 0.0, 0.0, new int[0]);
            }
            if (this.ZD()) {
                this.a(this.ZC(), this.VZ(), ((this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f + 1.0f) / 0.8f);
            }
            this.cEV = -0.5f;
        } else if (!this.aO && this.cEY) {
            this.cEV = 1.0f;
        }
        this.cEY = this.aO;
        this.Zz();
    }

    protected void Zz() {
        this.cEV *= 0.6f;
    }

    protected int Zy() {
        return this.ta.nextInt(20) + 10;
    }

    protected ai Zx() {
        return new ai(this.baU);
    }

    @Override
    public void eA(int n2) {
        if (n2 == 16) {
            int n3 = this.ZJ();
            this.o(0.51000005f * (float)n3, 0.51000005f * (float)n3);
            this.pl = this.pn;
            this.cuF = this.pn;
            if (this.isInWater() && this.ta.nextInt(20) == 0) {
                this.TI();
            }
        }
        super.eA(n2);
    }

    @Override
    public void Tt() {
        int n2 = this.ZJ();
        if (!this.baU.dDw && n2 > 1 && this.getHealth() <= 0.0f) {
            int n3 = 2 + this.ta.nextInt(3);
            for (int i2 = 0; i2 < n3; ++i2) {
                float f2 = ((float)(i2 % 2) - 0.5f) * (float)n2 / 4.0f;
                float f3 = ((float)(i2 / 2) - 0.5f) * (float)n2 / 4.0f;
                ai ai2 = this.Zx();
                if (this.xV()) {
                    ai2.ec(this.Un());
                }
                if (this.Vo()) {
                    ai2.Vm();
                }
                ai2.fq(n2 / 2);
                ai2.b(this.gW + (double)f2, this.gX + 0.5, this.gY + (double)f3, this.ta.nextFloat() * 360.0f, 0.0f);
                this.baU.G(ai2);
            }
        }
        super.Tt();
    }

    @Override
    public void U(c c2) {
        super.U(c2);
        if (c2 instanceof w && this.ZA()) {
            this.Y((r)c2);
        }
    }

    @Override
    public void n(net.minecraft.entity.player.a a2) {
        if (this.ZA()) {
            this.Y(a2);
        }
    }

    protected void Y(r r2) {
        int n2 = this.ZJ();
        if (this.ai(r2) && this.T((c)r2) < 0.6 * (double)n2 * 0.6 * (double)n2 && r2.a(ad.ac(this), (float)this.ZB())) {
            this.a("mob.attack", 1.0f, (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f + 1.0f);
            this.c(this, r2);
        }
    }

    @Override
    public float getEyeHeight() {
        return 0.625f * this.height;
    }

    protected boolean ZA() {
        return this.ZJ() > 1;
    }

    protected int ZB() {
        return this.ZJ();
    }

    @Override
    protected String VN() {
        return "mob.slime." + (this.ZJ() > 1 ? "big" : "small");
    }

    @Override
    protected String VO() {
        return "mob.slime." + (this.ZJ() > 1 ? "big" : "small");
    }

    @Override
    protected d Vc() {
        return this.ZJ() == 1 ? Items.cQQ : null;
    }

    @Override
    public boolean UB() {
        b b2 = new b(bt.aF(this.gW), 0, bt.aF(this.gY));
        a a2 = this.baU.aK(b2);
        if (this.baU.avH().awC() == net.minecraft.world.ap.dEE && this.ta.nextInt(4) != 1) {
            return false;
        }
        if (this.baU.agm() != f.dBR) {
            j j2 = this.baU.aF(b2);
            if (j2 == j.dGl && this.gX > 50.0 && this.gX < 70.0 && this.ta.nextFloat() < 0.5f && this.ta.nextFloat() < this.baU.avt() && this.baU.aP(new b(this)) <= this.ta.nextInt(8)) {
                return super.UB();
            }
            if (this.ta.nextInt(10) == 0 && a2.L(987234911L).nextInt(10) == 0 && this.gX < 40.0) {
                return super.UB();
            }
        }
        return false;
    }

    @Override
    protected float VZ() {
        return 0.4f * (float)this.ZJ();
    }

    @Override
    public int Vg() {
        return 0;
    }

    protected boolean ZK() {
        return this.ZJ() > 0;
    }

    protected boolean ZD() {
        return this.ZJ() > 2;
    }

    @Override
    protected void jump() {
        this.ue = 0.42f;
        this.csL = true;
    }

    @Override
    public ab a(e e2, ab ab2) {
        int n2 = this.ta.nextInt(3);
        if (n2 < 2 && this.ta.nextFloat() < 0.5f * e2.auY()) {
            ++n2;
        }
        int n3 = 1 << n2;
        this.fq(n3);
        return super.a(e2, ab2);
    }
}

