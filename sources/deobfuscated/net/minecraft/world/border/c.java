/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.border;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.world.b;
import net.minecraft.world.border.a;

public class c {
    private final List<net.minecraft.world.border.b> dIv = Lists.newArrayList();
    private double centerX = 0.0;
    private double centerZ = 0.0;
    private double dIw;
    private double targetSize = this.dIw = 6.0E7;
    private long dIy;
    private long fa;
    private int size = 29999984;
    private double dIA = 0.2;
    private double dIB = 5.0;
    private int warningTime = 15;
    private int warningDistance = 5;

    public boolean bm(net.minecraft.util.b b2) {
        return (double)(b2.wt() + 1) > this.axm() && (double)b2.wt() < this.axo() && (double)(b2.wx() + 1) > this.axn() && (double)b2.wx() < this.axp();
    }

    public boolean a(b b2) {
        return (double)b2.auS() > this.axm() && (double)b2.auQ() < this.axo() && (double)b2.auT() > this.axn() && (double)b2.auR() < this.axp();
    }

    public boolean w(net.minecraft.util.a a2) {
        return a2.dtK > this.axm() && a2.dtH < this.axo() && a2.dtM > this.axn() && a2.dtJ < this.axp();
    }

    public double aD(net.minecraft.entity.c c2) {
        return this.B(c2.gW, c2.gY);
    }

    public double B(double d2, double d3) {
        double d4 = d3 - this.axn();
        double d5 = this.axp() - d3;
        double d6 = d2 - this.axm();
        double d7 = this.axo() - d2;
        double d8 = Math.min(d6, d7);
        d8 = Math.min(d8, d4);
        return Math.min(d8, d5);
    }

    public a axl() {
        return this.targetSize < this.dIw ? a.dIr : (this.targetSize > this.dIw ? a.dIq : a.dIs);
    }

    public double axm() {
        double d2 = this.getCenterX() - this.axq() / 2.0;
        if (d2 < (double)(-this.size)) {
            d2 = -this.size;
        }
        return d2;
    }

    public double axn() {
        double d2 = this.getCenterZ() - this.axq() / 2.0;
        if (d2 < (double)(-this.size)) {
            d2 = -this.size;
        }
        return d2;
    }

    public double axo() {
        double d2 = this.getCenterX() + this.axq() / 2.0;
        if (d2 > (double)this.size) {
            d2 = this.size;
        }
        return d2;
    }

    public double axp() {
        double d2 = this.getCenterZ() + this.axq() / 2.0;
        if (d2 > (double)this.size) {
            d2 = this.size;
        }
        return d2;
    }

    public double getCenterX() {
        return this.centerX;
    }

    public double getCenterZ() {
        return this.centerZ;
    }

    public void C(double d2, double d3) {
        this.centerX = d2;
        this.centerZ = d3;
        for (net.minecraft.world.border.b b2 : this.axr()) {
            b2.a(this, d2, d3);
        }
    }

    public double axq() {
        if (this.axl() != a.dIs) {
            double d2 = (float)(System.currentTimeMillis() - this.fa) / (float)(this.dIy - this.fa);
            if (d2 < 1.0) {
                return this.dIw + (this.targetSize - this.dIw) * d2;
            }
            this.aN(this.targetSize);
        }
        return this.dIw;
    }

    public long getTimeUntilTarget() {
        return this.axl() != a.dIs ? this.dIy - System.currentTimeMillis() : 0L;
    }

    public double getTargetSize() {
        return this.targetSize;
    }

    public void aN(double d2) {
        this.dIw = d2;
        this.targetSize = d2;
        this.fa = this.dIy = System.currentTimeMillis();
        for (net.minecraft.world.border.b b2 : this.axr()) {
            b2.a(this, d2);
        }
    }

    public void a(double d2, double d3, long l2) {
        this.dIw = d2;
        this.targetSize = d3;
        this.fa = System.currentTimeMillis();
        this.dIy = this.fa + l2;
        for (net.minecraft.world.border.b b2 : this.axr()) {
            b2.a(this, d2, d3, l2);
        }
    }

    protected List<net.minecraft.world.border.b> axr() {
        return Lists.newArrayList(this.dIv);
    }

    public void a(net.minecraft.world.border.b b2) {
        this.dIv.add(b2);
    }

    public void ip(int n2) {
        this.size = n2;
    }

    public int getSize() {
        return this.size;
    }

    public double axs() {
        return this.dIB;
    }

    public void aO(double d2) {
        this.dIB = d2;
        for (net.minecraft.world.border.b b2 : this.axr()) {
            b2.c(this, d2);
        }
    }

    public double axt() {
        return this.dIA;
    }

    public void aP(double d2) {
        this.dIA = d2;
        for (net.minecraft.world.border.b b2 : this.axr()) {
            b2.b(this, d2);
        }
    }

    public double axu() {
        return this.dIy == this.fa ? 0.0 : Math.abs(this.dIw - this.targetSize) / (double)(this.dIy - this.fa);
    }

    public int getWarningTime() {
        return this.warningTime;
    }

    public void iq(int n2) {
        this.warningTime = n2;
        for (net.minecraft.world.border.b b2 : this.axr()) {
            b2.a(this, n2);
        }
    }

    public int getWarningDistance() {
        return this.warningDistance;
    }

    public void ir(int n2) {
        this.warningDistance = n2;
        for (net.minecraft.world.border.b b2 : this.axr()) {
            b2.b(this, n2);
        }
    }
}

