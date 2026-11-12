/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item.crafting;

import net.minecraft.init.Items;
import net.minecraft.inventory.af;
import net.minecraft.item.as;
import net.minecraft.item.co;
import net.minecraft.item.crafting.d;
import net.minecraft.nbt.n;
import net.minecraft.world.w;

public class e
implements d {
    @Override
    public boolean c(af af2, w w2) {
        int n2 = 0;
        co co2 = null;
        for (int i2 = 0; i2 < af2.YI(); ++i2) {
            co co3 = af2.fi(i2);
            if (co3 == null) continue;
            if (co3.bP() == Items.cRR) {
                if (co2 != null) {
                    return false;
                }
                co2 = co3;
                continue;
            }
            if (co3.bP() != Items.cRQ) {
                return false;
            }
            ++n2;
        }
        return co2 != null && n2 > 0;
    }

    @Override
    public co a(af af2) {
        int n2 = 0;
        co co2 = null;
        for (int i2 = 0; i2 < af2.YI(); ++i2) {
            co co3 = af2.fi(i2);
            if (co3 == null) continue;
            if (co3.bP() == Items.cRR) {
                if (co2 != null) {
                    return null;
                }
                co2 = co3;
                continue;
            }
            if (co3.bP() != Items.cRQ) {
                return null;
            }
            ++n2;
        }
        if (co2 != null && n2 >= 1 && as.aC(co2) < 2) {
            co co4 = new co(Items.cRR, n2);
            co4.u((n)co2.aek().aeG());
            co4.aek().B("generation", as.aC(co2) + 1);
            if (co2.aen()) {
                co4.ey(co2.getDisplayName());
            }
            return co4;
        }
        return null;
    }

    @Override
    public int aeC() {
        return 9;
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
            if (co2 == null || !(co2.bP() instanceof as)) continue;
            coArray[i2] = co2;
            break;
        }
        return coArray;
    }
}

