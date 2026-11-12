/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import java.util.concurrent.Callable;
import net.minecraft.item.co;

class RenderItem$4
implements Callable<String> {
    final /* synthetic */ co bVs;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    RenderItem$4() {
        void var2_-1;
        this.bVs = var2_-1;
    }

    public String HV() {
        return String.valueOf(this.bVs.aeo());
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

