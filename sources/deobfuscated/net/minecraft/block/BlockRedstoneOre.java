/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockRedstoneOre
extends Block {
    private final boolean aZI;

    public BlockRedstoneOre(boolean bl2) {
        super(Material.bes);
        if (bl2) {
            this.O(true);
        }
        this.aZI = bl2;
    }

    @Override
    public int c(w w2) {
        return 30;
    }

    @Override
    public void a(w w2, b b2, a a2) {
        this.Q(w2, b2);
        super.a(w2, b2, a2);
    }

    @Override
    public void a(w w2, b b2, c c2) {
        this.Q(w2, b2);
        super.a(w2, b2, c2);
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, a a2, ao ao2, float f2, float f3, float f4) {
        this.Q(w2, b2);
        return super.a(w2, b2, iBlockState, a2, ao2, f2, f3, f4);
    }

    private void Q(w w2, b b2) {
        this.R(w2, b2);
        if (this == Blocks.cME) {
            w2.d(b2, Blocks.cMF.xM());
        }
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (this == Blocks.cMF) {
            w2.d(b2, Blocks.cME.xM());
        }
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cQG;
    }

    @Override
    public int a(int n2, Random random) {
        return this.a(random) + random.nextInt(n2 + 1);
    }

    @Override
    public int a(Random random) {
        return 4 + random.nextInt(2);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        super.a(w2, b2, iBlockState, f2, n2);
        if (this.a(iBlockState, w2.dDk, n2) != d.I(this)) {
            int n3 = 1 + w2.dDk.nextInt(5);
            this.a(w2, b2, n3);
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        if (this.aZI) {
            this.R(w2, b2);
        }
    }

    private void R(w w2, b b2) {
        Random random = w2.dDk;
        double d2 = 0.0625;
        for (int i2 = 0; i2 < 6; ++i2) {
            double d3 = (float)b2.wt() + random.nextFloat();
            double d4 = (float)b2.wu() + random.nextFloat();
            double d5 = (float)b2.wx() + random.nextFloat();
            if (i2 == 0 && !w2.L(b2.aqX()).df().xk()) {
                d4 = (double)b2.wu() + 0.0625 + 1.0;
            }
            if (i2 == 1 && !w2.L(b2.aqY()).df().xk()) {
                d4 = (double)b2.wu() - 0.0625;
            }
            if (i2 == 2 && !w2.L(b2.ara()).df().xk()) {
                d5 = (double)b2.wx() + 0.0625 + 1.0;
            }
            if (i2 == 3 && !w2.L(b2.aqZ()).df().xk()) {
                d5 = (double)b2.wx() - 0.0625;
            }
            if (i2 == 4 && !w2.L(b2.arc()).df().xk()) {
                d3 = (double)b2.wt() + 0.0625 + 1.0;
            }
            if (i2 == 5 && !w2.L(b2.arb()).df().xk()) {
                d3 = (double)b2.wt() - 0.0625;
            }
            if (!(d3 < (double)b2.wt() || d3 > (double)(b2.wt() + 1) || d4 < 0.0 || d4 > (double)(b2.wu() + 1) || d5 < (double)b2.wx()) && !(d5 > (double)(b2.wx() + 1))) continue;
            w2.a(as.dxA, d3, d4, d5, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    protected co f(IBlockState iBlockState) {
        return new co(Blocks.cME);
    }
}

