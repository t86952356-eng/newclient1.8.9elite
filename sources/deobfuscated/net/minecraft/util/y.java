/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package net.minecraft.util;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.util.z;
import net.optifine.util.o;

public class y<T>
extends AbstractSet<T> {
    private static final Set<Class<?>> duF = Collections.newSetFromMap(new ConcurrentHashMap());
    private final Map<Class<?>, List<T>> duG = Maps.newHashMap();
    private final Set<Class<?>> duH = Sets.newIdentityHashSet();
    private final Class<T> duI;
    private final List<T> duJ = Lists.newArrayList();
    public boolean empty;

    public y(Class<T> clazz) {
        this.duI = clazz;
        this.duH.add(clazz);
        this.duG.put(clazz, this.duJ);
        for (Class<?> clazz2 : duF) {
            this.o(clazz2);
        }
        this.empty = this.duJ.size() == 0;
    }

    protected void o(Class<?> clazz) {
        duF.add(clazz);
        int n2 = this.duJ.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            T t2 = this.duJ.get(i2);
            if (!clazz.isAssignableFrom(t2.getClass())) continue;
            this.a(t2, clazz);
        }
        this.duH.add(clazz);
    }

    protected Class<?> p(Class<?> clazz) {
        if (this.duI.isAssignableFrom(clazz)) {
            if (!this.duH.contains(clazz)) {
                this.o(clazz);
            }
            return clazz;
        }
        throw new IllegalArgumentException("Don't know how to search for " + String.valueOf(clazz));
    }

    @Override
    public boolean add(T t2) {
        for (Class<?> clazz : this.duH) {
            if (!clazz.isAssignableFrom(t2.getClass())) continue;
            this.a(t2, clazz);
        }
        this.empty = this.duJ.size() == 0;
        return true;
    }

    private void a(T t2, Class<?> clazz) {
        List<T> list = this.duG.get(clazz);
        if (list == null) {
            this.duG.put(clazz, Lists.newArrayList((Object[])new Object[]{t2}));
        } else {
            list.add(t2);
        }
        this.empty = this.duJ.size() == 0;
    }

    @Override
    public boolean remove(Object object) {
        Object object2 = object;
        boolean bl2 = false;
        for (Class<?> clazz : this.duH) {
            List<T> list;
            if (!clazz.isAssignableFrom(object2.getClass()) || (list = this.duG.get(clazz)) == null || !list.remove(object2)) continue;
            bl2 = true;
        }
        this.empty = this.duJ.size() == 0;
        return bl2;
    }

    @Override
    public boolean contains(Object object) {
        return Iterators.contains(this.q(object.getClass()).iterator(), (Object)object);
    }

    public <S> Iterable<S> q(Class<S> clazz) {
        return new z(this, clazz);
    }

    @Override
    public Iterator<T> iterator() {
        return this.duJ.isEmpty() ? Iterators.emptyIterator() : o.X(this.duJ);
    }

    @Override
    public int size() {
        return this.duJ.size();
    }

    @Override
    public boolean isEmpty() {
        return this.empty;
    }
}

