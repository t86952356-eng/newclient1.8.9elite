/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import java.util.Collections;
import java.util.Iterator;
import net.minecraft.util.h;
import net.minecraft.util.k;

class j<T>
implements Iterable<T[]> {
    private final Class<T> due;
    private final Iterable<? extends T>[] duf;

    private j(Class<T> clazz, Iterable<? extends T>[] iterableArray) {
        this.due = clazz;
        this.duf = iterableArray;
    }

    @Override
    public Iterator<T[]> iterator() {
        return this.duf.length <= 0 ? Collections.singletonList(h.a(this.due, 0)).iterator() : new k<T>(this.due, this.duf);
    }
}

