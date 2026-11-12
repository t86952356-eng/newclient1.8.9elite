/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.util.bq;

class br<V> {
    final long dyL;
    V aRy;
    br<V> dyM;
    final int dyN;

    br(int n2, long l2, V v2, br<V> br2) {
        this.aRy = v2;
        this.dyM = br2;
        this.dyL = l2;
        this.dyN = n2;
    }

    public final long atp() {
        return this.dyL;
    }

    public final V atq() {
        return this.aRy;
    }

    public final boolean equals(Object object) {
        Long l2;
        if (!(object instanceof br)) {
            return false;
        }
        br br2 = (br)object;
        Long l3 = this.atp();
        if (l3 == (l2 = Long.valueOf(br2.atp())) || l3 != null && ((Object)l3).equals(l2)) {
            V v2;
            V v3 = this.atq();
            return v3 == (v2 = br2.atq()) || v3 != null && v3.equals(v2);
        }
        return false;
    }

    public final int hashCode() {
        return bq.A(this.dyL);
    }

    public final String toString() {
        return this.atp() + "=" + String.valueOf(this.atq());
    }
}

