/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.entity.item;

import com.google.common.collect.Maps;
import java.util.Map;

public final class m
extends Enum<m> {
    public static final /* enum */ m cCG = new m(0, "MinecartRideable");
    public static final /* enum */ m cCH = new m(1, "MinecartChest");
    public static final /* enum */ m cCI = new m(2, "MinecartFurnace");
    public static final /* enum */ m cCJ = new m(3, "MinecartTNT");
    public static final /* enum */ m cCK = new m(4, "MinecartSpawner");
    public static final /* enum */ m cCL = new m(5, "MinecartHopper");
    public static final /* enum */ m cCM = new m(6, "MinecartCommandBlock");
    private static final Map<Integer, m> cCN;
    private final int cCO;
    private final String name;
    private static final /* synthetic */ m[] cCQ;

    public static m[] values() {
        return (m[])cCQ.clone();
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    private m(int n3, String string2) {
        this.cCO = n3;
        this.name = string2;
    }

    public int YG() {
        return this.cCO;
    }

    public String getName() {
        return this.name;
    }

    public static m fh(int n2) {
        m m2 = cCN.get(n2);
        return m2 == null ? cCG : m2;
    }

    private static /* synthetic */ m[] YH() {
        return new m[]{cCG, cCH, cCI, cCJ, cCK, cCL, cCM};
    }

    static {
        cCQ = m.YH();
        cCN = Maps.newHashMap();
        for (m m2 : m.values()) {
            cCN.put(m2.YG(), m2);
        }
    }
}

