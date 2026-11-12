/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abo;
import hackclient.rise.abz;
import hackclient.rise.agm;
import hackclient.rise.ago;
import hackclient.rise.agp;
import hackclient.rise.ahg;
import hackclient.rise.ahj;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akh;
import hackclient.rise.akj;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import rip.vantage.commons.util.time.a;

public class abq
extends abo {
    private final double azq = 100.0;
    private final a azr = new a();
    private final double azs = 5.0;
    public boolean azt;
    public boolean azu;
    private double azv;
    private double azw;
    private double azx;
    private double azy;
    private double azz;
    private double azA;
    private boolean azB;
    private float azC;
    public final agp azD = new agp(new aka(0.0, 0.0), gb.ks.a(16, gd.kG), abz.aAd.ql(), ago.aJS, ((Number)((akj)this.azn).wH()).toString().replace(".0", "") + " " + ((akj)this.azn).wQ().toString().replace(".0", ""), 100.0f, "1234567890. ");

    public abq(akh<?> akh2) {
        super(akh2);
        this.qk();
    }

    public void qk() {
        akj akj2 = (akj)this.azn;
        double d2 = (-akj2.wM().doubleValue() + ((Number)akj2.wD()).doubleValue()) / (-akj2.wM().doubleValue() + akj2.wN().doubleValue());
        double d3 = (-akj2.wM().doubleValue() + akj2.wP().doubleValue()) / (-akj2.wM().doubleValue() + akj2.wN().doubleValue());
        this.azv = Math.min(Math.max(d2, 0.0), 1.0);
        this.azw = Math.min(Math.max(d3, 0.0), 1.0);
    }

    @Override
    public void a(aka aka2, int n2, int n3, float f2) {
        this.aqy = aka2;
        akj akj2 = (akj)this.azn;
        String string = String.valueOf(((Number)akj2.wD()).doubleValue());
        String string2 = String.valueOf(akj2.wP().doubleValue());
        if (string.endsWith(".0")) {
            string = string.replace(".0", "");
        }
        if (string2.endsWith(".0")) {
            string2 = string2.replace(".0", "");
        }
        String string3 = string + " " + string2;
        String string4 = ahg.cf(this.azn.getName());
        float f3 = gb.ks.a(16, gd.kG).bQ(string4) + 7;
        this.azB = agm.c(this.aqy.x + (double)f3 - 5.0, this.aqy.y - 3.5, 110.0, this.jy, n2, n3);
        this.azC = this.azB ? Math.min(1.0f, this.azC + (float)this.azr.aKM() / 200.0f) : Math.max(0.0f, this.azC - (float)this.azr.aKM() / 200.0f);
        gb.ks.a(16, gd.kG).a(string4, this.aqy.x, this.aqy.y, abz.aAd.Z(this.azo));
        this.azD.h(new aka(this.aqy.x + (double)f3 + 105.0, this.aqy.y));
        if (!this.azD.ud()) {
            this.azD.bX(string3);
        }
        this.azD.z(20.0f);
        this.azD.b(ais.d(this.azD.nM(), this.azo));
        this.azD.pZ();
        ait.c(this.aqy.x + (double)f3, this.aqy.y + 1.5, 100.0, 2.0, 1.0, abz.aAa.Y(Math.min(this.azo, abz.aAa.ql().getAlpha())));
        this.azx = this.aqy.x + (double)f3;
        this.azy = this.aqy.x + (double)f3;
        if (this.v().ayD < 0.8) {
            this.azu = false;
            this.azt = false;
        }
        if (this.azt) {
            this.azv = (double)n2 - this.azx;
            this.azv /= 100.0;
            this.azv = Math.max(Math.min(this.azv, 1.0), 0.0);
            akj2.n(akj2.wM().doubleValue() + (akj2.wN().doubleValue() - akj2.wM().doubleValue()) * this.azv);
            akj2.n(ahj.m(((Number)akj2.wD()).doubleValue(), akj2.wO().doubleValue()));
            if (this.azv > this.azw) {
                this.azw = this.azv;
                akj2.a(akj2.wM().doubleValue() + (akj2.wN().doubleValue() - akj2.wM().doubleValue()) * this.azw);
                akj2.a(ahj.m(akj2.wP().doubleValue(), akj2.wO().doubleValue()));
            }
        } else if (this.azu) {
            this.azw = (double)n2 - this.azy;
            this.azw /= 100.0;
            this.azw = Math.max(Math.min(this.azw, 1.0), 0.0);
            akj2.a(akj2.wM().doubleValue() + (akj2.wN().doubleValue() - akj2.wM().doubleValue()) * this.azw);
            akj2.a(ahj.m(akj2.wP().doubleValue(), akj2.wO().doubleValue()));
            if (this.azw < this.azv) {
                this.azv = this.azw;
                akj2.n(akj2.wM().doubleValue() + (akj2.wN().doubleValue() - akj2.wM().doubleValue()) * this.azv);
                akj2.n(ahj.m(((Number)akj2.wD()).doubleValue(), akj2.wO().doubleValue()));
            }
        }
        int n4 = 30;
        int n5 = 0;
        while ((long)n5 <= this.azr.aKM()) {
            this.azz = (this.azz * 29.0 + this.azv) / 30.0;
            this.azA = (this.azA * 29.0 + this.azw) / 30.0;
            ++n5;
        }
        double d2 = this.azx + this.azz * 100.0;
        double d3 = this.azy + this.azA * 100.0;
        double d4 = d3 - d2;
        if (this.azv != this.azw) {
            ait.c(d2, this.aqy.y + 1.5, d4, 2.0, 1.0, ais.d(this.rP().rQ(), Math.min(70, this.azo)));
        }
        ait.c(d2 - 2.5, this.aqy.y, 5.0, 5.0, 2.5, ais.d(this.rP().rQ(), this.azo));
        if (this.azv != this.azw) {
            ait.c(d3 - 2.5, this.aqy.y, 5.0, 5.0, 2.5, ais.d(this.rP().rQ(), this.azo));
        }
        this.azr.aX();
    }

    @Override
    public boolean e(int n2, int n3, int n4) {
        boolean bl2;
        if (this.aqy == null) {
            return false;
        }
        boolean bl3 = bl2 = n4 == 0;
        if (bl2 && this.azB) {
            double d2;
            double d3 = Math.abs((double)n2 - (this.azx + this.azz * 100.0));
            if (d3 < (d2 = Math.abs((double)n2 - (this.azy + this.azA * 100.0)))) {
                this.azt = true;
            } else {
                this.azu = true;
            }
            return true;
        }
        this.azD.d(n2, n3, n4);
        return false;
    }

    @Override
    public void pP() {
        this.azu = false;
        this.azt = false;
    }

    @Override
    public void ci() {
        if (this.aqy == null) {
            return;
        }
        double d2 = this.azx + this.azz * 100.0;
        double d3 = this.azy + this.azA * 100.0;
        Color color = ais.d(this.rP().rQ(), this.azo);
        ait.c(d2 - 2.5, this.aqy.y, 5.0, 5.0, 2.5, color);
        ait.c(d3 - 2.5, this.aqy.y, 5.0, 5.0, 2.5, color);
    }

    @Override
    public void b(char c2, int n2) {
        if (n2 == 28) {
            akj akj2 = (akj)this.azn;
            String[] stringArray = this.azD.getText().split(" ");
            if (this.azD.isEmpty() || stringArray.length != 2 || stringArray[0].replace(" ", "").isEmpty() || stringArray[1].replace(" ", "").isEmpty()) {
                akj2.n((Number)akj2.wH());
                akj2.a(akj2.wQ());
            } else {
                akj2.n(Double.parseDouble(stringArray[0]));
                akj2.a(Double.parseDouble(stringArray[1]));
            }
            this.azD.I(false);
            this.qk();
            return;
        }
        this.azD.b(c2, n2);
    }
}

