/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.di;
import lombok.Generated;
import net.minecraft.util.ce;

public class fr
implements di {
    private double kd;
    private float ke;
    private ce kf;

    public fr(double d2, float f2) {
        this.kd = d2;
        this.ke = f2;
    }

    @Generated
    public double dA() {
        return this.kd;
    }

    @Generated
    public float dB() {
        return this.ke;
    }

    @Generated
    public ce dC() {
        return this.kf;
    }

    @Generated
    public void i(double d2) {
        this.kd = d2;
    }

    @Generated
    public void c(float f2) {
        this.ke = f2;
    }

    @Generated
    public void a(ce ce2) {
        this.kf = ce2;
    }
}

