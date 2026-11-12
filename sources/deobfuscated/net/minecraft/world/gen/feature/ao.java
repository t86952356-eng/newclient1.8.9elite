/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.b;
import net.minecraft.world.w;

public abstract class ao {
    private final boolean dPh;

    public ao() {
        this(false);
    }

    public ao(boolean bl2) {
        this.dPh = bl2;
    }

    public abstract boolean b(w var1, Random var2, b var3);

    public void ayx() {
    }

    protected void N(w w2, b b2, IBlockState iBlockState) {
        if (this.dPh) {
            w2.a(b2, iBlockState, 3);
        } else {
            w2.a(b2, iBlockState, 2);
        }
    }
}

