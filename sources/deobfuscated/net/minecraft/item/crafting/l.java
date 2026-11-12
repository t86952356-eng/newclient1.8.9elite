/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item.crafting;

import net.minecraft.init.Items;
import net.minecraft.inventory.af;
import net.minecraft.item.co;
import net.minecraft.item.crafting.d;
import net.minecraft.tileentity.h;
import net.minecraft.world.w;

class l
implements d {
    private l() {
    }

    @Override
    public boolean c(af af2, w w2) {
        co co2 = null;
        co co3 = null;
        for (int i2 = 0; i2 < af2.YI(); ++i2) {
            boolean bl2;
            co co4 = af2.fi(i2);
            if (co4 == null) continue;
            if (co4.bP() != Items.cSI) {
                return false;
            }
            if (co2 != null && co3 != null) {
                return false;
            }
            int n2 = h.aR(co4);
            boolean bl3 = bl2 = h.aS(co4) > 0;
            if (co2 != null) {
                if (bl2) {
                    return false;
                }
                if (n2 != h.aR(co2)) {
                    return false;
                }
                co3 = co4;
                continue;
            }
            if (co3 != null) {
                if (!bl2) {
                    return false;
                }
                if (n2 != h.aR(co3)) {
                    return false;
                }
                co2 = co4;
                continue;
            }
            if (bl2) {
                co2 = co4;
                continue;
            }
            co3 = co4;
        }
        return co2 != null && co3 != null;
    }

    @Override
    public co a(af af2) {
        for (int i2 = 0; i2 < af2.YI(); ++i2) {
            co co2 = af2.fi(i2);
            if (co2 == null || h.aS(co2) <= 0) continue;
            co co3 = co2.aeg();
            co3.cWZ = 1;
            return co3;
        }
        return null;
    }

    @Override
    public int aeC() {
        return 2;
    }

    @Override
    public co aeD() {
        return null;
    }

    @Override
    public co[] b(af af2) {
        co[] coArray = new co[af2.YI()];
        for (int i2 = 0; i2 < coArray.length; ++i2) {
            co co2 = af2.fi(i2);
            if (co2 == null) continue;
            if (co2.bP().adA()) {
                coArray[i2] = new co(co2.bP().adz());
                continue;
            }
            if (!co2.aej() || h.aS(co2) <= 0) continue;
            coArray[i2] = co2.aeg();
            coArray[i2].cWZ = 1;
        }
        return coArray;
    }
}

