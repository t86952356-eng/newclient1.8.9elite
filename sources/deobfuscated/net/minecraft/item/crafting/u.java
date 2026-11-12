/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item.crafting;

import net.minecraft.inventory.af;
import net.minecraft.item.co;
import net.minecraft.item.crafting.d;
import net.minecraft.nbt.n;
import net.minecraft.world.w;

public class u
implements d {
    private final int cXD;
    private final int cXE;
    private final co[] cXF;
    private final co cXG;
    private boolean cXH;

    public u(int n2, int n3, co[] coArray, co co2) {
        this.cXD = n2;
        this.cXE = n3;
        this.cXF = coArray;
        this.cXG = co2;
    }

    @Override
    public co aeD() {
        return this.cXG;
    }

    @Override
    public co[] b(af af2) {
        co[] coArray = new co[af2.YI()];
        for (int i2 = 0; i2 < coArray.length; ++i2) {
            co co2 = af2.fi(i2);
            if (co2 == null || !co2.bP().adA()) continue;
            coArray[i2] = new co(co2.bP().adz());
        }
        return coArray;
    }

    @Override
    public boolean c(af af2, w w2) {
        for (int i2 = 0; i2 <= 3 - this.cXD; ++i2) {
            for (int i3 = 0; i3 <= 3 - this.cXE; ++i3) {
                if (this.a(af2, i2, i3, true)) {
                    return true;
                }
                if (!this.a(af2, i2, i3, false)) continue;
                return true;
            }
        }
        return false;
    }

    private boolean a(af af2, int n2, int n3, boolean bl2) {
        for (int i2 = 0; i2 < 3; ++i2) {
            for (int i3 = 0; i3 < 3; ++i3) {
                co co2;
                int n4 = i2 - n2;
                int n5 = i3 - n3;
                co co3 = null;
                if (n4 >= 0 && n5 >= 0 && n4 < this.cXD && n5 < this.cXE) {
                    co3 = bl2 ? this.cXF[this.cXD - n4 - 1 + n5 * this.cXD] : this.cXF[n4 + n5 * this.cXD];
                }
                if ((co2 = af2.as(i2, i3)) == null && co3 == null) continue;
                if (co2 == null && co3 != null || co2 != null && co3 == null) {
                    return false;
                }
                if (co3.bP() != co2.bP()) {
                    return false;
                }
                if (co3.yc() == Short.MAX_VALUE || co3.yc() == co2.yc()) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public co a(af af2) {
        co co2 = this.aeD().aeg();
        if (this.cXH) {
            for (int i2 = 0; i2 < af2.YI(); ++i2) {
                co co3 = af2.fi(i2);
                if (co3 == null || !co3.aej()) continue;
                co2.u((n)co3.aek().aeG());
            }
        }
        return co2;
    }

    @Override
    public int aeC() {
        return this.cXD * this.cXE;
    }
}

