/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.g;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ae;
import net.minecraft.inventory.af;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.al;
import net.minecraft.inventory.b;
import net.minecraft.item.co;
import net.minecraft.item.crafting.a;
import net.minecraft.world.w;

public class y
extends b {
    public af cTu = new af(this, 3, 3);
    public ab cTv = new ae();
    private final w cTM;
    private final net.minecraft.util.b cTN;

    public y(g g2, w w2, net.minecraft.util.b b2) {
        int n2;
        int n3;
        this.cTM = w2;
        this.cTN = b2;
        this.c(new al(g2.bij, this.cTu, this.cTv, 0, 124, 35));
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 3; ++n2) {
                this.c(new ak(this.cTu, n2 + n3 * 3, 30 + n2 * 18, 17 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.c(new ak(g2, n2 + n3 * 9 + 9, 8 + n2 * 18, 84 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.c(new ak(g2, n3, 8 + n3 * 18, 142));
        }
        this.b(this.cTu);
    }

    @Override
    public void b(ab ab2) {
        this.cTv.g(0, a.aey().a(this.cTu, this.cTM));
    }

    @Override
    public void E(net.minecraft.entity.player.a a2) {
        super.E(a2);
        if (!this.cTM.dDw) {
            for (int i2 = 0; i2 < 9; ++i2) {
                co co2 = this.cTu.fj(i2);
                if (co2 == null) continue;
                a2.d(co2, false);
            }
        }
    }

    @Override
    public boolean i(net.minecraft.entity.player.a a2) {
        return this.cTM.L(this.cTN).df() == Blocks.cMk && a2.M((double)this.cTN.wt() + 0.5, (double)this.cTN.wu() + 0.5, (double)this.cTN.wx() + 0.5) <= 64.0;
    }

    @Override
    public co a(net.minecraft.entity.player.a a2, int n2) {
        co co2 = null;
        ak ak2 = (ak)this.cSK.get(n2);
        if (ak2 != null && ak2.GJ()) {
            co co3 = ak2.ls();
            co2 = co3.aeg();
            if (n2 == 0) {
                if (!this.a(co3, 10, 46, true)) {
                    return null;
                }
                ak2.a(co3, co2);
            } else if (n2 >= 10 && n2 < 37 ? !this.a(co3, 37, 46, false) : (n2 >= 37 && n2 < 46 ? !this.a(co3, 10, 37, false) : !this.a(co3, 10, 46, false))) {
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
    public boolean a(co co2, ak ak2) {
        return ak2.cUj != this.cTv && super.a(co2, ak2);
    }
}

