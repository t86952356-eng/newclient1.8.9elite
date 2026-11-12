/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.reflect;

import net.optifine.reflect.h;
import net.optifine.reflect.j;

public class k {
    private final h etc;
    private final Class etd;
    private int ete;
    private j[] etf;

    public k(h h2, Class clazz, int n2) {
        this.etc = h2;
        this.etd = clazz;
        if (h2.aDA() && clazz != null) {
            this.etf = new j[n2];
            for (int i2 = 0; i2 < this.etf.length; ++i2) {
                this.etf[i2] = new j(h2, clazz, i2);
            }
        }
    }

    public h aDF() {
        return this.etc;
    }

    public Class aDG() {
        return this.etd;
    }

    public int IG() {
        return this.ete;
    }

    public j jA(int n2) {
        return n2 >= 0 && n2 < this.etf.length ? this.etf[n2] : null;
    }
}

