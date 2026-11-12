/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.biome.c;
import net.minecraft.world.d;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockGrass
extends Block
implements IGrowable {
    public static final PropertyBool aVX = PropertyBool.cs("snowy");

    protected BlockGrass() {
        super(Material.bep);
        this.h(this.aSG.zS().a(aVX, Boolean.FALSE));
        this.O(true);
        this.a(a.cpx);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        Block block = l2.L(b2.aqX()).df();
        return iBlockState.a(aVX, block == Blocks.cML || block == Blocks.cMJ);
    }

    @Override
    public int xv() {
        return d.A(0.5, 1.0);
    }

    @Override
    public int e(IBlockState iBlockState) {
        return this.xv();
    }

    @Override
    public int a(l l2, b b2, int n2) {
        return c.w(l2, b2);
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (!w2.dDw) {
            if (w2.aP(b2.aqX()) < 4 && w2.L(b2.aqX()).df().wX() > 2) {
                w2.d(b2, Blocks.cLf.xM());
            } else if (w2.aP(b2.aqX()) >= 9) {
                for (int i2 = 0; i2 < 4; ++i2) {
                    b b3 = b2.C(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    Block block = w2.L(b3.aqX()).df();
                    IBlockState iBlockState2 = w2.L(b3);
                    if (iBlockState2.df() != Blocks.cLf || iBlockState2.b(BlockDirt.aTC) != BlockDirt$DirtType.aTE || w2.aP(b3.aqX()) < 4 || block.wX() > 2) continue;
                    w2.d(b3, Blocks.cLe.xM());
                }
            }
        }
    }

    @Override
    public net.minecraft.item.d a(IBlockState iBlockState, Random random, int n2) {
        return Blocks.cLf.a(Blocks.cLf.xM().a(BlockDirt.aTC, BlockDirt$DirtType.aTE), random, n2);
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, boolean bl2) {
        return true;
    }

    @Override
    public boolean a(w w2, Random random, b b2, IBlockState iBlockState) {
        return true;
    }

    @Override
    public void b(w w2, Random random, b b2, IBlockState iBlockState) {
        b b3 = b2.aqX();
        block0: for (int i2 = 0; i2 < 128; ++i2) {
            b b4 = b3;
            int n2 = 0;
            while (true) {
                if (n2 >= i2 / 16) {
                    Object object;
                    if (w2.L((b)b4).df().aSD != Material.beo) continue block0;
                    if (random.nextInt(8) == 0) {
                        IBlockState iBlockState2;
                        object = w2.aF(b4).a(random, b4);
                        BlockFlower blockFlower = ((BlockFlower$EnumFlowerType)object).yp().yr();
                        if (!blockFlower.f(w2, b4, iBlockState2 = blockFlower.xM().a(blockFlower.yq(), object))) continue block0;
                        w2.a(b4, iBlockState2, 3);
                        continue block0;
                    }
                    object = Blocks.cLJ.xM().a(BlockTallGrass.bcx, BlockTallGrass$EnumType.bcz);
                    if (!Blocks.cLJ.f(w2, b4, (IBlockState)object)) continue block0;
                    w2.a(b4, (IBlockState)object, 3);
                    continue block0;
                }
                if (w2.L((b4 = b4.C(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1)).aqY()).df() != Blocks.cLe || w2.L(b4).df().xd()) continue block0;
                ++n2;
            }
        }
    }

    @Override
    public av xo() {
        return av.dxW;
    }

    @Override
    public int c(IBlockState iBlockState) {
        return 0;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aVX);
    }
}

