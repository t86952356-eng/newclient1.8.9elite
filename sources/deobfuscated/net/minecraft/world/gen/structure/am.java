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

public class am
extends av {
    public am() {
    }

    public am(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        this.a((ay)y2, list, random, 1, 0, true);
    }

    public static am d(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -1, -7, 0, 5, 14, 10, ao2);
        return am.d(w2) && y.a(list, w2) == null ? new am(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2 = this.g(Blocks.cNC, 2);
        for (int i2 = 0; i2 <= 9; ++i2) {
            int n3 = Math.max(1, 7 - i2);
            int n4 = Math.min(Math.max(n3 + 5, 14 - i2), 13);
            int n5 = i2;
            this.a(w2, w3, 0, 0, i2, 4, n3, i2, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
            this.a(w2, w3, 1, n3 + 1, i2, 3, n4 - 1, i2, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
            if (i2 <= 6) {
                this.a(w2, Blocks.cNC.aM(n2), 1, n3 + 1, i2, w3);
                this.a(w2, Blocks.cNC.aM(n2), 2, n3 + 1, i2, w3);
                this.a(w2, Blocks.cNC.aM(n2), 3, n3 + 1, i2, w3);
            }
            this.a(w2, w3, 0, n4, i2, 4, n4, i2, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
            this.a(w2, w3, 0, n3 + 1, i2, 0, n4 - 1, i2, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
            this.a(w2, w3, 4, n3 + 1, i2, 4, n4 - 1, i2, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
            if ((i2 & 1) == 0) {
                this.a(w2, w3, 0, n3 + 2, i2, 0, n3 + 3, i2, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
                this.a(w2, w3, 4, n3 + 2, i2, 4, n3 + 3, i2, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
            }
            for (int i3 = 0; i3 <= 4; ++i3) {
                this.b(w2, Blocks.cNA.xM(), i3, -1, n5, w3);
            }
        }
        return true;
    }
}

