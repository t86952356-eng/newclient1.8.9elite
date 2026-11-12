/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.ag;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.ap;
import net.minecraft.entity.r;

class ar<T extends r>
extends ag {
    public ar(ap ap2, Class<T> clazz) {
        super((j)ap2, clazz, true);
    }

    @Override
    public boolean WC() {
        float f2 = this.czA.ag(1.0f);
        return !(f2 >= 0.5f) && super.WC();
    }
}

