/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.ab;
import net.minecraft.tileentity.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.gen.structure.av;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class ba
extends av {
    private boolean dRm;

    public ba() {
    }

    public ba(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dRm = n2.eO("Mob");
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.o("Mob", this.dRm);
    }

    public static ba b(List<y> list, Random random, int n2, int n3, int n4, int n5, ao ao2) {
        w w2 = w.a(n2, n3, n4, -2, 0, 0, 7, 8, 9, ao2);
        return ba.d(w2) && y.a(list, w2) == null ? new ba(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        b b2;
        this.a(w2, w3, 0, 2, 0, 6, 7, 7, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 1, 0, 0, 5, 1, 7, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 1, 2, 1, 5, 2, 7, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 1, 3, 2, 5, 3, 7, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 1, 4, 3, 5, 4, 7, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 1, 2, 0, 1, 4, 2, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 5, 2, 0, 5, 4, 2, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 1, 5, 2, 1, 5, 3, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 5, 5, 2, 5, 5, 3, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 0, 5, 3, 0, 5, 8, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 6, 5, 3, 6, 5, 8, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, w3, 1, 5, 8, 5, 5, 8, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        this.a(w2, Blocks.cNB.xM(), 1, 6, 3, w3);
        this.a(w2, Blocks.cNB.xM(), 5, 6, 3, w3);
        this.a(w2, w3, 0, 6, 3, 0, 6, 8, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 6, 6, 3, 6, 6, 8, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 1, 6, 8, 5, 7, 8, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        this.a(w2, w3, 2, 8, 8, 4, 8, 8, Blocks.cNB.xM(), Blocks.cNB.xM(), false);
        if (!this.dRm && w3.k(b2 = new b(this.bn(3, 5), this.iH(5), this.bo(3, 5)))) {
            this.dRm = true;
            w2.a(b2, Blocks.cMe.xM(), 2);
            d d2 = w2.K(b2);
            if (d2 instanceof ab) {
                ((ab)d2).aqI().fW("Blaze");
            }
        }
        for (int i2 = 0; i2 <= 6; ++i2) {
            for (int i3 = 0; i3 <= 6; ++i3) {
                this.b(w2, Blocks.cNA.xM(), i2, -1, i3, w3);
            }
        }
        return true;
    }
}

