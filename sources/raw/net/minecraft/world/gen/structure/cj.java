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

public class cj
extends cv {
    public cj() {
    }

    public cj(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dSt = this.o(random);
        this.dQI = w2;
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        if (this.dQJ != ao.dws && this.dQJ != ao.dwv) {
            this.c((cr)y2, list, random, 1, 1);
        } else {
            this.b((cr)y2, list, random, 1, 1);
        }
    }

    public static cj p(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -1, -1, 0, 5, 5, 5, ao2);
        return cj.e(w2) && y.a(list, w2) == null ? new cj(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w2, w3)) {
            return false;
        }
        this.a(w2, w3, 0, 0, 0, 4, 4, 4, true, random, cc.dRW);
        this.a(w2, random, w3, this.dSt, 1, 1, 0);
        if (this.dQJ != ao.dws && this.dQJ != ao.dwv) {
            this.a(w2, w3, 4, 1, 1, 4, 3, 3, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        } else {
            this.a(w2, w3, 0, 1, 1, 0, 3, 3, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        }
        return true;
    }
}

