/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.BlockEndPortalFrame;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.world.w;

public class aw
extends d {
    public aw() {
        this.d(a.cpB);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        IBlockState iBlockState = w2.L(b2);
        if (a2.a(b2.x(ao2), ao2, co2) && iBlockState.df() == Blocks.cNI && !iBlockState.b(BlockEndPortalFrame.aUv).booleanValue()) {
            Object object;
            if (w2.dDw) {
                return true;
            }
            w2.a(b2, iBlockState.a(BlockEndPortalFrame.aUv, true), 2);
            w2.f(b2, Blocks.cNI);
            --co2.cWZ;
            for (int i2 = 0; i2 < 16; ++i2) {
                double d2 = (float)b2.wt() + (5.0f + cVm.nextFloat() * 6.0f) / 16.0f;
                double d3 = (float)b2.wu() + 0.8125f;
                double d4 = (float)b2.wx() + (5.0f + cVm.nextFloat() * 6.0f) / 16.0f;
                double d5 = 0.0;
                double d6 = 0.0;
                double d7 = 0.0;
                w2.a(as.dxh, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
            }
            ao ao3 = iBlockState.b(BlockEndPortalFrame.aUu);
            int n2 = 0;
            int n3 = 0;
            boolean bl2 = false;
            boolean bl3 = true;
            ao ao4 = ao3.asD();
            for (int i3 = -2; i3 <= 2; ++i3) {
                b b3 = b2.d(ao4, i3);
                object = w2.L(b3);
                if (object.df() != Blocks.cNI) continue;
                if (!object.b(BlockEndPortalFrame.aUv).booleanValue()) {
                    bl3 = false;
                    break;
                }
                n3 = i3;
                if (bl2) continue;
                n2 = i3;
                bl2 = true;
            }
            if (bl3 && n3 == n2 + 2) {
                int n4;
                b b4 = b2.d(ao3, 4);
                for (n4 = n2; n4 <= n3; ++n4) {
                    object = b4.d(ao4, n4);
                    IBlockState iBlockState2 = w2.L((b)object);
                    if (iBlockState2.df() == Blocks.cNI && iBlockState2.b(BlockEndPortalFrame.aUv).booleanValue()) continue;
                    bl3 = false;
                    break;
                }
                block3: for (n4 = n2 - 1; n4 <= n3 + 1; n4 += 4) {
                    b4 = b2.d(ao4, n4);
                    for (int i4 = 1; i4 <= 3; ++i4) {
                        b b5 = b4.d(ao3, i4);
                        IBlockState iBlockState3 = w2.L(b5);
                        if (iBlockState3.df() == Blocks.cNI && iBlockState3.b(BlockEndPortalFrame.aUv).booleanValue()) continue;
                        bl3 = false;
                        continue block3;
                    }
                }
                if (bl3) {
                    for (n4 = n2; n4 <= n3; ++n4) {
                        b4 = b2.d(ao4, n4);
                        for (int i5 = 1; i5 <= 3; ++i5) {
                            b b6 = b4.d(ao3, i5);
                            w2.a(b6, Blocks.cNH.xM(), 2);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public co a(co co2, w w2, net.minecraft.entity.player.a a2) {
        b b2;
        ce ce2 = this.a(w2, a2, false);
        if (ce2 != null && ce2.dzu == cf.dzy && w2.L(ce2.dg()).df() == Blocks.cNI) {
            return co2;
        }
        if (!w2.dDw && (b2 = w2.b("Stronghold", new b(a2))) != null) {
            net.minecraft.entity.item.d d2 = new net.minecraft.entity.item.d(w2, a2.gW, a2.gX, a2.gY);
            d2.ai(b2);
            w2.G(d2);
            w2.a((c)a2, "random.bow", 0.5f, 0.4f / (cVm.nextFloat() * 0.4f + 0.8f));
            w2.b(null, 1002, new b(a2), 0);
            if (!a2.cIt.cJM) {
                --co2.cWZ;
            }
            a2.a(n.dqE[d.p(this)]);
        }
        return co2;
    }
}

