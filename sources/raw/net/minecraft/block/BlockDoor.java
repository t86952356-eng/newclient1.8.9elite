/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor$EnumDoorHalf;
import net.minecraft.block.BlockDoor$EnumHingePosition;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cr;
import net.minecraft.util.da;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockDoor
extends Block {
    public static final PropertyDirection aTQ = PropertyDirection.a("facing", ar.dwT);
    public static final PropertyBool aTR = PropertyBool.cs("open");
    public static final PropertyEnum<BlockDoor$EnumHingePosition> aTS = PropertyEnum.c("hinge", BlockDoor$EnumHingePosition.class);
    public static final PropertyBool aTT = PropertyBool.cs("powered");
    public static final PropertyEnum<BlockDoor$EnumDoorHalf> aTU = PropertyEnum.c("half", BlockDoor$EnumDoorHalf.class);

    protected BlockDoor(Material material) {
        super(material);
        this.h(this.aSG.zS().a(aTQ, ao.dws).a(aTR, false).a(aTS, BlockDoor$EnumHingePosition.aTY).a(aTT, false).a(aTU, BlockDoor$EnumDoorHalf.aTW));
    }

    @Override
    public String xA() {
        return cr.gm((this.xB() + ".name").replaceAll("tile", "item"));
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public boolean a(l l2, b b2) {
        return BlockDoor.aT(BlockDoor.e(l2, b2));
    }

    @Override
    public boolean xf() {
        return false;
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
        this.aR(BlockDoor.e(l2, b2));
    }

    private void aR(int n2) {
        float f2 = 0.1875f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f);
        ao ao2 = BlockDoor.aQ(n2);
        boolean bl2 = BlockDoor.aT(n2);
        boolean bl3 = BlockDoor.aV(n2);
        if (bl2) {
            if (ao2 == ao.dwv) {
                if (!bl3) {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.1875f);
                } else {
                    this.a(0.0f, 0.0f, 0.8125f, 1.0f, 1.0f, 1.0f);
                }
            } else if (ao2 == ao.dwt) {
                if (!bl3) {
                    this.a(0.8125f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                } else {
                    this.a(0.0f, 0.0f, 0.0f, 0.1875f, 1.0f, 1.0f);
                }
            } else if (ao2 == ao.dwu) {
                if (!bl3) {
                    this.a(0.0f, 0.0f, 0.8125f, 1.0f, 1.0f, 1.0f);
                } else {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.1875f);
                }
            } else if (ao2 == ao.dws) {
                if (!bl3) {
                    this.a(0.0f, 0.0f, 0.0f, 0.1875f, 1.0f, 1.0f);
                } else {
                    this.a(0.8125f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
            }
        } else if (ao2 == ao.dwv) {
            this.a(0.0f, 0.0f, 0.0f, 0.1875f, 1.0f, 1.0f);
        } else if (ao2 == ao.dwt) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.1875f);
        } else if (ao2 == ao.dwu) {
            this.a(0.8125f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else if (ao2 == ao.dws) {
            this.a(0.0f, 0.0f, 0.8125f, 1.0f, 1.0f, 1.0f);
        }
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        IBlockState iBlockState2;
        if (this.aSD == Material.bet) {
            return true;
        }
        b b3 = iBlockState.b(aTU) == BlockDoor$EnumDoorHalf.aTW ? b2 : b2.aqY();
        IBlockState iBlockState3 = iBlockState2 = b2.equals(b3) ? iBlockState : w2.L(b3);
        if (iBlockState2.df() != this) {
            return false;
        }
        iBlockState = iBlockState2.c(aTR);
        w2.a(b3, iBlockState, 2);
        w2.f(b3, b2);
        w2.b(a2, iBlockState.b(aTR) != false ? 1003 : 1006, b2, 0);
        return true;
    }

    public void a(w w2, b b2, boolean bl2) {
        IBlockState iBlockState = w2.L(b2);
        if (iBlockState.df() == this) {
            IBlockState iBlockState2;
            b b3 = iBlockState.b(aTU) == BlockDoor$EnumDoorHalf.aTW ? b2 : b2.aqY();
            IBlockState iBlockState3 = iBlockState2 = b2 == b3 ? iBlockState : w2.L(b3);
            if (iBlockState2.df() == this && iBlockState2.b(aTR) != bl2) {
                w2.a(b3, iBlockState2.a(aTR, bl2), 2);
                w2.f(b3, b2);
                w2.b(null, bl2 ? 1003 : 1006, b2, 0);
            }
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (iBlockState.b(aTU) == BlockDoor$EnumDoorHalf.aTV) {
            b b3 = b2.aqY();
            IBlockState iBlockState2 = w2.L(b3);
            if (iBlockState2.df() != this) {
                w2.aL(b2);
            } else if (block != this) {
                this.a(w2, b3, iBlockState2, block);
            }
        } else {
            boolean bl2 = false;
            b b4 = b2.aqX();
            IBlockState iBlockState3 = w2.L(b4);
            if (iBlockState3.df() != this) {
                w2.aL(b2);
                bl2 = true;
            }
            if (!w.v(w2, b2.aqY())) {
                w2.aL(b2);
                bl2 = true;
                if (iBlockState3.df() == this) {
                    w2.aL(b4);
                }
            }
            if (bl2) {
                if (!w2.dDw) {
                    this.a(w2, b2, iBlockState, 0);
                }
            } else {
                boolean bl3;
                boolean bl4 = bl3 = w2.bb(b2) || w2.bb(b4);
                if ((bl3 || block.xw()) && block != this && bl3 != iBlockState3.b(aTT)) {
                    w2.a(b4, iBlockState3.a(aTT, bl3), 2);
                    if (bl3 != iBlockState.b(aTR)) {
                        w2.a(b2, iBlockState.a(aTR, bl3), 2);
                        w2.f(b2, b2);
                        w2.b(null, bl3 ? 1003 : 1006, b2, 0);
                    }
                }
            }
        }
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return iBlockState.b(aTU) == BlockDoor$EnumDoorHalf.aTV ? null : this.bP();
    }

    @Override
    public ce a(w w2, b b2, da da2, da da3) {
        this.c((l)w2, b2);
        return super.a(w2, b2, da2, da3);
    }

    @Override
    public boolean d(w w2, b b2) {
        return b2.wu() < 255 && w.v(w2, b2.aqY()) && super.d(w2, b2) && super.d(w2, b2.aqX());
    }

    @Override
    public int xE() {
        return 1;
    }

    public static int e(l l2, b b2) {
        IBlockState iBlockState = l2.L(b2);
        int n2 = iBlockState.df().c(iBlockState);
        boolean bl2 = BlockDoor.aU(n2);
        IBlockState iBlockState2 = l2.L(b2.aqY());
        int n3 = iBlockState2.df().c(iBlockState2);
        int n4 = bl2 ? n3 : n2;
        IBlockState iBlockState3 = l2.L(b2.aqX());
        int n5 = iBlockState3.df().c(iBlockState3);
        int n6 = bl2 ? n2 : n5;
        boolean bl3 = (n6 & 1) != 0;
        boolean bl4 = (n6 & 2) != 0;
        return BlockDoor.aS(n4) | (bl2 ? 8 : 0) | (bl3 ? 16 : 0) | (bl4 ? 32 : 0);
    }

    @Override
    public d e(w w2, b b2) {
        return this.bP();
    }

    private d bP() {
        return this == Blocks.cMC ? Items.cQF : (this == Blocks.cMr ? Items.cQv : (this == Blocks.cMs ? Items.cQw : (this == Blocks.cMt ? Items.cQx : (this == Blocks.cMu ? Items.cQy : (this == Blocks.cMv ? Items.cQz : Items.cQu)))));
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2) {
        b b3 = b2.aqY();
        if (a2.cIt.cJM && iBlockState.b(aTU) == BlockDoor$EnumDoorHalf.aTV && w2.L(b3).df() == this) {
            w2.aL(b3);
        }
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        if (iBlockState.b(aTU) == BlockDoor$EnumDoorHalf.aTW) {
            IBlockState iBlockState2 = l2.L(b2.aqX());
            if (iBlockState2.df() == this) {
                iBlockState = iBlockState.a(aTS, iBlockState2.b(aTS)).a(aTT, iBlockState2.b(aTT));
            }
        } else {
            IBlockState iBlockState3 = l2.L(b2.aqY());
            if (iBlockState3.df() == this) {
                iBlockState = iBlockState.a(aTQ, iBlockState3.b(aTQ)).a(aTR, iBlockState3.b(aTR));
            }
        }
        return iBlockState;
    }

    @Override
    public IBlockState aM(int n2) {
        return (n2 & 8) > 0 ? this.xM().a(aTU, BlockDoor$EnumDoorHalf.aTV).a(aTS, (n2 & 1) > 0 ? BlockDoor$EnumHingePosition.aTZ : BlockDoor$EnumHingePosition.aTY).a(aTT, (n2 & 2) > 0) : this.xM().a(aTU, BlockDoor$EnumDoorHalf.aTW).a(aTQ, ao.hz(n2 & 3).asG()).a(aTR, (n2 & 4) > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        if (iBlockState.b(aTU) == BlockDoor$EnumDoorHalf.aTV) {
            n2 |= 8;
            if (iBlockState.b(aTS) == BlockDoor$EnumHingePosition.aTZ) {
                n2 |= 1;
            }
            if (iBlockState.b(aTT).booleanValue()) {
                n2 |= 2;
            }
        } else {
            n2 |= iBlockState.b(aTQ).asD().asA();
            if (iBlockState.b(aTR).booleanValue()) {
                n2 |= 4;
            }
        }
        return n2;
    }

    protected static int aS(int n2) {
        return n2 & 7;
    }

    public static boolean f(l l2, b b2) {
        return BlockDoor.aT(BlockDoor.e(l2, b2));
    }

    public static ao g(l l2, b b2) {
        return BlockDoor.aQ(BlockDoor.e(l2, b2));
    }

    public static ao aQ(int n2) {
        return ao.hz(n2 & 3).asG();
    }

    protected static boolean aT(int n2) {
        return (n2 & 4) != 0;
    }

    protected static boolean aU(int n2) {
        return (n2 & 8) != 0;
    }

    protected static boolean aV(int n2) {
        return (n2 & 0x10) != 0;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTU, aTQ, aTR, aTS, aTT);
    }
}

