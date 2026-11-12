/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.uniform;

import java.util.HashMap;
import java.util.Map;
import net.optifine.util.ai;
import net.optifine.util.i;

public class q {
    private static final Map<Integer, ai> eKH = new HashMap<Integer, ai>();
    private static final i eKI = new i(1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static float b(int n2, float f2, float f3, float f4) {
        Map<Integer, ai> map = eKH;
        synchronized (map) {
            Integer n3 = n2;
            ai ai2 = eKH.get(n3);
            if (ai2 == null) {
                ai2 = new ai(f2, f3, f4);
                eKH.put(n3, ai2);
            }
            float f5 = ai2.P(f2, f3, f4);
            return f5;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int aIR() {
        i i2 = eKI;
        synchronized (i2) {
            return eKI.aJd();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void aIS() {
        Map<Integer, ai> map = eKH;
        synchronized (map) {
            eKH.clear();
        }
    }
}

