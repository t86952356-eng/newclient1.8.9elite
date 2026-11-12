/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.concurrent.Callable;
import net.minecraft.world.gen.structure.o;

class p
implements Callable<String> {
    final /* synthetic */ int dQl;
    final /* synthetic */ int dQm;
    final /* synthetic */ o dQn;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    p(o o2, int n2, int n3) {
        this.dQn = o2;
        this.dQl = n2;
        this.dQm = n3;
    }

    public String HV() {
        return this.dQn.bk(this.dQl, this.dQm) ? "True" : "False";
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

