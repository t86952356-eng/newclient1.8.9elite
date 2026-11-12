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

class aa
implements ab {
    public d cHF;
    public ag cHG;

    public aa(d d2, ag ag2) {
        this.cHF = d2;
        this.cHG = ag2;
    }

    @Override
    public void a(b b2, Random random) {
        int n2 = 1;
        if (this.cHG != null) {
            n2 = this.cHG.e(random);
        }
        b2.add(new a(new co(this.cHF, n2, 0), Items.cRS));
    }
}

