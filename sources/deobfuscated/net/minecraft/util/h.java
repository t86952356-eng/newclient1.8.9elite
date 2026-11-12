/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 */
package net.minecraft.util;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.i;
import net.minecraft.util.j;

public class h {
    public static <T> Iterable<T[]> a(Class<T> clazz, Iterable<? extends Iterable<? extends T>> iterable) {
        return new j<T>(clazz, h.b(Iterable.class, iterable));
    }

    public static <T> Iterable<List<T>> a(Iterable<? extends Iterable<? extends T>> iterable) {
        return h.b(h.a(Object.class, iterable));
    }

    private static <T> Iterable<List<T>> b(Iterable<Object[]> iterable) {
        return Iterables.transform(iterable, new i());
    }

    private static <T> T[] b(Class<? super T> clazz, Iterable<? extends T> iterable) {
        ArrayList arrayList = Lists.newArrayList();
        for (T t2 : iterable) {
            arrayList.add(t2);
        }
        return arrayList.toArray(h.a(clazz, arrayList.size()));
    }

    private static <T> T[] a(Class<? super T> clazz, int n2) {
        return (Object[])Array.newInstance(clazz, n2);
    }
}

