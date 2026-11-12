/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abz;
import hackclient.rise.agm;
import hackclient.rise.ago;
import hackclient.rise.agp;
import hackclient.rise.ahg;
import hackclient.rise.ahj;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.gb;
import hackclient.rise.gd;
import rip.vantage.commons.util.time.a;
import rise.ui.clickgui.value.ValueComponent;
import rise.util.math.Vector2d;
import rise.value.NumberValue;
import rise.value.Value;

public class abw
extends ValueComponent {
    private static final double azQ = 100.0;
    private final double azR = 5.0;
    private final a azS = new a();
    public boolean azT;
    private double azU;
    private double azV;
    private double azW;
    private boolean azB;
    private float azC;
    public final agp azX = new agp(new Vector2d(0.0, 0.0), gb.ks.a(16, gd.kG), abz.aAd.ql(), ago.aJS, ((Number)((NumberValue)this.azn).wH()).toString().replace(".0", ""), 45.0f, "1234567890.");

    public abw(Value<?> value) {
        super(value);
        this.qk();
    }

    public void qk() {
        NumberValue numberValue = (NumberValue)this.azn;
        this.azU = Math.min(Math.max(0.0, (-numberValue.wM().doubleValue() + ((Number)numberValue.wD()).doubleValue()) / (-numberValue.wM().doubleValue() + numberValue.wN().doubleValue())), 1.0);
    }

    @Override
    public void a(Vector2d vector2d, int n2, int n3, float f2) {
        this.aqy = vector2d;
        NumberValue numberValue = (NumberValue)this.azn;
        String string = String.valueOf(((Number)numberValue.wD()).doubleValue());
        String string2 = ahg.cf(this.azn.getName());
        float f3 = gb.ks.a(16, gd.kG).bQ(string2) + 7;
        if (string.endsWith(".0")) {
            string = string.replace(".0", "");
        }
        this.azB = agm.c(this.aqy.x + (double)f3 - 5.0, this.aqy.y - 3.5, 110.0, this.jy, n2, n3);
        this.azC = this.azB ? Math.min(1.0f, this.azC + (float)this.azS.aKM() / 200.0f) : Math.max(0.0f, this.azC - (float)this.azS.aKM() / 200.0f);
        gb.ks.a(16, gd.kG).a(string2, this.aqy.x, this.aqy.y, abz.aAd.Z(this.azo));
        this.azX.h(new Vector2d(this.aqy.x + (double)f3 + 105.0, this.aqy.y));
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
            numberValue.n(numberValue.wM().doubleValue() + (numberValue.wN().doubleValue() - numberValue.wM().doubleValue()) * this.azU);
            numberValue.n(ahj.m(((Number)numberValue.wD()).doubleValue(), numberValue.wO().floatValue()));
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
            NumberValue numberValue = (NumberValue)this.azn;
            if (this.azX.getText().isEmpty()) {
                numberValue.n((Number)numberValue.wH());
            } else {
                double d2 = Double.parseDouble(this.azX.getText());
                numberValue.n(d2);
            }
            this.azX.I(false);
            this.qk();
            return;
        }
        this.azX.b(c2, n2);
    }
}

