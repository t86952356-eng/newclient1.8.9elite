/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import java.util.concurrent.Callable;
import net.minecraft.crash.i;

class RenderGlobal$1
implements Callable<String> {
    final /* synthetic */ double bPi;
    final /* synthetic */ double bPj;
    final /* synthetic */ double bPk;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    RenderGlobal$1() {
        void var6_-1;
        void var4_-1;
        void var2_-1;
        this.bPi = var2_-1;
        this.bPj = var4_-1;
        this.bPk = var6_-1;
    }

    public String HV() {
        return i.K(this.bPi, this.bPj, this.bPk);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

