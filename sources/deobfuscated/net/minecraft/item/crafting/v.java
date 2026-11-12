/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.item.crafting;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.inventory.af;
import net.minecraft.item.co;
import net.minecraft.item.crafting.d;
import net.minecraft.world.w;

public class v
implements d {
    private final co cXI;
    private final List<co> cXJ;

    public v(co co2, List<co> list) {
        this.cXI = co2;
        this.cXJ = list;
    }

    @Override
    public co aeD() {
        return this.cXI;
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
        ArrayList arrayList = Lists.newArrayList(this.cXJ);
        for (int i2 = 0; i2 < af2.getHeight(); ++i2) {
            for (int i3 = 0; i3 < af2.getWidth(); ++i3) {
                co co2 = af2.as(i3, i2);
                if (co2 == null) continue;
                boolean bl2 = false;
                for (co co3 : arrayList) {
                    if (co2.bP() != co3.bP() || co3.yc() != Short.MAX_VALUE && co2.yc() != co3.yc()) continue;
                    bl2 = true;
                    arrayList.remove(co3);
                    break;
                }
                if (bl2) continue;
                return false;
            }
        }
        return arrayList.isEmpty();
    }

    @Override
    public co a(af af2) {
        return this.cXI.aeg();
    }

    @Override
    public int aeC() {
        return this.cXJ.size();
    }
}

