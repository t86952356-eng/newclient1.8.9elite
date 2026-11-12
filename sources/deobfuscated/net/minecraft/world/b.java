/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

public class b {
    public final int dBK;
    public final int dBL;
    private int dBM = 0;

    public b(int n2, int n3) {
        this.dBK = n2;
        this.dBL = n3;
    }

    public static long aK(int n2, int n3) {
        return (long)n2 & 0xFFFFFFFFL | ((long)n3 & 0xFFFFFFFFL) << 32;
    }

    public int hashCode() {
        if (this.dBM == 0) {
            int n2 = 1664525 * this.dBK + 1013904223;
            int n3 = 1664525 * (this.dBL ^ 0xDEADBEEF) + 1013904223;
            this.dBM = n2 ^ n3;
        }
        return this.dBM;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        b b2 = (b)object;
        return this.dBK == b2.dBK && this.dBL == b2.dBL;
    }

    public int auO() {
        return (this.dBK << 4) + 8;
    }

    public int auP() {
        return (this.dBL << 4) + 8;
    }

    public int auQ() {
        return this.dBK << 4;
    }

    public int auR() {
        return this.dBL << 4;
    }

    public int auS() {
        return (this.dBK << 4) + 15;
    }

    public int auT() {
        return (this.dBL << 4) + 15;
    }

    public net.minecraft.util.b J(int n2, int n3, int n4) {
        return new net.minecraft.util.b((this.dBK << 4) + n2, n3, (this.dBL << 4) + n4);
    }

    public net.minecraft.util.b ia(int n2) {
        return new net.minecraft.util.b(this.auO(), n2, this.auP());
    }

    public String toString() {
        return "[" + this.dBK + ", " + this.dBL + "]";
    }
}

