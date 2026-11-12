/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import java.util.Random;
import net.minecraft.entity.passive.ab;
import net.minecraft.entity.passive.ag;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.village.a;
import net.minecraft.village.b;

class af
implements ab {
    public co cHN;
    public ag cHO;

    public af(d d2, ag ag2) {
        this.cHN = new co(d2);
        this.cHO = ag2;
    }

    public af(co co2, ag ag2) {
        this.cHN = co2;
        this.cHO = ag2;
    }

    @Override
    public void a(b b2, Random random) {
        co co2;
        co co3;
        int n2 = 1;
        if (this.cHO != null) {
            n2 = this.cHO.e(random);
        }
        if (n2 < 0) {
            co3 = new co(Items.cRS, 1, 0);
            co2 = new co(this.cHN.bP(), -n2, this.cHN.yc());
        } else {
            co3 = new co(Items.cRS, n2, 0);
            co2 = new co(this.cHN.bP(), 1, this.cHN.yc());
        }
        b2.add(new a(co3, co2));
    }
}

