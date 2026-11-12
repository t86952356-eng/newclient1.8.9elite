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
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockCake
extends Block {
    public static final PropertyInteger aTp = PropertyInteger.e("bites", 0, 6);

    protected BlockCake() {
        super(Material.beT);
        this.h(this.aSG.zS().a(aTp, 0));
        this.O(true);
    }

    @Override
    public void c(l l2, b b2) {
        float f2 = 0.0625f;
        float f3 = (float)(1 + l2.L(b2).b(aTp) * 2) / 16.0f;
        float f4 = 0.5f;
        this.a(f3, 0.0f, 0.0625f, 0.9375f, 0.5f, 0.9375f);
    }

    @Override
    public void xx() {
        float f2 = 0.0625f;
        float f3 = 0.5f;
        this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.5f, 0.9375f);
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        float f2 = 0.0625f;
        float f3 = (float)(1 + iBlockState.b(aTp) * 2) / 16.0f;
        float f4 = 0.5f;
        return new a((float)b2.wt() + f3, b2.wu(), (float)b2.wx() + 0.0625f, (float)(b2.wt() + 1) - 0.0625f, (float)b2.wu() + 0.5f, (float)(b2.wx() + 1) - 0.0625f);
    }

    @Override
    public a c(w w2, b b2) {
        return this.a(w2, b2, w2.L(b2));
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
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        this.b(w2, b2, iBlockState, a2);
        return true;
    }

    @Override
    public void a(w w2, b b2, net.minecraft.entity.player.a a2) {
        this.b(w2, b2, w2.L(b2), a2);
    }

    private void b(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2) {
        if (a2.bJ(false)) {
            a2.a(n.dqi);
            a2.abY().h(2, 0.1f);
            int n2 = iBlockState.b(aTp);
            if (n2 < 6) {
                w2.a(b2, iBlockState.a(aTp, n2 + 1), 3);
            } else {
                w2.aL(b2);
            }
        }
    }

    @Override
    public boolean d(w w2, b b2) {
        return super.d(w2, b2) && this.p(w2, b2);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!this.p(w2, b2)) {
            w2.aL(b2);
        }
    }

    private boolean p(w w2, b b2) {
        return w2.L(b2.aqY()).df().xb().zw();
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return null;
    }

    @Override
    public d e(w w2, b b2) {
        return Items.cRd;
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTp, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aTp);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTp);
    }

    @Override
    public int h(w w2, b b2) {
        return (7 - w2.L(b2).b(aTp)) * 2;
    }

    @Override
    public boolean xJ() {
        return true;
    }
}

