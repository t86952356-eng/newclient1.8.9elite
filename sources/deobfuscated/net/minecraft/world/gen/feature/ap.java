/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.m;
import net.minecraft.util.b;
import net.minecraft.util.dg;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class ap
extends ao {
    private final List<dg> dPi;
    private final int dPj;

    public ap(List<dg> list, int n2) {
        this.dPi = list;
        this.dPj = n2;
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        Block block;
        while (((block = w2.L(b2).df()).xb() == Material.beo || block.xb() == Material.bex) && b2.wu() > 1) {
            b2 = b2.aqY();
        }
        if (b2.wu() < 1) {
            return false;
        }
        b2 = b2.aqX();
        for (int i2 = 0; i2 < 4; ++i2) {
            b b3 = b2.C(random.nextInt(4) - random.nextInt(4), random.nextInt(3) - random.nextInt(3), random.nextInt(4) - random.nextInt(4));
            if (!w2.aG(b3) || !w.v(w2, b3.aqY())) continue;
            w2.a(b3, Blocks.cMg.xM(), 2);
            d d2 = w2.K(b3);
            if (d2 instanceof m) {
                dg.a(random, this.dPi, (m)d2, this.dPj);
            }
            b b4 = b3.arc();
            b b5 = b3.arb();
            b b6 = b3.aqZ();
            b b7 = b3.ara();
            if (w2.aG(b5) && w.v(w2, b5.aqY())) {
                w2.a(b5, Blocks.cMc.xM(), 2);
            }
            if (w2.aG(b4) && w.v(w2, b4.aqY())) {
                w2.a(b4, Blocks.cMc.xM(), 2);
            }
            if (w2.aG(b6) && w.v(w2, b6.aqY())) {
                w2.a(b6, Blocks.cMc.xM(), 2);
            }
            if (w2.aG(b7) && w.v(w2, b7.aqY())) {
                w2.a(b7, Blocks.cMc.xM(), 2);
            }
            return true;
        }
        return false;
    }
}

