/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import java.util.concurrent.Callable;
import net.minecraft.entity.c;
import net.minecraft.entity.n;

class d
implements Callable<String> {
    final /* synthetic */ c cte;

    d(c c2) {
        this.cte = c2;
    }

    public String HV() {
        return n.ad(this.cte) + " (" + this.cte.getClass().getCanonicalName() + ")";
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

