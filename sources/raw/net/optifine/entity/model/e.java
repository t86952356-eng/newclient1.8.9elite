/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.model.d;
import net.minecraft.src.a;
import net.optifine.entity.model.aa;
import net.optifine.entity.model.ab;
import net.optifine.entity.model.ac;
import net.optifine.entity.model.ad;
import net.optifine.entity.model.ae;
import net.optifine.entity.model.af;
import net.optifine.entity.model.ag;
import net.optifine.entity.model.ah;
import net.optifine.entity.model.ai;
import net.optifine.entity.model.aj;
import net.optifine.entity.model.ak;
import net.optifine.entity.model.al;
import net.optifine.entity.model.am;
import net.optifine.entity.model.an;
import net.optifine.entity.model.ao;
import net.optifine.entity.model.aq;
import net.optifine.entity.model.ar;
import net.optifine.entity.model.as;
import net.optifine.entity.model.at;
import net.optifine.entity.model.au;
import net.optifine.entity.model.av;
import net.optifine.entity.model.aw;
import net.optifine.entity.model.ax;
import net.optifine.entity.model.ay;
import net.optifine.entity.model.az;
import net.optifine.entity.model.ba;
import net.optifine.entity.model.bb;
import net.optifine.entity.model.bc;
import net.optifine.entity.model.bd;
import net.optifine.entity.model.be;
import net.optifine.entity.model.bf;
import net.optifine.entity.model.h;
import net.optifine.entity.model.i;
import net.optifine.entity.model.j;
import net.optifine.entity.model.k;
import net.optifine.entity.model.m;
import net.optifine.entity.model.n;
import net.optifine.entity.model.o;
import net.optifine.entity.model.p;
import net.optifine.entity.model.q;
import net.optifine.entity.model.r;
import net.optifine.entity.model.s;
import net.optifine.entity.model.t;
import net.optifine.entity.model.u;
import net.optifine.entity.model.v;
import net.optifine.entity.model.w;
import net.optifine.entity.model.x;
import net.optifine.entity.model.y;
import net.optifine.entity.model.z;

public class e {
    private static final Map<String, h> egh = e.aCh();

    private static Map<String, h> aCh() {
        LinkedHashMap<String, h> linkedHashMap = new LinkedHashMap<String, h>();
        e.a(linkedHashMap, new i());
        e.a(linkedHashMap, new k());
        e.a(linkedHashMap, new m());
        e.a(linkedHashMap, new n());
        e.a(linkedHashMap, new p());
        e.a(linkedHashMap, new s());
        e.a(linkedHashMap, new t());
        e.a(linkedHashMap, new u());
        e.a(linkedHashMap, new v());
        e.a(linkedHashMap, new x());
        e.a(linkedHashMap, new y());
        e.a(linkedHashMap, new z());
        e.a(linkedHashMap, new aa());
        e.a(linkedHashMap, new ab());
        e.a(linkedHashMap, new ae());
        e.a(linkedHashMap, new af());
        e.a(linkedHashMap, new ag());
        e.a(linkedHashMap, new ah());
        e.a(linkedHashMap, new ai());
        e.a(linkedHashMap, new ak());
        e.a(linkedHashMap, new aj());
        e.a(linkedHashMap, new al());
        e.a(linkedHashMap, new am());
        e.a(linkedHashMap, new an());
        e.a(linkedHashMap, new ao());
        e.a(linkedHashMap, new aq());
        e.a(linkedHashMap, new ar());
        e.a(linkedHashMap, new au());
        e.a(linkedHashMap, new av());
        e.a(linkedHashMap, new aw());
        e.a(linkedHashMap, new ax());
        e.a(linkedHashMap, new ay());
        e.a(linkedHashMap, new az());
        e.a(linkedHashMap, new ba());
        e.a(linkedHashMap, new bb());
        e.a(linkedHashMap, new bc());
        e.a(linkedHashMap, new bd());
        e.a(linkedHashMap, new be());
        e.a(linkedHashMap, new bf());
        e.a(linkedHashMap, new as());
        e.a(linkedHashMap, new j());
        e.a(linkedHashMap, new o());
        e.a(linkedHashMap, new q());
        e.a(linkedHashMap, new r());
        e.a(linkedHashMap, new w());
        e.a(linkedHashMap, new ac());
        e.a(linkedHashMap, new ad());
        e.a(linkedHashMap, new at());
        return linkedHashMap;
    }

    private static void a(Map<String, h> map, h h2) {
        Object object;
        e.a(map, h2, h2.getName());
        String[] stringArray = h2.getAliases();
        if (stringArray != null) {
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                object = stringArray[i2];
                e.a(map, h2, (String)object);
            }
        }
        d d2 = h2.aCn();
        object = h2.aCo();
        for (int i3 = 0; i3 < ((String[])object).length; ++i3) {
            String string = object[i3];
            net.minecraft.client.model.ag ag2 = h2.a(d2, string);
            if (ag2 != null) continue;
            a.warn("Model renderer not found, model: " + h2.getName() + ", name: " + string);
        }
    }

    private static void a(Map<String, h> map, h h2, String string) {
        if (map.containsKey(string)) {
            a.warn("Model adapter already registered for id: " + string + ", class: " + h2.Np().getName());
        }
        map.put(string, h2);
    }

    public static h hX(String string) {
        return egh.get(string);
    }

    public static String[] aCi() {
        Set<String> set = egh.keySet();
        String[] stringArray = set.toArray(new String[set.size()]);
        return stringArray;
    }
}

