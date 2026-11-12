/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.util.Arrays;
import java.util.HashSet;
import net.minecraft.client.settings.d;

public class s {
    public static void a(d[] dArray, d[] dArray2) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i2 = 0; i2 < dArray2.length; ++i2) {
            d d2 = dArray2[i2];
            hashSet.add(d2.cO());
        }
        HashSet<d> hashSet2 = new HashSet<d>(Arrays.asList(dArray));
        Arrays.asList(dArray2).forEach(hashSet2::remove);
        for (d d3 : hashSet2) {
            Integer n2 = d3.cO();
            if (!hashSet.contains(n2)) continue;
            d3.eb(0);
        }
    }
}

