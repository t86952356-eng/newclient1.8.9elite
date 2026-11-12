/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.bs;
import net.minecraft.world.gen.structure.w;

public class bu
extends br {
    public bu() {
    }

    public bu(ao ao2, bs bs2, Random random) {
        super(1, ao2, bs2, 1, 1, 1);
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.dRH.dRI / 25 > 0) {
            this.a(w2, w3, 0, 0, this.dRH.dRK[ao.dwq.OY()]);
        }
        if (this.dRH.dRJ[ao.dwr.OY()] == null) {
            this.a(w2, w3, 1, 4, 1, 6, 4, 6, dRx);
        }
        for (int i2 = 1; i2 <= 6; ++i2) {
            for (int i3 = 1; i3 <= 6; ++i3) {
                if (random.nextInt(3) == 0) continue;
                int n2 = 2 + (random.nextInt(4) == 0 ? 0 : 1);
                this.a(w2, w3, i2, n2, i3, i2, 3, i3, Blocks.cLx.aM(1), Blocks.cLx.aM(1), false);
            }
        }
        this.a(w2, w3, 0, 1, 0, 0, 1, 7, dRy, dRy, false);
        this.a(w2, w3, 7, 1, 0, 7, 1, 7, dRy, dRy, false);
        this.a(w2, w3, 1, 1, 0, 6, 1, 0, dRy, dRy, false);
        this.a(w2, w3, 1, 1, 7, 6, 1, 7, dRy, dRy, false);
        this.a(w2, w3, 0, 2, 0, 0, 2, 7, dRz, dRz, false);
        this.a(w2, w3, 7, 2, 0, 7, 2, 7, dRz, dRz, false);
        this.a(w2, w3, 1, 2, 0, 6, 2, 0, dRz, dRz, false);
        this.a(w2, w3, 1, 2, 7, 6, 2, 7, dRz, dRz, false);
        this.a(w2, w3, 0, 3, 0, 0, 3, 7, dRy, dRy, false);
        this.a(w2, w3, 7, 3, 0, 7, 3, 7, dRy, dRy, false);
        this.a(w2, w3, 1, 3, 0, 6, 3, 0, dRy, dRy, false);
        this.a(w2, w3, 1, 3, 7, 6, 3, 7, dRy, dRy, false);
        this.a(w2, w3, 0, 1, 3, 0, 2, 4, dRz, dRz, false);
        this.a(w2, w3, 7, 1, 3, 7, 2, 4, dRz, dRz, false);
        this.a(w2, w3, 3, 1, 0, 4, 2, 0, dRz, dRz, false);
        this.a(w2, w3, 3, 1, 7, 4, 2, 7, dRz, dRz, false);
        if (this.dRH.dRK[ao.dwt.OY()]) {
            this.a(w2, w3, 3, 1, 0, 4, 2, 0, false);
        }
        return true;
    }
}

