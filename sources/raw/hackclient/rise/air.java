/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.ahj;
import lombok.Generated;

public final class air {
    private float aQb;
    private float aQc;
    private float aIL;
    private float aIM;
    private float aQd;

    public void jA() {
        this.aIL = ahj.e(this.aIL, this.aQb, this.aQd);
        this.aIM = ahj.e(this.aIM, this.aQc, this.aQd);
        if (Math.abs(this.aIL - this.aQb) < 0.05f) {
            this.aIL = this.aQb;
        }
        if (Math.abs(this.aIM - this.aQc) < 0.05f) {
            this.aIM = this.aQc;
        }
    }

    public boolean vQ() {
        return this.aIL == this.aQb && this.aIM == this.aQc;
    }

    @Generated
    public float vR() {
        return this.aQb;
    }

    @Generated
    public float vS() {
        return this.aQc;
    }

    @Generated
    public float vT() {
        return this.aIL;
    }

    @Generated
    public float vU() {
        return this.aIM;
    }

    @Generated
    public float vV() {
        return this.aQd;
    }

    @Generated
    public void D(float f2) {
        this.aQb = f2;
    }

    @Generated
    public void E(float f2) {
        this.aQc = f2;
    }

    @Generated
    public void F(float f2) {
        this.aIL = f2;
    }

    @Generated
    public void G(float f2) {
        this.aIM = f2;
    }

    @Generated
    public void H(float f2) {
        this.aQd = f2;
    }

    @Generated
    public air(float f2, float f3, float f4, float f5, float f6) {
        this.aQb = f2;
        this.aQc = f3;
        this.aIL = f4;
        this.aIM = f5;
        this.aQd = f6;
    }

    @Generated
    public air() {
    }
}

