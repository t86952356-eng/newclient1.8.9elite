/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.creativetab.a;
import net.minecraft.entity.m;
import net.minecraft.entity.p;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class bl
extends d {
    public bl() {
        this.d(a.cpE);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        Block block = w2.L(b2).df();
        if (block instanceof BlockFence) {
            if (w2.dDw) {
                return true;
            }
            bl.b(a2, w2, b2);
            return true;
        }
        return false;
    }

    public static boolean b(net.minecraft.entity.player.a a2, w w2, b b2) {
        m m2 = m.aa(w2, b2);
        boolean bl2 = false;
        double d2 = 7.0;
        int n2 = b2.wt();
        int n3 = b2.wu();
        int n4 = b2.wx();
        for (p p2 : w2.a(p.class, new net.minecraft.util.a((double)n2 - 7.0, (double)n3 - 7.0, (double)n4 - 7.0, (double)n2 + 7.0, (double)n3 + 7.0, (double)n4 + 7.0))) {
            if (!p2.Vq() || p2.Vr() != a2) continue;
            if (m2 == null) {
                m2 = m.Z(w2, b2);
            }
            p2.a(m2, true);
            bl2 = true;
        }
        return bl2;
    }
}

