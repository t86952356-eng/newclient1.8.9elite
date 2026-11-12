/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.expr;

import net.optifine.expr.f;
import net.optifine.expr.n;
import net.optifine.expr.p;

public class b
implements n,
p {
    private final p ehI;
    private boolean ehJ;
    private float[] ehK;

    public b(p p2) {
        this.ehI = p2;
    }

    @Override
    public float[] aCw() {
        if (!this.ehJ) {
            this.ehK = this.ehI.aCw();
            this.ehJ = true;
        }
        return this.ehK;
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
        return "cached(" + String.valueOf(this.ehI) + ")";
    }
}

