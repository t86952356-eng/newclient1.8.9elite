/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.Block$EnumOffsetType;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.stats.n;
import net.minecraft.util.b;
import net.minecraft.world.d;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockTallGrass
extends BlockBush
implements IGrowable {
    public static final PropertyEnum<BlockTallGrass$EnumType> bcx = PropertyEnum.c("type", BlockTallGrass$EnumType.class);

    protected BlockTallGrass() {
        super(Material.bez);
        this.h(this.aSG.zS().a(bcx, BlockTallGrass$EnumType.bcy));
        float f2 = 0.4f;
        this.a(0.099999994f, 0.0f, 0.099999994f, 0.9f, 0.8f, 0.9f);
    }

    @Override
    public int xv() {
        return d.A(0.5, 1.0);
    }

    @Override
    public boolean f(w w2, b b2, IBlockState iBlockState) {
        return this.l(w2.L(b2.aqY()).df());
    }

    @Override
    public boolean a(w w2, b b2) {
        return true;
    }

    @Override
    public int e(IBlockState iBlockState) {
        if (iBlockState.df() != this) {
            return super.e(iBlockState);
        }
        BlockTallGrass$EnumType blockTallGrass$EnumType = iBlockState.b(bcx);
        return blockTallGrass$EnumType == BlockTallGrass$EnumType.bcy ? 0xFFFFFF : d.A(0.5, 1.0);
    }

    @Override
    public int a(l l2, b b2, int n2) {
        return l2.aF(b2).bj(b2);
    }

    @Override
    public net.minecraft.item.d a(IBlockState iBlockState, Random random, int n2) {
        return random.nextInt(8) == 0 ? Items.cPR : null;
    }

    @Override
    public int a(int n2, Random random) {
        return 1 + random.nextInt(n2 * 2 + 1);
    }

    @Override
    public void a(w w2, net.minecraft.entity.player.a a2, b b2, IBlockState iBlockState, net.minecraft.tileentity.d d2) {
        if (!w2.dDw && a2.abO() != null && a2.abO().bP() == Items.cRi) {
            a2.a(n.dqC[Block.i(this)]);
            BlockTallGrass.a(w2, b2, new co(Blocks.cLJ, 1, iBlockState.b(bcx).yi()));
        } else {
            super.a(w2, a2, b2, iBlockState, d2);
        }
    }

    @Override
    public int f(w w2, b b2) {
        IBlockState iBlockState = w2.L(b2);
        return iBlockState.df().c(iBlockState);
    }

    @Override
    public void a(net.minecraft.item.d d2, a a2, List<co> list) {
        for (int i2 = 1; i2 < 3; ++i2) {
            list.add(new co(d2, 1, i2));
        }
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, boolean bl2) {
        return iBlockState.b(bcx) != BlockTallGrass$EnumType.bcy;
    }

    @Override
    public boolean a(w w2, Random random, b b2, IBlockState iBlockState) {
        return true;
    }

    @Override
    public void b(w w2, Random random, b b2, IBlockState iBlockState) {
        BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType = BlockDoublePlant$EnumPlantType.aUj;
        if (iBlockState.b(bcx) == BlockTallGrass$EnumType.bcA) {
            blockDoublePlant$EnumPlantType = BlockDoublePlant$EnumPlantType.aUk;
        }
        if (Blocks.cOH.d(w2, b2)) {
            Blocks.cOH.a(w2, b2, blockDoublePlant$EnumPlantType, 2);
        }
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(bcx, BlockTallGrass$EnumType.bs(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(bcx).yi();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bcx);
    }

    @Override
    public Block$EnumOffsetType xN() {
        return Block$EnumOffsetType.aSL;
    }
}

