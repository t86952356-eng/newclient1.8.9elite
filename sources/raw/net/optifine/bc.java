/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 */
package net.optifine;

import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import net.minecraft.util.bq;
import net.minecraft.world.b;
import net.minecraft.world.s;

public class bc
extends TreeSet {
    private final bq edI = new bq();
    private int dQB = Integer.MIN_VALUE;
    private int dQD = Integer.MIN_VALUE;
    private int dQE = Integer.MIN_VALUE;
    private int dQG = Integer.MIN_VALUE;
    private static final int edJ = Integer.MIN_VALUE;

    public bc(Set set) {
        this.addAll(set);
    }

    @Override
    public boolean contains(Object object) {
        if (!(object instanceof s)) {
            return false;
        }
        s s2 = (s)object;
        Set set = this.a(s2, false);
        return set != null && set.contains(s2);
    }

    @Override
    public boolean add(Object object) {
        boolean bl2;
        if (!(object instanceof s)) {
            return false;
        }
        s s2 = (s)object;
        if (s2 == null) {
            return false;
        }
        Set set = this.a(s2, true);
        boolean bl3 = set.add(s2);
        if (bl3 != (bl2 = super.add(object))) {
            throw new IllegalStateException("Added: " + bl3 + ", addedParent: " + bl2);
        }
        return bl2;
    }

    @Override
    public boolean remove(Object object) {
        boolean bl2;
        if (!(object instanceof s)) {
            return false;
        }
        s s2 = (s)object;
        Set set = this.a(s2, false);
        if (set == null) {
            return false;
        }
        boolean bl3 = set.remove(s2);
        if (bl3 != (bl2 = super.remove(s2))) {
            throw new IllegalStateException("Added: " + bl3 + ", addedParent: " + bl2);
        }
        return bl2;
    }

    private Set a(s s2, boolean bl2) {
        if (s2 == null) {
            return null;
        }
        net.minecraft.util.b b2 = s2.dCC;
        int n2 = b2.wt() >> 4;
        int n3 = b2.wx() >> 4;
        return this.f(n2, n3, bl2);
    }

    private Set f(int n2, int n3, boolean bl2) {
        long l2 = b.aK(n2, n3);
        HashSet hashSet = (HashSet)this.edI.B(l2);
        if (hashSet == null && bl2) {
            hashSet = new HashSet();
            this.edI.a(l2, hashSet);
        }
        return hashSet;
    }

    @Override
    public Iterator iterator() {
        if (this.dQB == Integer.MIN_VALUE) {
            return super.iterator();
        }
        if (this.size() <= 0) {
            return Iterators.emptyIterator();
        }
        int n2 = this.dQB >> 4;
        int n3 = this.dQD >> 4;
        int n4 = this.dQE >> 4;
        int n5 = this.dQG >> 4;
        ArrayList arrayList = new ArrayList();
        for (int i2 = n2; i2 <= n4; ++i2) {
            for (int i3 = n3; i3 <= n5; ++i3) {
                Set set = this.f(i2, i3, false);
                if (set == null) continue;
                arrayList.add(set.iterator());
            }
        }
        if (arrayList.size() <= 0) {
            return Iterators.emptyIterator();
        }
        if (arrayList.size() == 1) {
            return (Iterator)arrayList.get(0);
        }
        return Iterators.concat(arrayList.iterator());
    }

    public void I(int n2, int n3, int n4, int n5) {
        this.dQB = Math.min(n2, n4);
        this.dQD = Math.min(n3, n5);
        this.dQE = Math.max(n2, n4);
        this.dQG = Math.max(n3, n5);
    }

    public void aBH() {
        this.dQB = Integer.MIN_VALUE;
        this.dQD = Integer.MIN_VALUE;
        this.dQE = Integer.MIN_VALUE;
        this.dQG = Integer.MIN_VALUE;
    }
}

