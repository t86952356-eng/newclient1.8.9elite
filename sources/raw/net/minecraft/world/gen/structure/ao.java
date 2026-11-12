/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.structure.av;
import net.minecraft.world.gen.structure.ay;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class ao
extends av {
    public ao() {
    }

    public ao(int n2, Random random, w w2, net.minecraft.util.ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        this.a((ay)y2, list, random, 1, 0, true);
    }

    public static ao f(List<y> list, Random random, int n2, int n3, int n4, net.minecraft.util.ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -1, 0, 0, 5, 7, 5, ao2);
        return ao.d(w2) && y.a(list, w2) == null ? new ao(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        this.a(w2, w3, 0, 0, 0, 4, 1, 4, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 2, 0, 4, 5, 4, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 0, 2, 0, 0, 5, 4, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 4, 2, 0, 4, 5, 4, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 3, 1, 0, 4, 1, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 0, 3, 3, 0, 4, 3, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 4, 3, 1, 4, 4, 1, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 4, 3, 3, 4, 4, 3, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 0, 6, 0, 4, 6, 4, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        for (int i2 = 0; i2 <= 4; ++i2) {
            for (int i3 = 0; i3 <= 4; ++i3) {
                this.b(w2, Blocks.cNA.xM(), i2, -1, i3, w3);
            }
        }
        return true;
    }
}

