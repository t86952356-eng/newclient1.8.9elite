/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.player;

import java.util.HashMap;
import java.util.Map;
import net.optifine.http.a;
import net.optifine.http.l;
import net.optifine.player.d;
import net.optifine.player.f;

public class g {
    private static Map emb = null;
    private static final boolean emc = Boolean.getBoolean("player.models.reload");
    private static long emd = System.currentTimeMillis();

    public static void a(net.minecraft.client.model.f f2, net.minecraft.client.entity.a a2, float f3, float f4) {
        d d2 = g.i(a2);
        if (d2 != null) {
            d2.a(f2, a2, f3, f4);
        }
    }

    public static synchronized d i(net.minecraft.client.entity.a a2) {
        Object object;
        if (emc && System.currentTimeMillis() > emd + 5000L && (object = net.minecraft.client.d.AZ().bgK) != null) {
            g.a(((net.minecraft.client.entity.a)object).Dh(), null);
            emd = System.currentTimeMillis();
        }
        if ((object = a2.Dh()) == null) {
            return null;
        }
        d d2 = (d)g.aDt().get(object);
        if (d2 == null) {
            d2 = new d();
            g.aDt().put(object, d2);
            f f2 = new f((String)object);
            String string = l.aDg() + "/users/" + (String)object + ".cfg";
            a a3 = new a(string, f2);
            a3.start();
        }
        return d2;
    }

    public static synchronized void a(String string, d d2) {
        g.aDt().put(string, d2);
    }

    private static Map aDt() {
        if (emb == null) {
            emb = new HashMap();
        }
        return emb;
    }
}

