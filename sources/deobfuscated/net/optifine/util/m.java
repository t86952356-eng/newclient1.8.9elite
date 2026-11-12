/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

public class m {
    private int[] eMQ = null;
    private int position = 0;
    private int eMR = 0;

    public m(int n2) {
        this.eMQ = new int[n2];
    }

    public void kv(int n2) {
        this.eMQ[this.position] = n2;
        ++this.position;
        if (this.eMR < this.position) {
            this.eMR = this.position;
        }
    }

    public void bY(int n2, int n3) {
        this.eMQ[n2] = n3;
        if (this.eMR < n2) {
            this.eMR = n2;
        }
    }

    public void kw(int n2) {
        this.position = n2;
    }

    public void t(int[] nArray) {
        for (int this.eMQ[this.position] : nArray) {
            ++this.position;
        }
        if (this.eMR < this.position) {
            this.eMR = this.position;
        }
    }

    public int kx(int n2) {
        return this.eMQ[n2];
    }

    public int[] aJe() {
        return this.eMQ;
    }

    public void clear() {
        this.position = 0;
        this.eMR = 0;
    }

    public int aJf() {
        return this.eMR;
    }

    public int getPosition() {
        return this.position;
    }
}

