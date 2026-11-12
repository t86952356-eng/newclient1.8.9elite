/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.dk;
import net.minecraft.world.gen.structure.dm;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class dd
extends dm {
    public dd() {
    }

    public dd(dk dk2, int n2, Random random, w w2, ao ao2) {
        super(dk2, n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    public static dd h(dk dk2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, 0, 0, 0, 9, 9, 6, ao2);
        return dd.f(w2) && y.a(list, w2) == null ? new dd(dk2, n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        int n3;
        if (this.dSR < 0) {
            this.dSR = this.b(w2, w3);
            if (this.dSR < 0) {
                return true;
            }
            this.dQI.ad(0, this.dSR - this.dQI.dQF + 9 - 1, 0);
        }
        this.a(w2, w3, 1, 1, 1, 7, 5, 4, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 0, 0, 0, 8, 0, 5, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 0, 5, 0, 8, 5, 5, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 0, 6, 1, 8, 6, 4, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 0, 7, 2, 8, 7, 3, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        int n4 = this.g(Blocks.cMf, 3);
        int n5 = this.g(Blocks.cMf, 2);
        for (n3 = -1; n3 <= 2; ++n3) {
            for (n2 = 0; n2 <= 8; ++n2) {
                this.a(w2, Blocks.cMf.aM(n4), n2, 6 + n3, n3, w3);
                this.a(w2, Blocks.cMf.aM(n5), n2, 6 + n3, 5 - n3, w3);
            }
        }
        this.a(w2, w3, 0, 1, 0, 0, 1, 5, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 1, 1, 5, 8, 1, 5, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 8, 1, 0, 8, 1, 4, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 2, 1, 0, 7, 1, 0, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 0, 2, 0, 0, 4, 0, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 0, 2, 5, 0, 4, 5, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 8, 2, 5, 8, 4, 5, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 8, 2, 0, 8, 4, 0, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 0, 2, 1, 0, 4, 4, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 1, 2, 5, 7, 4, 5, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 8, 2, 1, 8, 4, 4, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 1, 2, 0, 7, 4, 0, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, Blocks.cNl.xM(), 4, 2, 0, w3);
        this.a(w2, Blocks.cNl.xM(), 5, 2, 0, w3);
        this.a(w2, Blocks.cNl.xM(), 6, 2, 0, w3);
        this.a(w2, Blocks.cNl.xM(), 4, 3, 0, w3);
        this.a(w2, Blocks.cNl.xM(), 5, 3, 0, w3);
        this.a(w2, Blocks.cNl.xM(), 6, 3, 0, w3);
        this.a(w2, Blocks.cNl.xM(), 0, 2, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 0, 2, 3, w3);
        this.a(w2, Blocks.cNl.xM(), 0, 3, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 0, 3, 3, w3);
        this.a(w2, Blocks.cNl.xM(), 8, 2, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 8, 2, 3, w3);
        this.a(w2, Blocks.cNl.xM(), 8, 3, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 8, 3, 3, w3);
        this.a(w2, Blocks.cNl.xM(), 2, 2, 5, w3);
        this.a(w2, Blocks.cNl.xM(), 3, 2, 5, w3);
        this.a(w2, Blocks.cNl.xM(), 5, 2, 5, w3);
        this.a(w2, Blocks.cNl.xM(), 6, 2, 5, w3);
        this.a(w2, w3, 1, 4, 1, 7, 4, 1, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 1, 4, 4, 7, 4, 4, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 1, 3, 4, 7, 3, 4, Blocks.cLZ.xM(), Blocks.cLZ.xM(), false);
        this.a(w2, Blocks.cLh.xM(), 7, 1, 4, w3);
        this.a(w2, Blocks.cMf.aM(this.g(Blocks.cMf, 0)), 7, 1, 3, w3);
        n3 = this.g(Blocks.cMf, 3);
        this.a(w2, Blocks.cMf.aM(n3), 6, 1, 4, w3);
        this.a(w2, Blocks.cMf.aM(n3), 5, 1, 4, w3);
        this.a(w2, Blocks.cMf.aM(n3), 4, 1, 4, w3);
        this.a(w2, Blocks.cMf.aM(n3), 3, 1, 4, w3);
        this.a(w2, Blocks.cMQ.xM(), 6, 1, 3, w3);
        this.a(w2, Blocks.cMD.xM(), 6, 2, 3, w3);
        this.a(w2, Blocks.cMQ.xM(), 4, 1, 3, w3);
        this.a(w2, Blocks.cMD.xM(), 4, 2, 3, w3);
        this.a(w2, Blocks.cMk.xM(), 7, 1, 1, w3);
        this.a(w2, Blocks.cLc.xM(), 1, 1, 0, w3);
        this.a(w2, Blocks.cLc.xM(), 1, 2, 0, w3);
        this.a(w2, w3, random, 1, 1, 0, ao.hz(this.g(Blocks.cMq, 1)));
        if (this.a(w2, 1, 0, -1, w3).df().xb() == Material.beo && this.a(w2, 1, -1, -1, w3).df().xb() != Material.beo) {
            this.a(w2, Blocks.cMy.aM(this.g(Blocks.cMy, 3)), 1, 0, -1, w3);
        }
        for (n2 = 0; n2 < 6; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.b(w2, i2, 9, n2, w3);
                this.b(w2, Blocks.cLg.xM(), i2, -1, n2, w3);
            }
        }
        this.a(w2, w3, 2, 1, 2, 1);
        return true;
    }

    @Override
    protected int bq(int n2, int n3) {
        return 1;
    }
}

