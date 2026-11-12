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

public class ax
extends av {
    public ax() {
    }

    public ax(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        this.c((ay)y2, list, random, 6, 2, false);
    }

    public static ax a(List<y> list, Random random, int n2, int n3, int n4, int n5, ao ao2) {
        w w2 = w.a(n2, n3, n4, -2, 0, 0, 7, 11, 7, ao2);
        return ax.d(w2) && y.a(list, w2) == null ? new ax(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        this.a(w2, w3, 0, 0, 0, 6, 1, 6, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 2, 0, 6, 10, 6, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 0, 2, 0, 1, 8, 0, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 5, 2, 0, 6, 8, 0, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 2, 1, 0, 8, 6, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 6, 2, 1, 6, 8, 6, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 1, 2, 6, 5, 8, 6, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 3, 2, 0, 5, 4, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 6, 3, 2, 6, 5, 2, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 6, 3, 4, 6, 5, 4, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, Blocks.cNA.xM(), 5, 2, 5, w3);
        this.a(w2, w3, 4, 2, 5, 4, 3, 5, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 3, 2, 5, 3, 4, 5, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 2, 2, 5, 2, 5, 5, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 1, 2, 5, 1, 6, 5, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 1, 7, 1, 5, 7, 4, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 6, 8, 2, 6, 8, 4, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 2, 6, 0, 4, 8, 0, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 2, 5, 0, 4, 5, 0, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        for (int i2 = 0; i2 <= 6; ++i2) {
            for (int i3 = 0; i3 <= 6; ++i3) {
                this.b(w2, Blocks.cNA.xM(), i2, -1, i3, w3);
            }
        }
        return true;
    }
}

