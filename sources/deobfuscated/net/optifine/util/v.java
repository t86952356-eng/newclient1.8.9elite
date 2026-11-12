/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import net.optifine.util.t;

public class v<T> {
    private final T eMW;
    private v<T> eMX;
    private v<T> eMY;
    private t<T> eMZ;

    public v(T t2) {
        this.eMW = t2;
    }

    public T aJj() {
        return this.eMW;
    }

    public v<T> aJk() {
        return this.eMX;
    }

    public v<T> aJl() {
        return this.eMY;
    }

    private void g(v<T> v2) {
        this.eMX = v2;
    }

    private void h(v<T> v2) {
        this.eMY = v2;
    }

    private void a(t<T> t2) {
        this.eMZ = t2;
    }

    public String toString() {
        return String.valueOf(this.eMW);
    }
}

