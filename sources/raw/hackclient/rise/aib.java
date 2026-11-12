/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import lombok.Generated;
import net.minecraft.util.da;

public class aib {
    private double x;
    private double y;
    private double z;

    public aib n(double d2, double d3, double d4) {
        return new aib(this.x + d2, this.y + d3, this.z + d4);
    }

    public aib vm() {
        return new aib(Math.floor(this.x), Math.floor(this.y), Math.floor(this.z));
    }

    public double c(aib aib2) {
        return Math.pow(aib2.x - this.x, 2.0) + Math.pow(aib2.y - this.y, 2.0) + Math.pow(aib2.z - this.z, 2.0);
    }

    public aib d(aib aib2) {
        return this.n(aib2.getX(), aib2.getY(), aib2.getZ());
    }

    public da vn() {
        return new da(this.x, this.y, this.z);
    }

    public String toString() {
        return "[" + this.x + ";" + this.y + ";" + this.z + "]";
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
    public double getZ() {
        return this.z;
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

    @Generated
    public aib(double d2, double d3, double d4) {
        this.x = d2;
        this.y = d3;
        this.z = d4;
    }
}

