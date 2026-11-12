/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.d;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockMycelium
extends Block {
    public static final PropertyBool aXe = PropertyBool.cs("snowy");

    protected BlockMycelium() {
        super(Material.bep, MapColor.bea);
        this.h(this.aSG.zS().a(aXe, false));
        this.O(true);
        this.a(a.cpx);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        Block block = l2.L(b2.aqX()).df();
        return iBlockState.a(aXe, block == Blocks.cML || block == Blocks.cMJ);
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (!w2.dDw) {
            if (w2.aP(b2.aqX()) < 4 && w2.L(b2.aqX()).df().wX() > 2) {
                w2.d(b2, Blocks.cLf.xM().a(BlockDirt.aTC, BlockDirt$DirtType.aTE));
            } else if (w2.aP(b2.aqX()) >= 9) {
                for (int i2 = 0; i2 < 4; ++i2) {
                    b b3 = b2.C(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    IBlockState iBlockState2 = w2.L(b3);
                    Block block = w2.L(b3.aqX()).df();
                    if (iBlockState2.df() != Blocks.cLf || iBlockState2.b(BlockDirt.aTC) != BlockDirt$DirtType.aTE || w2.aP(b3.aqX()) < 4 || block.wX() > 2) continue;
                    w2.d(b3, this.xM());
                }
            }
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        super.c(w2, b2, iBlockState, random);
        if (random.nextInt(10) == 0) {
            w2.a(as.dxs, (float)b2.wt() + random.nextFloat(), (double)((float)b2.wu() + 1.1f), (double)((float)b2.wx() + random.nextFloat()), 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Blocks.cLf.a(Blocks.cLf.xM().a(BlockDirt.aTC, BlockDirt$DirtType.aTE), random, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return 0;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aXe);
    }
}

