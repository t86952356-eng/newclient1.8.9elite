/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockLog$EnumAxis;
import net.minecraft.block.BlockNewLog$1;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.item.co;
import net.minecraft.item.d;

public class BlockNewLog
extends BlockLog {
    public static final PropertyEnum<BlockPlanks$EnumType> aXh = PropertyEnum.a("variant", BlockPlanks$EnumType.class, new BlockNewLog$1());

    public BlockNewLog() {
        this.h(this.aSG.zS().a(aXh, BlockPlanks$EnumType.aXN).a(aWW, BlockLog$EnumAxis.aWZ));
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        BlockPlanks$EnumType blockPlanks$EnumType = iBlockState.b(aXh);
        switch ((BlockLog$EnumAxis)iBlockState.b(aWW)) {
            default: {
                switch (blockPlanks$EnumType) {
                    default: {
                        return MapColor.bdN;
                    }
                    case aXO: 
                }
                return BlockPlanks$EnumType.aXO.yB();
            }
            case aWZ: 
        }
        return blockPlanks$EnumType.yB();
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        list.add(new co(d2, 1, BlockPlanks$EnumType.aXN.yc() - 4));
        list.add(new co(d2, 1, BlockPlanks$EnumType.aXO.yc() - 4));
    }

    @Override
    public IBlockState aM(int n2) {
        IBlockState iBlockState = this.xM().a(aXh, BlockPlanks$EnumType.bd((n2 & 3) + 4));
        switch (n2 & 0xC) {
            case 0: {
                iBlockState = iBlockState.a(aWW, BlockLog$EnumAxis.aWZ);
                break;
            }
            case 4: {
                iBlockState = iBlockState.a(aWW, BlockLog$EnumAxis.aWY);
                break;
            }
            case 8: {
                iBlockState = iBlockState.a(aWW, BlockLog$EnumAxis.aXa);
                break;
            }
            default: {
                iBlockState = iBlockState.a(aWW, BlockLog$EnumAxis.aXb);
            }
        }
        return iBlockState;
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aXh).yc() - 4;
        switch ((BlockLog$EnumAxis)iBlockState.b(aWW)) {
            case aWY: {
                n2 |= 4;
                break;
            }
            case aXa: {
                n2 |= 8;
                break;
            }
            case aXb: {
                n2 |= 0xC;
            }
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aXh, aWW);
    }

    @Override
    protected co f(IBlockState iBlockState) {
        return new co(d.I(this), 1, iBlockState.b(aXh).yc() - 4);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(aXh).yc() - 4;
    }
}

