/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.config;

public class n {
    private final int eft;
    private final int efu;

    public n(int n2, int n3) {
        this.eft = Math.min(n2, n3);
        this.efu = Math.max(n2, n3);
    }

    public boolean jt(int n2) {
        return n2 >= this.eft && n2 <= this.efu;
    }

    public int aBY() {
        return this.eft;
    }

    public int aBZ() {
        return this.efu;
    }

    public String toString() {
        return "min: " + this.eft + ", max: " + this.efu;
    }
}

