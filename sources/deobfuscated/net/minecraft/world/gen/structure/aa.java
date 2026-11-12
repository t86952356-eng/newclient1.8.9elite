/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

public abstract class aa {
    protected IBlockState dQM = Blocks.cLc.xM();

    public abstract void a(Random var1, int var2, int var3, int var4, boolean var5);

    public IBlockState yU() {
        return this.dQM;
    }
}

