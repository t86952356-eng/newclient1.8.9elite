/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.w;

public class bq
extends br {
    public bq() {
    }

    public bq(ao ao2, w w2) {
        super(ao2, w2);
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        this.a(w2, w3, 2, -1, 2, 11, -1, 11, dRy, dRy, false);
        this.a(w2, w3, 0, -1, 0, 1, -1, 11, dRx, dRx, false);
        this.a(w2, w3, 12, -1, 0, 13, -1, 11, dRx, dRx, false);
        this.a(w2, w3, 2, -1, 0, 11, -1, 1, dRx, dRx, false);
        this.a(w2, w3, 2, -1, 12, 11, -1, 13, dRx, dRx, false);
        this.a(w2, w3, 0, 0, 0, 0, 0, 13, dRy, dRy, false);
        this.a(w2, w3, 13, 0, 0, 13, 0, 13, dRy, dRy, false);
        this.a(w2, w3, 1, 0, 0, 12, 0, 0, dRy, dRy, false);
        this.a(w2, w3, 1, 0, 13, 12, 0, 13, dRy, dRy, false);
        for (n2 = 2; n2 <= 11; n2 += 3) {
            this.a(w2, dRB, 0, 0, n2, w3);
            this.a(w2, dRB, 13, 0, n2, w3);
            this.a(w2, dRB, n2, 0, 0, w3);
        }
        this.a(w2, w3, 2, 0, 3, 4, 0, 9, dRy, dRy, false);
        this.a(w2, w3, 9, 0, 3, 11, 0, 9, dRy, dRy, false);
        this.a(w2, w3, 4, 0, 9, 9, 0, 11, dRy, dRy, false);
        this.a(w2, dRy, 5, 0, 8, w3);
        this.a(w2, dRy, 8, 0, 8, w3);
        this.a(w2, dRy, 10, 0, 10, w3);
        this.a(w2, dRy, 3, 0, 10, w3);
        this.a(w2, w3, 3, 0, 3, 3, 0, 7, dRz, dRz, false);
        this.a(w2, w3, 10, 0, 3, 10, 0, 7, dRz, dRz, false);
        this.a(w2, w3, 6, 0, 10, 7, 0, 10, dRz, dRz, false);
        n2 = 3;
        for (int i2 = 0; i2 < 2; ++i2) {
            for (int i3 = 2; i3 <= 8; i3 += 3) {
                this.a(w2, w3, n2, 0, i3, n2, 2, i3, dRy, dRy, false);
            }
            n2 = 10;
        }
        this.a(w2, w3, 5, 0, 10, 5, 2, 10, dRy, dRy, false);
        this.a(w2, w3, 8, 0, 10, 8, 2, 10, dRy, dRy, false);
        this.a(w2, w3, 6, -1, 7, 7, -1, 8, dRz, dRz, false);
        this.a(w2, w3, 6, -1, 3, 7, -1, 4, false);
        this.a(w2, w3, 6, 1, 6);
        return true;
    }
}

