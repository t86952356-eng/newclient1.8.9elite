/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.abf;
import hackclient.rise.abg;
import hackclient.rise.aca;
import hackclient.rise.aea;
import hackclient.rise.agn;
import hackclient.rise.aka;
import hackclient.rise.gj;
import java.util.ArrayList;
import java.util.stream.Collectors;
import lombok.Generated;

public final class acc
implements aca,
aea {
    private final rip.vantage.commons.util.time.a aAl = new rip.vantage.commons.util.time.a();
    public agn scrollUtil = new agn();
    public ArrayList<abg> aAm;
    public gj aye;
    private double aAn;
    private double aAo;

    @Override
    public void b(int n2, int n3, float f2) {
        double d2;
        if (this.aye == null) {
            return;
        }
        abf abf2 = this.v();
        this.scrollUtil.qN();
        this.aAo = d2 = (double)(abf2.ayt.y + 7.0f) + this.scrollUtil.tT();
        double d3 = 0.0;
        for (abg abg2 : this.aAm) {
            abg2.a(new aka((double)abf2.ayt.x + abf2.ayu.ayX + 8.0, d2), n2, n3, f2);
            d2 += (double)(abg2.alQ.y + 7.0f);
            d3 += (double)(abg2.alQ.y + 7.0f);
        }
        this.aAn = d2;
        double d4 = 7.0;
        double d5 = abf2.pm().getX() + abf2.pn().getX() - 4.0f;
        double d6 = (double)abf2.pm().getY() + d4;
        this.scrollUtil.a(new aka(d5, d6), (double)this.v().alQ.y - d4 * 2.0);
        this.scrollUtil.V(-d3 + (double)abf2.alQ.y - 7.0);
        this.aAl.aX();
    }

    @Override
    public void a(char c2, int n2) {
        for (abg abg2 : this.qv()) {
            abg2.b(c2, n2);
        }
    }

    @Override
    public void f(int n2, int n3, int n4) {
        if (this.aAm == null) {
            return;
        }
        for (abg abg2 : this.aAm) {
            abg2.d(n2, n3, n4);
        }
    }

    @Override
    public void oW() {
        if (this.aye == null) {
            return;
        }
        for (abg abg2 : this.qv()) {
            abg2.pP();
        }
    }

    @Override
    public void qo() {
        if (this.aye == null) {
            return;
        }
        for (abg abg2 : this.qv()) {
            abg2.ci();
        }
    }

    @Override
    public void aT() {
        this.aye = this.oX();
        if (this.aye == null) {
            return;
        }
        this.aAm = a.a.v().pw().stream().filter(abg2 -> abg2.dl().getModuleInfo().category() == this.aye).collect(Collectors.toCollection(ArrayList::new));
    }

    private gj oX() {
        for (gj gj2 : gj.values()) {
            if (gj2.ec() != this.v().pp()) continue;
            return gj2;
        }
        return null;
    }

    @Generated
    public rip.vantage.commons.util.time.a me() {
        return this.aAl;
    }

    @Generated
    public agn qu() {
        return this.scrollUtil;
    }

    @Generated
    public ArrayList<abg> qv() {
        return this.aAm;
    }

    @Generated
    public double qw() {
        return this.aAn;
    }

    @Generated
    public double qx() {
        return this.aAo;
    }

    @Generated
    public void a(agn agn2) {
        this.scrollUtil = agn2;
    }

    @Generated
    public void b(ArrayList<abg> arrayList) {
        this.aAm = arrayList;
    }

    @Generated
    public void b(gj gj2) {
        this.aye = gj2;
    }

    @Generated
    public void H(double d2) {
        this.aAn = d2;
    }

    @Generated
    public void I(double d2) {
        this.aAo = d2;
    }
}

