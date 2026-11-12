/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.bj;
import net.minecraft.world.gen.structure.bp;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.bs;

class ca
implements bp {
    private ca() {
    }

    @Override
    public boolean a(bs bs2) {
        return bs2.dRK[ao.dws.OY()] && !bs2.dRJ[ao.dws.OY()].dRL;
    }

    @Override
    public br a(ao ao2, bs bs2, Random random) {
        bs bs3 = bs2;
        if (!bs2.dRK[ao.dws.OY()] || bs2.dRJ[ao.dws.OY()].dRL) {
            bs3 = bs2.dRJ[ao.dwt.OY()];
        }
        bs3.dRL = true;
        bs3.dRJ[ao.dws.OY()].dRL = true;
        return new bj(ao2, bs3, random);
    }
}

