/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import net.minecraft.block.BlockAir;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.settings.a;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.chunk.g;
import net.minecraft.world.w;
import net.optifine.d;

public class h {
    public static void a(a a2, w w2) {
        c c2;
        net.minecraft.world.chunk.h h2;
        if (a2 != null) {
            int n2 = 3;
            if (a2.ciG) {
                n2 = 1;
            }
            BlockAir.d(Blocks.cLl, n2);
            BlockAir.d(Blocks.cLk, n2);
        }
        if (w2 != null && (h2 = w2.avF()) != null && (c2 = net.minecraft.src.a.AZ().BC()) != null) {
            int n3 = (int)c2.gW / 16;
            int n4 = (int)c2.gY / 16;
            int n5 = n3 - 512;
            int n6 = n3 + 512;
            int n7 = n4 - 512;
            int n8 = n4 + 512;
            int n9 = 0;
            for (int i2 = n5; i2 < n6; ++i2) {
                for (int i3 = n7; i3 < n8; ++i3) {
                    net.minecraft.world.chunk.a a3;
                    if (!h2.E(i2, i3) || (a3 = h2.H(i2, i3)) == null || a3 instanceof g) continue;
                    int n10 = i2 << 4;
                    int n11 = i3 << 4;
                    int n12 = n10 + 16;
                    int n13 = n11 + 16;
                    d d2 = new d(0, 0, 0);
                    d d3 = new d(0, 0, 0);
                    for (int i4 = n10; i4 < n12; ++i4) {
                        block3: for (int i5 = n11; i5 < n13; ++i5) {
                            d2.ah(i4, 0, i5);
                            b b2 = w2.aS(d2);
                            for (int i6 = 0; i6 < b2.wu(); ++i6) {
                                d3.ah(i4, i6, i5);
                                IBlockState iBlockState = w2.L(d3);
                                if (iBlockState.df().xb() != Material.bev) continue;
                                w2.x(i4, i5, d3.wu(), b2.wu());
                                ++n9;
                                continue block3;
                            }
                        }
                    }
                }
            }
            if (n9 > 0) {
                String string = "server";
                if (net.minecraft.src.a.anb()) {
                    string = "client";
                }
                net.minecraft.src.a.fN("ClearWater (" + string + ") relighted " + n9 + " chunks");
            }
        }
    }
}

