/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockNewLeaf$1;
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
import net.minecraft.world.w;

public class BlockNewLeaf
extends BlockLeaves {
    public static final PropertyEnum<BlockPlanks$EnumType> aXg = PropertyEnum.a("variant", BlockPlanks$EnumType.class, new BlockNewLeaf$1());

    public BlockNewLeaf() {
        this.h(this.aSG.zS().a(aXg, BlockPlanks$EnumType.aXN).a(aWz, true).a(aWy, true));
    }

    @Override
    protected void e(w w2, b b2, IBlockState iBlockState, int n2) {
        if (iBlockState.b(aXg) == BlockPlanks$EnumType.aXO && w2.dDk.nextInt(n2) == 0) {
            BlockNewLeaf.a(w2, b2, new co(Items.cPi, 1, 0));
        }
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(aXg).yc();
    }

    @Override
    public int f(w w2, b b2) {
        IBlockState iBlockState = w2.L(b2);
        return iBlockState.df().c(iBlockState) & 3;
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        list.add(new co(d2, 1, 0));
        list.add(new co(d2, 1, 1));
    }

    @Override
    protected co f(IBlockState iBlockState) {
        return new co(d.I(this), 1, iBlockState.b(aXg).yc() - 4);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aXg, this.aZ(n2)).a(aWy, (n2 & 4) == 0).a(aWz, (n2 & 8) > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aXg).yc() - 4;
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
        return BlockPlanks$EnumType.bd((n2 & 3) + 4);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aXg, aWz, aWy);
    }

    @Override
    public void a(w w2, net.minecraft.entity.player.a a2, b b2, IBlockState iBlockState, net.minecraft.tileentity.d d2) {
        if (!w2.dDw && a2.abO() != null && a2.abO().bP() == Items.cRi) {
            a2.a(n.dqC[Block.i(this)]);
            BlockNewLeaf.a(w2, b2, new co(d.I(this), 1, iBlockState.b(aXg).yc() - 4));
        } else {
            super.a(w2, a2, b2, iBlockState, d2);
        }
    }
}

