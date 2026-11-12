/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.a;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.b;
import net.minecraft.item.co;

public class h
extends b {
    private final ab cSY;
    private final int cSZ;

    public h(ab ab2, ab ab3, a a2) {
        int n2;
        int n3;
        this.cSY = ab3;
        this.cSZ = ab3.YI() / 9;
        ab3.w(a2);
        int n4 = (this.cSZ - 4) * 18;
        for (n3 = 0; n3 < this.cSZ; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.c(new ak(ab3, n2 + n3 * 9, 8 + n2 * 18, 18 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.c(new ak(ab2, n2 + n3 * 9 + 9, 8 + n2 * 18, 103 + n3 * 18 + n4));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.c(new ak(ab2, n3, 8 + n3 * 18, 161 + n4));
        }
    }

    @Override
    public boolean i(a a2) {
        return this.cSY.v(a2);
    }

    @Override
    public co a(a a2, int n2) {
        co co2 = null;
        ak ak2 = (ak)this.cSK.get(n2);
        if (ak2 != null && ak2.GJ()) {
            co co3 = ak2.ls();
            co2 = co3.aeg();
            if (n2 < this.cSZ * 9 ? !this.a(co3, this.cSZ * 9, this.cSK.size(), true) : !this.a(co3, 0, this.cSZ * 9, false)) {
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
        this.cSY.x(a2);
    }

    public ab adf() {
        return this.cSY;
    }
}

