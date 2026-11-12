/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import net.minecraft.entity.ae;
import net.minecraft.entity.player.a;
import net.minecraft.inventory.aj;
import net.minecraft.item.co;
import net.minecraft.util.ba;
import net.minecraft.util.t;
import net.minecraft.village.b;

public class ai
implements ae {
    private final aj cwh;
    private final a cwi;
    private b cwj;
    private final ba cwk;

    public ai(a a2, ba ba2) {
        this.cwi = a2;
        this.cwk = ba2;
        this.cwh = new aj(a2, this);
    }

    @Override
    public a WB() {
        return this.cwi;
    }

    @Override
    public void s(a a2) {
    }

    @Override
    public b t(a a2) {
        return this.cwj;
    }

    @Override
    public void a(b b2) {
        this.cwj = b2;
    }

    @Override
    public void a(net.minecraft.village.a a2) {
        a2.aue();
    }

    @Override
    public void Y(co co2) {
    }

    @Override
    public ba xW() {
        return this.cwk != null ? this.cwk : new t("entity.Villager.name", new Object[0]);
    }
}

