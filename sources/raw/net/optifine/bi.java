/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.BitSet;
import net.minecraft.src.a;
import net.optifine.shaders.ah;

public class bi {
    private static boolean dj;
    private static final BitSet een;
    private static final BitSet eeo;

    public static boolean bd() {
        return dj && !ah.eye;
    }

    public static void jA() {
        dj = a.aoH().cik;
    }

    public static void jn(int n2) {
        een.set(n2);
    }

    public static void a(BitSet bitSet) {
        if (bitSet != null) {
            een.or(bitSet);
        }
    }

    public static boolean jo(int n2) {
        return een.get(n2);
    }

    public static void aBK() {
        een.clear();
    }

    public static void jp(int n2) {
        if (n2 >= 0) {
            eeo.set(n2);
        }
    }

    public static boolean jq(int n2) {
        return n2 >= 0 && eeo.get(n2);
    }

    public static void aBL() {
        eeo.clear();
    }

    static {
        een = new BitSet();
        eeo = new BitSet();
    }
}

