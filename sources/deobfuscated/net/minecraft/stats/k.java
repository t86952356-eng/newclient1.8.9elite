/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.stats;

import net.minecraft.stats.d;
import net.minecraft.stats.f;
import net.minecraft.stats.n;
import net.minecraft.util.ba;

public class k
extends f {
    public k(String string, ba ba2, d d2) {
        super(string, ba2, d2);
    }

    public k(String string, ba ba2) {
        super(string, ba2);
    }

    @Override
    public f apr() {
        super.apr();
        n.dpD.add(this);
        return this;
    }
}

