/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model.anim;

import net.optifine.entity.model.anim.a;
import net.optifine.entity.model.anim.g;

public class d {
    private final g[] egw;

    public d(g[] gArray) {
        this.egw = gArray;
    }

    public void jA() {
        for (int i2 = 0; i2 < this.egw.length; ++i2) {
            g g2 = this.egw[i2];
            g2.jA();
        }
    }

    public boolean a(a a2) {
        for (int i2 = 0; i2 < this.egw.length; ++i2) {
            g g2 = this.egw[i2];
            if (g2.a(a2)) continue;
            return false;
        }
        return true;
    }
}

