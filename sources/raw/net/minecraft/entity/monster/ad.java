/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.ag;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.ab;
import net.minecraft.entity.player.a;

class ad
extends ag<a> {
    public ad(ab ab2) {
        super((j)ab2, a.class, true);
    }

    @Override
    public boolean WC() {
        return ((ab)this.czA).ZF() && super.WC();
    }
}

