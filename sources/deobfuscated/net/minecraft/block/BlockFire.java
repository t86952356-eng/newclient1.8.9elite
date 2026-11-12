/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.block;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.ad;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockFire
extends Block {
    public static final PropertyInteger aUL = PropertyInteger.e("age", 0, 15);
    public static final PropertyBool aUM = PropertyBool.cs("flip");
    public static final PropertyBool aUN = PropertyBool.cs("alt");
    public static final PropertyBool aUO = PropertyBool.cs("north");
    public static final PropertyBool aUP = PropertyBool.cs("east");
    public static final PropertyBool aUQ = PropertyBool.cs("south");
    public static final PropertyBool aUR = PropertyBool.cs("west");
    public static final PropertyInteger aUS = PropertyInteger.e("upper", 0, 2);
    private final Map<Block, Integer> aUT = Maps.newIdentityHashMap();
    private final Map<Block, Integer> aUU = Maps.newIdentityHashMap();

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        int n2 = b2.wt();
        int n3 = b2.wu();
        int n4 = b2.wx();
        if (!w.v(l2, b2.aqY()) && !Blocks.cMd.j(l2, b2.aqY())) {
            boolean bl2 = (n2 + n3 + n4 & 1) == 1;
            boolean bl3 = (n2 / 2 + n3 / 2 + n4 / 2 & 1) == 1;
            int n5 = 0;
            if (this.j(l2, b2.aqX())) {
                n5 = bl2 ? 1 : 2;
            }
            return iBlockState.a(aUO, this.j(l2, b2.aqZ())).a(aUP, this.j(l2, b2.arc())).a(aUQ, this.j(l2, b2.ara())).a(aUR, this.j(l2, b2.arb())).a(aUS, n5).a(aUM, bl3).a(aUN, bl2);
        }
        return this.xM();
    }

    protected BlockFire() {
        super(Material.beC);
        this.h(this.aSG.zS().a(aUL, 0).a(aUM, false).a(aUN, false).a(aUO, false).a(aUP, false).a(aUQ, false).a(aUR, false).a(aUS, 0));
        this.O(true);
    }

    public static void init() {
        Blocks.cMd.a(Blocks.cLh, 5, 20);
        Blocks.cMd.a(Blocks.cNN, 5, 20);
        Blocks.cMd.a(Blocks.cNO, 5, 20);
        Blocks.cMd.a(Blocks.cNq, 5, 20);
        Blocks.cMd.a(Blocks.cNr, 5, 20);
        Blocks.cMd.a(Blocks.cNs, 5, 20);
        Blocks.cMd.a(Blocks.cNt, 5, 20);
        Blocks.cMd.a(Blocks.cNu, 5, 20);
        Blocks.cMd.a(Blocks.cNv, 5, 20);
        Blocks.cMd.a(Blocks.cMQ, 5, 20);
        Blocks.cMd.a(Blocks.cMR, 5, 20);
        Blocks.cMd.a(Blocks.cMS, 5, 20);
        Blocks.cMd.a(Blocks.cMT, 5, 20);
        Blocks.cMd.a(Blocks.cMU, 5, 20);
        Blocks.cMd.a(Blocks.cMV, 5, 20);
        Blocks.cMd.a(Blocks.cMf, 5, 20);
        Blocks.cMd.a(Blocks.cNX, 5, 20);
        Blocks.cMd.a(Blocks.cNW, 5, 20);
        Blocks.cMd.a(Blocks.cNY, 5, 20);
        Blocks.cMd.a(Blocks.cLt, 5, 5);
        Blocks.cMd.a(Blocks.cLu, 5, 5);
        Blocks.cMd.a(Blocks.cLv, 30, 60);
        Blocks.cMd.a(Blocks.cLw, 30, 60);
        Blocks.cMd.a(Blocks.cLZ, 30, 20);
        Blocks.cMd.a(Blocks.cLY, 15, 100);
        Blocks.cMd.a(Blocks.cLJ, 60, 100);
        Blocks.cMd.a(Blocks.cOH, 60, 100);
        Blocks.cMd.a(Blocks.cLP, 60, 100);
        Blocks.cMd.a(Blocks.cLQ, 60, 100);
        Blocks.cMd.a(Blocks.cLK, 60, 100);
        Blocks.cMd.a(Blocks.cLN, 30, 60);
        Blocks.cMd.a(Blocks.cNp, 15, 100);
        Blocks.cMd.a(Blocks.cOC, 5, 5);
        Blocks.cMd.a(Blocks.cOz, 60, 20);
        Blocks.cMd.a(Blocks.cOA, 60, 20);
    }

    public void a(Block block, int n2, int n3) {
        this.aUT.put(block, n2);
        this.aUU.put(block, n3);
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        return null;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public int c(w w2) {
        return 30;
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (w2.Si().gw("doFireTick")) {
            Block block;
            boolean bl2;
            if (!this.d(w2, b2)) {
                w2.aL(b2);
            }
            boolean bl3 = bl2 = (block = w2.L(b2.aqY()).df()) == Blocks.cMX;
            if (w2.dDl instanceof ad && block == Blocks.cLj) {
                bl2 = true;
            }
            if (!bl2 && w2.avK() && this.F(w2, b2)) {
                w2.aL(b2);
            } else {
                int n2 = iBlockState.b(aUL);
                if (n2 < 15) {
                    iBlockState = iBlockState.a(aUL, n2 + random.nextInt(3) / 2);
                    w2.a(b2, iBlockState, 4);
                }
                w2.a(b2, (Block)this, this.c(w2) + random.nextInt(10));
                if (!bl2) {
                    if (!this.G(w2, b2)) {
                        if (!w.v(w2, b2.aqY()) || n2 > 3) {
                            w2.aL(b2);
                        }
                        return;
                    }
                    if (!this.j(w2, b2.aqY()) && n2 == 15 && random.nextInt(4) == 0) {
                        w2.aL(b2);
                        return;
                    }
                }
                boolean bl4 = w2.bf(b2);
                int n3 = 0;
                if (bl4) {
                    n3 = -50;
                }
                this.a(w2, b2.arc(), 300 + n3, random, n2);
                this.a(w2, b2.arb(), 300 + n3, random, n2);
                this.a(w2, b2.aqY(), 250 + n3, random, n2);
                this.a(w2, b2.aqX(), 250 + n3, random, n2);
                this.a(w2, b2.aqZ(), 300 + n3, random, n2);
                this.a(w2, b2.ara(), 300 + n3, random, n2);
                for (int i2 = -1; i2 <= 1; ++i2) {
                    for (int i3 = -1; i3 <= 1; ++i3) {
                        for (int i4 = -1; i4 <= 4; ++i4) {
                            b b3;
                            int n4;
                            if (i2 == 0 && i4 == 0 && i3 == 0) continue;
                            int n5 = 100;
                            if (i4 > 1) {
                                n5 += (i4 - 1) * 100;
                            }
                            if ((n4 = this.H(w2, b3 = b2.C(i2, i4, i3))) <= 0) continue;
                            int n6 = (n4 + 40 + w2.agm().auZ() * 7) / (n2 + 30);
                            if (bl4) {
                                n6 /= 2;
                            }
                            if (n6 <= 0 || random.nextInt(n5) > n6 || w2.avK() && this.F(w2, b3)) continue;
                            int n7 = n2 + random.nextInt(5) / 4;
                            if (n7 > 15) {
                                n7 = 15;
                            }
                            w2.a(b3, iBlockState.a(aUL, n7), 3);
                        }
                    }
                }
            }
        }
    }

    protected boolean F(w w2, b b2) {
        return w2.be(b2) || w2.be(b2.arb()) || w2.be(b2.arc()) || w2.be(b2.aqZ()) || w2.be(b2.ara());
    }

    @Override
    public boolean xI() {
        return false;
    }

    private int m(Block block) {
        Integer n2 = this.aUU.get(block);
        return n2 == null ? 0 : n2;
    }

    private int n(Block block) {
        Integer n2 = this.aUT.get(block);
        return n2 == null ? 0 : n2;
    }

    private void a(w w2, b b2, int n2, Random random, int n3) {
        int n4 = this.m(w2.L(b2).df());
        if (random.nextInt(n2) < n4) {
            IBlockState iBlockState = w2.L(b2);
            if (random.nextInt(n3 + 10) < 5 && !w2.be(b2)) {
                int n5 = n3 + random.nextInt(5) / 4;
                if (n5 > 15) {
                    n5 = 15;
                }
                w2.a(b2, this.xM().a(aUL, n5), 3);
            } else {
                w2.aL(b2);
            }
            if (iBlockState.df() == Blocks.cLY) {
                Blocks.cLY.b(w2, b2, iBlockState.a(BlockTNT.bcw, true));
            }
        }
    }

    private boolean G(w w2, b b2) {
        for (ao ao2 : ao.values()) {
            if (!this.j(w2, b2.x(ao2))) continue;
            return true;
        }
        return false;
    }

    private int H(w w2, b b2) {
        if (!w2.aG(b2)) {
            return 0;
        }
        int n2 = 0;
        for (ao ao2 : ao.values()) {
            n2 = Math.max(this.n(w2.L(b2.x(ao2)).df()), n2);
        }
        return n2;
    }

    @Override
    public boolean xl() {
        return false;
    }

    public boolean j(l l2, b b2) {
        return this.n(l2.L(b2).df()) > 0;
    }

    @Override
    public boolean d(w w2, b b2) {
        return w.v(w2, b2.aqY()) || this.G(w2, b2);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!w.v(w2, b2.aqY()) && !this.G(w2, b2)) {
            w2.aL(b2);
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        if (w2.dDl.getDimensionId() > 0 || !Blocks.cNa.L(w2, b2)) {
            if (!w.v(w2, b2.aqY()) && !this.G(w2, b2)) {
                w2.aL(b2);
            } else {
                w2.a(b2, (Block)this, this.c(w2) + w2.dDk.nextInt(10));
            }
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        block12: {
            block11: {
                double d2;
                double d3;
                double d4;
                int n2;
                if (random.nextInt(24) == 0) {
                    w2.a((double)((float)b2.wt() + 0.5f), (double)((float)b2.wu() + 0.5f), (double)((float)b2.wx() + 0.5f), "fire.fire", 1.0f + random.nextFloat(), random.nextFloat() * 0.7f + 0.3f, false);
                }
                if (w.v(w2, b2.aqY()) || Blocks.cMd.j(w2, b2.aqY())) break block11;
                if (Blocks.cMd.j(w2, b2.arb())) {
                    for (n2 = 0; n2 < 2; ++n2) {
                        d4 = (double)b2.wt() + random.nextDouble() * (double)0.1f;
                        d3 = (double)b2.wu() + random.nextDouble();
                        d2 = (double)b2.wx() + random.nextDouble();
                        w2.a(as.dxi, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
                    }
                }
                if (Blocks.cMd.j(w2, b2.arc())) {
                    for (n2 = 0; n2 < 2; ++n2) {
                        d4 = (double)(b2.wt() + 1) - random.nextDouble() * (double)0.1f;
                        d3 = (double)b2.wu() + random.nextDouble();
                        d2 = (double)b2.wx() + random.nextDouble();
                        w2.a(as.dxi, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
                    }
                }
                if (Blocks.cMd.j(w2, b2.aqZ())) {
                    for (n2 = 0; n2 < 2; ++n2) {
                        d4 = (double)b2.wt() + random.nextDouble();
                        d3 = (double)b2.wu() + random.nextDouble();
                        d2 = (double)b2.wx() + random.nextDouble() * (double)0.1f;
                        w2.a(as.dxi, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
                    }
                }
                if (Blocks.cMd.j(w2, b2.ara())) {
                    for (n2 = 0; n2 < 2; ++n2) {
                        d4 = (double)b2.wt() + random.nextDouble();
                        d3 = (double)b2.wu() + random.nextDouble();
                        d2 = (double)(b2.wx() + 1) - random.nextDouble() * (double)0.1f;
                        w2.a(as.dxi, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
                    }
                }
                if (!Blocks.cMd.j(w2, b2.aqX())) break block12;
                for (n2 = 0; n2 < 2; ++n2) {
                    d4 = (double)b2.wt() + random.nextDouble();
                    d3 = (double)(b2.wu() + 1) - random.nextDouble() * (double)0.1f;
                    d2 = (double)b2.wx() + random.nextDouble();
                    w2.a(as.dxi, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
                }
                break block12;
            }
            for (int i2 = 0; i2 < 3; ++i2) {
                double d5 = (double)b2.wt() + random.nextDouble();
                double d6 = (double)b2.wu() + random.nextDouble() * 0.5 + 0.5;
                double d7 = (double)b2.wx() + random.nextDouble();
                w2.a(as.dxi, d5, d6, d7, 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return MapColor.bdG;
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aUL, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aUL);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aUL, aUO, aUP, aUQ, aUR, aUS, aUM, aUN);
    }
}

