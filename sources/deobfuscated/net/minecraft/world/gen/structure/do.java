/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.dk;
import net.minecraft.world.gen.structure.dm;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class do
extends dm {
    private boolean dSU;
    private int dSV;

    public do() {
    }

    public do(dk dk2, int n2, Random random, w w2, ao ao2) {
        super(dk2, n2);
        this.dQJ = ao2;
        this.dQI = w2;
        this.dSU = random.nextBoolean();
        this.dSV = random.nextInt(3);
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.B("T", this.dSV);
        n2.o("C", this.dSU);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dSV = n2.eG("T");
        this.dSU = n2.eO("C");
    }

    public static do l(dk dk2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, 0, 0, 0, 4, 6, 5, ao2);
        return do.f(w2) && y.a(list, w2) == null ? new do(dk2, n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.dSR < 0) {
            this.dSR = this.b(w2, w3);
            if (this.dSR < 0) {
                return true;
            }
            this.dQI.ad(0, this.dSR - this.dQI.dQF + 6 - 1, 0);
        }
        this.a(w2, w3, 1, 1, 1, 3, 5, 4, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 0, 0, 0, 3, 0, 4, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 1, 0, 1, 2, 0, 3, Blocks.cLf.xM(), Blocks.cLf.xM(), false);
        if (this.dSU) {
            this.a(w2, w3, 1, 4, 1, 2, 4, 3, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        } else {
            this.a(w2, w3, 1, 5, 1, 2, 5, 3, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        }
        this.a(w2, Blocks.cLt.xM(), 1, 4, 0, w3);
        this.a(w2, Blocks.cLt.xM(), 2, 4, 0, w3);
        this.a(w2, Blocks.cLt.xM(), 1, 4, 4, w3);
        this.a(w2, Blocks.cLt.xM(), 2, 4, 4, w3);
        this.a(w2, Blocks.cLt.xM(), 0, 4, 1, w3);
        this.a(w2, Blocks.cLt.xM(), 0, 4, 2, w3);
        this.a(w2, Blocks.cLt.xM(), 0, 4, 3, w3);
        this.a(w2, Blocks.cLt.xM(), 3, 4, 1, w3);
        this.a(w2, Blocks.cLt.xM(), 3, 4, 2, w3);
        this.a(w2, Blocks.cLt.xM(), 3, 4, 3, w3);
        this.a(w2, w3, 0, 1, 0, 0, 3, 0, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, w3, 3, 1, 0, 3, 3, 0, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, w3, 0, 1, 4, 0, 3, 4, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, w3, 3, 1, 4, 3, 3, 4, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, w3, 0, 1, 1, 0, 3, 3, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 3, 1, 1, 3, 3, 3, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 1, 1, 0, 2, 3, 0, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 1, 1, 4, 2, 3, 4, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, Blocks.cNl.xM(), 0, 2, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 3, 2, 2, w3);
        if (this.dSV > 0) {
            this.a(w2, Blocks.cMQ.xM(), this.dSV, 1, 3, w3);
            this.a(w2, Blocks.cMD.xM(), this.dSV, 2, 3, w3);
        }
        this.a(w2, Blocks.cLc.xM(), 1, 1, 0, w3);
        this.a(w2, Blocks.cLc.xM(), 1, 2, 0, w3);
        this.a(w2, w3, random, 1, 1, 0, ao.hz(this.g(Blocks.cMq, 1)));
        if (this.a(w2, 1, 0, -1, w3).df().xb() == Material.beo && this.a(w2, 1, -1, -1, w3).df().xb() != Material.beo) {
            this.a(w2, Blocks.cMy.aM(this.g(Blocks.cMy, 3)), 1, 0, -1, w3);
        }
        for (int i2 = 0; i2 < 5; ++i2) {
            for (int i3 = 0; i3 < 4; ++i3) {
                this.b(w2, i3, 6, i2, w3);
                this.b(w2, Blocks.cLg.xM(), i3, -1, i2, w3);
            }
        }
        this.a(w2, w3, 1, 1, 2, 1);
        return true;
    }
}

