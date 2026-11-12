/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.model;

import net.minecraft.util.ao;

public class f {
    private float elx = Float.MAX_VALUE;
    private float ely = Float.MAX_VALUE;
    private float elz = Float.MAX_VALUE;
    private float elA = -3.4028235E38f;
    private float elB = -3.4028235E38f;
    private float elC = -3.4028235E38f;

    public f(int[] nArray) {
        int n2 = nArray.length / 4;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n3 = i2 * n2;
            float f2 = Float.intBitsToFloat(nArray[n3 + 0]);
            float f3 = Float.intBitsToFloat(nArray[n3 + 1]);
            float f4 = Float.intBitsToFloat(nArray[n3 + 2]);
            if (this.elx > f2) {
                this.elx = f2;
            }
            if (this.ely > f3) {
                this.ely = f3;
            }
            if (this.elz > f4) {
                this.elz = f4;
            }
            if (this.elA < f2) {
                this.elA = f2;
            }
            if (this.elB < f3) {
                this.elB = f3;
            }
            if (!(this.elC < f4)) continue;
            this.elC = f4;
        }
    }

    public float aDh() {
        return this.elx;
    }

    public float aDi() {
        return this.ely;
    }

    public float aDj() {
        return this.elz;
    }

    public float aDk() {
        return this.elA;
    }

    public float aDl() {
        return this.elB;
    }

    public float aDm() {
        return this.elC;
    }

    public boolean C(ao ao2) {
        float f2;
        float f3;
        float f4;
        switch (ao2) {
            case dwq: {
                f4 = this.aDi();
                f3 = this.aDl();
                f2 = 0.0f;
                break;
            }
            case dwr: {
                f4 = this.aDi();
                f3 = this.aDl();
                f2 = 1.0f;
                break;
            }
            case dws: {
                f4 = this.aDj();
                f3 = this.aDm();
                f2 = 0.0f;
                break;
            }
            case dwt: {
                f4 = this.aDj();
                f3 = this.aDm();
                f2 = 1.0f;
                break;
            }
            case dwu: {
                f4 = this.aDh();
                f3 = this.aDk();
                f2 = 0.0f;
                break;
            }
            case dwv: {
                f4 = this.aDh();
                f3 = this.aDk();
                f2 = 1.0f;
                break;
            }
            default: {
                return false;
            }
        }
        return f4 == f2 && f3 == f2;
    }

    public boolean D(ao ao2) {
        float f2;
        float f3;
        float f4;
        float f5;
        switch (ao2) {
            case dwq: 
            case dwr: {
                f5 = this.aDh();
                f4 = this.aDk();
                f3 = this.aDj();
                f2 = this.aDm();
                break;
            }
            case dws: 
            case dwt: {
                f5 = this.aDh();
                f4 = this.aDk();
                f3 = this.aDi();
                f2 = this.aDl();
                break;
            }
            case dwu: 
            case dwv: {
                f5 = this.aDi();
                f4 = this.aDl();
                f3 = this.aDj();
                f2 = this.aDm();
                break;
            }
            default: {
                return false;
            }
        }
        return f5 == 0.0f && f4 == 1.0f && f3 == 0.0f && f2 == 1.0f;
    }
}

