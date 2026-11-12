/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.block.material.Material;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.stats.b;
import net.minecraft.util.ad;
import net.minecraft.util.bt;
import net.minecraft.util.cr;
import net.minecraft.world.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class i
extends c {
    private static final Logger cCr = LogManager.getLogger();
    private int bGQ;
    private int cCs;
    private int cCf = 5;
    private String cCt;
    private String ej;
    public float cCu = (float)(Math.random() * Math.PI * 2.0);

    public i(w w2, double d2, double d3, double d4) {
        super(w2);
        this.o(0.25f, 0.25f);
        this.setPosition(d2, d3, d4);
        this.pl = (float)(Math.random() * 360.0);
        this.ud = (float)(Math.random() * (double)0.2f - (double)0.1f);
        this.ue = 0.2f;
        this.uf = (float)(Math.random() * (double)0.2f - (double)0.1f);
    }

    public i(w w2, double d2, double d3, double d4, co co2) {
        this(w2, d2, d3, d4);
        this.Z(co2);
    }

    @Override
    protected boolean Iz() {
        return false;
    }

    public i(w w2) {
        super(w2);
        this.o(0.25f, 0.25f);
        this.Z(new co(Blocks.cLc, 0));
    }

    @Override
    protected void IA() {
        this.Tp().am(10, 5);
    }

    @Override
    public void Dm() {
        if (this.Yk() == null) {
            this.Tt();
        } else {
            boolean bl2;
            super.Dm();
            if (this.cCs > 0 && this.cCs != Short.MAX_VALUE) {
                --this.cCs;
            }
            this.crF = this.gW;
            this.crG = this.gX;
            this.crH = this.gY;
            this.ue -= (double)0.04f;
            this.csp = this.x(this.gW, (this.Us().dtI + this.Us().dtL) / 2.0, this.gY);
            this.y(this.ud, this.ue, this.uf);
            boolean bl3 = bl2 = (int)this.crF != (int)this.gW || (int)this.crG != (int)this.gX || (int)this.crH != (int)this.gY;
            if (bl2 || this.aRg % 25 == 0) {
                if (this.baU.L(new net.minecraft.util.b(this)).df().xb() == Material.bew) {
                    this.ue = 0.2f;
                    this.ud = (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f;
                    this.uf = (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f;
                    this.a("random.fizz", 0.4f, 2.0f + this.ta.nextFloat() * 0.4f);
                }
                if (!this.baU.dDw) {
                    this.Yi();
                }
            }
            float f2 = 0.98f;
            if (this.aO) {
                f2 = this.baU.L((net.minecraft.util.b)new net.minecraft.util.b((int)bt.aF((double)this.gW), (int)(bt.aF((double)this.Us().dtI) - 1), (int)bt.aF((double)this.gY))).df().aSF * 0.98f;
            }
            this.ud *= (double)f2;
            this.ue *= (double)0.98f;
            this.uf *= (double)f2;
            if (this.aO) {
                this.ue *= -0.5;
            }
            if (this.bGQ != Short.MIN_VALUE) {
                ++this.bGQ;
            }
            this.TH();
            if (!this.baU.dDw && this.bGQ >= 6000) {
                this.Tt();
            }
        }
    }

    private void Yi() {
        for (i i2 : this.baU.a(i.class, this.Us().ad(0.5, 0.0, 0.5))) {
            this.d(i2);
        }
    }

    private boolean d(i i2) {
        if (i2 == this) {
            return false;
        }
        if (i2.TS() && this.TS()) {
            co co2 = this.Yk();
            co co3 = i2.Yk();
            if (this.cCs != Short.MAX_VALUE && i2.cCs != Short.MAX_VALUE) {
                if (this.bGQ != Short.MIN_VALUE && i2.bGQ != Short.MIN_VALUE) {
                    if (co3.bP() != co2.bP()) {
                        return false;
                    }
                    if (co3.aej() ^ co2.aej()) {
                        return false;
                    }
                    if (co3.aej() && !co3.aek().equals(co2.aek())) {
                        return false;
                    }
                    if (co3.bP() == null) {
                        return false;
                    }
                    if (co3.bP().ads() && co3.yc() != co2.yc()) {
                        return false;
                    }
                    if (co3.cWZ < co2.cWZ) {
                        return i2.d(this);
                    }
                    if (co3.cWZ + co2.cWZ > co3.aeb()) {
                        return false;
                    }
                    co3.cWZ += co2.cWZ;
                    i2.cCs = Math.max(i2.cCs, this.cCs);
                    i2.bGQ = Math.min(i2.bGQ, this.bGQ);
                    i2.Z(co3);
                    this.Tt();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void Yj() {
        this.bGQ = 4800;
    }

    @Override
    public boolean TH() {
        if (this.baU.a(this.Us(), Material.bev, this, 0.0014)) {
            if (!this.csz && !this.csB) {
                this.TI();
            }
            this.csz = true;
        } else {
            this.csz = false;
        }
        return this.csz;
    }

    @Override
    protected void ew(int n2) {
        this.a(ad.dvb, (float)n2);
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        if (this.Yk() != null && this.Yk().bP() == Items.cSd && ad2.arZ()) {
            return false;
        }
        this.TM();
        this.cCf = (int)((float)this.cCf - f2);
        if (this.cCf <= 0) {
            this.Tt();
        }
        return false;
    }

    @Override
    public void d(n n2) {
        n2.a("Health", (short)((byte)this.cCf));
        n2.a("Age", (short)this.bGQ);
        n2.a("PickupDelay", (short)this.cCs);
        if (this.Ym() != null) {
            n2.R("Thrower", this.cCt);
        }
        if (this.Yl() != null) {
            n2.R("Owner", this.ej);
        }
        if (this.Yk() != null) {
            n2.b("Item", this.Yk().t(new n()));
        }
    }

    @Override
    public void e(n n2) {
        this.cCf = n2.eF("Health") & 0xFF;
        this.bGQ = n2.eF("Age");
        if (n2.eD("PickupDelay")) {
            this.cCs = n2.eF("PickupDelay");
        }
        if (n2.eD("Owner")) {
            this.ej = n2.eK("Owner");
        }
        if (n2.eD("Thrower")) {
            this.cCt = n2.eK("Thrower");
        }
        n n3 = n2.eN("Item");
        this.Z(co.s(n3));
        if (this.Yk() == null) {
            this.Tt();
        }
    }

    @Override
    public void n(a a2) {
        if (!this.baU.dDw) {
            co co2 = this.Yk();
            int n2 = co2.cWZ;
            if (this.cCs == 0 && (this.ej == null || 6000 - this.bGQ <= 200 || this.ej.equals(a2.xU())) && a2.cHV.ah(co2)) {
                a a3;
                if (co2.bP() == d.I(Blocks.cLt)) {
                    a2.a(b.doF);
                }
                if (co2.bP() == d.I(Blocks.cLu)) {
                    a2.a(b.doF);
                }
                if (co2.bP() == Items.cQJ) {
                    a2.a(b.doS);
                }
                if (co2.bP() == Items.cPm) {
                    a2.a(b.doV);
                }
                if (co2.bP() == Items.cRz) {
                    a2.a(b.doZ);
                }
                if (co2.bP() == Items.cPm && this.Ym() != null && (a3 = this.baU.gz(this.Ym())) != null && a3 != a2) {
                    a3.a(b.doW);
                }
                if (!this.TE()) {
                    this.baU.a((c)a2, "random.pop", 0.2f, ((this.ta.nextFloat() - this.ta.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                }
                a2.c(this, n2);
                if (co2.cWZ <= 0) {
                    this.Tt();
                }
            }
        }
    }

    @Override
    public String xU() {
        return this.xV() ? this.Un() : cr.gm("item." + this.Yk().xB());
    }

    @Override
    public boolean IC() {
        return false;
    }

    @Override
    public void ez(int n2) {
        super.ez(n2);
        if (!this.baU.dDw) {
            this.Yi();
        }
    }

    public co Yk() {
        co co2 = this.Tp().eq(10);
        if (co2 == null) {
            if (this.baU != null) {
                // empty if block
            }
            return new co(Blocks.cLd);
        }
        return co2;
    }

    public void Z(co co2) {
        this.Tp().b(10, co2);
        this.Tp().et(10);
    }

    public String Yl() {
        return this.ej;
    }

    public void ei(String string) {
        this.ej = string;
    }

    public String Ym() {
        return this.cCt;
    }

    public void ej(String string) {
        this.cCt = string;
    }

    public int VG() {
        return this.bGQ;
    }

    public void Yn() {
        this.cCs = 10;
    }

    public void Yo() {
        this.cCs = 0;
    }

    public void Yp() {
        this.cCs = Short.MAX_VALUE;
    }

    public void fc(int n2) {
        this.cCs = n2;
    }

    public boolean Yq() {
        return this.cCs > 0;
    }

    public void Yr() {
        this.bGQ = -6000;
    }

    public void Ys() {
        this.Yp();
        this.bGQ = 5999;
    }
}

