/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import java.util.Random;
import net.minecraft.enchantment.a;
import net.minecraft.enchantment.g;
import net.minecraft.entity.passive.ab;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.util.bt;
import net.minecraft.village.b;

class ad
implements ab {
    ad() {
    }

    @Override
    public void a(b b2, Random random) {
        a a2 = a.cpV[random.nextInt(a.cpV.length)];
        int n2 = bt.b(random, a2.Td(), a2.Te());
        co co2 = Items.cSh.a(new g(a2, n2));
        int n3 = 2 + random.nextInt(5 + n2 * 10) + 3 * n2;
        if (n3 > 64) {
            n3 = 64;
        }
        b2.add(new net.minecraft.village.a(new co(Items.cQP), new co(Items.cRS, n3), co2));
    }
}

