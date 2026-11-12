/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.g;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ae;
import net.minecraft.inventory.af;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.al;
import net.minecraft.inventory.b;
import net.minecraft.inventory.u;
import net.minecraft.item.co;
import net.minecraft.item.crafting.a;
import net.minecraft.item.y;

public class t
extends b {
    public af cTu = new af(this, 2, 2);
    public ab cTv = new ae();
    public boolean cTw;
    private final net.minecraft.entity.player.a cTx;

    public t(g g2, boolean bl2, net.minecraft.entity.player.a a2) {
        int n2;
        int n3;
        this.cTw = bl2;
        this.cTx = a2;
        this.c(new al(g2.bij, this.cTu, this.cTv, 0, 144, 36));
        for (n3 = 0; n3 < 2; ++n3) {
            for (n2 = 0; n2 < 2; ++n2) {
                this.c(new ak(this.cTu, n2 + n3 * 2, 88 + n2 * 18, 26 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 4; ++n3) {
            n2 = n3;
            this.c(new u(this, g2, g2.YI() - 1 - n3, 8, 8 + n3 * 18, n2));
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.c(new ak(g2, n2 + (n3 + 1) * 9, 8 + n2 * 18, 84 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.c(new ak(g2, n3, 8 + n3 * 18, 142));
        }
        this.b(this.cTu);
    }

    @Override
    public void b(ab ab2) {
        this.cTv.g(0, a.aey().a(this.cTu, this.cTx.baU));
    }

    @Override
    public void E(net.minecraft.entity.player.a a2) {
        super.E(a2);
        for (int i2 = 0; i2 < 4; ++i2) {
            co co2 = this.cTu.fj(i2);
            if (co2 == null) continue;
            a2.d(co2, false);
        }
        this.cTv.g(0, null);
    }

    @Override
    public boolean i(net.minecraft.entity.player.a a2) {
        return true;
    }

    @Override
    public co a(net.minecraft.entity.player.a a2, int n2) {
        co co2 = null;
        ak ak2 = (ak)this.cSK.get(n2);
        if (ak2 != null && ak2.GJ()) {
            int n3;
            co co3 = ak2.ls();
            co2 = co3.aeg();
            if (n2 == 0) {
                if (!this.a(co3, 9, 45, true)) {
                    return null;
                }
                ak2.a(co3, co2);
            } else if (n2 >= 1 && n2 < 5 ? !this.a(co3, 9, 45, false) : (n2 >= 5 && n2 < 9 ? !this.a(co3, 9, 45, false) : (co2.bP() instanceof y && !((ak)this.cSK.get(5 + ((y)co2.bP()).cVH)).GJ() ? !this.a(co3, n3 = 5 + ((y)co2.bP()).cVH, n3 + 1, false) : (n2 >= 9 && n2 < 36 ? !this.a(co3, 36, 45, false) : (n2 >= 36 && n2 < 45 ? !this.a(co3, 9, 36, false) : !this.a(co3, 9, 45, false)))))) {
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

