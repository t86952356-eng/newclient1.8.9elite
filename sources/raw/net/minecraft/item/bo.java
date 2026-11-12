/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultiset
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Multiset
 *  com.google.common.collect.Multisets
 */
package net.minecraft.item;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStone$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.bp;
import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.g;
import net.minecraft.world.chunk.a;
import net.minecraft.world.storage.f;
import net.minecraft.world.w;

public class bo
extends bp {
    protected bo() {
        this.bM(true);
    }

    public static f b(int n2, w w2) {
        String string = "map_" + n2;
        f f2 = (f)w2.b(f.class, string);
        if (f2 == null) {
            f2 = new f(string);
            w2.a(string, f2);
        }
        return f2;
    }

    public f a(co co2, w w2) {
        String string = "map_" + co2.yc();
        f f2 = (f)w2.b(f.class, string);
        if (f2 == null && !w2.dDw) {
            co2.gf(w2.gA("map"));
            string = "map_" + co2.yc();
            f2 = new f(string);
            f2.dTk = (byte)3;
            f2.a(w2.avH().azn(), w2.avH().azp(), f2.dTk);
            f2.dTj = (byte)w2.dDl.getDimensionId();
            f2.Lw();
            w2.a(string, f2);
        }
        return f2;
    }

    public void a(w w2, c c2, f f2) {
        if (w2.dDl.getDimensionId() == f2.dTj && c2 instanceof net.minecraft.entity.player.a) {
            int n2 = 1 << f2.dTk;
            int n3 = f2.dTh;
            int n4 = f2.dTi;
            int n5 = bt.aF(c2.gW - (double)n3) / n2 + 64;
            int n6 = bt.aF(c2.gY - (double)n4) / n2 + 64;
            int n7 = 128 / n2;
            if (w2.dDl.awf()) {
                n7 /= 2;
            }
            net.minecraft.world.storage.g g2 = f2.Q((net.minecraft.entity.player.a)c2);
            ++g2.dTs;
            boolean bl2 = false;
            for (int i2 = n5 - n7 + 1; i2 < n5 + n7; ++i2) {
                if ((i2 & 0xF) != (g2.dTs & 0xF) && !bl2) continue;
                bl2 = false;
                double d2 = 0.0;
                for (int i3 = n6 - n7 - 1; i3 < n6 + n7; ++i3) {
                    byte by2;
                    MapColor mapColor;
                    int n8;
                    int n9;
                    if (i2 < 0 || i3 < -1 || i2 >= 128 || i3 >= 128) continue;
                    int n10 = i2 - n5;
                    int n11 = i3 - n6;
                    boolean bl3 = n10 * n10 + n11 * n11 > (n7 - 2) * (n7 - 2);
                    int n12 = (n3 / n2 + i2 - 64) * n2;
                    int n13 = (n4 / n2 + i3 - 64) * n2;
                    HashMultiset hashMultiset = HashMultiset.create();
                    a a2 = w2.aK(new b(n12, 0, n13));
                    if (a2.isEmpty()) continue;
                    int n14 = n12 & 0xF;
                    int n15 = n13 & 0xF;
                    int n16 = 0;
                    double d3 = 0.0;
                    if (w2.dDl.awf()) {
                        int n17 = n12 + n13 * 231871;
                        if (((n17 = n17 * n17 * 31287121 + n17 * 11) >> 20 & 1) == 0) {
                            hashMultiset.add((Object)Blocks.cLf.b(Blocks.cLf.xM().a(BlockDirt.aTC, BlockDirt$DirtType.aTE)), 10);
                        } else {
                            hashMultiset.add((Object)Blocks.cLd.b(Blocks.cLd.xM().a(BlockStone.bbw, BlockStone$EnumType.bbx)), 100);
                        }
                        d3 = 100.0;
                    } else {
                        g g3 = new g();
                        for (int i4 = 0; i4 < n2; ++i4) {
                            for (n9 = 0; n9 < n2; ++n9) {
                                int n18 = a2.aU(i4 + n14, n9 + n15) + 1;
                                IBlockState iBlockState = Blocks.cLc.xM();
                                if (n18 > 1) {
                                    while ((iBlockState = a2.L(g3.E(i4 + n14, --n18, n9 + n15))).df().b(iBlockState) == MapColor.bdC && n18 > 0) {
                                    }
                                    if (n18 > 0 && iBlockState.df().xb().zv()) {
                                        Block block;
                                        n8 = n18 - 1;
                                        do {
                                            block = a2.Q(i4 + n14, n8--, n9 + n15);
                                            ++n16;
                                        } while (n8 > 0 && block.xb().zv());
                                    }
                                }
                                d3 += (double)n18 / (double)(n2 * n2);
                                hashMultiset.add((Object)iBlockState.df().b(iBlockState));
                            }
                        }
                    }
                    n16 /= n2 * n2;
                    double d4 = (d3 - d2) * 4.0 / (double)(n2 + 4) + ((double)(i2 + i3 & 1) - 0.5) * 0.4;
                    n9 = 1;
                    if (d4 > 0.6) {
                        n9 = 2;
                    }
                    if (d4 < -0.6) {
                        n9 = 0;
                    }
                    if ((mapColor = (MapColor)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)hashMultiset), (Object)MapColor.bdC)) == MapColor.bdO) {
                        d4 = (double)n16 * 0.1 + (double)(i2 + i3 & 1) * 0.2;
                        n9 = 1;
                        if (d4 < 0.5) {
                            n9 = 2;
                        }
                        if (d4 > 0.9) {
                            n9 = 0;
                        }
                    }
                    d2 = d3;
                    if (i3 < 0 || n10 * n10 + n11 * n11 >= n7 * n7 || bl3 && (i2 + i3 & 1) == 0 || (by2 = f2.dTl[i2 + i3 * 128]) == (n8 = (int)((byte)(mapColor.ben * 4 + n9)))) continue;
                    f2.dTl[i2 + i3 * 128] = n8;
                    f2.br(i2, i3);
                    bl2 = true;
                }
            }
        }
    }

    @Override
    public void a(co co2, w w2, c c2, int n2, boolean bl2) {
        if (!w2.dDw) {
            f f2 = this.a(co2, w2);
            if (c2 instanceof net.minecraft.entity.player.a) {
                net.minecraft.entity.player.a a2 = (net.minecraft.entity.player.a)c2;
                f2.c(a2, co2);
            }
            if (bl2) {
                this.a(w2, c2, f2);
            }
        }
    }

    @Override
    public aj e(co co2, w w2, net.minecraft.entity.player.a a2) {
        return this.a(co2, w2).f(co2, w2, a2);
    }

    @Override
    public void c(co co2, w w2, net.minecraft.entity.player.a a2) {
        if (co2.aej() && co2.aek().eO("map_is_scaling")) {
            f f2 = Items.cRh.a(co2, w2);
            co2.gf(w2.gA("map"));
            f f3 = new f("map_" + co2.yc());
            f3.dTk = (byte)(f2.dTk + 1);
            if (f3.dTk > 4) {
                f3.dTk = (byte)4;
            }
            f3.a(f2.dTh, f2.dTi, f3.dTk);
            f3.dTj = f2.dTj;
            f3.Lw();
            w2.a("map_" + co2.yc(), f3);
        }
    }

    @Override
    public void a(co co2, net.minecraft.entity.player.a a2, List<String> list, boolean bl2) {
        f f2 = this.a(co2, a2.baU);
        if (bl2) {
            if (f2 == null) {
                list.add("Unknown map");
            } else {
                list.add("Scaling at 1:" + (1 << f2.dTk));
                list.add("(Level " + f2.dTk + "/4)");
            }
        }
    }
}

