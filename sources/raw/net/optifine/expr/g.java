/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.expr;

import net.optifine.expr.f;
import net.optifine.expr.k;
import net.optifine.expr.l;
import net.optifine.expr.m;

public class g
implements m {
    private final k ehS;
    private final l[] ehT;

    public g(k k2, l[] lArray) {
        this.ehS = k2;
        this.ehT = lArray;
    }

    @Override
    public boolean aCt() {
        return this.ehS.f(this.ehT);
    }

    @Override
    public f aCq() {
        return f.ehQ;
    }

    public String toString() {
        return String.valueOf((Object)this.ehS) + "()";
    }
}

