/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public abstract class BlockSlab
extends Block {
    public static final PropertyEnum<BlockSlab$EnumBlockHalf> baO = PropertyEnum.c("half", BlockSlab$EnumBlockHalf.class);

    public BlockSlab(Material material) {
        super(material);
        if (this.yk()) {
            this.aSl = true;
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
        this.aN(255);
    }

    @Override
    protected boolean xy() {
        return false;
    }

    @Override
    public void c(l l2, b b2) {
        if (this.yk()) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            IBlockState iBlockState = l2.L(b2);
            if (iBlockState.df() == this) {
                if (iBlockState.b(baO) == BlockSlab$EnumBlockHalf.baP) {
                    this.a(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
                } else {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
                }
            }
        }
    }

    @Override
    public void xx() {
        if (this.yk()) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, a a2, List<a> list, c c2) {
        this.c((l)w2, b2);
        super.a(w2, b2, iBlockState, a2, list, c2);
    }

    @Override
    public boolean xk() {
        return this.yk();
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        IBlockState iBlockState = super.a(w2, b2, ao2, f2, f3, f4, n2, r2).a(baO, BlockSlab$EnumBlockHalf.baQ);
        return this.yk() ? iBlockState : (ao2 != ao.dwq && (ao2 == ao.dwr || (double)f3 <= 0.5) ? iBlockState : iBlockState.a(baO, BlockSlab$EnumBlockHalf.baP));
    }

    @Override
    public int a(Random random) {
        return this.yk() ? 2 : 1;
    }

    @Override
    public boolean xf() {
        return this.yk();
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        boolean bl2;
        if (this.yk()) {
            return super.a(l2, b2, ao2);
        }
        if (ao2 != ao.dwr && ao2 != ao.dwq && !super.a(l2, b2, ao2)) {
            return false;
        }
        b b3 = b2.x(ao2.asC());
        IBlockState iBlockState = l2.L(b2);
        IBlockState iBlockState2 = l2.L(b3);
        boolean bl3 = BlockSlab.t(iBlockState.df()) && iBlockState.b(baO) == BlockSlab$EnumBlockHalf.baP;
        boolean bl4 = bl2 = BlockSlab.t(iBlockState2.df()) && iBlockState2.b(baO) == BlockSlab$EnumBlockHalf.baP;
        return bl2 ? ao2 == ao.dwq || ao2 == ao.dwr && super.a(l2, b2, ao2) || !BlockSlab.t(iBlockState.df()) || !bl3 : ao2 == ao.dwr || ao2 == ao.dwq && super.a(l2, b2, ao2) || !BlockSlab.t(iBlockState.df()) || bl3;
    }

    protected static boolean t(Block block) {
        return block == Blocks.cLW || block == Blocks.cNO || block == Blocks.cOR;
    }

    public abstract String bm(int var1);

    @Override
    public int f(w w2, b b2) {
        return super.f(w2, b2) & 7;
    }

    public abstract boolean yk();

    public abstract IProperty<?> ze();

    public abstract Object F(co var1);
}

