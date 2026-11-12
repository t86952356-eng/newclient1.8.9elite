/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.g;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.w;

public class ah
extends a {
    private static final IBlockState dOU = Blocks.cLt.xM().a(BlockOldLog.aXm, BlockPlanks$EnumType.aXJ);
    private static final IBlockState dOV = Blocks.cLv.xM().a(BlockOldLeaf.aXl, BlockPlanks$EnumType.aXJ).a(BlockOldLeaf.aWz, false);

    public ah() {
        super(false);
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        int n2 = random.nextInt(4) + 5;
        while (w2.L(b2.aqY()).df().xb() == Material.bev) {
            b2 = b2.aqY();
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
                    n5 = 3;
                }
                g g2 = new g();
                for (n4 = b2.wt() - n5; n4 <= b2.wt() + n5 && bl2; ++n4) {
                    for (n3 = b2.wx() - n5; n3 <= b2.wx() + n5 && bl2; ++n3) {
                        if (i2 >= 0 && i2 < 256) {
                            Block block = w2.L(g2.E(n4, i2, n3)).df();
                            if (block.xb() == Material.beo || block.xb() == Material.bex) continue;
                            if (block != Blocks.cLl && block != Blocks.cLk) {
                                bl2 = false;
                                continue;
                            }
                            if (i2 <= b2.wu()) continue;
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
                b b3;
                int n6;
                this.af(w2, b2.aqY());
                for (n5 = b2.wu() - 3 + n2; n5 <= b2.wu() + n2; ++n5) {
                    int n7 = n5 - (b2.wu() + n2);
                    n4 = 2 - n7 / 2;
                    for (n3 = b2.wt() - n4; n3 <= b2.wt() + n4; ++n3) {
                        int n8 = n3 - b2.wt();
                        for (n6 = b2.wx() - n4; n6 <= b2.wx() + n4; ++n6) {
                            int n9 = n6 - b2.wx();
                            if (Math.abs(n8) == n4 && Math.abs(n9) == n4 && (random.nextInt(2) == 0 || n7 == 0) || w2.L(b3 = new b(n3, n5, n6)).df().isFullBlock()) continue;
                            this.N(w2, b3, dOV);
                        }
                    }
                }
                for (n5 = 0; n5 < n2; ++n5) {
                    Block block2 = w2.L(b2.hq(n5)).df();
                    if (block2.xb() != Material.beo && block2.xb() != Material.bex && block2 != Blocks.cLk && block2 != Blocks.cLl) continue;
                    this.N(w2, b2.hq(n5), dOU);
                }
                for (n5 = b2.wu() - 3 + n2; n5 <= b2.wu() + n2; ++n5) {
                    int n10 = n5 - (b2.wu() + n2);
                    n4 = 2 - n10 / 2;
                    g g3 = new g();
                    for (int i3 = b2.wt() - n4; i3 <= b2.wt() + n4; ++i3) {
                        for (n6 = b2.wx() - n4; n6 <= b2.wx() + n4; ++n6) {
                            g3.E(i3, n5, n6);
                            if (w2.L(g3).df().xb() != Material.bex) continue;
                            b b4 = g3.arb();
                            b3 = g3.arc();
                            b b5 = g3.aqZ();
                            b b6 = g3.ara();
                            if (random.nextInt(4) == 0 && w2.L(b4).df().xb() == Material.beo) {
                                this.a(w2, b4, BlockVine.bde);
                            }
                            if (random.nextInt(4) == 0 && w2.L(b3).df().xb() == Material.beo) {
                                this.a(w2, b3, BlockVine.bdg);
                            }
                            if (random.nextInt(4) == 0 && w2.L(b5).df().xb() == Material.beo) {
                                this.a(w2, b5, BlockVine.bdf);
                            }
                            if (random.nextInt(4) != 0 || w2.L(b6).df().xb() != Material.beo) continue;
                            this.a(w2, b6, BlockVine.bdd);
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private void a(w w2, b b2, PropertyBool propertyBool) {
        IBlockState iBlockState = Blocks.cNp.xM().a(propertyBool, true);
        this.N(w2, b2, iBlockState);
        b2 = b2.aqY();
        for (int i2 = 4; w2.L(b2).df().xb() == Material.beo && i2 > 0; --i2) {
            this.N(w2, b2, iBlockState);
            b2 = b2.aqY();
        }
    }
}

