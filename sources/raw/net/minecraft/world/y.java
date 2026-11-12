/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.world.w;

class y
implements Callable<String> {
    final /* synthetic */ Block dDF;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    y(w w2, Block block) {
        this.dDF = block;
    }

    public String HV() {
        try {
            return String.format("ID #%d (%s // %s)", Block.i(this.dDF), this.dDF.xB(), this.dDF.getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + Block.i(this.dDF);
        }
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

