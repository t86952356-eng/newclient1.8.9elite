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
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.dg;
import net.minecraft.world.gen.structure.dk;
import net.minecraft.world.gen.structure.dm;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class de
extends dm {
    private static final List<dg> dSE = Lists.newArrayList((Object[])new dg[]{new dg(Items.cPm, 0, 1, 3, 3), new dg(Items.cPn, 0, 1, 5, 10), new dg(Items.cPo, 0, 1, 3, 5), new dg(Items.cPT, 0, 1, 3, 15), new dg(Items.cPi, 0, 1, 3, 15), new dg(Items.cPf, 0, 1, 1, 5), new dg(Items.cPp, 0, 1, 1, 5), new dg(Items.cQd, 0, 1, 1, 5), new dg(Items.cQc, 0, 1, 1, 5), new dg(Items.cQe, 0, 1, 1, 5), new dg(Items.cQf, 0, 1, 1, 5), new dg(d.I(Blocks.cMb), 0, 3, 7, 5), new dg(d.I(Blocks.cLi), 0, 3, 7, 5), new dg(Items.cQE, 0, 1, 1, 3), new dg(Items.cSo, 0, 1, 1, 1), new dg(Items.cSp, 0, 1, 1, 1), new dg(Items.cSq, 0, 1, 1, 1)});
    private boolean dRZ;

    public de() {
    }

    public de(dk dk2, int n2, Random random, w w2, ao ao2) {
        super(dk2, n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    public static de i(dk dk2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, 0, 0, 0, 10, 6, 7, ao2);
        return de.f(w2) && y.a(list, w2) == null ? new de(dk2, n5, random, w2, ao2) : null;
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.o("Chest", this.dRZ);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dRZ = n2.eO("Chest");
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
        this.a(w2, w3, 0, 1, 0, 9, 4, 6, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 0, 0, 0, 9, 0, 6, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 0, 4, 0, 9, 4, 6, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, w3, 0, 5, 0, 9, 5, 6, Blocks.cLW.xM(), Blocks.cLW.xM(), false);
        this.a(w2, w3, 1, 5, 1, 8, 5, 5, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 1, 1, 0, 2, 3, 0, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 0, 1, 0, 0, 4, 0, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, w3, 3, 1, 0, 3, 4, 0, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, w3, 0, 1, 6, 0, 4, 6, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, Blocks.cLh.xM(), 3, 3, 1, w3);
        this.a(w2, w3, 3, 1, 2, 3, 3, 2, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 4, 1, 3, 5, 3, 3, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 0, 1, 1, 0, 3, 5, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 1, 1, 6, 5, 3, 6, Blocks.cLh.xM(), Blocks.cLh.xM(), false);
        this.a(w2, w3, 5, 1, 0, 5, 3, 0, Blocks.cMQ.xM(), Blocks.cMQ.xM(), false);
        this.a(w2, w3, 9, 1, 0, 9, 3, 0, Blocks.cMQ.xM(), Blocks.cMQ.xM(), false);
        this.a(w2, w3, 6, 1, 4, 9, 4, 6, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        this.a(w2, Blocks.cLm.xM(), 7, 1, 5, w3);
        this.a(w2, Blocks.cLm.xM(), 8, 1, 5, w3);
        this.a(w2, Blocks.cNk.xM(), 9, 2, 5, w3);
        this.a(w2, Blocks.cNk.xM(), 9, 2, 4, w3);
        this.a(w2, w3, 7, 2, 4, 8, 2, 5, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, Blocks.cLg.xM(), 6, 1, 3, w3);
        this.a(w2, Blocks.cMn.xM(), 6, 2, 3, w3);
        this.a(w2, Blocks.cMn.xM(), 6, 3, 3, w3);
        this.a(w2, Blocks.cLV.xM(), 8, 1, 1, w3);
        this.a(w2, Blocks.cNl.xM(), 0, 2, 2, w3);
        this.a(w2, Blocks.cNl.xM(), 0, 2, 4, w3);
        this.a(w2, Blocks.cNl.xM(), 2, 2, 6, w3);
        this.a(w2, Blocks.cNl.xM(), 4, 2, 6, w3);
        this.a(w2, Blocks.cMQ.xM(), 2, 1, 4, w3);
        this.a(w2, Blocks.cMD.xM(), 2, 2, 4, w3);
        this.a(w2, Blocks.cLh.xM(), 1, 1, 5, w3);
        this.a(w2, Blocks.cMf.aM(this.g(Blocks.cMf, 3)), 2, 1, 5, w3);
        this.a(w2, Blocks.cMf.aM(this.g(Blocks.cMf, 1)), 1, 1, 4, w3);
        if (!this.dRZ && w3.k(new b(this.bn(5, 5), this.iH(1), this.bo(5, 5)))) {
            this.dRZ = true;
            this.a(w2, w3, random, 5, 1, 5, dSE, 3 + random.nextInt(6));
        }
        for (n2 = 6; n2 <= 8; ++n2) {
            if (this.a(w2, n2, 0, -1, w3).df().xb() != Material.beo || this.a(w2, n2, -1, -1, w3).df().xb() == Material.beo) continue;
            this.a(w2, Blocks.cMy.aM(this.g(Blocks.cMy, 3)), n2, 0, -1, w3);
        }
        for (n2 = 0; n2 < 7; ++n2) {
            for (int i2 = 0; i2 < 10; ++i2) {
                this.b(w2, i2, 6, n2, w3);
                this.b(w2, Blocks.cLg.xM(), i2, -1, n2, w3);
            }
        }
        this.a(w2, w3, 7, 1, 1, 1);
        return true;
    }

    @Override
    protected int bq(int n2, int n3) {
        return 3;
    }
}

