/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.gen.feature.s;
import net.minecraft.world.w;

public class y
extends s {
    private static final IBlockState dOG = Blocks.cLt.xM().a(BlockOldLog.aXm, BlockPlanks$EnumType.aXK);
    private static final IBlockState dOH = Blocks.cLv.xM().a(BlockOldLeaf.aXl, BlockPlanks$EnumType.aXK).a(BlockLeaves.aWz, false);
    private static final IBlockState dOI = Blocks.cLf.xM().a(BlockDirt.aTC, BlockDirt$DirtType.aTG);
    private final boolean dOJ;

    public y(boolean bl2, boolean bl3) {
        super(bl2, 13, 15, dOG, dOH);
        this.dOJ = bl3;
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        int n2 = this.m(random);
        if (!this.a(w2, random, b2, n2)) {
            return false;
        }
        this.a(w2, b2.wt(), b2.wx(), b2.wu() + n2, 0, random);
        for (int i2 = 0; i2 < n2; ++i2) {
            Block block = w2.L(b2.hq(i2)).df();
            if (block.xb() == Material.beo || block.xb() == Material.bex) {
                this.N(w2, b2.hq(i2), this.dOz);
            }
            if (i2 >= n2 - 1) continue;
            block = w2.L(b2.C(1, i2, 0)).df();
            if (block.xb() == Material.beo || block.xb() == Material.bex) {
                this.N(w2, b2.C(1, i2, 0), this.dOz);
            }
            if ((block = w2.L(b2.C(1, i2, 1)).df()).xb() == Material.beo || block.xb() == Material.bex) {
                this.N(w2, b2.C(1, i2, 1), this.dOz);
            }
            if ((block = w2.L(b2.C(0, i2, 1)).df()).xb() != Material.beo && block.xb() != Material.bex) continue;
            this.N(w2, b2.C(0, i2, 1), this.dOz);
        }
        return true;
    }

    private void a(w w2, int n2, int n3, int n4, int n5, Random random) {
        int n6 = random.nextInt(5) + (this.dOJ ? this.dOy : 3);
        int n7 = 0;
        for (int i2 = n4 - n6; i2 <= n4; ++i2) {
            int n8 = n4 - i2;
            int n9 = n5 + bt.bL((float)n8 / (float)n6 * 3.5f);
            this.h(w2, new b(n2, i2, n3), n9 + (n8 > 0 && n9 == n7 && (i2 & 1) == 0 ? 1 : 0));
            n7 = n9;
        }
    }

    @Override
    public void c(w w2, Random random, b b2) {
        this.ah(w2, b2.arb().aqZ());
        this.ah(w2, b2.hv(2).aqZ());
        this.ah(w2, b2.arb().ht(2));
        this.ah(w2, b2.hv(2).ht(2));
        for (int i2 = 0; i2 < 5; ++i2) {
            int n2 = random.nextInt(64);
            int n3 = n2 % 8;
            int n4 = n2 / 8;
            if (n3 != 0 && n3 != 7 && n4 != 0 && n4 != 7) continue;
            this.ah(w2, b2.C(-3 + n3, 0, -3 + n4));
        }
    }

    private void ah(w w2, b b2) {
        for (int i2 = -2; i2 <= 2; ++i2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                if (Math.abs(i2) == 2 && Math.abs(i3) == 2) continue;
                this.ai(w2, b2.C(i2, 0, i3));
            }
        }
    }

    private void ai(w w2, b b2) {
        for (int i2 = 2; i2 >= -3; --i2) {
            b b3 = b2.hq(i2);
            Block block = w2.L(b3).df();
            if (block == Blocks.cLe || block == Blocks.cLf) {
                this.N(w2, b3, dOI);
                break;
            }
            if (block.xb() != Material.beo && i2 < 0) break;
        }
    }
}

