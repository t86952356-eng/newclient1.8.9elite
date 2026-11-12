/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import java.util.Random;
import net.minecraft.util.cw;

class ag
extends cw<Integer, Integer> {
    public ag(int n2, int n3) {
        super(n2, n3);
    }

    public int e(Random random) {
        return (Integer)this.wi() >= (Integer)this.wj() ? (Integer)this.wi() : (Integer)this.wi() + random.nextInt((Integer)this.wj() - (Integer)this.wi() + 1);
    }
}

