/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.world.gen.structure.ay;
import net.minecraft.world.gen.structure.cb;
import net.minecraft.world.gen.structure.y;
import net.minecraft.world.w;

public class j
extends cb {
    public j() {
    }

    public j(w w2, Random random, int n2, int n3) {
        super(n2, n3);
        ay ay2 = new ay(random, (n2 << 4) + 2, (n3 << 4) + 2);
        this.dRQ.add(ay2);
        ay2.a(ay2, this.dRQ, random);
        List<y> list = ay2.dRl;
        while (!list.isEmpty()) {
            int n4 = random.nextInt(list.size());
            y y2 = list.remove(n4);
            y2.a(ay2, this.dRQ, random);
        }
        this.UJ();
        this.b(w2, random, 48, 70);
    }
}

