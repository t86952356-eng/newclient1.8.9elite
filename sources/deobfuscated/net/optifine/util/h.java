/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import net.minecraft.src.a;

public class h {
    private final Object[] eMK;
    private int eML = 0;

    public h(Object[] objectArray) {
        this.eMK = (Object[])objectArray.clone();
    }

    public h(Object object, Object object2) {
        this(new Object[]{object, object2});
    }

    public h(Object object, Object object2, Object object3) {
        this(new Object[]{object, object2, object3});
    }

    public int hashCode() {
        if (this.eML == 0) {
            this.eML = 7;
            for (int i2 = 0; i2 < this.eMK.length; ++i2) {
                Object object = this.eMK[i2];
                if (object == null) continue;
                this.eML = 31 * this.eML + object.hashCode();
            }
        }
        return this.eML;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof h)) {
            return false;
        }
        h h2 = (h)object;
        Object[] objectArray = h2.aJb();
        if (objectArray.length != this.eMK.length) {
            return false;
        }
        for (int i2 = 0; i2 < this.eMK.length; ++i2) {
            if (h.d(this.eMK[i2], objectArray[i2])) continue;
            return false;
        }
        return true;
    }

    private static boolean d(Object object, Object object2) {
        return object == object2 || object != null && object2 != null && object.equals(object2);
    }

    private Object[] aJb() {
        return this.eMK;
    }

    public Object[] aJc() {
        return (Object[])this.eMK.clone();
    }

    public String toString() {
        return "[" + a.c(this.eMK) + "]";
    }
}

