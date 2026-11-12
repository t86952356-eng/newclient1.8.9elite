/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.util.math;

import lombok.Generated;

public final class Vector2d {
    public double x;
    public double y;

    public Vector2d() {
    }

    public Vector2d(double d2, double d3) {
        this.x = d2;
        this.y = d3;
    }

    public Vector2d p(double d2, double d3) {
        return new Vector2d(this.x + d2, this.y + d3);
    }

    public Vector2d m(Vector2d vector2d) {
        return this.p(vector2d.x, vector2d.y);
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

