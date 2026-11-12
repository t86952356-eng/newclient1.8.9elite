/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.c;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public abstract class BlockBasePressurePlate
extends Block {
    protected BlockBasePressurePlate(Material material) {
        this(material, material.zK());
    }

    protected BlockBasePressurePlate(Material material, MapColor mapColor) {
        super(material, mapColor);
        this.a(a.cpz);
        this.O(true);
    }

    @Override
    public void c(l l2, b b2) {
        this.i(l2.L(b2));
    }

    protected void i(IBlockState iBlockState) {
        boolean bl2 = this.j(iBlockState) > 0;
        float f2 = 0.0625f;
        if (bl2) {
            this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.03125f, 0.9375f);
        } else {
            this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.0625f, 0.9375f);
        }
    }

    @Override
    public int c(w w2) {
        return 20;
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
    public boolean a(l l2, b b2) {
        return true;
    }

    @Override
    public boolean xz() {
        return true;
    }

    @Override
    public boolean d(w w2, b b2) {
        return this.j(w2, b2.aqY());
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!this.j(w2, b2.aqY())) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
        }
    }

    private boolean j(w w2, b b2) {
        return w.v(w2, b2) || w2.L(b2).df() instanceof BlockFence;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Random random) {
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        int n2;
        if (!w2.dDw && (n2 = this.j(iBlockState)) > 0) {
            this.b(w2, b2, iBlockState, n2);
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, c c2) {
        int n2;
        if (!w2.dDw && (n2 = this.j(iBlockState)) == 0) {
            this.b(w2, b2, iBlockState, n2);
        }
    }

    protected void b(w w2, b b2, IBlockState iBlockState, int n2) {
        boolean bl2;
        int n3 = this.l(w2, b2);
        boolean bl3 = n2 > 0;
        boolean bl4 = bl2 = n3 > 0;
        if (n2 != n3) {
            iBlockState = this.a(iBlockState, n3);
            w2.a(b2, iBlockState, 2);
            this.k(w2, b2);
            w2.f(b2, b2);
        }
        if (!bl2 && bl3) {
            w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.1, (double)b2.wx() + 0.5, "random.click", 0.3f, 0.5f);
        } else if (bl2 && !bl3) {
            w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.1, (double)b2.wx() + 0.5, "random.click", 0.3f, 0.6f);
        }
        if (bl2) {
            w2.a(b2, (Block)this, this.c(w2));
        }
    }

    protected net.minecraft.util.a x(b b2) {
        float f2 = 0.125f;
        return new net.minecraft.util.a((float)b2.wt() + 0.125f, b2.wu(), (float)b2.wx() + 0.125f, (float)(b2.wt() + 1) - 0.125f, (double)b2.wu() + 0.25, (float)(b2.wx() + 1) - 0.125f);
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        if (this.j(iBlockState) > 0) {
            this.k(w2, b2);
        }
        super.d(w2, b2, iBlockState);
    }

    protected void k(w w2, b b2) {
        w2.c(b2, this);
        w2.c(b2.aqY(), this);
    }

    @Override
    public int a(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return this.j(iBlockState);
    }

    @Override
    public int b(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return ao2 == ao.dwr ? this.j(iBlockState) : 0;
    }

    @Override
    public boolean xw() {
        return true;
    }

    @Override
    public void xx() {
        float f2 = 0.5f;
        float f3 = 0.125f;
        float f4 = 0.5f;
        this.a(0.0f, 0.375f, 0.0f, 1.0f, 0.625f, 1.0f);
    }

    @Override
    public int xE() {
        return 1;
    }

    protected abstract int l(w var1, b var2);

    protected abstract int j(IBlockState var1);

    protected abstract IBlockState a(IBlockState var1, int var2);
}

