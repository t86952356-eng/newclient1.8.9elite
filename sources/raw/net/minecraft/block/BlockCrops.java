/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class BlockCrops
extends BlockBush
implements IGrowable {
    public static final PropertyInteger aTy = PropertyInteger.e("age", 0, 7);

    protected BlockCrops() {
        this.h(this.aSG.zS().a(aTy, 0));
        this.O(true);
        float f2 = 0.5f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 1.0f);
        this.a((a)null);
        this.L(0.0f);
        this.a(aSb);
        this.xD();
    }

    @Override
    protected boolean l(Block block) {
        return block == Blocks.cMm;
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        float f2;
        int n2;
        super.b(w2, b2, iBlockState, random);
        if (w2.aP(b2.aqX()) >= 9 && (n2 = iBlockState.b(aTy).intValue()) < 7 && random.nextInt((int)(25.0f / (f2 = BlockCrops.a(this, w2, b2))) + 1) == 0) {
            w2.a(b2, iBlockState.a(aTy, n2 + 1), 2);
        }
    }

    public void l(w w2, b b2, IBlockState iBlockState) {
        int n2 = iBlockState.b(aTy) + bt.b(w2.dDk, 2, 5);
        if (n2 > 7) {
            n2 = 7;
        }
        w2.a(b2, iBlockState.a(aTy, n2), 2);
    }

    protected static float a(Block block, w w2, b b2) {
        boolean bl2;
        Object object;
        float f2 = 1.0f;
        b b3 = b2.aqY();
        for (int i2 = -1; i2 <= 1; ++i2) {
            for (int i3 = -1; i3 <= 1; ++i3) {
                float f3 = 0.0f;
                object = w2.L(b3.C(i2, 0, i3));
                if (object.df() == Blocks.cMm) {
                    f3 = 1.0f;
                    if (object.b(BlockFarmland.aUC) > 0) {
                        f3 = 3.0f;
                    }
                }
                if (i2 != 0 || i3 != 0) {
                    f3 /= 4.0f;
                }
                f2 += f3;
            }
        }
        b b4 = b2.aqZ();
        b b5 = b2.ara();
        b b6 = b2.arb();
        object = b2.arc();
        boolean bl3 = block == w2.L(b6).df() || block == w2.L((b)object).df();
        boolean bl4 = bl2 = block == w2.L(b4).df() || block == w2.L(b5).df();
        if (bl3 && bl2) {
            f2 /= 2.0f;
        } else {
            boolean bl5;
            boolean bl6 = bl5 = block == w2.L(b6.aqZ()).df() || block == w2.L(((b)object).aqZ()).df() || block == w2.L(((b)object).ara()).df() || block == w2.L(b6.ara()).df();
            if (bl5) {
                f2 /= 2.0f;
            }
        }
        return f2;
    }

    @Override
    public boolean f(w w2, b b2, IBlockState iBlockState) {
        return (w2.aO(b2) >= 8 || w2.aM(b2)) && this.l(w2.L(b2.aqY()).df());
    }

    protected d ya() {
        return Items.cPR;
    }

    protected d yb() {
        return Items.cPS;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        int n3;
        super.a(w2, b2, iBlockState, f2, 0);
        if (!w2.dDw && (n3 = iBlockState.b(aTy).intValue()) >= 7) {
            int n4 = 3 + n2;
            for (int i2 = 0; i2 < n4; ++i2) {
                if (w2.dDk.nextInt(15) > n3) continue;
                BlockCrops.a(w2, b2, new co(this.ya(), 1, 0));
            }
        }
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return iBlockState.b(aTy) == 7 ? this.yb() : this.ya();
    }

    @Override
    public d e(w w2, b b2) {
        return this.ya();
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, boolean bl2) {
        return iBlockState.b(aTy) < 7;
    }

    @Override
    public boolean a(w w2, Random random, b b2, IBlockState iBlockState) {
        return true;
    }

    @Override
    public void b(w w2, Random random, b b2, IBlockState iBlockState) {
        this.l(w2, b2, iBlockState);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTy, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aTy);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTy);
    }
}

