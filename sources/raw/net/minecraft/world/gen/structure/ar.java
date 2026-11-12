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

public class ar
extends av {
    public ar() {
    }

    public ar(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    protected ar(Random random, int n2, int n3) {
        super(0);
        this.dQJ = net.minecraft.util.ar.dwT.g(random);
        switch (this.dQJ) {
            case dws: 
            case dwt: {
                this.dQI = new w(n2, 64, n3, n2 + 19 - 1, 73, n3 + 19 - 1);
                break;
            }
            default: {
                this.dQI = new w(n2, 64, n3, n2 + 19 - 1, 73, n3 + 19 - 1);
            }
        }
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        this.a((ay)y2, list, random, 8, 3, false);
        this.b((ay)y2, list, random, 3, 8, false);
        this.c((ay)y2, list, random, 3, 8, false);
    }

    public static ar i(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -8, -3, 0, 19, 10, 19, ao2);
        return ar.d(w2) && y.a(list, w2) == null ? new ar(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        int n3;
        this.a(w2, w3, 7, 3, 0, 11, 4, 18, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 3, 7, 18, 4, 11, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 8, 5, 0, 10, 7, 18, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 0, 5, 8, 18, 7, 10, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 7, 5, 0, 7, 5, 7, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 7, 5, 11, 7, 5, 18, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 11, 5, 0, 11, 5, 7, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 11, 5, 11, 11, 5, 18, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 5, 7, 7, 5, 7, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 11, 5, 7, 18, 5, 7, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 5, 11, 7, 5, 11, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 11, 5, 11, 18, 5, 11, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 7, 2, 0, 11, 2, 5, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 7, 2, 13, 11, 2, 18, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 7, 0, 0, 11, 1, 3, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 7, 0, 15, 11, 1, 18, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        for (n3 = 7; n3 <= 11; ++n3) {
            for (n2 = 0; n2 <= 2; ++n2) {
                this.b(w2, Blocks.cNA.xM(), n3, -1, n2, w3);
                this.b(w2, Blocks.cNA.xM(), n3, -1, 18 - n2, w3);
            }
        }
        this.a(w2, w3, 0, 2, 7, 5, 2, 11, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 13, 2, 7, 18, 2, 11, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 0, 7, 3, 1, 11, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 15, 0, 7, 18, 1, 11, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        for (n3 = 0; n3 <= 2; ++n3) {
            for (n2 = 7; n2 <= 11; ++n2) {
                this.b(w2, Blocks.cNA.xM(), n3, -1, n2, w3);
                this.b(w2, Blocks.cNA.xM(), 18 - n3, -1, n2, w3);
            }
        }
        return true;
    }
}

