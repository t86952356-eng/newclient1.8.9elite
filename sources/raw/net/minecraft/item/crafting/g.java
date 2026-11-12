/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.item.crafting;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import net.minecraft.inventory.af;
import net.minecraft.item.co;
import net.minecraft.item.crafting.d;
import net.minecraft.world.w;

public class g
implements d {
    @Override
    public boolean c(af af2, w w2) {
        ArrayList arrayList = Lists.newArrayList();
        for (int i2 = 0; i2 < af2.YI(); ++i2) {
            co co2 = af2.fi(i2);
            if (co2 == null) continue;
            arrayList.add(co2);
            if (arrayList.size() <= 1) continue;
            co co3 = (co)arrayList.get(0);
            if (co2.bP() == co3.bP() && co3.cWZ == 1 && co2.cWZ == 1 && co3.bP().adu()) continue;
            return false;
        }
        return arrayList.size() == 2;
    }

    @Override
    public co a(af af2) {
        Object object;
        co co2;
        ArrayList arrayList = Lists.newArrayList();
        for (int i2 = 0; i2 < af2.YI(); ++i2) {
            co2 = af2.fi(i2);
            if (co2 == null) continue;
            arrayList.add(co2);
            if (arrayList.size() <= 1) continue;
            object = (co)arrayList.get(0);
            if (co2.bP() == ((co)object).bP() && ((co)object).cWZ == 1 && co2.cWZ == 1 && ((co)object).bP().adu()) continue;
            return null;
        }
        if (arrayList.size() == 2) {
            co co3 = (co)arrayList.get(0);
            co2 = (co)arrayList.get(1);
            if (co3.bP() == co2.bP() && co3.cWZ == 1 && co2.cWZ == 1 && co3.bP().adu()) {
                object = co3.bP();
                int n2 = ((net.minecraft.item.d)object).adt() - co3.aef();
                int n3 = ((net.minecraft.item.d)object).adt() - co2.aef();
                int n4 = n2 + n3 + ((net.minecraft.item.d)object).adt() * 5 / 100;
                int n5 = ((net.minecraft.item.d)object).adt() - n4;
                if (n5 < 0) {
                    n5 = 0;
                }
                return new co(co3.bP(), 1, n5);
            }
        }
        return null;
    }

    @Override
    public int aeC() {
        return 4;
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
            if (co2 == null || !co2.bP().adA()) continue;
            coArray[i2] = new co(co2.bP().adz());
        }
        return coArray;
    }
}

