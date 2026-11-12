/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import java.util.concurrent.Callable;
import net.minecraft.entity.w;

class x
implements Callable<String> {
    final /* synthetic */ int cvw;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    x(w w2, int n2) {
        this.cvw = n2;
    }

    public String HV() {
        String string = "Once per " + this.cvw + " ticks";
        if (this.cvw == Integer.MAX_VALUE) {
            string = "Maximum (" + string + ")";
        }
        return string;
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

