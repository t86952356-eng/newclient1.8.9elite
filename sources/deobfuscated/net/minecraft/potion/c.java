/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.potion;

import net.minecraft.potion.a;
import net.minecraft.util.cm;

public class c
extends a {
    protected c(int n2, cm cm2, boolean bl2, int n3) {
        super(n2, cm2, bl2, n3);
    }

    @Override
    public double a(int n2, net.minecraft.entity.ai.attributes.a a2) {
        return this.id == a.dgN.id ? (double)(-0.5f * (float)(n2 + 1)) : 1.3 * (double)(n2 + 1);
    }
}

