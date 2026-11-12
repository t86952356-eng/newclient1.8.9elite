/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import java.util.concurrent.Callable;
import net.minecraft.world.w;

class z
implements Callable<String> {
    final /* synthetic */ w dDG;

    z(w w2) {
        this.dDG = w2;
    }

    public String HV() {
        return this.dDG.dCY.size() + " total; " + String.valueOf(this.dDG.dCY);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

