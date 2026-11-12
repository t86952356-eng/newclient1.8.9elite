/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.am;
import net.minecraft.inventory.an;
import net.minecraft.inventory.b;
import net.minecraft.inventory.z;
import net.minecraft.item.co;
import net.minecraft.item.crafting.c;
import net.minecraft.tileentity.y;

public class n
extends b {
    private final ab cTi;
    private int cTj;
    private int cTk;
    private int cTl;
    private int cTm;

    public n(g g2, ab ab2) {
        int n2;
        this.cTi = ab2;
        this.c(new ak(ab2, 0, 56, 17));
        this.c(new am(ab2, 1, 56, 53));
        this.c(new an(g2.bij, ab2, 2, 116, 35));
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
        z2.a((b)this, this.cTi);
    }

    @Override
    public void adc() {
        super.adc();
        for (int i2 = 0; i2 < this.cSQ.size(); ++i2) {
            z z2 = (z)this.cSQ.get(i2);
            if (this.cTj != this.cTi.cx(2)) {
                z2.a((b)this, 2, this.cTi.cx(2));
            }
            if (this.cTl != this.cTi.cx(0)) {
                z2.a((b)this, 0, this.cTi.cx(0));
            }
            if (this.cTm != this.cTi.cx(1)) {
                z2.a((b)this, 1, this.cTi.cx(1));
            }
            if (this.cTk == this.cTi.cx(3)) continue;
            z2.a((b)this, 3, this.cTi.cx(3));
        }
        this.cTj = this.cTi.cx(2);
        this.cTl = this.cTi.cx(0);
        this.cTm = this.cTi.cx(1);
        this.cTk = this.cTi.cx(3);
    }

    @Override
    public void aq(int n2, int n3) {
        this.cTi.K(n2, n3);
    }

    @Override
    public boolean i(a a2) {
        return this.cTi.v(a2);
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
            } else if (n2 != 1 && n2 != 0 ? (c.aeA().aM(co3) != null ? !this.a(co3, 0, 1, false) : (y.aX(co3) ? !this.a(co3, 1, 2, false) : (n2 >= 3 && n2 < 30 ? !this.a(co3, 30, 39, false) : n2 >= 30 && n2 < 39 && !this.a(co3, 3, 30, false)))) : !this.a(co3, 3, 39, false)) {
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
}

