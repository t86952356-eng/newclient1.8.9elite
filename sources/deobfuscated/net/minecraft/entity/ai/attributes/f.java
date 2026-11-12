/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package net.minecraft.entity.ai.attributes;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.entity.ai.attributes.c;
import net.minecraft.entity.ai.attributes.d;
import net.minecraft.entity.ai.attributes.e;

public class f
implements Serializable,
e {
    private final c cAL;
    private final d cAM;
    private final Map<Integer, Set<a>> cAN = Maps.newHashMap();
    private final Map<String, Set<a>> cAO = Maps.newHashMap();
    private final Map<UUID, a> cAP = Maps.newHashMap();
    private double cAQ;
    private boolean bPW = true;
    private double cAR;

    public f(c c2, d d2) {
        this.cAL = c2;
        this.cAM = d2;
        this.cAQ = d2.Xt();
        for (int i2 = 0; i2 < 3; ++i2) {
            this.cAN.put(i2, Sets.newHashSet());
        }
    }

    @Override
    public d Xx() {
        return this.cAM;
    }

    @Override
    public double Xy() {
        return this.cAQ;
    }

    @Override
    public void ap(double d2) {
        if (d2 != this.Xy()) {
            this.cAQ = d2;
            this.XC();
        }
    }

    @Override
    public Collection<a> eR(int n2) {
        return this.cAN.get(n2);
    }

    @Override
    public Collection<a> Xz() {
        HashSet hashSet = Sets.newHashSet();
        for (int i2 = 0; i2 < 3; ++i2) {
            hashSet.addAll(this.eR(i2));
        }
        return hashSet;
    }

    @Override
    public a h(UUID uUID) {
        return this.cAP.get(uUID);
    }

    @Override
    public boolean b(a a2) {
        return this.cAP.get(a2.Xo()) != null;
    }

    @Override
    public void c(a a2) {
        if (this.h(a2.Xo()) != null) {
            throw new IllegalArgumentException("Modifier is already applied on this attribute!");
        }
        HashSet hashSet = this.cAO.get(a2.getName());
        if (hashSet == null) {
            hashSet = Sets.newHashSet();
            this.cAO.put(a2.getName(), hashSet);
        }
        this.cAN.get(a2.Xp()).add(a2);
        hashSet.add(a2);
        this.cAP.put(a2.Xo(), a2);
        this.XC();
    }

    protected void XC() {
        this.bPW = true;
        this.cAL.b(this);
    }

    @Override
    public void d(a a2) {
        for (int i2 = 0; i2 < 3; ++i2) {
            Set<a> set = this.cAN.get(i2);
            set.remove(a2);
        }
        Set<a> set = this.cAO.get(a2.getName());
        if (set != null) {
            set.remove(a2);
            if (set.isEmpty()) {
                this.cAO.remove(a2.getName());
            }
        }
        this.cAP.remove(a2.Xo());
        this.XC();
    }

    @Override
    public void XA() {
        Collection<a> collection = this.Xz();
        if (collection != null) {
            for (a a2 : Lists.newArrayList(collection)) {
                this.d(a2);
            }
        }
    }

    @Override
    public double XB() {
        if (this.bPW) {
            this.cAR = this.XD();
            this.bPW = false;
        }
        return this.cAR;
    }

    private double XD() {
        double d2 = this.Xy();
        for (a a2 : this.eS(0)) {
            d2 += a2.Xq();
        }
        double d3 = d2;
        for (a a3 : this.eS(1)) {
            d3 += d2 * a3.Xq();
        }
        for (a a3 : this.eS(2)) {
            d3 *= 1.0 + a3.Xq();
        }
        return this.cAM.ao(d3);
    }

    private Collection<a> eS(int n2) {
        HashSet hashSet = Sets.newHashSet(this.eR(n2));
        for (d d2 = this.cAM.Xv(); d2 != null; d2 = d2.Xv()) {
            e e2 = this.cAL.b(d2);
            if (e2 == null) continue;
            hashSet.addAll(e2.eR(n2));
        }
        return hashSet;
    }
}

