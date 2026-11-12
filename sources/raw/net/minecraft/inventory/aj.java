/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.ae;
import net.minecraft.inventory.ab;
import net.minecraft.item.co;
import net.minecraft.util.ba;
import net.minecraft.util.s;
import net.minecraft.util.t;
import net.minecraft.village.a;
import net.minecraft.village.b;

public class aj
implements ab {
    private final ae cUd;
    private final co[] cUe = new co[3];
    private final net.minecraft.entity.player.a cUf;
    private a cUg;
    private int cUh;

    public aj(net.minecraft.entity.player.a a2, ae ae2) {
        this.cUf = a2;
        this.cUd = ae2;
    }

    @Override
    public int YI() {
        return this.cUe.length;
    }

    @Override
    public co fi(int n2) {
        return this.cUe[n2];
    }

    @Override
    public co ap(int n2, int n3) {
        if (this.cUe[n2] != null) {
            if (n2 == 2) {
                co co2 = this.cUe[n2];
                this.cUe[n2] = null;
                return co2;
            }
            if (this.cUe[n2].cWZ <= n3) {
                co co3 = this.cUe[n2];
                this.cUe[n2] = null;
                if (this.fQ(n2)) {
                    this.adl();
                }
                return co3;
            }
            co co4 = this.cUe[n2].ge(n3);
            if (this.cUe[n2].cWZ == 0) {
                this.cUe[n2] = null;
            }
            if (this.fQ(n2)) {
                this.adl();
            }
            return co4;
        }
        return null;
    }

    private boolean fQ(int n2) {
        return n2 == 0 || n2 == 1;
    }

    @Override
    public co fj(int n2) {
        if (this.cUe[n2] != null) {
            co co2 = this.cUe[n2];
            this.cUe[n2] = null;
            return co2;
        }
        return null;
    }

    @Override
    public void g(int n2, co co2) {
        this.cUe[n2] = co2;
        if (co2 != null && co2.cWZ > this.YJ()) {
            co2.cWZ = this.YJ();
        }
        if (this.fQ(n2)) {
            this.adl();
        }
    }

    @Override
    public String xU() {
        return "mob.villager";
    }

    @Override
    public boolean xV() {
        return false;
    }

    @Override
    public ba xW() {
        return this.xV() ? new s(this.xU()) : new t(this.xU(), new Object[0]);
    }

    @Override
    public int YJ() {
        return 64;
    }

    @Override
    public boolean v(net.minecraft.entity.player.a a2) {
        return this.cUd.WB() == a2;
    }

    @Override
    public void w(net.minecraft.entity.player.a a2) {
    }

    @Override
    public void x(net.minecraft.entity.player.a a2) {
    }

    @Override
    public boolean h(int n2, co co2) {
        return true;
    }

    @Override
    public void Lw() {
        this.adl();
    }

    public void adl() {
        this.cUg = null;
        co co2 = this.cUe[0];
        co co3 = this.cUe[1];
        if (co2 == null) {
            co2 = co3;
            co3 = null;
        }
        if (co2 == null) {
            this.g(2, null);
        } else {
            b b2 = this.cUd.t(this.cUf);
            if (b2 != null) {
                a a2 = b2.a(co2, co3, this.cUh);
                if (a2 != null && !a2.auf()) {
                    this.cUg = a2;
                    this.g(2, a2.aub().aeg());
                } else if (co3 != null) {
                    a2 = b2.a(co3, co2, this.cUh);
                    if (a2 != null && !a2.auf()) {
                        this.cUg = a2;
                        this.g(2, a2.aub().aeg());
                    } else {
                        this.g(2, null);
                    }
                } else {
                    this.g(2, null);
                }
            }
        }
        this.cUd.Y(this.fi(2));
    }

    public a adm() {
        return this.cUg;
    }

    public void fP(int n2) {
        this.cUh = n2;
        this.adl();
    }

    @Override
    public int cx(int n2) {
        return 0;
    }

    @Override
    public void K(int n2, int n3) {
    }

    @Override
    public int IG() {
        return 0;
    }

    @Override
    public void clear() {
        for (int i2 = 0; i2 < this.cUe.length; ++i2) {
            this.cUe[i2] = null;
        }
    }
}

