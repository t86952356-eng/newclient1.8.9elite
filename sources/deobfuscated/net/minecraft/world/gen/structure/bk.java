/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.bs;
import net.minecraft.world.gen.structure.w;

public class bk
extends br {
    public bk() {
    }

    public bk(ao ao2, bs bs2) {
        super(1, ao2, bs2, 1, 1, 1);
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        this.a(w2, w3, 0, 3, 0, 2, 3, 7, dRy, dRy, false);
        this.a(w2, w3, 5, 3, 0, 7, 3, 7, dRy, dRy, false);
        this.a(w2, w3, 0, 2, 0, 1, 2, 7, dRy, dRy, false);
        this.a(w2, w3, 6, 2, 0, 7, 2, 7, dRy, dRy, false);
        this.a(w2, w3, 0, 1, 0, 0, 1, 7, dRy, dRy, false);
        this.a(w2, w3, 7, 1, 0, 7, 1, 7, dRy, dRy, false);
        this.a(w2, w3, 0, 1, 7, 7, 3, 7, dRy, dRy, false);
        this.a(w2, w3, 1, 1, 0, 2, 3, 0, dRy, dRy, false);
        this.a(w2, w3, 5, 1, 0, 6, 3, 0, dRy, dRy, false);
        if (this.dRH.dRK[ao.dws.OY()]) {
            this.a(w2, w3, 3, 1, 7, 4, 2, 7, false);
        }
        if (this.dRH.dRK[ao.dwu.OY()]) {
            this.a(w2, w3, 0, 1, 3, 1, 2, 4, false);
        }
        if (this.dRH.dRK[ao.dwv.OY()]) {
            this.a(w2, w3, 6, 1, 3, 7, 2, 4, false);
        }
        return true;
    }
}

