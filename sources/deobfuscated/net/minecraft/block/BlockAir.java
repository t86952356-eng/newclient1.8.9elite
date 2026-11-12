/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.IdentityHashMap;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.a;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockAir
extends Block {
    private static final Map aSQ = new IdentityHashMap();

    protected BlockAir() {
        super(Material.beo);
    }

    @Override
    public int xg() {
        return -1;
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        return null;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public boolean a(IBlockState iBlockState, boolean bl2) {
        return false;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
    }

    @Override
    public boolean a(w w2, b b2) {
        return true;
    }

    public static void d(Block block, int n2) {
        if (!aSQ.containsKey(block)) {
            aSQ.put(block, block.aSm);
        }
        block.aSm = n2;
    }

    public static void k(Block block) {
        if (aSQ.containsKey(block)) {
            int n2 = (Integer)aSQ.get(block);
            BlockAir.d(block, n2);
        }
    }
}

