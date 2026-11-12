/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.expr;

import net.optifine.expr.f;
import net.optifine.expr.n;
import net.optifine.expr.o;

public class c
implements n,
o {
    private final o ehL;
    private boolean ehJ;
    private float value;

    public c(o o2) {
        this.ehL = o2;
    }

    @Override
    public float aCr() {
        if (!this.ehJ) {
            this.value = this.ehL.aCr();
            this.ehJ = true;
        }
        return this.value;
    }

    @Override
    public void aX() {
        this.ehJ = false;
    }

    @Override
    public f aCq() {
        return f.ehO;
    }

    public String toString() {
        return "cached(" + String.valueOf(this.ehL) + ")";
    }
}

