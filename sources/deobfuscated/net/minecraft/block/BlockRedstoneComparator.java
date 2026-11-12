/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneComparator$1;
import net.minecraft.block.BlockRedstoneComparator$Mode;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.j;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.tileentity.q;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.cr;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockRedstoneComparator
extends BlockRedstoneDiode
implements ITileEntityProvider {
    public static final PropertyBool aZz = PropertyBool.cs("powered");
    public static final PropertyEnum<BlockRedstoneComparator$Mode> aZA = PropertyEnum.c("mode", BlockRedstoneComparator$Mode.class);

    public BlockRedstoneComparator(boolean bl2) {
        super(bl2);
        this.h(this.aSG.zS().a(aTB, ao.dws).a(aZz, false).a(aZA, BlockRedstoneComparator$Mode.aZC));
        this.aSu = true;
    }

    @Override
    public String xA() {
        return cr.gm("item.comparator.name");
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cSi;
    }

    @Override
    public d e(w w2, b b2) {
        return Items.cSi;
    }

    @Override
    protected int q(IBlockState iBlockState) {
        return 2;
    }

    @Override
    protected IBlockState r(IBlockState iBlockState) {
        Boolean bl2 = iBlockState.b(aZz);
        BlockRedstoneComparator$Mode blockRedstoneComparator$Mode = iBlockState.b(aZA);
        ao ao2 = iBlockState.b(aTB);
        return Blocks.cOm.xM().a(aTB, ao2).a(aZz, bl2).a(aZA, blockRedstoneComparator$Mode);
    }

    @Override
    protected IBlockState s(IBlockState iBlockState) {
        Boolean bl2 = iBlockState.b(aZz);
        BlockRedstoneComparator$Mode blockRedstoneComparator$Mode = iBlockState.b(aZA);
        ao ao2 = iBlockState.b(aTB);
        return Blocks.cOl.xM().a(aTB, ao2).a(aZz, bl2).a(aZA, blockRedstoneComparator$Mode);
    }

    @Override
    protected boolean t(IBlockState iBlockState) {
        return this.aZG || iBlockState.b(aZz) != false;
    }

    @Override
    protected int a(l l2, b b2, IBlockState iBlockState) {
        net.minecraft.tileentity.d d2 = l2.K(b2);
        return d2 instanceof q ? ((q)d2).aqv() : 0;
    }

    private int x(w w2, b b2, IBlockState iBlockState) {
        return iBlockState.b(aZA) == BlockRedstoneComparator$Mode.aZD ? Math.max(this.z(w2, b2, iBlockState) - this.c((l)w2, b2, iBlockState), 0) : this.z(w2, b2, iBlockState);
    }

    @Override
    protected boolean y(w w2, b b2, IBlockState iBlockState) {
        int n2 = this.z(w2, b2, iBlockState);
        if (n2 >= 15) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        int n3 = this.c((l)w2, b2, iBlockState);
        return n3 == 0 || n2 >= n3;
    }

    @Override
    protected int z(w w2, b b2, IBlockState iBlockState) {
        int n2 = super.z(w2, b2, iBlockState);
        ao ao2 = iBlockState.b(aTB);
        b b3 = b2.x(ao2);
        Block block = w2.L(b3).df();
        if (block.xJ()) {
            n2 = block.h(w2, b3);
        } else if (n2 < 15 && block.xd()) {
            j j2;
            block = w2.L(b3 = b3.x(ao2)).df();
            if (block.xJ()) {
                n2 = block.h(w2, b3);
            } else if (block.xb() == Material.beo && (j2 = this.a(w2, ao2, b3)) != null) {
                n2 = j2.Yv();
            }
        }
        return n2;
    }

    private j a(w w2, ao ao2, b b2) {
        BlockRedstoneComparator$1 blockRedstoneComparator$1 = w2.a(j.class, new a(b2.wt(), b2.wu(), b2.wx(), b2.wt() + 1, b2.wu() + 1, b2.wx() + 1), new BlockRedstoneComparator$1(this, ao2));
        return blockRedstoneComparator$1.size() == 1 ? (j)blockRedstoneComparator$1.get(0) : null;
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (!a2.cIt.cJN) {
            return false;
        }
        iBlockState = iBlockState.c(aZA);
        w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, "random.click", 0.3f, iBlockState.b(aZA) == BlockRedstoneComparator$Mode.aZD ? 0.55f : 0.5f);
        w2.a(b2, iBlockState, 2);
        this.A(w2, b2, iBlockState);
        return true;
    }

    @Override
    protected void r(w w2, b b2, IBlockState iBlockState) {
        if (!w2.e(b2, this)) {
            int n2;
            int n3 = this.x(w2, b2, iBlockState);
            net.minecraft.tileentity.d d2 = w2.K(b2);
            int n4 = n2 = d2 instanceof q ? ((q)d2).aqv() : 0;
            if (n3 != n2 || this.t(iBlockState) != this.y(w2, b2, iBlockState)) {
                if (this.C(w2, b2, iBlockState)) {
                    w2.a(b2, this, 2, -1);
                } else {
                    w2.a(b2, this, 2, 0);
                }
            }
        }
    }

    private void A(w w2, b b2, IBlockState iBlockState) {
        int n2 = this.x(w2, b2, iBlockState);
        net.minecraft.tileentity.d d2 = w2.K(b2);
        int n3 = 0;
        if (d2 instanceof q) {
            q q2 = (q)d2;
            n3 = q2.aqv();
            q2.hm(n2);
        }
        if (n3 != n2 || iBlockState.b(aZA) == BlockRedstoneComparator$Mode.aZC) {
            boolean bl2 = this.y(w2, b2, iBlockState);
            boolean bl3 = this.t(iBlockState);
            if (bl3 && !bl2) {
                w2.a(b2, iBlockState.a(aZz, false), 2);
            } else if (!bl3 && bl2) {
                w2.a(b2, iBlockState.a(aZz, true), 2);
            }
            this.B(w2, b2, iBlockState);
        }
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (this.aZG) {
            w2.a(b2, this.s(iBlockState).a(aZz, true), 4);
        }
        this.A(w2, b2, iBlockState);
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        super.c(w2, b2, iBlockState);
        w2.a(b2, this.a(w2, 0));
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        super.d(w2, b2, iBlockState);
        w2.aU(b2);
        this.B(w2, b2, iBlockState);
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, int n2, int n3) {
        super.a(w2, b2, iBlockState, n2, n3);
        net.minecraft.tileentity.d d2 = w2.K(b2);
        return d2 != null && d2.aC(n2, n3);
    }

    @Override
    public net.minecraft.tileentity.d a(w w2, int n2) {
        return new q();
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTB, ao.hz(n2)).a(aZz, (n2 & 8) > 0).a(aZA, (n2 & 4) > 0 ? BlockRedstoneComparator$Mode.aZD : BlockRedstoneComparator$Mode.aZC);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aTB).asA();
        if (iBlockState.b(aZz).booleanValue()) {
            n2 |= 8;
        }
        if (iBlockState.b(aZA) == BlockRedstoneComparator$Mode.aZD) {
            n2 |= 4;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTB, aZA, aZz);
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return this.xM().a(aTB, r2.Uq().asC()).a(aZz, false).a(aZA, BlockRedstoneComparator$Mode.aZC);
    }
}

