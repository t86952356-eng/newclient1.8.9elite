/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHopper$1;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ah;
import net.minecraft.item.co;
import net.minecraft.stats.n;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.z;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockHopper
extends BlockContainer {
    public static final PropertyDirection aVY = PropertyDirection.a("facing", new BlockHopper$1());
    public static final PropertyBool aVZ = PropertyBool.cs("enabled");

    public BlockHopper() {
        super(Material.bet, MapColor.bdN);
        this.h(this.aSG.zS().a(aVY, ao.dwq).a(aVZ, true));
        this.a(net.minecraft.creativetab.a.cpz);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void c(l l2, b b2) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, a a2, List<a> list, c c2) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
        super.a(w2, b2, iBlockState, a2, list, c2);
        float f2 = 0.125f;
        this.a(0.0f, 0.0f, 0.0f, 0.125f, 1.0f, 1.0f);
        super.a(w2, b2, iBlockState, a2, list, c2);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.125f);
        super.a(w2, b2, iBlockState, a2, list, c2);
        this.a(0.875f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.a(w2, b2, iBlockState, a2, list, c2);
        this.a(0.0f, 0.0f, 0.875f, 1.0f, 1.0f, 1.0f);
        super.a(w2, b2, iBlockState, a2, list, c2);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        ao ao3 = ao2.asC();
        if (ao3 == ao.dwr) {
            ao3 = ao.dwq;
        }
        return this.xM().a(aVY, ao3).a(aVZ, true);
    }

    @Override
    public d a(w w2, int n2) {
        return new z();
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, r r2, co co2) {
        d d2;
        super.a(w2, b2, iBlockState, r2, co2);
        if (co2.aen() && (d2 = w2.K(b2)) instanceof z) {
            ((z)d2).es(co2.getDisplayName());
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        this.r(w2, b2, iBlockState);
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (w2.dDw) {
            return true;
        }
        d d2 = w2.K(b2);
        if (d2 instanceof z) {
            a2.a((z)d2);
            a2.a(n.dqq);
        }
        return true;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        this.r(w2, b2, iBlockState);
    }

    private void r(w w2, b b2, IBlockState iBlockState) {
        boolean bl2;
        boolean bl3 = bl2 = !w2.bb(b2);
        if (bl2 != iBlockState.b(aVZ)) {
            w2.a(b2, iBlockState.a(aVZ, bl2), 4);
        }
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        d d2 = w2.K(b2);
        if (d2 instanceof z) {
            ah.a(w2, b2, (ab)((z)d2));
            w2.f(b2, this);
        }
        super.d(w2, b2, iBlockState);
    }

    @Override
    public int xg() {
        return 3;
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
    public boolean a(l l2, b b2, ao ao2) {
        return true;
    }

    public static ao aQ(int n2) {
        return ao.hy(n2 & 7);
    }

    public static boolean aX(int n2) {
        return (n2 & 8) != 8;
    }

    @Override
    public boolean xJ() {
        return true;
    }

    @Override
    public int h(w w2, b b2) {
        return net.minecraft.inventory.b.d(w2.K(b2));
    }

    @Override
    public av xo() {
        return av.dxW;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aVY, BlockHopper.aQ(n2)).a(aVZ, BlockHopper.aX(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aVY).OY();
        if (!iBlockState.b(aVZ).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aVY, aVZ);
    }
}

