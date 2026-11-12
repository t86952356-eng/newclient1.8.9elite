/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.g;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.w;

public class ai
extends a {
    private static final IBlockState dOW = Blocks.cLt.xM().a(BlockOldLog.aXm, BlockPlanks$EnumType.aXK);
    private static final IBlockState dOX = Blocks.cLv.xM().a(BlockOldLeaf.aXl, BlockPlanks$EnumType.aXK).a(BlockLeaves.aWz, false);

    public ai() {
        super(false);
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        int n2 = random.nextInt(5) + 7;
        int n3 = n2 - random.nextInt(2) - 3;
        int n4 = n2 - n3;
        int n5 = 1 + random.nextInt(n4 + 1);
        boolean bl2 = true;
        if (b2.wu() >= 1 && b2.wu() + n2 + 1 <= 256) {
            int n6;
            int n7;
            int n8;
            for (int i2 = b2.wu(); i2 <= b2.wu() + 1 + n2 && bl2; ++i2) {
                n8 = 1;
                n8 = i2 - b2.wu() < n3 ? 0 : n5;
                g g2 = new g();
                for (n7 = b2.wt() - n8; n7 <= b2.wt() + n8 && bl2; ++n7) {
                    for (n6 = b2.wx() - n8; n6 <= b2.wx() + n8 && bl2; ++n6) {
                        if (i2 >= 0 && i2 < 256) {
                            if (this.L(w2.L(g2.E(n7, i2, n6)).df())) continue;
                            bl2 = false;
                            continue;
                        }
                        bl2 = false;
                    }
                }
            }
            if (!bl2) {
                return false;
            }
            Block block = w2.L(b2.aqY()).df();
            if ((block == Blocks.cLe || block == Blocks.cLf) && b2.wu() < 256 - n2 - 1) {
                int n9;
                this.af(w2, b2.aqY());
                n8 = 0;
                for (n9 = b2.wu() + n2; n9 >= b2.wu() + n3; --n9) {
                    for (n7 = b2.wt() - n8; n7 <= b2.wt() + n8; ++n7) {
                        n6 = n7 - b2.wt();
                        for (int i3 = b2.wx() - n8; i3 <= b2.wx() + n8; ++i3) {
                            b b3;
                            int n10 = i3 - b2.wx();
                            if (Math.abs(n6) == n8 && Math.abs(n10) == n8 && n8 > 0 || w2.L(b3 = new b(n7, n9, i3)).df().isFullBlock()) continue;
                            this.N(w2, b3, dOX);
                        }
                    }
                    if (n8 >= 1 && n9 == b2.wu() + n3 + 1) {
                        --n8;
                        continue;
                    }
                    if (n8 >= n5) continue;
                    ++n8;
                }
                for (n9 = 0; n9 < n2 - 1; ++n9) {
                    Block block2 = w2.L(b2.hq(n9)).df();
                    if (block2.xb() != Material.beo && block2.xb() != Material.bex) continue;
                    this.N(w2, b2.hq(n9), dOW);
                }
                return true;
            }
            return false;
        }
        return false;
    }
}

