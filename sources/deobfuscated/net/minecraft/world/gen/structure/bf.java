/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.bs;
import net.minecraft.world.gen.structure.w;

public class bf
extends br {
    public bf() {
    }

    public bf(ao ao2, bs bs2, Random random) {
        super(1, ao2, bs2, 2, 1, 1);
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        bs bs2 = this.dRH.dRJ[ao.dwv.OY()];
        bs bs3 = this.dRH;
        if (this.dRH.dRI / 25 > 0) {
            this.a(w2, w3, 8, 0, bs2.dRK[ao.dwq.OY()]);
            this.a(w2, w3, 0, 0, bs3.dRK[ao.dwq.OY()]);
        }
        if (bs3.dRJ[ao.dwr.OY()] == null) {
            this.a(w2, w3, 1, 4, 1, 7, 4, 6, dRx);
        }
        if (bs2.dRJ[ao.dwr.OY()] == null) {
            this.a(w2, w3, 8, 4, 1, 14, 4, 6, dRx);
        }
        this.a(w2, w3, 0, 3, 0, 0, 3, 7, dRy, dRy, false);
        this.a(w2, w3, 15, 3, 0, 15, 3, 7, dRy, dRy, false);
        this.a(w2, w3, 1, 3, 0, 15, 3, 0, dRy, dRy, false);
        this.a(w2, w3, 1, 3, 7, 14, 3, 7, dRy, dRy, false);
        this.a(w2, w3, 0, 2, 0, 0, 2, 7, dRx, dRx, false);
        this.a(w2, w3, 15, 2, 0, 15, 2, 7, dRx, dRx, false);
        this.a(w2, w3, 1, 2, 0, 15, 2, 0, dRx, dRx, false);
        this.a(w2, w3, 1, 2, 7, 14, 2, 7, dRx, dRx, false);
        this.a(w2, w3, 0, 1, 0, 0, 1, 7, dRy, dRy, false);
        this.a(w2, w3, 15, 1, 0, 15, 1, 7, dRy, dRy, false);
        this.a(w2, w3, 1, 1, 0, 15, 1, 0, dRy, dRy, false);
        this.a(w2, w3, 1, 1, 7, 14, 1, 7, dRy, dRy, false);
        this.a(w2, w3, 5, 1, 0, 10, 1, 4, dRy, dRy, false);
        this.a(w2, w3, 6, 2, 0, 9, 2, 3, dRx, dRx, false);
        this.a(w2, w3, 5, 3, 0, 10, 3, 4, dRy, dRy, false);
        this.a(w2, dRB, 6, 2, 3, w3);
        this.a(w2, dRB, 9, 2, 3, w3);
        if (bs3.dRK[ao.dwt.OY()]) {
            this.a(w2, w3, 3, 1, 0, 4, 2, 0, false);
        }
        if (bs3.dRK[ao.dws.OY()]) {
            this.a(w2, w3, 3, 1, 7, 4, 2, 7, false);
        }
        if (bs3.dRK[ao.dwu.OY()]) {
            this.a(w2, w3, 0, 1, 3, 0, 2, 4, false);
        }
        if (bs2.dRK[ao.dwt.OY()]) {
            this.a(w2, w3, 11, 1, 0, 12, 2, 0, false);
        }
        if (bs2.dRK[ao.dws.OY()]) {
            this.a(w2, w3, 11, 1, 7, 12, 2, 7, false);
        }
        if (bs2.dRK[ao.dwv.OY()]) {
            this.a(w2, w3, 15, 1, 3, 15, 2, 4, false);
        }
        return true;
    }
}

