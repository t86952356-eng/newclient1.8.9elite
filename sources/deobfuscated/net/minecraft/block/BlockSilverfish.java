/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSilverfish$EnumType;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStone$EnumType;
import net.minecraft.block.BlockStoneBrick$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.monster.ae;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockSilverfish
extends Block {
    public static final PropertyEnum<BlockSilverfish$EnumType> baw = PropertyEnum.c("variant", BlockSilverfish$EnumType.class);

    public BlockSilverfish() {
        super(Material.beP);
        this.h(this.aSG.zS().a(baw, BlockSilverfish$EnumType.bax));
        this.L(0.0f);
        this.a(a.cpy);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    public static boolean w(IBlockState iBlockState) {
        Block block = iBlockState.df();
        return iBlockState == Blocks.cLd.xM().a(BlockStone.bbw, BlockStone$EnumType.bbx) || block == Blocks.cLg || block == Blocks.cNh;
    }

    @Override
    protected co f(IBlockState iBlockState) {
        switch (iBlockState.b(baw).ordinal()) {
            case 1: {
                return new co(Blocks.cLg);
            }
            case 2: {
                return new co(Blocks.cNh);
            }
            case 3: {
                return new co(Blocks.cNh, 1, BlockStoneBrick$EnumType.bbQ.yc());
            }
            case 4: {
                return new co(Blocks.cNh, 1, BlockStoneBrick$EnumType.bbR.yc());
            }
            case 5: {
                return new co(Blocks.cNh, 1, BlockStoneBrick$EnumType.bbS.yc());
            }
        }
        return new co(Blocks.cLd);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        if (!w2.dDw && w2.Si().gw("doTileDrops")) {
            ae ae2 = new ae(w2);
            ae2.b((double)b2.wt() + 0.5, (double)b2.wu(), (double)b2.wx() + 0.5, 0.0f, 0.0f);
            w2.G(ae2);
            ae2.Va();
        }
    }

    @Override
    public int f(w w2, b b2) {
        IBlockState iBlockState = w2.L(b2);
        return iBlockState.df().c(iBlockState);
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (BlockSilverfish$EnumType blockSilverfish$EnumType : BlockSilverfish$EnumType.values()) {
            list.add(new co(d2, 1, blockSilverfish$EnumType.yc()));
        }
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(baw, BlockSilverfish$EnumType.bl(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(baw).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, baw);
    }
}

