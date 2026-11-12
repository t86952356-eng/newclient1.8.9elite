/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHugeMushroom;
import net.minecraft.block.BlockHugeMushroom$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.g;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class b
extends ao {
    private Block dNR;

    public b(Block block) {
        super(true);
        this.dNR = block;
    }

    public b() {
        super(false);
    }

    @Override
    public boolean b(w w2, Random random, net.minecraft.util.b b2) {
        if (this.dNR == null) {
            this.dNR = random.nextBoolean() ? Blocks.cNi : Blocks.cNj;
        }
        int n2 = random.nextInt(3) + 4;
        boolean bl2 = true;
        if (b2.wu() >= 1 && b2.wu() + n2 + 1 < 256) {
            int n3;
            int n4;
            int n5;
            int n6;
            for (int i2 = b2.wu(); i2 <= b2.wu() + 1 + n2; ++i2) {
                n6 = 3;
                if (i2 <= b2.wu() + 3) {
                    n6 = 0;
                }
                g g2 = new g();
                for (n5 = b2.wt() - n6; n5 <= b2.wt() + n6 && bl2; ++n5) {
                    for (n4 = b2.wx() - n6; n4 <= b2.wx() + n6 && bl2; ++n4) {
                        if (i2 >= 0 && i2 < 256) {
                            Block block = w2.L(g2.E(n5, i2, n4)).df();
                            if (block.xb() == Material.beo || block.xb() == Material.bex) continue;
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
            if (block != Blocks.cLf && block != Blocks.cLe && block != Blocks.cNy) {
                return false;
            }
            n6 = b2.wu() + n2;
            if (this.dNR == Blocks.cNj) {
                n6 = b2.wu() + n2 - 3;
            }
            for (n3 = n6; n3 <= b2.wu() + n2; ++n3) {
                n5 = 1;
                if (n3 < b2.wu() + n2) {
                    ++n5;
                }
                if (this.dNR == Blocks.cNi) {
                    n5 = 3;
                }
                n4 = b2.wt() - n5;
                int n7 = b2.wt() + n5;
                int n8 = b2.wx() - n5;
                int n9 = b2.wx() + n5;
                for (int i3 = n4; i3 <= n7; ++i3) {
                    for (int i4 = n8; i4 <= n9; ++i4) {
                        net.minecraft.util.b b3;
                        int n10 = 5;
                        if (i3 == n4) {
                            --n10;
                        } else if (i3 == n7) {
                            ++n10;
                        }
                        if (i4 == n8) {
                            n10 -= 3;
                        } else if (i4 == n9) {
                            n10 += 3;
                        }
                        BlockHugeMushroom$EnumType blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.aY(n10);
                        if (this.dNR == Blocks.cNi || n3 < b2.wu() + n2) {
                            if ((i3 == n4 || i3 == n7) && (i4 == n8 || i4 == n9)) continue;
                            if (i3 == b2.wt() - (n5 - 1) && i4 == n8) {
                                blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.aWc;
                            }
                            if (i3 == n4 && i4 == b2.wx() - (n5 - 1)) {
                                blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.aWc;
                            }
                            if (i3 == b2.wt() + (n5 - 1) && i4 == n8) {
                                blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.aWe;
                            }
                            if (i3 == n7 && i4 == b2.wx() - (n5 - 1)) {
                                blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.aWe;
                            }
                            if (i3 == b2.wt() - (n5 - 1) && i4 == n9) {
                                blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.aWi;
                            }
                            if (i3 == n4 && i4 == b2.wx() + (n5 - 1)) {
                                blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.aWi;
                            }
                            if (i3 == b2.wt() + (n5 - 1) && i4 == n9) {
                                blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.aWk;
                            }
                            if (i3 == n7 && i4 == b2.wx() + (n5 - 1)) {
                                blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.aWk;
                            }
                        }
                        if (blockHugeMushroom$EnumType == BlockHugeMushroom$EnumType.aWg && n3 < b2.wu() + n2) {
                            blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.aWm;
                        }
                        if (b2.wu() < b2.wu() + n2 - 1 && blockHugeMushroom$EnumType == BlockHugeMushroom$EnumType.aWm || w2.L(b3 = new net.minecraft.util.b(i3, n3, i4)).df().isFullBlock()) continue;
                        this.N(w2, b3, this.dNR.xM().a(BlockHugeMushroom.aWa, blockHugeMushroom$EnumType));
                    }
                }
            }
            for (n3 = 0; n3 < n2; ++n3) {
                Block block2 = w2.L(b2.hq(n3)).df();
                if (block2.isFullBlock()) continue;
                this.N(w2, b2.hq(n3), this.dNR.xM().a(BlockHugeMushroom.aWa, BlockHugeMushroom$EnumType.aWl));
            }
            return true;
        }
        return false;
    }
}

