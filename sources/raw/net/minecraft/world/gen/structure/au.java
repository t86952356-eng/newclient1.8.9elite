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

public class au
extends av {
    public au() {
    }

    public au(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        this.a((ay)y2, list, random, 5, 3, true);
        this.a((ay)y2, list, random, 5, 11, true);
    }

    public static au l(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -5, -3, 0, 13, 14, 13, ao2);
        return au.d(w2) && y.a(list, w2) == null ? new au(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
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
        for (n6 = 1; n6 <= 11; n6 += 2) {
            this.a(w2, w3, n6, 10, 0, n6, 11, 0, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
            this.a(w2, w3, n6, 10, 12, n6, 11, 12, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
            this.a(w2, w3, 0, 10, n6, 0, 11, n6, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
            this.a(w2, w3, 12, 10, n6, 12, 11, n6, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
            this.a(w2, Blocks.cNA.xM(), n6, 13, 0, w3);
            this.a(w2, Blocks.cNA.xM(), n6, 13, 12, w3);
            this.a(w2, Blocks.cNA.xM(), 0, 13, n6, w3);
            this.a(w2, Blocks.cNA.xM(), 12, 13, n6, w3);
            this.a(w2, Blocks.cNB.xM(), n6 + 1, 13, 0, w3);
            this.a(w2, Blocks.cNB.xM(), n6 + 1, 13, 12, w3);
            this.a(w2, Blocks.cNB.xM(), 0, 13, n6 + 1, w3);
            this.a(w2, Blocks.cNB.xM(), 12, 13, n6 + 1, w3);
        }
        this.a(w2, Blocks.cNB.xM(), 0, 13, 0, w3);
        this.a(w2, Blocks.cNB.xM(), 0, 13, 12, w3);
        this.a(w2, Blocks.cNB.xM(), 0, 13, 0, w3);
        this.a(w2, Blocks.cNB.xM(), 12, 13, 0, w3);
        for (n6 = 3; n6 <= 9; n6 += 2) {
            this.a(w2, w3, 1, 7, n6, 1, 8, n6, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
            this.a(w2, w3, 11, 7, n6, 11, 8, n6, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        }
        n6 = this.g(Blocks.cNC, 3);
        for (n5 = 0; n5 <= 6; ++n5) {
            n4 = n5 + 4;
            for (n3 = 5; n3 <= 7; ++n3) {
                this.a(w2, Blocks.cNC.aM(n6), n3, 5 + n5, n4, w3);
            }
            if (n4 >= 5 && n4 <= 8) {
                this.a(w2, w3, 5, 5, n4, 7, n5 + 4, n4, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
            } else if (n4 >= 9 && n4 <= 10) {
                this.a(w2, w3, 5, 8, n4, 7, n5 + 4, n4, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
            }
            if (n5 < 1) continue;
            this.a(w2, w3, 5, 6 + n5, n4, 7, 9 + n5, n4, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        }
        for (n5 = 5; n5 <= 7; ++n5) {
            this.a(w2, Blocks.cNC.aM(n6), n5, 12, 11, w3);
        }
        this.a(w2, w3, 5, 6, 7, 5, 7, 7, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 7, 6, 7, 7, 7, 7, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 5, 13, 12, 7, 13, 12, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 2, 5, 2, 3, 5, 3, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 2, 5, 9, 3, 5, 10, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 2, 5, 4, 2, 5, 8, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 9, 5, 2, 10, 5, 3, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 9, 5, 9, 10, 5, 10, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 10, 5, 4, 10, 5, 8, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        n5 = this.g(Blocks.cNC, 0);
        n4 = this.g(Blocks.cNC, 1);
        this.a(w2, Blocks.cNC.aM(n4), 4, 5, 2, w3);
        this.a(w2, Blocks.cNC.aM(n4), 4, 5, 3, w3);
        this.a(w2, Blocks.cNC.aM(n4), 4, 5, 9, w3);
        this.a(w2, Blocks.cNC.aM(n4), 4, 5, 10, w3);
        this.a(w2, Blocks.cNC.aM(n5), 8, 5, 2, w3);
        this.a(w2, Blocks.cNC.aM(n5), 8, 5, 3, w3);
        this.a(w2, Blocks.cNC.aM(n5), 8, 5, 9, w3);
        this.a(w2, Blocks.cNC.aM(n5), 8, 5, 10, w3);
        this.a(w2, w3, 3, 4, 4, 4, 4, 8, Blocks.cMY.xM(), Blocks.cMY.xM(), false);
        this.a(w2, w3, 8, 4, 4, 9, 4, 8, Blocks.cMY.xM(), Blocks.cMY.xM(), false);
        this.a(w2, w3, 3, 5, 4, 4, 5, 8, Blocks.cND.xM(), Blocks.cND.xM(), false);
        this.a(w2, w3, 8, 5, 4, 9, 5, 8, Blocks.cND.xM(), Blocks.cND.xM(), false);
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
        return true;
    }
}

