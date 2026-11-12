/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

public class i {
    private final int eMM;
    private int deN;

    public i(int n2) {
        this.eMM = n2;
        this.deN = n2;
    }

    public synchronized int aJd() {
        int n2 = this.deN++;
        return n2;
    }

    public synchronized void aX() {
        this.deN = this.eMM;
    }

    public int aHt() {
        return this.deN;
    }
}

