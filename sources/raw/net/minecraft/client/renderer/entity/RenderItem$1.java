/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import java.util.concurrent.Callable;
import net.minecraft.item.co;

class RenderItem$1
implements Callable<String> {
    final /* synthetic */ co bVp;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    RenderItem$1() {
        void var2_-1;
        this.bVp = var2_-1;
    }

    public String HV() {
        return String.valueOf(this.bVp.bP());
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

