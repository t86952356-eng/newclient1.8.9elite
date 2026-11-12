/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.dg;
import net.minecraft.world.gen.structure.cc;
import net.minecraft.world.gen.structure.cv;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class ck
extends cv {
    private static final List<dg> dSf = Lists.newArrayList((Object[])new dg[]{new dg(Items.cQP, 0, 1, 3, 20), new dg(Items.cQO, 0, 2, 7, 20), new dg(Items.cRZ, 0, 1, 1, 1), new dg(Items.cQU, 0, 1, 1, 1)});
    private boolean dSg;

    public ck() {
    }

    public ck(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dSt = this.o(random);
        this.dQI = w2;
        this.dSg = w2.ayM() > 6;
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.o("Tall", this.dSg);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dSg = n2.eO("Tall");
    }

    public static ck q(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -4, -1, 0, 14, 11, 15, ao2);
        if (!(ck.e(w2) && y.a(list, w2) == null || ck.e(w2 = w.a(n2, n3, n4, -4, -1, 0, 14, 6, 15, ao2)) && y.a(list, w2) == null)) {
            return null;
        }
        return new ck(n5, random, w2, ao2);
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        if (this.a(w2, w3)) {
            return false;
        }
        int n3 = 11;
        if (!this.dSg) {
            n3 = 6;
        }
        this.a(w2, w3, 0, 0, 0, 13, n3 - 1, 14, true, random, cc.dRW);
        this.a(w2, random, w3, this.dSt, 4, 1, 0);
        this.a(w2, w3, random, 0.07f, 2, 1, 1, 11, 4, 13, Blocks.cLI.xM(), Blocks.cLI.xM(), false);
        boolean bl2 = true;
        int n4 = 12;
        for (n2 = 1; n2 <= 13; ++n2) {
            if ((n2 - 1) % 4 == 0) {
                this.a(w2, w3, 1, 1, n2, 1, 4, n2, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
                this.a(w2, w3, 12, 1, n2, 12, 4, n2, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
                this.a(w2, Blocks.cMc.xM(), 2, 3, n2, w3);
                this.a(w2, Blocks.cMc.xM(), 11, 3, n2, w3);
                if (!this.dSg) continue;
                this.a(w2, w3, 1, 6, n2, 1, 9, n2, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
                this.a(w2, w3, 12, 6, n2, 12, 9, n2, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
                continue;
            }
            this.a(w2, w3, 1, 1, n2, 1, 4, n2, Blocks.cLZ.xM(), Blocks.cLZ.xM(), false);
            this.a(w2, w3, 12, 1, n2, 12, 4, n2, Blocks.cLZ.xM(), Blocks.cLZ.xM(), false);
            if (!this.dSg) continue;
            this.a(w2, w3, 1, 6, n2, 1, 9, n2, Blocks.cLZ.xM(), Blocks.cLZ.xM(), false);
            this.a(w2, w3, 12, 6, n2, 12, 9, n2, Blocks.cLZ.xM(), Blocks.cLZ.xM(), false);
        }
        for (n2 = 3; n2 < 12; n2 += 2) {
            this.a(w2, w3, 3, 1, n2, 4, 3, n2, Blocks.cLZ.xM(), Blocks.cLZ.xM(), false);
            this.a(w2, w3, 6, 1, n2, 7, 3, n2, Blocks.cLZ.xM(), Blocks.cLZ.xM(), false);
            this.a(w2, w3, 9, 1, n2, 10, 3, n2, Blocks.cLZ.xM(), Blocks.cLZ.xM(), false);
        }
        if (this.dSg) {
            this.a(w2, w3, 1, 5, 1, 3, 5, 13, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
            this.a(w2, w3, 10, 5, 1, 12, 5, 13, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
            this.a(w2, w3, 4, 5, 1, 9, 5, 2, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
            this.a(w2, w3, 4, 5, 12, 9, 5, 13, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
            this.a(w2, Blocks.cLh.xM(), 9, 5, 11, w3);
            this.a(w2, Blocks.cLh.xM(), 8, 5, 11, w3);
            this.a(w2, Blocks.cLh.xM(), 9, 5, 10, w3);
            this.a(w2, w3, 3, 6, 2, 3, 6, 12, Blocks.cMQ.xM(), Blocks.cMQ.xM(), false);
            this.a(w2, w3, 10, 6, 2, 10, 6, 10, Blocks.cMQ.xM(), Blocks.cMQ.xM(), false);
            this.a(w2, w3, 4, 6, 2, 9, 6, 2, Blocks.cMQ.xM(), Blocks.cMQ.xM(), false);
            this.a(w2, w3, 4, 6, 12, 8, 6, 12, Blocks.cMQ.xM(), Blocks.cMQ.xM(), false);
            this.a(w2, Blocks.cMQ.xM(), 9, 6, 11, w3);
            this.a(w2, Blocks.cMQ.xM(), 8, 6, 11, w3);
            this.a(w2, Blocks.cMQ.xM(), 9, 6, 10, w3);
            n2 = this.g(Blocks.cMw, 3);
            this.a(w2, Blocks.cMw.aM(n2), 10, 1, 13, w3);
            this.a(w2, Blocks.cMw.aM(n2), 10, 2, 13, w3);
            this.a(w2, Blocks.cMw.aM(n2), 10, 3, 13, w3);
            this.a(w2, Blocks.cMw.aM(n2), 10, 4, 13, w3);
            this.a(w2, Blocks.cMw.aM(n2), 10, 5, 13, w3);
            this.a(w2, Blocks.cMw.aM(n2), 10, 6, 13, w3);
            this.a(w2, Blocks.cMw.aM(n2), 10, 7, 13, w3);
            int n5 = 7;
            int n6 = 7;
            this.a(w2, Blocks.cMQ.xM(), 6, 9, 7, w3);
            this.a(w2, Blocks.cMQ.xM(), 7, 9, 7, w3);
            this.a(w2, Blocks.cMQ.xM(), 6, 8, 7, w3);
            this.a(w2, Blocks.cMQ.xM(), 7, 8, 7, w3);
            this.a(w2, Blocks.cMQ.xM(), 6, 7, 7, w3);
            this.a(w2, Blocks.cMQ.xM(), 7, 7, 7, w3);
            this.a(w2, Blocks.cMQ.xM(), 5, 7, 7, w3);
            this.a(w2, Blocks.cMQ.xM(), 8, 7, 7, w3);
            this.a(w2, Blocks.cMQ.xM(), 6, 7, 6, w3);
            this.a(w2, Blocks.cMQ.xM(), 6, 7, 8, w3);
            this.a(w2, Blocks.cMQ.xM(), 7, 7, 6, w3);
            this.a(w2, Blocks.cMQ.xM(), 7, 7, 8, w3);
            this.a(w2, Blocks.cMc.xM(), 5, 8, 7, w3);
            this.a(w2, Blocks.cMc.xM(), 8, 8, 7, w3);
            this.a(w2, Blocks.cMc.xM(), 6, 8, 6, w3);
            this.a(w2, Blocks.cMc.xM(), 6, 8, 8, w3);
            this.a(w2, Blocks.cMc.xM(), 7, 8, 6, w3);
            this.a(w2, Blocks.cMc.xM(), 7, 8, 8, w3);
        }
        this.a(w2, w3, random, 3, 3, 5, dg.a(dSf, Items.cSh.a(random, 1, 5, 2)), 1 + random.nextInt(4));
        if (this.dSg) {
            this.a(w2, Blocks.cLc.xM(), 12, 9, 1, w3);
            this.a(w2, w3, random, 12, 8, 1, dg.a(dSf, Items.cSh.a(random, 1, 5, 2)), 1 + random.nextInt(4));
        }
        return true;
    }
}

