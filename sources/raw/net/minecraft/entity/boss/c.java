/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.boss;

import net.minecraft.entity.ac;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;

public class c
extends net.minecraft.entity.c {
    public final ac cBq;
    public final String cBr;

    public c(ac ac2, String string, float f2, float f3) {
        super(ac2.de());
        this.o(f2, f3);
        this.cBq = ac2;
        this.cBr = string;
    }

    @Override
    protected void IA() {
    }

    @Override
    protected void e(n n2) {
    }

    @Override
    protected void d(n n2) {
    }

    @Override
    public boolean TO() {
        return true;
    }

    @Override
    public boolean a(ad ad2, float f2) {
        return !this.a(ad2) && this.cBq.a(this, ad2, f2);
    }

    @Override
    public boolean W(net.minecraft.entity.c c2) {
        return this == c2 || this.cBq == c2;
    }
}

