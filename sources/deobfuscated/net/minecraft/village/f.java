/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.village;

import net.minecraft.util.ao;
import net.minecraft.util.b;

public class f {
    private final b dBt;
    private final b dBu;
    private final ao dBv;
    private int dBw;
    private boolean dBx;
    private int dBy;

    public f(b b2, int n2, int n3, int n4) {
        this(b2, f.aJ(n2, n3), n4);
    }

    private static ao aJ(int n2, int n3) {
        return n2 < 0 ? ao.dwu : (n2 > 0 ? ao.dwv : (n3 < 0 ? ao.dws : ao.dwt));
    }

    public f(b b2, ao ao2, int n2) {
        this.dBt = b2;
        this.dBv = ao2;
        this.dBu = b2.d(ao2, 2);
        this.dBw = n2;
    }

    public int I(int n2, int n3, int n4) {
        return (int)this.dBt.am(n2, n3, n4);
    }

    public int aB(b b2) {
        return (int)b2.i(this.auF());
    }

    public int aC(b b2) {
        return (int)this.dBu.i(b2);
    }

    public boolean aD(b b2) {
        int n2 = b2.wt() - this.dBt.wt();
        int n3 = b2.wx() - this.dBt.wu();
        return n2 * this.dBv.asH() + n3 * this.dBv.asJ() >= 0;
    }

    public void auC() {
        this.dBy = 0;
    }

    public void auD() {
        ++this.dBy;
    }

    public int auE() {
        return this.dBy;
    }

    public b auF() {
        return this.dBt;
    }

    public b auG() {
        return this.dBu;
    }

    public int auH() {
        return this.dBv.asH() * 2;
    }

    public int auI() {
        return this.dBv.asJ() * 2;
    }

    public int auJ() {
        return this.dBw;
    }

    public void hZ(int n2) {
        this.dBw = n2;
    }

    public boolean auK() {
        return this.dBx;
    }

    public void cr(boolean bl2) {
        this.dBx = bl2;
    }
}

