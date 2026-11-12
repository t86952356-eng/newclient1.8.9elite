/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.dk;
import net.minecraft.world.gen.structure.dm;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class dg
extends dm {
    private boolean dSF;

    public dg() {
    }

    public dg(dk dk2, int n2, Random random, w w2, ao ao2) {
        super(dk2, n2);
        this.dQJ = ao2;
        this.dQI = w2;
        this.dSF = random.nextBoolean();
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.o("Terrace", this.dSF);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dSF = n2.eO("Terrace");
    }

    public static dg k(dk dk2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, 0, 0, 0, 5, 6, 5, ao2);
        return y.a(list, w2) != null ? null : new dg(dk2, n5, random, w2, ao2);
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        if (this.dSR < 0) {
            this.dSR = this.b(w2, w3);
            if (this.dSR < 0) {
                return true;
            }
            this.dQI.ad(0, this.dSR - this.dQI.dQF + 6 - 1, 0);
        }
        this.a(w2, w3, 0, 0, 0, 4, 0, 4, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 0, 4, 0, 4, 4, 4, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, w3, 1, 4, 1, 3, 4, 3, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, Blocks.cLg.xM(), 0, 1, 0, w3);
        this.a(w2, Blocks.cLg.xM(), 0, 2, 0, w3);
        this.a(w2, Blocks.cLg.xM(), 0, 3, 0, w3);
        this.a(w2, Blocks.cLg.xM(), 4, 1, 0, w3);
        this.a(w2, Blocks.cLg.xM(), 4, 2, 0, w3);
        this.a(w2, Blocks.cLg.xM(), 4, 3, 0, w3);
        this.a(w2, Blocks.cLg.xM(), 0, 1, 4, w3);
        this.a(w2, Blocks.cLg.xM(), 0, 2, 4, w3);
        this.a(w2, Blocks.cLg.xM(), 0, 3, 4, w3);
        this.a(w2, Blocks.cLg.xM(), 4, 1, 4, w3);
        this.a(w2, Blocks.cLg.xM(), 4, 2, 4, w3);
        this.a(w2, Blocks.cLg.xM(), 4, 3, 4, w3);
        this.a(w2, w3, 0, 1, 1, 0, 3, 3, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 4, 1, 1, 4, 3, 3, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 1, 1, 4, 3, 3, 4, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, Blocks.cNl.xM(), 0, 2, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 2, 2, 4, w3);
        this.a(w2, Blocks.cNl.xM(), 4, 2, 2, w3);
        this.a(w2, Blocks.cLh.xM(), 1, 1, 0, w3);
        this.a(w2, Blocks.cLh.xM(), 1, 2, 0, w3);
        this.a(w2, Blocks.cLh.xM(), 1, 3, 0, w3);
        this.a(w2, Blocks.cLh.xM(), 2, 3, 0, w3);
        this.a(w2, Blocks.cLh.xM(), 3, 3, 0, w3);
        this.a(w2, Blocks.cLh.xM(), 3, 2, 0, w3);
        this.a(w2, Blocks.cLh.xM(), 3, 1, 0, w3);
        if (this.a(w2, 2, 0, -1, w3).df().xb() == Material.beo && this.a(w2, 2, -1, -1, w3).df().xb() != Material.beo) {
            this.a(w2, Blocks.cMy.aM(this.g(Blocks.cMy, 3)), 2, 0, -1, w3);
        }
        this.a(w2, w3, 1, 1, 1, 3, 3, 3, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        if (this.dSF) {
            this.a(w2, Blocks.cMQ.xM(), 0, 5, 0, w3);
            this.a(w2, Blocks.cMQ.xM(), 1, 5, 0, w3);
            this.a(w2, Blocks.cMQ.xM(), 2, 5, 0, w3);
            this.a(w2, Blocks.cMQ.xM(), 3, 5, 0, w3);
            this.a(w2, Blocks.cMQ.xM(), 4, 5, 0, w3);
            this.a(w2, Blocks.cMQ.xM(), 0, 5, 4, w3);
            this.a(w2, Blocks.cMQ.xM(), 1, 5, 4, w3);
            this.a(w2, Blocks.cMQ.xM(), 2, 5, 4, w3);
            this.a(w2, Blocks.cMQ.xM(), 3, 5, 4, w3);
            this.a(w2, Blocks.cMQ.xM(), 4, 5, 4, w3);
            this.a(w2, Blocks.cMQ.xM(), 4, 5, 1, w3);
            this.a(w2, Blocks.cMQ.xM(), 4, 5, 2, w3);
            this.a(w2, Blocks.cMQ.xM(), 4, 5, 3, w3);
            this.a(w2, Blocks.cMQ.xM(), 0, 5, 1, w3);
            this.a(w2, Blocks.cMQ.xM(), 0, 5, 2, w3);
            this.a(w2, Blocks.cMQ.xM(), 0, 5, 3, w3);
        }
        if (this.dSF) {
            n2 = this.g(Blocks.cMw, 3);
            this.a(w2, Blocks.cMw.aM(n2), 3, 1, 3, w3);
            this.a(w2, Blocks.cMw.aM(n2), 3, 2, 3, w3);
            this.a(w2, Blocks.cMw.aM(n2), 3, 3, 3, w3);
            this.a(w2, Blocks.cMw.aM(n2), 3, 4, 3, w3);
        }
        this.a(w2, Blocks.cMc.xM().a(BlockTorch.bcF, this.dQJ), 2, 3, 1, w3);
        for (n2 = 0; n2 < 5; ++n2) {
            for (int i2 = 0; i2 < 5; ++i2) {
                this.b(w2, i2, 6, n2, w3);
                this.b(w2, Blocks.cLg.xM(), i2, -1, n2, w3);
            }
        }
        this.a(w2, w3, 1, 1, 2, 1);
        return true;
    }
}

