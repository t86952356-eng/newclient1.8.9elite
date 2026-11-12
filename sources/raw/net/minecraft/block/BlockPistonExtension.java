/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPistonExtension$EnumPistonType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.item.d;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockPistonExtension
extends Block {
    public static final PropertyDirection aXy = PropertyDirection.ct("facing");
    public static final PropertyEnum<BlockPistonExtension$EnumPistonType> aXz = PropertyEnum.c("type", BlockPistonExtension$EnumPistonType.class);
    public static final PropertyBool aXA = PropertyBool.cs("short");

    public BlockPistonExtension() {
        super(Material.beV);
        this.h(this.aSG.zS().a(aXy, ao.dws).a(aXz, BlockPistonExtension$EnumPistonType.aXC).a(aXA, false));
        this.a(aSc);
        this.L(0.5f);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2) {
        b b3;
        Block block;
        ao ao2;
        if (a2.cIt.cJM && (ao2 = iBlockState.b(aXy)) != null && ((block = w2.L(b3 = b2.x(ao2.asC())).df()) == Blocks.cLL || block == Blocks.cLH)) {
            w2.aL(b3);
        }
        super.a(w2, b2, iBlockState, a2);
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        super.d(w2, b2, iBlockState);
        ao ao2 = iBlockState.b(aXy).asC();
        b2 = b2.x(ao2);
        IBlockState iBlockState2 = w2.L(b2);
        if ((iBlockState2.df() == Blocks.cLL || iBlockState2.df() == Blocks.cLH) && iBlockState2.b(BlockPistonBase.aXv).booleanValue()) {
            iBlockState2.df().a(w2, b2, iBlockState2, 0);
            w2.aL(b2);
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
    public boolean d(w w2, b b2) {
        return false;
    }

    @Override
    public boolean a(w w2, b b2, ao ao2) {
        return false;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, a a2, List<a> list, c c2) {
        this.n(iBlockState);
        super.a(w2, b2, iBlockState, a2, list, c2);
        this.m(iBlockState);
        super.a(w2, b2, iBlockState, a2, list, c2);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    private void m(IBlockState iBlockState) {
        float f2 = 0.25f;
        float f3 = 0.375f;
        float f4 = 0.625f;
        float f5 = 0.25f;
        float f6 = 0.75f;
        switch (iBlockState.b(aXy)) {
            case dwq: {
                this.a(0.375f, 0.25f, 0.375f, 0.625f, 1.0f, 0.625f);
                break;
            }
            case dwr: {
                this.a(0.375f, 0.0f, 0.375f, 0.625f, 0.75f, 0.625f);
                break;
            }
            case dws: {
                this.a(0.25f, 0.375f, 0.25f, 0.75f, 0.625f, 1.0f);
                break;
            }
            case dwt: {
                this.a(0.25f, 0.375f, 0.0f, 0.75f, 0.625f, 0.75f);
                break;
            }
            case dwu: {
                this.a(0.375f, 0.25f, 0.25f, 0.625f, 0.75f, 1.0f);
                break;
            }
            case dwv: {
                this.a(0.0f, 0.375f, 0.25f, 0.75f, 0.625f, 0.75f);
            }
        }
    }

    @Override
    public void c(l l2, b b2) {
        this.n(l2.L(b2));
    }

    public void n(IBlockState iBlockState) {
        float f2 = 0.25f;
        ao ao2 = iBlockState.b(aXy);
        if (ao2 != null) {
            switch (ao2) {
                case dwq: {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 1.0f);
                    break;
                }
                case dwr: {
                    this.a(0.0f, 0.75f, 0.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case dws: {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.25f);
                    break;
                }
                case dwt: {
                    this.a(0.0f, 0.0f, 0.75f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case dwu: {
                    this.a(0.0f, 0.0f, 0.0f, 0.25f, 1.0f, 1.0f);
                    break;
                }
                case dwv: {
                    this.a(0.75f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
            }
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        ao ao2 = iBlockState.b(aXy);
        b b3 = b2.x(ao2.asC());
        IBlockState iBlockState2 = w2.L(b3);
        if (iBlockState2.df() != Blocks.cLL && iBlockState2.df() != Blocks.cLH) {
            w2.aL(b2);
        } else {
            iBlockState2.df().a(w2, b3, iBlockState2, block);
        }
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        return true;
    }

    public static ao aQ(int n2) {
        int n3 = n2 & 7;
        return n3 > 5 ? null : ao.hy(n3);
    }

    @Override
    public d e(w w2, b b2) {
        return w2.L(b2).b(aXz) == BlockPistonExtension$EnumPistonType.aXD ? d.I(Blocks.cLH) : d.I(Blocks.cLL);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aXy, BlockPistonExtension.aQ(n2)).a(aXz, (n2 & 8) > 0 ? BlockPistonExtension$EnumPistonType.aXD : BlockPistonExtension$EnumPistonType.aXC);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aXy).OY();
        if (iBlockState.b(aXz) == BlockPistonExtension$EnumPistonType.aXD) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aXy, aXz, aXA);
    }
}

