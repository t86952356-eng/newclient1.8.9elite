/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.nbt.n;

public abstract class ah {
    public final String dDT;
    private boolean aCw;

    public ah(String string) {
        this.dDT = string;
    }

    public abstract void a(n var1);

    public abstract void b(n var1);

    public void Lw() {
        this.cu(true);
    }

    public void cu(boolean bl2) {
        this.aCw = bl2;
    }

    public boolean awh() {
        return this.aCw;
    }
}

