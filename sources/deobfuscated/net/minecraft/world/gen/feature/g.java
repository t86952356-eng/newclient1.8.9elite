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
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.w;

public class g
extends a {
    private static final IBlockState dOf = Blocks.cLu.xM().a(BlockNewLog.aXh, BlockPlanks$EnumType.aXO);
    private static final IBlockState dOg = Blocks.cLw.xM().a(BlockNewLeaf.aXg, BlockPlanks$EnumType.aXO).a(BlockLeaves.aWz, false);

    public g(boolean bl2) {
        super(bl2);
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        int n2 = random.nextInt(3) + random.nextInt(2) + 6;
        int n3 = b2.wt();
        int n4 = b2.wu();
        int n5 = b2.wx();
        if (n4 >= 1 && n4 + n2 + 1 < 256) {
            int n6;
            int n7;
            b b3 = b2.aqY();
            Block block = w2.L(b3).df();
            if (block != Blocks.cLe && block != Blocks.cLf) {
                return false;
            }
            if (!this.f(w2, b2, n2)) {
                return false;
            }
            this.af(w2, b3);
            this.af(w2, b3.arc());
            this.af(w2, b3.ara());
            this.af(w2, b3.ara().arc());
            ao ao2 = ar.dwT.g(random);
            int n8 = n2 - random.nextInt(4);
            int n9 = 2 - random.nextInt(3);
            int n10 = n3;
            int n11 = n5;
            int n12 = n4 + n2 - 1;
            for (n7 = 0; n7 < n2; ++n7) {
                b b4;
                Material material;
                if (n7 >= n8 && n9 > 0) {
                    n10 += ao2.asH();
                    n11 += ao2.asJ();
                    --n9;
                }
                if ((material = w2.L(b4 = new b(n10, n6 = n4 + n7, n11)).df().xb()) != Material.beo && material != Material.bex) continue;
                this.ag(w2, b4);
                this.ag(w2, b4.arc());
                this.ag(w2, b4.ara());
                this.ag(w2, b4.arc().ara());
            }
            for (n7 = -2; n7 <= 0; ++n7) {
                for (n6 = -2; n6 <= 0; ++n6) {
                    int n13 = -1;
                    this.a(w2, n10 + n7, n12 + n13, n11 + n6);
                    this.a(w2, 1 + n10 - n7, n12 + n13, n11 + n6);
                    this.a(w2, n10 + n7, n12 + n13, 1 + n11 - n6);
                    this.a(w2, 1 + n10 - n7, n12 + n13, 1 + n11 - n6);
                    if (n7 <= -2 && n6 <= -1 || n7 == -1 && n6 == -2) continue;
                    n13 = 1;
                    this.a(w2, n10 + n7, n12 + n13, n11 + n6);
                    this.a(w2, 1 + n10 - n7, n12 + n13, n11 + n6);
                    this.a(w2, n10 + n7, n12 + n13, 1 + n11 - n6);
                    this.a(w2, 1 + n10 - n7, n12 + n13, 1 + n11 - n6);
                }
            }
            if (random.nextBoolean()) {
                this.a(w2, n10, n12 + 2, n11);
                this.a(w2, n10 + 1, n12 + 2, n11);
                this.a(w2, n10 + 1, n12 + 2, n11 + 1);
                this.a(w2, n10, n12 + 2, n11 + 1);
            }
            for (n7 = -3; n7 <= 4; ++n7) {
                for (n6 = -3; n6 <= 4; ++n6) {
                    if (n7 == -3 && n6 == -3 || n7 == -3 && n6 == 4 || n7 == 4 && n6 == -3 || n7 == 4 && n6 == 4 || Math.abs(n7) >= 3 && Math.abs(n6) >= 3) continue;
                    this.a(w2, n10 + n7, n12, n11 + n6);
                }
            }
            for (n7 = -1; n7 <= 2; ++n7) {
                for (n6 = -1; n6 <= 2; ++n6) {
                    int n14;
                    int n15;
                    if (n7 >= 0 && n7 <= 1 && n6 >= 0 && n6 <= 1 || random.nextInt(3) > 0) continue;
                    int n16 = random.nextInt(3) + 2;
                    for (n15 = 0; n15 < n16; ++n15) {
                        this.ag(w2, new b(n3 + n7, n12 - n15 - 1, n5 + n6));
                    }
                    for (n15 = -1; n15 <= 1; ++n15) {
                        for (n14 = -1; n14 <= 1; ++n14) {
                            this.a(w2, n10 + n7 + n15, n12, n11 + n6 + n14);
                        }
                    }
                    for (n15 = -2; n15 <= 2; ++n15) {
                        for (n14 = -2; n14 <= 2; ++n14) {
                            if (Math.abs(n15) == 2 && Math.abs(n14) == 2) continue;
                            this.a(w2, n10 + n7 + n15, n12 - 1, n11 + n6 + n14);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    private boolean f(w w2, b b2, int n2) {
        int n3 = b2.wt();
        int n4 = b2.wu();
        int n5 = b2.wx();
        net.minecraft.util.g g2 = new net.minecraft.util.g();
        for (int i2 = 0; i2 <= n2 + 1; ++i2) {
            int n6 = 1;
            if (i2 == 0) {
                n6 = 0;
            }
            if (i2 >= n2 - 1) {
                n6 = 2;
            }
            for (int i3 = -n6; i3 <= n6; ++i3) {
                for (int i4 = -n6; i4 <= n6; ++i4) {
                    if (this.L(w2.L(g2.E(n3 + i3, n4 + i2, n5 + i4)).df())) continue;
                    return false;
                }
            }
        }
        return true;
    }

    private void ag(w w2, b b2) {
        if (this.L(w2.L(b2).df())) {
            this.N(w2, b2, dOf);
        }
    }

    private void a(w w2, int n2, int n3, int n4) {
        b b2 = new b(n2, n3, n4);
        Block block = w2.L(b2).df();
        if (block.xb() == Material.beo) {
            this.N(w2, b2, dOg);
        }
    }
}

