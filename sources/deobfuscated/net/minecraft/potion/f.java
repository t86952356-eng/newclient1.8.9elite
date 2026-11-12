/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.potion;

import net.minecraft.entity.ai.attributes.c;
import net.minecraft.entity.r;
import net.minecraft.potion.a;
import net.minecraft.util.cm;

public class f
extends a {
    public f(int n2, cm cm2, boolean bl2, int n3) {
        super(n2, cm2, bl2, n3);
    }

    @Override
    public void a(r r2, c c2, int n2) {
        super.a(r2, c2, n2);
        if (r2.getHealth() > r2.getMaxHealth()) {
            r2.aY(r2.getMaxHealth());
        }
    }
}

