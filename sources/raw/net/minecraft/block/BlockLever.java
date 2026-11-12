/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockLever$EnumOrientation;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockLever
extends Block {
    public static final PropertyEnum<BlockLever$EnumOrientation> aWE = PropertyEnum.c("facing", BlockLever$EnumOrientation.class);
    public static final PropertyBool aWF = PropertyBool.cs("powered");

    protected BlockLever() {
        super(Material.beE);
        this.h(this.aSG.zS().a(aWE, BlockLever$EnumOrientation.aWM).a(aWF, false));
        this.a(a.cpz);
    }

    @Override
    public net.minecraft.util.a a(w w2, b b2, IBlockState iBlockState) {
        return null;
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
    public boolean a(w w2, b b2, ao ao2) {
        return BlockLever.f(w2, b2, ao2.asC());
    }

    @Override
    public boolean d(w w2, b b2) {
        for (ao ao2 : ao.values()) {
            if (!BlockLever.f(w2, b2, ao2)) continue;
            return true;
        }
        return false;
    }

    protected static boolean f(w w2, b b2, ao ao2) {
        return BlockButton.b(w2, b2, ao2);
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        IBlockState iBlockState = this.xM().a(aWF, false);
        if (BlockLever.f(w2, b2, ao2.asC())) {
            return iBlockState.a(aWE, BlockLever$EnumOrientation.a(ao2, r2.Uq()));
        }
        for (ao ao3 : ar.dwT) {
            if (ao3 == ao2 || !BlockLever.f(w2, b2, ao3.asC())) continue;
            return iBlockState.a(aWE, BlockLever$EnumOrientation.a(ao3, r2.Uq()));
        }
        if (w.v(w2, b2.aqY())) {
            return iBlockState.a(aWE, BlockLever$EnumOrientation.a(ao.dwr, r2.Uq()));
        }
        return iBlockState;
    }

    public static int c(ao ao2) {
        switch (ao2) {
            case dwq: {
                return 0;
            }
            case dwr: {
                return 5;
            }
            case dws: {
                return 4;
            }
            case dwt: {
                return 3;
            }
            case dwu: {
                return 2;
            }
            case dwv: {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (this.t(w2, b2, iBlockState) && !BlockLever.f(w2, b2, iBlockState.b(aWE).yx().asC())) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
        }
    }

    private boolean t(w w2, b b2, IBlockState iBlockState) {
        if (this.d(w2, b2)) {
            return true;
        }
        this.a(w2, b2, iBlockState, 0);
        w2.aL(b2);
        return false;
    }

    @Override
    public void c(l l2, b b2) {
        float f2 = 0.1875f;
        switch (l2.L(b2).b(aWE).ordinal()) {
            case 1: {
                this.a(0.0f, 0.2f, 0.5f - f2, f2 * 2.0f, 0.8f, 0.5f + f2);
                break;
            }
            case 2: {
                this.a(1.0f - f2 * 2.0f, 0.2f, 0.5f - f2, 1.0f, 0.8f, 0.5f + f2);
                break;
            }
            case 3: {
                this.a(0.5f - f2, 0.2f, 0.0f, 0.5f + f2, 0.8f, f2 * 2.0f);
                break;
            }
            case 4: {
                this.a(0.5f - f2, 0.2f, 1.0f - f2 * 2.0f, 0.5f + f2, 0.8f, 1.0f);
                break;
            }
            case 5: 
            case 6: {
                f2 = 0.25f;
                this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, 0.6f, 0.5f + f2);
                break;
            }
            case 0: 
            case 7: {
                f2 = 0.25f;
                this.a(0.5f - f2, 0.4f, 0.5f - f2, 0.5f + f2, 1.0f, 0.5f + f2);
            }
        }
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (w2.dDw) {
            return true;
        }
        iBlockState = iBlockState.c(aWF);
        w2.a(b2, iBlockState, 3);
        w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, "random.click", 0.3f, iBlockState.b(aWF) != false ? 0.6f : 0.5f);
        w2.c(b2, this);
        ao ao3 = iBlockState.b(aWE).yx();
        w2.c(b2.x(ao3.asC()), this);
        return true;
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        if (iBlockState.b(aWF).booleanValue()) {
            w2.c(b2, this);
            ao ao2 = iBlockState.b(aWE).yx();
            w2.c(b2.x(ao2.asC()), this);
        }
        super.d(w2, b2, iBlockState);
    }

    @Override
    public int a(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return iBlockState.b(aWF) != false ? 15 : 0;
    }

    @Override
    public int b(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return iBlockState.b(aWF) == false ? 0 : (iBlockState.b(aWE).yx() == ao2 ? 15 : 0);
    }

    @Override
    public boolean xw() {
        return true;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aWE, BlockLever$EnumOrientation.ba(n2 & 7)).a(aWF, (n2 & 8) > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aWE).yc();
        if (iBlockState.b(aWF).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aWE, aWF);
    }
}

