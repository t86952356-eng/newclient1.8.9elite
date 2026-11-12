/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBanner;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockBanner$BlockBannerHanging
extends BlockBanner {
    public BlockBanner$BlockBannerHanging() {
        this.h(this.aSG.zS().a(aSV, ao.dws));
    }

    @Override
    public void c(l l2, b b2) {
        ao ao2 = l2.L(b2).b(aSV);
        float f2 = 0.0f;
        float f3 = 0.78125f;
        float f4 = 0.0f;
        float f5 = 1.0f;
        float f6 = 0.125f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        switch (ao2) {
            default: {
                this.a(0.0f, 0.0f, 0.875f, 1.0f, 0.78125f, 1.0f);
                break;
            }
            case dwt: {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.78125f, 0.125f);
                break;
            }
            case dwu: {
                this.a(0.875f, 0.0f, 0.0f, 1.0f, 0.78125f, 1.0f);
                break;
            }
            case dwv: {
                this.a(0.0f, 0.0f, 0.0f, 0.125f, 0.78125f, 1.0f);
            }
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        ao ao2 = iBlockState.b(aSV);
        if (!w2.L(b2.x(ao2.asC())).df().xb().zw()) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
        }
        super.a(w2, b2, iBlockState, block);
    }

    @Override
    public IBlockState aM(int n2) {
        ao ao2 = ao.hy(n2);
        if (ao2.asL() == ap.dwI) {
            ao2 = ao.dws;
        }
        return this.xM().a(aSV, ao2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aSV).OY();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aSV);
    }
}

