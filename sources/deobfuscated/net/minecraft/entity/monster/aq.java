/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.b;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.ap;
import net.minecraft.entity.r;

class aq
extends b {
    public aq(ap ap2, Class<? extends c> clazz) {
        super(ap2, clazz, 1.0, true);
    }

    @Override
    public boolean WD() {
        float f2 = this.cwA.ag(1.0f);
        if (f2 >= 0.5f && this.cwA.VB().nextInt(100) == 0) {
            this.cwA.S(null);
            return false;
        }
        return super.WD();
    }

    @Override
    protected double V(r r2) {
        return 4.0f + r2.width;
    }
}

