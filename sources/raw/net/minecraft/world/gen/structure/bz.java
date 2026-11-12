/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.bi;
import net.minecraft.world.gen.structure.bp;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.bs;

class bz
implements bp {
    private bz() {
    }

    @Override
    public boolean a(bs bs2) {
        if (bs2.dRK[ao.dws.OY()] && !bs2.dRJ[ao.dws.OY()].dRL && bs2.dRK[ao.dwr.OY()] && !bs2.dRJ[ao.dwr.OY()].dRL) {
            bs bs3 = bs2.dRJ[ao.dws.OY()];
            return bs3.dRK[ao.dwr.OY()] && !bs3.dRJ[ao.dwr.OY()].dRL;
        }
        return false;
    }

    @Override
    public br a(ao ao2, bs bs2, Random random) {
        bs2.dRL = true;
        bs2.dRJ[ao.dws.OY()].dRL = true;
        bs2.dRJ[ao.dwr.OY()].dRL = true;
        bs2.dRJ[ao.dws.OY()].dRJ[ao.dwr.OY()].dRL = true;
        return new bi(ao2, bs2, random);
    }
}

