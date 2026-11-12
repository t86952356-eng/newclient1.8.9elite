/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen;

import java.util.Random;
import net.minecraft.world.chunk.f;
import net.minecraft.world.chunk.h;
import net.minecraft.world.w;

public class m {
    protected int dNx = 8;
    protected Random ta = new Random();
    protected w baU;

    public void a(h h2, w w2, int n2, int n3, f f2) {
        int n4 = this.dNx;
        this.baU = w2;
        this.ta.setSeed(w2.avD());
        long l2 = this.ta.nextLong();
        long l3 = this.ta.nextLong();
        for (int i2 = n2 - n4; i2 <= n2 + n4; ++i2) {
            for (int i3 = n3 - n4; i3 <= n3 + n4; ++i3) {
                long l4 = (long)i2 * l2;
                long l5 = (long)i3 * l3;
                this.ta.setSeed(l4 ^ l5 ^ w2.avD());
                this.a(w2, i2, i3, n2, n3, f2);
            }
        }
    }

    protected void a(w w2, int n2, int n3, int n4, int n5, f f2) {
    }
}

