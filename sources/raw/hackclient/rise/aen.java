/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aem;

class aen {
    private final boolean aFt;
    private final long aFu;

    public aen(boolean bl2) {
        this.aFt = bl2;
        this.aFu = System.currentTimeMillis();
    }

    public boolean st() {
        return System.currentTimeMillis() - this.aFu > aem.aFq;
    }
}

