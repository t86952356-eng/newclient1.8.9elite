/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBeacon$1;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.stats.n;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.j;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.ay;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockBeacon
extends BlockContainer {
    public BlockBeacon() {
        super(Material.beG, MapColor.beh);
        this.L(3.0f);
        this.a(a.cpB);
    }

    @Override
    public d a(w w2, int n2) {
        return new j();
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        d d2;
        if (!w2.dDw && (d2 = w2.K(b2)) instanceof j) {
            a2.a((j)d2);
            a2.a(n.dqo);
        }
        return true;
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
        return 3;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, r r2, co co2) {
        d d2;
        super.a(w2, b2, iBlockState, r2, co2);
        if (co2.aen() && (d2 = w2.K(b2)) instanceof j) {
            ((j)d2).setName(co2.getDisplayName());
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        d d2 = w2.K(b2);
        if (d2 instanceof j) {
            ((j)d2).aqj();
            w2.c(b2, this, 1, 0);
        }
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    public static void m(w w2, b b2) {
        ay.dyj.submit((Runnable)new BlockBeacon$1(w2, b2));
    }
}

