/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class bm
implements aj<a> {
    private String[] deH;

    public bm() {
    }

    public bm(String[] stringArray) {
        this.deH = stringArray;
    }

    @Override
    public void a(ak ak2) {
        this.deH = new String[ak2.afw()];
        for (int i2 = 0; i2 < this.deH.length; ++i2) {
            this.deH[i2] = ak2.gs(Short.MAX_VALUE);
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.deH.length);
        for (String string : this.deH) {
            ak2.eS(string);
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public String[] ahR() {
        return this.deH;
    }
}

