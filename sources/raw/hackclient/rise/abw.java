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
import hackclient.rise.akq;
import hackclient.rise.gb;
import hackclient.rise.gd;
import rip.vantage.commons.util.time.a;

public class abw
extends abo {
    private static final double azQ = 100.0;
    private final double azR = 5.0;
    private final a azS = new a();
    public boolean azT;
    private double azU;
    private double azV;
    private double azW;
    private boolean azB;
    private float azC;
    public final agp azX = new agp(new aka(0.0, 0.0), gb.ks.a(16, gd.kG), abz.aAd.ql(), ago.aJS, ((Number)((akq)this.azn).wH()).toString().replace(".0", ""), 45.0f, "1234567890.");

    public abw(akh<?> akh2) {
        super(akh2);
        this.qk();
    }

    public void qk() {
        akq akq2 = (akq)this.azn;
        this.azU = Math.min(Math.max(0.0, (-akq2.wM().doubleValue() + ((Number)akq2.wD()).doubleValue()) / (-akq2.wM().doubleValue() + akq2.wN().doubleValue())), 1.0);
    }

    @Override
    public void a(aka aka2, int n2, int n3, float f2) {
        this.aqy = aka2;
        akq akq2 = (akq)this.azn;
        String string = String.valueOf(((Number)akq2.wD()).doubleValue());
        String string2 = ahg.cf(this.azn.getName());
        float f3 = gb.ks.a(16, gd.kG).bQ(string2) + 7;
        if (string.endsWith(".0")) {
            string = string.replace(".0", "");
        }
        this.azB = agm.c(this.aqy.x + (double)f3 - 5.0, this.aqy.y - 3.5, 110.0, this.jy, n2, n3);
        this.azC = this.azB ? Math.min(1.0f, this.azC + (float)this.azS.aKM() / 200.0f) : Math.max(0.0f, this.azC - (float)this.azS.aKM() / 200.0f);
        gb.ks.a(16, gd.kG).a(string2, this.aqy.x, this.aqy.y, abz.aAd.Z(this.azo));
        this.azX.h(new aka(this.aqy.x + (double)f3 + 105.0, this.aqy.y));
        if (!this.azX.ud()) {
            this.azX.bX(string);
        }
        this.azX.z(20.0f);
        this.azX.b(ais.d(this.azX.nM(), this.azo));
        this.azX.pZ();
        ait.c(this.aqy.x + (double)f3, this.aqy.y + 1.5, 100.0, 2.0, 1.0, abz.aAa.Y(this.azo));
        this.azV = this.aqy.x + (double)f3;
        if (this.v().ayD < 0.8) {
            this.azT = false;
        }
        if (this.azT) {
            this.azU = (double)n2 - this.azV;
            this.azU /= 100.0;
            this.azU = Math.max(Math.min(this.azU, 1.0), 0.0);
            akq2.n(akq2.wM().doubleValue() + (akq2.wN().doubleValue() - akq2.wM().doubleValue()) * this.azU);
            akq2.n(ahj.m(((Number)akq2.wD()).doubleValue(), akq2.wO().floatValue()));
        }
        int n4 = 30;
        int n5 = 0;
        while ((long)n5 <= this.azS.aKM()) {
            this.azW = (this.azW * 29.0 + this.azU) / 30.0;
            ++n5;
        }
        double d2 = this.azV + this.azW * 100.0;
        ait.c(d2 - 2.5, this.aqy.y, 5.0, 5.0, 2.5, ais.d(this.rP().rQ(), this.azo));
        this.azS.aX();
    }

    @Override
    public boolean e(int n2, int n3, int n4) {
        boolean bl2;
        if (this.aqy == null) {
            return false;
        }
        boolean bl3 = bl2 = n4 == 0;
        if (bl2 && this.azB) {
            this.azT = true;
            return true;
        }
        this.azX.d(n2, n3, n4);
        return false;
    }

    @Override
    public void pP() {
        this.azT = false;
    }

    @Override
    public void ci() {
        if (this.aqy == null) {
            return;
        }
        double d2 = this.azV + this.azW * 100.0;
        ait.c(d2 - 2.5, this.aqy.y, 5.0, 5.0, 2.5, ais.d(this.rP().rQ(), this.azo));
    }

    @Override
    public void b(char c2, int n2) {
        if (n2 == 28) {
            akq akq2 = (akq)this.azn;
            if (this.azX.getText().isEmpty()) {
                akq2.n((Number)akq2.wH());
            } else {
                double d2 = Double.parseDouble(this.azX.getText());
                akq2.n(d2);
            }
            this.azX.I(false);
            this.qk();
            return;
        }
        this.azX.b(c2, n2);
    }
}

