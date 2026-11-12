/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.as;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.g;
import net.minecraft.world.biome.c;
import net.minecraft.world.l;
import net.minecraft.world.w;

public abstract class BlockLeaves
extends BlockLeavesBase {
    public static final PropertyBool aWy = PropertyBool.cs("decayable");
    public static final PropertyBool aWz = PropertyBool.cs("check_decay");
    int[] aWA;
    protected int aWB;
    protected boolean aWC;

    public BlockLeaves() {
        super(Material.bex, false);
        this.O(true);
        this.a(a.cpy);
        this.L(0.2f);
        this.aN(1);
        this.a(aSb);
    }

    @Override
    public int xv() {
        return net.minecraft.world.c.z(0.5, 1.0);
    }

    @Override
    public int e(IBlockState iBlockState) {
        return net.minecraft.world.c.auW();
    }

    @Override
    public int a(l l2, b b2, int n2) {
        return c.x(l2, b2);
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        int n2;
        int n3;
        boolean bl2 = true;
        int n4 = 2;
        int n5 = b2.wt();
        if (w2.e(new b(n5 - 2, (n3 = b2.wu()) - 2, (n2 = b2.wx()) - 2), new b(n5 + 2, n3 + 2, n2 + 2))) {
            for (int i2 = -1; i2 <= 1; ++i2) {
                for (int i3 = -1; i3 <= 1; ++i3) {
                    for (int i4 = -1; i4 <= 1; ++i4) {
                        b b3 = b2.C(i2, i3, i4);
                        IBlockState iBlockState2 = w2.L(b3);
                        if (iBlockState2.df().xb() != Material.bex || iBlockState2.b(aWz).booleanValue()) continue;
                        w2.a(b3, iBlockState2.a(aWz, true), 4);
                    }
                }
            }
        }
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (!w2.dDw && iBlockState.b(aWz).booleanValue() && iBlockState.b(aWy).booleanValue()) {
            int n2;
            int n3 = 4;
            int n4 = 5;
            int n5 = b2.wt();
            int n6 = b2.wu();
            int n7 = b2.wx();
            int n8 = 32;
            int n9 = 1024;
            int n10 = 16;
            if (this.aWA == null) {
                this.aWA = new int[32768];
            }
            if (w2.e(new b(n5 - 5, n6 - 5, n7 - 5), new b(n5 + 5, n6 + 5, n7 + 5))) {
                int n11;
                int n12;
                int n13;
                g g2 = new g();
                for (n13 = -4; n13 <= 4; ++n13) {
                    for (n12 = -4; n12 <= 4; ++n12) {
                        for (n11 = -4; n11 <= 4; ++n11) {
                            Block block = w2.L(g2.E(n5 + n13, n6 + n12, n7 + n11)).df();
                            if (block != Blocks.cLt && block != Blocks.cLu) {
                                if (block.xb() == Material.bex) {
                                    this.aWA[(n13 + 16) * 1024 + (n12 + 16) * 32 + n11 + 16] = -2;
                                    continue;
                                }
                                this.aWA[(n13 + 16) * 1024 + (n12 + 16) * 32 + n11 + 16] = -1;
                                continue;
                            }
                            this.aWA[(n13 + 16) * 1024 + (n12 + 16) * 32 + n11 + 16] = 0;
                        }
                    }
                }
                for (n13 = 1; n13 <= 4; ++n13) {
                    for (n12 = -4; n12 <= 4; ++n12) {
                        for (n11 = -4; n11 <= 4; ++n11) {
                            for (int i2 = -4; i2 <= 4; ++i2) {
                                if (this.aWA[(n12 + 16) * 1024 + (n11 + 16) * 32 + i2 + 16] != n13 - 1) continue;
                                if (this.aWA[(n12 + 16 - 1) * 1024 + (n11 + 16) * 32 + i2 + 16] == -2) {
                                    this.aWA[(n12 + 16 - 1) * 1024 + (n11 + 16) * 32 + i2 + 16] = n13;
                                }
                                if (this.aWA[(n12 + 16 + 1) * 1024 + (n11 + 16) * 32 + i2 + 16] == -2) {
                                    this.aWA[(n12 + 16 + 1) * 1024 + (n11 + 16) * 32 + i2 + 16] = n13;
                                }
                                if (this.aWA[(n12 + 16) * 1024 + (n11 + 16 - 1) * 32 + i2 + 16] == -2) {
                                    this.aWA[(n12 + 16) * 1024 + (n11 + 16 - 1) * 32 + i2 + 16] = n13;
                                }
                                if (this.aWA[(n12 + 16) * 1024 + (n11 + 16 + 1) * 32 + i2 + 16] == -2) {
                                    this.aWA[(n12 + 16) * 1024 + (n11 + 16 + 1) * 32 + i2 + 16] = n13;
                                }
                                if (this.aWA[(n12 + 16) * 1024 + (n11 + 16) * 32 + (i2 + 16 - 1)] == -2) {
                                    this.aWA[(n12 + 16) * 1024 + (n11 + 16) * 32 + (i2 + 16 - 1)] = n13;
                                }
                                if (this.aWA[(n12 + 16) * 1024 + (n11 + 16) * 32 + i2 + 16 + 1] != -2) continue;
                                this.aWA[(n12 + 16) * 1024 + (n11 + 16) * 32 + i2 + 16 + 1] = n13;
                            }
                        }
                    }
                }
            }
            if ((n2 = this.aWA[16912]) >= 0) {
                w2.a(b2, iBlockState.a(aWz, false), 4);
            } else {
                this.J(w2, b2);
            }
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        if (w2.be(b2.aqX()) && !w.v(w2, b2.aqY()) && random.nextInt(15) == 1) {
            double d2 = (float)b2.wt() + random.nextFloat();
            double d3 = (double)b2.wu() - 0.05;
            double d4 = (float)b2.wx() + random.nextFloat();
            w2.a(as.dxo, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    private void J(w w2, b b2) {
        this.a(w2, b2, w2.L(b2), 0);
        w2.aL(b2);
    }

    @Override
    public int a(Random random) {
        return random.nextInt(20) == 0 ? 1 : 0;
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return d.I(Blocks.cLi);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        if (!w2.dDw) {
            int n3 = this.l(iBlockState);
            if (n2 > 0 && (n3 -= 2 << n2) < 10) {
                n3 = 10;
            }
            if (w2.dDk.nextInt(n3) == 0) {
                d d2 = this.a(iBlockState, w2.dDk, n2);
                BlockLeaves.a(w2, b2, new co(d2, 1, this.d(iBlockState)));
            }
            n3 = 200;
            if (n2 > 0 && (n3 -= 10 << n2) < 40) {
                n3 = 40;
            }
            this.e(w2, b2, iBlockState, n3);
        }
    }

    protected void e(w w2, b b2, IBlockState iBlockState, int n2) {
    }

    protected int l(IBlockState iBlockState) {
        return 20;
    }

    @Override
    public boolean xk() {
        return !this.aWD;
    }

    public void P(boolean bl2) {
        this.aWC = bl2;
        this.aWD = bl2;
        this.aWB = bl2 ? 0 : 1;
    }

    @Override
    public av xo() {
        return this.aWC ? av.dxW : av.dxV;
    }

    @Override
    public boolean xe() {
        return false;
    }

    public abstract BlockPlanks$EnumType aZ(int var1);
}

