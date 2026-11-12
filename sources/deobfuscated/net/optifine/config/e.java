/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.config;

public class e {
    private final int eeZ;
    private final int efa;
    private final int efb;
    private final String efc;

    public e(int n2, int n3) {
        this(n2, n3, 0);
    }

    public e(int n2, int n3, int n4) {
        this(n2, n3, n4, null);
    }

    public e(int n2, int n3, int n4, String string) {
        this.eeZ = n2;
        this.efa = n3;
        this.efb = n4;
        this.efc = string;
    }

    public int aBT() {
        return this.eeZ;
    }

    public int aBU() {
        return this.efa;
    }

    public int aBV() {
        return this.efb;
    }

    public int aBW() {
        return this.efa > 9 ? this.eeZ * 100 + this.efa : (this.efb > 9 ? this.eeZ * 100 + this.efa * 10 + 9 : this.eeZ * 100 + this.efa * 10 + this.efb);
    }

    public String toString() {
        return this.efc == null ? this.eeZ + "." + this.efa + "." + this.efb : this.eeZ + "." + this.efa + "." + this.efb + this.efc;
    }
}

