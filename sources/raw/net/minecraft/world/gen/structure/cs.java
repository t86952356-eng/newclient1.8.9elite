/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.cc;
import net.minecraft.world.gen.structure.cr;
import net.minecraft.world.gen.structure.cv;
import net.minecraft.world.gen.structure.cw;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class cs
extends cv {
    public cs() {
    }

    public cs(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dSt = this.o(random);
        this.dQI = w2;
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        this.a((cr)y2, list, random, 1, 1);
    }

    public static cs v(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -1, -7, 0, 5, 11, 8, ao2);
        return cs.e(w2) && y.a(list, w2) == null ? new cs(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w2, w3)) {
            return false;
        }
        this.a(w2, w3, 0, 0, 0, 4, 10, 7, true, random, cc.dRW);
        this.a(w2, random, w3, this.dSt, 1, 7, 0);
        this.a(w2, random, w3, cw.dSu, 1, 1, 7);
        int n2 = this.g(Blocks.cMy, 2);
        for (int i2 = 0; i2 < 6; ++i2) {
            this.a(w2, Blocks.cMy.aM(n2), 1, 6 - i2, 1 + i2, w3);
            this.a(w2, Blocks.cMy.aM(n2), 2, 6 - i2, 1 + i2, w3);
            this.a(w2, Blocks.cMy.aM(n2), 3, 6 - i2, 1 + i2, w3);
            if (i2 >= 5) continue;
            this.a(w2, Blocks.cNh.xM(), 1, 5 - i2, 1 + i2, w3);
            this.a(w2, Blocks.cNh.xM(), 2, 5 - i2, 1 + i2, w3);
            this.a(w2, Blocks.cNh.xM(), 3, 5 - i2, 1 + i2, w3);
        }
        return true;
    }
}

