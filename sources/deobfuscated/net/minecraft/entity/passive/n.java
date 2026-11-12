/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.entity.ai.b;
import net.minecraft.entity.passive.l;
import net.minecraft.entity.r;

class n
extends b {
    public n(l l2) {
        super(l2, r.class, 1.4, true);
    }

    @Override
    protected double V(r r2) {
        return 4.0f + r2.width;
    }
}

