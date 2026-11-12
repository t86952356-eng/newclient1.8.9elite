/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.adi;
import hackclient.rise.aea;
import lombok.Generated;

public class adj
implements adi,
aea {
    private double x;
    private double y;
    private double ayj;
    private double jy;

    public adj(double d2, double d3, double d4, double d5) {
        this.x = d2;
        this.y = d3;
        this.ayj = d4;
        this.jy = d5;
    }

    @Generated
    public double getX() {
        return this.x;
    }

    @Generated
    public double getY() {
        return this.y;
    }

    @Generated
    public double pc() {
        return this.ayj;
    }

    @Generated
    public double da() {
        return this.jy;
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
    public void P(double d2) {
        this.ayj = d2;
    }

    @Generated
    public void h(double d2) {
        this.jy = d2;
    }
}

