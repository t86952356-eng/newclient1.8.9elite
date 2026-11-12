/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.cv;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class ch
extends cv {
    private int dSa;

    public ch() {
    }

    public ch(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
        this.dSa = ao2 != ao.dws && ao2 != ao.dwt ? w2.ayL() : w2.ayN();
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.B("Steps", this.dSa);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dSa = n2.eG("Steps");
    }

    public static w d(List<y> list, Random random, int n2, int n3, int n4, ao ao2) {
        int n5 = 3;
        w w2 = w.a(n2, n3, n4, -1, -1, 0, 5, 5, 4, ao2);
        y y2 = y.a(list, w2);
        if (y2 == null) {
            return null;
        }
        if (y2.ayR().dQC == w2.dQC) {
            for (int i2 = 3; i2 >= 1; --i2) {
                w2 = w.a(n2, n3, n4, -1, -1, 0, 5, 5, i2 - 1, ao2);
                if (y2.ayR().b(w2)) continue;
                return w.a(n2, n3, n4, -1, -1, 0, 5, 5, i2, ao2);
            }
        }
        return null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w2, w3)) {
            return false;
        }
        for (int i2 = 0; i2 < this.dSa; ++i2) {
            this.a(w2, Blocks.cNh.xM(), 0, 0, i2, w3);
            this.a(w2, Blocks.cNh.xM(), 1, 0, i2, w3);
            this.a(w2, Blocks.cNh.xM(), 2, 0, i2, w3);
            this.a(w2, Blocks.cNh.xM(), 3, 0, i2, w3);
            this.a(w2, Blocks.cNh.xM(), 4, 0, i2, w3);
            for (int i3 = 1; i3 <= 3; ++i3) {
                this.a(w2, Blocks.cNh.xM(), 0, i3, i2, w3);
                this.a(w2, Blocks.cLc.xM(), 1, i3, i2, w3);
                this.a(w2, Blocks.cLc.xM(), 2, i3, i2, w3);
                this.a(w2, Blocks.cLc.xM(), 3, i3, i2, w3);
                this.a(w2, Blocks.cNh.xM(), 4, i3, i2, w3);
            }
            this.a(w2, Blocks.cNh.xM(), 0, 4, i2, w3);
            this.a(w2, Blocks.cNh.xM(), 1, 4, i2, w3);
            this.a(w2, Blocks.cNh.xM(), 2, 4, i2, w3);
            this.a(w2, Blocks.cNh.xM(), 3, 4, i2, w3);
            this.a(w2, Blocks.cNh.xM(), 4, 4, i2, w3);
        }
        return true;
    }
}

