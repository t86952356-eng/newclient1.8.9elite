/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import lombok.Generated;

public final class akb {
    public float x;
    public float y;

    public akb(akb akb2) {
        this(akb2.x, akb2.y);
    }

    public akb h(float f2, float f3) {
        return new akb(this.x + f2, this.y + f3);
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
    public akb(float f2, float f3) {
        this.x = f2;
        this.y = f3;
    }
}

