/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.aj;
import net.minecraft.entity.p;
import net.minecraft.util.bt;

public class bk {
    protected p cAn;
    protected double x;
    protected double y;
    protected double z;
    protected double speed;
    protected boolean cAu;

    public bk(p p2) {
        this.cAn = p2;
        this.x = p2.gW;
        this.y = p2.gX;
        this.z = p2.gY;
    }

    public boolean Xl() {
        return this.cAu;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void k(double d2, double d3, double d4, double d5) {
        this.x = d2;
        this.y = d3;
        this.z = d4;
        this.speed = d5;
        this.cAu = true;
    }

    public void Xm() {
        this.cAn.aW(0.0f);
        if (this.cAu) {
            double d2;
            this.cAu = false;
            double d3 = this.x - this.cAn.gW;
            int n2 = bt.aF(this.cAn.Us().dtI + 0.5);
            double d4 = this.y - (double)n2;
            double d5 = d3 * d3 + d4 * d4 + (d2 = this.z - this.cAn.gY) * d2;
            if (d5 >= 2.500000277905201E-7) {
                float f2 = (float)(bt.y(d2, d3) * 180.0 / Math.PI) - 90.0f;
                this.cAn.pl = this.w(this.cAn.pl, f2, 30.0f);
                this.cAn.aX((float)(this.speed * this.cAn.a(aj.cwp).XB()));
                if (d4 > 0.0 && d3 * d3 + d2 * d2 < 1.0) {
                    this.cAn.UT().Xb();
                }
            }
        }
    }

    protected float w(float f2, float f3, float f4) {
        float f5;
        float f6 = bt.bN(f3 - f2);
        if (f6 > f4) {
            f6 = f4;
        }
        if (f6 < -f4) {
            f6 = -f4;
        }
        if ((f5 = f2 + f6) < 0.0f) {
            f5 += 360.0f;
        } else if (f5 > 360.0f) {
            f5 -= 360.0f;
        }
        return f5;
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
}

