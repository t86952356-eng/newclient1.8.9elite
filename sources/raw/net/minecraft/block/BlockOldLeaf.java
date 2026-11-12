/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf$1;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.util.b;
import net.minecraft.world.c;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockOldLeaf
extends BlockLeaves {
    public static final PropertyEnum<BlockPlanks$EnumType> aXl = PropertyEnum.a("variant", BlockPlanks$EnumType.class, new BlockOldLeaf$1());

    public BlockOldLeaf() {
        this.h(this.aSG.zS().a(aXl, BlockPlanks$EnumType.aXJ).a(aWz, true).a(aWy, true));
    }

    @Override
    public int e(IBlockState iBlockState) {
        if (iBlockState.df() != this) {
            return super.e(iBlockState);
        }
        BlockPlanks$EnumType blockPlanks$EnumType = iBlockState.b(aXl);
        return blockPlanks$EnumType == BlockPlanks$EnumType.aXK ? c.auU() : (blockPlanks$EnumType == BlockPlanks$EnumType.aXL ? c.auV() : super.e(iBlockState));
    }

    @Override
    public int a(l l2, b b2, int n2) {
        IBlockState iBlockState = l2.L(b2);
        if (iBlockState.df() == this) {
            BlockPlanks$EnumType blockPlanks$EnumType = iBlockState.b(aXl);
            if (blockPlanks$EnumType == BlockPlanks$EnumType.aXK) {
                return c.auU();
            }
            if (blockPlanks$EnumType == BlockPlanks$EnumType.aXL) {
                return c.auV();
            }
        }
        return super.a(l2, b2, n2);
    }

    @Override
    protected void e(w w2, b b2, IBlockState iBlockState, int n2) {
        if (iBlockState.b(aXl) == BlockPlanks$EnumType.aXJ && w2.dDk.nextInt(n2) == 0) {
            BlockOldLeaf.a(w2, b2, new co(Items.cPi, 1, 0));
        }
    }

    @Override
    protected int l(IBlockState iBlockState) {
        return iBlockState.b(aXl) == BlockPlanks$EnumType.aXM ? 40 : super.l(iBlockState);
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        list.add(new co(d2, 1, BlockPlanks$EnumType.aXJ.yc()));
        list.add(new co(d2, 1, BlockPlanks$EnumType.aXK.yc()));
        list.add(new co(d2, 1, BlockPlanks$EnumType.aXL.yc()));
        list.add(new co(d2, 1, BlockPlanks$EnumType.aXM.yc()));
    }

    @Override
    protected co f(IBlockState iBlockState) {
        return new co(d.I(this), 1, iBlockState.b(aXl).yc());
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aXl, this.aZ(n2)).a(aWy, (n2 & 4) == 0).a(aWz, (n2 & 8) > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aXl).yc();
        if (!iBlockState.b(aWy).booleanValue()) {
            n2 |= 4;
        }
        if (iBlockState.b(aWz).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    public BlockPlanks$EnumType aZ(int n2) {
        return BlockPlanks$EnumType.bd((n2 & 3) % 4);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aXl, aWz, aWy);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(aXl).yc();
    }

    @Override
    public void a(w w2, net.minecraft.entity.player.a a2, b b2, IBlockState iBlockState, net.minecraft.tileentity.d d2) {
        if (!w2.dDw && a2.abO() != null && a2.abO().bP() == Items.cRi) {
            a2.a(n.dqC[Block.i(this)]);
            BlockOldLeaf.a(w2, b2, new co(d.I(this), 1, iBlockState.b(aXl).yc()));
        } else {
            super.a(w2, a2, b2, iBlockState, d2);
        }
    }
}

