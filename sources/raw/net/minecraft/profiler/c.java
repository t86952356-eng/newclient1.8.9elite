/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.profiler;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.TimerTask;
import net.minecraft.profiler.b;
import net.minecraft.util.ay;

class c
extends TimerTask {
    final /* synthetic */ b dhQ;

    c(b b2) {
        this.dhQ = b2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        if (this.dhQ.dhL.Bd()) {
            HashMap hashMap;
            Object object = this.dhQ.dhN;
            synchronized (object) {
                hashMap = Maps.newHashMap(this.dhQ.dhI);
                if (this.dhQ.dhP == 0) {
                    hashMap.putAll(this.dhQ.dhH);
                }
                hashMap.put("snooper_count", this.dhQ.dhP++);
                hashMap.put("snooper_token", this.dhQ.dhJ);
            }
            ay.a(this.dhQ.dhK, hashMap, true);
        }
    }
}

