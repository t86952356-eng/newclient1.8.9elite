/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

public abstract class bo<T> {
    private T aRy;
    private boolean dyC = false;

    public T wD() {
        if (!this.dyC) {
            this.dyC = true;
            this.aRy = this.afm();
        }
        return this.aRy;
    }

    protected abstract T afm();
}

