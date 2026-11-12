/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import java.lang.reflect.Array;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class cu<T> {
    private final T[] dAi;
    private final Class<? extends T> dAj;
    private final ReadWriteLock dAk = new ReentrantReadWriteLock();
    private int dAl;
    private int dAm;

    public cu(Class<? extends T> clazz, int n2) {
        this.dAj = clazz;
        this.dAi = (Object[])Array.newInstance(clazz, n2);
    }

    public T A(T t2) {
        this.dAk.writeLock().lock();
        this.dAi[this.dAm] = t2;
        this.dAm = (this.dAm + 1) % this.atK();
        if (this.dAl < this.atK()) {
            ++this.dAl;
        }
        this.dAk.writeLock().unlock();
        return t2;
    }

    public int atK() {
        this.dAk.readLock().lock();
        int n2 = this.dAi.length;
        this.dAk.readLock().unlock();
        return n2;
    }

    public T[] atL() {
        Object[] objectArray = (Object[])Array.newInstance(this.dAj, this.dAl);
        this.dAk.readLock().lock();
        for (int i2 = 0; i2 < this.dAl; ++i2) {
            int n2 = (this.dAm - this.dAl + i2) % this.atK();
            if (n2 < 0) {
                n2 += this.atK();
            }
            objectArray[i2] = this.dAi[n2];
        }
        this.dAk.readLock().unlock();
        return objectArray;
    }
}

