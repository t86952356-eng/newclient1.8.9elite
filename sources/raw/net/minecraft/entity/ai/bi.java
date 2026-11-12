/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.bj;
import net.minecraft.entity.item.k;
import net.minecraft.entity.item.m;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.b;
import net.minecraft.world.w;

public class bi
extends k {
    private final b cAs = new bj(this);

    public bi(w w2) {
        super(w2);
    }

    public bi(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4);
    }

    @Override
    public m Wm() {
        return m.cCK;
    }

    @Override
    public IBlockState Wn() {
        return Blocks.cMe.xM();
    }

    @Override
    protected void e(n n2) {
        super.e(n2);
        this.cAs.a(n2);
    }

    @Override
    protected void d(n n2) {
        super.d(n2);
        this.cAs.b(n2);
    }

    @Override
    public void a(byte by2) {
        this.cAs.hk(by2);
    }

    @Override
    public void Dm() {
        super.Dm();
        this.cAs.apI();
    }

    public b Xi() {
        return this.cAs;
    }
}

