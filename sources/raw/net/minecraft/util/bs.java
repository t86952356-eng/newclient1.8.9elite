/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.util;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class bs {
    public static <K, V> Map<K, V> a(Iterable<K> iterable, Iterable<V> iterable2) {
        return bs.a(iterable, iterable2, Maps.newLinkedHashMap());
    }

    public static <K, V> Map<K, V> a(Iterable<K> iterable, Iterable<V> iterable2, Map<K, V> map) {
        Iterator<V> iterator = iterable2.iterator();
        for (K k2 : iterable) {
            map.put(k2, iterator.next());
        }
        if (iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        return map;
    }
}

