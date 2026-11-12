/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.entity.ai.attributes;

import com.google.common.collect.Sets;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.entity.ai.attributes.c;
import net.minecraft.entity.ai.attributes.d;
import net.minecraft.entity.ai.attributes.e;
import net.minecraft.entity.ai.attributes.f;
import net.minecraft.entity.ai.attributes.g;
import net.minecraft.server.management.LowerStringMap;

public class h
extends c
implements Serializable {
    private final Set<e> cAU = Sets.newHashSet();
    protected final Map<String, e> cAV = new LowerStringMap<e>();

    public f e(d d2) {
        return (f)super.b(d2);
    }

    public f eh(String string) {
        e e2 = super.ef(string);
        if (e2 == null) {
            e2 = this.cAV.get(string);
        }
        return (f)e2;
    }

    @Override
    public e c(d d2) {
        e e2 = super.c(d2);
        if (d2 instanceof g && ((g)d2).getDescription() != null) {
            this.cAV.put(((g)d2).getDescription(), e2);
        }
        return e2;
    }

    @Override
    protected e d(d d2) {
        return new f(this, d2);
    }

    @Override
    public void b(e e2) {
        if (e2.Xx().Xu()) {
            this.cAU.add(e2);
        }
        for (d d2 : this.cAK.get((Object)e2.Xx())) {
            f f2 = this.e(d2);
            if (f2 == null) continue;
            f2.XC();
        }
    }

    public Set<e> XE() {
        return this.cAU;
    }

    public Collection<e> XF() {
        HashSet hashSet = Sets.newHashSet();
        for (e e2 : this.Xw()) {
            if (!e2.Xx().Xu()) continue;
            hashSet.add(e2);
        }
        return hashSet;
    }

    @Override
    public /* synthetic */ e ef(String string) {
        return this.eh(string);
    }

    @Override
    public /* synthetic */ e b(d d2) {
        return this.e(d2);
    }
}

