/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

public class b {
    private final int crq;
    private final int crr;
    private Object crs;
    private boolean crt;

    public b(int n2, int n3, Object object) {
        this.crr = n3;
        this.crs = object;
        this.crq = n2;
        this.crt = true;
    }

    public int Tl() {
        return this.crr;
    }

    public void q(Object object) {
        this.crs = object;
    }

    public Object Tm() {
        return this.crs;
    }

    public int getObjectType() {
        return this.crq;
    }

    public boolean Tn() {
        return this.crt;
    }

    public void aC(boolean bl2) {
        this.crt = bl2;
    }
}

