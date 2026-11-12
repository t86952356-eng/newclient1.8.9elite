/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import java.util.concurrent.Callable;
import net.minecraft.entity.c;

class f
implements Callable<String> {
    final /* synthetic */ c ctg;

    f(c c2) {
        this.ctg = c2;
    }

    public String HV() {
        return this.ctg.crA.toString();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

