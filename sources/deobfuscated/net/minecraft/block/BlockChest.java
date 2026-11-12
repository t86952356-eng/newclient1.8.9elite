/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.j;
import net.minecraft.entity.r;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ah;
import net.minecraft.inventory.ai;
import net.minecraft.item.co;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.m;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.ar;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.l;
import net.minecraft.world.n;
import net.minecraft.world.w;

public class BlockChest
extends BlockContainer {
    public static final PropertyDirection aTs = PropertyDirection.a("facing", ar.dwT);
    public final int aTt;

    protected BlockChest(int n2) {
        super(Material.ber);
        this.h(this.aSG.zS().a(aTs, ao.dws));
        this.aTt = n2;
        this.a(net.minecraft.creativetab.a.cpy);
        this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
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
    public int xg() {
        return 2;
    }

    @Override
    public void c(l l2, b b2) {
        if (l2.L(b2.aqZ()).df() == this) {
            this.a(0.0625f, 0.0f, 0.0f, 0.9375f, 0.875f, 0.9375f);
        } else if (l2.L(b2.ara()).df() == this) {
            this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 1.0f);
        } else if (l2.L(b2.arb()).df() == this) {
            this.a(0.0f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        } else if (l2.L(b2.arc()).df() == this) {
            this.a(0.0625f, 0.0f, 0.0625f, 1.0f, 0.875f, 0.9375f);
        } else {
            this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        this.i(w2, b2, iBlockState);
        for (ao ao2 : ar.dwT) {
            b b3 = b2.x(ao2);
            IBlockState iBlockState2 = w2.L(b3);
            if (iBlockState2.df() != this) continue;
            this.i(w2, b3, iBlockState2);
        }
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return this.xM().a(aTs, r2.Uq());
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, r r2, co co2) {
        d d2;
        boolean bl2;
        ao ao2 = ao.hz(bt.aF((double)(r2.pl * 4.0f / 360.0f) + 0.5) & 3).asC();
        iBlockState = iBlockState.a(aTs, ao2);
        b b3 = b2.aqZ();
        b b4 = b2.ara();
        b b5 = b2.arb();
        b b6 = b2.arc();
        boolean bl3 = this == w2.L(b3).df();
        boolean bl4 = this == w2.L(b4).df();
        boolean bl5 = this == w2.L(b5).df();
        boolean bl6 = bl2 = this == w2.L(b6).df();
        if (!(bl3 || bl4 || bl5 || bl2)) {
            w2.a(b2, iBlockState, 3);
        } else if (ao2.asL() != ap.dwH || !bl3 && !bl4) {
            if (ao2.asL() == ap.dwJ && (bl5 || bl2)) {
                if (bl5) {
                    w2.a(b5, iBlockState, 3);
                } else {
                    w2.a(b6, iBlockState, 3);
                }
                w2.a(b2, iBlockState, 3);
            }
        } else {
            if (bl3) {
                w2.a(b3, iBlockState, 3);
            } else {
                w2.a(b4, iBlockState, 3);
            }
            w2.a(b2, iBlockState, 3);
        }
        if (co2.aen() && (d2 = w2.K(b2)) instanceof m) {
            ((m)d2).es(co2.getDisplayName());
        }
    }

    public IBlockState i(w w2, b b2, IBlockState iBlockState) {
        if (w2.dDw) {
            return iBlockState;
        }
        IBlockState iBlockState2 = w2.L(b2.aqZ());
        IBlockState iBlockState3 = w2.L(b2.ara());
        IBlockState iBlockState4 = w2.L(b2.arb());
        IBlockState iBlockState5 = w2.L(b2.arc());
        ao ao2 = iBlockState.b(aTs);
        Block block = iBlockState2.df();
        Block block2 = iBlockState3.df();
        Block block3 = iBlockState4.df();
        Block block4 = iBlockState5.df();
        if (block != this && block2 != this) {
            boolean bl2 = block.isFullBlock();
            boolean bl3 = block2.isFullBlock();
            if (block3 == this || block4 == this) {
                b b3 = block3 == this ? b2.arb() : b2.arc();
                IBlockState iBlockState6 = w2.L(b3.aqZ());
                IBlockState iBlockState7 = w2.L(b3.ara());
                ao2 = ao.dwt;
                ao ao3 = block3 == this ? iBlockState4.b(aTs) : iBlockState5.b(aTs);
                if (ao3 == ao.dws) {
                    ao2 = ao.dws;
                }
                Block block5 = iBlockState6.df();
                Block block6 = iBlockState7.df();
                if ((bl2 || block5.isFullBlock()) && !bl3 && !block6.isFullBlock()) {
                    ao2 = ao.dwt;
                }
                if ((bl3 || block6.isFullBlock()) && !bl2 && !block5.isFullBlock()) {
                    ao2 = ao.dws;
                }
            }
        } else {
            b b4 = block == this ? b2.aqZ() : b2.ara();
            IBlockState iBlockState8 = w2.L(b4.arb());
            IBlockState iBlockState9 = w2.L(b4.arc());
            ao2 = ao.dwv;
            ao ao4 = block == this ? iBlockState2.b(aTs) : iBlockState3.b(aTs);
            if (ao4 == ao.dwu) {
                ao2 = ao.dwu;
            }
            Block block7 = iBlockState8.df();
            Block block8 = iBlockState9.df();
            if ((block3.isFullBlock() || block7.isFullBlock()) && !block4.isFullBlock() && !block8.isFullBlock()) {
                ao2 = ao.dwv;
            }
            if ((block4.isFullBlock() || block8.isFullBlock()) && !block3.isFullBlock() && !block7.isFullBlock()) {
                ao2 = ao.dwu;
            }
        }
        iBlockState = iBlockState.a(aTs, ao2);
        w2.a(b2, iBlockState, 3);
        return iBlockState;
    }

    public IBlockState j(w w2, b b2, IBlockState iBlockState) {
        ao ao2 = null;
        for (ao ao3 : ar.dwT) {
            IBlockState iBlockState2 = w2.L(b2.x(ao3));
            if (iBlockState2.df() == this) {
                return iBlockState;
            }
            if (!iBlockState2.df().isFullBlock()) continue;
            if (ao2 != null) {
                ao2 = null;
                break;
            }
            ao2 = ao3;
        }
        if (ao2 != null) {
            return iBlockState.a(aTs, ao2.asC());
        }
        Object object = iBlockState.b(aTs);
        if (w2.L(b2.x((ao)object)).df().isFullBlock()) {
            object = ((ao)object).asC();
        }
        if (w2.L(b2.x((ao)object)).df().isFullBlock()) {
            object = ((ao)object).asD();
        }
        if (w2.L(b2.x((ao)object)).df().isFullBlock()) {
            object = ((ao)object).asC();
        }
        return iBlockState.a(aTs, object);
    }

    @Override
    public boolean d(w w2, b b2) {
        int n2 = 0;
        b b3 = b2.arb();
        b b4 = b2.arc();
        b b5 = b2.aqZ();
        b b6 = b2.ara();
        if (w2.L(b3).df() == this) {
            if (this.q(w2, b3)) {
                return false;
            }
            ++n2;
        }
        if (w2.L(b4).df() == this) {
            if (this.q(w2, b4)) {
                return false;
            }
            ++n2;
        }
        if (w2.L(b5).df() == this) {
            if (this.q(w2, b5)) {
                return false;
            }
            ++n2;
        }
        if (w2.L(b6).df() == this) {
            if (this.q(w2, b6)) {
                return false;
            }
            ++n2;
        }
        return n2 <= 1;
    }

    private boolean q(w w2, b b2) {
        if (w2.L(b2).df() != this) {
            return false;
        }
        for (ao ao2 : ar.dwT) {
            if (w2.L(b2.x(ao2)).df() != this) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        super.a(w2, b2, iBlockState, block);
        d d2 = w2.K(b2);
        if (d2 instanceof m) {
            d2.apU();
        }
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        d d2 = w2.K(b2);
        if (d2 instanceof ab) {
            ah.a(w2, b2, (ab)((Object)d2));
            w2.f(b2, this);
        }
        super.d(w2, b2, iBlockState);
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (w2.dDw) {
            return true;
        }
        n n2 = this.r(w2, b2);
        if (n2 != null) {
            a2.a(n2);
            if (this.aTt == 0) {
                a2.a(net.minecraft.stats.n.dqB);
            } else if (this.aTt == 1) {
                a2.a(net.minecraft.stats.n.dqv);
            }
        }
        return true;
    }

    public n r(w w2, b b2) {
        d d2 = w2.K(b2);
        if (!(d2 instanceof m)) {
            return null;
        }
        n n2 = (m)d2;
        if (this.s(w2, b2)) {
            return null;
        }
        for (ao ao2 : ar.dwT) {
            b b3 = b2.x(ao2);
            Block block = w2.L(b3).df();
            if (block != this) continue;
            if (this.s(w2, b3)) {
                return null;
            }
            d d3 = w2.K(b3);
            if (!(d3 instanceof m)) continue;
            if (ao2 != ao.dwu && ao2 != ao.dws) {
                n2 = new ai("container.chestDouble", n2, (m)d3);
                continue;
            }
            n2 = new ai("container.chestDouble", (m)d3, n2);
        }
        return n2;
    }

    @Override
    public d a(w w2, int n2) {
        return new m();
    }

    @Override
    public boolean xw() {
        return this.aTt == 1;
    }

    @Override
    public int a(l l2, b b2, IBlockState iBlockState, ao ao2) {
        if (!this.xw()) {
            return 0;
        }
        int n2 = 0;
        d d2 = l2.K(b2);
        if (d2 instanceof m) {
            n2 = ((m)d2).dsE;
        }
        return bt.F(n2, 0, 15);
    }

    @Override
    public int b(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return ao2 == ao.dwr ? this.a(l2, b2, iBlockState, ao2) : 0;
    }

    private boolean s(w w2, b b2) {
        return this.t(w2, b2) || this.u(w2, b2);
    }

    private boolean t(w w2, b b2) {
        return w2.L(b2.aqX()).df().xd();
    }

    private boolean u(w w2, b b2) {
        for (c c2 : w2.a(j.class, new a(b2.wt(), b2.wu() + 1, b2.wx(), b2.wt() + 1, b2.wu() + 2, b2.wx() + 1))) {
            j j2 = (j)c2;
            if (!j2.abm()) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean xJ() {
        return true;
    }

    @Override
    public int h(w w2, b b2) {
        return net.minecraft.inventory.b.c(this.r(w2, b2));
    }

    @Override
    public IBlockState aM(int n2) {
        ao ao2 = ao.hy(n2);
        if (ao2.asL() == ap.dwI) {
            ao2 = ao.dws;
        }
        return this.xM().a(aTs, ao2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aTs).OY();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTs);
    }
}

