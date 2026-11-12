/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.g;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class v
extends ao {
    private final Block dOE;

    public v(Block block) {
        this.dOE = block;
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        Object object;
        int n2;
        int n3;
        b2 = b2.C(-8, 0, -8);
        while (b2.wu() > 5 && w2.aG(b2)) {
            b2 = b2.aqY();
        }
        if (b2.wu() <= 4) {
            return false;
        }
        b2 = b2.hr(4);
        boolean[] blArray = new boolean[2048];
        int n4 = random.nextInt(4) + 4;
        for (n3 = 0; n3 < n4; ++n3) {
            double d2 = random.nextDouble() * 6.0 + 3.0;
            double d3 = random.nextDouble() * 4.0 + 2.0;
            double d4 = random.nextDouble() * 6.0 + 3.0;
            double d5 = random.nextDouble() * (16.0 - d2 - 2.0) + 1.0 + d2 / 2.0;
            double d6 = random.nextDouble() * (8.0 - d3 - 4.0) + 2.0 + d3 / 2.0;
            double d7 = random.nextDouble() * (16.0 - d4 - 2.0) + 1.0 + d4 / 2.0;
            for (int i2 = 1; i2 < 15; ++i2) {
                for (int i3 = 1; i3 < 15; ++i3) {
                    for (int i4 = 1; i4 < 7; ++i4) {
                        double d8 = ((double)i2 - d5) / (d2 / 2.0);
                        double d9 = ((double)i4 - d6) / (d3 / 2.0);
                        double d10 = ((double)i3 - d7) / (d4 / 2.0);
                        double d11 = d8 * d8 + d9 * d9 + d10 * d10;
                        if (!(d11 < 1.0)) continue;
                        blArray[(i2 * 16 + i3) * 8 + i4] = true;
                    }
                }
            }
        }
        for (n3 = 0; n3 < 16; ++n3) {
            for (int i5 = 0; i5 < 16; ++i5) {
                for (n2 = 0; n2 < 8; ++n2) {
                    boolean bl2;
                    boolean bl3 = bl2 = !blArray[(n3 * 16 + i5) * 8 + n2] && (n3 < 15 && blArray[((n3 + 1) * 16 + i5) * 8 + n2] || n3 > 0 && blArray[((n3 - 1) * 16 + i5) * 8 + n2] || i5 < 15 && blArray[(n3 * 16 + i5 + 1) * 8 + n2] || i5 > 0 && blArray[(n3 * 16 + (i5 - 1)) * 8 + n2] || n2 < 7 && blArray[(n3 * 16 + i5) * 8 + n2 + 1] || n2 > 0 && blArray[(n3 * 16 + i5) * 8 + (n2 - 1)]);
                    if (!bl2) continue;
                    object = w2.L(b2.C(n3, n2, i5)).df().xb();
                    if (n2 >= 4 && ((Material)object).zv()) {
                        return false;
                    }
                    if (n2 >= 4 || ((Material)object).zw() || w2.L(b2.C(n3, n2, i5)).df() == this.dOE) continue;
                    return false;
                }
            }
        }
        for (n3 = 0; n3 < 16; ++n3) {
            for (int i6 = 0; i6 < 16; ++i6) {
                for (n2 = 0; n2 < 8; ++n2) {
                    if (!blArray[(n3 * 16 + i6) * 8 + n2]) continue;
                    w2.a(b2.C(n3, n2, i6), n2 >= 4 ? Blocks.cLc.xM() : this.dOE.xM(), 2);
                }
            }
        }
        for (n3 = 0; n3 < 16; ++n3) {
            for (int i7 = 0; i7 < 16; ++i7) {
                for (n2 = 4; n2 < 8; ++n2) {
                    b b3;
                    if (!blArray[(n3 * 16 + i7) * 8 + n2] || w2.L(b3 = b2.C(n3, n2 - 1, i7)).df() != Blocks.cLf || w2.b(g.dBZ, b2.C(n3, n2, i7)) <= 0) continue;
                    object = w2.aF(b3);
                    if (((j)object).dGZ.df() == Blocks.cNy) {
                        w2.a(b3, Blocks.cNy.xM(), 2);
                        continue;
                    }
                    w2.a(b3, Blocks.cLe.xM(), 2);
                }
            }
        }
        if (this.dOE.xb() == Material.bew) {
            for (n3 = 0; n3 < 16; ++n3) {
                for (int i8 = 0; i8 < 16; ++i8) {
                    for (n2 = 0; n2 < 8; ++n2) {
                        boolean bl4;
                        boolean bl5 = bl4 = !blArray[(n3 * 16 + i8) * 8 + n2] && (n3 < 15 && blArray[((n3 + 1) * 16 + i8) * 8 + n2] || n3 > 0 && blArray[((n3 - 1) * 16 + i8) * 8 + n2] || i8 < 15 && blArray[(n3 * 16 + i8 + 1) * 8 + n2] || i8 > 0 && blArray[(n3 * 16 + (i8 - 1)) * 8 + n2] || n2 < 7 && blArray[(n3 * 16 + i8) * 8 + n2 + 1] || n2 > 0 && blArray[(n3 * 16 + i8) * 8 + (n2 - 1)]);
                        if (!bl4 || n2 >= 4 && random.nextInt(2) == 0 || !w2.L(b2.C(n3, n2, i8)).df().xb().zw()) continue;
                        w2.a(b2.C(n3, n2, i8), Blocks.cLd.xM(), 2);
                    }
                }
            }
        }
        if (this.dOE.xb() == Material.bev) {
            for (n3 = 0; n3 < 16; ++n3) {
                for (int i9 = 0; i9 < 16; ++i9) {
                    n2 = 4;
                    if (!w2.aW(b2.C(n3, 4, i9))) continue;
                    w2.a(b2.C(n3, 4, i9), Blocks.cMK.xM(), 2);
                }
            }
        }
        return true;
    }
}

