/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import java.util.concurrent.Callable;
import net.minecraft.item.co;

class RenderItem$2
implements Callable<String> {
    final /* synthetic */ co bVq;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    RenderItem$2() {
        void var2_-1;
        this.bVq = var2_-1;
    }

    public String HV() {
        return String.valueOf(this.bVq.yc());
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

