/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class u
implements aj<a> {
    private int[] dcU;

    public u() {
    }

    public u(int ... nArray) {
        this.dcU = nArray;
    }

    @Override
    public void a(ak ak2) {
        this.dcU = new int[ak2.afw()];
        for (int i2 = 0; i2 < this.dcU.length; ++i2) {
            this.dcU[i2] = ak2.afw();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.dcU.length);
        for (int i2 = 0; i2 < this.dcU.length; ++i2) {
            ak2.gr(this.dcU[i2]);
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int[] agQ() {
        return this.dcU;
    }
}

