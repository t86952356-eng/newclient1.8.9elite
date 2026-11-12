/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.crash;

import java.util.concurrent.Callable;
import net.minecraft.block.Block;

class j
implements Callable<String> {
    final /* synthetic */ int cpo;
    final /* synthetic */ Block cpp;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    j(int n2, Block block) {
        this.cpo = n2;
        this.cpp = block;
    }

    public String HV() {
        try {
            return String.format("ID #%d (%s // %s)", this.cpo, this.cpp.xB(), this.cpp.getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + this.cpo;
        }
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

