/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import net.optifine.expr.f;
import net.optifine.expr.m;
import net.optifine.shaders.config.t;

public class b
implements m {
    private final t eFZ;

    public b(t t2) {
        this.eFZ = t2;
    }

    @Override
    public boolean aCt() {
        return t.jy(this.eFZ.SN());
    }

    @Override
    public f aCq() {
        return f.ehQ;
    }

    public String toString() {
        return String.valueOf(this.eFZ);
    }
}

