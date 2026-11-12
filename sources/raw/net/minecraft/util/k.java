/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.UnmodifiableIterator
 */
package net.minecraft.util;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.minecraft.util.h;

class k<T>
extends UnmodifiableIterator<T[]> {
    private int Ho = -2;
    private final Iterable<? extends T>[] dug;
    private final Iterator<? extends T>[] duh;
    private final T[] dui;

    private k(Class<T> clazz, Iterable<? extends T>[] iterableArray) {
        this.dug = iterableArray;
        this.duh = h.a(Iterator.class, this.dug.length);
        for (int i2 = 0; i2 < this.dug.length; ++i2) {
            this.duh[i2] = iterableArray[i2].iterator();
        }
        this.dui = h.a(clazz, this.duh.length);
    }

    private void arg() {
        this.Ho = -1;
        Arrays.fill(this.duh, null);
        Arrays.fill(this.dui, null);
    }

    public boolean hasNext() {
        if (this.Ho == -2) {
            this.Ho = 0;
            for (Iterator<T> iterator : this.duh) {
                if (iterator.hasNext()) continue;
                this.arg();
                break;
            }
            return true;
        }
        if (this.Ho >= this.duh.length) {
            Iterator<T> iterator;
            this.Ho = this.duh.length - 1;
            while (this.Ho >= 0 && !(iterator = this.duh[this.Ho]).hasNext()) {
                if (this.Ho == 0) {
                    this.arg();
                    break;
                }
                iterator = this.dug[this.Ho].iterator();
                this.duh[this.Ho] = iterator;
                if (!iterator.hasNext()) {
                    this.arg();
                    break;
                }
                --this.Ho;
            }
        }
        return this.Ho >= 0;
    }

    public T[] arh() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        while (this.Ho < this.duh.length) {
            this.dui[this.Ho] = this.duh[this.Ho].next();
            ++this.Ho;
        }
        return (Object[])this.dui.clone();
    }

    public /* synthetic */ Object next() {
        return this.arh();
    }
}

