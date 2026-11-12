/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import lombok.Generated;

public final class aka {
    public double x;
    public double y;

    public aka() {
    }

    public aka(double d2, double d3) {
        this.x = d2;
        this.y = d3;
    }

    public aka p(double d2, double d3) {
        return new aka(this.x + d2, this.y + d3);
    }

    public aka m(aka aka2) {
        return this.p(aka2.x, aka2.y);
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
    public void setX(double d2) {
        this.x = d2;
    }

    @Generated
    public void setY(double d2) {
        this.y = d2;
    }
}

