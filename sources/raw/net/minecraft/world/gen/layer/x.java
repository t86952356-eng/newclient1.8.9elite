/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen.layer;

import com.google.common.collect.Lists;
import java.util.List;

public class x {
    private static int dPE = 256;
    private static final List<int[]> dPF = Lists.newArrayList();
    private static final List<int[]> dPG = Lists.newArrayList();
    private static final List<int[]> dPH = Lists.newArrayList();
    private static final List<int[]> dPI = Lists.newArrayList();

    public static synchronized int[] iG(int n2) {
        if (n2 <= 256) {
            if (dPF.isEmpty()) {
                int[] nArray = new int[256];
                dPG.add(nArray);
                return nArray;
            }
            int[] nArray = dPF.remove(dPF.size() - 1);
            dPG.add(nArray);
            return nArray;
        }
        if (n2 > dPE) {
            dPE = n2;
            dPH.clear();
            dPI.clear();
            int[] nArray = new int[dPE];
            dPI.add(nArray);
            return nArray;
        }
        if (dPH.isEmpty()) {
            int[] nArray = new int[dPE];
            dPI.add(nArray);
            return nArray;
        }
        int[] nArray = dPH.remove(dPH.size() - 1);
        dPI.add(nArray);
        return nArray;
    }

    public static synchronized void ayB() {
        if (!dPH.isEmpty()) {
            dPH.remove(dPH.size() - 1);
        }
        if (!dPF.isEmpty()) {
            dPF.remove(dPF.size() - 1);
        }
        dPH.addAll(dPI);
        dPF.addAll(dPG);
        dPI.clear();
        dPG.clear();
    }

    public static synchronized String ayC() {
        return "cache: " + dPH.size() + ", tcache: " + dPF.size() + ", allocated: " + dPI.size() + ", tallocated: " + dPG.size();
    }
}

