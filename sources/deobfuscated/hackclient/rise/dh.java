/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.di;

public class dh
implements di {
    private boolean cancelled;

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void setCancelled(boolean bl2) {
        this.cancelled = bl2;
    }

    public void cF() {
        this.cancelled = true;
    }
}

