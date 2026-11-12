/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.cc;
import net.minecraft.world.gen.structure.cr;
import net.minecraft.world.gen.structure.cv;
import net.minecraft.world.gen.structure.cw;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class cu
extends cv {
    private boolean dSr;
    private boolean dSs;

    public cu() {
    }

    public cu(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dSt = this.o(random);
        this.dQI = w2;
        this.dSr = random.nextInt(2) == 0;
        this.dSs = random.nextInt(2) == 0;
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.o("Left", this.dSr);
        n2.o("Right", this.dSs);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dSr = n2.eO("Left");
        this.dSs = n2.eO("Right");
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        this.a((cr)y2, list, random, 1, 1);
        if (this.dSr) {
            this.b((cr)y2, list, random, 1, 2);
        }
        if (this.dSs) {
            this.c((cr)y2, list, random, 1, 2);
        }
    }

    public static cu w(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -1, -1, 0, 5, 5, 7, ao2);
        return cu.e(w2) && y.a(list, w2) == null ? new cu(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w2, w3)) {
            return false;
        }
        this.a(w2, w3, 0, 0, 0, 4, 4, 6, true, random, cc.dRW);
        this.a(w2, random, w3, this.dSt, 1, 1, 0);
        this.a(w2, random, w3, cw.dSu, 1, 1, 6);
        this.a(w2, w3, random, 0.1f, 1, 2, 1, Blocks.cMc.xM());
        this.a(w2, w3, random, 0.1f, 3, 2, 1, Blocks.cMc.xM());
        this.a(w2, w3, random, 0.1f, 1, 2, 5, Blocks.cMc.xM());
        this.a(w2, w3, random, 0.1f, 3, 2, 5, Blocks.cMc.xM());
        if (this.dSr) {
            this.a(w2, w3, 0, 1, 2, 0, 3, 4, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        }
        if (this.dSs) {
            this.a(w2, w3, 4, 1, 2, 4, 3, 4, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        }
        return true;
    }
}

