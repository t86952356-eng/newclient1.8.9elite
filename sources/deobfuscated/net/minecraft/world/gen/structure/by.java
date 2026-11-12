/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.bh;
import net.minecraft.world.gen.structure.bp;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.bs;

class by
implements bp {
    private by() {
    }

    @Override
    public boolean a(bs bs2) {
        return bs2.dRK[ao.dwr.OY()] && !bs2.dRJ[ao.dwr.OY()].dRL;
    }

    @Override
    public br a(ao ao2, bs bs2, Random random) {
        bs2.dRL = true;
        bs2.dRJ[ao.dwr.OY()].dRL = true;
        return new bh(ao2, bs2, random);
    }
}

