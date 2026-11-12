/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.BlockRailBase$Rail;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.da;
import net.minecraft.world.l;
import net.minecraft.world.w;

public abstract class BlockRailBase
extends Block {
    protected final boolean aYP;

    public static boolean P(w w2, b b2) {
        return BlockRailBase.p(w2.L(b2));
    }

    public static boolean p(IBlockState iBlockState) {
        Block block = iBlockState.df();
        return block == Blocks.cMx || block == Blocks.cLF || block == Blocks.cLG || block == Blocks.cOu;
    }

    protected BlockRailBase(boolean bl2) {
        super(Material.beE);
        this.aYP = bl2;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.a(a.cpA);
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
    public ce a(w w2, b b2, da da2, da da3) {
        this.c((l)w2, b2);
        return super.a(w2, b2, da2, da3);
    }

    @Override
    public void c(l l2, b b2) {
        BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection;
        IBlockState iBlockState = l2.L(b2);
        BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection2 = blockRailBase$EnumRailDirection = iBlockState.df() == this ? iBlockState.b(this.yP()) : null;
        if (blockRailBase$EnumRailDirection != null && blockRailBase$EnumRailDirection.yQ()) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        }
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public boolean d(w w2, b b2) {
        return w.v(w2, b2.aqY());
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        if (!w2.dDw) {
            iBlockState = this.b(w2, b2, iBlockState, true);
            if (this.aYP) {
                this.a(w2, b2, iBlockState, this);
            }
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!w2.dDw) {
            boolean bl2;
            BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection = iBlockState.b(this.yP());
            boolean bl3 = bl2 = !w.v(w2, b2.aqY());
            if (blockRailBase$EnumRailDirection == BlockRailBase$EnumRailDirection.aYS && !w.v(w2, b2.arc())) {
                bl2 = true;
            } else if (blockRailBase$EnumRailDirection == BlockRailBase$EnumRailDirection.aYT && !w.v(w2, b2.arb())) {
                bl2 = true;
            } else if (blockRailBase$EnumRailDirection == BlockRailBase$EnumRailDirection.aYU && !w.v(w2, b2.aqZ())) {
                bl2 = true;
            } else if (blockRailBase$EnumRailDirection == BlockRailBase$EnumRailDirection.aYV && !w.v(w2, b2.ara())) {
                bl2 = true;
            }
            if (bl2) {
                this.a(w2, b2, iBlockState, 0);
                w2.aL(b2);
            } else {
                this.b(w2, b2, iBlockState, block);
            }
        }
    }

    protected void b(w w2, b b2, IBlockState iBlockState, Block block) {
    }

    protected IBlockState b(w w2, b b2, IBlockState iBlockState, boolean bl2) {
        return w2.dDw ? iBlockState : new BlockRailBase$Rail(this, w2, b2, iBlockState).c(w2.bb(b2), bl2).yU();
    }

    @Override
    public int xE() {
        return 0;
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        super.d(w2, b2, iBlockState);
        if (iBlockState.b(this.yP()).yQ()) {
            w2.c(b2.aqX(), this);
        }
        if (this.aYP) {
            w2.c(b2, this);
            w2.c(b2.aqY(), this);
        }
    }

    public abstract IProperty<BlockRailBase$EnumRailDirection> yP();
}

