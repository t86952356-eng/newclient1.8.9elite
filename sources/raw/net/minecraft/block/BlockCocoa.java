/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockCocoa
extends BlockDirectional
implements IGrowable {
    public static final PropertyInteger aTu = PropertyInteger.e("age", 0, 2);

    public BlockCocoa() {
        super(Material.bey);
        this.h(this.aSG.zS().a(aTB, ao.dws).a(aTu, 0));
        this.O(true);
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        int n2;
        if (!this.f(w2, b2, iBlockState)) {
            this.k(w2, b2, iBlockState);
        } else if (w2.dDk.nextInt(5) == 0 && (n2 = iBlockState.b(aTu).intValue()) < 2) {
            w2.a(b2, iBlockState.a(aTu, n2 + 1), 2);
        }
    }

    public boolean f(w w2, b b2, IBlockState iBlockState) {
        IBlockState iBlockState2 = w2.L(b2 = b2.x(iBlockState.b(aTB)));
        return iBlockState2.df() == Blocks.cLt && iBlockState2.b(BlockPlanks.aXI) == BlockPlanks$EnumType.aXM;
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        this.c((l)w2, b2);
        return super.a(w2, b2, iBlockState);
    }

    @Override
    public a c(w w2, b b2) {
        this.c((l)w2, b2);
        return super.c(w2, b2);
    }

    @Override
    public void c(l l2, b b2) {
        IBlockState iBlockState = l2.L(b2);
        ao ao2 = iBlockState.b(aTB);
        int n2 = iBlockState.b(aTu);
        int n3 = 4 + n2 * 2;
        int n4 = 5 + n2 * 2;
        float f2 = (float)n3 / 2.0f;
        switch (ao2) {
            case dwt: {
                this.a((8.0f - f2) / 16.0f, (12.0f - (float)n4) / 16.0f, (15.0f - (float)n3) / 16.0f, (8.0f + f2) / 16.0f, 0.75f, 0.9375f);
                break;
            }
            case dws: {
                this.a((8.0f - f2) / 16.0f, (12.0f - (float)n4) / 16.0f, 0.0625f, (8.0f + f2) / 16.0f, 0.75f, (1.0f + (float)n3) / 16.0f);
                break;
            }
            case dwu: {
                this.a(0.0625f, (12.0f - (float)n4) / 16.0f, (8.0f - f2) / 16.0f, (1.0f + (float)n3) / 16.0f, 0.75f, (8.0f + f2) / 16.0f);
                break;
            }
            case dwv: {
                this.a((15.0f - (float)n3) / 16.0f, (12.0f - (float)n4) / 16.0f, (8.0f - f2) / 16.0f, 0.9375f, 0.75f, (8.0f + f2) / 16.0f);
            }
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, r r2, co co2) {
        ao ao2 = ao.aC(r2.pl);
        w2.a(b2, iBlockState.a(aTB, ao2), 2);
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        if (!ao2.asL().asP()) {
            ao2 = ao.dws;
        }
        return this.xM().a(aTB, ao2.asC()).a(aTu, 0);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!this.f(w2, b2, iBlockState)) {
            this.k(w2, b2, iBlockState);
        }
    }

    private void k(w w2, b b2, IBlockState iBlockState) {
        w2.a(b2, Blocks.cLc.xM(), 3);
        this.a(w2, b2, iBlockState, 0);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        int n3 = iBlockState.b(aTu);
        int n4 = 1;
        if (n3 >= 2) {
            n4 = 3;
        }
        for (int i2 = 0; i2 < n4; ++i2) {
            BlockCocoa.a(w2, b2, new co(Items.cRa, 1, net.minecraft.item.b.cUO.ado()));
        }
    }

    @Override
    public d e(w w2, b b2) {
        return Items.cRa;
    }

    @Override
    public int f(w w2, b b2) {
        return net.minecraft.item.b.cUO.ado();
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, boolean bl2) {
        return iBlockState.b(aTu) < 2;
    }

    @Override
    public boolean a(w w2, Random random, b b2, IBlockState iBlockState) {
        return true;
    }

    @Override
    public void b(w w2, Random random, b b2, IBlockState iBlockState) {
        w2.a(b2, iBlockState.a(aTu, iBlockState.b(aTu) + 1), 2);
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTB, ao.hz(n2)).a(aTu, (n2 & 0xF) >> 2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aTB).asA();
        return n2 |= iBlockState.b(aTu) << 2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTB, aTu);
    }
}

