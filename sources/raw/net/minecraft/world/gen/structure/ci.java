/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.cc;
import net.minecraft.world.gen.structure.cr;
import net.minecraft.world.gen.structure.cv;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class ci
extends cv {
    private boolean dSb;
    private boolean dSc;
    private boolean dSd;
    private boolean dSe;

    public ci() {
    }

    public ci(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dSt = this.o(random);
        this.dQI = w2;
        this.dSb = random.nextBoolean();
        this.dSc = random.nextBoolean();
        this.dSd = random.nextBoolean();
        this.dSe = random.nextInt(3) > 0;
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.o("leftLow", this.dSb);
        n2.o("leftHigh", this.dSc);
        n2.o("rightLow", this.dSd);
        n2.o("rightHigh", this.dSe);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dSb = n2.eO("leftLow");
        this.dSc = n2.eO("leftHigh");
        this.dSd = n2.eO("rightLow");
        this.dSe = n2.eO("rightHigh");
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        int n2 = 3;
        int n3 = 5;
        if (this.dQJ == ao.dwu || this.dQJ == ao.dws) {
            n2 = 8 - n2;
            n3 = 8 - n3;
        }
        this.a((cr)y2, list, random, 5, 1);
        if (this.dSb) {
            this.b((cr)y2, list, random, n2, 1);
        }
        if (this.dSc) {
            this.b((cr)y2, list, random, n3, 7);
        }
        if (this.dSd) {
            this.c((cr)y2, list, random, n2, 1);
        }
        if (this.dSe) {
            this.c((cr)y2, list, random, n3, 7);
        }
    }

    public static ci o(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -4, -3, 0, 10, 9, 11, ao2);
        return ci.e(w2) && y.a(list, w2) == null ? new ci(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w2, w3)) {
            return false;
        }
        this.a(w2, w3, 0, 0, 0, 9, 8, 10, true, random, cc.dRW);
        this.a(w2, random, w3, this.dSt, 4, 3, 0);
        if (this.dSb) {
            this.a(w2, w3, 0, 3, 1, 0, 5, 3, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        }
        if (this.dSd) {
            this.a(w2, w3, 9, 3, 1, 9, 5, 3, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        }
        if (this.dSc) {
            this.a(w2, w3, 0, 5, 7, 0, 7, 9, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        }
        if (this.dSe) {
            this.a(w2, w3, 9, 5, 7, 9, 7, 9, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        }
        this.a(w2, w3, 5, 1, 10, 7, 3, 10, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 1, 2, 1, 8, 2, 6, false, random, cc.dRW);
        this.a(w2, w3, 4, 1, 5, 4, 4, 9, false, random, cc.dRW);
        this.a(w2, w3, 8, 1, 5, 8, 4, 9, false, random, cc.dRW);
        this.a(w2, w3, 1, 4, 7, 3, 4, 9, false, random, cc.dRW);
        this.a(w2, w3, 1, 3, 5, 3, 3, 6, false, random, cc.dRW);
        this.a(w2, w3, 1, 3, 4, 3, 3, 4, Blocks.cLW.xM(), Blocks.cLW.xM(), false);
        this.a(w2, w3, 1, 4, 6, 3, 4, 6, Blocks.cLW.xM(), Blocks.cLW.xM(), false);
        this.a(w2, w3, 5, 1, 7, 7, 1, 8, false, random, cc.dRW);
        this.a(w2, w3, 5, 1, 9, 7, 1, 9, Blocks.cLW.xM(), Blocks.cLW.xM(), false);
        this.a(w2, w3, 5, 2, 7, 7, 2, 7, Blocks.cLW.xM(), Blocks.cLW.xM(), false);
        this.a(w2, w3, 4, 5, 7, 4, 5, 9, Blocks.cLW.xM(), Blocks.cLW.xM(), false);
        this.a(w2, w3, 8, 5, 7, 8, 5, 9, Blocks.cLW.xM(), Blocks.cLW.xM(), false);
        this.a(w2, w3, 5, 5, 7, 7, 5, 9, Blocks.cLV.xM(), Blocks.cLV.xM(), false);
        this.a(w2, Blocks.cMc.xM(), 6, 5, 6, w3);
        return true;
    }
}

