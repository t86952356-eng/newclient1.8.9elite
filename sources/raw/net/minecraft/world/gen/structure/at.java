/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.gen.structure.av;
import net.minecraft.world.gen.structure.ay;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class at
extends av {
    public at() {
    }

    public at(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        this.a((ay)y2, list, random, 5, 3, true);
    }

    public static at k(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -5, -3, 0, 13, 14, 13, ao2);
        return at.d(w2) && y.a(list, w2) == null ? new at(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        int n3;
        this.a(w2, w3, 0, 3, 0, 12, 4, 12, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 5, 0, 12, 13, 12, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 0, 5, 0, 1, 12, 12, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 11, 5, 0, 12, 12, 12, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 2, 5, 11, 4, 12, 12, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 8, 5, 11, 10, 12, 12, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 5, 9, 11, 7, 12, 12, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 2, 5, 0, 4, 12, 1, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 8, 5, 0, 10, 12, 1, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 5, 9, 0, 7, 12, 1, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 2, 11, 2, 10, 12, 10, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 5, 8, 0, 7, 8, 0, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        for (n3 = 1; n3 <= 11; n3 += 2) {
            this.a(w2, w3, n3, 10, 0, n3, 11, 0, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
            this.a(w2, w3, n3, 10, 12, n3, 11, 12, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
            this.a(w2, w3, 0, 10, n3, 0, 11, n3, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
            this.a(w2, w3, 12, 10, n3, 12, 11, n3, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
            this.a(w2, Blocks.cNA.xM(), n3, 13, 0, w3);
            this.a(w2, Blocks.cNA.xM(), n3, 13, 12, w3);
            this.a(w2, Blocks.cNA.xM(), 0, 13, n3, w3);
            this.a(w2, Blocks.cNA.xM(), 12, 13, n3, w3);
            this.a(w2, Blocks.cNB.xM(), n3 + 1, 13, 0, w3);
            this.a(w2, Blocks.cNB.xM(), n3 + 1, 13, 12, w3);
            this.a(w2, Blocks.cNB.xM(), 0, 13, n3 + 1, w3);
            this.a(w2, Blocks.cNB.xM(), 12, 13, n3 + 1, w3);
        }
        this.a(w2, Blocks.cNB.xM(), 0, 13, 0, w3);
        this.a(w2, Blocks.cNB.xM(), 0, 13, 12, w3);
        this.a(w2, Blocks.cNB.xM(), 0, 13, 0, w3);
        this.a(w2, Blocks.cNB.xM(), 12, 13, 0, w3);
        for (n3 = 3; n3 <= 9; n3 += 2) {
            this.a(w2, w3, 1, 7, n3, 1, 8, n3, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
            this.a(w2, w3, 11, 7, n3, 11, 8, n3, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        }
        this.a(w2, w3, 4, 2, 0, 8, 2, 12, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 2, 4, 12, 2, 8, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 4, 0, 0, 8, 1, 3, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 4, 0, 9, 8, 1, 12, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 0, 4, 3, 1, 8, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 9, 0, 4, 12, 1, 8, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        for (n3 = 4; n3 <= 8; ++n3) {
            for (n2 = 0; n2 <= 2; ++n2) {
                this.b(w2, Blocks.cNA.xM(), n3, -1, n2, w3);
                this.b(w2, Blocks.cNA.xM(), n3, -1, 12 - n2, w3);
            }
        }
        for (n3 = 0; n3 <= 2; ++n3) {
            for (n2 = 4; n2 <= 8; ++n2) {
                this.b(w2, Blocks.cNA.xM(), n3, -1, n2, w3);
                this.b(w2, Blocks.cNA.xM(), 12 - n3, -1, n2, w3);
            }
        }
        this.a(w2, w3, 5, 5, 5, 7, 5, 7, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 6, 1, 6, 6, 4, 6, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, Blocks.cNA.xM(), 6, 0, 6, w3);
        this.a(w2, Blocks.cLm.xM(), 6, 5, 6, w3);
        b b2 = new b(this.bn(6, 6), this.iH(5), this.bo(6, 6));
        if (w3.k(b2)) {
            w2.a(Blocks.cLm, b2, random);
        }
        return true;
    }
}

