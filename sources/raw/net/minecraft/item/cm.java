/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.entity.player.a;
import net.minecraft.init.Items;
import net.minecraft.item.bg;
import net.minecraft.item.co;
import net.minecraft.world.w;

public class cm
extends bg {
    public cm(int n2) {
        super(n2, false);
        this.fU(1);
    }

    @Override
    public co b(co co2, w w2, a a2) {
        super.b(co2, w2, a2);
        return new co(Items.cPD);
    }
}

