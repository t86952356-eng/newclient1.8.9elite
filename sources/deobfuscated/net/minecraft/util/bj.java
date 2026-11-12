/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.util.bk;

public class bj<V> {
    private transient bk<V>[] dyt = new bk[16];
    private transient int akW;
    private int dyu = 12;
    private final float dyv = 0.75f;

    private static int hD(int n2) {
        n2 = n2 ^ n2 >>> 20 ^ n2 >>> 12;
        return n2 ^ n2 >>> 7 ^ n2 >>> 4;
    }

    private static int aD(int n2, int n3) {
        return n2 & n3 - 1;
    }

    public V hE(int n2) {
        int n3 = bj.hD(n2);
        bk<V> bk2 = this.dyt[bj.aD(n3, this.dyt.length)];
        while (bk2 != null) {
            if (bk2.dyw == n2) {
                return bk2.dyx;
            }
            bk2 = bk2.dyy;
        }
        return null;
    }

    public boolean hF(int n2) {
        return this.hG(n2) != null;
    }

    final bk<V> hG(int n2) {
        int n3 = bj.hD(n2);
        bk<V> bk2 = this.dyt[bj.aD(n3, this.dyt.length)];
        while (bk2 != null) {
            if (bk2.dyw == n2) {
                return bk2;
            }
            bk2 = bk2.dyy;
        }
        return null;
    }

    public void c(int n2, V v2) {
        int n3 = bj.hD(n2);
        int n4 = bj.aD(n3, this.dyt.length);
        bk<V> bk2 = this.dyt[n4];
        while (bk2 != null) {
            if (bk2.dyw == n2) {
                bk2.dyx = v2;
                return;
            }
            bk2 = bk2.dyy;
        }
        this.a(n3, n2, v2, n4);
    }

    private void hH(int n2) {
        bk<V>[] bkArray = this.dyt;
        int n3 = bkArray.length;
        if (n3 == 0x40000000) {
            this.dyu = Integer.MAX_VALUE;
        } else {
            bk[] bkArray2 = new bk[n2];
            this.a(bkArray2);
            this.dyt = bkArray2;
            this.dyu = (int)((float)n2 * this.dyv);
        }
    }

    private void a(bk<V>[] bkArray) {
        bk<V>[] bkArray2 = this.dyt;
        int n2 = bkArray.length;
        for (int i2 = 0; i2 < bkArray2.length; ++i2) {
            bk bk2;
            bk<V> bk3 = bkArray2[i2];
            if (bk3 == null) continue;
            bkArray2[i2] = null;
            do {
                bk2 = bk3.dyy;
                int n3 = bj.aD(bk3.dyz, n2);
                bk3.dyy = bkArray[n3];
                bkArray[n3] = bk3;
                bk3 = bk2;
            } while (bk2 != null);
        }
    }

    public V hI(int n2) {
        bk<V> bk2 = this.hJ(n2);
        return bk2 == null ? null : (V)bk2.dyx;
    }

    final bk<V> hJ(int n2) {
        bk<V> bk2;
        int n3 = bj.hD(n2);
        int n4 = bj.aD(n3, this.dyt.length);
        bk<V> bk3 = bk2 = this.dyt[n4];
        while (bk3 != null) {
            bk bk4 = bk3.dyy;
            if (bk3.dyw == n2) {
                --this.akW;
                if (bk2 == bk3) {
                    this.dyt[n4] = bk4;
                } else {
                    bk2.dyy = bk4;
                }
                return bk3;
            }
            bk2 = bk3;
            bk3 = bk4;
        }
        return bk3;
    }

    public void CY() {
        bk<V>[] bkArray = this.dyt;
        for (int i2 = 0; i2 < bkArray.length; ++i2) {
            bkArray[i2] = null;
        }
        this.akW = 0;
    }

    private void a(int n2, int n3, V v2, int n4) {
        bk<V> bk2 = this.dyt[n4];
        this.dyt[n4] = new bk<V>(n2, n3, v2, bk2);
        if (this.akW++ >= this.dyu) {
            this.hH(2 * this.dyt.length);
        }
    }
}

