/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.gen.structure.c;
import net.minecraft.world.gen.structure.cb;
import net.minecraft.world.gen.structure.e;
import net.minecraft.world.gen.structure.g;
import net.minecraft.world.w;

public class l
extends cb {
    public l() {
    }

    public l(w w2, Random random, int n2, int n3) {
        super(n2, n3);
        j j2 = w2.aF(new b(n2 * 16 + 8, 0, n3 * 16 + 8));
        if (j2 != j.dGA && j2 != j.dGB) {
            if (j2 == j.dGl) {
                g g2 = new g(random, n2 * 16, n3 * 16);
                this.dRQ.add(g2);
            } else if (j2 == j.dGh || j2 == j.dGw) {
                c c2 = new c(random, n2 * 16, n3 * 16);
                this.dRQ.add(c2);
            }
        } else {
            e e2 = new e(random, n2 * 16, n3 * 16);
            this.dRQ.add(e2);
        }
        this.UJ();
    }
}

