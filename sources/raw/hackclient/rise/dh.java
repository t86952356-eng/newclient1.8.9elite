/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.di;

public class dh
implements di {
    private boolean iI;

    public boolean isCancelled() {
        return this.iI;
    }

    public void setCancelled(boolean bl2) {
        this.iI = bl2;
    }

    public void cF() {
        this.iI = true;
    }
}

