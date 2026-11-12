/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.item.d;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.as;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import net.minecraft.world.l;
import net.minecraft.world.w;

public abstract class BlockLiquid
extends Block {
    public static final PropertyInteger aWV = PropertyInteger.e("level", 0, 15);

    protected BlockLiquid(Material material) {
        super(material);
        this.h(this.aSG.zS().a(aWV, 0));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.O(true);
    }

    @Override
    public boolean a(l l2, b b2) {
        return this.aSD != Material.bew;
    }

    @Override
    public int a(l l2, b b2, int n2) {
        return this.aSD == Material.bev ? net.minecraft.world.biome.c.y(l2, b2) : 0xFFFFFF;
    }

    public static float bb(int n2) {
        if (n2 >= 8) {
            n2 = 0;
        }
        return (float)(n2 + 1) / 9.0f;
    }

    protected int k(l l2, b b2) {
        return l2.L(b2).df().xb() == this.aSD ? l2.L(b2).b(aWV) : -1;
    }

    protected int l(l l2, b b2) {
        int n2 = this.k(l2, b2);
        return n2 >= 8 ? 0 : n2;
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
    public boolean a(IBlockState iBlockState, boolean bl2) {
        return bl2 && iBlockState.b(aWV) == 0;
    }

    @Override
    public boolean b(l l2, b b2, ao ao2) {
        Material material = l2.L(b2).df().xb();
        return material != this.aSD && (ao2 == ao.dwr || material != Material.beK && super.b(l2, b2, ao2));
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        return l2.L(b2).df().xb() != this.aSD && (ao2 == ao.dwr || super.a(l2, b2, ao2));
    }

    public boolean m(l l2, b b2) {
        for (int i2 = -1; i2 <= 1; ++i2) {
            for (int i3 = -1; i3 <= 1; ++i3) {
                IBlockState iBlockState = l2.L(b2.C(i2, 0, i3));
                Block block = iBlockState.df();
                Material material = block.xb();
                if (material == this.aSD || block.isFullBlock()) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        return null;
    }

    @Override
    public int xg() {
        return 1;
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    public da n(l l2, b b2) {
        b b3;
        da da2 = new da(0.0, 0.0, 0.0);
        int n2 = this.l(l2, b2);
        for (ao ao2 : ar.dwT) {
            int n3;
            b3 = b2.x(ao2);
            int n4 = this.l(l2, b3);
            if (n4 < 0) {
                if (l2.L(b3).df().xb().zy() || (n4 = this.l(l2, b3.aqY())) < 0) continue;
                n3 = n4 - (n2 - 8);
                da2 = da2.al((b3.wt() - b2.wt()) * n3, (b3.wu() - b2.wu()) * n3, (b3.wx() - b2.wx()) * n3);
                continue;
            }
            if (n4 < 0) continue;
            n3 = n4 - n2;
            da2 = da2.al((b3.wt() - b2.wt()) * n3, (b3.wu() - b2.wu()) * n3, (b3.wx() - b2.wx()) * n3);
        }
        if (l2.L(b2).b(aWV) >= 8) {
            for (ao ao2 : ar.dwT) {
                b3 = b2.x(ao2);
                if (!this.b(l2, b3, ao2) && !this.b(l2, b3.aqX(), ao2)) continue;
                da2 = da2.atR().al(0.0, -6.0, 0.0);
                break;
            }
        }
        return da2.atR();
    }

    @Override
    public da a(w w2, b b2, c c2, da da2) {
        return da2.w(this.n(w2, b2));
    }

    @Override
    public int c(w w2) {
        return this.aSD == Material.bev ? 5 : (this.aSD == Material.bew ? (w2.dDl.awf() ? 10 : 30) : 0);
    }

    @Override
    public int b(l l2, b b2) {
        int n2 = l2.b(b2, 0);
        int n3 = l2.b(b2.aqX(), 0);
        int n4 = n2 & 0xFF;
        int n5 = n3 & 0xFF;
        int n6 = n2 >> 16 & 0xFF;
        int n7 = n3 >> 16 & 0xFF;
        return Math.max(n4, n5) | Math.max(n6, n7) << 16;
    }

    @Override
    public av xo() {
        return this.aSD == Material.bev ? av.dxY : av.dxV;
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        Material material;
        double d2 = b2.wt();
        double d3 = b2.wu();
        double d4 = b2.wx();
        if (this.aSD == Material.bev) {
            int n2 = iBlockState.b(aWV);
            if (n2 > 0 && n2 < 8) {
                if (random.nextInt(64) == 0) {
                    w2.a(d2 + 0.5, d3 + 0.5, d4 + 0.5, "liquid.water", random.nextFloat() * 0.25f + 0.75f, random.nextFloat() + 0.5f, false);
                }
            } else if (random.nextInt(10) == 0) {
                w2.a(as.dxd, d2 + (double)random.nextFloat(), d3 + (double)random.nextFloat(), d4 + (double)random.nextFloat(), 0.0, 0.0, 0.0, new int[0]);
            }
        }
        if (this.aSD == Material.bew && w2.L(b2.aqX()).df().xb() == Material.beo && !w2.L(b2.aqX()).df().xk()) {
            if (random.nextInt(100) == 0) {
                double d5 = d2 + (double)random.nextFloat();
                double d6 = d3 + this.aSz;
                double d7 = d4 + (double)random.nextFloat();
                w2.a(as.dxx, d5, d6, d7, 0.0, 0.0, 0.0, new int[0]);
                w2.a(d5, d6, d7, "liquid.lavapop", 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
            if (random.nextInt(200) == 0) {
                w2.a(d2, d3, d4, "liquid.lava", 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
        }
        if (random.nextInt(10) == 0 && w.v(w2, b2.aqY()) && !(material = w2.L(b2.hr(2)).df().xb()).zy() && !material.zv()) {
            double d8 = d2 + (double)random.nextFloat();
            double d9 = d3 - 1.05;
            double d10 = d4 + (double)random.nextFloat();
            if (this.aSD == Material.bev) {
                w2.a(as.dxo, d8, d9, d10, 0.0, 0.0, 0.0, new int[0]);
            } else {
                w2.a(as.dxp, d8, d9, d10, 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }

    public static double a(l l2, b b2, Material material) {
        da da2 = BlockLiquid.a(material).n(l2, b2);
        return da2.dAG == 0.0 && da2.dAI == 0.0 ? -1000.0 : bt.y(da2.dAI, da2.dAG) - 1.5707963267948966;
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        this.u(w2, b2, iBlockState);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        this.u(w2, b2, iBlockState);
    }

    public boolean u(w w2, b b2, IBlockState iBlockState) {
        if (this.aSD == Material.bew) {
            boolean bl2 = false;
            for (ao ao2 : ao.values()) {
                if (ao2 == ao.dwq || w2.L(b2.x(ao2)).df().xb() != Material.bev) continue;
                bl2 = true;
                break;
            }
            if (bl2) {
                Integer n2 = iBlockState.b(aWV);
                if (n2 == 0) {
                    w2.d(b2, Blocks.cMb.xM());
                    this.K(w2, b2);
                    return true;
                }
                if (n2 <= 4) {
                    w2.d(b2, Blocks.cLg.xM());
                    this.K(w2, b2);
                    return true;
                }
            }
        }
        return false;
    }

    protected void K(w w2, b b2) {
        double d2 = b2.wt();
        double d3 = b2.wu();
        double d4 = b2.wx();
        w2.a(d2 + 0.5, d3 + 0.5, d4 + 0.5, "random.fizz", 0.5f, 2.6f + (w2.dDk.nextFloat() - w2.dDk.nextFloat()) * 0.8f);
        for (int i2 = 0; i2 < 8; ++i2) {
            w2.a(as.dxi, d2 + Math.random(), d3 + 1.2, d4 + Math.random(), 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aWV, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aWV);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aWV);
    }

    public static BlockDynamicLiquid a(Material material) {
        if (material == Material.bev) {
            return Blocks.cLk;
        }
        if (material == Material.bew) {
            return Blocks.cLm;
        }
        throw new IllegalArgumentException("Invalid material");
    }

    public static BlockStaticLiquid b(Material material) {
        if (material == Material.bev) {
            return Blocks.cLl;
        }
        if (material == Material.bew) {
            return Blocks.cLn;
        }
        throw new IllegalArgumentException("Invalid material");
    }
}

