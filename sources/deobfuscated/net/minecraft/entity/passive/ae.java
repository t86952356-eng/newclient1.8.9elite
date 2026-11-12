/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import java.util.Random;
import net.minecraft.enchantment.l;
import net.minecraft.entity.passive.ab;
import net.minecraft.entity.passive.ag;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.village.a;
import net.minecraft.village.b;

class ae
implements ab {
    public co cHL;
    public ag cHM;

    public ae(d d2, ag ag2) {
        this.cHL = new co(d2);
        this.cHM = ag2;
    }

    @Override
    public void a(b b2, Random random) {
        int n2 = 1;
        if (this.cHM != null) {
            n2 = this.cHM.e(random);
        }
        co co2 = new co(Items.cRS, n2, 0);
        co co3 = new co(this.cHL.bP(), 1, this.cHL.yc());
        co3 = l.a(random, co3, 5 + random.nextInt(15));
        b2.add(new a(co2, co3));
    }
}

