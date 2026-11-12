/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ah;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.tileentity.y;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.ar;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockFurnace
extends BlockContainer {
    public static final PropertyDirection aVT = PropertyDirection.a("facing", ar.dwT);
    private final boolean aVU;
    private static boolean aVV;

    protected BlockFurnace(boolean bl2) {
        super(Material.bes);
        this.h(this.aSG.zS().a(aVT, ao.dws));
        this.aVU = bl2;
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return d.I(Blocks.cMn);
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        this.q(w2, b2, iBlockState);
    }

    private void q(w w2, b b2, IBlockState iBlockState) {
        if (!w2.dDw) {
            Block block = w2.L(b2.aqZ()).df();
            Block block2 = w2.L(b2.ara()).df();
            Block block3 = w2.L(b2.arb()).df();
            Block block4 = w2.L(b2.arc()).df();
            ao ao2 = iBlockState.b(aVT);
            if (ao2 == ao.dws && block.isFullBlock() && !block2.isFullBlock()) {
                ao2 = ao.dwt;
            } else if (ao2 == ao.dwt && block2.isFullBlock() && !block.isFullBlock()) {
                ao2 = ao.dws;
            } else if (ao2 == ao.dwu && block3.isFullBlock() && !block4.isFullBlock()) {
                ao2 = ao.dwv;
            } else if (ao2 == ao.dwv && block4.isFullBlock() && !block3.isFullBlock()) {
                ao2 = ao.dwu;
            }
            w2.a(b2, iBlockState.a(aVT, ao2), 2);
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        if (this.aVU) {
            ao ao2 = iBlockState.b(aVT);
            double d2 = (double)b2.wt() + 0.5;
            double d3 = (double)b2.wu() + random.nextDouble() * 6.0 / 16.0;
            double d4 = (double)b2.wx() + 0.5;
            double d5 = 0.52;
            double d6 = random.nextDouble() * 0.6 - 0.3;
            switch (ao2) {
                case dwu: {
                    w2.a(as.dxh, d2 - 0.52, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
                    w2.a(as.dxw, d2 - 0.52, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case dwv: {
                    w2.a(as.dxh, d2 + 0.52, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
                    w2.a(as.dxw, d2 + 0.52, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case dws: {
                    w2.a(as.dxh, d2 + d6, d3, d4 - 0.52, 0.0, 0.0, 0.0, new int[0]);
                    w2.a(as.dxw, d2 + d6, d3, d4 - 0.52, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case dwt: {
                    w2.a(as.dxh, d2 + d6, d3, d4 + 0.52, 0.0, 0.0, 0.0, new int[0]);
                    w2.a(as.dxw, d2 + d6, d3, d4 + 0.52, 0.0, 0.0, 0.0, new int[0]);
                }
            }
        }
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, a a2, ao ao2, float f2, float f3, float f4) {
        if (w2.dDw) {
            return true;
        }
        net.minecraft.tileentity.d d2 = w2.K(b2);
        if (d2 instanceof y) {
            a2.a((y)d2);
            a2.a(n.dqz);
        }
        return true;
    }

    public static void a(boolean bl2, w w2, b b2) {
        IBlockState iBlockState = w2.L(b2);
        net.minecraft.tileentity.d d2 = w2.K(b2);
        aVV = true;
        if (bl2) {
            w2.a(b2, Blocks.cMo.xM().a(aVT, iBlockState.b(aVT)), 3);
            w2.a(b2, Blocks.cMo.xM().a(aVT, iBlockState.b(aVT)), 3);
        } else {
            w2.a(b2, Blocks.cMn.xM().a(aVT, iBlockState.b(aVT)), 3);
            w2.a(b2, Blocks.cMn.xM().a(aVT, iBlockState.b(aVT)), 3);
        }
        aVV = false;
        if (d2 != null) {
            d2.apT();
            w2.a(b2, d2);
        }
    }

    @Override
    public net.minecraft.tileentity.d a(w w2, int n2) {
        return new y();
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return this.xM().a(aVT, r2.Uq().asC());
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, r r2, co co2) {
        net.minecraft.tileentity.d d2;
        w2.a(b2, iBlockState.a(aVT, r2.Uq().asC()), 2);
        if (co2.aen() && (d2 = w2.K(b2)) instanceof y) {
            ((y)d2).fY(co2.getDisplayName());
        }
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        net.minecraft.tileentity.d d2;
        if (!aVV && (d2 = w2.K(b2)) instanceof y) {
            ah.a(w2, b2, (ab)((y)d2));
            w2.f(b2, this);
        }
        super.d(w2, b2, iBlockState);
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
    public d e(w w2, b b2) {
        return d.I(Blocks.cMn);
    }

    @Override
    public int xg() {
        return 3;
    }

    @Override
    public IBlockState g(IBlockState iBlockState) {
        return this.xM().a(aVT, ao.dwt);
    }

    @Override
    public IBlockState aM(int n2) {
        ao ao2 = ao.hy(n2);
        if (ao2.asL() == ap.dwI) {
            ao2 = ao.dws;
        }
        return this.xM().a(aVT, ao2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aVT).OY();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aVT);
    }
}

