/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.entity;

import com.google.common.collect.Maps;
import java.util.HashMap;
import net.minecraft.entity.boss.b;
import net.minecraft.entity.monster.a;
import net.minecraft.entity.monster.ab;
import net.minecraft.entity.monster.ae;
import net.minecraft.entity.monster.ah;
import net.minecraft.entity.monster.ao;
import net.minecraft.entity.monster.ap;
import net.minecraft.entity.monster.at;
import net.minecraft.entity.monster.au;
import net.minecraft.entity.monster.p;
import net.minecraft.entity.monster.r;
import net.minecraft.entity.monster.z;
import net.minecraft.entity.passive.ai;
import net.minecraft.entity.passive.c;
import net.minecraft.entity.passive.d;
import net.minecraft.entity.passive.e;
import net.minecraft.entity.passive.f;
import net.minecraft.entity.passive.i;
import net.minecraft.entity.passive.j;
import net.minecraft.entity.passive.k;
import net.minecraft.entity.passive.l;
import net.minecraft.entity.passive.u;
import net.minecraft.entity.passive.w;
import net.minecraft.entity.q;

public class v {
    private static final HashMap<Class, q> cvq = Maps.newHashMap();

    public static q j(Class clazz) {
        return cvq.get(clazz);
    }

    static {
        cvq.put(c.class, q.cuf);
        cvq.put(d.class, q.cuf);
        cvq.put(e.class, q.cuf);
        cvq.put(f.class, q.cuf);
        cvq.put(i.class, q.cuf);
        cvq.put(j.class, q.cuf);
        cvq.put(k.class, q.cuf);
        cvq.put(l.class, q.cuf);
        cvq.put(u.class, q.cuf);
        cvq.put(ao.class, q.cuf);
        cvq.put(w.class, q.cuh);
        cvq.put(net.minecraft.entity.monster.w.class, q.cuf);
        cvq.put(ai.class, q.cuf);
        cvq.put(net.minecraft.entity.passive.z.class, q.cuf);
        cvq.put(b.class, q.cuf);
        cvq.put(net.minecraft.entity.boss.d.class, q.cuf);
        cvq.put(a.class, q.cuf);
        cvq.put(net.minecraft.entity.monster.c.class, q.cuf);
        cvq.put(net.minecraft.entity.monster.d.class, q.cuf);
        cvq.put(net.minecraft.entity.monster.e.class, q.cuf);
        cvq.put(net.minecraft.entity.monster.j.class, q.cuf);
        cvq.put(net.minecraft.entity.monster.k.class, q.cuf);
        cvq.put(p.class, q.cuf);
        cvq.put(r.class, q.cuh);
        cvq.put(z.class, q.cuf);
        cvq.put(ab.class, q.cuf);
        cvq.put(ae.class, q.cuf);
        cvq.put(ah.class, q.cuf);
        cvq.put(net.minecraft.entity.monster.ai.class, q.cuf);
        cvq.put(ap.class, q.cuf);
        cvq.put(at.class, q.cuf);
        cvq.put(au.class, q.cuf);
    }
}

