/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.a;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.b;
import net.minecraft.item.co;

public class i
extends b {
    private final ab cTa;

    public i(ab ab2, ab ab3) {
        int n2;
        int n3;
        this.cTa = ab3;
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 3; ++n2) {
                this.c(new ak(ab3, n2 + n3 * 3, 62 + n2 * 18, 17 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.c(new ak(ab2, n2 + n3 * 9 + 9, 8 + n2 * 18, 84 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.c(new ak(ab2, n3, 8 + n3 * 18, 142));
        }
    }

    @Override
    public boolean i(a a2) {
        return this.cTa.v(a2);
    }

    @Override
    public co a(a a2, int n2) {
        co co2 = null;
        ak ak2 = (ak)this.cSK.get(n2);
        if (ak2 != null && ak2.GJ()) {
            co co3 = ak2.ls();
            co2 = co3.aeg();
            if (n2 < 9 ? !this.a(co3, 9, 45, true) : !this.a(co3, 0, 9, false)) {
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

