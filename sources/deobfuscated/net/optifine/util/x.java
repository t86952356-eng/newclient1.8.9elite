/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

public class x {
    private int eNa;

    public boolean aJm() {
        ++this.eNa;
        return this.eNa == 1;
    }

    public boolean aJn() {
        if (this.eNa <= 0) {
            return false;
        }
        --this.eNa;
        return this.eNa == 0;
    }

    public boolean IH() {
        return this.eNa > 0;
    }

    public int aJo() {
        return this.eNa;
    }

    public String toString() {
        return "lockCount: " + this.eNa;
    }
}

