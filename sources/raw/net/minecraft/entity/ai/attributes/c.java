/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 */
package net.minecraft.entity.ai.attributes;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.Map;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.entity.ai.attributes.d;
import net.minecraft.entity.ai.attributes.e;
import net.minecraft.server.management.LowerStringMap;

public abstract class c {
    protected final Map<d, e> cAI = Maps.newHashMap();
    protected final Map<String, e> cAJ = new LowerStringMap<e>();
    protected final Multimap<d, d> cAK = HashMultimap.create();

    public e b(d d2) {
        return this.cAI.get(d2);
    }

    public e ef(String string) {
        return this.cAJ.get(string);
    }

    public e c(d d2) {
        if (this.cAJ.containsKey(d2.Xs())) {
            throw new IllegalArgumentException("Attribute is already registered!");
        }
        e e2 = this.d(d2);
        this.cAJ.put(d2.Xs(), e2);
        this.cAI.put(d2, e2);
        for (d d3 = d2.Xv(); d3 != null; d3 = d3.Xv()) {
            this.cAK.put((Object)d3, (Object)d2);
        }
        return e2;
    }

    protected abstract e d(d var1);

    public Collection<e> Xw() {
        return this.cAJ.values();
    }

    public void b(e e2) {
    }

    public void a(Multimap<String, a> multimap) {
        for (Map.Entry entry : multimap.entries()) {
            e e2 = this.ef((String)entry.getKey());
            if (e2 == null) continue;
            e2.d((a)entry.getValue());
        }
    }

    public void b(Multimap<String, a> multimap) {
        for (Map.Entry entry : multimap.entries()) {
            e e2 = this.ef((String)entry.getKey());
            if (e2 == null) continue;
            e2.d((a)entry.getValue());
            e2.c((a)entry.getValue());
        }
    }
}

