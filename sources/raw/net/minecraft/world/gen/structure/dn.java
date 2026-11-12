/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.world.gen.structure.cx;
import net.minecraft.world.gen.structure.dk;
import net.minecraft.world.gen.structure.dm;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class dn
extends dm {
    public dn() {
    }

    public dn(dk dk2, int n2, Random random, int n3, int n4) {
        super(dk2, n2);
        this.dQJ = ar.dwT.g(random);
        switch (this.dQJ) {
            case dws: 
            case dwt: {
                this.dQI = new w(n3, 64, n4, n3 + 6 - 1, 78, n4 + 6 - 1);
                break;
            }
            default: {
                this.dQI = new w(n3, 64, n4, n3 + 6 - 1, 78, n4 + 6 - 1);
            }
        }
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        cx.c((dk)y2, list, random, this.dQI.dQB - 1, this.dQI.dQF - 4, this.dQI.dQD + 1, ao.dwu, this.ayS());
        cx.c((dk)y2, list, random, this.dQI.dQE + 1, this.dQI.dQF - 4, this.dQI.dQD + 1, ao.dwv, this.ayS());
        cx.c((dk)y2, list, random, this.dQI.dQB + 1, this.dQI.dQF - 4, this.dQI.dQD - 1, ao.dws, this.ayS());
        cx.c((dk)y2, list, random, this.dQI.dQB + 1, this.dQI.dQF - 4, this.dQI.dQG + 1, ao.dwt, this.ayS());
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.dSR < 0) {
            this.dSR = this.b(w2, w3);
            if (this.dSR < 0) {
                return true;
            }
            this.dQI.ad(0, this.dSR - this.dQI.dQF + 3, 0);
        }
        this.a(w2, w3, 1, 0, 1, 4, 12, 4, Blocks.cLg.xM(), Blocks.cLk.xM(), false);
        this.a(w2, Blocks.cLc.xM(), 2, 12, 2, w3);
        this.a(w2, Blocks.cLc.xM(), 3, 12, 2, w3);
        this.a(w2, Blocks.cLc.xM(), 2, 12, 3, w3);
        this.a(w2, Blocks.cLc.xM(), 3, 12, 3, w3);
        this.a(w2, Blocks.cMQ.xM(), 1, 13, 1, w3);
        this.a(w2, Blocks.cMQ.xM(), 1, 14, 1, w3);
        this.a(w2, Blocks.cMQ.xM(), 4, 13, 1, w3);
        this.a(w2, Blocks.cMQ.xM(), 4, 14, 1, w3);
        this.a(w2, Blocks.cMQ.xM(), 1, 13, 4, w3);
        this.a(w2, Blocks.cMQ.xM(), 1, 14, 4, w3);
        this.a(w2, Blocks.cMQ.xM(), 4, 13, 4, w3);
        this.a(w2, Blocks.cMQ.xM(), 4, 14, 4, w3);
        this.a(w2, w3, 1, 15, 1, 4, 15, 4, Blocks.cLg.xM(), Blocks.cLg.xM(), false);
        for (int i2 = 0; i2 <= 5; ++i2) {
            for (int i3 = 0; i3 <= 5; ++i3) {
                if (i3 != 0 && i3 != 5 && i2 != 0 && i2 != 5) continue;
                this.a(w2, Blocks.cLp.xM(), i3, 11, i2, w3);
                this.b(w2, i3, 12, i2, w3);
            }
        }
        return true;
    }
}

