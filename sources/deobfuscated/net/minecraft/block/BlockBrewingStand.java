/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ah;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.tileentity.l;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.cr;
import net.minecraft.world.w;

public class BlockBrewingStand
extends BlockContainer {
    public static final PropertyBool[] aTj = new PropertyBool[]{PropertyBool.cs("has_bottle_0"), PropertyBool.cs("has_bottle_1"), PropertyBool.cs("has_bottle_2")};

    public BlockBrewingStand() {
        super(Material.bet);
        this.h(this.aSG.zS().a(aTj[0], false).a(aTj[1], false).a(aTj[2], false));
    }

    @Override
    public String xA() {
        return cr.gm("item.brewingStand.name");
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public int xg() {
        return 3;
    }

    @Override
    public net.minecraft.tileentity.d a(w w2, int n2) {
        return new l();
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, a a2, List<a> list, c c2) {
        this.a(0.4375f, 0.0f, 0.4375f, 0.5625f, 0.875f, 0.5625f);
        super.a(w2, b2, iBlockState, a2, list, c2);
        this.xx();
        super.a(w2, b2, iBlockState, a2, list, c2);
    }

    @Override
    public void xx() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (w2.dDw) {
            return true;
        }
        net.minecraft.tileentity.d d2 = w2.K(b2);
        if (d2 instanceof l) {
            a2.a((l)d2);
            a2.a(n.dqn);
        }
        return true;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, r r2, co co2) {
        net.minecraft.tileentity.d d2;
        if (co2.aen() && (d2 = w2.K(b2)) instanceof l) {
            ((l)d2).setName(co2.getDisplayName());
        }
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        double d2 = (float)b2.wt() + 0.4f + random.nextFloat() * 0.2f;
        double d3 = (float)b2.wu() + 0.7f + random.nextFloat() * 0.3f;
        double d4 = (float)b2.wx() + 0.4f + random.nextFloat() * 0.2f;
        w2.a(as.dxh, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        net.minecraft.tileentity.d d2 = w2.K(b2);
        if (d2 instanceof l) {
            ah.a(w2, b2, (ab)((l)d2));
        }
        super.d(w2, b2, iBlockState);
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cRJ;
    }

    @Override
    public d e(w w2, b b2) {
        return Items.cRJ;
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
        return av.dxX;
    }

    @Override
    public IBlockState aM(int n2) {
        IBlockState iBlockState = this.xM();
        for (int i2 = 0; i2 < 3; ++i2) {
            iBlockState = iBlockState.a(aTj[i2], (n2 & 1 << i2) > 0);
        }
        return iBlockState;
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        for (int i2 = 0; i2 < 3; ++i2) {
            if (!iBlockState.b(aTj[i2]).booleanValue()) continue;
            n2 |= 1 << i2;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTj[0], aTj[1], aTj[2]);
    }
}

