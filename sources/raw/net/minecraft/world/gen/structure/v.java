/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.nbt.n;
import net.minecraft.world.gen.structure.cb;
import net.minecraft.world.gen.structure.cx;
import net.minecraft.world.gen.structure.di;
import net.minecraft.world.gen.structure.dj;
import net.minecraft.world.gen.structure.dk;
import net.minecraft.world.gen.structure.y;
import net.minecraft.world.w;

public class v
extends cb {
    private boolean dQA;

    public v() {
    }

    public v(w w2, Random random, int n2, int n3, int n4) {
        super(n2, n3);
        int n5;
        List<di> list = cx.a(random, n4);
        dk dk2 = new dk(w2.avp(), 0, random, (n2 << 4) + 2, (n3 << 4) + 2, list, n4);
        this.dRQ.add(dk2);
        dk2.a(dk2, this.dRQ, random);
        List<y> list2 = dk2.dSQ;
        List<y> list3 = dk2.dSP;
        while (!list2.isEmpty() || !list3.isEmpty()) {
            Object object;
            if (list2.isEmpty()) {
                n5 = random.nextInt(list3.size());
                object = list3.remove(n5);
                ((y)object).a(dk2, this.dRQ, random);
                continue;
            }
            n5 = random.nextInt(list2.size());
            object = list2.remove(n5);
            ((y)object).a(dk2, this.dRQ, random);
        }
        this.UJ();
        n5 = 0;
        for (y y2 : this.dRQ) {
            if (y2 instanceof dj) continue;
            ++n5;
        }
        this.dQA = n5 > 2;
    }

    @Override
    public boolean ayI() {
        return this.dQA;
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        n2.o("Valid", this.dQA);
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        this.dQA = n2.eO("Valid");
    }
}

