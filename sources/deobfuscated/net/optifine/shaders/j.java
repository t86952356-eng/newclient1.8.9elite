/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import java.nio.IntBuffer;
import java.util.Arrays;

public class j {
    private final IntBuffer euP;
    private final int euQ;
    private final boolean[] euR;
    private final boolean[] euS;

    public j(IntBuffer intBuffer, int n2) {
        this.euP = intBuffer;
        this.euQ = n2;
        this.euR = new boolean[intBuffer.capacity()];
        this.euS = new boolean[intBuffer.capacity()];
    }

    public int jI(int n2) {
        return this.t(n2, this.euR[n2]);
    }

    public int jJ(int n2) {
        return this.t(n2, !this.euR[n2]);
    }

    private int t(int n2, boolean bl2) {
        int n3 = bl2 ? this.euQ : 0;
        return this.euP.get(n3 + n2);
    }

    public void jK(int n2) {
        this.euR[n2] = !this.euR[n2];
        this.euS[n2] = true;
    }

    public boolean jL(int n2) {
        return this.euS[n2];
    }

    public void aX() {
        Arrays.fill(this.euR, false);
        Arrays.fill(this.euS, false);
    }
}

