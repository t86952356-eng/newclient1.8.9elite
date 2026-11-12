/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.potion;

import net.minecraft.entity.ai.attributes.c;
import net.minecraft.entity.r;
import net.minecraft.potion.a;
import net.minecraft.util.cm;

public class b
extends a {
    protected b(int n2, cm cm2, boolean bl2, int n3) {
        super(n2, cm2, bl2, n3);
    }

    @Override
    public void a(r r2, c c2, int n2) {
        r2.bb(r2.Wi() - (float)(4 * (n2 + 1)));
        super.a(r2, c2, n2);
    }

    @Override
    public void b(r r2, c c2, int n2) {
        r2.bb(r2.Wi() + (float)(4 * (n2 + 1)));
        super.b(r2, c2, n2);
    }
}

