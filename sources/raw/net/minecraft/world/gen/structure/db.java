/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.bt;
import net.minecraft.world.gen.structure.dk;
import net.minecraft.world.gen.structure.dm;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class db
extends dm {
    private Block dSA;
    private Block dSB;

    public db() {
    }

    public db(dk dk2, int n2, Random random, w w2, ao ao2) {
        super(dk2, n2);
        this.dQJ = ao2;
        this.dQI = w2;
        this.dSA = this.q(random);
        this.dSB = this.q(random);
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.B("CA", Block.aRV.z(this.dSA));
        n2.B("CB", Block.aRV.z(this.dSB));
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dSA = Block.aK(n2.eG("CA"));
        this.dSB = Block.aK(n2.eG("CB"));
    }

    private Block q(Random random) {
        switch (random.nextInt(5)) {
            case 0: {
                return Blocks.cOd;
            }
            case 1: {
                return Blocks.cOe;
            }
        }
        return Blocks.cMl;
    }

    public static db f(dk dk2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, 0, 0, 0, 7, 4, 9, ao2);
        return db.f(w2) && y.a(list, w2) == null ? new db(dk2, n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        if (this.dSR < 0) {
            this.dSR = this.b(w2, w3);
            if (this.dSR < 0) {
                return true;
            }
            this.dQI.ad(0, this.dSR - this.dQI.dQF + 4 - 1, 0);
        }
        this.a(w2, w3, 0, 1, 0, 6, 4, 8, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 1, 0, 1, 2, 0, 7, Blocks.cMm.xM(), Blocks.cMm.xM(), false);
        this.a(w2, w3, 4, 0, 1, 5, 0, 7, Blocks.cMm.xM(), Blocks.cMm.xM(), false);
        this.a(w2, w3, 0, 0, 0, 0, 0, 8, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, w3, 6, 0, 0, 6, 0, 8, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, w3, 1, 0, 0, 5, 0, 0, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, w3, 1, 0, 8, 5, 0, 8, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, w3, 3, 0, 1, 3, 0, 7, Blocks.cLl.xM(), Blocks.cLl.xM(), false);
        for (n2 = 1; n2 <= 7; ++n2) {
            this.a(w2, this.dSA.aM(bt.b(random, 2, 7)), 1, 1, n2, w3);
            this.a(w2, this.dSA.aM(bt.b(random, 2, 7)), 2, 1, n2, w3);
            this.a(w2, this.dSB.aM(bt.b(random, 2, 7)), 4, 1, n2, w3);
            this.a(w2, this.dSB.aM(bt.b(random, 2, 7)), 5, 1, n2, w3);
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (int i2 = 0; i2 < 7; ++i2) {
                this.b(w2, i2, 4, n2, w3);
                this.b(w2, Blocks.cLf.xM(), i2, -1, n2, w3);
            }
        }
        return true;
    }
}

