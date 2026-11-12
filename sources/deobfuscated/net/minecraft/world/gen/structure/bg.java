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

public class bg
extends br {
    public bg() {
    }

    public bg(ao ao2, bs bs2, Random random) {
        super(1, ao2, bs2, 2, 2, 1);
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        bs bs2 = this.dRH.dRJ[ao.dwv.OY()];
        bs bs3 = this.dRH;
        bs bs4 = bs3.dRJ[ao.dwr.OY()];
        bs bs5 = bs2.dRJ[ao.dwr.OY()];
        if (this.dRH.dRI / 25 > 0) {
            this.a(w2, w3, 8, 0, bs2.dRK[ao.dwq.OY()]);
            this.a(w2, w3, 0, 0, bs3.dRK[ao.dwq.OY()]);
        }
        if (bs4.dRJ[ao.dwr.OY()] == null) {
            this.a(w2, w3, 1, 8, 1, 7, 8, 6, dRx);
        }
        if (bs5.dRJ[ao.dwr.OY()] == null) {
            this.a(w2, w3, 8, 8, 1, 14, 8, 6, dRx);
        }
        for (int i2 = 1; i2 <= 7; ++i2) {
            IBlockState iBlockState = dRy;
            if (i2 == 2 || i2 == 6) {
                iBlockState = dRx;
            }
            this.a(w2, w3, 0, i2, 0, 0, i2, 7, iBlockState, iBlockState, false);
            this.a(w2, w3, 15, i2, 0, 15, i2, 7, iBlockState, iBlockState, false);
            this.a(w2, w3, 1, i2, 0, 15, i2, 0, iBlockState, iBlockState, false);
            this.a(w2, w3, 1, i2, 7, 14, i2, 7, iBlockState, iBlockState, false);
        }
        this.a(w2, w3, 2, 1, 3, 2, 7, 4, dRy, dRy, false);
        this.a(w2, w3, 3, 1, 2, 4, 7, 2, dRy, dRy, false);
        this.a(w2, w3, 3, 1, 5, 4, 7, 5, dRy, dRy, false);
        this.a(w2, w3, 13, 1, 3, 13, 7, 4, dRy, dRy, false);
        this.a(w2, w3, 11, 1, 2, 12, 7, 2, dRy, dRy, false);
        this.a(w2, w3, 11, 1, 5, 12, 7, 5, dRy, dRy, false);
        this.a(w2, w3, 5, 1, 3, 5, 3, 4, dRy, dRy, false);
        this.a(w2, w3, 10, 1, 3, 10, 3, 4, dRy, dRy, false);
        this.a(w2, w3, 5, 7, 2, 10, 7, 5, dRy, dRy, false);
        this.a(w2, w3, 5, 5, 2, 5, 7, 2, dRy, dRy, false);
        this.a(w2, w3, 10, 5, 2, 10, 7, 2, dRy, dRy, false);
        this.a(w2, w3, 5, 5, 5, 5, 7, 5, dRy, dRy, false);
        this.a(w2, w3, 10, 5, 5, 10, 7, 5, dRy, dRy, false);
        this.a(w2, dRy, 6, 6, 2, w3);
        this.a(w2, dRy, 9, 6, 2, w3);
        this.a(w2, dRy, 6, 6, 5, w3);
        this.a(w2, dRy, 9, 6, 5, w3);
        this.a(w2, w3, 5, 4, 3, 6, 4, 4, dRy, dRy, false);
        this.a(w2, w3, 9, 4, 3, 10, 4, 4, dRy, dRy, false);
        this.a(w2, dRB, 5, 4, 2, w3);
        this.a(w2, dRB, 5, 4, 5, w3);
        this.a(w2, dRB, 10, 4, 2, w3);
        this.a(w2, dRB, 10, 4, 5, w3);
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
        if (bs4.dRK[ao.dwt.OY()]) {
            this.a(w2, w3, 3, 5, 0, 4, 6, 0, false);
        }
        if (bs4.dRK[ao.dws.OY()]) {
            this.a(w2, w3, 3, 5, 7, 4, 6, 7, false);
        }
        if (bs4.dRK[ao.dwu.OY()]) {
            this.a(w2, w3, 0, 5, 3, 0, 6, 4, false);
        }
        if (bs5.dRK[ao.dwt.OY()]) {
            this.a(w2, w3, 11, 5, 0, 12, 6, 0, false);
        }
        if (bs5.dRK[ao.dws.OY()]) {
            this.a(w2, w3, 11, 5, 7, 12, 6, 7, false);
        }
        if (bs5.dRK[ao.dwv.OY()]) {
            this.a(w2, w3, 15, 5, 3, 15, 6, 4, false);
        }
        return true;
    }
}

