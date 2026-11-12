/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.util.ad;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockCactus
extends Block {
    public static final PropertyInteger aTo = PropertyInteger.e("age", 0, 15);

    protected BlockCactus() {
        super(Material.beO);
        this.h(this.aSG.zS().a(aTo, 0));
        this.O(true);
        this.a(a.cpy);
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        b b3 = b2.aqX();
        if (w2.aG(b3)) {
            int n2 = 1;
            while (w2.L(b2.hr(n2)).df() == this) {
                ++n2;
            }
            if (n2 < 3) {
                int n3 = iBlockState.b(aTo);
                if (n3 == 15) {
                    w2.d(b3, this.xM());
                    IBlockState iBlockState2 = iBlockState.a(aTo, 0);
                    w2.a(b2, iBlockState2, 4);
                    this.a(w2, b3, iBlockState2, this);
                } else {
                    w2.a(b2, iBlockState.a(aTo, n3 + 1), 4);
                }
            }
        }
    }

    @Override
    public net.minecraft.util.a a(w w2, b b2, IBlockState iBlockState) {
        float f2 = 0.0625f;
        return new net.minecraft.util.a((float)b2.wt() + 0.0625f, b2.wu(), (float)b2.wx() + 0.0625f, (float)(b2.wt() + 1) - 0.0625f, (float)(b2.wu() + 1) - 0.0625f, (float)(b2.wx() + 1) - 0.0625f);
    }

    @Override
    public net.minecraft.util.a c(w w2, b b2) {
        float f2 = 0.0625f;
        return new net.minecraft.util.a((float)b2.wt() + 0.0625f, b2.wu(), (float)b2.wx() + 0.0625f, (float)(b2.wt() + 1) - 0.0625f, b2.wu() + 1, (float)(b2.wx() + 1) - 0.0625f);
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
    public boolean d(w w2, b b2) {
        return super.d(w2, b2) && this.p(w2, b2);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!this.p(w2, b2)) {
            w2.c(b2, true);
        }
    }

    public boolean p(w w2, b b2) {
        for (ao ao2 : ar.dwT) {
            if (!w2.L(b2.x(ao2)).df().xb().zw()) continue;
            return false;
        }
        Block block = w2.L(b2.aqY()).df();
        return block == Blocks.cMM || block == Blocks.cLo;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, c c2) {
        c2.a(ad.dvi, 1.0f);
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTo, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aTo);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTo);
    }
}

