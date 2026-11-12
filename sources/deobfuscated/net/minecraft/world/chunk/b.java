/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.chunk;

import java.util.concurrent.Callable;
import net.minecraft.crash.i;
import net.minecraft.world.chunk.a;

class b
implements Callable<String> {
    final /* synthetic */ int dIZ;
    final /* synthetic */ int dJa;
    final /* synthetic */ int dJb;
    final /* synthetic */ a dJc;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    b(a a2, int n2, int n3, int n4) {
        this.dJc = a2;
        this.dIZ = n2;
        this.dJa = n3;
        this.dJb = n4;
    }

    public String HV() {
        return i.Z(new net.minecraft.util.b(this.dJc.dIK * 16 + this.dIZ, this.dJa, this.dJc.dIL * 16 + this.dJb));
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

