/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ag;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.tileentity.w;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.ar;
import net.minecraft.util.as;
import net.minecraft.util.b;

public class BlockEnderChest
extends BlockContainer {
    public static final PropertyDirection aUw = PropertyDirection.a("facing", ar.dwT);

    protected BlockEnderChest() {
        super(Material.bes);
        this.h(this.aSG.zS().a(aUw, ao.dws));
        this.a(a.cpy);
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
    public d a(IBlockState iBlockState, Random random, int n2) {
        return d.I(Blocks.cMb);
    }

    @Override
    public int a(Random random) {
        return 8;
    }

    @Override
    protected boolean xy() {
        return true;
    }

    @Override
    public IBlockState a(net.minecraft.world.w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return this.xM().a(aUw, r2.Uq().asC());
    }

    @Override
    public void a(net.minecraft.world.w w2, b b2, IBlockState iBlockState, r r2, co co2) {
        w2.a(b2, iBlockState.a(aUw, r2.Uq().asC()), 2);
    }

    @Override
    public boolean a(net.minecraft.world.w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        ag ag2 = a2.acb();
        net.minecraft.tileentity.d d2 = w2.K(b2);
        if (ag2 != null && d2 instanceof w) {
            if (w2.L(b2.aqX()).df().xd()) {
                return true;
            }
            if (w2.dDw) {
                return true;
            }
            ag2.a((w)d2);
            a2.a(ag2);
            a2.a(n.dqw);
            return true;
        }
        return true;
    }

    @Override
    public net.minecraft.tileentity.d a(net.minecraft.world.w w2, int n2) {
        return new w();
    }

    @Override
    public void c(net.minecraft.world.w w2, b b2, IBlockState iBlockState, Random random) {
        for (int i2 = 0; i2 < 3; ++i2) {
            int n2 = random.nextInt(2) * 2 - 1;
            int n3 = random.nextInt(2) * 2 - 1;
            double d2 = (double)b2.wt() + 0.5 + 0.25 * (double)n2;
            double d3 = (float)b2.wu() + random.nextFloat();
            double d4 = (double)b2.wx() + 0.5 + 0.25 * (double)n3;
            double d5 = random.nextFloat() * (float)n2;
            double d6 = ((double)random.nextFloat() - 0.5) * 0.125;
            double d7 = random.nextFloat() * (float)n3;
            w2.a(as.dxu, d2, d3, d4, d5, d6, d7, new int[0]);
        }
    }

    @Override
    public IBlockState aM(int n2) {
        ao ao2 = ao.hy(n2);
        if (ao2.asL() == ap.dwI) {
            ao2 = ao.dws;
        }
        return this.xM().a(aUw, ao2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aUw).OY();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aUw);
    }
}

