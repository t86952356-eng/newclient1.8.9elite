/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockTrapDoor$DoorHalf;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.da;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockTrapDoor
extends Block {
    public static final PropertyDirection bcH = PropertyDirection.a("facing", ar.dwT);
    public static final PropertyBool bcI = PropertyBool.cs("open");
    public static final PropertyEnum<BlockTrapDoor$DoorHalf> bcJ = PropertyEnum.c("half", BlockTrapDoor$DoorHalf.class);

    protected BlockTrapDoor(Material material) {
        super(material);
        this.h(this.aSG.zS().a(bcH, ao.dws).a(bcI, false).a(bcJ, BlockTrapDoor$DoorHalf.bcM));
        float f2 = 0.5f;
        float f3 = 1.0f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.a(net.minecraft.creativetab.a.cpz);
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
    public boolean a(l l2, b b2) {
        return l2.L(b2).b(bcI) == false;
    }

    @Override
    public a c(w w2, b b2) {
        this.c((l)w2, b2);
        return super.c(w2, b2);
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        this.c((l)w2, b2);
        return super.a(w2, b2, iBlockState);
    }

    @Override
    public void c(l l2, b b2) {
        this.y(l2.L(b2));
    }

    @Override
    public void xx() {
        float f2 = 0.1875f;
        this.a(0.0f, 0.40625f, 0.0f, 1.0f, 0.59375f, 1.0f);
    }

    public void y(IBlockState iBlockState) {
        if (iBlockState.df() == this) {
            boolean bl2 = iBlockState.b(bcJ) == BlockTrapDoor$DoorHalf.bcL;
            Boolean bl3 = iBlockState.b(bcI);
            ao ao2 = iBlockState.b(bcH);
            float f2 = 0.1875f;
            if (bl2) {
                this.a(0.0f, 0.8125f, 0.0f, 1.0f, 1.0f, 1.0f);
            } else {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.1875f, 1.0f);
            }
            if (bl3.booleanValue()) {
                if (ao2 == ao.dws) {
                    this.a(0.0f, 0.0f, 0.8125f, 1.0f, 1.0f, 1.0f);
                }
                if (ao2 == ao.dwt) {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.1875f);
                }
                if (ao2 == ao.dwu) {
                    this.a(0.8125f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
                if (ao2 == ao.dwv) {
                    this.a(0.0f, 0.0f, 0.0f, 0.1875f, 1.0f, 1.0f);
                }
            }
        }
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (this.aSD == Material.bet) {
            return true;
        }
        iBlockState = iBlockState.c(bcI);
        w2.a(b2, iBlockState, 2);
        w2.b(a2, iBlockState.b(bcI) != false ? 1003 : 1006, b2, 0);
        return true;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!w2.dDw) {
            b b3 = b2.x(iBlockState.b(bcH).asC());
            if (!BlockTrapDoor.v(w2.L(b3).df())) {
                w2.aL(b2);
                this.a(w2, b2, iBlockState, 0);
            } else {
                boolean bl2;
                boolean bl3 = w2.bb(b2);
                if ((bl3 || block.xw()) && (bl2 = iBlockState.b(bcI).booleanValue()) != bl3) {
                    w2.a(b2, iBlockState.a(bcI, bl3), 2);
                    w2.b(null, bl3 ? 1003 : 1006, b2, 0);
                }
            }
        }
    }

    @Override
    public ce a(w w2, b b2, da da2, da da3) {
        this.c((l)w2, b2);
        return super.a(w2, b2, da2, da3);
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        IBlockState iBlockState = this.xM();
        if (ao2.asL().asP()) {
            iBlockState = iBlockState.a(bcH, ao2).a(bcI, false);
            iBlockState = iBlockState.a(bcJ, f3 > 0.5f ? BlockTrapDoor$DoorHalf.bcL : BlockTrapDoor$DoorHalf.bcM);
        }
        return iBlockState;
    }

    @Override
    public boolean a(w w2, b b2, ao ao2) {
        return !ao2.asL().asO() && BlockTrapDoor.v(w2.L(b2.x(ao2.asC())).df());
    }

    protected static ao aQ(int n2) {
        switch (n2 & 3) {
            case 0: {
                return ao.dws;
            }
            case 1: {
                return ao.dwt;
            }
            case 2: {
                return ao.dwu;
            }
        }
        return ao.dwv;
    }

    protected static int d(ao ao2) {
        switch (ao2) {
            case dws: {
                return 0;
            }
            case dwt: {
                return 1;
            }
            case dwu: {
                return 2;
            }
        }
        return 3;
    }

    private static boolean v(Block block) {
        return block.aSD.isOpaque() && block.xf() || block == Blocks.cMZ || block instanceof BlockSlab || block instanceof BlockStairs;
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(bcH, BlockTrapDoor.aQ(n2)).a(bcI, (n2 & 4) != 0).a(bcJ, (n2 & 8) == 0 ? BlockTrapDoor$DoorHalf.bcM : BlockTrapDoor$DoorHalf.bcL);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= BlockTrapDoor.d(iBlockState.b(bcH));
        if (iBlockState.b(bcI).booleanValue()) {
            n2 |= 4;
        }
        if (iBlockState.b(bcJ) == BlockTrapDoor$DoorHalf.bcL) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bcH, bcI, bcJ);
    }
}

