/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  lombok.Generated
 */
package net.minecraft.util;

import com.google.common.base.Objects;
import lombok.Generated;
import net.minecraft.util.bt;

public class db
implements Comparable<db> {
    public static final db dAJ = new db(0, 0, 0);
    private int alM;
    private int alN;
    private int aRr;

    public db(int n2, int n3, int n4) {
        this.alM = n2;
        this.alN = n3;
        this.aRr = n4;
    }

    public db(double d2, double d3, double d4) {
        this(bt.aF(d2), bt.aF(d3), bt.aF(d4));
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof db)) {
            return false;
        }
        db db2 = (db)object;
        return this.wt() == db2.wt() && this.wu() == db2.wu() && this.wx() == db2.wx();
    }

    public int hashCode() {
        return (this.wu() + this.wx() * 31) * 31 + this.wt();
    }

    public int h(db db2) {
        return this.wu() == db2.wu() ? (this.wx() == db2.wx() ? this.wt() - db2.wt() : this.wx() - db2.wx()) : this.wu() - db2.wu();
    }

    public int wt() {
        return this.alM;
    }

    public int wu() {
        return this.alN;
    }

    public int wx() {
        return this.aRr;
    }

    public db f(db db2) {
        return new db(this.wu() * db2.wx() - this.wx() * db2.wu(), this.wx() * db2.wt() - this.wt() * db2.wx(), this.wt() * db2.wu() - this.wu() * db2.wt());
    }

    public db D(int n2, int n3, int n4) {
        return new db(this.alM + n2, this.alN + n3, this.aRr + n4);
    }

    public db e(db db2) {
        return this.D(db2.alM, db2.alN, db2.aRr);
    }

    public double am(double d2, double d3, double d4) {
        double d5 = (double)this.wt() - d2;
        double d6 = (double)this.wu() - d3;
        double d7 = (double)this.wx() - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double an(double d2, double d3, double d4) {
        double d5 = (double)this.wt() - d2;
        double d6 = (double)this.wu() - d3;
        double d7 = (double)this.wx() - d4;
        return Math.sqrt(d5 * d5 + d6 * d6 + d7 * d7);
    }

    public double ao(double d2, double d3, double d4) {
        double d5 = (double)this.wt() + 0.5 - d2;
        double d6 = (double)this.wu() + 0.5 - d3;
        double d7 = (double)this.wx() + 0.5 - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double i(db db2) {
        return this.am(db2.wt(), db2.wu(), db2.wx());
    }

    public double j(db db2) {
        return this.an(db2.wt(), db2.wu(), db2.wx());
    }

    public String toString() {
        return Objects.toStringHelper((Object)this).add("x", this.wt()).add("y", this.wu()).add("z", this.wx()).toString();
    }

    @Generated
    public void aG(int n2) {
        this.alM = n2;
    }

    @Generated
    public void aH(int n2) {
        this.alN = n2;
    }

    @Generated
    public void aI(int n2) {
        this.aRr = n2;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.h((db)object);
    }
}

