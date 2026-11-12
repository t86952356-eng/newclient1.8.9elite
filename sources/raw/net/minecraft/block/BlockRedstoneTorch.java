/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.block;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneTorch$Toggle;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockRedstoneTorch
extends BlockTorch {
    private static final Map<w, List<BlockRedstoneTorch$Toggle>> aZL = Maps.newHashMap();
    private final boolean aZM;

    private boolean b(w w2, b b2, boolean bl2) {
        if (!aZL.containsKey(w2)) {
            aZL.put(w2, Lists.newArrayList());
        }
        List<BlockRedstoneTorch$Toggle> list = aZL.get(w2);
        if (bl2) {
            list.add(new BlockRedstoneTorch$Toggle(b2, w2.getTotalWorldTime()));
        }
        int n2 = 0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            BlockRedstoneTorch$Toggle blockRedstoneTorch$Toggle = list.get(i2);
            if (!blockRedstoneTorch$Toggle.aZf.equals(b2) || ++n2 < 8) continue;
            return true;
        }
        return false;
    }

    protected BlockRedstoneTorch(boolean bl2) {
        this.aZM = bl2;
        this.O(true);
        this.a((a)null);
    }

    @Override
    public int c(w w2) {
        return 2;
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        if (this.aZM) {
            for (ao ao2 : ao.values()) {
                w2.c(b2.x(ao2), this);
            }
        }
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        if (this.aZM) {
            for (ao ao2 : ao.values()) {
                w2.c(b2.x(ao2), this);
            }
        }
    }

    @Override
    public int a(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return this.aZM && iBlockState.b(bcF) != ao2 ? 15 : 0;
    }

    private boolean D(w w2, b b2, IBlockState iBlockState) {
        ao ao2 = iBlockState.b(bcF).asC();
        return w2.j(b2.x(ao2), ao2);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Random random) {
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        boolean bl2 = this.D(w2, b2, iBlockState);
        List<BlockRedstoneTorch$Toggle> list = aZL.get(w2);
        while (list != null && !list.isEmpty() && w2.getTotalWorldTime() - list.get((int)0).sk > 60L) {
            list.remove(0);
        }
        if (this.aZM) {
            if (bl2) {
                w2.a(b2, Blocks.cMG.xM().a(bcF, iBlockState.b(bcF)), 3);
                if (this.b(w2, b2, true)) {
                    w2.a((float)b2.wt() + 0.5f, (double)((float)b2.wu() + 0.5f), (double)((float)b2.wx() + 0.5f), "random.fizz", 0.5f, 2.6f + (w2.dDk.nextFloat() - w2.dDk.nextFloat()) * 0.8f);
                    for (int i2 = 0; i2 < 5; ++i2) {
                        double d2 = (double)b2.wt() + random.nextDouble() * 0.6 + 0.2;
                        double d3 = (double)b2.wu() + random.nextDouble() * 0.6 + 0.2;
                        double d4 = (double)b2.wx() + random.nextDouble() * 0.6 + 0.2;
                        w2.a(as.dxh, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
                    }
                    w2.a(b2, w2.L(b2).df(), 160);
                }
            }
        } else if (!bl2 && !this.b(w2, b2, false)) {
            w2.a(b2, Blocks.cMH.xM().a(bcF, iBlockState.b(bcF)), 3);
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!this.K(w2, b2, iBlockState) && this.aZM == this.D(w2, b2, iBlockState)) {
            w2.a(b2, (Block)this, this.c(w2));
        }
    }

    @Override
    public int b(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return ao2 == ao.dwq ? this.a(l2, b2, iBlockState, ao2) : 0;
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return d.I(Blocks.cMH);
    }

    @Override
    public boolean xw() {
        return true;
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        if (this.aZM) {
            double d2 = (double)b2.wt() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
            double d3 = (double)b2.wu() + 0.7 + (random.nextDouble() - 0.5) * 0.2;
            double d4 = (double)b2.wx() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
            ao ao2 = iBlockState.b(bcF);
            if (ao2.asL().asP()) {
                ao ao3 = ao2.asC();
                double d5 = 0.27;
                d2 += 0.27 * (double)ao3.asH();
                d3 += 0.22;
                d4 += 0.27 * (double)ao3.asJ();
            }
            w2.a(as.dxA, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public d e(w w2, b b2) {
        return d.I(Blocks.cMH);
    }

    @Override
    public boolean j(Block block) {
        return block == Blocks.cMG || block == Blocks.cMH;
    }
}

