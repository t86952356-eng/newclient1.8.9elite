/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.db;
import net.optifine.e;

public class d
extends b {
    private int dVv;
    private int dVw;
    private int dVx;
    private final int dVy;
    private d[] dVz;
    private boolean bPW;

    public d(int n2, int n3, int n4) {
        this(n2, n3, n4, 0);
    }

    public d(double d2, double d3, double d4) {
        this(bt.aF(d2), bt.aF(d3), bt.aF(d4));
    }

    public d(int n2, int n3, int n4, int n5) {
        super(0, 0, 0);
        this.dVv = n2;
        this.dVw = n3;
        this.dVx = n4;
        this.dVy = n5;
    }

    @Override
    public int wt() {
        return this.dVv;
    }

    @Override
    public int wu() {
        return this.dVw;
    }

    @Override
    public int wx() {
        return this.dVx;
    }

    public void ah(int n2, int n3, int n4) {
        this.dVv = n2;
        this.dVw = n3;
        this.dVx = n4;
        this.bPW = true;
    }

    public void aq(double d2, double d3, double d4) {
        this.ah(bt.aF(d2), bt.aF(d3), bt.aF(d4));
    }

    public d l(db db2) {
        this.ah(db2.wt(), db2.wu(), db2.wx());
        return this;
    }

    public d ai(int n2, int n3, int n4) {
        this.ah(n2, n3, n4);
        return this;
    }

    public b A(ao ao2) {
        return this.x(ao2);
    }

    @Override
    public b x(ao ao2) {
        int n2;
        d d2;
        if (this.dVy <= 0) {
            return super.d(ao2, 1);
        }
        if (this.dVz == null) {
            this.dVz = new d[ao.dwD.length];
        }
        if (this.bPW) {
            this.jA();
        }
        if ((d2 = this.dVz[n2 = ao2.OY()]) == null) {
            int n3 = this.dVv + ao2.asH();
            int n4 = this.dVw + ao2.asI();
            int n5 = this.dVx + ao2.asJ();
            this.dVz[n2] = d2 = new d(n3, n4, n5, this.dVy - 1);
        }
        return d2;
    }

    @Override
    public b d(ao ao2, int n2) {
        return n2 == 1 ? this.x(ao2) : super.d(ao2, n2);
    }

    private void jA() {
        for (int i2 = 0; i2 < 6; ++i2) {
            d d2 = this.dVz[i2];
            if (d2 == null) continue;
            ao ao2 = ao.dwD[i2];
            int n2 = this.dVv + ao2.asH();
            int n3 = this.dVw + ao2.asI();
            int n4 = this.dVx + ao2.asJ();
            d2.ah(n2, n3, n4);
        }
        this.bPW = false;
    }

    public b aAi() {
        return new b(this.dVv, this.dVw, this.dVx);
    }

    public static Iterable c(b b2, b b3) {
        b b4 = new b(Math.min(b2.wt(), b3.wt()), Math.min(b2.wu(), b3.wu()), Math.min(b2.wx(), b3.wx()));
        b b5 = new b(Math.max(b2.wt(), b3.wt()), Math.max(b2.wu(), b3.wu()), Math.max(b2.wx(), b3.wx()));
        return new e(b4, b5);
    }
}

