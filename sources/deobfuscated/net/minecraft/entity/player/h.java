/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.player;

import java.util.concurrent.Callable;
import net.minecraft.entity.player.g;
import net.minecraft.item.co;

class h
implements Callable<String> {
    final /* synthetic */ co cJI;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    h(g g2, co co2) {
        this.cJI = co2;
    }

    public String HV() {
        return this.cJI.getDisplayName();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

