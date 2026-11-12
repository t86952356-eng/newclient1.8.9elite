/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockCarpet
extends Block {
    public static final PropertyEnum<net.minecraft.item.b> aTq = PropertyEnum.c("color", net.minecraft.item.b.class);

    protected BlockCarpet() {
        super(Material.beF);
        this.h(this.aSG.zS().a(aTq, net.minecraft.item.b.cUC));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
        this.O(true);
        this.a(a.cpy);
        this.aO(0);
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return iBlockState.b(aTq).lv();
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
    public void xx() {
        this.aO(0);
    }

    @Override
    public void c(l l2, b b2) {
        this.aO(0);
    }

    protected void aO(int n2) {
        boolean bl2 = false;
        float f2 = 0.0625f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
    }

    @Override
    public boolean d(w w2, b b2) {
        return super.d(w2, b2) && this.p(w2, b2);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        this.g(w2, b2, iBlockState);
    }

    private boolean g(w w2, b b2, IBlockState iBlockState) {
        if (!this.p(w2, b2)) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
            return false;
        }
        return true;
    }

    private boolean p(w w2, b b2) {
        return !w2.aG(b2.aqY());
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        return ao2 == ao.dwr || super.a(l2, b2, ao2);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(aTq).yc();
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (int i2 = 0; i2 < 16; ++i2) {
            list.add(new co(d2, 1, i2));
        }
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTq, net.minecraft.item.b.fS(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aTq).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTq);
    }
}

