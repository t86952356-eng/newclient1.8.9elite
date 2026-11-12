/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.w;

public class bv
extends br {
    private int dRP;

    public bv() {
    }

    public bv(ao ao2, w w2, int n2) {
        super(ao2, w2);
        this.dRP = n2 & 1;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.dRP == 0) {
            int n2;
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(w2, w3, 10 - n2, 3 - n2, 20 - n2, 12 + n2, 3 - n2, 20, dRy, dRy, false);
            }
            this.a(w2, w3, 7, 0, 6, 15, 0, 16, dRy, dRy, false);
            this.a(w2, w3, 6, 0, 6, 6, 3, 20, dRy, dRy, false);
            this.a(w2, w3, 16, 0, 6, 16, 3, 20, dRy, dRy, false);
            this.a(w2, w3, 7, 1, 7, 7, 1, 20, dRy, dRy, false);
            this.a(w2, w3, 15, 1, 7, 15, 1, 20, dRy, dRy, false);
            this.a(w2, w3, 7, 1, 6, 9, 3, 6, dRy, dRy, false);
            this.a(w2, w3, 13, 1, 6, 15, 3, 6, dRy, dRy, false);
            this.a(w2, w3, 8, 1, 7, 9, 1, 7, dRy, dRy, false);
            this.a(w2, w3, 13, 1, 7, 14, 1, 7, dRy, dRy, false);
            this.a(w2, w3, 9, 0, 5, 13, 0, 5, dRy, dRy, false);
            this.a(w2, w3, 10, 0, 7, 12, 0, 7, dRz, dRz, false);
            this.a(w2, w3, 8, 0, 10, 8, 0, 12, dRz, dRz, false);
            this.a(w2, w3, 14, 0, 10, 14, 0, 12, dRz, dRz, false);
            for (n2 = 18; n2 >= 7; n2 -= 3) {
                this.a(w2, dRB, 6, 3, n2, w3);
                this.a(w2, dRB, 16, 3, n2, w3);
            }
            this.a(w2, dRB, 10, 0, 10, w3);
            this.a(w2, dRB, 12, 0, 10, w3);
            this.a(w2, dRB, 10, 0, 12, w3);
            this.a(w2, dRB, 12, 0, 12, w3);
            this.a(w2, dRB, 8, 3, 6, w3);
            this.a(w2, dRB, 14, 3, 6, w3);
            this.a(w2, dRy, 4, 2, 4, w3);
            this.a(w2, dRB, 4, 1, 4, w3);
            this.a(w2, dRy, 4, 0, 4, w3);
            this.a(w2, dRy, 18, 2, 4, w3);
            this.a(w2, dRB, 18, 1, 4, w3);
            this.a(w2, dRy, 18, 0, 4, w3);
            this.a(w2, dRy, 4, 2, 18, w3);
            this.a(w2, dRB, 4, 1, 18, w3);
            this.a(w2, dRy, 4, 0, 18, w3);
            this.a(w2, dRy, 18, 2, 18, w3);
            this.a(w2, dRB, 18, 1, 18, w3);
            this.a(w2, dRy, 18, 0, 18, w3);
            this.a(w2, dRy, 9, 7, 20, w3);
            this.a(w2, dRy, 13, 7, 20, w3);
            this.a(w2, w3, 6, 0, 21, 7, 4, 21, dRy, dRy, false);
            this.a(w2, w3, 15, 0, 21, 16, 4, 21, dRy, dRy, false);
            this.a(w2, w3, 11, 2, 16);
        } else if (this.dRP == 1) {
            int n3;
            this.a(w2, w3, 9, 3, 18, 13, 3, 20, dRy, dRy, false);
            this.a(w2, w3, 9, 0, 18, 9, 2, 18, dRy, dRy, false);
            this.a(w2, w3, 13, 0, 18, 13, 2, 18, dRy, dRy, false);
            int n4 = 9;
            int n5 = 20;
            int n6 = 5;
            for (n3 = 0; n3 < 2; ++n3) {
                this.a(w2, dRy, n4, 6, 20, w3);
                this.a(w2, dRB, n4, 5, 20, w3);
                this.a(w2, dRy, n4, 4, 20, w3);
                n4 = 13;
            }
            this.a(w2, w3, 7, 3, 7, 15, 3, 14, dRy, dRy, false);
            n4 = 10;
            for (n3 = 0; n3 < 2; ++n3) {
                this.a(w2, w3, n4, 0, 10, n4, 6, 10, dRy, dRy, false);
                this.a(w2, w3, n4, 0, 12, n4, 6, 12, dRy, dRy, false);
                this.a(w2, dRB, n4, 0, 10, w3);
                this.a(w2, dRB, n4, 0, 12, w3);
                this.a(w2, dRB, n4, 4, 10, w3);
                this.a(w2, dRB, n4, 4, 12, w3);
                n4 = 12;
            }
            n4 = 8;
            for (n3 = 0; n3 < 2; ++n3) {
                this.a(w2, w3, n4, 0, 7, n4, 2, 7, dRy, dRy, false);
                this.a(w2, w3, n4, 0, 14, n4, 2, 14, dRy, dRy, false);
                n4 = 14;
            }
            this.a(w2, w3, 8, 3, 8, 8, 3, 13, dRz, dRz, false);
            this.a(w2, w3, 14, 3, 8, 14, 3, 13, dRz, dRz, false);
            this.a(w2, w3, 11, 5, 13);
        }
        return true;
    }
}

