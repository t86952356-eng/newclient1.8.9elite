/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockNetherWart
extends BlockBush {
    public static final PropertyInteger aXf = PropertyInteger.e("age", 0, 3);

    protected BlockNetherWart() {
        super(Material.bey, MapColor.bee);
        this.h(this.aSG.zS().a(aXf, 0));
        this.O(true);
        float f2 = 0.5f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 1.0f);
        this.a((a)null);
    }

    @Override
    protected boolean l(Block block) {
        return block == Blocks.cMY;
    }

    @Override
    public boolean f(w w2, b b2, IBlockState iBlockState) {
        return this.l(w2.L(b2.aqY()).df());
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        int n2 = iBlockState.b(aXf);
        if (n2 < 3 && random.nextInt(10) == 0) {
            iBlockState = iBlockState.a(aXf, n2 + 1);
            w2.a(b2, iBlockState, 2);
        }
        super.b(w2, b2, iBlockState, random);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        if (!w2.dDw) {
            int n3 = 1;
            if (iBlockState.b(aXf) >= 3) {
                n3 = 2 + w2.dDk.nextInt(3);
                if (n2 > 0) {
                    n3 += w2.dDk.nextInt(n2 + 1);
                }
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                BlockNetherWart.a(w2, b2, new co(Items.cRC));
            }
        }
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public d e(w w2, b b2) {
        return Items.cRC;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aXf, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aXf);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aXf);
    }
}

