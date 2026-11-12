/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import java.util.concurrent.Callable;
import net.minecraft.entity.c;

class e
implements Callable<String> {
    final /* synthetic */ c ctf;

    e(c c2) {
        this.ctf = c2;
    }

    public String HV() {
        return this.ctf.xU();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

