/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockSourceImpl;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.dispenser.c;
import net.minecraft.dispenser.e;
import net.minecraft.dispenser.h;
import net.minecraft.dispenser.i;
import net.minecraft.entity.r;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ah;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.tileentity.s;
import net.minecraft.tileentity.t;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.ch;
import net.minecraft.world.w;

public class BlockDispenser
extends BlockContainer {
    public static final PropertyDirection aTN = PropertyDirection.ct("facing");
    public static final PropertyBool aTO = PropertyBool.cs("triggered");
    public static final ch<d, c> aTP = new ch(new net.minecraft.dispenser.a());
    protected Random ta = new Random();

    protected BlockDispenser() {
        super(Material.bes);
        this.h(this.aSG.zS().a(aTN, ao.dws).a(aTO, false));
        this.a(a.cpz);
    }

    @Override
    public int c(w w2) {
        return 4;
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        super.c(w2, b2, iBlockState);
        this.m(w2, b2, iBlockState);
    }

    private void m(w w2, b b2, IBlockState iBlockState) {
        if (!w2.dDw) {
            ao ao2 = iBlockState.b(aTN);
            boolean bl2 = w2.L(b2.aqZ()).df().isFullBlock();
            boolean bl3 = w2.L(b2.ara()).df().isFullBlock();
            if (ao2 == ao.dws && bl2 && !bl3) {
                ao2 = ao.dwt;
            } else if (ao2 == ao.dwt && bl3 && !bl2) {
                ao2 = ao.dws;
            } else {
                boolean bl4 = w2.L(b2.arb()).df().isFullBlock();
                boolean bl5 = w2.L(b2.arc()).df().isFullBlock();
                if (ao2 == ao.dwu && bl4 && !bl5) {
                    ao2 = ao.dwv;
                } else if (ao2 == ao.dwv && bl5 && !bl4) {
                    ao2 = ao.dwu;
                }
            }
            w2.a(b2, iBlockState.a(aTN, ao2).a(aTO, false), 2);
        }
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (w2.dDw) {
            return true;
        }
        net.minecraft.tileentity.d d2 = w2.K(b2);
        if (d2 instanceof s) {
            a2.a((s)d2);
            if (d2 instanceof t) {
                a2.a(n.dqp);
            } else {
                a2.a(n.dqr);
            }
        }
        return true;
    }

    protected void x(w w2, b b2) {
        BlockSourceImpl blockSourceImpl = new BlockSourceImpl(w2, b2);
        s s2 = (s)blockSourceImpl.zh();
        if (s2 != null) {
            int n2 = s2.aqw();
            if (n2 < 0) {
                w2.e(1001, b2, 0);
            } else {
                co co2 = s2.fi(n2);
                c c2 = this.D(co2);
                if (c2 != c.cpQ) {
                    co co3 = c2.a(blockSourceImpl, co2);
                    s2.g(n2, co3.cWZ <= 0 ? null : co3);
                }
            }
        }
    }

    protected c D(co co2) {
        return aTP.w(co2 == null ? null : co2.bP());
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        boolean bl2 = w2.bb(b2) || w2.bb(b2.aqX());
        boolean bl3 = iBlockState.b(aTO);
        if (bl2 && !bl3) {
            w2.a(b2, (Block)this, this.c(w2));
            w2.a(b2, iBlockState.a(aTO, true), 4);
        } else if (!bl2 && bl3) {
            w2.a(b2, iBlockState.a(aTO, false), 4);
        }
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (!w2.dDw) {
            this.x(w2, b2);
        }
    }

    @Override
    public net.minecraft.tileentity.d a(w w2, int n2) {
        return new s();
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return this.xM().a(aTN, BlockPistonBase.a(w2, b2, r2)).a(aTO, false);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, r r2, co co2) {
        net.minecraft.tileentity.d d2;
        w2.a(b2, iBlockState.a(aTN, BlockPistonBase.a(w2, b2, r2)), 2);
        if (co2.aen() && (d2 = w2.K(b2)) instanceof s) {
            ((s)d2).es(co2.getDisplayName());
        }
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        net.minecraft.tileentity.d d2 = w2.K(b2);
        if (d2 instanceof s) {
            ah.a(w2, b2, (ab)((s)d2));
            w2.f(b2, this);
        }
        super.d(w2, b2, iBlockState);
    }

    public static h a(e e2) {
        ao ao2 = BlockDispenser.aQ(e2.zg());
        double d2 = e2.getX() + 0.7 * (double)ao2.asH();
        double d3 = e2.getY() + 0.7 * (double)ao2.asI();
        double d4 = e2.getZ() + 0.7 * (double)ao2.asJ();
        return new i(d2, d3, d4);
    }

    public static ao aQ(int n2) {
        return ao.hy(n2 & 7);
    }

    @Override
    public boolean xJ() {
        return true;
    }

    @Override
    public int h(w w2, b b2) {
        return net.minecraft.inventory.b.d(w2.K(b2));
    }

    @Override
    public int xg() {
        return 3;
    }

    @Override
    public IBlockState g(IBlockState iBlockState) {
        return this.xM().a(aTN, ao.dwt);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTN, BlockDispenser.aQ(n2)).a(aTO, (n2 & 8) > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aTN).OY();
        if (iBlockState.b(aTO).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTN, aTO);
    }
}

