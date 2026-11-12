/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.crash;

import java.util.concurrent.Callable;
import net.minecraft.block.state.IBlockState;

class m
implements Callable<String> {
    final /* synthetic */ IBlockState cps;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    m(IBlockState iBlockState) {
        this.cps = iBlockState;
    }

    public String HV() {
        return this.cps.toString();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

