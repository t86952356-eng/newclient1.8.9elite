/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.av;
import net.minecraft.world.gen.structure.ay;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class ap
extends av {
    public ap() {
    }

    public ap(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        this.a((ay)y2, list, random, 2, 0, false);
        this.b((ay)y2, list, random, 0, 2, false);
        this.c((ay)y2, list, random, 0, 2, false);
    }

    public static ap g(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -2, 0, 0, 7, 9, 7, ao2);
        return ap.d(w2) && y.a(list, w2) == null ? new ap(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        this.a(w2, w3, 0, 0, 0, 6, 1, 6, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 2, 0, 6, 7, 6, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 0, 2, 0, 1, 6, 0, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 2, 6, 1, 6, 6, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 5, 2, 0, 6, 6, 0, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 5, 2, 6, 6, 6, 6, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 2, 0, 0, 6, 1, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 2, 5, 0, 6, 6, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 6, 2, 0, 6, 6, 1, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 6, 2, 5, 6, 6, 6, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 2, 6, 0, 4, 6, 0, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 2, 5, 0, 4, 5, 0, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 2, 6, 6, 4, 6, 6, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 2, 5, 6, 4, 5, 6, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 0, 6, 2, 0, 6, 4, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 5, 2, 0, 5, 4, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 6, 6, 2, 6, 6, 4, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 6, 5, 2, 6, 5, 4, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        for (int i2 = 0; i2 <= 6; ++i2) {
            for (int i3 = 0; i3 <= 6; ++i3) {
                this.b(w2, Blocks.cNA.xM(), i2, -1, i3, w3);
            }
        }
        return true;
    }
}

