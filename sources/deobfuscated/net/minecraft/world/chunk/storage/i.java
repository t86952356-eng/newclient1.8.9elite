/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.chunk.storage;

public class i {
    public final byte[] dJK;
    private final int dJL;
    private final int dJM;

    public i(byte[] byArray, int n2) {
        this.dJK = byArray;
        this.dJL = n2;
        this.dJM = n2 + 4;
    }

    public int T(int n2, int n3, int n4) {
        int n5 = n2 << this.dJM | n4 << this.dJL | n3;
        int n6 = n5 >> 1;
        int n7 = n5 & 1;
        return n7 == 0 ? this.dJK[n6] & 0xF : this.dJK[n6] >> 4 & 0xF;
    }
}

