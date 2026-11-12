/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.b;
import net.minecraft.item.co;

public class o
extends b {
    private final ab cTn;

    public o(g g2, ab ab2, a a2) {
        int n2;
        this.cTn = ab2;
        ab2.w(a2);
        int n3 = 51;
        for (n2 = 0; n2 < ab2.YI(); ++n2) {
            this.c(new ak(ab2, n2, 44 + n2 * 18, 20));
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.c(new ak(g2, i2 + n2 * 9 + 9, 8 + i2 * 18, n2 * 18 + 51));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.c(new ak(g2, n2, 8 + n2 * 18, 109));
        }
    }

    @Override
    public boolean i(a a2) {
        return this.cTn.v(a2);
    }

    @Override
    public co a(a a2, int n2) {
        co co2 = null;
        ak ak2 = (ak)this.cSK.get(n2);
        if (ak2 != null && ak2.GJ()) {
            co co3 = ak2.ls();
            co2 = co3.aeg();
            if (n2 < this.cTn.YI() ? !this.a(co3, this.cTn.YI(), this.cSK.size(), true) : !this.a(co3, 0, this.cTn.YI(), false)) {
                return null;
            }
            if (co3.cWZ == 0) {
                ak2.I(null);
            } else {
                ak2.GK();
            }
        }
        return co2;
    }

    @Override
    public void E(a a2) {
        super.E(a2);
        this.cTn.x(a2);
    }
}

