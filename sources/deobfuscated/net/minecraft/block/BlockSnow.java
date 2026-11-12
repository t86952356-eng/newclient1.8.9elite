/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.g;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockSnow
extends Block {
    public static final PropertyInteger baT = PropertyInteger.e("layers", 1, 8);

    protected BlockSnow() {
        super(Material.beM);
        this.h(this.aSG.zS().a(baT, 1));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.O(true);
        this.a(a.cpy);
        this.xx();
    }

    @Override
    public boolean a(l l2, b b2) {
        return l2.L(b2).b(baT) < 5;
    }

    @Override
    public net.minecraft.util.a a(w w2, b b2, IBlockState iBlockState) {
        int n2 = iBlockState.b(baT) - 1;
        float f2 = 0.125f;
        return new net.minecraft.util.a((double)b2.wt() + this.aSv, (double)b2.wu() + this.aSw, (double)b2.wx() + this.aSx, (double)b2.wt() + this.aSy, (float)b2.wu() + (float)n2 * 0.125f, (double)b2.wx() + this.aSA);
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
    public void xx() {
        this.bn(0);
    }

    @Override
    public void c(l l2, b b2) {
        IBlockState iBlockState = l2.L(b2);
        this.bn(iBlockState.b(baT));
    }

    protected void bn(int n2) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, (float)n2 / 8.0f, 1.0f);
    }

    @Override
    public boolean d(w w2, b b2) {
        IBlockState iBlockState = w2.L(b2.aqY());
        Block block = iBlockState.df();
        return block != Blocks.cMK && block != Blocks.cOD && (block.xb() == Material.bex || block == this && iBlockState.b(baT) >= 7 || block.xk() && block.aSD.zy());
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        this.G(w2, b2, iBlockState);
    }

    private boolean G(w w2, b b2, IBlockState iBlockState) {
        if (!this.d(w2, b2)) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
            return false;
        }
        return true;
    }

    @Override
    public void a(w w2, net.minecraft.entity.player.a a2, b b2, IBlockState iBlockState, net.minecraft.tileentity.d d2) {
        BlockSnow.a(w2, b2, new co(Items.cQH, iBlockState.b(baT) + 1, 0));
        w2.aL(b2);
        a2.a(n.dqC[Block.i(this)]);
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cQH;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (w2.b(g.dCa, b2) > 11) {
            this.a(w2, b2, w2.L(b2), 0);
            w2.aL(b2);
        }
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        return ao2 == ao.dwr || super.a(l2, b2, ao2);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(baT, (n2 & 7) + 1);
    }

    @Override
    public boolean a(w w2, b b2) {
        return w2.L(b2).b(baT) == 1;
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(baT) - 1;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, baT);
    }
}

