/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.chunk;

public class i {
    private final byte[] dJl;

    public i() {
        this.dJl = new byte[2048];
    }

    public i(byte[] byArray) {
        this.dJl = byArray;
        if (byArray.length != 2048) {
            throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + byArray.length);
        }
    }

    public int T(int n2, int n3, int n4) {
        return this.it(this.U(n2, n3, n4));
    }

    public void u(int n2, int n3, int n4, int n5) {
        this.aY(this.U(n2, n3, n4), n5);
    }

    private int U(int n2, int n3, int n4) {
        return n3 << 8 | n4 << 4 | n2;
    }

    public int it(int n2) {
        int n3 = this.iv(n2);
        return this.iu(n2) ? this.dJl[n3] & 0xF : this.dJl[n3] >> 4 & 0xF;
    }

    public void aY(int n2, int n3) {
        int n4 = this.iv(n2);
        this.dJl[n4] = this.iu(n2) ? (byte)(this.dJl[n4] & 0xF0 | n3 & 0xF) : (byte)(this.dJl[n4] & 0xF | (n3 & 0xF) << 4);
    }

    private boolean iu(int n2) {
        return (n2 & 1) == 0;
    }

    private int iv(int n2) {
        return n2 >> 1;
    }

    public byte[] axQ() {
        return this.dJl;
    }
}

