/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.config;

import net.minecraft.src.a;

public class p {
    private final int efw;
    private int[] efx;

    public p(int n2) {
        this(n2, null);
    }

    public p(int n2, int n3) {
        this(n2, new int[]{n3});
    }

    public p(int n2, int[] nArray) {
        this.efw = n2;
        this.efx = nArray;
    }

    public boolean bH(int n2, int n3) {
        return this.efw == n2 && (this.efx == null || a.d(n3, this.efx));
    }

    private boolean jv(int n2) {
        return this.efx != null && a.d(n2, this.efx);
    }

    public boolean jw(int n2) {
        if (this.efx == null) {
            this.efx = new int[]{n2};
            return true;
        }
        if (this.jv(n2)) {
            return false;
        }
        this.efx = a.b(this.efx, n2);
        return true;
    }

    public int abq() {
        return this.efw;
    }

    public int[] aCb() {
        return this.efx;
    }

    public String toString() {
        return this.efx == null ? "" + this.efw : this.efw + ":" + a.k(this.efx);
    }
}

