/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.b;
import net.minecraft.util.cr;
import net.minecraft.world.gen.feature.ae;
import net.minecraft.world.gen.feature.aj;
import net.minecraft.world.gen.feature.al;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.gen.feature.c;
import net.minecraft.world.gen.feature.g;
import net.minecraft.world.gen.feature.o;
import net.minecraft.world.gen.feature.x;
import net.minecraft.world.gen.feature.y;
import net.minecraft.world.w;

public class BlockSapling
extends BlockBush
implements IGrowable {
    public static final PropertyEnum<BlockPlanks$EnumType> bat = PropertyEnum.c("type", BlockPlanks$EnumType.class);
    public static final PropertyInteger bau = PropertyInteger.e("stage", 0, 1);

    protected BlockSapling() {
        this.h(this.aSG.zS().a(bat, BlockPlanks$EnumType.aXJ).a(bau, 0));
        float f2 = 0.4f;
        this.a(0.099999994f, 0.0f, 0.099999994f, 0.9f, 0.8f, 0.9f);
        this.a(a.cpy);
    }

    @Override
    public String xA() {
        return cr.gm(this.xB() + "." + BlockPlanks$EnumType.aXJ.xB() + ".name");
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (!w2.dDw) {
            super.b(w2, b2, iBlockState, random);
            if (w2.aP(b2.aqX()) >= 9 && random.nextInt(7) == 0) {
                this.e(w2, b2, iBlockState, random);
            }
        }
    }

    public void e(w w2, b b2, IBlockState iBlockState, Random random) {
        if (iBlockState.b(bau) == 0) {
            w2.a(b2, iBlockState.c(bau), 4);
        } else {
            this.f(w2, b2, iBlockState, random);
        }
    }

    public void f(w w2, b b2, IBlockState iBlockState, Random random) {
        IBlockState iBlockState2;
        net.minecraft.world.gen.feature.a a2 = random.nextInt(10) == 0 ? new c(true) : new al(true);
        int n2 = 0;
        int n3 = 0;
        boolean bl2 = false;
        switch (iBlockState.b(bat)) {
            case aXK: {
                block7: for (n2 = 0; n2 >= -1; --n2) {
                    for (n3 = 0; n3 >= -1; --n3) {
                        if (!this.a(w2, b2, n2, n3, BlockPlanks$EnumType.aXK)) continue;
                        a2 = new y(false, random.nextBoolean());
                        bl2 = true;
                        break block7;
                    }
                }
                if (bl2) break;
                n3 = 0;
                n2 = 0;
                a2 = new aj(true);
                break;
            }
            case aXL: {
                a2 = new o(true, false);
                break;
            }
            case aXM: {
                iBlockState2 = Blocks.cLt.xM().a(BlockOldLog.aXm, BlockPlanks$EnumType.aXM);
                IBlockState iBlockState3 = Blocks.cLv.xM().a(BlockOldLeaf.aXl, BlockPlanks$EnumType.aXM).a(BlockLeaves.aWz, false);
                block9: for (n2 = 0; n2 >= -1; --n2) {
                    for (n3 = 0; n3 >= -1; --n3) {
                        if (!this.a(w2, b2, n2, n3, BlockPlanks$EnumType.aXM)) continue;
                        a2 = new x(true, 10, 20, iBlockState2, iBlockState3);
                        bl2 = true;
                        break block9;
                    }
                }
                if (bl2) break;
                n3 = 0;
                n2 = 0;
                a2 = new al(true, 4 + random.nextInt(7), iBlockState2, iBlockState3, false);
                break;
            }
            case aXN: {
                a2 = new ae(true);
                break;
            }
            case aXO: {
                block11: for (n2 = 0; n2 >= -1; --n2) {
                    for (n3 = 0; n3 >= -1; --n3) {
                        if (!this.a(w2, b2, n2, n3, BlockPlanks$EnumType.aXO)) continue;
                        a2 = new g(true);
                        bl2 = true;
                        break block11;
                    }
                }
                if (bl2) break;
                return;
            }
        }
        iBlockState2 = Blocks.cLc.xM();
        if (bl2) {
            w2.a(b2.C(n2, 0, n3), iBlockState2, 4);
            w2.a(b2.C(n2 + 1, 0, n3), iBlockState2, 4);
            w2.a(b2.C(n2, 0, n3 + 1), iBlockState2, 4);
            w2.a(b2.C(n2 + 1, 0, n3 + 1), iBlockState2, 4);
        } else {
            w2.a(b2, iBlockState2, 4);
        }
        if (!((ao)a2).b(w2, random, b2.C(n2, 0, n3))) {
            if (bl2) {
                w2.a(b2.C(n2, 0, n3), iBlockState, 4);
                w2.a(b2.C(n2 + 1, 0, n3), iBlockState, 4);
                w2.a(b2.C(n2, 0, n3 + 1), iBlockState, 4);
                w2.a(b2.C(n2 + 1, 0, n3 + 1), iBlockState, 4);
            } else {
                w2.a(b2, iBlockState, 4);
            }
        }
    }

    private boolean a(w w2, b b2, int n2, int n3, BlockPlanks$EnumType blockPlanks$EnumType) {
        return this.a(w2, b2.C(n2, 0, n3), blockPlanks$EnumType) && this.a(w2, b2.C(n2 + 1, 0, n3), blockPlanks$EnumType) && this.a(w2, b2.C(n2, 0, n3 + 1), blockPlanks$EnumType) && this.a(w2, b2.C(n2 + 1, 0, n3 + 1), blockPlanks$EnumType);
    }

    public boolean a(w w2, b b2, BlockPlanks$EnumType blockPlanks$EnumType) {
        IBlockState iBlockState = w2.L(b2);
        return iBlockState.df() == this && iBlockState.b(bat) == blockPlanks$EnumType;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(bat).yc();
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (BlockPlanks$EnumType blockPlanks$EnumType : BlockPlanks$EnumType.values()) {
            list.add(new co(d2, 1, blockPlanks$EnumType.yc()));
        }
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, boolean bl2) {
        return true;
    }

    @Override
    public boolean a(w w2, Random random, b b2, IBlockState iBlockState) {
        return (double)w2.dDk.nextFloat() < 0.45;
    }

    @Override
    public void b(w w2, Random random, b b2, IBlockState iBlockState) {
        this.e(w2, b2, iBlockState, random);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(bat, BlockPlanks$EnumType.bd(n2 & 7)).a(bau, (n2 & 8) >> 3);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(bat).yc();
        return n2 |= iBlockState.b(bau) << 3;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bat, bau);
    }
}

