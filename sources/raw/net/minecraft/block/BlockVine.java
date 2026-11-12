/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.c;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockVine
extends Block {
    public static final PropertyBool bdc = PropertyBool.cs("up");
    public static final PropertyBool bdd = PropertyBool.cs("north");
    public static final PropertyBool bde = PropertyBool.cs("east");
    public static final PropertyBool bdf = PropertyBool.cs("south");
    public static final PropertyBool bdg = PropertyBool.cs("west");
    public static final PropertyBool[] bdh = new PropertyBool[]{bdc, bdd, bdf, bdg, bde};

    public BlockVine() {
        super(Material.bez);
        this.h(this.aSG.zS().a(bdc, false).a(bdd, false).a(bde, false).a(bdf, false).a(bdg, false));
        this.O(true);
        this.a(net.minecraft.creativetab.a.cpy);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        return iBlockState.a(bdc, l2.L(b2.aqX()).df().xc());
    }

    @Override
    public void xx() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
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
    public boolean a(w w2, b b2) {
        return true;
    }

    @Override
    public void c(l l2, b b2) {
        float f2 = 0.0625f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        float f5 = 1.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        boolean bl2 = false;
        if (l2.L(b2).b(bdg).booleanValue()) {
            f6 = Math.max(f6, 0.0625f);
            f3 = 0.0f;
            f4 = 0.0f;
            f7 = 1.0f;
            f5 = 0.0f;
            f8 = 1.0f;
            bl2 = true;
        }
        if (l2.L(b2).b(bde).booleanValue()) {
            f3 = Math.min(f3, 0.9375f);
            f6 = 1.0f;
            f4 = 0.0f;
            f7 = 1.0f;
            f5 = 0.0f;
            f8 = 1.0f;
            bl2 = true;
        }
        if (l2.L(b2).b(bdd).booleanValue()) {
            f8 = Math.max(f8, 0.0625f);
            f5 = 0.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            f4 = 0.0f;
            f7 = 1.0f;
            bl2 = true;
        }
        if (l2.L(b2).b(bdf).booleanValue()) {
            f5 = Math.min(f5, 0.9375f);
            f8 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            f4 = 0.0f;
            f7 = 1.0f;
            bl2 = true;
        }
        if (!bl2 && this.w(l2.L(b2.aqX()).df())) {
            f4 = Math.min(f4, 0.9375f);
            f7 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            f5 = 0.0f;
            f8 = 1.0f;
        }
        this.a(f3, f4, f5, f6, f7, f8);
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        return null;
    }

    @Override
    public boolean a(w w2, b b2, ao ao2) {
        switch (ao2) {
            case dwr: {
                return this.w(w2.L(b2.aqX()).df());
            }
            case dws: 
            case dwt: 
            case dwv: 
            case dwu: {
                return this.w(w2.L(b2.x(ao2.asC())).df());
            }
        }
        return false;
    }

    private boolean w(Block block) {
        return block.xf() && block.aSD.zy();
    }

    private boolean M(w w2, b b2, IBlockState iBlockState) {
        IBlockState iBlockState2 = iBlockState;
        for (ao ao2 : ar.dwT) {
            IBlockState iBlockState3;
            PropertyBool propertyBool = BlockVine.e(ao2);
            if (!iBlockState.b(propertyBool).booleanValue() || this.w(w2.L(b2.x(ao2)).df()) || (iBlockState3 = w2.L(b2.aqX())).df() == this && iBlockState3.b(propertyBool).booleanValue()) continue;
            iBlockState = iBlockState.a(propertyBool, false);
        }
        if (BlockVine.z(iBlockState) == 0) {
            return false;
        }
        if (iBlockState2 != iBlockState) {
            w2.a(b2, iBlockState, 2);
        }
        return true;
    }

    @Override
    public int xv() {
        return c.auW();
    }

    @Override
    public int e(IBlockState iBlockState) {
        return c.auW();
    }

    @Override
    public int a(l l2, b b2, int n2) {
        return l2.aF(b2).bk(b2);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!w2.dDw && !this.M(w2, b2, iBlockState)) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
        }
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (!w2.dDw && w2.dDk.nextInt(4) == 0) {
            int n2 = 4;
            int n3 = 5;
            boolean bl2 = false;
            block0: for (int i2 = -4; i2 <= 4; ++i2) {
                for (int i3 = -4; i3 <= 4; ++i3) {
                    for (int i4 = -1; i4 <= 1; ++i4) {
                        if (w2.L(b2.C(i2, i4, i3)).df() != this || --n3 > 0) continue;
                        bl2 = true;
                        break block0;
                    }
                }
            }
            ao ao2 = ao.g(random);
            b b3 = b2.aqX();
            if (ao2 == ao.dwr && b2.wu() < 255 && w2.aG(b3)) {
                if (!bl2) {
                    IBlockState iBlockState2 = iBlockState;
                    for (ao ao3 : ar.dwT) {
                        if (!random.nextBoolean() && this.w(w2.L(b3.x(ao3)).df())) continue;
                        iBlockState2 = iBlockState2.a(BlockVine.e(ao3), false);
                    }
                    if (iBlockState2.b(bdd).booleanValue() || iBlockState2.b(bde).booleanValue() || iBlockState2.b(bdf).booleanValue() || iBlockState2.b(bdg).booleanValue()) {
                        w2.a(b3, iBlockState2, 2);
                    }
                }
            } else if (ao2.asL().asP() && !iBlockState.b(BlockVine.e(ao2)).booleanValue()) {
                if (!bl2) {
                    b b4 = b2.x(ao2);
                    Block block = w2.L(b4).df();
                    if (block.aSD == Material.beo) {
                        ao ao4 = ao2.asD();
                        ao ao5 = ao2.asG();
                        boolean bl3 = iBlockState.b(BlockVine.e(ao4));
                        boolean bl4 = iBlockState.b(BlockVine.e(ao5));
                        b b5 = b4.x(ao4);
                        b b6 = b4.x(ao5);
                        if (bl3 && this.w(w2.L(b5).df())) {
                            w2.a(b4, this.xM().a(BlockVine.e(ao4), true), 2);
                        } else if (bl4 && this.w(w2.L(b6).df())) {
                            w2.a(b4, this.xM().a(BlockVine.e(ao5), true), 2);
                        } else if (bl3 && w2.aG(b5) && this.w(w2.L(b2.x(ao4)).df())) {
                            w2.a(b5, this.xM().a(BlockVine.e(ao2.asC()), true), 2);
                        } else if (bl4 && w2.aG(b6) && this.w(w2.L(b2.x(ao5)).df())) {
                            w2.a(b6, this.xM().a(BlockVine.e(ao2.asC()), true), 2);
                        } else if (this.w(w2.L(b4.aqX()).df())) {
                            w2.a(b4, this.xM(), 2);
                        }
                    } else if (block.aSD.isOpaque() && block.xf()) {
                        w2.a(b2, iBlockState.a(BlockVine.e(ao2), true), 2);
                    }
                }
            } else if (b2.wu() > 1) {
                b b7 = b2.aqY();
                IBlockState iBlockState3 = w2.L(b7);
                Block block = iBlockState3.df();
                if (block.aSD == Material.beo) {
                    IBlockState iBlockState4 = iBlockState;
                    for (ao ao6 : ar.dwT) {
                        if (!random.nextBoolean()) continue;
                        iBlockState4 = iBlockState4.a(BlockVine.e(ao6), false);
                    }
                    if (iBlockState4.b(bdd).booleanValue() || iBlockState4.b(bde).booleanValue() || iBlockState4.b(bdf).booleanValue() || iBlockState4.b(bdg).booleanValue()) {
                        w2.a(b7, iBlockState4, 2);
                    }
                } else if (block == this) {
                    IBlockState iBlockState5 = iBlockState3;
                    for (ao ao7 : ar.dwT) {
                        PropertyBool propertyBool = BlockVine.e(ao7);
                        if (!random.nextBoolean() || !iBlockState.b(propertyBool).booleanValue()) continue;
                        iBlockState5 = iBlockState5.a(propertyBool, true);
                    }
                    if (iBlockState5.b(bdd).booleanValue() || iBlockState5.b(bde).booleanValue() || iBlockState5.b(bdf).booleanValue() || iBlockState5.b(bdg).booleanValue()) {
                        w2.a(b7, iBlockState5, 2);
                    }
                }
            }
        }
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        IBlockState iBlockState = this.xM().a(bdc, false).a(bdd, false).a(bde, false).a(bdf, false).a(bdg, false);
        return ao2.asL().asP() ? iBlockState.a(BlockVine.e(ao2.asC()), true) : iBlockState;
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(w w2, net.minecraft.entity.player.a a2, b b2, IBlockState iBlockState, net.minecraft.tileentity.d d2) {
        if (!w2.dDw && a2.abO() != null && a2.abO().bP() == Items.cRi) {
            a2.a(n.dqC[Block.i(this)]);
            BlockVine.a(w2, b2, new co(Blocks.cNp, 1, 0));
        } else {
            super.a(w2, a2, b2, iBlockState, d2);
        }
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(bdf, (n2 & 1) > 0).a(bdg, (n2 & 2) > 0).a(bdd, (n2 & 4) > 0).a(bde, (n2 & 8) > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        if (iBlockState.b(bdf).booleanValue()) {
            n2 |= 1;
        }
        if (iBlockState.b(bdg).booleanValue()) {
            n2 |= 2;
        }
        if (iBlockState.b(bdd).booleanValue()) {
            n2 |= 4;
        }
        if (iBlockState.b(bde).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bdc, bdd, bde, bdf, bdg);
    }

    public static PropertyBool e(ao ao2) {
        switch (ao2) {
            case dwr: {
                return bdc;
            }
            case dws: {
                return bdd;
            }
            case dwt: {
                return bdf;
            }
            case dwv: {
                return bde;
            }
            case dwu: {
                return bdg;
            }
        }
        throw new IllegalArgumentException(String.valueOf(ao2) + " is an invalid choice");
    }

    public static int z(IBlockState iBlockState) {
        int n2 = 0;
        for (PropertyBool propertyBool : bdh) {
            if (!iBlockState.b(propertyBool).booleanValue()) continue;
            ++n2;
        }
        return n2;
    }
}

