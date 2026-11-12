/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.rd;

final class rc {
    rd Ti = new rd(0.0, 0.0, 0.0);
    rd Tj = new rd(0.0, 0.0, 0.0);
    rd Tk = new rd(0.0, 0.0, 0.0);
    rd Tl = new rd(0.0, -10.0, 0.0);
    double Tm = 2.0;
    double Tn = 1.0;

    private rc() {
    }

    rd hO() {
        double d2 = 1.0 / this.Tn;
        this.Tj.p(d2);
        this.Tj.a(this.Tl).p(this.Tm);
        this.Ti.p(d2);
        this.Tj.p(0.03333333333333333);
        this.Ti.a(this.Tj);
        this.Tk.a(this.Ti);
        this.Tj.d(0.0, 0.0, 0.0);
        this.Ti.d(0.0, 0.0, 0.0);
        return this.Tk;
    }
}

