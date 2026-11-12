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
import net.minecraft.world.gen.structure.ab;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class ae
extends y {
    private ao dQT;
    private boolean dQU;

    public ae() {
    }

    @Override
    protected void N(n n2) {
        n2.o("tf", this.dQU);
        n2.B("D", this.dQT.asA());
    }

    @Override
    protected void O(n n2) {
        this.dQU = n2.eO("tf");
        this.dQT = ao.hz(n2.eG("D"));
    }

    public ae(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQT = ao2;
        this.dQI = w2;
        this.dQU = w2.ayM() > 3;
    }

    public static w b(List<y> list, Random random, int n2, int n3, int n4, ao ao2) {
        w w2 = new w(n2, n3, n4, n2, n3 + 2, n4);
        if (random.nextInt(4) == 0) {
            w2.dQF += 4;
        }
        switch (ao2) {
            case dws: {
                w2.dQB = n2 - 1;
                w2.dQE = n2 + 3;
                w2.dQD = n4 - 4;
                break;
            }
            case dwt: {
                w2.dQB = n2 - 1;
                w2.dQE = n2 + 3;
                w2.dQG = n4 + 4;
                break;
            }
            case dwu: {
                w2.dQB = n2 - 4;
                w2.dQD = n4 - 1;
                w2.dQG = n4 + 3;
                break;
            }
            case dwv: {
                w2.dQE = n2 + 4;
                w2.dQD = n4 - 1;
                w2.dQG = n4 + 3;
            }
        }
        return y.a(list, w2) != null ? null : w2;
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        int n2 = this.ayS();
        switch (this.dQT) {
            case dws: {
                ab.a(y2, list, random, this.dQI.dQB + 1, this.dQI.dQC, this.dQI.dQD - 1, ao.dws, n2);
                ab.a(y2, list, random, this.dQI.dQB - 1, this.dQI.dQC, this.dQI.dQD + 1, ao.dwu, n2);
                ab.a(y2, list, random, this.dQI.dQE + 1, this.dQI.dQC, this.dQI.dQD + 1, ao.dwv, n2);
                break;
            }
            case dwt: {
                ab.a(y2, list, random, this.dQI.dQB + 1, this.dQI.dQC, this.dQI.dQG + 1, ao.dwt, n2);
                ab.a(y2, list, random, this.dQI.dQB - 1, this.dQI.dQC, this.dQI.dQD + 1, ao.dwu, n2);
                ab.a(y2, list, random, this.dQI.dQE + 1, this.dQI.dQC, this.dQI.dQD + 1, ao.dwv, n2);
                break;
            }
            case dwu: {
                ab.a(y2, list, random, this.dQI.dQB + 1, this.dQI.dQC, this.dQI.dQD - 1, ao.dws, n2);
                ab.a(y2, list, random, this.dQI.dQB + 1, this.dQI.dQC, this.dQI.dQG + 1, ao.dwt, n2);
                ab.a(y2, list, random, this.dQI.dQB - 1, this.dQI.dQC, this.dQI.dQD + 1, ao.dwu, n2);
                break;
            }
            case dwv: {
                ab.a(y2, list, random, this.dQI.dQB + 1, this.dQI.dQC, this.dQI.dQD - 1, ao.dws, n2);
                ab.a(y2, list, random, this.dQI.dQB + 1, this.dQI.dQC, this.dQI.dQG + 1, ao.dwt, n2);
                ab.a(y2, list, random, this.dQI.dQE + 1, this.dQI.dQC, this.dQI.dQD + 1, ao.dwv, n2);
            }
        }
        if (this.dQU) {
            if (random.nextBoolean()) {
                ab.a(y2, list, random, this.dQI.dQB + 1, this.dQI.dQC + 3 + 1, this.dQI.dQD - 1, ao.dws, n2);
            }
            if (random.nextBoolean()) {
                ab.a(y2, list, random, this.dQI.dQB - 1, this.dQI.dQC + 3 + 1, this.dQI.dQD + 1, ao.dwu, n2);
            }
            if (random.nextBoolean()) {
                ab.a(y2, list, random, this.dQI.dQE + 1, this.dQI.dQC + 3 + 1, this.dQI.dQD + 1, ao.dwv, n2);
            }
            if (random.nextBoolean()) {
                ab.a(y2, list, random, this.dQI.dQB + 1, this.dQI.dQC + 3 + 1, this.dQI.dQG + 1, ao.dwt, n2);
            }
        }
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w2, w3)) {
            return false;
        }
        if (this.dQU) {
            this.a(w2, w3, this.dQI.dQB + 1, this.dQI.dQC, this.dQI.dQD, this.dQI.dQE - 1, this.dQI.dQC + 3 - 1, this.dQI.dQG, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
            this.a(w2, w3, this.dQI.dQB, this.dQI.dQC, this.dQI.dQD + 1, this.dQI.dQE, this.dQI.dQC + 3 - 1, this.dQI.dQG - 1, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
            this.a(w2, w3, this.dQI.dQB + 1, this.dQI.dQF - 2, this.dQI.dQD, this.dQI.dQE - 1, this.dQI.dQF, this.dQI.dQG, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
            this.a(w2, w3, this.dQI.dQB, this.dQI.dQF - 2, this.dQI.dQD + 1, this.dQI.dQE, this.dQI.dQF, this.dQI.dQG - 1, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
            this.a(w2, w3, this.dQI.dQB + 1, this.dQI.dQC + 3, this.dQI.dQD + 1, this.dQI.dQE - 1, this.dQI.dQC + 3, this.dQI.dQG - 1, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        } else {
            this.a(w2, w3, this.dQI.dQB + 1, this.dQI.dQC, this.dQI.dQD, this.dQI.dQE - 1, this.dQI.dQF, this.dQI.dQG, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
            this.a(w2, w3, this.dQI.dQB, this.dQI.dQC, this.dQI.dQD + 1, this.dQI.dQE, this.dQI.dQF, this.dQI.dQG - 1, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        }
        this.a(w2, w3, this.dQI.dQB + 1, this.dQI.dQC, this.dQI.dQD + 1, this.dQI.dQB + 1, this.dQI.dQF, this.dQI.dQD + 1, Blocks.cLh.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, this.dQI.dQB + 1, this.dQI.dQC, this.dQI.dQG - 1, this.dQI.dQB + 1, this.dQI.dQF, this.dQI.dQG - 1, Blocks.cLh.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, this.dQI.dQE - 1, this.dQI.dQC, this.dQI.dQD + 1, this.dQI.dQE - 1, this.dQI.dQF, this.dQI.dQD + 1, Blocks.cLh.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, this.dQI.dQE - 1, this.dQI.dQC, this.dQI.dQG - 1, this.dQI.dQE - 1, this.dQI.dQF, this.dQI.dQG - 1, Blocks.cLh.xM(), Blocks.cLc.xM(), false);
        for (int i2 = this.dQI.dQB; i2 <= this.dQI.dQE; ++i2) {
            for (int i3 = this.dQI.dQD; i3 <= this.dQI.dQG; ++i3) {
                if (this.a(w2, i2, this.dQI.dQC - 1, i3, w3).df().xb() != Material.beo) continue;
                this.a(w2, Blocks.cLh.xM(), i2, this.dQI.dQC - 1, i3, w3);
            }
        }
        return true;
    }
}

