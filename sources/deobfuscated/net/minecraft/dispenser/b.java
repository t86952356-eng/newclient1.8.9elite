/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.dispenser;

import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.e;
import net.minecraft.dispenser.h;
import net.minecraft.entity.ag;
import net.minecraft.entity.c;
import net.minecraft.item.co;
import net.minecraft.util.ao;
import net.minecraft.world.w;

public abstract class b
extends a {
    @Override
    public co b(e e2, co co2) {
        w w2 = e2.de();
        h h2 = BlockDispenser.a(e2);
        ao ao2 = BlockDispenser.aQ(e2.zg());
        ag ag2 = this.a(w2, h2);
        ag2.c(ao2.asH(), (float)ao2.asI() + 0.1f, ao2.asJ(), this.Tb(), this.Ta());
        w2.G((c)((Object)ag2));
        co2.ge(1);
        return co2;
    }

    @Override
    protected void b(e e2) {
        e2.de().e(1002, e2.dg(), 0);
    }

    protected abstract ag a(w var1, h var2);

    protected float Ta() {
        return 6.0f;
    }

    protected float Tb() {
        return 1.1f;
    }
}

