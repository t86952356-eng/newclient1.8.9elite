/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import java.util.concurrent.Callable;
import net.minecraft.item.co;

class RenderItem$3
implements Callable<String> {
    final /* synthetic */ co bVr;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    RenderItem$3() {
        void var2_-1;
        this.bVr = var2_-1;
    }

    public String HV() {
        return String.valueOf(this.bVr.aek());
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

