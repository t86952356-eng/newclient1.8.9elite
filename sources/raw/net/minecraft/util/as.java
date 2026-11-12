/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.util;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Map;

public final class as
extends Enum<as> {
    public static final /* enum */ as dwW = new as("explode", 0, true);
    public static final /* enum */ as dwX = new as("largeexplode", 1, true);
    public static final /* enum */ as dwY = new as("hugeexplosion", 2, true);
    public static final /* enum */ as dwZ = new as("fireworksSpark", 3, false);
    public static final /* enum */ as dxa = new as("bubble", 4, false);
    public static final /* enum */ as dxb = new as("splash", 5, false);
    public static final /* enum */ as dxc = new as("wake", 6, false);
    public static final /* enum */ as dxd = new as("suspended", 7, false);
    public static final /* enum */ as dxe = new as("depthsuspend", 8, false);
    public static final /* enum */ as dxf = new as("crit", 9, false);
    public static final /* enum */ as dxg = new as("magicCrit", 10, false);
    public static final /* enum */ as dxh = new as("smoke", 11, false);
    public static final /* enum */ as dxi = new as("largesmoke", 12, false);
    public static final /* enum */ as dxj = new as("spell", 13, false);
    public static final /* enum */ as dxk = new as("instantSpell", 14, false);
    public static final /* enum */ as dxl = new as("mobSpell", 15, false);
    public static final /* enum */ as dxm = new as("mobSpellAmbient", 16, false);
    public static final /* enum */ as dxn = new as("witchMagic", 17, false);
    public static final /* enum */ as dxo = new as("dripWater", 18, false);
    public static final /* enum */ as dxp = new as("dripLava", 19, false);
    public static final /* enum */ as dxq = new as("angryVillager", 20, false);
    public static final /* enum */ as dxr = new as("happyVillager", 21, false);
    public static final /* enum */ as dxs = new as("townaura", 22, false);
    public static final /* enum */ as dxt = new as("note", 23, false);
    public static final /* enum */ as dxu = new as("portal", 24, false);
    public static final /* enum */ as dxv = new as("enchantmenttable", 25, false);
    public static final /* enum */ as dxw = new as("flame", 26, false);
    public static final /* enum */ as dxx = new as("lava", 27, false);
    public static final /* enum */ as dxy = new as("footstep", 28, false);
    public static final /* enum */ as dxz = new as("cloud", 29, false);
    public static final /* enum */ as dxA = new as("reddust", 30, false);
    public static final /* enum */ as dxB = new as("snowballpoof", 31, false);
    public static final /* enum */ as dxC = new as("snowshovel", 32, false);
    public static final /* enum */ as dxD = new as("slime", 33, false);
    public static final /* enum */ as dxE = new as("heart", 34, false);
    public static final /* enum */ as dxF = new as("barrier", 35, false);
    public static final /* enum */ as dxG = new as("iconcrack_", 36, false, 2);
    public static final /* enum */ as dxH = new as("blockcrack_", 37, false, 1);
    public static final /* enum */ as dxI = new as("blockdust_", 38, false, 1);
    public static final /* enum */ as dxJ = new as("droplet", 39, false);
    public static final /* enum */ as dxK = new as("take", 40, false);
    public static final /* enum */ as dxL = new as("mobappearance", 41, true);
    private final String dxM;
    private final int dxN;
    private final boolean dxO;
    private final int dxP;
    private static final Map<Integer, as> dxQ;
    private static final String[] dxR;
    private static final /* synthetic */ as[] dxS;

    public static as[] values() {
        return (as[])dxS.clone();
    }

    public static as valueOf(String string) {
        return Enum.valueOf(as.class, string);
    }

    private as(String string2, int n3, boolean bl2, int n4) {
        this.dxM = string2;
        this.dxN = n3;
        this.dxO = bl2;
        this.dxP = n4;
    }

    private as(String string2, int n3, boolean bl2) {
        this(string2, n3, bl2, 0);
    }

    public static String[] asW() {
        return dxR;
    }

    public String asX() {
        return this.dxM;
    }

    public int asY() {
        return this.dxN;
    }

    public int asZ() {
        return this.dxP;
    }

    public boolean ata() {
        return this.dxO;
    }

    public boolean atb() {
        return this.dxP > 0;
    }

    public static as hA(int n2) {
        return dxQ.get(n2);
    }

    private static /* synthetic */ as[] atc() {
        return new as[]{dwW, dwX, dwY, dwZ, dxa, dxb, dxc, dxd, dxe, dxf, dxg, dxh, dxi, dxj, dxk, dxl, dxm, dxn, dxo, dxp, dxq, dxr, dxs, dxt, dxu, dxv, dxw, dxx, dxy, dxz, dxA, dxB, dxC, dxD, dxE, dxF, dxG, dxH, dxI, dxJ, dxK, dxL};
    }

    static {
        dxS = as.atc();
        dxQ = Maps.newHashMap();
        ArrayList arrayList = Lists.newArrayList();
        for (as as2 : as.values()) {
            dxQ.put(as2.asY(), as2);
            if (as2.asX().endsWith("_")) continue;
            arrayList.add(as2.asX());
        }
        dxR = arrayList.toArray(new String[0]);
    }
}

