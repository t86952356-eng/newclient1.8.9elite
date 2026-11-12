/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class an
implements aj<a> {
    private b ddy;
    private IBlockState cnK;

    public an() {
    }

    public an(w w2, b b2) {
        this.ddy = b2;
        this.cnK = w2.L(b2);
    }

    @Override
    public void a(ak ak2) {
        this.ddy = ak2.afu();
        this.cnK = Block.aRW.hS(ak2.afw());
    }

    @Override
    public void b(ak ak2) {
        ak2.ak(this.ddy);
        ak2.gr(Block.aRW.x(this.cnK));
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public IBlockState yU() {
        return this.cnK;
    }

    public b ahk() {
        return this.ddy;
    }
}

