/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import java.util.concurrent.Callable;
import net.minecraft.entity.c;

class g
implements Callable<String> {
    final /* synthetic */ c cth;

    g(c c2) {
        this.cth = c2;
    }

    public String HV() {
        return this.cth.crC.toString();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

