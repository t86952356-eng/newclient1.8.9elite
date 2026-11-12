/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public abstract class BlockRedstoneDiode
extends BlockDirectional {
    protected final boolean aZG;

    protected BlockRedstoneDiode(boolean bl2) {
        super(Material.beE);
        this.aZG = bl2;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public boolean d(w w2, b b2) {
        return w.v(w2, b2.aqY()) && super.d(w2, b2);
    }

    public boolean p(w w2, b b2) {
        return w.v(w2, b2.aqY());
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Random random) {
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (!this.b((l)w2, b2, iBlockState)) {
            boolean bl2 = this.y(w2, b2, iBlockState);
            if (this.aZG && !bl2) {
                w2.a(b2, this.s(iBlockState), 2);
            } else if (!this.aZG) {
                w2.a(b2, this.r(iBlockState), 2);
                if (!bl2) {
                    w2.a(b2, this.r(iBlockState).df(), this.u(iBlockState), -1);
                }
            }
        }
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        return ao2.asL() != ap.dwI;
    }

    protected boolean t(IBlockState iBlockState) {
        return this.aZG;
    }

    @Override
    public int b(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return this.a(l2, b2, iBlockState, ao2);
    }

    @Override
    public int a(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return !this.t(iBlockState) ? 0 : (iBlockState.b(aTB) == ao2 ? this.a(l2, b2, iBlockState) : 0);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (this.p(w2, b2)) {
            this.r(w2, b2, iBlockState);
        } else {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
            for (ao ao2 : ao.values()) {
                w2.c(b2.x(ao2), this);
            }
        }
    }

    protected void r(w w2, b b2, IBlockState iBlockState) {
        if (!this.b((l)w2, b2, iBlockState)) {
            boolean bl2 = this.y(w2, b2, iBlockState);
            if ((this.aZG && !bl2 || !this.aZG && bl2) && !w2.e(b2, this)) {
                int n2 = -1;
                if (this.C(w2, b2, iBlockState)) {
                    n2 = -3;
                } else if (this.aZG) {
                    n2 = -2;
                }
                w2.a(b2, this, this.q(iBlockState), n2);
            }
        }
    }

    public boolean b(l l2, b b2, IBlockState iBlockState) {
        return false;
    }

    protected boolean y(w w2, b b2, IBlockState iBlockState) {
        return this.z(w2, b2, iBlockState) > 0;
    }

    protected int z(w w2, b b2, IBlockState iBlockState) {
        ao ao2 = iBlockState.b(aTB);
        b b3 = b2.x(ao2);
        int n2 = w2.k(b3, ao2);
        if (n2 >= 15) {
            return n2;
        }
        IBlockState iBlockState2 = w2.L(b3);
        return Math.max(n2, iBlockState2.df() == Blocks.cMh ? iBlockState2.b(BlockRedstoneWire.aZR) : 0);
    }

    protected int c(l l2, b b2, IBlockState iBlockState) {
        ao ao2 = iBlockState.b(aTB);
        ao ao3 = ao2.asD();
        ao ao4 = ao2.asG();
        return Math.max(this.c(l2, b2.x(ao3), ao3), this.c(l2, b2.x(ao4), ao4));
    }

    protected int c(l l2, b b2, ao ao2) {
        IBlockState iBlockState = l2.L(b2);
        Block block = iBlockState.df();
        return this.q(block) ? (block == Blocks.cMh ? iBlockState.b(BlockRedstoneWire.aZR).intValue() : l2.i(b2, ao2)) : 0;
    }

    @Override
    public boolean xw() {
        return true;
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return this.xM().a(aTB, r2.Uq().asC());
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, r r2, co co2) {
        if (this.y(w2, b2, iBlockState)) {
            w2.a(b2, (Block)this, 1);
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        this.B(w2, b2, iBlockState);
    }

    protected void B(w w2, b b2, IBlockState iBlockState) {
        ao ao2 = iBlockState.b(aTB);
        b b3 = b2.x(ao2.asC());
        w2.d(b3, this);
        w2.a(b3, (Block)this, ao2);
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState) {
        if (this.aZG) {
            for (ao ao2 : ao.values()) {
                w2.c(b2.x(ao2), this);
            }
        }
        super.b(w2, b2, iBlockState);
    }

    @Override
    public boolean xk() {
        return false;
    }

    protected boolean q(Block block) {
        return block.xw();
    }

    protected int a(l l2, b b2, IBlockState iBlockState) {
        return 15;
    }

    public static boolean r(Block block) {
        return Blocks.cNd.s(block) || Blocks.cOl.s(block);
    }

    public boolean s(Block block) {
        return block == this.r(this.xM()).df() || block == this.s(this.xM()).df();
    }

    public boolean C(w w2, b b2, IBlockState iBlockState) {
        ao ao2 = iBlockState.b(aTB).asC();
        b b3 = b2.x(ao2);
        return BlockRedstoneDiode.r(w2.L(b3).df()) && w2.L(b3).b(aTB) != ao2;
    }

    protected int u(IBlockState iBlockState) {
        return this.q(iBlockState);
    }

    protected abstract int q(IBlockState var1);

    protected abstract IBlockState r(IBlockState var1);

    protected abstract IBlockState s(IBlockState var1);

    @Override
    public boolean j(Block block) {
        return this.s(block);
    }

    @Override
    public av xo() {
        return av.dxX;
    }
}

