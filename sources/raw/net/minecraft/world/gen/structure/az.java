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

public class az
extends av {
    public az() {
    }

    public az(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        this.a((ay)y2, list, random, 1, 3, false);
    }

    public static az m(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -1, -3, 0, 5, 10, 19, ao2);
        return az.d(w2) && y.a(list, w2) == null ? new az(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        this.a(w2, w3, 0, 3, 0, 4, 4, 18, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 1, 5, 0, 3, 7, 18, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 0, 5, 0, 0, 5, 18, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 4, 5, 0, 4, 5, 18, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 2, 0, 4, 2, 5, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 2, 13, 4, 2, 18, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 0, 0, 4, 1, 3, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 0, 15, 4, 1, 18, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        for (int i2 = 0; i2 <= 4; ++i2) {
            for (int i3 = 0; i3 <= 2; ++i3) {
                this.b(w2, Blocks.cNA.xM(), i2, -1, i3, w3);
                this.b(w2, Blocks.cNA.xM(), i2, -1, 18 - i3, w3);
            }
        }
        this.a(w2, w3, 0, 1, 1, 0, 4, 1, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 0, 3, 4, 0, 4, 4, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 0, 3, 14, 0, 4, 14, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 0, 1, 17, 0, 4, 17, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 4, 1, 1, 4, 4, 1, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 4, 3, 4, 4, 4, 4, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 4, 3, 14, 4, 4, 14, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 4, 1, 17, 4, 4, 17, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        return true;
    }
}

