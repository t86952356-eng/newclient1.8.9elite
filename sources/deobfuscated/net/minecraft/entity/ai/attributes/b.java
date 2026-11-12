/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai.attributes;

import net.minecraft.entity.ai.attributes.d;

public abstract class b
implements d {
    private final d cAE;
    private final String cAF;
    private final double cAG;
    private boolean cAH;

    protected b(d d2, String string, double d3) {
        this.cAE = d2;
        this.cAF = string;
        this.cAG = d3;
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
    }

    @Override
    public String Xs() {
        return this.cAF;
    }

    @Override
    public double Xt() {
        return this.cAG;
    }

    @Override
    public boolean Xu() {
        return this.cAH;
    }

    public b aN(boolean bl2) {
        this.cAH = bl2;
        return this;
    }

    @Override
    public d Xv() {
        return this.cAE;
    }

    public int hashCode() {
        return this.cAF.hashCode();
    }

    public boolean equals(Object object) {
        return object instanceof d && this.cAF.equals(((d)object).Xs());
    }
}

