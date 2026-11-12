/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.v;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.ab;
import net.minecraft.entity.r;

class ac
extends v {
    public ac(ab ab2) {
        super((j)ab2, true, new Class[0]);
    }

    @Override
    protected void a(j j2, r r2) {
        super.a(j2, r2);
        if (j2 instanceof ab) {
            ((ab)j2).an(r2);
        }
    }
}

