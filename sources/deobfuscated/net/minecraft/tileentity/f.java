/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.tileentity.d;

class f
implements Callable<String> {
    final /* synthetic */ d drh;

    f(d d2) {
        this.drh = d2;
    }

    public String HV() {
        int n2 = Block.i(this.drh.baU.L(this.drh.aZf).df());
        try {
            return String.format("ID #%d (%s // %s)", n2, Block.aK(n2).xB(), Block.aK(n2).getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + n2;
        }
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

