/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.bp;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.bs;
import net.minecraft.world.gen.structure.bu;

class bm
implements bp {
    private bm() {
    }

    @Override
    public boolean a(bs bs2) {
        return !bs2.dRK[ao.dwu.OY()] && !bs2.dRK[ao.dwv.OY()] && !bs2.dRK[ao.dws.OY()] && !bs2.dRK[ao.dwt.OY()] && !bs2.dRK[ao.dwr.OY()];
    }

    @Override
    public br a(ao ao2, bs bs2, Random random) {
        bs2.dRL = true;
        return new bu(ao2, bs2, random);
    }
}

