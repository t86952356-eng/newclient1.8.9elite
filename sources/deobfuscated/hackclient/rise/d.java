/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.ahd;
import hackclient.rise.c;
import hackclient.rise.e;
import hackclient.rise.m;
import lombok.Generated;
import net.minecraft.network.aj;

public abstract class d
implements ahd {
    public final m R;
    c O = new c();
    private final e S;
    protected double T;
    protected double U;

    public d(m m2) {
        this.R = m2;
        if (!this.getClass().isAnnotationPresent(e.class)) {
            this.S = null;
            throw new RuntimeException("CheckInfo annotation not found in " + this.getClass().getSimpleName());
        }
        this.S = this.getClass().getAnnotation(e.class);
    }

    public abstract void a(aj<?> var1);

    public final void J() {
        this.T += 1.0;
        this.O.a(this);
    }

    public final double K() {
        this.U = Math.min(10000.0, this.U + 1.0);
        return this.U;
    }

    public final double a(double d2) {
        this.U = Math.min(10000.0, this.U + d2);
        return this.U;
    }

    public final double L() {
        this.U = Math.max(0.0, this.U - 1.0);
        return this.U;
    }

    public final double b(double d2) {
        this.U = Math.max(0.0, this.U - d2);
        return this.U;
    }

    public final void M() {
        this.U = 0.0;
    }

    public final void c(double d2) {
        this.U = d2;
    }

    public final void d(double d2) {
        this.U *= d2;
    }

    @Generated
    public m N() {
        return this.R;
    }

    @Generated
    public c I() {
        return this.O;
    }

    @Generated
    public e O() {
        return this.S;
    }

    @Generated
    public double P() {
        return this.T;
    }

    @Generated
    public double Q() {
        return this.U;
    }
}

