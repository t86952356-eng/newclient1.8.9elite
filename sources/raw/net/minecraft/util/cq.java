/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.util;

import com.google.common.collect.Maps;
import java.util.Map;

public final class cq
extends Enum<cq> {
    public static final /* enum */ cq dzV = new cq("legacy");
    public static final /* enum */ cq dzW = new cq("mojang");
    private static final Map<String, cq> dzX;
    private final String dzY;
    private static final /* synthetic */ cq[] dzZ;

    public static cq[] values() {
        return (cq[])dzZ.clone();
    }

    public static cq valueOf(String string) {
        return Enum.valueOf(cq.class, string);
    }

    private cq(String string2) {
        this.dzY = string2;
    }

    public static cq gl(String string) {
        return dzX.get(string.toLowerCase());
    }

    private static /* synthetic */ cq[] atG() {
        return new cq[]{dzV, dzW};
    }

    static {
        dzZ = cq.atG();
        dzX = Maps.newHashMap();
        for (cq cq2 : cq.values()) {
            dzX.put(cq2.dzY, cq2);
        }
    }
}

