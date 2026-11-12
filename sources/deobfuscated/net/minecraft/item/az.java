/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class az
extends d {
    public az() {
        this.d(a.cpB);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        if (w2.dDw) {
            return true;
        }
        if (!a2.a(b2 = b2.x(ao2), ao2, co2)) {
            return false;
        }
        if (w2.L(b2).df().xb() == Material.beo) {
            w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, "item.fireCharge.use", 1.0f, (cVm.nextFloat() - cVm.nextFloat()) * 0.2f + 1.0f);
            w2.d(b2, Blocks.cMd.xM());
        }
        if (!a2.cIt.cJM) {
            --co2.cWZ;
        }
        return true;
    }
}

