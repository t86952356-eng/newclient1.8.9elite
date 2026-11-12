/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.input.Mouse
 */
package hackclient.rise;

import hackclient.rise.ahj;
import hackclient.rise.ais;
import hackclient.rise.ait;
import java.awt.Color;
import lombok.Generated;
import org.lwjgl.input.Mouse;
import rip.vantage.commons.util.time.a;
import rise.util.InstanceAccess;
import rise.util.math.Vector2d;

public class agn
implements InstanceAccess {
    public double aJN;
    public double scroll;
    public double aJO = 25.0;
    public a rG = new a();
    public a aJP = new a();
    public boolean aJQ;
    public boolean dj;
    public boolean aJR;
    private boolean RS;

    public void qN() {
        this.E(true);
    }

    public void E(boolean bl2) {
        if (this.aJP.T(50L)) {
            float f2 = bl2 ? (float)(Mouse.getDWheel() * (this.RS ? -1 : 1)) : 0.0f;
            double d2 = 30.0;
            boolean bl3 = this.dj = f2 != 0.0f;
            if (!this.dj) {
                // empty if block
            }
            this.aJN = Math.min(Math.max(this.aJN + (double)(f2 / 2.0f), this.aJO - (f2 == 0.0f ? 0.0 : d2)), f2 == 0.0f ? 0.0 : d2);
            this.aJP.aX();
        }
        int n2 = 0;
        while ((long)n2 < this.rG.aKM()) {
            this.scroll = ahj.m(this.scroll, this.aJN, 0.01f);
            ++n2;
        }
        this.aJR = Math.abs(this.scroll - this.aJN) > 0.5;
        this.rG.aX();
    }

    public void a(Vector2d vector2d, double d2) {
        double d3 = (this.RS ? this.tU() - this.tT() : this.tT()) / this.tU();
        double d4 = d2 - this.tU() / (this.tU() - d2) * d2;
        boolean bl2 = this.aJQ = d4 < d2;
        if (!this.aJQ) {
            return;
        }
        double d5 = vector2d.x;
        double d6 = vector2d.y + d2 * d3 - d4 * d3;
        Color color = ais.d(Color.WHITE, 60);
        ait.c(d5, d6, 1.0, d4, 0.5, color);
    }

    public void aX() {
        this.scroll = 0.0;
        this.aJN = 0.0;
    }

    @Generated
    public double tS() {
        return this.aJN;
    }

    @Generated
    public double tT() {
        return this.scroll;
    }

    @Generated
    public double tU() {
        return this.aJO;
    }

    @Generated
    public a me() {
        return this.rG;
    }

    @Generated
    public a tV() {
        return this.aJP;
    }

    @Generated
    public boolean tW() {
        return this.aJQ;
    }

    @Generated
    public boolean bd() {
        return this.dj;
    }

    @Generated
    public boolean tX() {
        return this.aJR;
    }

    @Generated
    public boolean tY() {
        return this.RS;
    }

    @Generated
    public void U(double d2) {
        this.aJN = d2;
    }

    @Generated
    public void setScroll(double d2) {
        this.scroll = d2;
    }

    @Generated
    public void V(double d2) {
        this.aJO = d2;
    }

    @Generated
    public void c(a a2) {
        this.rG = a2;
    }

    @Generated
    public void d(a a2) {
        this.aJP = a2;
    }

    @Generated
    public void F(boolean bl2) {
        this.aJQ = bl2;
    }

    @Generated
    public void c(boolean bl2) {
        this.dj = bl2;
    }

    @Generated
    public void G(boolean bl2) {
        this.aJR = bl2;
    }

    @Generated
    public void H(boolean bl2) {
        this.RS = bl2;
    }
}

