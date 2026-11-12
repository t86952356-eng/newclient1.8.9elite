/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.bs;
import net.minecraft.world.gen.structure.w;

public class bi
extends br {
    public bi() {
    }

    public bi(ao ao2, bs bs2, Random random) {
        super(1, ao2, bs2, 1, 2, 2);
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        IBlockState iBlockState;
        int n2;
        bs bs2 = this.dRH.dRJ[ao.dws.OY()];
        bs bs3 = this.dRH;
        bs bs4 = bs2.dRJ[ao.dwr.OY()];
        bs bs5 = bs3.dRJ[ao.dwr.OY()];
        if (this.dRH.dRI / 25 > 0) {
            this.a(w2, w3, 0, 8, bs2.dRK[ao.dwq.OY()]);
            this.a(w2, w3, 0, 0, bs3.dRK[ao.dwq.OY()]);
        }
        if (bs5.dRJ[ao.dwr.OY()] == null) {
            this.a(w2, w3, 1, 8, 1, 6, 8, 7, dRx);
        }
        if (bs4.dRJ[ao.dwr.OY()] == null) {
            this.a(w2, w3, 1, 8, 8, 6, 8, 14, dRx);
        }
        for (n2 = 1; n2 <= 7; ++n2) {
            iBlockState = dRy;
            if (n2 == 2 || n2 == 6) {
                iBlockState = dRx;
            }
            this.a(w2, w3, 0, n2, 0, 0, n2, 15, iBlockState, iBlockState, false);
            this.a(w2, w3, 7, n2, 0, 7, n2, 15, iBlockState, iBlockState, false);
            this.a(w2, w3, 1, n2, 0, 6, n2, 0, iBlockState, iBlockState, false);
            this.a(w2, w3, 1, n2, 15, 6, n2, 15, iBlockState, iBlockState, false);
        }
        for (n2 = 1; n2 <= 7; ++n2) {
            iBlockState = dRz;
            if (n2 == 2 || n2 == 6) {
                iBlockState = dRB;
            }
            this.a(w2, w3, 3, n2, 7, 4, n2, 8, iBlockState, iBlockState, false);
        }
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
        if (bs5.dRK[ao.dwt.OY()]) {
            this.a(w2, w3, 3, 5, 0, 4, 6, 0, false);
        }
        if (bs5.dRK[ao.dwv.OY()]) {
            this.a(w2, w3, 7, 5, 3, 7, 6, 4, false);
            this.a(w2, w3, 5, 4, 2, 6, 4, 5, dRy, dRy, false);
            this.a(w2, w3, 6, 1, 2, 6, 3, 2, dRy, dRy, false);
            this.a(w2, w3, 6, 1, 5, 6, 3, 5, dRy, dRy, false);
        }
        if (bs5.dRK[ao.dwu.OY()]) {
            this.a(w2, w3, 0, 5, 3, 0, 6, 4, false);
            this.a(w2, w3, 1, 4, 2, 2, 4, 5, dRy, dRy, false);
            this.a(w2, w3, 1, 1, 2, 1, 3, 2, dRy, dRy, false);
            this.a(w2, w3, 1, 1, 5, 1, 3, 5, dRy, dRy, false);
        }
        if (bs4.dRK[ao.dws.OY()]) {
            this.a(w2, w3, 3, 5, 15, 4, 6, 15, false);
        }
        if (bs4.dRK[ao.dwu.OY()]) {
            this.a(w2, w3, 0, 5, 11, 0, 6, 12, false);
            this.a(w2, w3, 1, 4, 10, 2, 4, 13, dRy, dRy, false);
            this.a(w2, w3, 1, 1, 10, 1, 3, 10, dRy, dRy, false);
            this.a(w2, w3, 1, 1, 13, 1, 3, 13, dRy, dRy, false);
        }
        if (bs4.dRK[ao.dwv.OY()]) {
            this.a(w2, w3, 7, 5, 11, 7, 6, 12, false);
            this.a(w2, w3, 5, 4, 10, 6, 4, 13, dRy, dRy, false);
            this.a(w2, w3, 6, 1, 10, 6, 3, 10, dRy, dRy, false);
            this.a(w2, w3, 6, 1, 13, 6, 3, 13, dRy, dRy, false);
        }
        return true;
    }
}

