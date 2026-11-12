/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.afk;
import lombok.Generated;

public class afj {
    private afk aGQ;
    private long aGR;
    private long aGS;
    private long fa;
    private double aGT;
    private double aGU;
    private double aGV;
    private boolean fY;

    public afj(afk afk2, long l2) {
        this.aGQ = afk2;
        this.fa = System.currentTimeMillis();
        this.aGR = l2;
    }

    public void Q(double d2) {
        this.aGS = System.currentTimeMillis();
        if (this.aGU != d2) {
            this.aGU = d2;
            this.aX();
        } else {
            boolean bl2 = this.fY = this.aGS - this.aGR > this.fa;
            if (this.fY) {
                this.aGV = d2;
                return;
            }
        }
        double d3 = this.aGQ.sW().apply(this.sO());
        this.aGV = this.aGV > d2 ? this.aGT - (this.aGT - d2) * d3 : this.aGT + (d2 - this.aGT) * d3;
    }

    public double sO() {
        return (double)(System.currentTimeMillis() - this.fa) / (double)this.aGR;
    }

    public void aX() {
        this.fa = System.currentTimeMillis();
        this.aGT = this.aGV;
        this.fY = false;
    }

    @Generated
    public afk sP() {
        return this.aGQ;
    }

    @Generated
    public long sQ() {
        return this.aGR;
    }

    @Generated
    public long sR() {
        return this.aGS;
    }

    @Generated
    public long sS() {
        return this.fa;
    }

    @Generated
    public double sT() {
        return this.aGT;
    }

    @Generated
    public double sU() {
        return this.aGU;
    }

    @Generated
    public double sV() {
        return this.aGV;
    }

    @Generated
    public boolean kM() {
        return this.fY;
    }

    @Generated
    public void a(afk afk2) {
        this.aGQ = afk2;
    }

    @Generated
    public void h(long l2) {
        this.aGR = l2;
    }

    @Generated
    public void i(long l2) {
        this.aGS = l2;
    }

    @Generated
    public void j(long l2) {
        this.fa = l2;
    }

    @Generated
    public void R(double d2) {
        this.aGT = d2;
    }

    @Generated
    public void S(double d2) {
        this.aGU = d2;
    }

    @Generated
    public void T(double d2) {
        this.aGV = d2;
    }

    @Generated
    public void B(boolean bl2) {
        this.fY = bl2;
    }
}

