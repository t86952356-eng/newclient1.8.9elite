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
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class cn
extends cv {
    public cn() {
    }

    public cn(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dSt = this.o(random);
        this.dQI = w2;
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        this.a((cr)y2, list, random, 1, 1);
    }

    public static cn s(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -1, -1, 0, 9, 5, 11, ao2);
        return cn.e(w2) && y.a(list, w2) == null ? new cn(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w2, w3)) {
            return false;
        }
        this.a(w2, w3, 0, 0, 0, 8, 4, 10, true, random, cc.dRW);
        this.a(w2, random, w3, this.dSt, 1, 1, 0);
        this.a(w2, w3, 1, 1, 10, 3, 3, 10, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 4, 1, 1, 4, 3, 1, false, random, cc.dRW);
        this.a(w2, w3, 4, 1, 3, 4, 3, 3, false, random, cc.dRW);
        this.a(w2, w3, 4, 1, 7, 4, 3, 7, false, random, cc.dRW);
        this.a(w2, w3, 4, 1, 9, 4, 3, 9, false, random, cc.dRW);
        this.a(w2, w3, 4, 1, 4, 4, 3, 6, Blocks.cNk.xM(), Blocks.cNk.xM(), false);
        this.a(w2, w3, 5, 1, 5, 7, 3, 5, Blocks.cNk.xM(), Blocks.cNk.xM(), false);
        this.a(w2, Blocks.cNk.xM(), 4, 3, 2, w3);
        this.a(w2, Blocks.cNk.xM(), 4, 3, 8, w3);
        this.a(w2, Blocks.cMC.aM(this.g(Blocks.cMC, 3)), 4, 1, 2, w3);
        this.a(w2, Blocks.cMC.aM(this.g(Blocks.cMC, 3) + 8), 4, 2, 2, w3);
        this.a(w2, Blocks.cMC.aM(this.g(Blocks.cMC, 3)), 4, 1, 8, w3);
        this.a(w2, Blocks.cMC.aM(this.g(Blocks.cMC, 3) + 8), 4, 2, 8, w3);
        return true;
    }
}

