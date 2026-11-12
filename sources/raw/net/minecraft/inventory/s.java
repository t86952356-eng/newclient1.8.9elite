/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.ae;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.aj;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.ao;
import net.minecraft.inventory.b;
import net.minecraft.inventory.z;
import net.minecraft.item.co;
import net.minecraft.world.w;

public class s
extends b {
    private final ae cTr;
    private final aj cTs;
    private final w cTt;

    public s(g g2, ae ae2, w w2) {
        int n2;
        this.cTr = ae2;
        this.cTt = w2;
        this.cTs = new aj(g2.bij, ae2);
        this.c(new ak(this.cTs, 0, 36, 53));
        this.c(new ak(this.cTs, 1, 62, 53));
        this.c(new ao(g2.bij, ae2, this.cTs, 2, 120, 53));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.c(new ak(g2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.c(new ak(g2, n2, 8 + n2 * 18, 142));
        }
    }

    public aj adi() {
        return this.cTs;
    }

    @Override
    public void a(z z2) {
        super.a(z2);
    }

    @Override
    public void adc() {
        super.adc();
    }

    @Override
    public void b(ab ab2) {
        this.cTs.adl();
        super.b(ab2);
    }

    public void fP(int n2) {
        this.cTs.fP(n2);
    }

    @Override
    public void aq(int n2, int n3) {
    }

    @Override
    public boolean i(a a2) {
        return this.cTr.WB() == a2;
    }

    @Override
    public co a(a a2, int n2) {
        co co2 = null;
        ak ak2 = (ak)this.cSK.get(n2);
        if (ak2 != null && ak2.GJ()) {
            co co3 = ak2.ls();
            co2 = co3.aeg();
            if (n2 == 2) {
                if (!this.a(co3, 3, 39, true)) {
                    return null;
                }
                ak2.a(co3, co2);
            } else if (n2 != 0 && n2 != 1 ? (n2 >= 3 && n2 < 30 ? !this.a(co3, 30, 39, false) : n2 >= 30 && n2 < 39 && !this.a(co3, 3, 30, false)) : !this.a(co3, 3, 39, false)) {
                return null;
            }
            if (co3.cWZ == 0) {
                ak2.I(null);
            } else {
                ak2.GK();
            }
            if (co3.cWZ == co2.cWZ) {
                return null;
            }
            ak2.a(a2, co3);
        }
        return co2;
    }

    @Override
    public void E(a a2) {
        super.E(a2);
        this.cTr.s(null);
        super.E(a2);
        if (!this.cTt.dDw) {
            co co2 = this.cTs.fj(0);
            if (co2 != null) {
                a2.d(co2, false);
            }
            if ((co2 = this.cTs.fj(1)) != null) {
                a2.d(co2, false);
            }
        }
    }
}

