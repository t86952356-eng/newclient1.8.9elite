/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.b;
import net.minecraft.world.w;

public interface IGrowable {
    public boolean a(w var1, b var2, IBlockState var3, boolean var4);

    public boolean a(w var1, Random var2, b var3, IBlockState var4);

    public void b(w var1, Random var2, b var3, IBlockState var4);
}

