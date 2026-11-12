/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 */
package net.minecraft.block;

import com.google.common.base.Objects;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTripWire;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockTripWireHook
extends Block {
    public static final PropertyDirection bcX = PropertyDirection.a("facing", ar.dwT);
    public static final PropertyBool bcY = PropertyBool.cs("powered");
    public static final PropertyBool bcZ = PropertyBool.cs("attached");
    public static final PropertyBool bda = PropertyBool.cs("suspended");

    public BlockTripWireHook() {
        super(Material.beE);
        this.h(this.aSG.zS().a(bcX, ao.dws).a(bcY, false).a(bcZ, false).a(bda, false));
        this.a(a.cpz);
        this.O(true);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        return iBlockState.a(bda, !w.v(l2, b2.aqY()));
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
        return ao2.asL().asP() && w2.L(b2.x(ao2.asC())).df().xd();
    }

    @Override
    public boolean d(w w2, b b2) {
        for (ao ao2 : ar.dwT) {
            if (!w2.L(b2.x(ao2)).df().xd()) continue;
            return true;
        }
        return false;
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        IBlockState iBlockState = this.xM().a(bcY, false).a(bcZ, false).a(bda, false);
        if (ao2.asL().asP()) {
            iBlockState = iBlockState.a(bcX, ao2);
        }
        return iBlockState;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, r r2, co co2) {
        this.a(w2, b2, iBlockState, false, false, -1, null);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        ao ao2;
        if (block != this && this.g(w2, b2, iBlockState) && !w2.L(b2.x((ao2 = iBlockState.b(bcX)).asC())).df().xd()) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
        }
    }

    public void a(w w2, b b2, IBlockState iBlockState, boolean bl2, boolean bl3, int n2, IBlockState iBlockState2) {
        Object object;
        b b3;
        ao ao2 = iBlockState.b(bcX);
        boolean bl4 = iBlockState.b(bcZ);
        boolean bl5 = iBlockState.b(bcY);
        boolean bl6 = !w.v(w2, b2.aqY());
        boolean bl7 = !bl2;
        boolean bl8 = false;
        int n3 = 0;
        IBlockState[] iBlockStateArray = new IBlockState[42];
        for (int i2 = 1; i2 < 42; ++i2) {
            b3 = b2.d(ao2, i2);
            object = w2.L(b3);
            if (object.df() == Blocks.cNT) {
                if (object.b(bcX) != ao2.asC()) break;
                n3 = i2;
                break;
            }
            if (object.df() != Blocks.cNU && i2 != n2) {
                iBlockStateArray[i2] = null;
                bl7 = false;
                continue;
            }
            if (i2 == n2) {
                object = (IBlockState)Objects.firstNonNull((Object)iBlockState2, (Object)object);
            }
            boolean bl9 = object.b(BlockTripWire.bcS) == false;
            boolean bl10 = object.b(BlockTripWire.bcP);
            boolean bl11 = object.b(BlockTripWire.bcQ);
            bl7 &= bl11 == bl6;
            bl8 |= bl9 && bl10;
            iBlockStateArray[i2] = object;
            if (i2 != n2) continue;
            w2.a(b2, (Block)this, this.c(w2));
            bl7 &= bl9;
        }
        IBlockState iBlockState3 = this.xM().a(bcZ, bl7).a(bcY, bl8 &= (bl7 &= n3 > 1));
        if (n3 > 0) {
            b3 = b2.d(ao2, n3);
            object = ao2.asC();
            w2.a(b3, iBlockState3.a(bcX, object), 3);
            this.i(w2, b3, (ao)object);
            this.a(w2, b3, bl7, bl8, bl4, bl5);
        }
        this.a(w2, b2, bl7, bl8, bl4, bl5);
        if (!bl2) {
            w2.a(b2, iBlockState3.a(bcX, ao2), 3);
            if (bl3) {
                this.i(w2, b2, ao2);
            }
        }
        if (bl4 != bl7) {
            for (int i3 = 1; i3 < n3; ++i3) {
                object = b2.d(ao2, i3);
                IBlockState iBlockState4 = iBlockStateArray[i3];
                if (iBlockState4 == null || w2.L((b)object).df() == Blocks.cLc) continue;
                w2.a((b)object, iBlockState4.a(bcZ, bl7), 3);
            }
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Random random) {
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        this.a(w2, b2, iBlockState, false, true, -1, null);
    }

    private void a(w w2, b b2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        if (bl3 && !bl5) {
            w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.1, (double)b2.wx() + 0.5, "random.click", 0.4f, 0.6f);
        } else if (!bl3 && bl5) {
            w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.1, (double)b2.wx() + 0.5, "random.click", 0.4f, 0.5f);
        } else if (bl2 && !bl4) {
            w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.1, (double)b2.wx() + 0.5, "random.click", 0.4f, 0.7f);
        } else if (!bl2 && bl4) {
            w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.1, (double)b2.wx() + 0.5, "random.bowhit", 0.4f, 1.2f / (w2.dDk.nextFloat() * 0.2f + 0.9f));
        }
    }

    private void i(w w2, b b2, ao ao2) {
        w2.c(b2, this);
        w2.c(b2.x(ao2.asC()), this);
    }

    private boolean g(w w2, b b2, IBlockState iBlockState) {
        if (!this.d(w2, b2)) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
            return false;
        }
        return true;
    }

    @Override
    public void c(l l2, b b2) {
        float f2 = 0.1875f;
        switch (l2.L(b2).b(bcX)) {
            case dwv: {
                this.a(0.0f, 0.2f, 0.3125f, 0.375f, 0.8f, 0.6875f);
                break;
            }
            case dwu: {
                this.a(0.625f, 0.2f, 0.3125f, 1.0f, 0.8f, 0.6875f);
                break;
            }
            case dwt: {
                this.a(0.3125f, 0.2f, 0.0f, 0.6875f, 0.8f, 0.375f);
                break;
            }
            case dws: {
                this.a(0.3125f, 0.2f, 0.625f, 0.6875f, 0.8f, 1.0f);
            }
        }
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        boolean bl2 = iBlockState.b(bcZ);
        boolean bl3 = iBlockState.b(bcY);
        if (bl2 || bl3) {
            this.a(w2, b2, iBlockState, true, false, -1, null);
        }
        if (bl3) {
            w2.c(b2, this);
            w2.c(b2.x(iBlockState.b(bcX).asC()), this);
        }
        super.d(w2, b2, iBlockState);
    }

    @Override
    public int a(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return iBlockState.b(bcY) != false ? 15 : 0;
    }

    @Override
    public int b(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return iBlockState.b(bcY) == false ? 0 : (iBlockState.b(bcX) == ao2 ? 15 : 0);
    }

    @Override
    public boolean xw() {
        return true;
    }

    @Override
    public av xo() {
        return av.dxW;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(bcX, ao.hz(n2 & 3)).a(bcY, (n2 & 8) > 0).a(bcZ, (n2 & 4) > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(bcX).asA();
        if (iBlockState.b(bcY).booleanValue()) {
            n2 |= 8;
        }
        if (iBlockState.b(bcZ).booleanValue()) {
            n2 |= 4;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bcX, bcY, bcZ, bda);
    }
}

