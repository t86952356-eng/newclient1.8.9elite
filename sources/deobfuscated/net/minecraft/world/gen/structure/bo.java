/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.bs;
import net.minecraft.world.gen.structure.w;

public class bo
extends br {
    public bo() {
    }

    public bo(ao ao2, bs bs2, Random random) {
        super(1, ao2, bs2, 2, 2, 2);
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        this.a(w2, w3, 1, 8, 0, 14, 8, 14, dRx);
        int n3 = 7;
        IBlockState iBlockState = dRy;
        this.a(w2, w3, 0, n3, 0, 0, n3, 15, iBlockState, iBlockState, false);
        this.a(w2, w3, 15, n3, 0, 15, n3, 15, iBlockState, iBlockState, false);
        this.a(w2, w3, 1, n3, 0, 15, n3, 0, iBlockState, iBlockState, false);
        this.a(w2, w3, 1, n3, 15, 14, n3, 15, iBlockState, iBlockState, false);
        for (n3 = 1; n3 <= 6; ++n3) {
            iBlockState = dRy;
            if (n3 == 2 || n3 == 6) {
                iBlockState = dRx;
            }
            for (n2 = 0; n2 <= 15; n2 += 15) {
                this.a(w2, w3, n2, n3, 0, n2, n3, 1, iBlockState, iBlockState, false);
                this.a(w2, w3, n2, n3, 6, n2, n3, 9, iBlockState, iBlockState, false);
                this.a(w2, w3, n2, n3, 14, n2, n3, 15, iBlockState, iBlockState, false);
            }
            this.a(w2, w3, 1, n3, 0, 1, n3, 0, iBlockState, iBlockState, false);
            this.a(w2, w3, 6, n3, 0, 9, n3, 0, iBlockState, iBlockState, false);
            this.a(w2, w3, 14, n3, 0, 14, n3, 0, iBlockState, iBlockState, false);
            this.a(w2, w3, 1, n3, 15, 14, n3, 15, iBlockState, iBlockState, false);
        }
        this.a(w2, w3, 6, 3, 6, 9, 6, 9, dRz, dRz, false);
        this.a(w2, w3, 7, 4, 7, 8, 5, 8, Blocks.cLT.xM(), Blocks.cLT.xM(), false);
        for (n3 = 3; n3 <= 6; n3 += 3) {
            for (n2 = 6; n2 <= 9; n2 += 3) {
                this.a(w2, dRB, n2, n3, 6, w3);
                this.a(w2, dRB, n2, n3, 9, w3);
            }
        }
        this.a(w2, w3, 5, 1, 6, 5, 2, 6, dRy, dRy, false);
        this.a(w2, w3, 5, 1, 9, 5, 2, 9, dRy, dRy, false);
        this.a(w2, w3, 10, 1, 6, 10, 2, 6, dRy, dRy, false);
        this.a(w2, w3, 10, 1, 9, 10, 2, 9, dRy, dRy, false);
        this.a(w2, w3, 6, 1, 5, 6, 2, 5, dRy, dRy, false);
        this.a(w2, w3, 9, 1, 5, 9, 2, 5, dRy, dRy, false);
        this.a(w2, w3, 6, 1, 10, 6, 2, 10, dRy, dRy, false);
        this.a(w2, w3, 9, 1, 10, 9, 2, 10, dRy, dRy, false);
        this.a(w2, w3, 5, 2, 5, 5, 6, 5, dRy, dRy, false);
        this.a(w2, w3, 5, 2, 10, 5, 6, 10, dRy, dRy, false);
        this.a(w2, w3, 10, 2, 5, 10, 6, 5, dRy, dRy, false);
        this.a(w2, w3, 10, 2, 10, 10, 6, 10, dRy, dRy, false);
        this.a(w2, w3, 5, 7, 1, 5, 7, 6, dRy, dRy, false);
        this.a(w2, w3, 10, 7, 1, 10, 7, 6, dRy, dRy, false);
        this.a(w2, w3, 5, 7, 9, 5, 7, 14, dRy, dRy, false);
        this.a(w2, w3, 10, 7, 9, 10, 7, 14, dRy, dRy, false);
        this.a(w2, w3, 1, 7, 5, 6, 7, 5, dRy, dRy, false);
        this.a(w2, w3, 1, 7, 10, 6, 7, 10, dRy, dRy, false);
        this.a(w2, w3, 9, 7, 5, 14, 7, 5, dRy, dRy, false);
        this.a(w2, w3, 9, 7, 10, 14, 7, 10, dRy, dRy, false);
        this.a(w2, w3, 2, 1, 2, 2, 1, 3, dRy, dRy, false);
        this.a(w2, w3, 3, 1, 2, 3, 1, 2, dRy, dRy, false);
        this.a(w2, w3, 13, 1, 2, 13, 1, 3, dRy, dRy, false);
        this.a(w2, w3, 12, 1, 2, 12, 1, 2, dRy, dRy, false);
        this.a(w2, w3, 2, 1, 12, 2, 1, 13, dRy, dRy, false);
        this.a(w2, w3, 3, 1, 13, 3, 1, 13, dRy, dRy, false);
        this.a(w2, w3, 13, 1, 12, 13, 1, 13, dRy, dRy, false);
        this.a(w2, w3, 12, 1, 13, 12, 1, 13, dRy, dRy, false);
        return true;
    }
}

