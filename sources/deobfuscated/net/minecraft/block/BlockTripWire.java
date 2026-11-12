/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTripWireHook;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockTripWire
extends Block {
    public static final PropertyBool bcP = PropertyBool.cs("powered");
    public static final PropertyBool bcQ = PropertyBool.cs("suspended");
    public static final PropertyBool bcR = PropertyBool.cs("attached");
    public static final PropertyBool bcS = PropertyBool.cs("disarmed");
    public static final PropertyBool bcT = PropertyBool.cs("north");
    public static final PropertyBool bcU = PropertyBool.cs("east");
    public static final PropertyBool bcV = PropertyBool.cs("south");
    public static final PropertyBool bcW = PropertyBool.cs("west");

    public BlockTripWire() {
        super(Material.beE);
        this.h(this.aSG.zS().a(bcP, false).a(bcQ, false).a(bcR, false).a(bcS, false).a(bcT, false).a(bcU, false).a(bcV, false).a(bcW, false));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.15625f, 1.0f);
        this.O(true);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        return iBlockState.a(bcT, BlockTripWire.c(l2, b2, iBlockState, ao.dws)).a(bcU, BlockTripWire.c(l2, b2, iBlockState, ao.dwv)).a(bcV, BlockTripWire.c(l2, b2, iBlockState, ao.dwt)).a(bcW, BlockTripWire.c(l2, b2, iBlockState, ao.dwu));
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
    public av xo() {
        return av.dxY;
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cPJ;
    }

    @Override
    public d e(w w2, b b2) {
        return Items.cPJ;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        boolean bl2;
        boolean bl3 = iBlockState.b(bcQ);
        boolean bl4 = bl2 = !w.v(w2, b2.aqY());
        if (bl3 != bl2) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
        }
    }

    @Override
    public void c(l l2, b b2) {
        IBlockState iBlockState = l2.L(b2);
        boolean bl2 = iBlockState.b(bcR);
        boolean bl3 = iBlockState.b(bcQ);
        if (!bl3) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.09375f, 1.0f);
        } else if (!bl2) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        } else {
            this.a(0.0f, 0.0625f, 0.0f, 1.0f, 0.15625f, 1.0f);
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        iBlockState = iBlockState.a(bcQ, !w.v(w2, b2.aqY()));
        w2.a(b2, iBlockState, 3);
        this.L(w2, b2, iBlockState);
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        this.L(w2, b2, iBlockState.a(bcP, true));
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2) {
        if (!w2.dDw && a2.abO() != null && a2.abO().bP() == Items.cRi) {
            w2.a(b2, iBlockState.a(bcS, true), 4);
        }
    }

    private void L(w w2, b b2, IBlockState iBlockState) {
        block0: for (ao ao2 : new ao[]{ao.dwt, ao.dwu}) {
            for (int i2 = 1; i2 < 42; ++i2) {
                b b3 = b2.d(ao2, i2);
                IBlockState iBlockState2 = w2.L(b3);
                if (iBlockState2.df() == Blocks.cNT) {
                    if (iBlockState2.b(BlockTripWireHook.bcX) != ao2.asC()) continue block0;
                    Blocks.cNT.a(w2, b3, iBlockState2, false, true, i2, iBlockState);
                    continue block0;
                }
                if (iBlockState2.df() != Blocks.cNU) continue block0;
            }
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, c c2) {
        if (!w2.dDw && !iBlockState.b(bcP).booleanValue()) {
            this.X(w2, b2);
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Random random) {
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (!w2.dDw && w2.L(b2).b(bcP).booleanValue()) {
            this.X(w2, b2);
        }
    }

    private void X(w w2, b b2) {
        IBlockState iBlockState = w2.L(b2);
        boolean bl2 = iBlockState.b(bcP);
        boolean bl3 = false;
        List<c> list = w2.b((c)null, new a((double)b2.wt() + this.aSv, (double)b2.wu() + this.aSw, (double)b2.wx() + this.aSx, (double)b2.wt() + this.aSy, (double)b2.wu() + this.aSz, (double)b2.wx() + this.aSA));
        if (!list.isEmpty()) {
            for (c c2 : list) {
                if (c2.Uj()) continue;
                bl3 = true;
                break;
            }
        }
        if (bl3 != bl2) {
            iBlockState = iBlockState.a(bcP, bl3);
            w2.a(b2, iBlockState, 3);
            this.L(w2, b2, iBlockState);
        }
        if (bl3) {
            w2.a(b2, (Block)this, this.c(w2));
        }
    }

    public static boolean c(l l2, b b2, IBlockState iBlockState, ao ao2) {
        b b3 = b2.x(ao2);
        IBlockState iBlockState2 = l2.L(b3);
        Block block = iBlockState2.df();
        if (block == Blocks.cNT) {
            ao ao3 = ao2.asC();
            return iBlockState2.b(BlockTripWireHook.bcX) == ao3;
        }
        if (block == Blocks.cNU) {
            boolean bl2;
            boolean bl3 = iBlockState.b(bcQ);
            return bl3 == (bl2 = iBlockState2.b(bcQ).booleanValue());
        }
        return false;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(bcP, (n2 & 1) > 0).a(bcQ, (n2 & 2) > 0).a(bcR, (n2 & 4) > 0).a(bcS, (n2 & 8) > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        if (iBlockState.b(bcP).booleanValue()) {
            n2 |= 1;
        }
        if (iBlockState.b(bcQ).booleanValue()) {
            n2 |= 2;
        }
        if (iBlockState.b(bcR).booleanValue()) {
            n2 |= 4;
        }
        if (iBlockState.b(bcS).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bcP, bcQ, bcR, bcS, bcT, bcU, bcW, bcV);
    }
}

