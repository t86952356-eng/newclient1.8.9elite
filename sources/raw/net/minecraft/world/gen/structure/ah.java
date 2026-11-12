/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.world.gen.structure.af;
import net.minecraft.world.gen.structure.cb;
import net.minecraft.world.w;

public class ah
extends cb {
    public ah() {
    }

    public ah(w w2, Random random, int n2, int n3) {
        super(n2, n3);
        af af2 = new af(0, random, (n2 << 4) + 2, (n3 << 4) + 2);
        this.dRQ.add(af2);
        af2.a(af2, this.dRQ, random);
        this.UJ();
        this.a(w2, random, 10);
    }
}

