/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.av;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class as
extends av {
    private int dRb;

    public as() {
    }

    public as(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
        this.dRb = random.nextInt();
    }

    public static as j(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -1, -3, 0, 5, 10, 8, ao2);
        return as.d(w2) && y.a(list, w2) == null ? new as(n5, random, w2, ao2) : null;
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dRb = n2.eG("Seed");
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.B("Seed", this.dRb);
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        int n3;
        int n4;
        Random random2 = new Random(this.dRb);
        for (n4 = 0; n4 <= 4; ++n4) {
            for (n3 = 3; n3 <= 4; ++n3) {
                n2 = random2.nextInt(8);
                this.a(w2, w3, n4, n3, 0, n4, n3, n2, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
            }
        }
        n4 = random2.nextInt(8);
        this.a(w2, w3, 0, 5, 0, 0, 5, n4, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        n4 = random2.nextInt(8);
        this.a(w2, w3, 4, 5, 0, 4, 5, n4, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        for (n4 = 0; n4 <= 4; ++n4) {
            n3 = random2.nextInt(5);
            this.a(w2, w3, n4, 2, 0, n4, 2, n3, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
        }
        for (n4 = 0; n4 <= 4; ++n4) {
            for (n3 = 0; n3 <= 1; ++n3) {
                n2 = random2.nextInt(3);
                this.a(w2, w3, n4, n3, 0, n4, n3, n2, Blocks.cNA.xM(), Blocks.cNA.xM(), false);
            }
        }
        return true;
    }
}

