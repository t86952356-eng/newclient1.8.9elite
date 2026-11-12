/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.uniform;

import net.optifine.expr.o;
import net.optifine.shaders.uniform.e;

public class f
implements o {
    private final e eKm;
    private final int eKn;
    private final int eKo;

    public f(e e2) {
        this(e2, 0, 0);
    }

    public f(e e2, int n2) {
        this(e2, n2, 0);
    }

    public f(e e2, int n2, int n3) {
        this.eKm = e2;
        this.eKn = n2;
        this.eKo = n3;
    }

    @Override
    public float aCr() {
        return this.eKm.bR(this.eKn, this.eKo);
    }

    @Override
    public net.optifine.expr.f aCq() {
        return net.optifine.expr.f.ehO;
    }

    public String toString() {
        return this.eKm.aII() == null ? String.valueOf((Object)this.eKm) : (this.eKm.aIJ() == null ? String.valueOf((Object)this.eKm) + "." + this.eKm.aII()[this.eKn] : String.valueOf((Object)this.eKm) + "." + this.eKm.aII()[this.eKn] + "." + this.eKm.aIJ()[this.eKo]);
    }
}

