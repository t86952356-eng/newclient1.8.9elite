/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class a {
    private Class eMt = null;
    private int bNE = 0;
    private final ArrayDeque eMu = new ArrayDeque();

    public a(Class clazz, int n2) {
        this.eMt = clazz;
        this.bNE = n2;
    }

    public synchronized Object kr(int n2) {
        Object object = this.eMu.pollLast();
        if (object == null || Array.getLength(object) < n2) {
            object = Array.newInstance(this.eMt, n2);
        }
        return object;
    }

    public synchronized void G(Object object) {
        if (object != null) {
            Class<?> clazz = object.getClass();
            if (clazz.getComponentType() != this.eMt) {
                throw new IllegalArgumentException("Wrong component type");
            }
            if (this.eMu.size() < this.bNE) {
                this.eMu.add(object);
            }
        }
    }
}

