/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.bs;
import net.minecraft.world.gen.structure.w;

public class bh
extends br {
    public bh() {
    }

    public bh(ao ao2, bs bs2, Random random) {
        super(1, ao2, bs2, 1, 2, 1);
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.dRH.dRI / 25 > 0) {
            this.a(w2, w3, 0, 0, this.dRH.dRK[ao.dwq.OY()]);
        }
        bs bs2 = this.dRH.dRJ[ao.dwr.OY()];
        if (bs2.dRJ[ao.dwr.OY()] == null) {
            this.a(w2, w3, 1, 8, 1, 6, 8, 6, dRx);
        }
        this.a(w2, w3, 0, 4, 0, 0, 4, 7, dRy, dRy, false);
        this.a(w2, w3, 7, 4, 0, 7, 4, 7, dRy, dRy, false);
        this.a(w2, w3, 1, 4, 0, 6, 4, 0, dRy, dRy, false);
        this.a(w2, w3, 1, 4, 7, 6, 4, 7, dRy, dRy, false);
        this.a(w2, w3, 2, 4, 1, 2, 4, 2, dRy, dRy, false);
        this.a(w2, w3, 1, 4, 2, 1, 4, 2, dRy, dRy, false);
        this.a(w2, w3, 5, 4, 1, 5, 4, 2, dRy, dRy, false);
        this.a(w2, w3, 6, 4, 2, 6, 4, 2, dRy, dRy, false);
        this.a(w2, w3, 2, 4, 5, 2, 4, 6, dRy, dRy, false);
        this.a(w2, w3, 1, 4, 5, 1, 4, 5, dRy, dRy, false);
        this.a(w2, w3, 5, 4, 5, 5, 4, 6, dRy, dRy, false);
        this.a(w2, w3, 6, 4, 5, 6, 4, 5, dRy, dRy, false);
        bs bs3 = this.dRH;
        for (int i2 = 1; i2 <= 5; i2 += 4) {
            int n2 = 0;
            if (bs3.dRK[ao.dwt.OY()]) {
                this.a(w2, w3, 2, i2, n2, 2, i2 + 2, n2, dRy, dRy, false);
                this.a(w2, w3, 5, i2, n2, 5, i2 + 2, n2, dRy, dRy, false);
                this.a(w2, w3, 3, i2 + 2, n2, 4, i2 + 2, n2, dRy, dRy, false);
            } else {
                this.a(w2, w3, 0, i2, n2, 7, i2 + 2, n2, dRy, dRy, false);
                this.a(w2, w3, 0, i2 + 1, n2, 7, i2 + 1, n2, dRx, dRx, false);
            }
            n2 = 7;
            if (bs3.dRK[ao.dws.OY()]) {
                this.a(w2, w3, 2, i2, n2, 2, i2 + 2, n2, dRy, dRy, false);
                this.a(w2, w3, 5, i2, n2, 5, i2 + 2, n2, dRy, dRy, false);
                this.a(w2, w3, 3, i2 + 2, n2, 4, i2 + 2, n2, dRy, dRy, false);
            } else {
                this.a(w2, w3, 0, i2, n2, 7, i2 + 2, n2, dRy, dRy, false);
                this.a(w2, w3, 0, i2 + 1, n2, 7, i2 + 1, n2, dRx, dRx, false);
            }
            int n3 = 0;
            if (bs3.dRK[ao.dwu.OY()]) {
                this.a(w2, w3, n3, i2, 2, n3, i2 + 2, 2, dRy, dRy, false);
                this.a(w2, w3, n3, i2, 5, n3, i2 + 2, 5, dRy, dRy, false);
                this.a(w2, w3, n3, i2 + 2, 3, n3, i2 + 2, 4, dRy, dRy, false);
            } else {
                this.a(w2, w3, n3, i2, 0, n3, i2 + 2, 7, dRy, dRy, false);
                this.a(w2, w3, n3, i2 + 1, 0, n3, i2 + 1, 7, dRx, dRx, false);
            }
            n3 = 7;
            if (bs3.dRK[ao.dwv.OY()]) {
                this.a(w2, w3, n3, i2, 2, n3, i2 + 2, 2, dRy, dRy, false);
                this.a(w2, w3, n3, i2, 5, n3, i2 + 2, 5, dRy, dRy, false);
                this.a(w2, w3, n3, i2 + 2, 3, n3, i2 + 2, 4, dRy, dRy, false);
            } else {
                this.a(w2, w3, n3, i2, 0, n3, i2 + 2, 7, dRy, dRy, false);
                this.a(w2, w3, n3, i2 + 1, 0, n3, i2 + 1, 7, dRx, dRx, false);
            }
            bs3 = bs2;
        }
        return true;
    }
}

