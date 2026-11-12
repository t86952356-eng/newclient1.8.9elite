/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import net.minecraft.enchantment.a;
import net.minecraft.enchantment.z;
import net.minecraft.util.cm;

public class s
extends a {
    protected s(int n2, cm cm2, int n3, z z2) {
        super(n2, cm2, n3, z2);
        if (z2 == z.crd) {
            this.eb("lootBonusDigger");
        } else if (z2 == z.cre) {
            this.eb("lootBonusFishing");
        } else {
            this.eb("lootBonus");
        }
    }

    @Override
    public int ei(int n2) {
        return 15 + (n2 - 1) * 9;
    }

    @Override
    public int ej(int n2) {
        return super.ei(n2) + 50;
    }

    @Override
    public int Te() {
        return 3;
    }

    @Override
    public boolean a(a a2) {
        return super.a(a2) && a2.cqw != s.cqn.cqw;
    }
}

