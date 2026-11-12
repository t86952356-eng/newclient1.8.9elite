/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.world.gen.structure.cb;
import net.minecraft.world.gen.structure.cc;
import net.minecraft.world.gen.structure.cr;
import net.minecraft.world.gen.structure.y;
import net.minecraft.world.w;

public class n
extends cb {
    public n() {
    }

    public n(w w2, Random random, int n2, int n3) {
        super(n2, n3);
        cc.azg();
        cr cr2 = new cr(0, random, (n2 << 4) + 2, (n3 << 4) + 2);
        this.dRQ.add(cr2);
        cr2.a(cr2, this.dRQ, random);
        List<y> list = cr2.dSq;
        while (!list.isEmpty()) {
            int n4 = random.nextInt(list.size());
            y y2 = list.remove(n4);
            y2.a(cr2, this.dRQ, random);
        }
        this.UJ();
        this.a(w2, random, 10);
    }
}

