/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.http;

import java.util.Map;
import net.optifine.http.c;
import net.optifine.http.j;
import net.optifine.http.k;

class e
implements c {
    final /* synthetic */ Map ekz;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    e(Map map) {
        this.ekz = map;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(j j2, k k2) {
        Map map = this.ekz;
        synchronized (map) {
            this.ekz.put("Response", k2);
            this.ekz.notifyAll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(j j2, Exception exception) {
        Map map = this.ekz;
        synchronized (map) {
            this.ekz.put("Exception", exception);
            this.ekz.notifyAll();
        }
    }
}

