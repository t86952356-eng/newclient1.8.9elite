/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.entity.c;
import net.minecraft.entity.n;
import net.minecraft.src.a;

public class k {
    private static final Map<Class, Integer> eMN = new HashMap<Class, Integer>();
    private static final Map<String, Integer> eMO = new HashMap<String, Integer>();
    private static final Map<String, Class> eMP = new HashMap<String, Class>();

    public static int aM(c c2) {
        return c2 == null ? -1 : k.s(c2.getClass());
    }

    public static int s(Class clazz) {
        Integer n2 = eMN.get(clazz);
        return n2 == null ? -1 : n2;
    }

    public static int ka(String string) {
        Integer n2 = eMO.get(string);
        return n2 == null ? -1 : n2;
    }

    public static Class kb(String string) {
        Class clazz = eMP.get(string);
        return clazz;
    }

    static {
        for (int i2 = 0; i2 < 1000; ++i2) {
            String string;
            Class<? extends c> clazz = n.eE(i2);
            if (clazz == null || (string = n.eF(i2)) == null) continue;
            if (eMN.containsKey(clazz)) {
                a.warn("Duplicate entity class: " + String.valueOf(clazz) + ", id1: " + String.valueOf(eMN.get(clazz)) + ", id2: " + i2);
            }
            if (eMO.containsKey(string)) {
                a.warn("Duplicate entity name: " + string + ", id1: " + String.valueOf(eMO.get(string)) + ", id2: " + i2);
            }
            if (eMP.containsKey(string)) {
                a.warn("Duplicate entity name: " + string + ", class1: " + String.valueOf(eMP.get(string)) + ", class2: " + String.valueOf(clazz));
            }
            eMN.put(clazz, i2);
            eMO.put(string, i2);
            eMP.put(string, clazz);
        }
    }
}

