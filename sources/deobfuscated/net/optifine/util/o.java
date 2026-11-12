/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import net.optifine.util.p;
import net.optifine.util.q;

public class o {
    private static final Deque<q<Object>> eMS = new ArrayDeque<q<Object>>();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Iterator<Object> X(List list) {
        Deque<q<Object>> deque = eMS;
        synchronized (deque) {
            p p2 = eMS.pollFirst();
            if (p2 == null) {
                p2 = new p();
            }
            p2.Y((List<Object>)list);
            return p2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(q<Object> q2) {
        Deque<q<Object>> deque = eMS;
        synchronized (deque) {
            if (eMS.size() <= 1000) {
                q2.Y(null);
                eMS.addLast(q2);
            }
        }
    }

    static {
        for (int i2 = 0; i2 < 1000; ++i2) {
            p p2 = new p();
            eMS.add(p2);
        }
    }
}

