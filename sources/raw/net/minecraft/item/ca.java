/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class ca
extends d {
    public ca() {
        this.d(a.cpz);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        b b3;
        boolean bl2 = w2.L(b2).df().a(w2, b2);
        b b4 = b3 = bl2 ? b2 : b2.x(ao2);
        if (!a2.a(b3, ao2, co2)) {
            return false;
        }
        Block block = w2.L(b3).df();
        if (!w2.a(block, b3, false, ao2, null, co2)) {
            return false;
        }
        if (Blocks.cMh.d(w2, b3)) {
            --co2.cWZ;
            w2.d(b3, Blocks.cMh.xM());
            return true;
        }
        return false;
    }
}

