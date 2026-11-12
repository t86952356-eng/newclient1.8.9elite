/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.util.b;

public class DestroyBlockProgress {
    private final int bII;
    private final b bIJ;
    private int bIK;
    private int bIL;

    public DestroyBlockProgress(int n2, b b2) {
        this.bII = n2;
        this.bIJ = b2;
    }

    public b yl() {
        return this.bIJ;
    }

    public void cy(int n2) {
        if (n2 > 10) {
            n2 = 10;
        }
        this.bIK = n2;
    }

    public int Ja() {
        return this.bIK;
    }

    public void cz(int n2) {
        this.bIL = n2;
    }

    public int Jb() {
        return this.bIL;
    }
}

