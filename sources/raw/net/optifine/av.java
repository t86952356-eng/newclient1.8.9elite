/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import net.optifine.au;

public class av {
    public long edl = 0L;
    public long edm = 0L;

    public void rJ() {
        if (au.dj && this.edl == 0L) {
            this.edl = System.nanoTime();
        }
    }

    public void vX() {
        if (au.dj && this.edl != 0L) {
            this.edm += System.nanoTime() - this.edl;
            this.edl = 0L;
        }
    }

    private void aX() {
        this.edm = 0L;
        this.edl = 0L;
    }
}

