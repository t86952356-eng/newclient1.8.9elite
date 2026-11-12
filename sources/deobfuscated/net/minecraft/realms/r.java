/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.realms;

import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.network.handshake.client.a;
import net.minecraft.realms.p;
import net.minecraft.realms.q;
import net.minecraft.realms.s;
import net.minecraft.realms.t;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class r {
    private static final Logger dja = LogManager.getLogger();
    private final List<net.minecraft.network.r> djb = Collections.synchronizedList(Lists.newArrayList());

    public void a(String string, q q2) {
        if (string != null && !string.startsWith("0.0.0.0") && !string.isEmpty()) {
            p p2 = p.fi(string);
            net.minecraft.network.r r2 = net.minecraft.network.r.a(InetAddress.getByName(p2.ajZ()), p2.getPort(), false);
            this.djb.add(r2);
            r2.b(new s(this, q2, r2, string));
            try {
                r2.B(new a(t.djg, p2.ajZ(), p2.getPort(), net.minecraft.network.a.cYH));
                r2.B(new net.minecraft.network.status.client.a());
            }
            catch (Throwable throwable) {
                dja.error(throwable);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void tick() {
        List<net.minecraft.network.r> list = this.djb;
        synchronized (list) {
            Iterator<net.minecraft.network.r> iterator = this.djb.iterator();
            while (iterator.hasNext()) {
                net.minecraft.network.r r2 = iterator.next();
                if (r2.afe()) {
                    r2.afa();
                    continue;
                }
                iterator.remove();
                r2.afj();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void aka() {
        List<net.minecraft.network.r> list = this.djb;
        synchronized (list) {
            Iterator<net.minecraft.network.r> iterator = this.djb.iterator();
            while (iterator.hasNext()) {
                net.minecraft.network.r r2 = iterator.next();
                if (!r2.afe()) continue;
                iterator.remove();
                r2.i(new net.minecraft.util.s("Cancelled"));
            }
        }
    }
}

