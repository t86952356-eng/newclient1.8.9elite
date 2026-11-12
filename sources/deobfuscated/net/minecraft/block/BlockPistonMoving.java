/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.block.BlockPistonExtension$EnumPistonType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.d;
import net.minecraft.tileentity.ae;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.da;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockPistonMoving
extends BlockContainer {
    public static final PropertyDirection aXG = BlockPistonExtension.aXy;
    public static final PropertyEnum<BlockPistonExtension$EnumPistonType> aXH = BlockPistonExtension.aXz;

    public BlockPistonMoving() {
        super(Material.beV);
        this.h(this.aSG.zS().a(aXG, ao.dws).a(aXH, BlockPistonExtension$EnumPistonType.aXC));
        this.L(-1.0f);
    }

    @Override
    public net.minecraft.tileentity.d a(w w2, int n2) {
        return null;
    }

    public static net.minecraft.tileentity.d a(IBlockState iBlockState, ao ao2, boolean bl2, boolean bl3) {
        return new ae(iBlockState, ao2, bl2, bl3);
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        net.minecraft.tileentity.d d2 = w2.K(b2);
        if (d2 instanceof ae) {
            ((ae)d2).aqN();
        } else {
            super.d(w2, b2, iBlockState);
        }
    }

    @Override
    public boolean d(w w2, b b2) {
        return false;
    }

    @Override
    public boolean a(w w2, b b2, ao ao2) {
        return false;
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState) {
        b b3 = b2.x(iBlockState.b(aXG).asC());
        IBlockState iBlockState2 = w2.L(b3);
        if (iBlockState2.df() instanceof BlockPistonBase && iBlockState2.b(BlockPistonBase.aXv).booleanValue()) {
            w2.aL(b3);
        }
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
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (!w2.dDw && w2.K(b2) == null) {
            w2.aL(b2);
            return true;
        }
        return false;
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return null;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        ae ae2;
        if (!w2.dDw && (ae2 = this.o(w2, b2)) != null) {
            IBlockState iBlockState2 = ae2.aqK();
            iBlockState2.df().a(w2, b2, iBlockState2, 0);
        }
    }

    @Override
    public ce a(w w2, b b2, da da2, da da3) {
        return null;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!w2.dDw) {
            w2.K(b2);
        }
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        ae ae2 = this.o(w2, b2);
        if (ae2 == null) {
            return null;
        }
        float f2 = ae2.bF(0.0f);
        if (ae2.aqL()) {
            f2 = 1.0f - f2;
        }
        return this.a(w2, b2, ae2.aqK(), f2, ae2.yx());
    }

    @Override
    public void c(l l2, b b2) {
        ae ae2 = this.o(l2, b2);
        if (ae2 != null) {
            IBlockState iBlockState = ae2.aqK();
            Block block = iBlockState.df();
            if (block == this || block.xb() == Material.beo) {
                return;
            }
            float f2 = ae2.bF(0.0f);
            if (ae2.aqL()) {
                f2 = 1.0f - f2;
            }
            block.c(l2, b2);
            if (block == Blocks.cLL || block == Blocks.cLH) {
                f2 = 0.0f;
            }
            ao ao2 = ae2.yx();
            this.aSv = block.xp() - (double)((float)ao2.asH() * f2);
            this.aSw = block.xr() - (double)((float)ao2.asI() * f2);
            this.aSx = block.xt() - (double)((float)ao2.asJ() * f2);
            this.aSy = block.xq() - (double)((float)ao2.asH() * f2);
            this.aSz = block.xs() - (double)((float)ao2.asI() * f2);
            this.aSA = block.xu() - (double)((float)ao2.asJ() * f2);
        }
    }

    public a a(w w2, b b2, IBlockState iBlockState, float f2, ao ao2) {
        if (iBlockState.df() != this && iBlockState.df().xb() != Material.beo) {
            a a2 = iBlockState.df().a(w2, b2, iBlockState);
            if (a2 == null) {
                return null;
            }
            double d2 = a2.dtH;
            double d3 = a2.dtI;
            double d4 = a2.dtJ;
            double d5 = a2.dtK;
            double d6 = a2.dtL;
            double d7 = a2.dtM;
            if (ao2.asH() < 0) {
                d2 -= (double)((float)ao2.asH() * f2);
            } else {
                d5 -= (double)((float)ao2.asH() * f2);
            }
            if (ao2.asI() < 0) {
                d3 -= (double)((float)ao2.asI() * f2);
            } else {
                d6 -= (double)((float)ao2.asI() * f2);
            }
            if (ao2.asJ() < 0) {
                d4 -= (double)((float)ao2.asJ() * f2);
            } else {
                d7 -= (double)((float)ao2.asJ() * f2);
            }
            return new a(d2, d3, d4, d5, d6, d7);
        }
        return null;
    }

    private ae o(l l2, b b2) {
        net.minecraft.tileentity.d d2 = l2.K(b2);
        return d2 instanceof ae ? (ae)d2 : null;
    }

    @Override
    public d e(w w2, b b2) {
        return null;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aXG, BlockPistonExtension.aQ(n2)).a(aXH, (n2 & 8) > 0 ? BlockPistonExtension$EnumPistonType.aXD : BlockPistonExtension$EnumPistonType.aXC);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aXG).OY();
        if (iBlockState.b(aXH) == BlockPistonExtension$EnumPistonType.aXD) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aXG, aXH);
    }
}

