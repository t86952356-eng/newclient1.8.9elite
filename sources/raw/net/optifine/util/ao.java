/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.util.HashMap;
import java.util.Map;

public class ao {
    private static final Map<String, Long> ePb = new HashMap<String, Long>();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean f(String string, long l2) {
        Map<String, Long> map = ePb;
        synchronized (map) {
            long l3;
            long l4 = System.currentTimeMillis();
            Long l5 = ePb.get(string);
            if (l5 == null) {
                l5 = new Long(l4);
                ePb.put(string, l5);
            }
            if (l4 < (l3 = l5.longValue()) + l2) {
                return false;
            }
            ePb.put(string, new Long(l4));
            return true;
        }
    }
}

