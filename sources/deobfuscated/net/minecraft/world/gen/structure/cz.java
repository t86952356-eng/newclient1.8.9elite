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

public class cz
extends dm {
    public cz() {
    }

    public cz(dk dk2, int n2, Random random, w w2, ao ao2) {
        super(dk2, n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    public static cz d(dk dk2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, 0, 0, 0, 5, 12, 9, ao2);
        return cz.f(w2) && y.a(list, w2) == null ? new cz(dk2, n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        if (this.dSR < 0) {
            this.dSR = this.b(w2, w3);
            if (this.dSR < 0) {
                return true;
            }
            this.dQI.ad(0, this.dSR - this.dQI.dQF + 12 - 1, 0);
        }
        this.a(w2, w3, 1, 1, 1, 3, 3, 7, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 1, 5, 1, 3, 9, 3, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 1, 0, 0, 3, 0, 8, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 1, 1, 0, 3, 10, 0, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 0, 1, 1, 0, 10, 3, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 4, 1, 1, 4, 10, 3, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 0, 0, 4, 0, 4, 7, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 4, 0, 4, 4, 4, 7, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 1, 1, 8, 3, 4, 8, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 1, 5, 4, 3, 10, 4, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 1, 5, 5, 3, 5, 7, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 0, 9, 0, 4, 9, 4, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 0, 4, 0, 4, 4, 4, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, Blocks.cLg.xM(), 0, 11, 2, w3);
        this.a(w2, Blocks.cLg.xM(), 4, 11, 2, w3);
        this.a(w2, Blocks.cLg.xM(), 2, 11, 0, w3);
        this.a(w2, Blocks.cLg.xM(), 2, 11, 4, w3);
        this.a(w2, Blocks.cLg.xM(), 1, 1, 6, w3);
        this.a(w2, Blocks.cLg.xM(), 1, 1, 7, w3);
        this.a(w2, Blocks.cLg.xM(), 2, 1, 7, w3);
        this.a(w2, Blocks.cLg.xM(), 3, 1, 6, w3);
        this.a(w2, Blocks.cLg.xM(), 3, 1, 7, w3);
        this.a(w2, Blocks.cMy.aM(this.g(Blocks.cMy, 3)), 1, 1, 5, w3);
        this.a(w2, Blocks.cMy.aM(this.g(Blocks.cMy, 3)), 2, 1, 6, w3);
        this.a(w2, Blocks.cMy.aM(this.g(Blocks.cMy, 3)), 3, 1, 5, w3);
        this.a(w2, Blocks.cMy.aM(this.g(Blocks.cMy, 1)), 1, 2, 7, w3);
        this.a(w2, Blocks.cMy.aM(this.g(Blocks.cMy, 0)), 3, 2, 7, w3);
        this.a(w2, Blocks.cNl.xM(), 0, 2, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 0, 3, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 4, 2, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 4, 3, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 0, 6, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 0, 7, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 4, 6, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 4, 7, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 2, 6, 0, w3);
        this.a(w2, Blocks.cNl.xM(), 2, 7, 0, w3);
        this.a(w2, Blocks.cNl.xM(), 2, 6, 4, w3);
        this.a(w2, Blocks.cNl.xM(), 2, 7, 4, w3);
        this.a(w2, Blocks.cNl.xM(), 0, 3, 6, w3);
        this.a(w2, Blocks.cNl.xM(), 4, 3, 6, w3);
        this.a(w2, Blocks.cNl.xM(), 2, 3, 8, w3);
        this.a(w2, Blocks.cMc.xM().a(BlockTorch.bcF, this.dQJ.asC()), 2, 4, 7, w3);
        this.a(w2, Blocks.cMc.xM().a(BlockTorch.bcF, this.dQJ.asD()), 1, 4, 6, w3);
        this.a(w2, Blocks.cMc.xM().a(BlockTorch.bcF, this.dQJ.asG()), 3, 4, 6, w3);
        this.a(w2, Blocks.cMc.xM().a(BlockTorch.bcF, this.dQJ), 2, 4, 5, w3);
        int n3 = this.g(Blocks.cMw, 4);
        for (n2 = 1; n2 <= 9; ++n2) {
            this.a(w2, Blocks.cMw.aM(n3), 3, n2, 3, w3);
        }
        this.a(w2, Blocks.cLc.xM(), 2, 1, 0, w3);
        this.a(w2, Blocks.cLc.xM(), 2, 2, 0, w3);
        this.a(w2, w3, random, 2, 1, 0, ao.hz(this.g(Blocks.cMq, 1)));
        if (this.a(w2, 2, 0, -1, w3).df().xb() == Material.beo && this.a(w2, 2, -1, -1, w3).df().xb() != Material.beo) {
            this.a(w2, Blocks.cMy.aM(this.g(Blocks.cMy, 3)), 2, 0, -1, w3);
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (int i2 = 0; i2 < 5; ++i2) {
                this.b(w2, i2, 12, n2, w3);
                this.b(w2, Blocks.cLg.xM(), i2, -1, n2, w3);
            }
        }
        this.a(w2, w3, 2, 1, 2, 1);
        return true;
    }

    @Override
    protected int bq(int n2, int n3) {
        return 2;
    }
}

