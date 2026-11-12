/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.alan.clients.script.api.wrapper.impl.vector;

import lombok.Generated;

public class ScriptVector3d {
    private double x;
    private double y;
    private double z;

    public double getX() {
        return this.x;
    }

    public void setX(double d2) {
        this.x = d2;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double d2) {
        this.y = d2;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double d2) {
        this.z = d2;
    }

    public void add(ScriptVector3d scriptVector3d) {
        this.x += scriptVector3d.getX();
        this.y += scriptVector3d.getY();
        this.z += scriptVector3d.getZ();
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ScriptVector3d)) {
            return false;
        }
        ScriptVector3d scriptVector3d = (ScriptVector3d)object;
        if (!scriptVector3d.canEqual(this)) {
            return false;
        }
        if (Double.compare(this.getX(), scriptVector3d.getX()) != 0) {
            return false;
        }
        if (Double.compare(this.getY(), scriptVector3d.getY()) != 0) {
            return false;
        }
        return Double.compare(this.getZ(), scriptVector3d.getZ()) == 0;
    }

    @Generated
    protected boolean canEqual(Object object) {
        return object instanceof ScriptVector3d;
    }

    @Generated
    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        long l2 = Double.doubleToLongBits(this.getX());
        n3 = n3 * 59 + (int)(l2 >>> 32 ^ l2);
        long l3 = Double.doubleToLongBits(this.getY());
        n3 = n3 * 59 + (int)(l3 >>> 32 ^ l3);
        long l4 = Double.doubleToLongBits(this.getZ());
        n3 = n3 * 59 + (int)(l4 >>> 32 ^ l4);
        return n3;
    }

    @Generated
    public String toString() {
        return "ScriptVector3d(x=" + this.getX() + ", y=" + this.getY() + ", z=" + this.getZ() + ")";
    }

    @Generated
    public ScriptVector3d(double d2, double d3, double d4) {
        this.x = d2;
        this.y = d3;
        this.z = d4;
    }
}

