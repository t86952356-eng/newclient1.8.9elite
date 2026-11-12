/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.aj;
import net.minecraft.entity.monster.aa;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class p
extends aa {
    public p(w w2) {
        super(w2);
        this.o(this.width * 6.0f, this.height * 6.0f);
    }

    @Override
    public float getEyeHeight() {
        return 10.440001f;
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(100.0);
        this.a(aj.cwp).ap(0.5);
        this.a(aj.cwq).ap(50.0);
    }

    @Override
    public float ad(b b2) {
        return this.baU.aR(b2) - 0.5f;
    }
}

