/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.u;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockEnchantmentTable
extends BlockContainer {
    protected BlockEnchantmentTable() {
        super(Material.bes, MapColor.bee);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
        this.aN(0);
        this.a(a.cpy);
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        super.c(w2, b2, iBlockState, random);
        for (int i2 = -2; i2 <= 2; ++i2) {
            block1: for (int i3 = -2; i3 <= 2; ++i3) {
                if (i2 > -2 && i2 < 2 && i3 == -1) {
                    i3 = 2;
                }
                if (random.nextInt(16) != 0) continue;
                for (int i4 = 0; i4 <= 1; ++i4) {
                    b b3 = b2.C(i2, i4, i3);
                    if (w2.L(b3).df() != Blocks.cLZ) continue;
                    if (!w2.aG(b2.C(i2 / 2, 0, i3 / 2))) continue block1;
                    w2.a(as.dxv, (double)b2.wt() + 0.5, (double)b2.wu() + 2.0, (double)b2.wx() + 0.5, (double)((float)i2 + random.nextFloat()) - 0.5, (double)((float)i4 - random.nextFloat() - 1.0f), (double)((float)i3 + random.nextFloat()) - 0.5, new int[0]);
                }
            }
        }
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
    public d a(w w2, int n2) {
        return new u();
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (w2.dDw) {
            return true;
        }
        d d2 = w2.K(b2);
        if (d2 instanceof u) {
            a2.a((u)d2);
        }
        return true;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, r r2, co co2) {
        d d2;
        super.a(w2, b2, iBlockState, r2, co2);
        if (co2.aen() && (d2 = w2.K(b2)) instanceof u) {
            ((u)d2).es(co2.getDisplayName());
        }
    }
}

