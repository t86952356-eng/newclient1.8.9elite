/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.util.math;

import lombok.Generated;

public final class Vector2f {
    public float x;
    public float y;

    public Vector2f(Vector2f vector2f) {
        this(vector2f.x, vector2f.y);
    }

    public Vector2f h(float f2, float f3) {
        return new Vector2f(this.x + f2, this.y + f3);
    }

    @Generated
    public float getX() {
        return this.x;
    }

    @Generated
    public float getY() {
        return this.y;
    }

    @Generated
    public void setX(float f2) {
        this.x = f2;
    }

    @Generated
    public void setY(float f2) {
        this.y = f2;
    }

    @Generated
    public Vector2f(float f2, float f3) {
        this.x = f2;
        this.y = f3;
    }
}

