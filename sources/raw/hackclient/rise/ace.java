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
import hackclient.rise.abo;
import hackclient.rise.aby;
import hackclient.rise.abz;
import hackclient.rise.aca;
import hackclient.rise.aea;
import hackclient.rise.agn;
import hackclient.rise.ago;
import hackclient.rise.agp;
import hackclient.rise.aka;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.util.ArrayList;
import lombok.Generated;

public final class ace
implements aca,
aea {
    public final agp aAx = new agp(new aka(200.0, 200.0), gb.ks.a(20, gd.kG), Color.WHITE, ago.aJT, "Start typing to search...", 150.0f);
    private final rip.vantage.commons.util.time.a aAy = new rip.vantage.commons.util.time.a();
    public agn scrollUtil = new agn();
    public ArrayList<abg> aAm = new ArrayList();
    private double ayE = 255.0;
    private double aAn;
    private double aAo;
    private boolean aAz;

    @Override
    public void b(int n2, int n3, float f2) {
        double d2;
        abf abf2 = this.v();
        this.ayE = this.scrollUtil.tS() < 0.0 ? (this.ayE -= (double)(this.aAy.aKM() * 4L)) : (this.ayE += (double)(this.aAy.aKM() * 4L));
        this.ayE = Math.min(Math.max(0.0, this.ayE), 255.0);
        this.aAx.b(abz.aAc.Y((int)this.ayE));
        aka aka2 = new aka((double)abf2.ayt.x + abf2.ayu.ayX + ((double)abf2.alQ.x - abf2.ayu.ayX) / 2.0, (float)((double)(abf2.ayt.y + 17.0f) + this.scrollUtil.tT()));
        this.aAx.h(aka2);
        this.aAx.pZ();
        this.scrollUtil.qN();
        this.aAo = d2 = (double)(abf2.ayt.y + 35.0f) + this.scrollUtil.tT();
        double d3 = 0.0;
        for (abg abg2 : this.aAm) {
            abg2.a(new aka((double)abf2.ayt.x + abf2.ayu.ayX + 4.0, d2), n2, n3, f2);
            d2 += (double)(abg2.alQ.y + 5.0f);
            d3 += (double)(abg2.alQ.y + 5.0f);
        }
        this.aAn = d2;
        this.scrollUtil.V(-d3 + (double)abf2.alQ.y - 37.0);
        this.aAy.aX();
    }

    @Override
    public void a(char c2, int n2) {
        if (!this.aAz && c2 != '\u0000' && !Character.isISOControl(c2)) {
            this.aAz = true;
            this.aH(" ");
        }
        if (!this.pl()) {
            this.aAx.I(true);
        }
        this.aAx.b(c2, n2);
        this.scrollUtil.U(0.0);
        this.aAm = this.aG(this.aAx.getText());
        for (abg abg2 : this.qv()) {
            abg2.b(c2, n2);
        }
    }

    @Override
    public void f(int n2, int n3, int n4) {
        for (abg abg2 : this.aAm) {
            abg2.d(n2, n3, n4);
        }
        this.aAx.d(n2, n3, n4);
    }

    @Override
    public void oW() {
        for (abg abg2 : this.qv()) {
            abg2.pP();
        }
    }

    @Override
    public void qo() {
        for (abg abg2 : this.qv()) {
            abg2.ci();
        }
    }

    @Override
    public void aT() {
        this.aAm = this.aG(this.aAx.getText());
        this.aAz = false;
    }

    public ArrayList<abg> aG(String string) {
        ArrayList<abg> arrayList = new ArrayList<abg>();
        block0: for (abg abg2 : a.a.v().pw()) {
            for (String string2 : abg2.dl().getAliases()) {
                if (!string2.toLowerCase().replaceAll(" ", "").contains(string.toLowerCase().replaceAll(" ", ""))) continue;
                arrayList.add(abg2);
                continue block0;
            }
        }
        return arrayList;
    }

    public void aH(String string) {
        this.aAx.bX(string);
        this.aAm = this.aG(this.aAx.getText());
    }

    public boolean pl() {
        for (abg abg2 : this.aAm) {
            for (abo abo2 : abg2.pQ()) {
                if (!(abo2 instanceof aby) || !((aby)abo2).azZ.azF) continue;
                return true;
            }
        }
        return false;
    }

    @Generated
    public agp qH() {
        return this.aAx;
    }

    @Generated
    public rip.vantage.commons.util.time.a me() {
        return this.aAy;
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
    public double pz() {
        return this.ayE;
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
    public boolean qI() {
        return this.aAz;
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
    public void J(double d2) {
        this.ayE = d2;
    }

    @Generated
    public void H(double d2) {
        this.aAn = d2;
    }

    @Generated
    public void I(double d2) {
        this.aAo = d2;
    }

    @Generated
    public void A(boolean bl2) {
        this.aAz = bl2;
    }
}

