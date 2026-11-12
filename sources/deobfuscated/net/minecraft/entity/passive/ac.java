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

class ac
implements ab {
    public co cHH;
    public ag cHI;
    public co cHJ;
    public ag cHK;

    public ac(d d2, ag ag2, d d3, ag ag3) {
        this.cHH = new co(d2);
        this.cHI = ag2;
        this.cHJ = new co(d3);
        this.cHK = ag3;
    }

    @Override
    public void a(b b2, Random random) {
        int n2 = 1;
        if (this.cHI != null) {
            n2 = this.cHI.e(random);
        }
        int n3 = 1;
        if (this.cHK != null) {
            n3 = this.cHK.e(random);
        }
        b2.add(new a(new co(this.cHH.bP(), n2, this.cHH.yc()), new co(Items.cRS), new co(this.cHJ.bP(), n3, this.cHJ.yc())));
    }
}

