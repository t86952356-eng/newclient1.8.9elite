/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
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

public class o
extends a {
    private static final IBlockState dOt = Blocks.cLt.xM().a(BlockOldLog.aXm, BlockPlanks$EnumType.aXL);
    private static final IBlockState dOu = Blocks.cLv.xM().a(BlockOldLeaf.aXl, BlockPlanks$EnumType.aXL).a(BlockOldLeaf.aWz, false);
    private final boolean dOv;

    public o(boolean bl2, boolean bl3) {
        super(bl2);
        this.dOv = bl3;
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        int n2 = random.nextInt(3) + 5;
        if (this.dOv) {
            n2 += random.nextInt(7);
        }
        boolean bl2 = true;
        if (b2.wu() >= 1 && b2.wu() + n2 + 1 <= 256) {
            int n3;
            int n4;
            int n5;
            for (int i2 = b2.wu(); i2 <= b2.wu() + 1 + n2; ++i2) {
                n5 = 1;
                if (i2 == b2.wu()) {
                    n5 = 0;
                }
                if (i2 >= b2.wu() + 1 + n2 - 2) {
                    n5 = 2;
                }
                g g2 = new g();
                for (n4 = b2.wt() - n5; n4 <= b2.wt() + n5 && bl2; ++n4) {
                    for (n3 = b2.wx() - n5; n3 <= b2.wx() + n5 && bl2; ++n3) {
                        if (i2 >= 0 && i2 < 256) {
                            if (this.L(w2.L(g2.E(n4, i2, n3)).df())) continue;
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
            if ((block == Blocks.cLe || block == Blocks.cLf || block == Blocks.cMm) && b2.wu() < 256 - n2 - 1) {
                this.af(w2, b2.aqY());
                for (n5 = b2.wu() - 3 + n2; n5 <= b2.wu() + n2; ++n5) {
                    int n6 = n5 - (b2.wu() + n2);
                    n4 = 1 - n6 / 2;
                    for (n3 = b2.wt() - n4; n3 <= b2.wt() + n4; ++n3) {
                        int n7 = n3 - b2.wt();
                        for (int i3 = b2.wx() - n4; i3 <= b2.wx() + n4; ++i3) {
                            b b3;
                            Block block2;
                            int n8 = i3 - b2.wx();
                            if (Math.abs(n7) == n4 && Math.abs(n8) == n4 && (random.nextInt(2) == 0 || n6 == 0) || (block2 = w2.L(b3 = new b(n3, n5, i3)).df()).xb() != Material.beo && block2.xb() != Material.bex) continue;
                            this.N(w2, b3, dOu);
                        }
                    }
                }
                for (n5 = 0; n5 < n2; ++n5) {
                    Block block3 = w2.L(b2.hq(n5)).df();
                    if (block3.xb() != Material.beo && block3.xb() != Material.bex) continue;
                    this.N(w2, b2.hq(n5), dOt);
                }
                return true;
            }
            return false;
        }
        return false;
    }
}

