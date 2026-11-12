/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.dk;
import net.minecraft.world.gen.structure.dm;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class df
extends dm {
    public df() {
    }

    public df(dk dk2, int n2, Random random, w w2, ao ao2) {
        super(dk2, n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    public static df j(dk dk2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, 0, 0, 0, 9, 7, 12, ao2);
        return df.f(w2) && y.a(list, w2) == null ? new df(dk2, n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.dSR < 0) {
            this.dSR = this.b(w2, w3);
            if (this.dSR < 0) {
                return true;
            }
            this.dQI.ad(0, this.dSR - this.dQI.dQF + 7 - 1, 0);
        }
        this.a(w2, w3, 1, 1, 1, 7, 4, 4, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 2, 1, 6, 8, 4, 10, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 2, 0, 5, 8, 0, 10, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 1, 0, 1, 7, 0, 4, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 0, 0, 0, 0, 3, 5, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 8, 0, 0, 8, 3, 10, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 1, 0, 0, 7, 2, 0, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 1, 0, 5, 2, 1, 5, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 2, 0, 6, 2, 3, 10, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 3, 0, 10, 7, 3, 10, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 1, 2, 0, 7, 3, 0, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 1, 2, 5, 2, 3, 5, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 0, 4, 1, 8, 4, 1, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 0, 4, 4, 3, 4, 4, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 0, 5, 2, 8, 5, 3, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, Blocks.cLh.xM(), 0, 4, 2, w3);
        this.a(w2, Blocks.cLh.xM(), 0, 4, 3, w3);
        this.a(w2, Blocks.cLh.xM(), 8, 4, 2, w3);
        this.a(w2, Blocks.cLh.xM(), 8, 4, 3, w3);
        this.a(w2, Blocks.cLh.xM(), 8, 4, 4, w3);
        int n6 = this.g(Blocks.cMf, 3);
        int n7 = this.g(Blocks.cMf, 2);
        for (n5 = -1; n5 <= 2; ++n5) {
            for (n4 = 0; n4 <= 8; ++n4) {
                this.a(w2, Blocks.cMf.aM(n6), n4, 4 + n5, n5, w3);
                if (n5 <= -1 && n4 > 1 || n5 <= 0 && n4 > 3 || n5 <= 1 && n4 > 4 && n4 < 6) continue;
                this.a(w2, Blocks.cMf.aM(n7), n4, 4 + n5, 5 - n5, w3);
            }
        }
        this.a(w2, w3, 3, 4, 5, 3, 4, 10, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 7, 4, 2, 7, 4, 10, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 4, 5, 4, 4, 5, 10, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 6, 5, 4, 6, 5, 10, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 5, 6, 3, 5, 6, 10, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        n5 = this.g(Blocks.cMf, 0);
        for (n4 = 4; n4 >= 1; --n4) {
            this.a(w2, Blocks.cLh.xM(), n4, 2 + n4, 7 - n4, w3);
            for (n3 = 8 - n4; n3 <= 10; ++n3) {
                this.a(w2, Blocks.cMf.aM(n5), n4, 2 + n4, n3, w3);
            }
        }
        n4 = this.g(Blocks.cMf, 1);
        this.a(w2, Blocks.cLh.xM(), 6, 6, 3, w3);
        this.a(w2, Blocks.cLh.xM(), 7, 5, 4, w3);
        this.a(w2, Blocks.cMf.aM(n4), 6, 6, 4, w3);
        for (n3 = 6; n3 <= 8; ++n3) {
            for (n2 = 5; n2 <= 10; ++n2) {
                this.a(w2, Blocks.cMf.aM(n4), n3, 12 - n3, n2, w3);
            }
        }
        this.a(w2, Blocks.cLt.xM(), 0, 2, 1, w3);
        this.a(w2, Blocks.cLt.xM(), 0, 2, 4, w3);
        this.a(w2, Blocks.cNl.xM(), 0, 2, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 0, 2, 3, w3);
        this.a(w2, Blocks.cLt.xM(), 4, 2, 0, w3);
        this.a(w2, Blocks.cNl.xM(), 5, 2, 0, w3);
        this.a(w2, Blocks.cLt.xM(), 6, 2, 0, w3);
        this.a(w2, Blocks.cLt.xM(), 8, 2, 1, w3);
        this.a(w2, Blocks.cNl.xM(), 8, 2, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 8, 2, 3, w3);
        this.a(w2, Blocks.cLt.xM(), 8, 2, 4, w3);
        this.a(w2, Blocks.cLh.xM(), 8, 2, 5, w3);
        this.a(w2, Blocks.cLt.xM(), 8, 2, 6, w3);
        this.a(w2, Blocks.cNl.xM(), 8, 2, 7, w3);
        this.a(w2, Blocks.cNl.xM(), 8, 2, 8, w3);
        this.a(w2, Blocks.cLt.xM(), 8, 2, 9, w3);
        this.a(w2, Blocks.cLt.xM(), 2, 2, 6, w3);
        this.a(w2, Blocks.cNl.xM(), 2, 2, 7, w3);
        this.a(w2, Blocks.cNl.xM(), 2, 2, 8, w3);
        this.a(w2, Blocks.cLt.xM(), 2, 2, 9, w3);
        this.a(w2, Blocks.cLt.xM(), 4, 4, 10, w3);
        this.a(w2, Blocks.cNl.xM(), 5, 4, 10, w3);
        this.a(w2, Blocks.cLt.xM(), 6, 4, 10, w3);
        this.a(w2, Blocks.cLh.xM(), 5, 5, 10, w3);
        this.a(w2, Blocks.cLc.xM(), 2, 1, 0, w3);
        this.a(w2, Blocks.cLc.xM(), 2, 2, 0, w3);
        this.a(w2, Blocks.cMc.xM().a(BlockTorch.bcF, this.dQJ), 2, 3, 1, w3);
        this.a(w2, w3, random, 2, 1, 0, ao.hz(this.g(Blocks.cMq, 1)));
        this.a(w2, w3, 1, 0, -1, 3, 2, -1, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        if (this.a(w2, 2, 0, -1, w3).df().xb() == Material.beo && this.a(w2, 2, -1, -1, w3).df().xb() != Material.beo) {
            this.a(w2, Blocks.cMy.aM(this.g(Blocks.cMy, 3)), 2, 0, -1, w3);
        }
        for (n3 = 0; n3 < 5; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.b(w2, n2, 7, n3, w3);
                this.b(w2, Blocks.cLg.xM(), n2, -1, n3, w3);
            }
        }
        for (n3 = 5; n3 < 11; ++n3) {
            for (n2 = 2; n2 < 9; ++n2) {
                this.b(w2, n2, 7, n3, w3);
                this.b(w2, Blocks.cLg.xM(), n2, -1, n3, w3);
            }
        }
        this.a(w2, w3, 4, 1, 2, 2);
        return true;
    }
}

