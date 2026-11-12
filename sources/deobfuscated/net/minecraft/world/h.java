/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package net.minecraft.world;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.u;
import net.minecraft.entity.c;
import net.minecraft.entity.item.v;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.util.a;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import net.minecraft.world.w;

public class h {
    private final boolean dCd;
    private final boolean dCe;
    private final Random dCf = new Random();
    private final w dCg;
    private final double dCh;
    private final double dCi;
    private final double dCj;
    private final c dCk;
    private final float dCl;
    private final List<b> dCm = Lists.newArrayList();
    private final Map<net.minecraft.entity.player.a, da> dCn = Maps.newHashMap();

    public h(w w2, c c2, double d2, double d3, double d4, float f2, List<b> list) {
        this(w2, c2, d2, d3, d4, f2, false, true, list);
    }

    public h(w w2, c c2, double d2, double d3, double d4, float f2, boolean bl2, boolean bl3, List<b> list) {
        this(w2, c2, d2, d3, d4, f2, bl2, bl3);
        this.dCm.addAll(list);
    }

    public h(w w2, c c2, double d2, double d3, double d4, float f2, boolean bl2, boolean bl3) {
        this.dCg = w2;
        this.dCk = c2;
        this.dCl = f2;
        this.dCh = d2;
        this.dCi = d3;
        this.dCj = d4;
        this.dCd = bl2;
        this.dCe = bl3;
    }

    public void avd() {
        int n2;
        int n3;
        HashSet hashSet = Sets.newHashSet();
        int n4 = 16;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (n3 = 0; n3 < 16; ++n3) {
                for (n2 = 0; n2 < 16; ++n2) {
                    if (i2 != 0 && i2 != 15 && n3 != 0 && n3 != 15 && n2 != 0 && n2 != 15) continue;
                    double d2 = (float)i2 / 15.0f * 2.0f - 1.0f;
                    double d3 = (float)n3 / 15.0f * 2.0f - 1.0f;
                    double d4 = (float)n2 / 15.0f * 2.0f - 1.0f;
                    double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
                    d2 /= d5;
                    d3 /= d5;
                    d4 /= d5;
                    double d6 = this.dCh;
                    double d7 = this.dCi;
                    double d8 = this.dCj;
                    float f2 = 0.3f;
                    for (float f3 = this.dCl * (0.7f + this.dCg.dDk.nextFloat() * 0.6f); f3 > 0.0f; f3 -= 0.22500001f) {
                        b b2 = new b(d6, d7, d8);
                        IBlockState iBlockState = this.dCg.L(b2);
                        if (iBlockState.df().xb() != Material.beo) {
                            float f4 = this.dCk != null ? this.dCk.a(this, this.dCg, b2, iBlockState) : iBlockState.df().A(null);
                            f3 -= (f4 + 0.3f) * 0.3f;
                        }
                        if (f3 > 0.0f && (this.dCk == null || this.dCk.a(this, this.dCg, b2, iBlockState, f3))) {
                            hashSet.add(b2);
                        }
                        d6 += d2 * (double)0.3f;
                        d7 += d3 * (double)0.3f;
                        d8 += d4 * (double)0.3f;
                    }
                }
            }
        }
        this.dCm.addAll(hashSet);
        float f5 = this.dCl * 2.0f;
        n3 = bt.aF(this.dCh - (double)f5 - 1.0);
        n2 = bt.aF(this.dCh + (double)f5 + 1.0);
        int n5 = bt.aF(this.dCi - (double)f5 - 1.0);
        int n6 = bt.aF(this.dCi + (double)f5 + 1.0);
        int n7 = bt.aF(this.dCj - (double)f5 - 1.0);
        int n8 = bt.aF(this.dCj + (double)f5 + 1.0);
        List<c> list = this.dCg.b(this.dCk, new a(n3, n5, n7, n2, n6, n8));
        da da2 = new da(this.dCh, this.dCi, this.dCj);
        for (int i3 = 0; i3 < list.size(); ++i3) {
            double d9;
            double d10;
            double d11;
            double d12;
            double d13;
            c c2 = list.get(i3);
            if (c2.Uw() || !((d13 = c2.getDistance(this.dCh, this.dCi, this.dCj) / (double)f5) <= 1.0) || (d12 = (double)bt.aD((d11 = c2.gW - this.dCh) * d11 + (d10 = c2.gX + (double)c2.getEyeHeight() - this.dCi) * d10 + (d9 = c2.gY - this.dCj) * d9)) == 0.0) continue;
            d11 /= d12;
            d10 /= d12;
            d9 /= d12;
            double d14 = this.dCg.b(da2, c2.Us());
            double d15 = (1.0 - d13) * d14;
            c2.a(ad.b(this), (float)((int)((d15 * d15 + d15) / 2.0 * 8.0 * (double)f5 + 1.0)));
            double d16 = u.c(c2, d15);
            c2.ud += d11 * d16;
            c2.ue += d10 * d16;
            c2.uf += d9 * d16;
            if (!(c2 instanceof net.minecraft.entity.player.a) || ((net.minecraft.entity.player.a)c2).cIt.cJJ) continue;
            this.dCn.put((net.minecraft.entity.player.a)c2, new da(d11 * d15, d10 * d15, d9 * d15));
        }
    }

    public void cs(boolean bl2) {
        this.dCg.a(this.dCh, this.dCi, this.dCj, "random.explode", 4.0f, (1.0f + (this.dCg.dDk.nextFloat() - this.dCg.dDk.nextFloat()) * 0.2f) * 0.7f);
        if (this.dCl >= 2.0f && this.dCe) {
            this.dCg.a(as.dwY, this.dCh, this.dCi, this.dCj, 1.0, 0.0, 0.0, new int[0]);
        } else {
            this.dCg.a(as.dwX, this.dCh, this.dCi, this.dCj, 1.0, 0.0, 0.0, new int[0]);
        }
        if (this.dCe) {
            for (b b2 : this.dCm) {
                Block block = this.dCg.L(b2).df();
                if (bl2) {
                    double d2 = (float)b2.wt() + this.dCg.dDk.nextFloat();
                    double d3 = (float)b2.wu() + this.dCg.dDk.nextFloat();
                    double d4 = (float)b2.wx() + this.dCg.dDk.nextFloat();
                    double d5 = d2 - this.dCh;
                    double d6 = d3 - this.dCi;
                    double d7 = d4 - this.dCj;
                    double d8 = bt.aD(d5 * d5 + d6 * d6 + d7 * d7);
                    d5 /= d8;
                    d6 /= d8;
                    d7 /= d8;
                    double d9 = 0.5 / (d8 / (double)this.dCl + 0.1);
                    this.dCg.a(as.dwW, (d2 + this.dCh * 1.0) / 2.0, (d3 + this.dCi * 1.0) / 2.0, (d4 + this.dCj * 1.0) / 2.0, d5 *= (d9 *= (double)(this.dCg.dDk.nextFloat() * this.dCg.dDk.nextFloat() + 0.3f)), d6 *= d9, d7 *= d9, new int[0]);
                    this.dCg.a(as.dxh, d2, d3, d4, d5, d6, d7, new int[0]);
                }
                if (block.xb() == Material.beo) continue;
                if (block.a(this)) {
                    block.a(this.dCg, b2, this.dCg.L(b2), 1.0f / this.dCl, 0);
                }
                this.dCg.a(b2, Blocks.cLc.xM(), 3);
                block.a(this.dCg, b2, this);
            }
        }
        if (this.dCd) {
            for (b b2 : this.dCm) {
                if (this.dCg.L(b2).df().xb() != Material.beo || !this.dCg.L(b2.aqY()).df().isFullBlock() || this.dCf.nextInt(3) != 0) continue;
                this.dCg.d(b2, Blocks.cMd.xM());
            }
        }
    }

    public Map<net.minecraft.entity.player.a, da> ave() {
        return this.dCn;
    }

    public r avf() {
        return this.dCk == null ? null : (this.dCk instanceof v ? ((v)this.dCk).YW() : (this.dCk instanceof r ? (r)this.dCk : null));
    }

    public void avg() {
        this.dCm.clear();
    }

    public List<b> ahp() {
        return this.dCm;
    }
}

