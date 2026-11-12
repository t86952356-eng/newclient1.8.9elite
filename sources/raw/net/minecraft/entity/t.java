/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import net.minecraft.block.state.IBlockState;
import net.minecraft.command.server.e;
import net.minecraft.entity.item.k;
import net.minecraft.entity.item.m;
import net.minecraft.entity.player.a;
import net.minecraft.entity.u;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.bb;
import net.minecraft.world.w;

public class t
extends k {
    private final e cvn = new u(this);
    private int cvo = 0;

    public t(w w2) {
        super(w2);
    }

    public t(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4);
    }

    @Override
    protected void IA() {
        super.IA();
        this.Tp().a(23, "");
        this.Tp().a(24, "");
    }

    @Override
    protected void e(n n2) {
        super.e(n2);
        this.cvn.i(n2);
        this.Tp().b(23, this.Wo().Sy());
        this.Tp().b(24, bb.q(this.Wo().Sx()));
    }

    @Override
    protected void d(n n2) {
        super.d(n2);
        this.cvn.h(n2);
    }

    @Override
    public m Wm() {
        return m.cCM;
    }

    @Override
    public IBlockState Wn() {
        return Blocks.cNZ.xM();
    }

    public e Wo() {
        return this.cvn;
    }

    @Override
    public void b(int n2, int n3, int n4, boolean bl2) {
        if (bl2 && this.aRg - this.cvo >= 4) {
            this.Wo().h(this.baU);
            this.cvo = this.aRg;
        }
    }

    @Override
    public boolean o(a a2) {
        this.cvn.m(a2);
        return false;
    }

    @Override
    public void eA(int n2) {
        super.eA(n2);
        if (n2 == 24) {
            try {
                this.cvn.h(bb.gi(this.Tp().ep(24)));
            }
            catch (Throwable throwable) {}
        } else if (n2 == 23) {
            this.cvn.dW(this.Tp().ep(23));
        }
    }
}

