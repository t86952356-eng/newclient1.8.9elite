/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network;

import java.util.concurrent.Callable;
import net.minecraft.network.ab;
import net.minecraft.network.r;

class ah
implements Callable<String> {
    final /* synthetic */ r dap;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ah(ab ab2, r r2) {
        this.dap = r2;
    }

    public String HV() {
        return ((Object)((Object)this.dap)).toString();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

