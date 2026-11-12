/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.util.Iterator;
import net.optifine.util.u;
import net.optifine.util.v;

public class t<T> {
    private v<T> eMT;
    private v<T> eMU;
    private int size;

    public void a(v<T> v2) {
        this.e(v2);
        if (this.isEmpty()) {
            this.eMT = v2;
            this.eMU = v2;
        } else {
            v<T> v3 = this.eMT;
            v2.h(v3);
            v3.g(v2);
            this.eMT = v2;
        }
        v2.a(this);
        ++this.size;
    }

    public void b(v<T> v2) {
        this.e(v2);
        if (this.isEmpty()) {
            this.eMT = v2;
            this.eMU = v2;
        } else {
            v<T> v3 = this.eMU;
            v2.g(v3);
            v3.h(v2);
            this.eMU = v2;
        }
        v2.a(this);
        ++this.size;
    }

    public void a(v<T> v2, v<T> v3) {
        if (v2 == null) {
            this.a(v3);
        } else if (v2 == this.eMU) {
            this.b(v3);
        } else {
            this.d(v2);
            this.e(v3);
            v<T> v4 = v2.aJl();
            v2.h(v3);
            v3.g(v2);
            v4.g(v3);
            v3.h(v4);
            v3.a(this);
            ++this.size;
        }
    }

    public v<T> c(v<T> v2) {
        this.d(v2);
        v<T> v3 = v2.aJk();
        v<T> v4 = v2.aJl();
        if (v3 != null) {
            v3.h(v4);
        } else {
            this.eMT = v4;
        }
        if (v4 != null) {
            v4.g(v3);
        } else {
            this.eMU = v3;
        }
        v2.g(null);
        v2.h(null);
        v2.a(null);
        --this.size;
        return v2;
    }

    public void b(v<T> v2, v<T> v3) {
        this.c(v3);
        this.a(v2, v3);
    }

    public boolean a(v<T> v2, v<T> v3, v<T> v4) {
        v<T> v5;
        this.d(v3);
        if (v4 != null) {
            this.d(v4);
        }
        for (v5 = v3; v5 != null && v5 != v4; v5 = v5.aJl()) {
            if (v5 != v2) continue;
            return true;
        }
        if (v5 != v4) {
            throw new IllegalArgumentException("Sublist is not linked, from: " + String.valueOf(v3) + ", to: " + String.valueOf(v4));
        }
        return false;
    }

    private void d(v<T> v2) {
        if (v2.eMZ != this) {
            throw new IllegalArgumentException("Node has different parent, node: " + String.valueOf(v2) + ", parent: " + String.valueOf(v2.eMZ) + ", this: " + String.valueOf(this));
        }
    }

    private void e(v<T> v2) {
        if (v2.eMZ != null) {
            throw new IllegalArgumentException("Node has different parent, node: " + String.valueOf(v2) + ", parent: " + String.valueOf(v2.eMZ) + ", this: " + String.valueOf(this));
        }
    }

    public boolean f(v<T> v2) {
        return v2.eMZ == this;
    }

    public Iterator<v<T>> iterator() {
        u u2 = new u(this);
        return u2;
    }

    public v<T> aJg() {
        return this.eMT;
    }

    public v<T> aJh() {
        return this.eMU;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<v<T>> iterator = this.iterator();
        while (iterator.hasNext()) {
            v<T> v2 = iterator.next();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(v2.aJj());
        }
        return this.size + " [" + String.valueOf(stringBuffer) + "]";
    }
}

