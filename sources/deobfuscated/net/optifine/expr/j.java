/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.expr;

import net.optifine.expr.f;
import net.optifine.expr.k;
import net.optifine.expr.l;
import net.optifine.expr.p;

public class j
implements p {
    private final k ehY;
    private final l[] ehZ;

    public j(k k2, l[] lArray) {
        this.ehY = k2;
        this.ehZ = lArray;
    }

    @Override
    public float[] aCw() {
        return this.ehY.g(this.ehZ);
    }

    @Override
    public f aCq() {
        return f.ehP;
    }

    public String toString() {
        return String.valueOf((Object)this.ehY) + "()";
    }
}

