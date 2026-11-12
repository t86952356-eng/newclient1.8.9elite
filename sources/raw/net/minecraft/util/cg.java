/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 */
package net.minecraft.util;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import net.minecraft.util.bd;

public class cg<T>
implements bd<T> {
    private final IdentityHashMap<T, Integer> dzB = new IdentityHashMap(512);
    private final List<T> dzC = Lists.newArrayList();

    public void a(T t2, int n2) {
        this.dzB.put(t2, n2);
        while (this.dzC.size() <= n2) {
            this.dzC.add(null);
        }
        this.dzC.set(n2, t2);
    }

    public int x(T t2) {
        Integer n2 = this.dzB.get(t2);
        return n2 == null ? -1 : n2;
    }

    public final T hS(int n2) {
        return n2 >= 0 && n2 < this.dzC.size() ? (T)this.dzC.get(n2) : null;
    }

    @Override
    public Iterator<T> iterator() {
        return Iterators.filter(this.dzC.iterator(), (Predicate)Predicates.notNull());
    }
}

