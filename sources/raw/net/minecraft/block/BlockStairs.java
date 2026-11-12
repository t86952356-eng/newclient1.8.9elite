/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs$EnumHalf;
import net.minecraft.block.BlockStairs$EnumShape;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.da;
import net.minecraft.world.h;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockStairs
extends Block {
    public static final PropertyDirection baZ = PropertyDirection.a("facing", ar.dwT);
    public static final PropertyEnum<BlockStairs$EnumHalf> bba = PropertyEnum.c("half", BlockStairs$EnumHalf.class);
    public static final PropertyEnum<BlockStairs$EnumShape> bbb = PropertyEnum.c("shape", BlockStairs$EnumShape.class);
    private static final int[][] bbc = new int[][]{{4, 5}, {5, 7}, {6, 7}, {4, 6}, {0, 1}, {1, 3}, {2, 3}, {0, 2}};
    private final Block bbd;
    private final IBlockState bbe;
    private boolean bbf;
    private int bbg;

    protected BlockStairs(IBlockState iBlockState) {
        super(iBlockState.df().aSD);
        this.h(this.aSG.zS().a(baZ, ao.dws).a(bba, BlockStairs$EnumHalf.bbi).a(bbb, BlockStairs$EnumShape.bbl));
        this.bbd = iBlockState.df();
        this.bbe = iBlockState;
        this.L(this.bbd.aSq);
        this.K(this.bbd.aSr / 3.0f);
        this.a(this.bbd.aSB);
        this.aN(255);
        this.a(net.minecraft.creativetab.a.cpx);
    }

    @Override
    public void c(l l2, b b2) {
        if (this.bbf) {
            this.a(0.5f * (float)(this.bbg % 2), 0.5f * (float)(this.bbg / 4 % 2), 0.5f * (float)(this.bbg / 2 % 2), 0.5f + 0.5f * (float)(this.bbg % 2), 0.5f + 0.5f * (float)(this.bbg / 4 % 2), 0.5f + 0.5f * (float)(this.bbg / 2 % 2));
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
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

    public void q(l l2, b b2) {
        if (l2.L(b2).b(bba) == BlockStairs$EnumHalf.bbh) {
            this.a(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }

    public static boolean u(Block block) {
        return block instanceof BlockStairs;
    }

    public static boolean d(l l2, b b2, IBlockState iBlockState) {
        IBlockState iBlockState2 = l2.L(b2);
        Block block = iBlockState2.df();
        return BlockStairs.u(block) && iBlockState2.b(bba) == iBlockState.b(bba) && iBlockState2.b(baZ) == iBlockState.b(baZ);
    }

    public int r(l l2, b b2) {
        IBlockState iBlockState;
        Block block;
        boolean bl2;
        IBlockState iBlockState2 = l2.L(b2);
        ao ao2 = iBlockState2.b(baZ);
        BlockStairs$EnumHalf blockStairs$EnumHalf = iBlockState2.b(bba);
        boolean bl3 = bl2 = blockStairs$EnumHalf == BlockStairs$EnumHalf.bbh;
        if (ao2 == ao.dwv) {
            IBlockState iBlockState3 = l2.L(b2.arc());
            Block block2 = iBlockState3.df();
            if (BlockStairs.u(block2) && blockStairs$EnumHalf == iBlockState3.b(bba)) {
                ao ao3 = iBlockState3.b(baZ);
                if (ao3 == ao.dws && !BlockStairs.d(l2, b2.ara(), iBlockState2)) {
                    return bl2 ? 1 : 2;
                }
                if (ao3 == ao.dwt && !BlockStairs.d(l2, b2.aqZ(), iBlockState2)) {
                    return bl2 ? 2 : 1;
                }
            }
        } else if (ao2 == ao.dwu) {
            IBlockState iBlockState4 = l2.L(b2.arb());
            Block block3 = iBlockState4.df();
            if (BlockStairs.u(block3) && blockStairs$EnumHalf == iBlockState4.b(bba)) {
                ao ao4 = iBlockState4.b(baZ);
                if (ao4 == ao.dws && !BlockStairs.d(l2, b2.ara(), iBlockState2)) {
                    return bl2 ? 2 : 1;
                }
                if (ao4 == ao.dwt && !BlockStairs.d(l2, b2.aqZ(), iBlockState2)) {
                    return bl2 ? 1 : 2;
                }
            }
        } else if (ao2 == ao.dwt) {
            IBlockState iBlockState5 = l2.L(b2.ara());
            Block block4 = iBlockState5.df();
            if (BlockStairs.u(block4) && blockStairs$EnumHalf == iBlockState5.b(bba)) {
                ao ao5 = iBlockState5.b(baZ);
                if (ao5 == ao.dwu && !BlockStairs.d(l2, b2.arc(), iBlockState2)) {
                    return bl2 ? 2 : 1;
                }
                if (ao5 == ao.dwv && !BlockStairs.d(l2, b2.arb(), iBlockState2)) {
                    return bl2 ? 1 : 2;
                }
            }
        } else if (ao2 == ao.dws && BlockStairs.u(block = (iBlockState = l2.L(b2.aqZ())).df()) && blockStairs$EnumHalf == iBlockState.b(bba)) {
            ao ao6 = iBlockState.b(baZ);
            if (ao6 == ao.dwu && !BlockStairs.d(l2, b2.arc(), iBlockState2)) {
                return bl2 ? 1 : 2;
            }
            if (ao6 == ao.dwv && !BlockStairs.d(l2, b2.arb(), iBlockState2)) {
                return bl2 ? 2 : 1;
            }
        }
        return 0;
    }

    public int s(l l2, b b2) {
        IBlockState iBlockState;
        Block block;
        boolean bl2;
        IBlockState iBlockState2 = l2.L(b2);
        ao ao2 = iBlockState2.b(baZ);
        BlockStairs$EnumHalf blockStairs$EnumHalf = iBlockState2.b(bba);
        boolean bl3 = bl2 = blockStairs$EnumHalf == BlockStairs$EnumHalf.bbh;
        if (ao2 == ao.dwv) {
            IBlockState iBlockState3 = l2.L(b2.arb());
            Block block2 = iBlockState3.df();
            if (BlockStairs.u(block2) && blockStairs$EnumHalf == iBlockState3.b(bba)) {
                ao ao3 = iBlockState3.b(baZ);
                if (ao3 == ao.dws && !BlockStairs.d(l2, b2.aqZ(), iBlockState2)) {
                    return bl2 ? 1 : 2;
                }
                if (ao3 == ao.dwt && !BlockStairs.d(l2, b2.ara(), iBlockState2)) {
                    return bl2 ? 2 : 1;
                }
            }
        } else if (ao2 == ao.dwu) {
            IBlockState iBlockState4 = l2.L(b2.arc());
            Block block3 = iBlockState4.df();
            if (BlockStairs.u(block3) && blockStairs$EnumHalf == iBlockState4.b(bba)) {
                ao ao4 = iBlockState4.b(baZ);
                if (ao4 == ao.dws && !BlockStairs.d(l2, b2.aqZ(), iBlockState2)) {
                    return bl2 ? 2 : 1;
                }
                if (ao4 == ao.dwt && !BlockStairs.d(l2, b2.ara(), iBlockState2)) {
                    return bl2 ? 1 : 2;
                }
            }
        } else if (ao2 == ao.dwt) {
            IBlockState iBlockState5 = l2.L(b2.aqZ());
            Block block4 = iBlockState5.df();
            if (BlockStairs.u(block4) && blockStairs$EnumHalf == iBlockState5.b(bba)) {
                ao ao5 = iBlockState5.b(baZ);
                if (ao5 == ao.dwu && !BlockStairs.d(l2, b2.arb(), iBlockState2)) {
                    return bl2 ? 2 : 1;
                }
                if (ao5 == ao.dwv && !BlockStairs.d(l2, b2.arc(), iBlockState2)) {
                    return bl2 ? 1 : 2;
                }
            }
        } else if (ao2 == ao.dws && BlockStairs.u(block = (iBlockState = l2.L(b2.ara())).df()) && blockStairs$EnumHalf == iBlockState.b(bba)) {
            ao ao6 = iBlockState.b(baZ);
            if (ao6 == ao.dwu && !BlockStairs.d(l2, b2.arb(), iBlockState2)) {
                return bl2 ? 1 : 2;
            }
            if (ao6 == ao.dwv && !BlockStairs.d(l2, b2.arc(), iBlockState2)) {
                return bl2 ? 2 : 1;
            }
        }
        return 0;
    }

    public boolean t(l l2, b b2) {
        IBlockState iBlockState;
        Block block;
        IBlockState iBlockState2 = l2.L(b2);
        ao ao2 = iBlockState2.b(baZ);
        BlockStairs$EnumHalf blockStairs$EnumHalf = iBlockState2.b(bba);
        boolean bl2 = blockStairs$EnumHalf == BlockStairs$EnumHalf.bbh;
        float f2 = 0.5f;
        float f3 = 1.0f;
        if (bl2) {
            f2 = 0.0f;
            f3 = 0.5f;
        }
        float f4 = 0.0f;
        float f5 = 1.0f;
        float f6 = 0.0f;
        float f7 = 0.5f;
        boolean bl3 = true;
        if (ao2 == ao.dwv) {
            f4 = 0.5f;
            f7 = 1.0f;
            IBlockState iBlockState3 = l2.L(b2.arc());
            Block block2 = iBlockState3.df();
            if (BlockStairs.u(block2) && blockStairs$EnumHalf == iBlockState3.b(bba)) {
                ao ao3 = iBlockState3.b(baZ);
                if (ao3 == ao.dws && !BlockStairs.d(l2, b2.ara(), iBlockState2)) {
                    f7 = 0.5f;
                    bl3 = false;
                } else if (ao3 == ao.dwt && !BlockStairs.d(l2, b2.aqZ(), iBlockState2)) {
                    f6 = 0.5f;
                    bl3 = false;
                }
            }
        } else if (ao2 == ao.dwu) {
            f5 = 0.5f;
            f7 = 1.0f;
            IBlockState iBlockState4 = l2.L(b2.arb());
            Block block3 = iBlockState4.df();
            if (BlockStairs.u(block3) && blockStairs$EnumHalf == iBlockState4.b(bba)) {
                ao ao4 = iBlockState4.b(baZ);
                if (ao4 == ao.dws && !BlockStairs.d(l2, b2.ara(), iBlockState2)) {
                    f7 = 0.5f;
                    bl3 = false;
                } else if (ao4 == ao.dwt && !BlockStairs.d(l2, b2.aqZ(), iBlockState2)) {
                    f6 = 0.5f;
                    bl3 = false;
                }
            }
        } else if (ao2 == ao.dwt) {
            f6 = 0.5f;
            f7 = 1.0f;
            IBlockState iBlockState5 = l2.L(b2.ara());
            Block block4 = iBlockState5.df();
            if (BlockStairs.u(block4) && blockStairs$EnumHalf == iBlockState5.b(bba)) {
                ao ao5 = iBlockState5.b(baZ);
                if (ao5 == ao.dwu && !BlockStairs.d(l2, b2.arc(), iBlockState2)) {
                    f5 = 0.5f;
                    bl3 = false;
                } else if (ao5 == ao.dwv && !BlockStairs.d(l2, b2.arb(), iBlockState2)) {
                    f4 = 0.5f;
                    bl3 = false;
                }
            }
        } else if (ao2 == ao.dws && BlockStairs.u(block = (iBlockState = l2.L(b2.aqZ())).df()) && blockStairs$EnumHalf == iBlockState.b(bba)) {
            ao ao6 = iBlockState.b(baZ);
            if (ao6 == ao.dwu && !BlockStairs.d(l2, b2.arc(), iBlockState2)) {
                f5 = 0.5f;
                bl3 = false;
            } else if (ao6 == ao.dwv && !BlockStairs.d(l2, b2.arb(), iBlockState2)) {
                f4 = 0.5f;
                bl3 = false;
            }
        }
        this.a(f4, f2, f6, f5, f3, f7);
        return bl3;
    }

    public boolean u(l l2, b b2) {
        IBlockState iBlockState;
        Block block;
        IBlockState iBlockState2 = l2.L(b2);
        ao ao2 = iBlockState2.b(baZ);
        BlockStairs$EnumHalf blockStairs$EnumHalf = iBlockState2.b(bba);
        boolean bl2 = blockStairs$EnumHalf == BlockStairs$EnumHalf.bbh;
        float f2 = 0.5f;
        float f3 = 1.0f;
        if (bl2) {
            f2 = 0.0f;
            f3 = 0.5f;
        }
        float f4 = 0.0f;
        float f5 = 0.5f;
        float f6 = 0.5f;
        float f7 = 1.0f;
        boolean bl3 = false;
        if (ao2 == ao.dwv) {
            IBlockState iBlockState3 = l2.L(b2.arb());
            Block block2 = iBlockState3.df();
            if (BlockStairs.u(block2) && blockStairs$EnumHalf == iBlockState3.b(bba)) {
                ao ao3 = iBlockState3.b(baZ);
                if (ao3 == ao.dws && !BlockStairs.d(l2, b2.aqZ(), iBlockState2)) {
                    f6 = 0.0f;
                    f7 = 0.5f;
                    bl3 = true;
                } else if (ao3 == ao.dwt && !BlockStairs.d(l2, b2.ara(), iBlockState2)) {
                    f6 = 0.5f;
                    f7 = 1.0f;
                    bl3 = true;
                }
            }
        } else if (ao2 == ao.dwu) {
            IBlockState iBlockState4 = l2.L(b2.arc());
            Block block3 = iBlockState4.df();
            if (BlockStairs.u(block3) && blockStairs$EnumHalf == iBlockState4.b(bba)) {
                f4 = 0.5f;
                f5 = 1.0f;
                ao ao4 = iBlockState4.b(baZ);
                if (ao4 == ao.dws && !BlockStairs.d(l2, b2.aqZ(), iBlockState2)) {
                    f6 = 0.0f;
                    f7 = 0.5f;
                    bl3 = true;
                } else if (ao4 == ao.dwt && !BlockStairs.d(l2, b2.ara(), iBlockState2)) {
                    f6 = 0.5f;
                    f7 = 1.0f;
                    bl3 = true;
                }
            }
        } else if (ao2 == ao.dwt) {
            IBlockState iBlockState5 = l2.L(b2.aqZ());
            Block block4 = iBlockState5.df();
            if (BlockStairs.u(block4) && blockStairs$EnumHalf == iBlockState5.b(bba)) {
                f6 = 0.0f;
                f7 = 0.5f;
                ao ao5 = iBlockState5.b(baZ);
                if (ao5 == ao.dwu && !BlockStairs.d(l2, b2.arb(), iBlockState2)) {
                    bl3 = true;
                } else if (ao5 == ao.dwv && !BlockStairs.d(l2, b2.arc(), iBlockState2)) {
                    f4 = 0.5f;
                    f5 = 1.0f;
                    bl3 = true;
                }
            }
        } else if (ao2 == ao.dws && BlockStairs.u(block = (iBlockState = l2.L(b2.ara())).df()) && blockStairs$EnumHalf == iBlockState.b(bba)) {
            ao ao6 = iBlockState.b(baZ);
            if (ao6 == ao.dwu && !BlockStairs.d(l2, b2.arb(), iBlockState2)) {
                bl3 = true;
            } else if (ao6 == ao.dwv && !BlockStairs.d(l2, b2.arc(), iBlockState2)) {
                f4 = 0.5f;
                f5 = 1.0f;
                bl3 = true;
            }
        }
        if (bl3) {
            this.a(f4, f2, f6, f5, f3, f7);
        }
        return bl3;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, a a2, List<a> list, c c2) {
        this.q(w2, b2);
        super.a(w2, b2, iBlockState, a2, list, c2);
        boolean bl2 = this.t(w2, b2);
        super.a(w2, b2, iBlockState, a2, list, c2);
        if (bl2 && this.u(w2, b2)) {
            super.a(w2, b2, iBlockState, a2, list, c2);
        }
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        this.bbd.c(w2, b2, iBlockState, random);
    }

    @Override
    public void a(w w2, b b2, net.minecraft.entity.player.a a2) {
        this.bbd.a(w2, b2, a2);
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState) {
        this.bbd.b(w2, b2, iBlockState);
    }

    @Override
    public int b(l l2, b b2) {
        return this.bbd.b(l2, b2);
    }

    @Override
    public float A(c c2) {
        return this.bbd.A(c2);
    }

    @Override
    public av xo() {
        return this.bbd.xo();
    }

    @Override
    public int c(w w2) {
        return this.bbd.c(w2);
    }

    @Override
    public a c(w w2, b b2) {
        return this.bbd.c(w2, b2);
    }

    @Override
    public da a(w w2, b b2, c c2, da da2) {
        return this.bbd.a(w2, b2, c2, da2);
    }

    @Override
    public boolean xl() {
        return this.bbd.xl();
    }

    @Override
    public boolean a(IBlockState iBlockState, boolean bl2) {
        return this.bbd.a(iBlockState, bl2);
    }

    @Override
    public boolean d(w w2, b b2) {
        return this.bbd.d(w2, b2);
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        this.a(w2, b2, this.bbe, Blocks.cLc);
        this.bbd.c(w2, b2, this.bbe);
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        this.bbd.d(w2, b2, this.bbe);
    }

    @Override
    public void a(w w2, b b2, c c2) {
        this.bbd.a(w2, b2, c2);
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        this.bbd.b(w2, b2, iBlockState, random);
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        return this.bbd.a(w2, b2, this.bbe, a2, ao.dwq, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(w w2, b b2, h h2) {
        this.bbd.a(w2, b2, h2);
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return this.bbd.b(this.bbe);
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        IBlockState iBlockState = super.a(w2, b2, ao2, f2, f3, f4, n2, r2);
        iBlockState = iBlockState.a(baZ, r2.Uq()).a(bbb, BlockStairs$EnumShape.bbl);
        return ao2 != ao.dwq && (ao2 == ao.dwr || (double)f3 <= 0.5) ? iBlockState.a(bba, BlockStairs$EnumHalf.bbi) : iBlockState.a(bba, BlockStairs$EnumHalf.bbh);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ce a(w w2, b b2, da da2, da da3) {
        void var10_14;
        void object;
        ce[] ceArray = new ce[8];
        IBlockState iBlockState = w2.L(b2);
        int n2 = iBlockState.b(baZ).asA();
        boolean bl2 = iBlockState.b(bba) == BlockStairs$EnumHalf.bbh;
        int[] nArray = bbc[n2 + (bl2 ? 4 : 0)];
        this.bbf = true;
        boolean i2 = false;
        while (object < 8) {
            this.bbg = object;
            if (Arrays.binarySearch(nArray, (int)object) < 0) {
                ceArray[object] = super.a(w2, b2, da2, da3);
            }
            ++object;
        }
        for (int n3 : nArray) {
            ceArray[n3] = null;
        }
        Object var10_13 = null;
        double d2 = 0.0;
        for (ce ce2 : ceArray) {
            double d3;
            if (ce2 == null || !((d3 = ce2.daS.y(da3)) > d2)) continue;
            ce ce3 = ce2;
            d2 = d3;
        }
        return var10_14;
    }

    @Override
    public IBlockState aM(int n2) {
        IBlockState iBlockState = this.xM().a(bba, (n2 & 4) > 0 ? BlockStairs$EnumHalf.bbh : BlockStairs$EnumHalf.bbi);
        iBlockState = iBlockState.a(baZ, ao.hy(5 - (n2 & 3)));
        return iBlockState;
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        if (iBlockState.b(bba) == BlockStairs$EnumHalf.bbh) {
            n2 |= 4;
        }
        return n2 |= 5 - iBlockState.b(baZ).OY();
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        if (this.t(l2, b2)) {
            switch (this.s(l2, b2)) {
                case 0: {
                    iBlockState = iBlockState.a(bbb, BlockStairs$EnumShape.bbl);
                    break;
                }
                case 1: {
                    iBlockState = iBlockState.a(bbb, BlockStairs$EnumShape.bbn);
                    break;
                }
                case 2: {
                    iBlockState = iBlockState.a(bbb, BlockStairs$EnumShape.bbm);
                }
            }
        } else {
            switch (this.r(l2, b2)) {
                case 0: {
                    iBlockState = iBlockState.a(bbb, BlockStairs$EnumShape.bbl);
                    break;
                }
                case 1: {
                    iBlockState = iBlockState.a(bbb, BlockStairs$EnumShape.bbp);
                    break;
                }
                case 2: {
                    iBlockState = iBlockState.a(bbb, BlockStairs$EnumShape.bbo);
                }
            }
        }
        return iBlockState;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, baZ, bba, bbb);
    }
}

