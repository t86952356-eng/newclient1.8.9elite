/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.a;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.b;
import net.minecraft.inventory.f;
import net.minecraft.inventory.g;
import net.minecraft.inventory.z;
import net.minecraft.item.co;

public class e
extends b {
    private final ab cSU;
    private final ak cSV;
    private int cSW;

    public e(net.minecraft.entity.player.g g2, ab ab2) {
        int n2;
        this.cSU = ab2;
        this.c(new g(g2.bij, ab2, 0, 56, 46));
        this.c(new g(g2.bij, ab2, 1, 79, 53));
        this.c(new g(g2.bij, ab2, 2, 102, 46));
        this.cSV = this.c(new f(this, ab2, 3, 79, 17));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.c(new ak(g2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.c(new ak(g2, n2, 8 + n2 * 18, 142));
        }
    }

    @Override
    public void a(z z2) {
        super.a(z2);
        z2.a((b)this, this.cSU);
    }

    @Override
    public void adc() {
        super.adc();
        for (int i2 = 0; i2 < this.cSQ.size(); ++i2) {
            z z2 = (z)this.cSQ.get(i2);
            if (this.cSW == this.cSU.cx(0)) continue;
            z2.a((b)this, 0, this.cSU.cx(0));
        }
        this.cSW = this.cSU.cx(0);
    }

    @Override
    public void aq(int n2, int n3) {
        this.cSU.K(n2, n3);
    }

    @Override
    public boolean i(a a2) {
        return this.cSU.v(a2);
    }

    @Override
    public co a(a a2, int n2) {
        co co2 = null;
        ak ak2 = (ak)this.cSK.get(n2);
        if (ak2 != null && ak2.GJ()) {
            co co3 = ak2.ls();
            co2 = co3.aeg();
            if ((n2 < 0 || n2 > 2) && n2 != 3) {
                if (!this.cSV.GJ() && this.cSV.H(co3) ? !this.a(co3, 3, 4, false) : (g.aj(co2) ? !this.a(co3, 0, 3, false) : (n2 >= 4 && n2 < 31 ? !this.a(co3, 31, 40, false) : (n2 >= 31 && n2 < 40 ? !this.a(co3, 4, 31, false) : !this.a(co3, 4, 40, false))))) {
                    return null;
                }
            } else {
                if (!this.a(co3, 4, 40, true)) {
                    return null;
                }
                ak2.a(co3, co2);
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
}

