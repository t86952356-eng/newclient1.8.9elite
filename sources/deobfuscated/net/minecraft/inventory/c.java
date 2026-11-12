/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.a;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.b;
import net.minecraft.inventory.d;
import net.minecraft.inventory.z;
import net.minecraft.item.co;

public class c
extends b {
    private final ab cSS;
    private final d cST;

    public c(ab ab2, ab ab3) {
        int n2;
        this.cSS = ab3;
        this.cST = new d(this, ab3, 0, 136, 110);
        this.c(this.cST);
        int n3 = 36;
        int n4 = 137;
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.c(new ak(ab2, i2 + n2 * 9 + 9, 36 + i2 * 18, 137 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.c(new ak(ab2, n2, 36 + n2 * 18, 195));
        }
    }

    @Override
    public void a(z z2) {
        super.a(z2);
        z2.a((b)this, this.cSS);
    }

    @Override
    public void aq(int n2, int n3) {
        this.cSS.K(n2, n3);
    }

    public ab ade() {
        return this.cSS;
    }

    @Override
    public void E(a a2) {
        co co2;
        super.E(a2);
        if (a2 != null && !a2.baU.dDw && (co2 = this.cST.cf(this.cST.GL())) != null) {
            a2.d(co2, false);
        }
    }

    @Override
    public boolean i(a a2) {
        return this.cSS.v(a2);
    }

    @Override
    public co a(a a2, int n2) {
        co co2 = null;
        ak ak2 = (ak)this.cSK.get(n2);
        if (ak2 != null && ak2.GJ()) {
            co co3 = ak2.ls();
            co2 = co3.aeg();
            if (n2 == 0) {
                if (!this.a(co3, 1, 37, true)) {
                    return null;
                }
                ak2.a(co3, co2);
            } else if (!this.cST.GJ() && this.cST.H(co3) && co3.cWZ == 1 ? !this.a(co3, 0, 1, false) : (n2 >= 1 && n2 < 28 ? !this.a(co3, 28, 37, false) : (n2 >= 28 && n2 < 37 ? !this.a(co3, 1, 28, false) : !this.a(co3, 1, 37, false)))) {
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

