/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.bs;
import net.minecraft.world.gen.structure.w;

public class bj
extends br {
    public bj() {
    }

    public bj(ao ao2, bs bs2, Random random) {
        super(1, ao2, bs2, 1, 1, 2);
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        bs bs2 = this.dRH.dRJ[ao.dws.OY()];
        bs bs3 = this.dRH;
        if (this.dRH.dRI / 25 > 0) {
            this.a(w2, w3, 0, 8, bs2.dRK[ao.dwq.OY()]);
            this.a(w2, w3, 0, 0, bs3.dRK[ao.dwq.OY()]);
        }
        if (bs3.dRJ[ao.dwr.OY()] == null) {
            this.a(w2, w3, 1, 4, 1, 6, 4, 7, dRx);
        }
        if (bs2.dRJ[ao.dwr.OY()] == null) {
            this.a(w2, w3, 1, 4, 8, 6, 4, 14, dRx);
        }
        this.a(w2, w3, 0, 3, 0, 0, 3, 15, dRy, dRy, false);
        this.a(w2, w3, 7, 3, 0, 7, 3, 15, dRy, dRy, false);
        this.a(w2, w3, 1, 3, 0, 7, 3, 0, dRy, dRy, false);
        this.a(w2, w3, 1, 3, 15, 6, 3, 15, dRy, dRy, false);
        this.a(w2, w3, 0, 2, 0, 0, 2, 15, dRx, dRx, false);
        this.a(w2, w3, 7, 2, 0, 7, 2, 15, dRx, dRx, false);
        this.a(w2, w3, 1, 2, 0, 7, 2, 0, dRx, dRx, false);
        this.a(w2, w3, 1, 2, 15, 6, 2, 15, dRx, dRx, false);
        this.a(w2, w3, 0, 1, 0, 0, 1, 15, dRy, dRy, false);
        this.a(w2, w3, 7, 1, 0, 7, 1, 15, dRy, dRy, false);
        this.a(w2, w3, 1, 1, 0, 7, 1, 0, dRy, dRy, false);
        this.a(w2, w3, 1, 1, 15, 6, 1, 15, dRy, dRy, false);
        this.a(w2, w3, 1, 1, 1, 1, 1, 2, dRy, dRy, false);
        this.a(w2, w3, 6, 1, 1, 6, 1, 2, dRy, dRy, false);
        this.a(w2, w3, 1, 3, 1, 1, 3, 2, dRy, dRy, false);
        this.a(w2, w3, 6, 3, 1, 6, 3, 2, dRy, dRy, false);
        this.a(w2, w3, 1, 1, 13, 1, 1, 14, dRy, dRy, false);
        this.a(w2, w3, 6, 1, 13, 6, 1, 14, dRy, dRy, false);
        this.a(w2, w3, 1, 3, 13, 1, 3, 14, dRy, dRy, false);
        this.a(w2, w3, 6, 3, 13, 6, 3, 14, dRy, dRy, false);
        this.a(w2, w3, 2, 1, 6, 2, 3, 6, dRy, dRy, false);
        this.a(w2, w3, 5, 1, 6, 5, 3, 6, dRy, dRy, false);
        this.a(w2, w3, 2, 1, 9, 2, 3, 9, dRy, dRy, false);
        this.a(w2, w3, 5, 1, 9, 5, 3, 9, dRy, dRy, false);
        this.a(w2, w3, 3, 2, 6, 4, 2, 6, dRy, dRy, false);
        this.a(w2, w3, 3, 2, 9, 4, 2, 9, dRy, dRy, false);
        this.a(w2, w3, 2, 2, 7, 2, 2, 8, dRy, dRy, false);
        this.a(w2, w3, 5, 2, 7, 5, 2, 8, dRy, dRy, false);
        this.a(w2, dRB, 2, 2, 5, w3);
        this.a(w2, dRB, 5, 2, 5, w3);
        this.a(w2, dRB, 2, 2, 10, w3);
        this.a(w2, dRB, 5, 2, 10, w3);
        this.a(w2, dRy, 2, 3, 5, w3);
        this.a(w2, dRy, 5, 3, 5, w3);
        this.a(w2, dRy, 2, 3, 10, w3);
        this.a(w2, dRy, 5, 3, 10, w3);
        if (bs3.dRK[ao.dwt.OY()]) {
            this.a(w2, w3, 3, 1, 0, 4, 2, 0, false);
        }
        if (bs3.dRK[ao.dwv.OY()]) {
            this.a(w2, w3, 7, 1, 3, 7, 2, 4, false);
        }
        if (bs3.dRK[ao.dwu.OY()]) {
            this.a(w2, w3, 0, 1, 3, 0, 2, 4, false);
        }
        if (bs2.dRK[ao.dws.OY()]) {
            this.a(w2, w3, 3, 1, 15, 4, 2, 15, false);
        }
        if (bs2.dRK[ao.dwu.OY()]) {
            this.a(w2, w3, 0, 1, 11, 0, 2, 12, false);
        }
        if (bs2.dRK[ao.dwv.OY()]) {
            this.a(w2, w3, 7, 1, 11, 7, 2, 12, false);
        }
        return true;
    }
}

