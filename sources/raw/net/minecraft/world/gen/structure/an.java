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

public class an
extends av {
    public an() {
    }

    public an(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        int n2 = 1;
        if (this.dQJ == ao.dwu || this.dQJ == ao.dws) {
            n2 = 5;
        }
        this.b((ay)y2, list, random, 0, n2, random.nextInt(8) > 0);
        this.c((ay)y2, list, random, 0, n2, random.nextInt(8) > 0);
    }

    public static an e(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -3, 0, 0, 9, 7, 9, ao2);
        return an.d(w2) && y.a(list, w2) == null ? new an(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        this.a(w2, w3, 0, 0, 0, 8, 1, 8, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 2, 0, 8, 5, 8, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 0, 6, 0, 8, 6, 5, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 2, 0, 2, 5, 0, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 6, 2, 0, 8, 5, 0, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 1, 3, 0, 1, 4, 0, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 7, 3, 0, 7, 4, 0, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 0, 2, 4, 8, 2, 8, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 1, 1, 4, 2, 2, 4, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 6, 1, 4, 7, 2, 4, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 0, 3, 8, 8, 3, 8, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 0, 3, 6, 0, 3, 7, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 8, 3, 6, 8, 3, 7, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 0, 3, 4, 0, 5, 5, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 8, 3, 4, 8, 5, 5, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 1, 3, 5, 2, 5, 5, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 6, 3, 5, 7, 5, 5, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 1, 4, 5, 1, 5, 5, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 7, 4, 5, 7, 5, 5, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        for (int i2 = 0; i2 <= 5; ++i2) {
            for (int i3 = 0; i3 <= 8; ++i3) {
                this.b(w2, Blocks.cNA.xM(), i3, -1, i2, w3);
            }
        }
        return true;
    }
}

