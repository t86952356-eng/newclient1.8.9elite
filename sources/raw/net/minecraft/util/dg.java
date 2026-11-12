/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.util;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.minecraft.inventory.ab;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.tileentity.s;
import net.minecraft.util.de;
import net.minecraft.util.df;

public class dg
extends df {
    private final co dAS;
    private final int dAT;
    private final int dAU;

    public dg(d d2, int n2, int n3, int n4, int n5) {
        super(n5);
        this.dAS = new co(d2, 1, n2);
        this.dAT = n3;
        this.dAU = n4;
    }

    public dg(co co2, int n2, int n3, int n4) {
        super(n4);
        this.dAS = co2;
        this.dAT = n2;
        this.dAU = n3;
    }

    public static void a(Random random, List<dg> list, ab ab2, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            dg dg2 = de.a(random, list);
            int n3 = dg2.dAT + random.nextInt(dg2.dAU - dg2.dAT + 1);
            if (dg2.dAS.aeb() >= n3) {
                co co2 = dg2.dAS.aeg();
                co2.cWZ = n3;
                ab2.g(random.nextInt(ab2.YI()), co2);
                continue;
            }
            for (int i3 = 0; i3 < n3; ++i3) {
                co co3 = dg2.dAS.aeg();
                co3.cWZ = 1;
                ab2.g(random.nextInt(ab2.YI()), co3);
            }
        }
    }

    public static void a(Random random, List<dg> list, s s2, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            dg dg2 = de.a(random, list);
            int n3 = dg2.dAT + random.nextInt(dg2.dAU - dg2.dAT + 1);
            if (dg2.dAS.aeb() >= n3) {
                co co2 = dg2.dAS.aeg();
                co2.cWZ = n3;
                s2.g(random.nextInt(s2.YI()), co2);
                continue;
            }
            for (int i3 = 0; i3 < n3; ++i3) {
                co co3 = dg2.dAS.aeg();
                co3.cWZ = 1;
                s2.g(random.nextInt(s2.YI()), co3);
            }
        }
    }

    public static List<dg> a(List<dg> list, dg ... dgArray) {
        ArrayList arrayList = Lists.newArrayList(list);
        Collections.addAll(arrayList, dgArray);
        return arrayList;
    }
}

