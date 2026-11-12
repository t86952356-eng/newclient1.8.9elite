/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.b;
import net.minecraft.util.g;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.w;

public class ae
extends a {
    private static final IBlockState dOP = Blocks.cLu.xM().a(BlockNewLog.aXh, BlockPlanks$EnumType.aXN);
    private static final IBlockState dOQ = Blocks.cLw.xM().a(BlockNewLeaf.aXg, BlockPlanks$EnumType.aXN).a(BlockLeaves.aWz, false);

    public ae(boolean bl2) {
        super(bl2);
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        int n2 = random.nextInt(3) + random.nextInt(3) + 5;
        boolean bl2 = true;
        if (b2.wu() >= 1 && b2.wu() + n2 + 1 <= 256) {
            int n3;
            int n4;
            for (int i2 = b2.wu(); i2 <= b2.wu() + 1 + n2; ++i2) {
                int n5 = 1;
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
            if ((block == Blocks.cLe || block == Blocks.cLf) && b2.wu() < 256 - n2 - 1) {
                int n6;
                this.af(w2, b2.aqY());
                ao ao2 = ar.dwT.g(random);
                int n7 = n2 - random.nextInt(4) - 1;
                n4 = 3 - random.nextInt(3);
                n3 = b2.wt();
                int n8 = b2.wx();
                int n9 = 0;
                for (int i3 = 0; i3 < n2; ++i3) {
                    b b3;
                    Material material;
                    n6 = b2.wu() + i3;
                    if (i3 >= n7 && n4 > 0) {
                        n3 += ao2.asH();
                        n8 += ao2.asJ();
                        --n4;
                    }
                    if ((material = w2.L(b3 = new b(n3, n6, n8)).df().xb()) != Material.beo && material != Material.bex) continue;
                    this.aj(w2, b3);
                    n9 = n6;
                }
                b b4 = new b(n3, n9, n8);
                for (n6 = -3; n6 <= 3; ++n6) {
                    for (int i4 = -3; i4 <= 3; ++i4) {
                        if (Math.abs(n6) == 3 && Math.abs(i4) == 3) continue;
                        this.ak(w2, b4.C(n6, 0, i4));
                    }
                }
                b4 = b4.aqX();
                for (n6 = -1; n6 <= 1; ++n6) {
                    for (int i5 = -1; i5 <= 1; ++i5) {
                        this.ak(w2, b4.C(n6, 0, i5));
                    }
                }
                this.ak(w2, b4.hv(2));
                this.ak(w2, b4.hu(2));
                this.ak(w2, b4.ht(2));
                this.ak(w2, b4.hs(2));
                n3 = b2.wt();
                n8 = b2.wx();
                ao ao3 = ar.dwT.g(random);
                if (ao3 != ao2) {
                    int n10;
                    int n11 = n7 - random.nextInt(2) - 1;
                    int n12 = 1 + random.nextInt(3);
                    n9 = 0;
                    for (int i6 = n11; i6 < n2 && n12 > 0; ++i6, --n12) {
                        if (i6 < 1) continue;
                        n10 = b2.wu() + i6;
                        b b5 = new b(n3 += ao3.asH(), n10, n8 += ao3.asJ());
                        Material material = w2.L(b5).df().xb();
                        if (material != Material.beo && material != Material.bex) continue;
                        this.aj(w2, b5);
                        n9 = n10;
                    }
                    if (n9 > 0) {
                        b b6 = new b(n3, n9, n8);
                        for (n10 = -2; n10 <= 2; ++n10) {
                            for (int i7 = -2; i7 <= 2; ++i7) {
                                if (Math.abs(n10) == 2 && Math.abs(i7) == 2) continue;
                                this.ak(w2, b6.C(n10, 0, i7));
                            }
                        }
                        b6 = b6.aqX();
                        for (n10 = -1; n10 <= 1; ++n10) {
                            for (int i8 = -1; i8 <= 1; ++i8) {
                                this.ak(w2, b6.C(n10, 0, i8));
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private void aj(w w2, b b2) {
        this.N(w2, b2, dOP);
    }

    private void ak(w w2, b b2) {
        Material material = w2.L(b2).df().xb();
        if (material == Material.beo || material == Material.bex) {
            this.N(w2, b2, dOQ);
        }
    }
}

