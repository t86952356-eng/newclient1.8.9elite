/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import hackclient.rise.akd;
import net.minecraft.util.ao;
import net.minecraft.util.bt;
import net.minecraft.util.c;
import net.minecraft.util.da;
import net.minecraft.util.db;
import net.minecraft.util.e;
import net.minecraft.util.g;

public class b
extends db {
    public static final b dtN = new b(0, 0, 0);
    private static final int dtO;
    private static final int dtP;
    private static final int dtQ;
    private static final int dtR;
    private static final int dtS;
    private static final long dtT;
    private static final long dtU;
    private static final long dtV;

    public b(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public b(double d2, double d3, double d4) {
        super(d2, d3, d4);
    }

    public b(net.minecraft.entity.c c2) {
        this(c2.gW, c2.gX, c2.gY);
    }

    public b(da da2) {
        this(da2.dAG, da2.dAH, da2.dAI);
    }

    public b(db db2) {
        this(db2.wt(), db2.wu(), db2.wx());
    }

    public b ag(double d2, double d3, double d4) {
        return d2 == 0.0 && d3 == 0.0 && d4 == 0.0 ? this : new b((double)this.wt() + d2, (double)this.wu() + d3, (double)this.wx() + d4);
    }

    public b C(int n2, int n3, int n4) {
        return n2 == 0 && n3 == 0 && n4 == 0 ? this : new b(this.wt() + n2, this.wu() + n3, this.wx() + n4);
    }

    public b b(db db2) {
        return db2.wt() == 0 && db2.wu() == 0 && db2.wx() == 0 ? this : new b(this.wt() + db2.wt(), this.wu() + db2.wu(), this.wx() + db2.wx());
    }

    public b c(db db2) {
        return db2.wt() == 0 && db2.wu() == 0 && db2.wx() == 0 ? this : new b(this.wt() - db2.wt(), this.wu() - db2.wu(), this.wx() - db2.wx());
    }

    public b aqX() {
        return this.hq(1);
    }

    public b hq(int n2) {
        return this.d(ao.dwr, n2);
    }

    public b aqY() {
        return this.hr(1);
    }

    public b hr(int n2) {
        return this.d(ao.dwq, n2);
    }

    public b aqZ() {
        return this.hs(1);
    }

    public b hs(int n2) {
        return this.d(ao.dws, n2);
    }

    public b ara() {
        return this.ht(1);
    }

    public b ht(int n2) {
        return this.d(ao.dwt, n2);
    }

    public b arb() {
        return this.hu(1);
    }

    public b hu(int n2) {
        return this.d(ao.dwu, n2);
    }

    public b arc() {
        return this.hv(1);
    }

    public b hv(int n2) {
        return this.d(ao.dwv, n2);
    }

    public b x(ao ao2) {
        return this.d(ao2, 1);
    }

    public b d(ao ao2, int n2) {
        return n2 == 0 ? this : new b(this.wt() + ao2.asH() * n2, this.wu() + ao2.asI() * n2, this.wx() + ao2.asJ() * n2);
    }

    public b d(db db2) {
        return new b(this.wu() * db2.wx() - this.wx() * db2.wu(), this.wx() * db2.wt() - this.wt() * db2.wx(), this.wt() * db2.wu() - this.wu() * db2.wt());
    }

    public long ard() {
        return ((long)this.wt() & dtT) << dtS | ((long)this.wu() & dtU) << dtR | ((long)this.wx() & dtV) << 0;
    }

    public static b x(long l2) {
        int n2 = (int)(l2 << 64 - dtS - dtO >> 64 - dtO);
        int n3 = (int)(l2 << 64 - dtR - dtQ >> 64 - dtQ);
        int n4 = (int)(l2 << 64 - dtP >> 64 - dtP);
        return new b(n2, n3, n4);
    }

    public boolean h(akd akd2) {
        return Math.floor(akd2.getX()) == (double)this.wt() && Math.floor(akd2.getY()) == (double)this.wu() && Math.floor(akd2.getZ()) == (double)this.wx();
    }

    public static Iterable<b> b(b b2, b b3) {
        b b4 = new b(Math.min(b2.wt(), b3.wt()), Math.min(b2.wu(), b3.wu()), Math.min(b2.wx(), b3.wx()));
        b b5 = new b(Math.max(b2.wt(), b3.wt()), Math.max(b2.wu(), b3.wu()), Math.max(b2.wx(), b3.wx()));
        return new c(b4, b5);
    }

    public static Iterable<g> c(b b2, b b3) {
        b b4 = new b(Math.min(b2.wt(), b3.wt()), Math.min(b2.wu(), b3.wu()), Math.min(b2.wx(), b3.wx()));
        b b5 = new b(Math.max(b2.wt(), b3.wt()), Math.max(b2.wu(), b3.wu()), Math.max(b2.wx(), b3.wx()));
        return new e(b4, b5);
    }

    @Override
    public /* synthetic */ db e(db db2) {
        return this.b(db2);
    }

    @Override
    public /* synthetic */ db D(int n2, int n3, int n4) {
        return this.C(n2, n3, n4);
    }

    @Override
    public /* synthetic */ db f(db db2) {
        return this.d(db2);
    }

    static {
        dtP = dtO = 1 + bt.hR(bt.hO(30000000));
        dtQ = 64 - dtO - dtP;
        dtR = 0 + dtP;
        dtS = dtR + dtQ;
        dtT = (1L << dtO) - 1L;
        dtU = (1L << dtQ) - 1L;
        dtV = (1L << dtP) - 1L;
    }
}

