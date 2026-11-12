/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import java.util.concurrent.Callable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.d;

class g
implements Callable<String> {
    final /* synthetic */ d dri;

    g(d d2) {
        this.dri = d2;
    }

    public String HV() {
        IBlockState iBlockState = this.dri.baU.L(this.dri.aZf);
        int n2 = iBlockState.df().c(iBlockState);
        if (n2 < 0) {
            return "Unknown? (Got " + n2 + ")";
        }
        String string = String.format("%4s", Integer.toBinaryString(n2)).replace(" ", "0");
        return String.format("%1$d / 0x%1$X / 0b%2$s", n2, string);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

