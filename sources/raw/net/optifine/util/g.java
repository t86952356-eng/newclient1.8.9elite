/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.util.ArrayList;

public class g {
    private ArrayList eMG = null;
    private int eMH = 0;
    private float eMI = 1.0f;
    private int eMJ = 0;

    public g() {
        this(10, 0.75f);
    }

    public g(int n2) {
        this(n2, 0.75f);
    }

    public g(int n2, float f2) {
        this.eMG = new ArrayList(n2);
        this.eMH = n2;
        this.eMI = f2;
    }

    public void d(int n2, Object object) {
        if (object != null) {
            ++this.eMJ;
        }
        this.eMG.add(n2, object);
    }

    public boolean add(Object object) {
        if (object != null) {
            ++this.eMJ;
        }
        return this.eMG.add(object);
    }

    public Object e(int n2, Object object) {
        Object object2 = this.eMG.set(n2, object);
        if (object != object2) {
            if (object2 == null) {
                ++this.eMJ;
            }
            if (object == null) {
                --this.eMJ;
            }
        }
        return object2;
    }

    public Object ku(int n2) {
        Object e2 = this.eMG.remove(n2);
        if (e2 != null) {
            --this.eMJ;
        }
        return e2;
    }

    public void clear() {
        this.eMG.clear();
        this.eMJ = 0;
    }

    public void aIZ() {
        float f2;
        if (this.eMJ <= 0 && this.eMG.size() <= 0) {
            this.clear();
        } else if (this.eMG.size() > this.eMH && (f2 = (float)this.eMJ * 1.0f / (float)this.eMG.size()) <= this.eMI) {
            int n2 = 0;
            for (int i2 = 0; i2 < this.eMG.size(); ++i2) {
                Object e2 = this.eMG.get(i2);
                if (e2 == null) continue;
                if (i2 != n2) {
                    this.eMG.set(n2, e2);
                }
                ++n2;
            }
            if (this.eMG.size() > n2) {
                this.eMG.subList(n2, this.eMG.size()).clear();
            }
        }
    }

    public boolean contains(Object object) {
        return this.eMG.contains(object);
    }

    public Object get(int n2) {
        return this.eMG.get(n2);
    }

    public boolean isEmpty() {
        return this.eMG.isEmpty();
    }

    public int size() {
        return this.eMG.size();
    }

    public int aJa() {
        return this.eMJ;
    }
}

