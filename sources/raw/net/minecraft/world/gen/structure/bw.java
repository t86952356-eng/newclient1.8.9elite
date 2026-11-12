/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.bf;
import net.minecraft.world.gen.structure.bp;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.bs;

class bw
implements bp {
    private bw() {
    }

    @Override
    public boolean a(bs bs2) {
        return bs2.dRK[ao.dwv.OY()] && !bs2.dRJ[ao.dwv.OY()].dRL;
    }

    @Override
    public br a(ao ao2, bs bs2, Random random) {
        bs2.dRL = true;
        bs2.dRJ[ao.dwv.OY()].dRL = true;
        return new bf(ao2, bs2, random);
    }
}

