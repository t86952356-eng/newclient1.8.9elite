/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.BlockRailPowered$1;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockRailPowered
extends BlockRailBase {
    public static final PropertyEnum<BlockRailBase$EnumRailDirection> aZn = PropertyEnum.a("shape", BlockRailBase$EnumRailDirection.class, new BlockRailPowered$1());
    public static final PropertyBool aZo = PropertyBool.cs("powered");

    protected BlockRailPowered() {
        super(true);
        this.h(this.aSG.zS().a(aZn, BlockRailBase$EnumRailDirection.aYQ).a(aZo, false));
    }

    protected boolean a(w w2, b b2, IBlockState iBlockState, boolean bl2, int n2) {
        if (n2 >= 8) {
            return false;
        }
        int n3 = b2.wt();
        int n4 = b2.wu();
        int n5 = b2.wx();
        boolean bl3 = true;
        BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection = iBlockState.b(aZn);
        switch (blockRailBase$EnumRailDirection) {
            case aYQ: {
                if (bl2) {
                    ++n5;
                    break;
                }
                --n5;
                break;
            }
            case aYR: {
                if (bl2) {
                    --n3;
                    break;
                }
                ++n3;
                break;
            }
            case aYS: {
                if (bl2) {
                    --n3;
                } else {
                    ++n3;
                    ++n4;
                    bl3 = false;
                }
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYR;
                break;
            }
            case aYT: {
                if (bl2) {
                    --n3;
                    ++n4;
                    bl3 = false;
                } else {
                    ++n3;
                }
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYR;
                break;
            }
            case aYU: {
                if (bl2) {
                    ++n5;
                } else {
                    --n5;
                    ++n4;
                    bl3 = false;
                }
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYQ;
                break;
            }
            case aYV: {
                if (bl2) {
                    ++n5;
                    ++n4;
                    bl3 = false;
                } else {
                    --n5;
                }
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYQ;
            }
        }
        return this.a(w2, new b(n3, n4, n5), bl2, n2, blockRailBase$EnumRailDirection) || bl3 && this.a(w2, new b(n3, n4 - 1, n5), bl2, n2, blockRailBase$EnumRailDirection);
    }

    protected boolean a(w w2, b b2, boolean bl2, int n2, BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection) {
        IBlockState iBlockState = w2.L(b2);
        if (iBlockState.df() != this) {
            return false;
        }
        BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection2 = iBlockState.b(aZn);
        return (blockRailBase$EnumRailDirection != BlockRailBase$EnumRailDirection.aYR || blockRailBase$EnumRailDirection2 != BlockRailBase$EnumRailDirection.aYQ && blockRailBase$EnumRailDirection2 != BlockRailBase$EnumRailDirection.aYU && blockRailBase$EnumRailDirection2 != BlockRailBase$EnumRailDirection.aYV) && (blockRailBase$EnumRailDirection != BlockRailBase$EnumRailDirection.aYQ || blockRailBase$EnumRailDirection2 != BlockRailBase$EnumRailDirection.aYR && blockRailBase$EnumRailDirection2 != BlockRailBase$EnumRailDirection.aYS && blockRailBase$EnumRailDirection2 != BlockRailBase$EnumRailDirection.aYT) && iBlockState.b(aZo) != false && (w2.bb(b2) || this.a(w2, b2, iBlockState, bl2, n2 + 1));
    }

    @Override
    protected void b(w w2, b b2, IBlockState iBlockState, Block block) {
        boolean bl2;
        boolean bl3 = iBlockState.b(aZo);
        boolean bl4 = bl2 = w2.bb(b2) || this.a(w2, b2, iBlockState, true, 0) || this.a(w2, b2, iBlockState, false, 0);
        if (bl2 != bl3) {
            w2.a(b2, iBlockState.a(aZo, bl2), 3);
            w2.c(b2.aqY(), this);
            if (iBlockState.b(aZn).yQ()) {
                w2.c(b2.aqX(), this);
            }
        }
    }

    @Override
    public IProperty<BlockRailBase$EnumRailDirection> yP() {
        return aZn;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aZn, BlockRailBase$EnumRailDirection.bg(n2 & 7)).a(aZo, (n2 & 8) > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aZn).yc();
        if (iBlockState.b(aZo).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aZn, aZo);
    }
}

