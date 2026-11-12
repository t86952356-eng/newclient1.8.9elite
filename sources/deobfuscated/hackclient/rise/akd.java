/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import lombok.Generated;

public class akd {
    public double x;
    public double y;
    public double z;

    public akd(double d2, double d3, double d4) {
        this.x = d2;
        this.y = d3;
        this.z = d4;
    }

    public akd v(double d2, double d3, double d4) {
        return new akd(this.x + d2, this.y + d3, this.z + d4);
    }

    public akd e(akd akd2) {
        return this.v(akd2.x, akd2.y, akd2.z);
    }

    public akd w(double d2, double d3, double d4) {
        return this.v(-d2, -d3, -d4);
    }

    public akd f(akd akd2) {
        return this.v(-akd2.x, -akd2.y, -akd2.z);
    }

    public double wv() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public akd ww() {
        double d2 = this.wv();
        if (d2 == 0.0) {
            return new akd(0.0, 0.0, 0.0);
        }
        return new akd(this.x / d2, this.y / d2, this.z / d2);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public akd ag(double d2) {
        return new akd(this.x * d2, this.y * d2, this.z * d2);
    }

    public double g(akd akd2) {
        return Math.sqrt(Math.pow(akd2.x - this.x, 2.0) + Math.pow(akd2.y - this.y, 2.0) + Math.pow(akd2.z - this.z, 2.0));
    }

    public boolean equals(Object object) {
        if (!(object instanceof akd)) {
            return false;
        }
        akd akd2 = (akd)object;
        return Math.floor(this.x) == Math.floor(akd2.x) && Math.floor(this.y) == Math.floor(akd2.y) && Math.floor(this.z) == Math.floor(akd2.z);
    }

    @Generated
    public void setX(double d2) {
        this.x = d2;
    }

    @Generated
    public void setY(double d2) {
        this.y = d2;
    }

    @Generated
    public void setZ(double d2) {
        this.z = d2;
    }
}

