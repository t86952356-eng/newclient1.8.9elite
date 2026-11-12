/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.bs;
import net.minecraft.world.gen.structure.w;

public class bt
extends br {
    private int dRO;

    public bt() {
    }

    public bt(ao ao2, bs bs2, Random random) {
        super(1, ao2, bs2, 1, 1, 1);
        this.dRO = random.nextInt(3);
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        boolean bl2;
        if (this.dRH.dRI / 25 > 0) {
            this.a(w2, w3, 0, 0, this.dRH.dRK[ao.dwq.OY()]);
        }
        if (this.dRH.dRJ[ao.dwr.OY()] == null) {
            this.a(w2, w3, 1, 4, 1, 6, 4, 6, dRx);
        }
        boolean bl3 = bl2 = this.dRO != 0 && random.nextBoolean() && !this.dRH.dRK[ao.dwq.OY()] && !this.dRH.dRK[ao.dwr.OY()] && this.dRH.azb() > 1;
        if (this.dRO == 0) {
            this.a(w2, w3, 0, 1, 0, 2, 1, 2, dRy, dRy, false);
            this.a(w2, w3, 0, 3, 0, 2, 3, 2, dRy, dRy, false);
            this.a(w2, w3, 0, 2, 0, 0, 2, 2, dRx, dRx, false);
            this.a(w2, w3, 1, 2, 0, 2, 2, 0, dRx, dRx, false);
            this.a(w2, dRB, 1, 2, 1, w3);
            this.a(w2, w3, 5, 1, 0, 7, 1, 2, dRy, dRy, false);
            this.a(w2, w3, 5, 3, 0, 7, 3, 2, dRy, dRy, false);
            this.a(w2, w3, 7, 2, 0, 7, 2, 2, dRx, dRx, false);
            this.a(w2, w3, 5, 2, 0, 6, 2, 0, dRx, dRx, false);
            this.a(w2, dRB, 6, 2, 1, w3);
            this.a(w2, w3, 0, 1, 5, 2, 1, 7, dRy, dRy, false);
            this.a(w2, w3, 0, 3, 5, 2, 3, 7, dRy, dRy, false);
            this.a(w2, w3, 0, 2, 5, 0, 2, 7, dRx, dRx, false);
            this.a(w2, w3, 1, 2, 7, 2, 2, 7, dRx, dRx, false);
            this.a(w2, dRB, 1, 2, 6, w3);
            this.a(w2, w3, 5, 1, 5, 7, 1, 7, dRy, dRy, false);
            this.a(w2, w3, 5, 3, 5, 7, 3, 7, dRy, dRy, false);
            this.a(w2, w3, 7, 2, 5, 7, 2, 7, dRx, dRx, false);
            this.a(w2, w3, 5, 2, 7, 6, 2, 7, dRx, dRx, false);
            this.a(w2, dRB, 6, 2, 6, w3);
            if (this.dRH.dRK[ao.dwt.OY()]) {
                this.a(w2, w3, 3, 3, 0, 4, 3, 0, dRy, dRy, false);
            } else {
                this.a(w2, w3, 3, 3, 0, 4, 3, 1, dRy, dRy, false);
                this.a(w2, w3, 3, 2, 0, 4, 2, 0, dRx, dRx, false);
                this.a(w2, w3, 3, 1, 0, 4, 1, 1, dRy, dRy, false);
            }
            if (this.dRH.dRK[ao.dws.OY()]) {
                this.a(w2, w3, 3, 3, 7, 4, 3, 7, dRy, dRy, false);
            } else {
                this.a(w2, w3, 3, 3, 6, 4, 3, 7, dRy, dRy, false);
                this.a(w2, w3, 3, 2, 7, 4, 2, 7, dRx, dRx, false);
                this.a(w2, w3, 3, 1, 6, 4, 1, 7, dRy, dRy, false);
            }
            if (this.dRH.dRK[ao.dwu.OY()]) {
                this.a(w2, w3, 0, 3, 3, 0, 3, 4, dRy, dRy, false);
            } else {
                this.a(w2, w3, 0, 3, 3, 1, 3, 4, dRy, dRy, false);
                this.a(w2, w3, 0, 2, 3, 0, 2, 4, dRx, dRx, false);
                this.a(w2, w3, 0, 1, 3, 1, 1, 4, dRy, dRy, false);
            }
            if (this.dRH.dRK[ao.dwv.OY()]) {
                this.a(w2, w3, 7, 3, 3, 7, 3, 4, dRy, dRy, false);
            } else {
                this.a(w2, w3, 6, 3, 3, 7, 3, 4, dRy, dRy, false);
                this.a(w2, w3, 7, 2, 3, 7, 2, 4, dRx, dRx, false);
                this.a(w2, w3, 6, 1, 3, 7, 1, 4, dRy, dRy, false);
            }
        } else if (this.dRO == 1) {
            this.a(w2, w3, 2, 1, 2, 2, 3, 2, dRy, dRy, false);
            this.a(w2, w3, 2, 1, 5, 2, 3, 5, dRy, dRy, false);
            this.a(w2, w3, 5, 1, 5, 5, 3, 5, dRy, dRy, false);
            this.a(w2, w3, 5, 1, 2, 5, 3, 2, dRy, dRy, false);
            this.a(w2, dRB, 2, 2, 2, w3);
            this.a(w2, dRB, 2, 2, 5, w3);
            this.a(w2, dRB, 5, 2, 5, w3);
            this.a(w2, dRB, 5, 2, 2, w3);
            this.a(w2, w3, 0, 1, 0, 1, 3, 0, dRy, dRy, false);
            this.a(w2, w3, 0, 1, 1, 0, 3, 1, dRy, dRy, false);
            this.a(w2, w3, 0, 1, 7, 1, 3, 7, dRy, dRy, false);
            this.a(w2, w3, 0, 1, 6, 0, 3, 6, dRy, dRy, false);
            this.a(w2, w3, 6, 1, 7, 7, 3, 7, dRy, dRy, false);
            this.a(w2, w3, 7, 1, 6, 7, 3, 6, dRy, dRy, false);
            this.a(w2, w3, 6, 1, 0, 7, 3, 0, dRy, dRy, false);
            this.a(w2, w3, 7, 1, 1, 7, 3, 1, dRy, dRy, false);
            this.a(w2, dRx, 1, 2, 0, w3);
            this.a(w2, dRx, 0, 2, 1, w3);
            this.a(w2, dRx, 1, 2, 7, w3);
            this.a(w2, dRx, 0, 2, 6, w3);
            this.a(w2, dRx, 6, 2, 7, w3);
            this.a(w2, dRx, 7, 2, 6, w3);
            this.a(w2, dRx, 6, 2, 0, w3);
            this.a(w2, dRx, 7, 2, 1, w3);
            if (!this.dRH.dRK[ao.dwt.OY()]) {
                this.a(w2, w3, 1, 3, 0, 6, 3, 0, dRy, dRy, false);
                this.a(w2, w3, 1, 2, 0, 6, 2, 0, dRx, dRx, false);
                this.a(w2, w3, 1, 1, 0, 6, 1, 0, dRy, dRy, false);
            }
            if (!this.dRH.dRK[ao.dws.OY()]) {
                this.a(w2, w3, 1, 3, 7, 6, 3, 7, dRy, dRy, false);
                this.a(w2, w3, 1, 2, 7, 6, 2, 7, dRx, dRx, false);
                this.a(w2, w3, 1, 1, 7, 6, 1, 7, dRy, dRy, false);
            }
            if (!this.dRH.dRK[ao.dwu.OY()]) {
                this.a(w2, w3, 0, 3, 1, 0, 3, 6, dRy, dRy, false);
                this.a(w2, w3, 0, 2, 1, 0, 2, 6, dRx, dRx, false);
                this.a(w2, w3, 0, 1, 1, 0, 1, 6, dRy, dRy, false);
            }
            if (!this.dRH.dRK[ao.dwv.OY()]) {
                this.a(w2, w3, 7, 3, 1, 7, 3, 6, dRy, dRy, false);
                this.a(w2, w3, 7, 2, 1, 7, 2, 6, dRx, dRx, false);
                this.a(w2, w3, 7, 1, 1, 7, 1, 6, dRy, dRy, false);
            }
        } else if (this.dRO == 2) {
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
            if (this.dRH.dRK[ao.dws.OY()]) {
                this.a(w2, w3, 3, 1, 7, 4, 2, 7, false);
            }
            if (this.dRH.dRK[ao.dwu.OY()]) {
                this.a(w2, w3, 0, 1, 3, 0, 2, 4, false);
            }
            if (this.dRH.dRK[ao.dwv.OY()]) {
                this.a(w2, w3, 7, 1, 3, 7, 2, 4, false);
            }
        }
        if (bl2) {
            this.a(w2, w3, 3, 1, 3, 4, 1, 4, dRy, dRy, false);
            this.a(w2, w3, 3, 2, 3, 4, 2, 4, dRx, dRx, false);
            this.a(w2, w3, 3, 3, 3, 4, 3, 4, dRy, dRy, false);
        }
        return true;
    }
}

