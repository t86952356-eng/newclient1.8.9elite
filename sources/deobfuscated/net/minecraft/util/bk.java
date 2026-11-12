/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.util.bj;

class bk<V> {
    final int dyw;
    V dyx;
    bk<V> dyy;
    final int dyz;

    bk(int n2, int n3, V v2, bk<V> bk2) {
        this.dyx = v2;
        this.dyy = bk2;
        this.dyw = n3;
        this.dyz = n2;
    }

    public final int atl() {
        return this.dyw;
    }

    public final V atm() {
        return this.dyx;
    }

    public final boolean equals(Object object) {
        Integer n2;
        if (!(object instanceof bk)) {
            return false;
        }
        bk bk2 = (bk)object;
        Integer n3 = this.atl();
        if (n3 == (n2 = Integer.valueOf(bk2.atl())) || n3 != null && ((Object)n3).equals(n2)) {
            V v2;
            V v3 = this.atm();
            return v3 == (v2 = bk2.atm()) || v3 != null && v3.equals(v2);
        }
        return false;
    }

    public final int hashCode() {
        return bj.hD(this.dyw);
    }

    public final String toString() {
        return this.atl() + "=" + String.valueOf(this.atm());
    }
}

