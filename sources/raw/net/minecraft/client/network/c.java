/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.network;

import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.multiplayer.i;
import net.minecraft.client.network.b;

public class c {
    private final List<b> bEw = Lists.newArrayList();
    boolean bEx;

    public synchronized boolean HZ() {
        return this.bEx;
    }

    public synchronized void Ia() {
        this.bEx = false;
    }

    public synchronized List<b> Ib() {
        return Collections.unmodifiableList(this.bEw);
    }

    public synchronized void a(String string, InetAddress inetAddress) {
        String string2 = i.dd(string);
        Object object = i.de(string);
        if (object != null) {
            object = inetAddress.getHostAddress() + ":" + (String)object;
            boolean bl2 = false;
            for (b b2 : this.bEw) {
                if (!b2.HX().equals(object)) continue;
                b2.HY();
                bl2 = true;
                break;
            }
            if (!bl2) {
                this.bEw.add(new b(string2, (String)object));
                this.bEx = true;
            }
        }
    }
}

