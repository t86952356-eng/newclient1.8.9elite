/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

public class m {
    private int[] eMQ = null;
    private int deS = 0;
    private int eMR = 0;

    public m(int n2) {
        this.eMQ = new int[n2];
    }

    public void kv(int n2) {
        this.eMQ[this.deS] = n2;
        ++this.deS;
        if (this.eMR < this.deS) {
            this.eMR = this.deS;
        }
    }

    public void bY(int n2, int n3) {
        this.eMQ[n2] = n3;
        if (this.eMR < n2) {
            this.eMR = n2;
        }
    }

    public void kw(int n2) {
        this.deS = n2;
    }

    public void t(int[] nArray) {
        for (int this.eMQ[this.deS] : nArray) {
            ++this.deS;
        }
        if (this.eMR < this.deS) {
            this.eMR = this.deS;
        }
    }

    public int kx(int n2) {
        return this.eMQ[n2];
    }

    public int[] aJe() {
        return this.eMQ;
    }

    public void clear() {
        this.deS = 0;
        this.eMR = 0;
    }

    public int aJf() {
        return this.eMR;
    }

    public int getPosition() {
        return this.deS;
    }
}

