/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class bf
extends d {
    public bf() {
        this.cVn = 1;
        this.fW(64);
        this.d(a.cpE);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        if (!a2.a(b2 = b2.x(ao2), ao2, co2)) {
            return false;
        }
        if (w2.L(b2).df().xb() == Material.beo) {
            w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, "fire.ignite", 1.0f, cVm.nextFloat() * 0.4f + 0.8f);
            w2.d(b2, Blocks.cMd.xM());
        }
        co2.b(1, (r)a2);
        return true;
    }
}

