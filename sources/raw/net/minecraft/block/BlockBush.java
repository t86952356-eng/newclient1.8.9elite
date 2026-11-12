/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockBush
extends Block {
    protected BlockBush() {
        this(Material.bey);
    }

    protected BlockBush(Material material) {
        this(material, material.zK());
    }

    protected BlockBush(Material material, MapColor mapColor) {
        super(material, mapColor);
        this.O(true);
        float f2 = 0.2f;
        this.a(0.3f, 0.0f, 0.3f, 0.7f, 0.6f, 0.7f);
        this.a(a.cpy);
    }

    @Override
    public boolean d(w w2, b b2) {
        return super.d(w2, b2) && this.l(w2.L(b2.aqY()).df());
    }

    protected boolean l(Block block) {
        return block == Blocks.cLe || block == Blocks.cLf || block == Blocks.cMm;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        super.a(w2, b2, iBlockState, block);
        this.e(w2, b2, iBlockState);
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        this.e(w2, b2, iBlockState);
    }

    protected void e(w w2, b b2, IBlockState iBlockState) {
        if (!this.f(w2, b2, iBlockState)) {
            this.a(w2, b2, iBlockState, 0);
            w2.a(b2, Blocks.cLc.xM(), 3);
        }
    }

    public boolean f(w w2, b b2, IBlockState iBlockState) {
        return this.l(w2.L(b2.aqY()).df());
    }

    @Override
    public net.minecraft.util.a a(w w2, b b2, IBlockState iBlockState) {
        return null;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public av xo() {
        return av.dxX;
    }
}

