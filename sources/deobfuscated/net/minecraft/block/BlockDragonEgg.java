/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.g;
import net.minecraft.entity.player.a;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockDragonEgg
extends Block {
    public BlockDragonEgg() {
        super(Material.beR, MapColor.bef);
        this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 1.0f, 0.9375f);
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        w2.a(b2, (Block)this, this.c(w2));
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        w2.a(b2, (Block)this, this.c(w2));
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        this.y(w2, b2);
    }

    private void y(w w2, b b2) {
        if (BlockFalling.C(w2, b2.aqY()) && b2.wu() >= 0) {
            int n2 = 32;
            if (!BlockFalling.aUB && w2.e(b2.C(-32, -32, -32), b2.C(32, 32, 32))) {
                w2.G(new g(w2, (float)b2.wt() + 0.5f, b2.wu(), (float)b2.wx() + 0.5f, this.xM()));
            } else {
                w2.aL(b2);
                b b3 = b2;
                while (BlockFalling.C(w2, b3) && b3.wu() > 0) {
                    b3 = b3.aqY();
                }
                if (b3.wu() > 0) {
                    w2.a(b3, this.xM(), 2);
                }
            }
        }
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, a a2, ao ao2, float f2, float f3, float f4) {
        this.z(w2, b2);
        return true;
    }

    @Override
    public void a(w w2, b b2, a a2) {
        this.z(w2, b2);
    }

    private void z(w w2, b b2) {
        IBlockState iBlockState = w2.L(b2);
        if (iBlockState.df() == this) {
            for (int i2 = 0; i2 < 1000; ++i2) {
                b b3 = b2.C(w2.dDk.nextInt(16) - w2.dDk.nextInt(16), w2.dDk.nextInt(8) - w2.dDk.nextInt(8), w2.dDk.nextInt(16) - w2.dDk.nextInt(16));
                if (w2.L((b)b3).df().aSD != Material.beo) continue;
                if (w2.dDw) {
                    for (int i3 = 0; i3 < 128; ++i3) {
                        double d2 = w2.dDk.nextDouble();
                        float f2 = (w2.dDk.nextFloat() - 0.5f) * 0.2f;
                        float f3 = (w2.dDk.nextFloat() - 0.5f) * 0.2f;
                        float f4 = (w2.dDk.nextFloat() - 0.5f) * 0.2f;
                        double d3 = (double)b3.wt() + (double)(b2.wt() - b3.wt()) * d2 + (w2.dDk.nextDouble() - 0.5) * 1.0 + 0.5;
                        double d4 = (double)b3.wu() + (double)(b2.wu() - b3.wu()) * d2 + w2.dDk.nextDouble() * 1.0 - 0.5;
                        double d5 = (double)b3.wx() + (double)(b2.wx() - b3.wx()) * d2 + (w2.dDk.nextDouble() - 0.5) * 1.0 + 0.5;
                        w2.a(as.dxu, d3, d4, d5, (double)f2, (double)f3, (double)f4, new int[0]);
                    }
                } else {
                    w2.a(b3, iBlockState, 2);
                    w2.aL(b2);
                }
                return;
            }
        }
    }

    @Override
    public int c(w w2) {
        return 5;
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
    public boolean a(l l2, b b2, ao ao2) {
        return true;
    }

    @Override
    public d e(w w2, b b2) {
        return null;
    }
}

