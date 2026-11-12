/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockStem$1;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockStem
extends BlockBush
implements IGrowable {
    public static final PropertyInteger bbt = PropertyInteger.e("age", 0, 7);
    public static final PropertyDirection bbu = PropertyDirection.a("facing", new BlockStem$1());
    private final Block bbv;

    protected BlockStem(Block block) {
        this.h(this.aSG.zS().a(bbt, 0).a(bbu, ao.dwr));
        this.bbv = block;
        this.O(true);
        float f2 = 0.125f;
        this.a(0.375f, 0.0f, 0.375f, 0.625f, 0.25f, 0.625f);
        this.a((a)null);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        iBlockState = iBlockState.a(bbu, ao.dwr);
        for (ao ao2 : ar.dwT) {
            if (l2.L(b2.x(ao2)).df() != this.bbv) continue;
            iBlockState = iBlockState.a(bbu, ao2);
            break;
        }
        return iBlockState;
    }

    @Override
    protected boolean l(Block block) {
        return block == Blocks.cMm;
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        float f2;
        super.b(w2, b2, iBlockState, random);
        if (w2.aP(b2.aqX()) >= 9 && random.nextInt((int)(25.0f / (f2 = BlockCrops.a(this, w2, b2))) + 1) == 0) {
            int n2 = iBlockState.b(bbt);
            if (n2 < 7) {
                iBlockState = iBlockState.a(bbt, n2 + 1);
                w2.a(b2, iBlockState, 2);
            } else {
                for (ao ao2 : ar.dwT) {
                    if (w2.L(b2.x(ao2)).df() != this.bbv) continue;
                    return;
                }
                b2 = b2.x(ar.dwT.g(random));
                Block block = w2.L(b2.aqY()).df();
                if (w2.L((b)b2).df().aSD == Material.beo && (block == Blocks.cMm || block == Blocks.cLf || block == Blocks.cLe)) {
                    w2.d(b2, this.bbv.xM());
                }
            }
        }
    }

    public void J(w w2, b b2, IBlockState iBlockState) {
        int n2 = iBlockState.b(bbt) + bt.b(w2.dDk, 2, 5);
        w2.a(b2, iBlockState.a(bbt, Math.min(7, n2)), 2);
    }

    @Override
    public int e(IBlockState iBlockState) {
        if (iBlockState.df() != this) {
            return super.e(iBlockState);
        }
        int n2 = iBlockState.b(bbt);
        int n3 = n2 * 32;
        int n4 = 255 - n2 * 8;
        int n5 = n2 * 4;
        return n3 << 16 | n4 << 8 | n5;
    }

    @Override
    public int a(l l2, b b2, int n2) {
        return this.e(l2.L(b2));
    }

    @Override
    public void xx() {
        float f2 = 0.125f;
        this.a(0.375f, 0.0f, 0.375f, 0.625f, 0.25f, 0.625f);
    }

    @Override
    public void c(l l2, b b2) {
        this.aSz = (float)(l2.L(b2).b(bbt) * 2 + 2) / 16.0f;
        float f2 = 0.125f;
        this.a(0.375f, 0.0f, 0.375f, 0.625f, (float)this.aSz, 0.625f);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        d d2;
        super.a(w2, b2, iBlockState, f2, n2);
        if (!w2.dDw && (d2 = this.zk()) != null) {
            int n3 = iBlockState.b(bbt);
            for (int i2 = 0; i2 < 3; ++i2) {
                if (w2.dDk.nextInt(15) > n3) continue;
                BlockStem.a(w2, b2, new co(d2));
            }
        }
    }

    protected d zk() {
        return this.bbv == Blocks.cMW ? Items.cRk : (this.bbv == Blocks.cNm ? Items.cRl : null);
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return null;
    }

    @Override
    public d e(w w2, b b2) {
        d d2 = this.zk();
        return d2;
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, boolean bl2) {
        return iBlockState.b(bbt) != 7;
    }

    @Override
    public boolean a(w w2, Random random, b b2, IBlockState iBlockState) {
        return true;
    }

    @Override
    public void b(w w2, Random random, b b2, IBlockState iBlockState) {
        this.J(w2, b2, iBlockState);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(bbt, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(bbt);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bbt, bbu);
    }
}

