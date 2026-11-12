/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.util.br;

public class bq<V> {
    private transient br<V>[] dyF = new br[4096];
    private transient int dyG;
    private int dyH = this.dyF.length - 1;
    private int dyI = 3072;
    private final float dyJ = 0.75f;
    private volatile transient int dyK;

    private static int A(long l2) {
        return (int)(l2 ^ l2 >>> 27);
    }

    private static int hL(int n2) {
        n2 = n2 ^ n2 >>> 20 ^ n2 >>> 12;
        return n2 ^ n2 >>> 7 ^ n2 >>> 4;
    }

    private static int aE(int n2, int n3) {
        return n2 & n3;
    }

    public int atn() {
        return this.dyG;
    }

    public V B(long l2) {
        int n2 = bq.A(l2);
        br<V> br2 = this.dyF[bq.aE(n2, this.dyH)];
        while (br2 != null) {
            if (br2.dyL == l2) {
                return br2.aRy;
            }
            br2 = br2.dyM;
        }
        return null;
    }

    public boolean C(long l2) {
        return this.D(l2) != null;
    }

    final br<V> D(long l2) {
        int n2 = bq.A(l2);
        br<V> br2 = this.dyF[bq.aE(n2, this.dyH)];
        while (br2 != null) {
            if (br2.dyL == l2) {
                return br2;
            }
            br2 = br2.dyM;
        }
        return null;
    }

    public void a(long l2, V v2) {
        int n2 = bq.A(l2);
        int n3 = bq.aE(n2, this.dyH);
        br<V> br2 = this.dyF[n3];
        while (br2 != null) {
            if (br2.dyL == l2) {
                br2.aRy = v2;
                return;
            }
            br2 = br2.dyM;
        }
        ++this.dyK;
        this.a(n2, l2, v2, n3);
    }

    private void hM(int n2) {
        br<V>[] brArray = this.dyF;
        int n3 = brArray.length;
        if (n3 == 0x40000000) {
            this.dyI = Integer.MAX_VALUE;
        } else {
            br[] brArray2 = new br[n2];
            this.a(brArray2);
            this.dyF = brArray2;
            this.dyH = this.dyF.length - 1;
            float f2 = n2;
            this.getClass();
            this.dyI = (int)(f2 * 0.75f);
        }
    }

    private void a(br<V>[] brArray) {
        br<V>[] brArray2 = this.dyF;
        int n2 = brArray.length;
        for (int i2 = 0; i2 < brArray2.length; ++i2) {
            br br2;
            br<V> br3 = brArray2[i2];
            if (br3 == null) continue;
            brArray2[i2] = null;
            do {
                br2 = br3.dyM;
                int n3 = bq.aE(br3.dyN, n2 - 1);
                br3.dyM = brArray[n3];
                brArray[n3] = br3;
                br3 = br2;
            } while (br2 != null);
        }
    }

    public V E(long l2) {
        br<V> br2 = this.F(l2);
        return br2 == null ? null : (V)br2.aRy;
    }

    final br<V> F(long l2) {
        br<V> br2;
        int n2 = bq.A(l2);
        int n3 = bq.aE(n2, this.dyH);
        br<V> br3 = br2 = this.dyF[n3];
        while (br3 != null) {
            br br4 = br3.dyM;
            if (br3.dyL == l2) {
                ++this.dyK;
                --this.dyG;
                if (br2 == br3) {
                    this.dyF[n3] = br4;
                } else {
                    br2.dyM = br4;
                }
                return br3;
            }
            br2 = br3;
            br3 = br4;
        }
        return br3;
    }

    private void a(int n2, long l2, V v2, int n3) {
        br<V> br2 = this.dyF[n3];
        this.dyF[n3] = new br<V>(n2, l2, v2, br2);
        if (this.dyG++ >= this.dyI) {
            this.hM(2 * this.dyF.length);
        }
    }

    public double ato() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.dyF.length; ++i2) {
            if (this.dyF[i2] == null) continue;
            ++n2;
        }
        return 1.0 * (double)n2 / (double)this.dyG;
    }
}

