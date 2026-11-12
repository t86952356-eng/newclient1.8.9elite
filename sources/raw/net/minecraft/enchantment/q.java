/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import net.minecraft.enchantment.a;
import net.minecraft.enchantment.o;
import net.minecraft.entity.z;

final class q
implements o {
    public float cqP;
    public z cqQ;

    private q() {
    }

    @Override
    public void a(a a2, int n2) {
        this.cqP += a2.a(n2, this.cqQ);
    }
}

