/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

public class i {
    private float aQj = 1.0f;
    private float bBR = 0.0f;
    private float bBS = 0.0f;

    public i(float f2, float f3, float f4) {
        this.aQj = f2;
        this.bBR = f3;
        this.bBS = f4;
    }

    public float aHE() {
        return this.aQj;
    }

    public float aHF() {
        return this.bBR;
    }

    public float aHG() {
        return this.bBS;
    }

    public String toString() {
        return this.aQj + ", " + this.bBR + ", " + this.bBS;
    }
}

