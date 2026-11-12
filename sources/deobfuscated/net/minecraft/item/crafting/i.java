/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.item.crafting;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import net.minecraft.entity.passive.u;
import net.minecraft.init.Items;
import net.minecraft.inventory.af;
import net.minecraft.item.aa;
import net.minecraft.item.b;
import net.minecraft.item.co;
import net.minecraft.item.crafting.d;
import net.minecraft.item.y;
import net.minecraft.world.w;

public class i
implements d {
    @Override
    public boolean c(af af2, w w2) {
        co co2 = null;
        ArrayList arrayList = Lists.newArrayList();
        for (int i2 = 0; i2 < af2.YI(); ++i2) {
            co co3 = af2.fi(i2);
            if (co3 == null) continue;
            if (co3.bP() instanceof y) {
                y y2 = (y)co3.bP();
                if (y2.adN() != aa.cVL || co2 != null) {
                    return false;
                }
                co2 = co3;
                continue;
            }
            if (co3.bP() != Items.cRa) {
                return false;
            }
            arrayList.add(co3);
        }
        return co2 != null && !arrayList.isEmpty();
    }

    @Override
    public co a(af af2) {
        float f2;
        float f3;
        int n2;
        int n3;
        co co2 = null;
        int[] nArray = new int[3];
        int n4 = 0;
        int n5 = 0;
        y y2 = null;
        for (n3 = 0; n3 < af2.YI(); ++n3) {
            co co3 = af2.fi(n3);
            if (co3 == null) continue;
            if (co3.bP() instanceof y) {
                y2 = (y)co3.bP();
                if (y2.adN() != aa.cVL || co2 != null) {
                    return null;
                }
                co2 = co3.aeg();
                co2.cWZ = 1;
                if (!y2.ay(co3)) continue;
                n2 = y2.az(co2);
                f3 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                f2 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                float f4 = (float)(n2 & 0xFF) / 255.0f;
                n4 = (int)((float)n4 + Math.max(f3, Math.max(f2, f4)) * 255.0f);
                nArray[0] = (int)((float)nArray[0] + f3 * 255.0f);
                nArray[1] = (int)((float)nArray[1] + f2 * 255.0f);
                nArray[2] = (int)((float)nArray[2] + f4 * 255.0f);
                ++n5;
                continue;
            }
            if (co3.bP() != Items.cRa) {
                return null;
            }
            float[] fArray = u.a(b.fR(co3.yc()));
            int n6 = (int)(fArray[0] * 255.0f);
            int n7 = (int)(fArray[1] * 255.0f);
            int n8 = (int)(fArray[2] * 255.0f);
            n4 += Math.max(n6, Math.max(n7, n8));
            nArray[0] = nArray[0] + n6;
            nArray[1] = nArray[1] + n7;
            nArray[2] = nArray[2] + n8;
            ++n5;
        }
        if (y2 == null) {
            return null;
        }
        n3 = nArray[0] / n5;
        int n9 = nArray[1] / n5;
        n2 = nArray[2] / n5;
        f3 = (float)n4 / (float)n5;
        f2 = Math.max(n3, Math.max(n9, n2));
        n3 = (int)((float)n3 * f3 / f2);
        n9 = (int)((float)n9 * f3 / f2);
        n2 = (int)((float)n2 * f3 / f2);
        int n10 = (n3 << 8) + n9;
        n10 = (n10 << 8) + n2;
        y2.f(co2, n10);
        return co2;
    }

    @Override
    public int aeC() {
        return 10;
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

