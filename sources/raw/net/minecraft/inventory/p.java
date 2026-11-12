/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.c;
import net.minecraft.entity.passive.f;
import net.minecraft.entity.player.a;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.b;
import net.minecraft.inventory.q;
import net.minecraft.inventory.r;
import net.minecraft.item.co;

public class p
extends b {
    private final ab cTo;
    private final f cTp;

    public p(ab ab2, ab ab3, f f2, a a2) {
        int n2;
        int n3;
        this.cTo = ab3;
        this.cTp = f2;
        int n4 = 3;
        ab3.w(a2);
        int n5 = -18;
        this.c(new q(this, ab3, 0, 8, 18));
        this.c(new r(this, ab3, 1, 8, 36, f2));
        if (f2.aae()) {
            for (n3 = 0; n3 < 3; ++n3) {
                for (n2 = 0; n2 < 5; ++n2) {
                    this.c(new ak(ab3, 2 + n2 + n3 * 5, 80 + n2 * 18, 18 + n3 * 18));
                }
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.c(new ak(ab2, n2 + n3 * 9 + 9, 8 + n2 * 18, 102 + n3 * 18 + -18));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.c(new ak(ab2, n3, 8 + n3 * 18, 142));
        }
    }

    @Override
    public boolean i(a a2) {
        return this.cTo.v(a2) && this.cTp.TS() && this.cTp.S((c)a2) < 8.0f;
    }

    @Override
    public co a(a a2, int n2) {
        co co2 = null;
        ak ak2 = (ak)this.cSK.get(n2);
        if (ak2 != null && ak2.GJ()) {
            co co3 = ak2.ls();
            co2 = co3.aeg();
            if (n2 < this.cTo.YI() ? !this.a(co3, this.cTo.YI(), this.cSK.size(), true) : (this.fM(1).H(co3) && !this.fM(1).GJ() ? !this.a(co3, 1, 2, false) : (this.fM(0).H(co3) ? !this.a(co3, 0, 1, false) : this.cTo.YI() <= 2 || !this.a(co3, 2, this.cTo.YI(), false)))) {
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
        this.cTo.x(a2);
    }
}

