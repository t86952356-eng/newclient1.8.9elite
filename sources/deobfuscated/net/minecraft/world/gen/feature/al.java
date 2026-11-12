/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCocoa;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.b;
import net.minecraft.util.g;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.w;

public class al
extends a {
    private static final IBlockState dPb = Blocks.cLt.xM().a(BlockOldLog.aXm, BlockPlanks$EnumType.aXJ);
    private static final IBlockState dPc = Blocks.cLv.xM().a(BlockOldLeaf.aXl, BlockPlanks$EnumType.aXJ).a(BlockLeaves.aWz, false);
    private final int dPd;
    private final boolean dPe;
    private final IBlockState dPf;
    private final IBlockState dPg;

    public al(boolean bl2) {
        this(bl2, 4, dPb, dPc, false);
    }

    public al(boolean bl2, int n2, IBlockState iBlockState, IBlockState iBlockState2, boolean bl3) {
        super(bl2);
        this.dPd = n2;
        this.dPf = iBlockState;
        this.dPg = iBlockState2;
        this.dPe = bl3;
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        int n2 = random.nextInt(3) + this.dPd;
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
                b b3;
                Object object;
                int n6;
                int n7;
                int n8;
                this.af(w2, b2.aqY());
                n5 = 3;
                boolean bl3 = false;
                for (n4 = b2.wu() - 3 + n2; n4 <= b2.wu() + n2; ++n4) {
                    n3 = n4 - (b2.wu() + n2);
                    n8 = 1 - n3 / 2;
                    for (int i3 = b2.wt() - n8; i3 <= b2.wt() + n8; ++i3) {
                        n7 = i3 - b2.wt();
                        for (n6 = b2.wx() - n8; n6 <= b2.wx() + n8; ++n6) {
                            int n9 = n6 - b2.wx();
                            if (Math.abs(n7) == n8 && Math.abs(n9) == n8 && (random.nextInt(2) == 0 || n3 == 0) || ((Block)(object = w2.L(b3 = new b(i3, n4, n6)).df())).xb() != Material.beo && ((Block)object).xb() != Material.bex && ((Block)object).xb() != Material.bez) continue;
                            this.N(w2, b3, this.dPg);
                        }
                    }
                }
                for (n4 = 0; n4 < n2; ++n4) {
                    Block block2 = w2.L(b2.hq(n4)).df();
                    if (block2.xb() != Material.beo && block2.xb() != Material.bex && block2.xb() != Material.bez) continue;
                    this.N(w2, b2.hq(n4), this.dPf);
                    if (!this.dPe || n4 <= 0) continue;
                    if (random.nextInt(3) > 0 && w2.aG(b2.C(-1, n4, 0))) {
                        this.b(w2, b2.C(-1, n4, 0), BlockVine.bde);
                    }
                    if (random.nextInt(3) > 0 && w2.aG(b2.C(1, n4, 0))) {
                        this.b(w2, b2.C(1, n4, 0), BlockVine.bdg);
                    }
                    if (random.nextInt(3) > 0 && w2.aG(b2.C(0, n4, -1))) {
                        this.b(w2, b2.C(0, n4, -1), BlockVine.bdf);
                    }
                    if (random.nextInt(3) <= 0 || !w2.aG(b2.C(0, n4, 1))) continue;
                    this.b(w2, b2.C(0, n4, 1), BlockVine.bdd);
                }
                if (this.dPe) {
                    for (n4 = b2.wu() - 3 + n2; n4 <= b2.wu() + n2; ++n4) {
                        int n10 = n4 - (b2.wu() + n2);
                        n8 = 2 - n10 / 2;
                        g g3 = new g();
                        for (n7 = b2.wt() - n8; n7 <= b2.wt() + n8; ++n7) {
                            for (n6 = b2.wx() - n8; n6 <= b2.wx() + n8; ++n6) {
                                g3.E(n7, n4, n6);
                                if (w2.L(g3).df().xb() != Material.bex) continue;
                                b b4 = g3.arb();
                                b3 = g3.arc();
                                object = g3.aqZ();
                                b b5 = g3.ara();
                                if (random.nextInt(4) == 0 && w2.L(b4).df().xb() == Material.beo) {
                                    this.c(w2, b4, BlockVine.bde);
                                }
                                if (random.nextInt(4) == 0 && w2.L(b3).df().xb() == Material.beo) {
                                    this.c(w2, b3, BlockVine.bdg);
                                }
                                if (random.nextInt(4) == 0 && w2.L((b)object).df().xb() == Material.beo) {
                                    this.c(w2, (b)object, BlockVine.bdf);
                                }
                                if (random.nextInt(4) != 0 || w2.L(b5).df().xb() != Material.beo) continue;
                                this.c(w2, b5, BlockVine.bdd);
                            }
                        }
                    }
                    if (random.nextInt(5) == 0 && n2 > 5) {
                        for (n4 = 0; n4 < 2; ++n4) {
                            for (ao ao2 : ar.dwT) {
                                if (random.nextInt(4 - n4) != 0) continue;
                                ao ao3 = ao2.asC();
                                this.a(w2, random.nextInt(3), b2.C(ao3.asH(), n2 - 5 + n4, ao3.asJ()), ao2);
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

    private void a(w w2, int n2, b b2, ao ao2) {
        this.N(w2, b2, Blocks.cNP.xM().a(BlockCocoa.aTu, n2).a(BlockCocoa.aTB, ao2));
    }

    private void b(w w2, b b2, PropertyBool propertyBool) {
        this.N(w2, b2, Blocks.cNp.xM().a(propertyBool, true));
    }

    private void c(w w2, b b2, PropertyBool propertyBool) {
        this.b(w2, b2, propertyBool);
        b2 = b2.aqY();
        for (int i2 = 4; w2.L(b2).df().xb() == Material.beo && i2 > 0; --i2) {
            this.b(w2, b2, propertyBool);
            b2 = b2.aqY();
        }
    }
}

