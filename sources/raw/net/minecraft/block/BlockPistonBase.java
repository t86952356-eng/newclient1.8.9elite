/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.block.BlockPistonExtension$EnumPistonType;
import net.minecraft.block.BlockPistonMoving;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockPistonStructureHelper;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.tileentity.ae;
import net.minecraft.tileentity.d;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockPistonBase
extends Block {
    public static final PropertyDirection aXu = PropertyDirection.ct("facing");
    public static final PropertyBool aXv = PropertyBool.cs("extended");
    private final boolean aXw;

    public BlockPistonBase(boolean bl2) {
        super(Material.beV);
        this.h(this.aSG.zS().a(aXu, ao.dws).a(aXv, false));
        this.aXw = bl2;
        this.a(aSc);
        this.L(0.5f);
        this.a(net.minecraft.creativetab.a.cpz);
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, r r2, co co2) {
        w2.a(b2, iBlockState.a(aXu, BlockPistonBase.a(w2, b2, r2)), 2);
        if (!w2.dDw) {
            this.v(w2, b2, iBlockState);
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!w2.dDw) {
            this.v(w2, b2, iBlockState);
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        if (!w2.dDw && w2.K(b2) == null) {
            this.v(w2, b2, iBlockState);
        }
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return this.xM().a(aXu, BlockPistonBase.a(w2, b2, r2)).a(aXv, false);
    }

    private void v(w w2, b b2, IBlockState iBlockState) {
        ao ao2 = iBlockState.b(aXu);
        boolean bl2 = this.g(w2, b2, ao2);
        if (bl2 && !iBlockState.b(aXv).booleanValue()) {
            if (new BlockPistonStructureHelper(w2, b2, ao2, true).zN()) {
                w2.c(b2, this, 0, ao2.OY());
            }
        } else if (!bl2 && iBlockState.b(aXv).booleanValue()) {
            w2.a(b2, iBlockState.a(aXv, false), 2);
            w2.c(b2, this, 1, ao2.OY());
        }
    }

    private boolean g(w w2, b b2, ao ao2) {
        for (ao ao3 : ao.values()) {
            if (ao3 == ao2 || !w2.j(b2.x(ao3), ao3)) continue;
            return true;
        }
        if (w2.j(b2, ao.dwq)) {
            return true;
        }
        b b3 = b2.aqX();
        for (ao ao4 : ao.values()) {
            if (ao4 == ao.dwq || !w2.j(b3.x(ao4), ao4)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, int n2, int n3) {
        ao ao2 = iBlockState.b(aXu);
        if (!w2.dDw) {
            boolean bl2 = this.g(w2, b2, ao2);
            if (bl2 && n2 == 1) {
                w2.a(b2, iBlockState.a(aXv, true), 2);
                return false;
            }
            if (!bl2 && n2 == 0) {
                return false;
            }
        }
        if (n2 == 0) {
            if (!this.a(w2, b2, ao2, true)) {
                return false;
            }
            w2.a(b2, iBlockState.a(aXv, true), 2);
            w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, "tile.piston.out", 0.5f, w2.dDk.nextFloat() * 0.25f + 0.6f);
        } else if (n2 == 1) {
            d d2 = w2.K(b2.x(ao2));
            if (d2 instanceof ae) {
                ((ae)d2).aqN();
            }
            w2.a(b2, Blocks.cLO.xM().a(BlockPistonMoving.aXG, ao2).a(BlockPistonMoving.aXH, this.aXw ? BlockPistonExtension$EnumPistonType.aXD : BlockPistonExtension$EnumPistonType.aXC), 3);
            w2.a(b2, BlockPistonMoving.a(this.aM(n3), ao2, false, true));
            if (this.aXw) {
                ae ae2;
                d d3;
                b b3 = b2.C(ao2.asH() * 2, ao2.asI() * 2, ao2.asJ() * 2);
                Block block = w2.L(b3).df();
                boolean bl3 = false;
                if (block == Blocks.cLO && (d3 = w2.K(b3)) instanceof ae && (ae2 = (ae)d3).yx() == ao2 && ae2.aqL()) {
                    ae2.aqN();
                    bl3 = true;
                }
                if (!bl3 && block.xb() != Material.beo && BlockPistonBase.a(block, w2, b3, ao2.asC(), false) && (block.xE() == 0 || block == Blocks.cLL || block == Blocks.cLH)) {
                    this.a(w2, b2, ao2, false);
                }
            } else {
                w2.aL(b2.x(ao2));
            }
            w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, "tile.piston.in", 0.5f, w2.dDk.nextFloat() * 0.15f + 0.6f);
        }
        return true;
    }

    @Override
    public void c(l l2, b b2) {
        IBlockState iBlockState = l2.L(b2);
        if (iBlockState.df() == this && iBlockState.b(aXv).booleanValue()) {
            float f2 = 0.25f;
            ao ao2 = iBlockState.b(aXu);
            if (ao2 != null) {
                switch (ao2) {
                    case dwq: {
                        this.a(0.0f, 0.25f, 0.0f, 1.0f, 1.0f, 1.0f);
                        break;
                    }
                    case dwr: {
                        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
                        break;
                    }
                    case dws: {
                        this.a(0.0f, 0.0f, 0.25f, 1.0f, 1.0f, 1.0f);
                        break;
                    }
                    case dwt: {
                        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.75f);
                        break;
                    }
                    case dwu: {
                        this.a(0.25f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                        break;
                    }
                    case dwv: {
                        this.a(0.0f, 0.0f, 0.0f, 0.75f, 1.0f, 1.0f);
                    }
                }
            }
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    @Override
    public void xx() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, a a2, List<a> list, c c2) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.a(w2, b2, iBlockState, a2, list, c2);
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        this.c((l)w2, b2);
        return super.a(w2, b2, iBlockState);
    }

    @Override
    public boolean xf() {
        return false;
    }

    public static ao aQ(int n2) {
        int n3 = n2 & 7;
        return n3 > 5 ? null : ao.hy(n3);
    }

    public static ao a(w w2, b b2, r r2) {
        if (bt.bz((float)r2.gW - (float)b2.wt()) < 2.0f && bt.bz((float)r2.gY - (float)b2.wx()) < 2.0f) {
            double d2 = r2.gX + (double)r2.getEyeHeight();
            if (d2 - (double)b2.wu() > 2.0) {
                return ao.dwr;
            }
            if ((double)b2.wu() - d2 > 0.0) {
                return ao.dwq;
            }
        }
        return r2.Uq().asC();
    }

    public static boolean a(Block block, w w2, b b2, ao ao2, boolean bl2) {
        if (block == Blocks.cMb) {
            return false;
        }
        if (!w2.Sv().bm(b2)) {
            return false;
        }
        if (b2.wu() >= 0 && (ao2 != ao.dwq || b2.wu() != 0)) {
            if (b2.wu() <= w2.getHeight() - 1 && (ao2 != ao.dwr || b2.wu() != w2.getHeight() - 1)) {
                if (block != Blocks.cLL && block != Blocks.cLH) {
                    if (block.b(w2, b2) == -1.0f) {
                        return false;
                    }
                    if (block.xE() == 2) {
                        return false;
                    }
                    if (block.xE() == 1) {
                        return bl2;
                    }
                } else if (w2.L(b2).b(aXv).booleanValue()) {
                    return false;
                }
                return !(block instanceof ITileEntityProvider);
            }
            return false;
        }
        return false;
    }

    private boolean a(w w2, b b2, ao ao2, boolean bl2) {
        int n2;
        Object object;
        Object object2;
        Object object3;
        int n3;
        if (!bl2) {
            w2.aL(b2.x(ao2));
        }
        BlockPistonStructureHelper blockPistonStructureHelper = new BlockPistonStructureHelper(w2, b2, ao2, bl2);
        List<b> list = blockPistonStructureHelper.zO();
        List<b> list2 = blockPistonStructureHelper.zP();
        if (!blockPistonStructureHelper.zN()) {
            return false;
        }
        int n4 = list.size() + list2.size();
        Block[] blockArray = new Block[n4];
        ao ao3 = bl2 ? ao2 : ao2.asC();
        for (n3 = list2.size() - 1; n3 >= 0; --n3) {
            object3 = list2.get(n3);
            object2 = w2.L((b)object3).df();
            ((Block)object2).a(w2, (b)object3, w2.L((b)object3), 0);
            w2.aL((b)object3);
            blockArray[--n4] = object2;
        }
        for (n3 = list.size() - 1; n3 >= 0; --n3) {
            object3 = list.get(n3);
            object2 = w2.L((b)object3);
            object = object2.df();
            ((Block)object).c((IBlockState)object2);
            w2.aL((b)object3);
            object3 = ((b)object3).x(ao3);
            w2.a((b)object3, Blocks.cLO.xM().a(aXu, ao2), 4);
            w2.a((b)object3, BlockPistonMoving.a((IBlockState)object2, ao2, bl2, false));
            blockArray[--n4] = object;
        }
        b b3 = b2.x(ao2);
        if (bl2) {
            object3 = this.aXw ? BlockPistonExtension$EnumPistonType.aXD : BlockPistonExtension$EnumPistonType.aXC;
            object2 = Blocks.cLM.xM().a(BlockPistonExtension.aXy, ao2).a(BlockPistonExtension.aXz, object3);
            object = Blocks.cLO.xM().a(BlockPistonMoving.aXG, ao2).a(BlockPistonMoving.aXH, this.aXw ? BlockPistonExtension$EnumPistonType.aXD : BlockPistonExtension$EnumPistonType.aXC);
            w2.a(b3, (IBlockState)object, 4);
            w2.a(b3, BlockPistonMoving.a((IBlockState)object2, ao2, true, false));
        }
        for (n2 = list2.size() - 1; n2 >= 0; --n2) {
            w2.c(list2.get(n2), blockArray[n4++]);
        }
        for (n2 = list.size() - 1; n2 >= 0; --n2) {
            w2.c(list.get(n2), blockArray[n4++]);
        }
        if (bl2) {
            w2.c(b3, Blocks.cLM);
            w2.c(b2, this);
        }
        return true;
    }

    @Override
    public IBlockState g(IBlockState iBlockState) {
        return this.xM().a(aXu, ao.dwr);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aXu, BlockPistonBase.aQ(n2)).a(aXv, (n2 & 8) > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aXu).OY();
        if (iBlockState.b(aXv).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aXu, aXv);
    }
}

